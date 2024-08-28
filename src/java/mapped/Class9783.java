package mapped;

import com.sapher.youtubedl.YoutubeDLException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

public class Class9783 {
   public static String field45748 = "youtube-dl";

   public static String[] method38559(String var0) {
      ArrayList<String> var3 = new ArrayList();
      var3.add(field45748);

      for (String var7 : var0.split(" ")) {
         var3.add(var7);
      }

      return var3.toArray(new String[0]);
   }

   public static Class8602 method38560(Class8305 var0) throws YoutubeDLException, Class2448 {
      return method38561(var0, null);
   }

   public static Class8602 method38561(Class8305 var0, Class8954 var1) throws YoutubeDLException, Class2448 {
      String[] var4 = method38559(var0.method29060());
      String var5 = var0.method29052();
      Map var6 = var0.method29056();
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
         throw new Class2448(var23);
      }

      InputStream var13 = var12.getInputStream();
      InputStream var14 = var12.getErrorStream();
      Class369 var15 = new Class369(var7, var13, var1);
      Class377 var16 = new Class377(var8, var14);

      int var17;
      try {
         var15.join();
         var16.join();
         var17 = var12.waitFor();
      } catch (InterruptedException var22) {
         throw new Class2448(var22);
      }

      String var18 = var7.toString();
      String var19 = var8.toString();
      if (var17 > 0) {
         throw new Class2448(var19);
      } else {
         int var20 = (int)((System.nanoTime() - var9) / 1000000L);
         Class8602 var21 = new Class8602(var4.toString(), var6, var5, var17, var20, var18, var19);
         var12.destroy();
         return var21;
      }
   }

   public static String method38562() throws YoutubeDLException, Class2448 {
      Class8305 var2 = new Class8305();
      var2.method29057("version");
      return method38560(var2).method30782();
   }

   public static String method38563() {
      return field45748;
   }

   public static void method38564(String var0) {
      field45748 = var0;
   }
}
