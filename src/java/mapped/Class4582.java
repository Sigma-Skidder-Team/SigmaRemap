package mapped;

import net.minecraft.util.math.BlockPos;

public class Class4582 extends Class4566 {
   private static String[] field22030;
   private float field22031;

   public Class4582(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field22056 = (int)(Math.random() * 60.0) + 30;
      this.field22049 = false;
      this.field22044 = 0.0;
      this.field22045 = -0.05;
      this.field22046 = 0.0;
      this.method14519(0.02F, 0.02F);
      this.field22035 = this.field22035 * (this.field22054.nextFloat() * 0.6F + 0.2F);
      this.field22057 = 0.002F;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         float var3 = 0.6F;
         this.field22044 = this.field22044 + (double)(0.6F * MathHelper.cos(this.field22031));
         this.field22046 = this.field22046 + (double)(0.6F * MathHelper.sin(this.field22031));
         this.field22044 *= 0.07;
         this.field22046 *= 0.07;
         this.method14511(this.field22044, this.field22045, this.field22046);
         if (!this.field22037.getFluidState(new BlockPos(this.field22041, this.field22042, this.field22043)).method23486(Class8953.field40469) || this.field22048
            )
          {
            this.method14518();
         }

         this.field22031 = (float)((double)this.field22031 + 0.08);
      } else {
         this.method14518();
      }
   }
}
