package mapped;

import net.minecraft.entity.EntityType;

import java.util.List;

public final class Class8613 {
   public static final Class7656<EntityType<?>> field38733 = Class8384.<EntityType<?>>method29377(new ResourceLocation("entity_type"), Class8933::method32660);
   public static final Class7610<EntityType<?>> field38734 = method30860("skeletons");
   public static final Class7610<EntityType<?>> field38735 = method30860("raiders");
   public static final Class7610<EntityType<?>> field38736 = method30860("beehive_inhabitors");
   public static final Class7610<EntityType<?>> field38737 = method30860("arrows");
   public static final Class7610<EntityType<?>> field38738 = method30860("impact_projectiles");

   private static Class7610<EntityType<?>> method30860(String var0) {
      return field38733.method25167(var0);
   }

   public static Class7984<EntityType<?>> method30861() {
      return field38733.method25170();
   }

   public static List<? extends Class7610<EntityType<?>>> method30862() {
      return field38733.method25171();
   }
}
