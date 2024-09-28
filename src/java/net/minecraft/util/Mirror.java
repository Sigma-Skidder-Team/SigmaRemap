package net.minecraft.util;

import net.minecraft.util.math.vector.Orientation;
import mapped.Class8449;

public enum Mirror {
   field13614(Orientation.IDENTITY),
   field13615(Orientation.INVERT_Z),
   field13616(Orientation.INVERT_X);

   private final Orientation field13617;
   private static final Mirror[] field13618 = new Mirror[]{field13614, field13615, field13616};

   private Mirror(Orientation var3) {
      this.field13617 = var3;
   }

   public int method8748(int var1, int var2) {
      int var5 = var2 / 2;
      int var6 = var1 > var5 ? var1 - var2 : var1;
      switch (Class8449.field36255[this.ordinal()]) {
         case 1:
            return (var2 - var6) % var2;
         case 2:
            return (var5 - var6 + var2) % var2;
         default:
            return var1;
      }
   }

   public Rotation toRotation(Direction var1) {
      Direction.Axis var4 = var1.getAxis();
      return this == field13615 && var4 == Direction.Axis.Z || this == field13616 && var4 == Direction.Axis.X ? Rotation.CLOCKWISE_180 : Rotation.NONE;
   }

   public Direction method8750(Direction var1) {
      if (this == field13616 && var1.getAxis() == Direction.Axis.X) {
         return var1.getOpposite();
      } else {
         return this == field13615 && var1.getAxis() == Direction.Axis.Z ? var1.getOpposite() : var1;
      }
   }

   public Orientation method8751() {
      return this.field13617;
   }
}
