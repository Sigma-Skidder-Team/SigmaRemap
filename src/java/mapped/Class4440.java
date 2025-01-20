package mapped;

import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.nio.file.Path;

public class Class4440 extends Class4441<Fluid> {
   public Class4440(Class9068 var1) {
      super(var1, Registry.FLUID);
   }

   @Override
   public void method14010() {
      this.method14014(FluidTags.WATER).method31560(Fluids.WATER, Fluids.FLOWING_WATER);
      this.method14014(FluidTags.field40470).method31560(Fluids.LAVA, Fluids.FLOWING_LAVA);
   }

   @Override
   public Path method14011(ResourceLocation var1) {
      return this.field21599.method33776().resolve("data/" + var1.getNamespace() + "/tags/fluids/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Fluid Tags";
   }
}
