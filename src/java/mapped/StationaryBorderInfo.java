package mapped;

import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

public class StationaryBorderInfo implements WorldBorderIBorderInfo {
    private final double size;
   private double minX;
   private double minZ;
   private double maxX;
   private double maxZ;
   private VoxelShape shape;
   public final WorldBorder parentClass;

   public StationaryBorderInfo(WorldBorder var1, double size) {
      this.parentClass = var1;
      this.size = size;
      this.updateBox();
   }

   @Override
   public double getMinX() {
      return this.minX;
   }

   @Override
   public double getMaxX() {
      return this.maxX;
   }

   @Override
   public double getMinZ() {
      return this.minZ;
   }

   @Override
   public double getMaxZ() {
      return this.maxZ;
   }

   @Override
   public double getSize() {
      return this.size;
   }

   @Override
   public BorderStatus getStatus() {
      return BorderStatus.STATIONARY;
   }

   @Override
   public double getResizeSpeed() {
      return 0.0;
   }

   @Override
   public long getTimeUntilTarget() {
      return 0L;
   }

   @Override
   public double getTargetSize() {
      return this.size;
   }

   private void updateBox() {
      this.minX = Math.max(this.parentClass.getCenterX() - this.size / 2.0, (double)(-WorldBorder.getWorldBorderSize(this.parentClass)));
      this.minZ = Math.max(this.parentClass.getCenterZ() - this.size / 2.0, (double)(-WorldBorder.getWorldBorderSize(this.parentClass)));
      this.maxX = Math.min(this.parentClass.getCenterX() + this.size / 2.0, (double) WorldBorder.getWorldBorderSize(this.parentClass));
      this.maxZ = Math.min(this.parentClass.getCenterZ() + this.size / 2.0, (double) WorldBorder.getWorldBorderSize(this.parentClass));
      this.shape = VoxelShapes.combineAndSimplify(
         VoxelShapes.INFINITY,
         VoxelShapes.create(
            Math.floor(this.getMinX()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.getMinZ()),
            Math.ceil(this.getMaxX()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.getMaxZ())
         ),
         IBooleanFunction.ONLY_FIRST
      );
   }

   @Override
   public void onSizeChanged() {
      this.updateBox();
   }

   @Override
   public void onCenterChanged() {
      this.updateBox();
   }

   @Override
   public WorldBorderIBorderInfo tick() {
      return this;
   }

   @Override
   public VoxelShape getShape() {
      return this.shape;
   }
}
