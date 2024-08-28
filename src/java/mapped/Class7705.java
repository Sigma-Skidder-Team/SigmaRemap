package mapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Class7705 implements EntityResolver {
   private static String[] field33088;
   public final Class9466 field33089;

   public Class7705(Class9466 var1) {
      this.field33089 = var1;
   }

   @Override
   public InputSource resolveEntity(String var1, String var2) throws SAXException, IOException {
      return new InputSource(new ByteArrayInputStream(new byte[0]));
   }
}
