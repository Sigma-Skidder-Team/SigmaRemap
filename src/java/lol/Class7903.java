package lol;

import java.io.InputStream;
import java.net.URL;

public class Class7903 implements Class7904 {
   private static String[] field33859;

   @Override
   public URL method26475(String var1) {
      String var4 = var1.replace('\\', '/');
      return ResourceLoader.class.getClassLoader().getResource(var4);
   }

   @Override
   public InputStream method26476(String var1) {
      String var4 = var1.replace('\\', '/');
      return ResourceLoader.class.getClassLoader().getResourceAsStream(var4);
   }
}
