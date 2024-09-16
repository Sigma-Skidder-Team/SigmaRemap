package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.util.math.MathHelper;

public class Class8118 implements WorldBorderIBorderInfo {
   private static String[] field34886;
   private final double field34887;
   private final double field34888;
   private final long field34889;
   private final long field34890;
   private final double field34891;
   public final WorldBorder field34892;

   public Class8118(WorldBorder var1, double var2, double var4, long var6) {
      this.field34892 = var1;
      this.field34887 = var2;
      this.field34888 = var4;
      this.field34891 = (double)var6;
      this.field34890 = Util.milliTime();
      this.field34889 = this.field34890 + var6;
   }

   @Override
   public double getMinX() {
      return Math.max(this.field34892.getCenterX() - this.getSize() / 2.0, (double)(-WorldBorder.getWorldBorderSize(this.field34892)));
   }

   @Override
   public double getMinZ() {
      return Math.max(this.field34892.getCenterZ() - this.getSize() / 2.0, (double)(-WorldBorder.getWorldBorderSize(this.field34892)));
   }

   @Override
   public double getMaxX() {
      return Math.min(this.field34892.getCenterX() + this.getSize() / 2.0, (double) WorldBorder.getWorldBorderSize(this.field34892));
   }

   @Override
   public double getMaxZ() {
      return Math.min(this.field34892.getCenterZ() + this.getSize() / 2.0, (double) WorldBorder.getWorldBorderSize(this.field34892));
   }

   @Override
   public double getSize() {
      double var3 = (double)(Util.milliTime() - this.field34890) / this.field34891;
      return !(var3 < 1.0) ? this.field34888 : MathHelper.lerp(var3, this.field34887, this.field34888);
   }

   @Override
   public double getResizeSpeed() {
      return Math.abs(this.field34887 - this.field34888) / (double)(this.field34889 - this.field34890);
   }

   @Override
   public long getTimeUntilTarget() {
      return this.field34889 - Util.milliTime();
   }

   @Override
   public double getTargetSize() {
      return this.field34888;
   }

   @Override
   public BorderStatus getStatus() {
      return !(this.field34888 < this.field34887) ? BorderStatus.field13693 : BorderStatus.field13694;
   }

   @Override
   public void onCenterChanged() {
   }

   @Override
   public void onSizeChanged() {
   }

   @Override
   public WorldBorderIBorderInfo tick() {
      Object var10000;
      if (this.getTimeUntilTarget() > 0L) {
         var10000 = this;
      } else {
         WorldBorder var10002 = this.field34892;
         this.field34892.getClass();
         var10000 = new StationaryBorderInfo(var10002, this.field34888);
      }

      return (WorldBorderIBorderInfo)var10000;
   }

   @Override
   public VoxelShape getShape() {
      return VoxelShapes.combineAndSimplify(
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
}
