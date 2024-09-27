package mapped;

import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Class9711 {
   public static InputStream method38047(InputStream var0, String var1) throws IOException {
      String var4 = Config.method26926(var0, "ASCII");
      String var5 = method38049(var4);
      if (!var5.isEmpty()) {
         var4 = var5 + var4;
         if (Shaders.field40931) {
            String var6 = var1.replace(':', '/') + ".pre";
            Shaders.method33016(var6, var4);
         }

         var4 = method38048(var4);
      }

      if (Shaders.field40931) {
         String var8 = var1.replace(':', '/');
         Shaders.method33016(var8, var4);
      }

      byte[] var9 = var4.getBytes("ASCII");
      return new ByteArrayInputStream(var9);
   }

   public static String method38048(String var0) throws IOException {
      StringReader var3 = new StringReader(var0);
      BufferedReader var4 = new BufferedReader(var3);
      Class8152 var5 = new Class8152();
      StringBuilder var6 = new StringBuilder();

      while (true) {
         String var7 = var4.readLine();
         if (var7 == null) {
            return var6.toString();
         }

         if (var5.method28282(var7) && !Class8152.method28283(var7)) {
            var6.append(var7);
            var6.append("\n");
         }
      }
   }

   private static String method38049(String var0) throws IOException {
      StringBuilder var3 = new StringBuilder();
      Object var4 = null;
      ArrayList var5 = null;
      StringReader var6 = new StringReader(var0);
      BufferedReader var7 = new BufferedReader(var6);

      while (true) {
         String var8 = var7.readLine();
         if (var8 == null) {
            return var3.toString();
         }

         if (Class8152.method28283(var8)) {
            if (var3.length() == 0) {
               var3.append(Class4915.method15204());
            }

            if (var5 == null) {
               var5 = new ArrayList<Class8489>(Arrays.asList(Class4915.method15203()));
            }

            Iterator var9 = var5.iterator();

            while (var9.hasNext()) {
               Class8489 var10 = (Class8489)var9.next();
               if (var8.contains(var10.method30066())) {
                  var3.append(var10.method30068());
                  var3.append("\n");
                  var9.remove();
               }
            }
         }
      }
   }

   private static List<Class6679> method38050() {
      ArrayList var2 = new ArrayList();
      Class6679[] var3 = Shaders.method32972();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Class6679 var5 = var3[var4];
         String var6 = var5.method20360();
         if (var6 != null && var6.startsWith("#")) {
            var2.add(var5);
         }
      }

      return var2;
   }
}
