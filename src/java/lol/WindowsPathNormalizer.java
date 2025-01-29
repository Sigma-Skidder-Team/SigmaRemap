package lol;

import java.io.InputStream;
import java.net.URL;

// TODO: where tf was this from?
public class WindowsPathNormalizer implements PathNormalizer {
   private static String[] field33859;

   @Override
   public URL method26475(String var1) {
      String fixed = var1.replace('\\', '/');
      return ResourceLoader.class.getClassLoader().getResource(fixed);
   }

   @Override
   public InputStream method26476(String var1) {
      String fixed = var1.replace('\\', '/');
      return ResourceLoader.class.getClassLoader().getResourceAsStream(fixed);
   }
}
