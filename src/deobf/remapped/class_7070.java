package remapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class class_7070 {
   private static final Map<EntityType, Integer> field_36499 = new HashMap<EntityType, Integer>();
   private static final Map<String, Integer> field_36500 = new HashMap<String, Integer>();
   private static final Map<String, Integer> field_36501 = new HashMap<String, Integer>();

   public static int method_32561(Entity var0) {
      return var0 != null ? method_32562(var0.getType()) : -1;
   }

   public static int method_32562(EntityType var0) {
      Integer var3 = field_36499.get(var0);
      return var3 != null ? var3 : -1;
   }

   public static int method_32563(String var0) {
      Integer var3 = field_36500.get(var0);
      return var3 != null ? var3 : -1;
   }

   public static int method_32564(String var0) {
      var0 = var0.toLowerCase(Locale.ROOT);
      Integer var3 = field_36501.get(var0);
      return var3 != null ? var3 : -1;
   }

   static {
      for (EntityType var7 : class_8669.field_44400) {
         int var8 = class_8669.field_44400.method_14041(var7);
         Identifier var9 = class_8669.field_44400.method_39797(var7);
         String var10 = var9.toString();
         String var11 = var9.method_21456();
         if (field_36499.containsKey(var7)) {
            Config.method_14317("Duplicate entity type: " + var7 + ", id1: " + field_36499.get(var7) + ", id2: " + var8);
         }

         if (field_36500.containsKey(var10)) {
            Config.method_14317("Duplicate entity location: " + var10 + ", id1: " + field_36500.get(var10) + ", id2: " + var8);
         }

         if (field_36501.containsKey(var10)) {
            Config.method_14317("Duplicate entity name: " + var11 + ", id1: " + field_36501.get(var11) + ", id2: " + var8);
         }

         field_36499.put(var7, var8);
         field_36500.put(var10, var8);
         field_36501.put(var11, var8);
      }
   }
}
