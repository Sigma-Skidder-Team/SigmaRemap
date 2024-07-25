package remapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class class_8975 {
   private static ArrayList field_45984 = new ArrayList();

   public static void method_41150(class_5550 var0) {
      field_45984.add(var0);
   }

   public static void method_41152(class_5550 var0) {
      field_45984.remove(var0);
   }

   public static void method_41155() {
      field_45984.clear();
   }

   public static InputStream method_41153(String var0) {
      InputStream var3 = null;

      for (int var4 = 0; var4 < field_45984.size(); var4++) {
         class_5550 var5 = (class_5550)field_45984.get(var4);
         var3 = var5.method_25235(var0);
         if (var3 != null) {
            break;
         }
      }

      if (var3 != null) {
         return new BufferedInputStream(var3);
      } else {
         throw new RuntimeException("Resource not found: " + var0);
      }
   }

   public static boolean method_41154(String var0) {
      Object var3 = null;

      for (int var4 = 0; var4 < field_45984.size(); var4++) {
         class_5550 var5 = (class_5550)field_45984.get(var4);
         var3 = var5.method_25234(var0);
         if (var3 != null) {
            return true;
         }
      }

      return false;
   }

   public static URL method_41151(String var0) {
      URL var3 = null;

      for (int var4 = 0; var4 < field_45984.size(); var4++) {
         class_5550 var5 = (class_5550)field_45984.get(var4);
         var3 = var5.method_25234(var0);
         if (var3 != null) {
            break;
         }
      }

      if (var3 != null) {
         return var3;
      } else {
         throw new RuntimeException("Resource not found: " + var0);
      }
   }

   static {
      field_45984.add(new class_3008());
      field_45984.add(new class_9596(new File(".")));
   }
}
