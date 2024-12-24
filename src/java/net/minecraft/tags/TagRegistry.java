package net.minecraft.tags;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import mapped.*;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TagRegistry<T> {
   private ITagCollection<T> collection = ITagCollection.<T>getEmptyTagCollection();
   private final List<TagRegistry$NamedTag<T>> tags = Lists.newArrayList();
   private final Function<ITagCollectionSupplier, ITagCollection<T>> supplierToCollectionFunction;

   public TagRegistry(Function<ITagCollectionSupplier, ITagCollection<T>> var1) {
      this.supplierToCollectionFunction = var1;
   }

   public ITag$NamedTag<T> createTag(String id) {
      TagRegistry$NamedTag tag = new TagRegistry$NamedTag(new ResourceLocation(id));
      this.tags.add(tag);
      return tag;
   }

   public void fetchTags() {
      this.collection = ITagCollection.<T>getEmptyTagCollection();
      ITag<T> newTag = Tag.getEmptyTag();
      this.tags.forEach(tag -> tag.fetchTag(id -> newTag));
   }

   public void fetchTags(ITagCollectionSupplier var1) {
      ITagCollection collection = this.supplierToCollectionFunction.apply(var1);
      this.collection = collection;
      this.tags.forEach(tag -> tag.fetchTag(collection::get));
   }

   public ITagCollection<T> getCollection() {
      return this.collection;
   }

   public List<? extends ITag$NamedTag<T>> getTags() {
      return this.tags;
   }

   public Set<ResourceLocation> getTagIdsFromSupplier(ITagCollectionSupplier supplier) {
      ITagCollection collection = this.supplierToCollectionFunction.apply(supplier);
      Set tagNames = this.tags.stream().<ResourceLocation>map(TagRegistry$NamedTag::getName).collect(Collectors.toSet());
      ImmutableSet registeredTags = ImmutableSet.copyOf(collection.getRegisteredTags());
      return Sets.difference(tagNames, registeredTags);
   }
}
