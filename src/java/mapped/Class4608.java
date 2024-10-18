package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4608 extends Class4566 {
   private static String[] field22115;

   public Class4608(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, boolean var14) {
      super(var1, var2, var4, var6);
      this.method14512(3.0F);
      this.method14519(0.25F, 0.25F);
      if (!var14) {
         this.field22056 = this.field22054.nextInt(50) + 80;
      } else {
         this.field22056 = this.field22054.nextInt(50) + 280;
      }

      this.field22057 = 3.0E-6F;
      this.field22044 = var8;
      this.field22045 = var10 + (double)(this.field22054.nextFloat() / 500.0F);
      this.field22046 = var12;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056 && !(this.field22061 <= 0.0F)) {
         this.field22044 = this.field22044 + (double)(this.field22054.nextFloat() / 5000.0F * (float)(!this.field22054.nextBoolean() ? -1 : 1));
         this.field22046 = this.field22046 + (double)(this.field22054.nextFloat() / 5000.0F * (float)(!this.field22054.nextBoolean() ? -1 : 1));
         this.field22045 = this.field22045 - (double)this.field22057;
         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22055 >= this.field22056 - 60 && this.field22061 > 0.01F) {
            this.field22061 -= 0.015F;
         }
      } else {
         this.method14518();
      }
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29736;
   }
}
