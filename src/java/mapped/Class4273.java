package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4273 extends Class4247 {
   private static String[] field20708;
   public float field20709;
   public String field20710;

   public Class4273(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, Class6387.field27961, var7, false);
      this.field20710 = var8;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20709 = this.field20709 + (!this.method13298() ? -0.14F : 0.14F);
      this.field20709 = Math.min(Math.max(0.0F, this.field20709), 1.0F);
   }

   @Override
   public void method13027(float var1) {
      if (this.method13303() != null) {
         this.method13225();
         int var4 = this.field20914.method19405();
         int var5 = this.method13263()
            + (
               this.field20914.method19411() != Class2218.field14492
                  ? 0
                  : (this.field20914.method19411() != Class2218.field14490 ? this.method13267() / 2 : this.method13267())
            );
         int var6 = this.method13265()
            + (
               this.field20914.method19413() != Class2218.field14492
                  ? 0
                  : (this.field20914.method19413() != Class2218.field14491 ? this.method13269() / 2 : this.method13269())
            );
         int var7 = this.method13305().method23942(this.method13303());
         byte var8 = 18;
         float var9 = this.field20709 * this.field20709 * this.field20709;
         boolean var10 = false;
         if (this.method13297()) {
            var10 = true;
         }

         if (var10) {
            Class3192.method11426(
               (float)this.field20895,
               (float)this.field20896,
               (float)(this.field20895 + this.field20897),
               (float)(this.field20896 + this.field20898),
               Class5628.method17688(-11890462, 1.0F)
            );
         }

         byte var11 = 16;
         byte var12 = 8;
         int var13 = Class1979.field12891.field12910;
         if (var10) {
            var13 = Class1979.field12896.field12910;
         }

         Class3192.method11439(
            ResourceRegistry.JelloLightFont14,
            (float)(this.field20895 + var11 + 50),
            (float)(this.field20896 + var12 + 5),
            this.field20912,
            Class5628.method17688(var13, var1)
         );
         Class3192.method11439(
            ResourceRegistry.JelloLightFont12,
            (float)(this.field20895 + var11 + 50),
            (float)(this.field20896 + var12 + 19),
            this.field20710,
            Class5628.method17688(var13, var1 * 0.5F)
         );
         super.method13027(var1);
      }
   }
}
