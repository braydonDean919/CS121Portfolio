import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLRead {
    public static void main(String[] args) {
        try {
            File input = new File("game.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(input);
            NodeList gameList = document.getElementsByTagName("game");
            for (int i = 0; i < gameList.getLength(); i++) {
                Node node = gameList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Genre: " + element.getElementsByTagName("genre").item(0).getTextContent());
                    System.out.println("Type: " + element.getElementsByTagName("type").item(0).getTextContent());
                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println();

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
