package by.bsuir.logic;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

public class Transformation {

	public static String retransform(String transfomedXML, String inputXSL)
			throws TransformerConfigurationException, TransformerException,
			FileNotFoundException {
		Source xslt = new StreamSource(new File(inputXSL));
		Transformer transformer = TransformerFactory.newInstance()
				.newTransformer(xslt);
		Source text = new StreamSource(new File(transfomedXML));
		StringWriter outWriter = new StringWriter();
		StreamResult result = new StreamResult(outWriter);
		transformer.transform(text, result);
		StringBuffer sb = outWriter.getBuffer();
		String finalstring = sb.toString();

		try {
			outWriter.close();
		} catch (IOException e) {
		}
		return finalstring;
	}

	public static void transform(Source xmlText, String inputXSL,
			String fileName) throws TransformerFactoryConfigurationError,
			FileNotFoundException, TransformerException {
		Source xslt = new StreamSource(new File(inputXSL));
		Transformer transformer = TransformerFactory.newInstance()
				.newTransformer(xslt);
		FileOutputStream outputStream = new FileOutputStream(fileName);
		Result output = new StreamResult(outputStream);
		transformer.transform(xmlText, output);
		try {
			outputStream.close();
		} catch (IOException e) {
		}
	}
}
