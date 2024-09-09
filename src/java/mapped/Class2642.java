package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public abstract class Class2642 extends Class2595 {
   public Class1006 field16974;
   public BlockPos field16975 = BlockPos.ZERO;
   public boolean field16976;
   private boolean field16977;
   private float field16978;
   private float field16979;

   public Class2642(Class1006 var1) {
      this.field16974 = var1;
      if (!Class8100.method28053(var1)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   public boolean method10850() {
      if (this.field16976) {
         BlockState var3 = this.field16974.world.getBlockState(this.field16975);
         if (var3.getBlock() instanceof Class3461) {
            return var3.<Boolean>method23463(Class3461.field19294);
         } else {
            this.field16976 = false;
            return false;
         }
      } else {
         return false;
      }
   }

   public void method10851(boolean var1) {
      if (this.field16976) {
         BlockState var4 = this.field16974.world.getBlockState(this.field16975);
         if (var4.getBlock() instanceof Class3461) {
            ((Class3461)var4.getBlock()).method12142(this.field16974.world, var4, this.field16975, var1);
         }
      }
   }

   @Override
   public boolean method10803() {
      if (Class8100.method28053(this.field16974)) {
         if (this.field16974.collidedHorizontally) {
            Class6991 var3 = (Class6991)this.field16974.method4230();
            Class8238 var4 = var3.method21657();
            if (var4 != null && !var4.method28693() && var3.method21683()) {
               for (int var5 = 0; var5 < Math.min(var4.method28699() + 2, var4.method28698()); var5++) {
                  Class7176 var6 = var4.method28695(var5);
                  this.field16975 = new BlockPos(var6.field30847, var6.field30848 + 1, var6.field30849);
                  if (!(
                     this.field16974.getDistanceNearest((double)this.field16975.getX(), this.field16974.getPosY(), (double)this.field16975.getZ())
                        > 2.25
                  )) {
                     this.field16976 = Class3461.method12144(this.field16974.world, this.field16975);
                     if (this.field16976) {
                        return true;
                     }
                  }
               }

               this.field16975 = this.field16974.getPosition().up();
               this.field16976 = Class3461.method12144(this.field16974.world, this.field16975);
               return this.field16976;
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
      return !this.field16977;
   }

   @Override
   public void method10804() {
      this.field16977 = false;
      this.field16978 = (float)((double)this.field16975.getX() + 0.5 - this.field16974.getPosX());
      this.field16979 = (float)((double)this.field16975.getZ() + 0.5 - this.field16974.getPosZ());
   }

   @Override
   public void method10805() {
      float var3 = (float)((double)this.field16975.getX() + 0.5 - this.field16974.getPosX());
      float var4 = (float)((double)this.field16975.getZ() + 0.5 - this.field16974.getPosZ());
      float var5 = this.field16978 * var3 + this.field16979 * var4;
      if (var5 < 0.0F) {
         this.field16977 = true;
      }
   }
}
