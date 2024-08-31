package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Class9115 {
   private static final Map<EntityType, Integer> field41879 = new HashMap<EntityType, Integer>();
   private static final Map<String, Integer> field41880 = new HashMap<String, Integer>();
   private static final Map<String, Integer> field41881 = new HashMap<String, Integer>();

   public static int method33998(Entity var0) {
      return var0 != null ? method33999(var0.getType()) : -1;
   }

   public static int method33999(EntityType var0) {
      Integer var3 = field41879.get(var0);
      return var3 != null ? var3 : -1;
   }

   public static int method34000(String var0) {
      Integer var3 = field41880.get(var0);
      return var3 != null ? var3 : -1;
   }

   public static int method34001(String var0) {
      var0 = var0.toLowerCase(Locale.ROOT);
      Integer var3 = field41881.get(var0);
      return var3 != null ? var3 : -1;
   }

   static {
      for (EntityType var7 : Registry.ENTITY_TYPE) {
         int var8 = Registry.ENTITY_TYPE.getId(var7);
         ResourceLocation var9 = Registry.ENTITY_TYPE.getKey(var7);
         String var10 = var9.toString();
         String var11 = var9.getPath();
         if (field41879.containsKey(var7)) {
            Class7944.method26811("Duplicate entity type: " + var7 + ", id1: " + field41879.get(var7) + ", id2: " + var8);
         }

         if (field41880.containsKey(var10)) {
            Class7944.method26811("Duplicate entity location: " + var10 + ", id1: " + field41880.get(var10) + ", id2: " + var8);
         }

         if (field41881.containsKey(var10)) {
            Class7944.method26811("Duplicate entity name: " + var11 + ", id1: " + field41881.get(var11) + ", id2: " + var8);
         }

         field41879.put(var7, var8);
         field41880.put(var10, var8);
         field41881.put(var11, var8);
      }
   }
}
