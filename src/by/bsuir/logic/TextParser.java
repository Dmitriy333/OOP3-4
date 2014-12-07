package by.bsuir.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import by.bsuir.substances.abstr.Cloth;
public class TextParser {
	public void witeToTextFile(List<Cloth> clothes, String fileName){
		 BufferedWriter writer = null;
			try
			{
			    writer = new BufferedWriter( new FileWriter(fileName));
			    for (Cloth cloth : clothes) {
			    	 writer.write(cloth.toStringView());
				}
			}
			catch ( IOException e1)
			{
			}
			finally
			{
			    try
			    {
			        if ( writer != null)
			        writer.close( );
			    }
			    catch ( IOException e1)
			    {
			    }
			}
	}
	@SuppressWarnings("unchecked")
	public List<Cloth> readFromTextFile(String fileName){
		File f = new File(fileName);
		List<Cloth> clothes = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			String className = null;
			Class<Cloth> clazz;
			Constructor<Cloth> ctor;
			Cloth cloth = null;
			Object object;
			List<String> properties = null;
			while (line != null) {
				if(line.contains("class")){
					if(properties != null){
						cloth.setInfo(properties);
						clothes.add(cloth);
					}
					className = line.replace(line.substring(0, line.indexOf(" ")), "").trim();
					properties = new ArrayList<>();
					try {
						clazz = (Class<Cloth>) Class.forName(className);
						ctor = clazz.getConstructor();
						object = ctor.newInstance();
						cloth = (Cloth)object;
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					properties.add(line.replace(line.substring(0, line.indexOf(" ")), "").trim());
				}
				line = br.readLine();
			}
			clothes.add(cloth);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return clothes;
	}
}
