package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class class_1176 {
   private static final List<class_2081> field_6638 = new ArrayList<class_2081>();

   public static class_5167 method_5214(int var0, Integer[] var1) {
      if (var0 < field_6638.size()) {
         class_2081 var4 = field_6638.get(var0);
         return var4.method_9711(new class_5167(var4.method_9710()), var1);
      } else {
         class_3446.method_15886().method_34617().severe("Failed to transform particles with id " + var0 + " and data " + Arrays.toString((Object[])var1));
         return null;
      }
   }

   private static void method_5212(int var0) {
      field_6638.add(new class_2081(var0, null));
   }

   private static void method_5213(int var0, class_2498 var1) {
      field_6638.add(new class_2081(var0, var1));
   }

   private static class_2498 method_5207() {
      return new class_478();
   }

   private static boolean method_5208() {
      return ThreadLocalRandom.current().nextBoolean();
   }

   private static class_2498 method_5210() {
      return new class_7440();
   }

   private static class_2498 method_5211() {
      return new class_701();
   }

   static {
      method_5212(34);
      method_5212(19);
      method_5212(18);
      method_5212(21);
      method_5212(4);
      method_5212(43);
      method_5212(22);
      method_5212(42);
      method_5212(42);
      method_5212(6);
      method_5212(14);
      method_5212(37);
      method_5212(30);
      method_5212(12);
      method_5212(26);
      method_5212(17);
      method_5212(0);
      method_5212(44);
      method_5212(10);
      method_5212(9);
      method_5212(1);
      method_5212(24);
      method_5212(32);
      method_5212(33);
      method_5212(35);
      method_5212(15);
      method_5212(23);
      method_5212(31);
      method_5212(-1);
      method_5212(5);
      method_5213(11, method_5207());
      method_5212(29);
      method_5212(34);
      method_5212(28);
      method_5212(25);
      method_5212(2);
      method_5213(27, method_5210());
      method_5213(3, method_5211());
      method_5213(3, method_5211());
      method_5212(36);
      method_5212(-1);
      method_5212(13);
      method_5212(8);
      method_5212(16);
      method_5212(7);
      method_5212(40);
      method_5213(20, method_5211());
      method_5212(41);
      method_5212(38);
   }
}
