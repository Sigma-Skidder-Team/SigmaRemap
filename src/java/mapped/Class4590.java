package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4590 extends Class4588 {
   private static String[] field22070;
   private int field22071;
   private final int field22072 = 8;

   public Class4590(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
   }

   @Override
   public void method14500() {
      for (int var3 = 0; var3 < 6; var3++) {
         double var4 = this.field22041 + (this.field22054.nextDouble() - this.field22054.nextDouble()) * 4.0;
         double var6 = this.field22042 + (this.field22054.nextDouble() - this.field22054.nextDouble()) * 4.0;
         double var8 = this.field22043 + (this.field22054.nextDouble() - this.field22054.nextDouble()) * 4.0;
         this.field22037.addParticle(ParticleTypes.field34070, var4, var6, var8, (double)((float)this.field22071 / 8.0F), 0.0, 0.0);
      }

      this.field22071++;
      if (this.field22071 == 8) {
         this.method14518();
      }
   }
}
