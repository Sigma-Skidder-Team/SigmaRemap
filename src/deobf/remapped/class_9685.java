package remapped;

import com.sapher.youtubedl.YoutubeDLException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

public class class_9685 {
   public static String field_49295 = "youtube-dl";

   public static String[] method_44778(String var0) {
      ArrayList var3 = new ArrayList();
      var3.add(field_49295);

      for (String var7 : var0.split(" ")) {
         var3.add(var7);
      }

      return var3.<String>toArray(new String[0]);
   }

   public static class_5171 method_44781(class_4199 var0) throws YoutubeDLException {
      return method_44782(var0, null);
   }

   public static class_5171 method_44782(class_4199 var0, class_6504 var1) throws YoutubeDLException {
      String[] var4 = method_44778(var0.method_19541());
      String var5 = var0.method_19546();
      Map var6 = var0.method_19540();
      StringBuffer var7 = new StringBuffer();
      StringBuffer var8 = new StringBuffer();
      long var9 = System.nanoTime();
      ProcessBuilder var11 = new ProcessBuilder(var4);
      if (var5 != null) {
         var11.directory(new File(var5));
      }

      Process var12;
      try {
         var12 = var11.start();
      } catch (IOException var23) {
         throw new class_4231(var23);
      }

      InputStream var13 = var12.getInputStream();
      InputStream var14 = var12.getErrorStream();
      class_4501 var15 = new class_4501(var7, var13, var1);
      class_1406 var16 = new class_1406(var8, var14);

      int var17;
      try {
         var15.join();
         var16.join();
         var17 = var12.waitFor();
      } catch (InterruptedException var22) {
         throw new class_4231(var22);
      }

      String var18 = var7.toString();
      String var19 = var8.toString();
      if (var17 > 0) {
         throw new class_4231(var19);
      } else {
         int var20 = (int)((System.nanoTime() - var9) / 1000000L);
         class_5171 var21 = new class_5171(var4.toString(), var6, var5, var17, var20, var18, var19);
         var12.destroy();
         return var21;
      }
   }

   public static String method_44776() throws YoutubeDLException {
      class_4199 var2 = new class_4199();
      var2.method_19543("version");
      return method_44781(var2).method_23699();
   }

   public static String method_44780() {
      return field_49295;
   }

   public static void method_44777(String var0) {
      field_49295 = var0;
   }
}
