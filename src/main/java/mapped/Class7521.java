package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

public class Class7521 {
   private static String[] field32255;
   private static final Int2IntMap field32256 = new Int2IntOpenHashMap(19, 1.0F);

   public static int method24520(int var0) {
      return field32256.getOrDefault(var0, var0);
   }

   public static boolean method24521(int var0) {
      return field32256.containsKey(var0);
   }

   private static void method24522(int var0, int var1) {
      field32256.put(var0, var1);
   }

   static {
      method24522(1005, 1010);
      method24522(1003, 1005);
      method24522(1006, 1011);
      method24522(1004, 1009);
      method24522(1007, 1015);
      method24522(1008, 1016);
      method24522(1009, 1016);
      method24522(1010, 1019);
      method24522(1011, 1020);
      method24522(1012, 1021);
      method24522(1014, 1024);
      method24522(1015, 1025);
      method24522(1016, 1026);
      method24522(1017, 1027);
      method24522(1020, 1029);
      method24522(1021, 1030);
      method24522(1022, 1031);
      method24522(1013, 1023);
      method24522(1018, 1028);
   }
}
