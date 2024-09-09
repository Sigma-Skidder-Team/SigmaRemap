package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class FluidTags {
   public static final Class7656<Fluid> field40468 = Class8384.<Fluid>method29377(new ResourceLocation("fluid"), Class8933::method32659);
   public static final Class7610<Fluid> field40469 = method32716("water");
   public static final Class7610<Fluid> field40470 = method32716("lava");

   private static Class7610<Fluid> method32716(String var0) {
      return field40468.method25167(var0);
   }

   public static List<? extends Class7610<Fluid>> method32717() {
      return field40468.method25171();
   }
}
