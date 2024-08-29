package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4344 extends Class4339 {
   private static String[] field21228;

   public Class4344(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         Class5628.method17688(ClientColors.MID_GREY.getColor, 0.35F)
      );
      Class3192.method11429(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         2,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.14F)
      );
      super.method13027(var1);
   }
}
