package mapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Class6966 {
   private static final List<Class7514> field30176 = new ArrayList<Class7514>();

   public static Class8600 method21489(int var0, Integer[] var1) {
      if (var0 < field30176.size()) {
         Class7514 var4 = field30176.get(var0);
         return var4.method24495(new Class8600(var4.method24496()), var1);
      } else {
         ViaVersion3.method27613().getLogger().severe("Failed to transform particles with id " + var0 + " and data " + Arrays.toString((Object[])var1));
         return null;
      }
   }

   private static void method21490(int var0) {
      field30176.add(new Class7514(var0, null));
   }

   private static void method21491(int var0, Class6105 var1) {
      field30176.add(new Class7514(var0, var1));
   }

   private static Class6105 method21492() {
      return new Class6104();
   }

   private static boolean method21493() {
      return ThreadLocalRandom.current().nextBoolean();
   }

   private static Class6105 method21494() {
      return new Class6106();
   }

   private static Class6105 method21495() {
      return new Class6107();
   }

   // $VF: synthetic method
   public static boolean method21496() {
      return method21493();
   }

   static {
      method21490(34);
      method21490(19);
      method21490(18);
      method21490(21);
      method21490(4);
      method21490(43);
      method21490(22);
      method21490(42);
      method21490(42);
      method21490(6);
      method21490(14);
      method21490(37);
      method21490(30);
      method21490(12);
      method21490(26);
      method21490(17);
      method21490(0);
      method21490(44);
      method21490(10);
      method21490(9);
      method21490(1);
      method21490(24);
      method21490(32);
      method21490(33);
      method21490(35);
      method21490(15);
      method21490(23);
      method21490(31);
      method21490(-1);
      method21490(5);
      method21491(11, method21492());
      method21490(29);
      method21490(34);
      method21490(28);
      method21490(25);
      method21490(2);
      method21491(27, method21494());
      method21491(3, method21495());
      method21491(3, method21495());
      method21490(36);
      method21490(-1);
      method21490(13);
      method21490(8);
      method21490(16);
      method21490(7);
      method21490(40);
      method21491(20, method21495());
      method21490(41);
      method21490(38);
   }
}
