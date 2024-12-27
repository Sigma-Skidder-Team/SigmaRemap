package mapped;

import net.minecraft.util.math.shapes.VoxelShape;

public interface WorldBorderIBorderInfo {
   double getMinX();

   double getMaxX();

   double getMinZ();

   double getMaxZ();

   double getSize();

   double getResizeSpeed();

   long getTimeUntilTarget();

   double getTargetSize();

   BorderStatus getStatus();

   void onSizeChanged();

   void onCenterChanged();

   WorldBorderIBorderInfo tick();

   VoxelShape getShape();
}
