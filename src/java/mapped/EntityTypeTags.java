package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class EntityTypeTags {
   public static final TagRegistry<EntityType<?>> tagCollection = TagRegistryManager.<EntityType<?>>create(new ResourceLocation("entity_type"), ITagCollectionSupplier::method32660);
   public static final Class7610<EntityType<?>> field38734 = method30860("skeletons");
   public static final Class7610<EntityType<?>> field38735 = method30860("raiders");
   public static final Class7610<EntityType<?>> field38736 = method30860("beehive_inhabitors");
   public static final Class7610<EntityType<?>> field38737 = method30860("arrows");
   public static final Class7610<EntityType<?>> field38738 = method30860("impact_projectiles");

   private static Class7610<EntityType<?>> method30860(String var0) {
      return tagCollection.method25167(var0);
   }

   public static ITagCollection<EntityType<?>> method30861() {
      return tagCollection.method25170();
   }

   public static List<? extends Class7610<EntityType<?>>> method30862() {
      return tagCollection.method25171();
   }
}
