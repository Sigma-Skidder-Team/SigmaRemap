package mapped;

import java.util.Random;

public class Class4572 extends Class4566 {
   private static String[] field22010;
   private static final Random field22011 = new Random();
   private final Class8975 field22012;

   public Class4572(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6, 0.5 - field22011.nextDouble(), var10, 0.5 - field22011.nextDouble());
      this.field22012 = var14;
      this.field22045 *= 0.2F;
      if (var8 == 0.0 && var12 == 0.0) {
         this.field22044 *= 0.1F;
         this.field22046 *= 0.1F;
      }

      this.field22035 *= 0.75F;
      this.field22056 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.field22049 = false;
      this.method14508(var14);
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29736;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22012);
         this.field22045 += 0.004;
         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22042 == this.field22039) {
            this.field22044 *= 1.1;
            this.field22046 *= 1.1;
         }

         this.field22044 *= 0.96F;
         this.field22045 *= 0.96F;
         this.field22046 *= 0.96F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
