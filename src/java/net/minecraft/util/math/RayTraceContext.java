package net.minecraft.util.math;

import mapped.Class2272;
import mapped.Class7377;
import mapped.VoxelShape;
import mapped.VoxelShapes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import java.util.function.Predicate;

public class RayTraceContext {
   private static String[] field29635;
   private final Vector3d field29636;
   private final Vector3d field29637;
   private final BlockMode field29638;
   private final FluidMode field29639;
   private final ISelectionContext field29640;

   public RayTraceContext(Vector3d var1, Vector3d var2, BlockMode var3, FluidMode var4, Entity var5) {
      this.field29636 = var1;
      this.field29637 = var2;
      this.field29638 = var3;
      this.field29639 = var4;
      this.field29640 = ISelectionContext.forEntity(var5);
   }

   public Vector3d getEndVec() {
      return this.field29637;
   }

   public Vector3d getStartVec() {
      return this.field29636;
   }

   public VoxelShape getBlockShape(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.field29638.method8998(var1, var2, var3, this.field29640);
   }

   public VoxelShape getFluidShape(FluidState var1, IBlockReader var2, BlockPos var3) {
      return !this.field29639.test(var1) ? VoxelShapes.method27425() : var1.method23489(var2, var3);
   }

   public enum FluidMode {
      NONE(var0 -> false),
      SOURCE_ONLY(FluidState::isSource),
      ANY(var0 -> !var0.isEmpty());

      private final Predicate<FluidState> fluidTest;

      private FluidMode(Predicate<FluidState> var3) {
         this.fluidTest = var3;
      }

      public boolean test(FluidState var1) {
         return this.fluidTest.test(var1);
      }
   }

   public enum BlockMode implements Class2272 {
      field14774(Class7377::getCollisionShape),
      OUTLINE(Class7377::method23413),
      field14776(Class7377::method23417);

      private final Class2272 field14777;
      private static final BlockMode[] field14778 = new BlockMode[]{field14774, OUTLINE, field14776};

      private BlockMode(Class2272 var3) {
         this.field14777 = var3;
      }

      @Override
      public VoxelShape method8998(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
         return this.field14777.method8998(var1, var2, var3, var4);
      }
   }
}
