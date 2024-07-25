package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class class_4875 {
   private static String[] field_24264;
   private static final Long2ObjectMap<String> field_24263 = new Long2ObjectOpenHashMap();

   public static String method_22385(long var0) {
      return (String)field_24263.get(var0);
   }

   public static void method_22387(long var0) {
      field_24263.remove(var0);
   }

   public static void method_22386(long var0, String var2) {
      field_24263.put(var0, var2);
   }
}
