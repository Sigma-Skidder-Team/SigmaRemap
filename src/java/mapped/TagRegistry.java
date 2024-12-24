package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TagRegistry<T> {
   private static String[] field32848;
   private ITagCollection<T> field32849 = ITagCollection.<T>method27141();
   private final List<Class7611<T>> field32850 = Lists.newArrayList();
   private final Function<ITagCollectionSupplier, ITagCollection<T>> field32851;

   public TagRegistry(Function<ITagCollectionSupplier, ITagCollection<T>> var1) {
      this.field32851 = var1;
   }

   public Class7610<T> method25167(String var1) {
      Class7611 var4 = new Class7611(new ResourceLocation(var1));
      this.field32850.add(var4);
      return var4;
   }

   public void fetchTags() {
      this.field32849 = ITagCollection.<T>method27141();
      Class7609 var3 = Class7609.method24925();
      this.field32850.forEach(var1 -> var1.method24931(var1x -> var3));
   }

   public void fetchTags(ITagCollectionSupplier var1) {
      ITagCollection var4 = this.field32851.apply(var1);
      this.field32849 = var4;
      this.field32850.forEach(var1x -> var1x.method24931(var4::get));
   }

   public ITagCollection<T> method25170() {
      return this.field32849;
   }

   public List<? extends Class7610<T>> method25171() {
      return this.field32850;
   }

   public Set<ResourceLocation> getTagIdsFromSupplier(ITagCollectionSupplier var1) {
      ITagCollection var4 = this.field32851.apply(var1);
      Set var5 = this.field32850.stream().<ResourceLocation>map(Class7611::getName).collect(Collectors.toSet());
      ImmutableSet var6 = ImmutableSet.copyOf(var4.method27137());
      return Sets.difference(var5, var6);
   }
}
