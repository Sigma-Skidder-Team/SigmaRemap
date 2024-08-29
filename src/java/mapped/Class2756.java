package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class Class2756 extends Class2754 {
   private static String[] field17296;
   private static final int[] field17297 = new int[]{0, 1, 4, 5, 6, 7};
   private final Class1048 field17298;
   private final int field17299;
   private boolean field17300;

   public Class2756(Class1048 var1, int var2) {
      this.field17298 = var1;
      this.field17299 = var2;
   }

   @Override
   public boolean method10803() {
      if (this.field17298.method3013().nextInt(this.field17299) != 0) {
         return false;
      } else {
         Direction var3 = this.field17298.method3387();
         int var4 = var3.method539();
         int var5 = var3.method541();
         BlockPos var6 = this.field17298.getPosition();

         for (int var10 : field17297) {
            if (!this.method10959(var6, var4, var5, var10) || !this.method10960(var6, var4, var5, var10)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method10959(BlockPos var1, int var2, int var3, int var4) {
      BlockPos var7 = var1.method8336(var2 * var4, 0, var3 * var4);
      return this.field17298.world.getFluidState(var7).method23486(Class8953.field40469)
         && !this.field17298.world.getBlockState(var7).method23384().method31087();
   }

   private boolean method10960(BlockPos var1, int var2, int var3, int var4) {
      return this.field17298.world.getBlockState(var1.method8336(var2 * var4, 1, var3 * var4)).isAir()
         && this.field17298.world.getBlockState(var1.method8336(var2 * var4, 2, var3 * var4)).isAir();
   }

   @Override
   public boolean method10806() {
      double var3 = this.field17298.method3433().field18049;
      return (!(var3 * var3 < 0.03F) || this.field17298.rotationPitch == 0.0F || !(Math.abs(this.field17298.rotationPitch) < 10.0F) || !this.field17298.method3250())
         && !this.field17298.method3226();
   }

   @Override
   public boolean method10808() {
      return false;
   }

   @Override
   public void method10804() {
      Direction var3 = this.field17298.method3387();
      this.field17298.method3434(this.field17298.method3433().method11339((double)var3.method539() * 0.6, 0.7, (double)var3.method541() * 0.6));
      this.field17298.method4230().method21666();
   }

   @Override
   public void method10807() {
      this.field17298.rotationPitch = 0.0F;
   }

   @Override
   public void method10805() {
      boolean var3 = this.field17300;
      if (!var3) {
         FluidState var4 = this.field17298.world.getFluidState(this.field17298.getPosition());
         this.field17300 = var4.method23486(Class8953.field40469);
      }

      if (this.field17300 && !var3) {
         this.field17298.method2863(Sounds.field26504, 1.0F, 1.0F);
      }

      Vector3d var9 = this.field17298.method3433();
      if (var9.field18049 * var9.field18049 < 0.03F && this.field17298.rotationPitch != 0.0F) {
         this.field17298.rotationPitch = MathHelper.method37828(this.field17298.rotationPitch, 0.0F, 0.2F);
      } else {
         double var5 = Math.sqrt(Entity.method3234(var9));
         double var7 = Math.signum(-var9.field18049) * Math.acos(var5 / var9.method11348()) * 180.0F / (float)Math.PI;
         this.field17298.rotationPitch = (float)var7;
      }
   }
}
