package remapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class class_7758 implements EntityResolver {
   private static String[] field_39341;

   public class_7758(class_8249 var1) {
      this.field_39340 = var1;
   }

   @Override
   public InputSource resolveEntity(String var1, String var2) throws SAXException, IOException {
      return new InputSource(new ByteArrayInputStream(new byte[0]));
   }
}
