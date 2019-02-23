package by.htp.jaxbex;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallingExample {

	// используйте правильные библиотеки!!!
	public static void main(String[] args) throws JAXBException {
		        File file = new File("D:\\Workspaces\\JD2\\jaxb-example\\src\\main\\resources\\notes.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance("by.htp.jaxbex");
				 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Notes notes = (Notes) jaxbUnmarshaller.unmarshal(file);
				
				for(Note n : notes.getNote()) {
					System.out.println(n.getBody());
				}


	}

}
