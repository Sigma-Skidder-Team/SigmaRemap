package mapped;

import net.minecraft.fluid.FluidState;

import java.util.function.Predicate;

public enum Class1985 {
   field12962(var0 -> false),
   field12963(FluidState::method23473),
   field12964(var0 -> !var0.method23474());

   private final Predicate<FluidState> field12965;
   private static final Class1985[] field12966 = new Class1985[]{field12962, field12963, field12964};

   private Class1985(Predicate<FluidState> var3) {
      this.field12965 = var3;
   }

   public boolean method8273(FluidState var1) {
      return this.field12965.test(var1);
   }
}
