package net.minecraft.util.math;

import net.minecraft.util.math.shapes.VoxelShape;
import mapped.VoxelShapes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import java.util.function.Predicate;

public class RayTraceContext {
   private static String[] field29635;
   private final Vector3d start;
   private final Vector3d end;
   private final BlockMode shapeType;
   private final FluidMode fluidHandling;
   private final ISelectionContext selectionContext;

   public RayTraceContext(Vector3d start, Vector3d end, BlockMode shapeType, FluidMode fluidHandling, Entity entity) {
      this.start = start;
      this.end = end;
      this.shapeType = shapeType;
      this.fluidHandling = fluidHandling;
      this.selectionContext = ISelectionContext.forEntity(entity);
   }

   public Vector3d getEndVec() {
      return this.end;
   }

   public Vector3d getStartVec() {
      return this.start;
   }

   public VoxelShape getBlockShape(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.shapeType.method8998(var1, var2, var3, this.selectionContext);
   }

   public VoxelShape getFluidShape(FluidState var1, IBlockReader var2, BlockPos var3) {
      return !this.fluidHandling.test(var1) ? VoxelShapes.empty() : var1.method23489(var2, var3);
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

   public enum BlockMode implements IVoxelProvider {
      COLLIDER(AbstractBlock.AbstractBlockState::getCollisionShape),
      OUTLINE(AbstractBlock.AbstractBlockState::getShape),
      VISUAL(AbstractBlock.AbstractBlockState::method23417);

      private final IVoxelProvider provider;

      private BlockMode(IVoxelProvider var3) {
         this.provider = var3;
      }

      @Override
      public VoxelShape method8998(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
         return this.provider.method8998(var1, var2, var3, var4);
      }
   }

   public static interface IVoxelProvider {
      VoxelShape method8998(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4);
   }
}
