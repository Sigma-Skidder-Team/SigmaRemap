package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class2747 extends Class2595 {
   private static String[] field17280;
   public final Class1046 field17281;
   public final double field17282;
   public double field17283;
   public double field17284;
   public double field17285;
   public boolean field17286;

   public Class2747(Class1046 var1, double var2) {
      this.field17281 = var1;
      this.field17282 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field17281.method3014() == null && !this.field17281.method3327()) {
         return false;
      } else {
         if (this.field17281.method3327()) {
            BlockPos var3 = this.method10957(this.field17281.world, this.field17281, 5, 4);
            if (var3 != null) {
               this.field17283 = (double)var3.getX();
               this.field17284 = (double)var3.getY();
               this.field17285 = (double)var3.getZ();
               return true;
            }
         }

         return this.method10955();
      }
   }

   public boolean method10955() {
      Vector3d var3 = Class8037.method27581(this.field17281, 5, 4);
      if (var3 != null) {
         this.field17283 = var3.x;
         this.field17284 = var3.y;
         this.field17285 = var3.z;
         return true;
      } else {
         return false;
      }
   }

   public boolean method10956() {
      return this.field17286;
   }

   @Override
   public void method10804() {
      this.field17281.method4230().method21654(this.field17283, this.field17284, this.field17285, this.field17282);
      this.field17286 = true;
   }

   @Override
   public void method10807() {
      this.field17286 = false;
   }

   @Override
   public boolean method10806() {
      return !this.field17281.method4230().method21664();
   }

   @Nullable
   public BlockPos method10957(IBlockReader var1, Entity var2, int var3, int var4) {
      BlockPos var7 = var2.getPosition();
      int var8 = var7.getX();
      int var9 = var7.getY();
      int var10 = var7.getZ();
      float var11 = (float)(var3 * var3 * var4 * 2);
      BlockPos var12 = null;
      BlockPos.Mutable var13 = new BlockPos.Mutable();

      for (int var14 = var8 - var3; var14 <= var8 + var3; var14++) {
         for (int var15 = var9 - var4; var15 <= var9 + var4; var15++) {
            for (int var16 = var10 - var3; var16 <= var10 + var3; var16++) {
               var13.method8372(var14, var15, var16);
               if (var1.getFluidState(var13).method23486(Class8953.field40469)) {
                  float var17 = (float)((var14 - var8) * (var14 - var8) + (var15 - var9) * (var15 - var9) + (var16 - var10) * (var16 - var10));
                  if (var17 < var11) {
                     var11 = var17;
                     var12 = new BlockPos(var13);
                  }
               }
            }
         }
      }

      return var12;
   }
}
