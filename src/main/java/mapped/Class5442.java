package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class Class5442 {
   private static String[] field24192;
   private static final Int2ObjectMap<Class9284<Integer, Boolean>> field24193 = new Int2ObjectOpenHashMap(37, 1.0F);

   public static Class9284<Integer, Boolean> method17106(int var0) {
      return (Class9284<Integer, Boolean>)field24193.get(var0);
   }

   private static void method17107(int var0, int var1, boolean var2) {
      field24193.put(var0, new Class9284<Integer, Boolean>(var1, var2));
   }

   static {
      method17107(0, 3694022, false);
      method17107(1, 3694022, false);
      method17107(2, 3694022, false);
      method17107(3, 3694022, false);
      method17107(4, 3694022, false);
      method17107(5, 2039713, false);
      method17107(6, 2039713, false);
      method17107(7, 8356754, false);
      method17107(8, 8356754, false);
      method17107(9, 2293580, false);
      method17107(10, 2293580, false);
      method17107(11, 2293580, false);
      method17107(12, 14981690, false);
      method17107(13, 14981690, false);
      method17107(14, 8171462, false);
      method17107(15, 8171462, false);
      method17107(16, 8171462, false);
      method17107(17, 5926017, false);
      method17107(18, 5926017, false);
      method17107(19, 3035801, false);
      method17107(20, 3035801, false);
      method17107(21, 16262179, true);
      method17107(22, 16262179, true);
      method17107(23, 4393481, true);
      method17107(24, 4393481, true);
      method17107(25, 5149489, false);
      method17107(26, 5149489, false);
      method17107(27, 5149489, false);
      method17107(28, 13458603, false);
      method17107(29, 13458603, false);
      method17107(30, 13458603, false);
      method17107(31, 9643043, false);
      method17107(32, 9643043, false);
      method17107(33, 9643043, false);
      method17107(34, 4738376, false);
      method17107(35, 4738376, false);
      method17107(36, 3381504, false);
   }
}
