package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class class_286 {
   private static String[] field_1012;
   private static final Int2ObjectMap<class_7794<Integer, Boolean>> field_1011 = new Int2ObjectOpenHashMap(37, 1.0F);

   public static class_7794<Integer, Boolean> method_1269(int var0) {
      return (class_7794<Integer, Boolean>)field_1011.get(var0);
   }

   private static void method_1268(int var0, int var1, boolean var2) {
      field_1011.put(var0, new class_7794<Integer, Boolean>(var1, var2));
   }

   static {
      method_1268(0, 3694022, false);
      method_1268(1, 3694022, false);
      method_1268(2, 3694022, false);
      method_1268(3, 3694022, false);
      method_1268(4, 3694022, false);
      method_1268(5, 2039713, false);
      method_1268(6, 2039713, false);
      method_1268(7, 8356754, false);
      method_1268(8, 8356754, false);
      method_1268(9, 2293580, false);
      method_1268(10, 2293580, false);
      method_1268(11, 2293580, false);
      method_1268(12, 14981690, false);
      method_1268(13, 14981690, false);
      method_1268(14, 8171462, false);
      method_1268(15, 8171462, false);
      method_1268(16, 8171462, false);
      method_1268(17, 5926017, false);
      method_1268(18, 5926017, false);
      method_1268(19, 3035801, false);
      method_1268(20, 3035801, false);
      method_1268(21, 16262179, true);
      method_1268(22, 16262179, true);
      method_1268(23, 4393481, true);
      method_1268(24, 4393481, true);
      method_1268(25, 5149489, false);
      method_1268(26, 5149489, false);
      method_1268(27, 5149489, false);
      method_1268(28, 13458603, false);
      method_1268(29, 13458603, false);
      method_1268(30, 13458603, false);
      method_1268(31, 9643043, false);
      method_1268(32, 9643043, false);
      method_1268(33, 9643043, false);
      method_1268(34, 4738376, false);
      method_1268(35, 4738376, false);
      method_1268(36, 3381504, false);
   }
}
