package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class Class8510 {
   private static String[] field37208;
   private static final Long2ObjectMap<String> field37209 = new Long2ObjectOpenHashMap();

   public static String method30149(long var0) {
      return (String)field37209.get(var0);
   }

   public static void method30150(long var0) {
      field37209.remove(var0);
   }

   public static void method30151(long var0, String var2) {
      field37209.put(var0, var2);
   }
}
