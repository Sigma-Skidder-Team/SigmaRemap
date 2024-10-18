package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4579 extends Class4566 {
   private static String[] field22023;
   private final Class8975 field22024;

   public Class4579(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6);
      this.field22024 = var14;
      this.field22056 = 4;
      this.field22057 = 0.008F;
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.method14508(var14);
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.field22045 = this.field22045 - (double)this.field22057;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.method14508(this.field22024);
      } else {
         this.method14518();
      }
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }
}
