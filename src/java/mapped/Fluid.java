package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Fluid {
   public static final Class2352<FluidState> field32708 = new Class2352<FluidState>();
   public final Class9348<Fluid, FluidState> field32709;
   private FluidState field32710;

   public Fluid() {
      Class7558<Fluid, FluidState> var3 = new Class7558<>(this);
      this.method25046(var3);
      this.field32709 = var3.method24739(Fluid::method25049, FluidState::new);
      this.method25048(this.field32709.method35393());
   }

   public void method25046(Class7558<Fluid, FluidState> var1) {
   }

   public Class9348<Fluid, FluidState> method25047() {
      return this.field32709;
   }

   public final void method25048(FluidState var1) {
      this.field32710 = var1;
   }

   public final FluidState method25049() {
      return this.field32710;
   }

   public abstract Item method25050();

   public void method25051(World var1, BlockPos var2, FluidState var3, Random var4) {
   }

   public void method25052(World var1, BlockPos var2, FluidState var3) {
   }

   public void method25053(World var1, BlockPos var2, FluidState var3, Random var4) {
   }

   @Nullable
   public Class7436 method25054() {
      return null;
   }

   public abstract boolean method25055(FluidState var1, Class1665 var2, BlockPos var3, Fluid var4, Direction var5);

   public abstract Vector3d method25056(Class1665 var1, BlockPos var2, FluidState var3);

   public abstract int method25057(Class1662 var1);

   public boolean method25058() {
      return false;
   }

   public boolean method25059() {
      return false;
   }

   public abstract float method25060();

   public abstract float method25061(FluidState var1, Class1665 var2, BlockPos var3);

   public abstract float method25062(FluidState var1);

   public abstract BlockState method25063(FluidState var1);

   public abstract boolean method25064(FluidState var1);

   public abstract int method25065(FluidState var1);

   public boolean method25066(Fluid var1) {
      return var1 == this;
   }

   public boolean method25067(ITag<Fluid> var1) {
      return var1.method24917(this);
   }

   public abstract VoxelShape method25068(FluidState var1, Class1665 var2, BlockPos var3);
}
