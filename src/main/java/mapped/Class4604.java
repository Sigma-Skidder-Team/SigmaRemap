package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4604 extends Class4601 {
   private static String[] field22111;

   public Class4604(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6, var14, -0.05F);
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.field22035 *= 0.75F;
      this.field22056 = 60 + this.field22054.nextInt(12);
      this.method14508(var14);
      if (this.field22054.nextInt(4) != 0) {
         this.method14514(0.1F + this.field22054.nextFloat() * 0.2F, 0.4F + this.field22054.nextFloat() * 0.3F, this.field22054.nextFloat() * 0.2F);
      } else {
         this.method14514(0.6F + this.field22054.nextFloat() * 0.2F, 0.6F + this.field22054.nextFloat() * 0.3F, this.field22054.nextFloat() * 0.2F);
      }

      this.method14537(0.6F);
   }
}
