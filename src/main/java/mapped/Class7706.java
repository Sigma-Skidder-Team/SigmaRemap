package mapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Class7706 implements EntityResolver {
   private static String[] field33090;
   public final Class6969 field33091;

   public Class7706(Class6969 var1) {
      this.field33091 = var1;
   }

   @Override
   public InputSource resolveEntity(String var1, String var2) throws SAXException, IOException {
      return new InputSource(new ByteArrayInputStream(new byte[0]));
   }
}
