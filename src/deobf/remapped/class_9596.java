package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class class_9596 implements class_5550 {
   private static String[] field_48901;
   private File field_48902;

   public class_9596(File var1) {
      this.field_48902 = var1;
   }

   public URL 欫塱쿨㻣郝姮(String var1) {
      try {
         File var4 = new File(this.field_48902, var1);
         if (!var4.exists()) {
            var4 = new File(var1);
         }

         return !var4.exists() ? null : var4.toURI().toURL();
      } catch (IOException var5) {
         return null;
      }
   }

   public InputStream 醧瀳㮃睬綋콵(String var1) {
      try {
         File var4 = new File(this.field_48902, var1);
         if (!var4.exists()) {
            var4 = new File(var1);
         }

         return new FileInputStream(var4);
      } catch (IOException var5) {
         return null;
      }
   }
}
