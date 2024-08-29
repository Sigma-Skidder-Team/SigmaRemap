package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4291 extends Class4278 {
   private static String[] field20736;
   private Texture field20792;

   public Class4291(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20792 = var7;
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11449(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         this.field20792,
         Class5628.method17690(
            ClientColors.DEEP_TEAL.getColor, ClientColors.LIGHT_GREYISH_BLUE.getColor, !this.method13298() ? 0.0F : (!this.method13212() ? 0.15F : 0.3F)
         )
      );
      super.method13027(var1);
   }
}
