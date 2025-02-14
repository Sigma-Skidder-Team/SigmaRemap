package mapped;

import net.minecraft.world.World;

public class WorldBorder1 extends WorldBorder {
   public final DimensionType dimensionType;
   public final World parentClass;

   public WorldBorder1(World parentClass, DimensionType var2) {
      this.parentClass = parentClass;
      this.dimensionType = var2;
   }

   @Override
   public double getCenterX() {
      return super.getCenterX() / this.dimensionType.getCoordinateScale();
   }

   @Override
   public double getCenterZ() {
      return super.getCenterZ() / this.dimensionType.getCoordinateScale();
   }
}
