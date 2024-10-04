package mapped;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import lol.ResourceLoader;
import org.w3c.dom.Document;

public class Class9843 {
   private static DocumentBuilderFactory field45942;

   public Class8952 method38903(String var1) throws Class2451 {
      return this.method38904(var1, ResourceLoader.getResourceAsStream(var1));
   }

   public Class8952 method38904(String var1, InputStream var2) throws Class2452 {
      try {
         if (field45942 == null) {
            field45942 = DocumentBuilderFactory.newInstance();
         }

         DocumentBuilder var5 = field45942.newDocumentBuilder();
         Document var6 = var5.parse(var2);
         return new Class8952(var6.getDocumentElement());
      } catch (Exception var7) {
         throw new Class2452("Failed to parse document: " + var1, var7);
      }
   }
}
