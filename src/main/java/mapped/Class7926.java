package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class Class7926 {
   private static String[] field33955;

   public static EntityType method26598(ResourceLocation var0) {
      return Registry.ENTITY_TYPE.method9193(var0) ? Registry.ENTITY_TYPE.getOrDefault(var0) : null;
   }
}
