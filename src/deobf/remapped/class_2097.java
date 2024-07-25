package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

public class class_2097 {
   private static String[] field_10520;
   private static final Int2IntMap field_10521 = new Int2IntOpenHashMap(19, 1.0F);

   public static int method_9799(int var0) {
      return field_10521.getOrDefault(var0, var0);
   }

   public static boolean method_9800(int var0) {
      return field_10521.containsKey(var0);
   }

   private static void method_9802(int var0, int var1) {
      field_10521.put(var0, var1);
   }

   static {
      method_9802(1005, 1010);
      method_9802(1003, 1005);
      method_9802(1006, 1011);
      method_9802(1004, 1009);
      method_9802(1007, 1015);
      method_9802(1008, 1016);
      method_9802(1009, 1016);
      method_9802(1010, 1019);
      method_9802(1011, 1020);
      method_9802(1012, 1021);
      method_9802(1014, 1024);
      method_9802(1015, 1025);
      method_9802(1016, 1026);
      method_9802(1017, 1027);
      method_9802(1020, 1029);
      method_9802(1021, 1030);
      method_9802(1022, 1031);
      method_9802(1013, 1023);
      method_9802(1018, 1028);
   }
}
