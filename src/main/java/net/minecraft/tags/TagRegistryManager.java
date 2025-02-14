package net.minecraft.tags;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import mapped.*;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class TagRegistryManager {
   private static final Map<ResourceLocation, TagRegistry<?>> idToRegistryMap = Maps.newHashMap();

   public static <T> TagRegistry<T> create(ResourceLocation id, Function<ITagCollectionSupplier, ITagCollection<T>> supplierToCollectionFunction) {
      TagRegistry var4 = new TagRegistry(supplierToCollectionFunction);
      TagRegistry var5 = idToRegistryMap.putIfAbsent(id, var4);
      if (var5 == null) {
         return var4;
      } else {
         throw new IllegalStateException("Duplicate entry for static tag collection: " + id);
      }
   }

   public static void fetchTags(ITagCollectionSupplier supplier) {
      idToRegistryMap.values().forEach(registry -> registry.fetchTags(supplier));
   }

   public static void fetchTags() {
      idToRegistryMap.values().forEach(TagRegistry::fetchTags);
   }

   public static Multimap<ResourceLocation, ResourceLocation> validateTags(ITagCollectionSupplier supplier) {
      HashMultimap multimap = HashMultimap.create();
      idToRegistryMap.forEach((id, registry) -> multimap.putAll(id, registry.getTagIdsFromSupplier(supplier)));
      return multimap;
   }

   public static void checkHelperRegistrations() {
      TagRegistry[] registries = new TagRegistry[]{BlockTags.collection, ItemTags.collections, FluidTags.collections, EntityTypeTags.tagCollection};
      boolean includesReg = Stream.of(registries).anyMatch(reg -> !idToRegistryMap.containsValue(reg));
      if (includesReg) {
         throw new IllegalStateException("Missing helper registrations");
      }
   }
}
