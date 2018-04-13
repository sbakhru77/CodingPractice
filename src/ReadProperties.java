
import java.util.*;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadProperties {
	
	public String DataFile = "C:\\Users\\Sunila\\workspace\\BSSWBQAWork\\src\\work.properties";
	public String XMLDataFile="C:\\Users\\Sunila\\workspace\\BSSWBQAWork\\src\\work.XML";
	public String sComp;

	public String testCaseDescription, included, ignoreReason, UserName, password;
	

    
	public static void main (String args[])
	{
		ReadProperties rp= new ReadProperties();
		try {
			rp.readInfo();
			rp.readXML("SGN-0002");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rp.testCaseDescription);
			
	}
	
	public void readInfo() throws Exception {
	    Properties browserProperties = new Properties();

	    FileInputStream props = new FileInputStream(DataFile);

	    try {
			browserProperties.load(props);
			//System.out.println(browserProperties.toString());
	    }
	    finally {
		    props.close();
	    }
	
	    sComp = browserProperties.getProperty("company");
	    System.out.println(sComp);
	    System.out.println(browserProperties.getProperty("abc"));
	}
	

	public void readXML(String testID) throws Exception{
        String testCaseNumber = testID;
        File file = new File(XMLDataFile);
    
        //Three primary classes
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        
        //clean unwanted data using normalize.
        doc.getDocumentElement().normalize();

        NodeList nodeLst = doc.getElementsByTagName("Test");
          for (int s = 0; s < nodeLst.getLength(); s++) {
            Node fstNode = nodeLst.item(s);
            //Element node means a node that can have attributes
            //Document node does not have attributes
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) { 
                Element testElmnt = (Element) fstNode; //typecasting to Element class
                String id = testElmnt.getAttribute("id");
                if(id.equals(testCaseNumber))  {
                    testCaseDescription = getNodeElement(testElmnt, "Description");
                    included = getNodeElement(testElmnt, "included");
                    ignoreReason = getNodeElement(testElmnt, "ignoreReason");
                    if(included.equals("No")) 
                    	UserName = getNodeElement(testElmnt, "userName");
                    	password = getNodeElement(testElmnt, "password");
                   
                }
            }
          }
    	}
	
	   private static String getNodeElement(Element elementXML ,String ElementTag){
	        NodeList testDescriptionList = elementXML.getElementsByTagName(ElementTag);
	        Element testDescriptionElement = (Element)testDescriptionList.item(0);

	        NodeList textDescrList = testDescriptionElement.getChildNodes();
	        String sValue = ((Node)textDescrList.item(0)).getNodeValue();
	      //  System.out.println(ElementTag + " : " + sValue);                       
	        return sValue;
	    }
	}
