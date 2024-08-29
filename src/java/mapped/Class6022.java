package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

public class Class6022 implements Class6021<String> {
   private static String[] field26219;

   public String method18648(ResourceLocation var1) {
      EntityType var4 = Class7926.method26598(var1);
      return var4 != null ? var4.method33210() : null;
   }

   public static String method18649(Entity var0) {
      return var0.getType().method33210();
   }
}
