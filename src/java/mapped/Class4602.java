package mapped;

import net.minecraft.util.math.BlockPos;

public class Class4602 extends Class4601 {
   private static String[] field22103;

   public Class4602(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6, var14, 0.0F);
      this.field22035 = 0.5F;
      this.method14515(1.0F);
      this.method14514(0.0F, 0.0F, 0.0F);
      this.field22056 = (int)((double)(this.field22035 * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.method14508(var14);
      this.field22049 = false;
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.method14537(0.0F);
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22096);
         if (this.field22055 > this.field22056 / 2) {
            this.method14515(1.0F - ((float)this.field22055 - (float)(this.field22056 / 2)) / (float)this.field22056);
         }

         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22037.getBlockState(new BlockPos(this.field22041, this.field22042, this.field22043)).isAir()) {
            this.field22045 -= 0.008F;
         }

         this.field22044 *= 0.92F;
         this.field22045 *= 0.92F;
         this.field22046 *= 0.92F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
