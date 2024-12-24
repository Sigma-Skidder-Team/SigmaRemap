package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.tags.TagRegistry;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class EntityTypeTags {
   public static final TagRegistry<EntityType<?>> tagCollection = TagRegistryManager.<EntityType<?>>create(new ResourceLocation("entity_type"), ITagCollectionSupplier::method32660);
   public static final ITag$NamedTag<EntityType<?>> field38734 = method30860("skeletons");
   public static final ITag$NamedTag<EntityType<?>> field38735 = method30860("raiders");
   public static final ITag$NamedTag<EntityType<?>> field38736 = method30860("beehive_inhabitors");
   public static final ITag$NamedTag<EntityType<?>> field38737 = method30860("arrows");
   public static final ITag$NamedTag<EntityType<?>> field38738 = method30860("impact_projectiles");

   private static ITag$NamedTag<EntityType<?>> method30860(String var0) {
      return tagCollection.createTag(var0);
   }

   public static ITagCollection<EntityType<?>> method30861() {
      return tagCollection.getCollection();
   }

   public static List<? extends ITag$NamedTag<EntityType<?>>> method30862() {
      return tagCollection.getTags();
   }
}