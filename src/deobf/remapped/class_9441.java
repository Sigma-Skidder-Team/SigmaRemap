package remapped;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class class_9441 {
   public static InputStream method_43672(InputStream var0, String var1) throws IOException {
      String var4 = Config.method_14271(var0, "ASCII");
      String var5 = method_43671(var4);
      if (!var5.isEmpty()) {
         var4 = var5 + var4;
         if (class_6588.field_33905) {
            String var6 = var1.replace(':', '/') + ".pre";
            class_6588.method_30307(var6, var4);
         }

         var4 = method_43673(var4);
      }

      if (class_6588.field_33905) {
         String var8 = var1.replace(':', '/');
         class_6588.method_30307(var8, var4);
      }

      byte[] var9 = var4.getBytes("ASCII");
      return new ByteArrayInputStream(var9);
   }

   public static String method_43673(String var0) throws IOException {
      StringReader var3 = new StringReader(var0);
      BufferedReader var4 = new BufferedReader(var3);
      class_3751 var5 = new class_3751();
      StringBuilder var6 = new StringBuilder();

      while (true) {
         String var7 = var4.readLine();
         if (var7 == null) {
            return var6.toString();
         }

         if (var5.method_17362(var7) && !class_3751.method_17363(var7)) {
            var6.append(var7);
            var6.append("\n");
         }
      }
   }

   private static String method_43671(String var0) throws IOException {
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

         if (class_3751.method_17363(var8)) {
            if (var3.length() == 0) {
               var3.append(class_244.method_1062());
            }

            if (var5 == null) {
               var5 = new ArrayList<class_4789>(Arrays.asList(class_244.method_1069()));
            }

            Iterator var9 = var5.iterator();

            while (var9.hasNext()) {
               class_4789 var10 = (class_4789)var9.next();
               if (var8.contains(var10.method_22086())) {
                  var3.append(var10.method_22084());
                  var3.append("\n");
                  var9.remove();
               }
            }
         }
      }
   }

   private static List<class_6843> method_43669() {
      ArrayList var2 = new ArrayList();
      class_6843[] var3 = class_6588.method_30313();

      for (int var4 = 0; var4 < var3.length; var4++) {
         class_6843 var5 = var3[var4];
         String var6 = var5.method_31391();
         if (var6 != null && var6.startsWith("#")) {
            var2.add(var5);
         }
      }

      return var2;
   }
}
