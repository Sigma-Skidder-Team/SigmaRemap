package mapped;

import net.minecraft.fluid.Fluid;
import net.minecraft.tags.ITag$INamedTag;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.TagRegistry;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class FluidTags {
   public static final TagRegistry<Fluid> collections = TagRegistryManager.<Fluid>create(new ResourceLocation("fluid"), ITagCollectionSupplier::method32659);
   public static final ITag$INamedTag<Fluid> field40469 = method32716("water");
   public static final ITag$INamedTag<Fluid> field40470 = method32716("lava");

   private static ITag$INamedTag<Fluid> method32716(String var0) {
      return collections.createTag(var0);
   }

   public static List<? extends ITag$INamedTag<Fluid>> method32717() {
      return collections.getTags();
   }
}
