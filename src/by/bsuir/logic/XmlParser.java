package by.bsuir.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamSource;

import by.bsuir.substances.abstr.Cloth;
import by.bsuir.substances.clothes.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XmlParser {
	public void saveToXml(String fileName, List<Cloth> clothes,
			boolean transformation) {
		XStream xs = new XStream(new DomDriver());
		FileOutputStream fs = null;
		StringWriter outWriter = null;
		try {
				fs = new FileOutputStream(fileName);
				xs.alias("sandals", Sandals.class);
				xs.alias("sneakers", Sneakers.class);
				xs.alias("cap", Cap.class);
				xs.alias("hat", Hat.class);
				xs.alias("anorak", Anorak.class);
				xs.alias("coat", Coat.class);
				xs.alias("sportpants", SportPants.class);
				xs.alias("trousers", Trousers.class);
				if(transformation == false){
					xs.toXML(clothes, fs);
				}else{
					outWriter = new StringWriter();
					xs.toXML(clothes, outWriter);
					
					StringBuffer sb = outWriter.getBuffer();
					String finalstring = sb.toString();
					Source xmlText = new StreamSource(new StringReader(finalstring));
					try {
						Transformation.transform(xmlText, "resources//clothes.xsl", fileName);
					} catch (TransformerException e) {
						e.printStackTrace();
					}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}finally{
			try {
				fs.close();
				outWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public List<Cloth> readFromXml(String fileName, boolean transformation) throws TransformerException, xmlException {
		List<Cloth> clothes = null;
		String xml = null;
		if (transformation) {
			File file = new File(fileName);
			try {
				xml = Transformation.retransform(file.getAbsolutePath(),
						"resources//reclothes.xsl");
			} catch (FileNotFoundException e) {
			}
		} else {
			xml = XmlIntoString(fileName);
		}

		XStream xstream = new XStream(new DomDriver());
		xstream.alias("sandals", Sandals.class);
		xstream.alias("sneakers", Sneakers.class);
		xstream.alias("cap", Cap.class);
		xstream.alias("hat", Hat.class);
		xstream.alias("anorak", Anorak.class);
		xstream.alias("coat", Coat.class);
		xstream.alias("sportpants", SportPants.class);
		xstream.alias("trousers", Trousers.class);
		try{
			clothes = (List<Cloth>) xstream.fromXML(xml);
		}
		catch(Exception e1){
			throw new xmlException();
		}
		return clothes;
	}

	private String XmlIntoString(String fileName) {
		File f = new File(fileName);
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
