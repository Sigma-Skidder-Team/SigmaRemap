package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4606 extends Class4566 {
   private static String[] field22112;
   private final Class8975 field22113;

   public Class4606(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22113 = var14;
      this.field22044 *= 0.3F;
      this.field22045 = Math.random() * 0.2F + 0.1F;
      this.field22046 *= 0.3F;
      this.method14519(0.01F, 0.01F);
      this.field22056 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.method14508(var14);
      this.field22057 = 0.0F;
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
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
      int var3 = 60 - this.field22056;
      if (this.field22056-- > 0) {
         this.field22045 = this.field22045 - (double)this.field22057;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.98F;
         this.field22045 *= 0.98F;
         this.field22046 *= 0.98F;
         float var4 = (float)var3 * 0.001F;
         this.method14519(var4, var4);
         this.method14502(this.field22113.method32937(var3 % 4, 4));
      } else {
         this.method14518();
      }
   }
}
