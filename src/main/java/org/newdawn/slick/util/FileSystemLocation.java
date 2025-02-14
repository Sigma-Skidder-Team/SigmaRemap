package org.newdawn.slick.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileSystemLocation implements ResourceLocation {
   private File file;

   public FileSystemLocation(File var1) {
      this.file = var1;
   }

   @Override
   public URL getResource(String var1) {
      try {
         File var4 = new File(this.file, var1);
         if (!var4.exists()) {
            var4 = new File(var1);
         }

         return !var4.exists() ? null : var4.toURI().toURL();
      } catch (IOException var5) {
         return null;
      }
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      try {
         File var4 = new File(this.file, var1);
         if (!var4.exists()) {
            var4 = new File(var1);
         }

         return new FileInputStream(var4);
      } catch (IOException var5) {
         return null;
      }
   }
}
