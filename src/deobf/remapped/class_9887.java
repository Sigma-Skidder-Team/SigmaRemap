package remapped;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.xml.SlickXMLException;
import org.w3c.dom.Document;

public class class_9887 {
   private static DocumentBuilderFactory field_50139;

   public class_6500 method_45546(String var1) throws SlickException {
      return this.method_45547(var1, class_8975.method_41153(var1));
   }

   public class_6500 method_45547(String var1, InputStream var2) throws SlickXMLException {
      try {
         if (field_50139 == null) {
            field_50139 = DocumentBuilderFactory.newInstance();
         }

         DocumentBuilder var5 = field_50139.newDocumentBuilder();
         Document var6 = var5.parse(var2);
         return new class_6500(var6.getDocumentElement());
      } catch (Exception var7) {
         throw new class_7178("Failed to parse document: " + var1, var7);
      }
   }
}
