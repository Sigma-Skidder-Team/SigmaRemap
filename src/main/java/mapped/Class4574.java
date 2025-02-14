package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4574 extends Class4573 {
   private static String[] field22013;

   public Class4574(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field22035 = (float)((double)this.field22035 * 1.5);
      this.field22056 = (int)(Math.random() * 2.0) + 60;
   }

   @Override
   public float method14509(float var1) {
      float var4 = 1.0F - ((float)this.field22055 + var1) / ((float)this.field22056 * 1.5F);
      return this.field22035 * var4;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         float var3 = (float)this.field22055 / (float)this.field22056;
         this.field22041 = this.field22041 + this.field22044 * (double)var3;
         this.field22042 = this.field22042 + this.field22045 * (double)var3;
         this.field22043 = this.field22043 + this.field22046 * (double)var3;
      } else {
         this.method14518();
      }
   }
}
