package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.Random;

public class Class2640 extends Class2595 {
   private static String[] field16965;
   public final Class1046 field16966;
   private double field16967;
   private double field16968;
   private double field16969;
   private final double field16970;
   private final World field16971;

   public Class2640(Class1046 var1, double var2) {
      this.field16966 = var1;
      this.field16970 = var2;
      this.field16971 = var1.world;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field16966.method4232() == null) {
         if (this.field16971.method6740()) {
            if (this.field16966.method3327()) {
               if (this.field16971.method7022(this.field16966.getPosition())) {
                  return this.field16966.method2943(Class2106.field13736).isEmpty() ? this.method10848() : false;
               } else {
                  return false;
               }
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

   public boolean method10848() {
      Vector3d var3 = this.method10849();
      if (var3 != null) {
         this.field16967 = var3.x;
         this.field16968 = var3.y;
         this.field16969 = var3.z;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field16966.method4230().method21664();
   }

   @Override
   public void method10804() {
      this.field16966.method4230().method21654(this.field16967, this.field16968, this.field16969, this.field16970);
   }

   @Nullable
   public Vector3d method10849() {
      Random var3 = this.field16966.method3013();
      BlockPos var4 = this.field16966.getPosition();

      for (int var5 = 0; var5 < 10; var5++) {
         BlockPos var6 = var4.method8336(var3.nextInt(20) - 10, var3.nextInt(6) - 3, var3.nextInt(20) - 10);
         if (!this.field16971.method7022(var6) && this.field16966.method4771(var6) < 0.0F) {
            return Vector3d.method11330(var6);
         }
      }

      return null;
   }
}
