package com.uyumsoft.nab.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.uyumsoft.nab.nab.R;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleStockDetail;
import com.uyumsoft.nab.util.screens;
import com.uyumsoft.nab.util.statics;

/**
 * Created by huseyin.celik on 12.03.2018.
 */


public class adapter_YukelemeDetay extends BaseAdapter {

    private static ArrayOfLoadingVehicleStockDetail searchArrayList;

    private LayoutInflater mInflater;
    private int selectedPos = -1;

    public adapter_YukelemeDetay(Context context, ArrayOfLoadingVehicleStockDetail results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public void setSelectedPosition(int pos) {
        selectedPos = pos;
        // inform the view of this change
        notifyDataSetChanged();
    }

    public int getSelectedPosition() {
        return selectedPos;
    }

    public int getCount() {
        if (searchArrayList == null) return 0;
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        com.uyumsoft.nab.adapters.adapter_Yukeleme.ViewHolder holder;
        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) statics.getMainActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.row_view_yukleme, null);
            //convertView = mInflater.inflate(R.layout.custom_row_view, null);
            holder = new com.uyumsoft.nab.adapters.adapter_Yukeleme.ViewHolder();
            holder.txtNo = (TextView) convertView.findViewById(R.id.textNo);
            holder.txtDate = (TextView) convertView.findViewById(R.id.textDate);
            convertView.setTag(holder);
        } else {
            holder = (com.uyumsoft.nab.adapters.adapter_Yukeleme.ViewHolder) convertView.getTag();
        }
        holder.txtNo.setText(searchArrayList.get(position).StockCode);
        holder.txtDate.setText(searchArrayList.get(position).StockName.toString());

        if (selectedPos == position) {
            holder.txtNo.setBackgroundColor(screens.GetSelectedColor());
            holder.txtDate.setBackgroundColor(screens.GetSelectedColor());
        } else {
            holder.txtNo.setBackgroundColor(screens.GetBackgroundColor());
            holder.txtDate.setBackgroundColor(screens.GetBackgroundColor());
        }

        return convertView;
    }

    static class ViewHolder {
        TextView txtNo;
        TextView txtDate;
    }

}