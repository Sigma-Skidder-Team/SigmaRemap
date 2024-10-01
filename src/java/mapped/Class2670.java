package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.Random;

public class Class2670 extends Class2595 {
   private static String[] field17047;
   private final Class1046 field17048;
   private double field17049;
   private double field17050;
   private double field17051;
   private final double field17052;
   private final World field17053;

   public Class2670(Class1046 var1, double var2) {
      this.field17048 = var1;
      this.field17052 = var2;
      this.field17053 = var1.world;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field17053.method6740()) {
         if (!this.field17048.isInWater()) {
            Vector3d var3 = this.method10889();
            if (var3 != null) {
               this.field17049 = var3.x;
               this.field17050 = var3.y;
               this.field17051 = var3.z;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field17048.method4230().method21664();
   }

   @Override
   public void method10804() {
      this.field17048.method4230().method21654(this.field17049, this.field17050, this.field17051, this.field17052);
   }

   @Nullable
   private Vector3d method10889() {
      Random var3 = this.field17048.getRNG();
      BlockPos var4 = this.field17048.getPosition();

      for (int var5 = 0; var5 < 10; var5++) {
         BlockPos var6 = var4.add(var3.nextInt(20) - 10, 2 - var3.nextInt(8), var3.nextInt(20) - 10);
         if (this.field17053.getBlockState(var6).isIn(Blocks.WATER)) {
            return Vector3d.method11330(var6);
         }
      }

      return null;
   }
}
