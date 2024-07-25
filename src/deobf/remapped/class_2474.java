package remapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class class_2474 implements EntityResolver {
   private static String[] field_12350;

   public class_2474(class_8485 var1) {
      this.field_12349 = var1;
   }

   @Override
   public InputSource resolveEntity(String var1, String var2) throws SAXException, IOException {
      return new InputSource(new ByteArrayInputStream(new byte[0]));
   }
}
