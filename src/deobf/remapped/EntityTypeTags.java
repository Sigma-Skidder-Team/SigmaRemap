package remapped;

import java.util.List;

public final class EntityTypeTags {
   public static final TagRegistry<EntityType<?>> tagCollection = TagRegistryManager.<EntityType<?>>create(new Identifier("entity_type"), ITagCollectionSupplier::getEntityTypeTags);
   public static final INamedTag<EntityType<?>> SKELETONS = getTagById("skeletons");
   public static final INamedTag<EntityType<?>> RAIDERS = getTagById("raiders");
   public static final INamedTag<EntityType<?>> BEEHIVE_INHABITORS = getTagById("beehive_inhabitors");
   public static final INamedTag<EntityType<?>> ARROWS = getTagById("arrows");
   public static final INamedTag<EntityType<?>> IMPACT_PROJECTILES = getTagById("impact_projectiles");

   private static INamedTag<EntityType<?>> getTagById(String var0) {
      return tagCollection.createTag(var0);
   }

   public static ITagCollection<EntityType<?>> getCollection() {
      return tagCollection.getCollection();
   }

   public static List<? extends INamedTag<EntityType<?>>> getAllTags() {
      return tagCollection.getTags();
   }
}
