package by.bsuir.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import by.bsuir.substances.abstr.Cloth;
import by.bsuir.substances.clothes.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XmlParser {
	public void saveToXml(String fileName, List<Cloth> clothes) {
		XStream xs = new XStream(new DomDriver());
		FileOutputStream fs = null;
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
			xs.toXML(clothes, fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Cloth> readFromXml(String fileName) {
		String xml = XmlIntoString(fileName);
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("sandals", Sandals.class);
		xstream.alias("sneakers", Sneakers.class);
		xstream.alias("cap", Cap.class);
		xstream.alias("hat", Hat.class);
		xstream.alias("anorak", Anorak.class);
		xstream.alias("coat", Coat.class);
		xstream.alias("sportpants", SportPants.class);
		xstream.alias("trousers", Trousers.class);
		List<Cloth> clothes = (List<Cloth>) xstream.fromXML(xml);
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
