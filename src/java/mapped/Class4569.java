package mapped;

import net.minecraft.util.math.BlockPos;

public class Class4569 extends Class4566 {
   private static String[] field22007;

   public Class4569(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22044 *= 0.3F;
      this.field22045 = Math.random() * 0.2F + 0.1F;
      this.field22046 *= 0.3F;
      this.method14519(0.01F, 0.01F);
      this.field22057 = 0.06F;
      this.field22056 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
      if (this.field22056-- > 0) {
         this.field22045 = this.field22045 - (double)this.field22057;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.98F;
         this.field22045 *= 0.98F;
         this.field22046 *= 0.98F;
         if (this.field22048) {
            if (Math.random() < 0.5) {
               this.method14518();
            }

            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }

         BlockPos var3 = new BlockPos(this.field22041, this.field22042, this.field22043);
         double var4 = Math.max(
            this.field22037
               .getBlockState(var3)
               .method23414(this.field22037, var3)
               .method19522(Class113.field414, this.field22041 - (double)var3.getX(), this.field22043 - (double)var3.getZ()),
            (double)this.field22037.getFluidState(var3).method23475(this.field22037, var3)
         );
         if (var4 > 0.0 && this.field22042 < (double)var3.getY() + var4) {
            this.method14518();
         }
      } else {
         this.method14518();
      }
   }
}
