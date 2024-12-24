package mapped;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class FluidTags {
   public static final TagRegistry<Fluid> collections = TagRegistryManager.<Fluid>create(new ResourceLocation("fluid"), ITagCollectionSupplier::method32659);
   public static final Class7610<Fluid> field40469 = method32716("water");
   public static final Class7610<Fluid> field40470 = method32716("lava");

   private static Class7610<Fluid> method32716(String var0) {
      return collections.method25167(var0);
   }

   public static List<? extends Class7610<Fluid>> method32717() {
      return collections.method25171();
   }
}
