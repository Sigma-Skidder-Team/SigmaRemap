package lol;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class7905 implements Class7904 {
   private static String[] field33860;
   private File field33861;

   public Class7905(File var1) {
      this.field33861 = var1;
   }

   @Override
   public URL method26475(String var1) {
      try {
         File var4 = new File(this.field33861, var1);
         if (!var4.exists()) {
            var4 = new File(var1);
         }

         return !var4.exists() ? null : var4.toURI().toURL();
      } catch (IOException var5) {
         return null;
      }
   }

   @Override
   public InputStream method26476(String var1) {
      try {
         File var4 = new File(this.field33861, var1);
         if (!var4.exists()) {
            var4 = new File(var1);
         }

         return new FileInputStream(var4);
      } catch (IOException var5) {
         return null;
      }
   }
}
