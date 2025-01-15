package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.function.Predicate;

public class Class4833 implements ISelectionContext {
   private static String[] field22606;
   public static final ISelectionContext field22607 = new Class4834(false, -Double.MAX_VALUE, Items.AIR, var0 -> false);
   private final boolean field22608;
   private final double field22609;
   private final Item field22610;
   private final Predicate<Fluid> field22611;

   public Class4833(boolean var1, double var2, Item var4, Predicate<Fluid> var5) {
      this.field22608 = var1;
      this.field22609 = var2;
      this.field22610 = var4;
      this.field22611 = var5;
   }

   @Deprecated
   public Class4833(Entity var1) {
      this(
         var1.method3335(),
         var1.getPosY(),
         !(var1 instanceof LivingEntity) ? Items.AIR : ((LivingEntity)var1).getHeldItemMainhand().getItem(),
         !(var1 instanceof LivingEntity) ? var0 -> false : ((LivingEntity)var1)::method3107
      );
   }

   @Override
   public boolean method14951(Item var1) {
      return this.field22610 == var1;
   }

   @Override
   public boolean method14952(FluidState var1, FlowingFluid var2) {
      return this.field22611.test(var2) && !var1.getFluid().method25066(var2);
   }

   @Override
   public boolean method14949() {
      return this.field22608;
   }

   @Override
   public boolean method14950(VoxelShape var1, BlockPos var2, boolean var3) {
      return this.field22609 > (double)var2.getY() + var1.getEnd(Direction.Axis.Y) - 1.0E-5F;
   }
}
