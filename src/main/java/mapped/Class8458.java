package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.Util;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Class8458 {
   private static String[] field36267;

   public static List<Class6111> method29749(Class1980... var0) {
      for (Class1980 var6 : var0) {
         method29750(Class1980.method8263(var6));
      }

      ArrayList var8 = Lists.newArrayList();

      for (Class1980 var7 : var0) {
         var8.add(new Class6111(Class1980.method8264(var7), method29750(Class1980.method8263(var7))));
      }

      var8.sort(Comparator.comparingInt(Class6111::method18874));
      return var8;
   }

   private static int method29750(String var0) {
      short var3 = 700;
      long var4 = 0L;
      Socket var6 = null;

      for (int var7 = 0; var7 < 5; var7++) {
         try {
            InetSocketAddress var8 = new InetSocketAddress(var0, 80);
            var6 = new Socket();
            long var9 = method29752();
            var6.connect(var8, 700);
            var4 += method29752() - var9;
         } catch (Exception var14) {
            var4 += 700L;
         } finally {
            method29751(var6);
         }
      }

      return (int)((double)var4 / 5.0);
   }

   private static void method29751(Socket var0) {
      try {
         if (var0 != null) {
            var0.close();
         }
      } catch (Throwable var4) {
      }
   }

   private static long method29752() {
      return Util.milliTime();
   }

   public static List<Class6111> method29753() {
      return method29749(Class1980.values());
   }
}
