package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.awt.Color;

public class Class4264 extends Class4247 {
   private static String[] field20602;
   private float field20679;
   public boolean field20680 = false;

   public Class4264(Class4305 var1, String var2, int var3, int var4, int var5, int var6, float var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20679 = var7;
   }

   @Override
   public void method13028(int var1, int var2) {
      int var5 = this.method13309() - this.method13271();
      if (this.field20680) {
         this.method13097((float)var5 / (float)this.method13267());
      }

      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      for (int var4 = 0; var4 < this.field20897; var4++) {
         float var5 = (float)var4 / (float)this.field20897;
         Class3192.method11424(
            (float)(this.field20895 + var4),
            (float)this.field20896,
            1.0F,
            (float)this.field20898,
            Class5628.method17688(Color.HSBtoRGB(var5, 1.0F, 1.0F), var1)
         );
      }

      Class3192.method11428(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + this.method13269()),
         Class5628.method17688(Class1979.field12899.field12910, 0.5F * var1)
      );
      Class4252.method13052(
         this.field20895 + Math.round((float)this.field20897 * this.field20679) + 1, this.field20896 + 4, Color.HSBtoRGB(this.field20679, 1.0F, 1.0F), var1
      );
      super.method13027(var1);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      this.field20680 = true;
      return super.method13078(var1, var2, var3);
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      this.field20680 = false;
   }

   public float method13096() {
      return this.field20679;
   }

   public void method13097(float var1) {
      this.method13098(var1, true);
   }

   public void method13098(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field20679;
      this.field20679 = var1;
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }
}
