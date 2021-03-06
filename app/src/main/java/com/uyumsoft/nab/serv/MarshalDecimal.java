package com.uyumsoft.nab.serv;

import java.io.IOException;
import java.math.BigDecimal;

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class MarshalDecimal implements Marshal {

	@Override
	public Object readInstance(XmlPullParser parser, String namespace, String name, PropertyInfo expected) throws IOException, XmlPullParserException {
		return BigDecimal.valueOf(Double.parseDouble(parser.nextText()));
	}


	@Override
	public void register(SoapSerializationEnvelope cm) {
		cm.addMapping(cm.xsd, "decimal", BigDecimal.class, this);
	}


	@Override
	public void writeInstance(XmlSerializer writer, Object obj) throws IOException {
		writer.text(obj.toString());		
	}
	
}