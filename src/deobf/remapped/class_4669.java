package remapped;

import com.google.common.collect.Lists;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class class_4669 {
   private static String[] field_22765;

   public static List<class_7205> method_21606(class_7147... var0) {
      for (class_7147 var6 : var0) {
         method_21602(class_7147.method_32794(var6));
      }

      ArrayList var8 = Lists.newArrayList();

      for (class_7147 var7 : var0) {
         var8.add(new class_7205(class_7147.method_32795(var7), method_21602(class_7147.method_32794(var7))));
      }

      var8.sort(Comparator.comparingInt(class_7205::method_32987));
      return var8;
   }

   private static int method_21602(String var0) {
      short var3 = 700;
      long var4 = 0L;
      Socket var6 = null;

      for (int var7 = 0; var7 < 5; var7++) {
         try {
            InetSocketAddress var8 = new InetSocketAddress(var0, 80);
            var6 = new Socket();
            long var9 = method_21604();
            var6.connect(var8, 700);
            var4 += method_21604() - var9;
         } catch (Exception var14) {
            var4 += 700L;
         } finally {
            method_21607(var6);
         }
      }

      return (int)((double)var4 / 5.0);
   }

   private static void method_21607(Socket var0) {
      try {
         if (var0 != null) {
            var0.close();
         }
      } catch (Throwable var4) {
      }
   }

   private static long method_21604() {
      return Util.getMeasuringTimeMs();
   }

   public static List<class_7205> method_21603() {
      return method_21606(class_7147.values());
   }
}
