package org.newdawn.slick.util;

import java.io.InputStream;
import java.net.URL;

// TODO: where tf was this from?
public class ClasspathLocation implements ResourceLocation {
   private static String[] field33859;

   @Override
   public URL getResource(String var1) {
      String fixed = var1.replace('\\', '/');
      return ResourceLoader.class.getClassLoader().getResource(fixed);
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      String fixed = var1.replace('\\', '/');
      return ResourceLoader.class.getClassLoader().getResourceAsStream(fixed);
   }
}
