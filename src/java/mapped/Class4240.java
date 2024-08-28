package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4240 extends Class4247 {
   private static String[] field20583;
   public float field20584;
   private int field20585 = 0;
   public int field20586 = 0;

   public Class4240(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public Class4240(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
   }

   public Class4240(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public Class4240(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20584 = this.field20584 + (!this.method13298() ? -0.1F : 0.1F);
      this.field20584 = Math.min(Math.max(0.0F, this.field20584), 1.0F);
   }

   @Override
   public void method13027(float var1) {
      float var4 = !this.method13295() ? 0.3F : (!this.method13216() ? (!this.method13212() ? Math.max(var1 * this.field20584, 0.0F) : 1.5F) : 0.0F);
      int var5 = Class5628.method17688(
         Class5628.method17690(this.field20914.method19405(), this.field20914.method19403(), 1.0F - var4),
         (float)(this.field20914.method19405() >> 24 & 0xFF) / 255.0F * var1
      );
      int var6 = var5 >> 24 & 0xFF;
      int var7 = var5 >> 16 & 0xFF;
      int var8 = var5 >> 8 & 0xFF;
      int var9 = var5 & 0xFF;
      if (this.field20586 <= 0) {
         Class3192.method11426(
            (float)this.method13263(),
            (float)this.method13265(),
            (float)(this.method13263() + this.method13267()),
            (float)(this.method13265() + this.method13269()),
            var5
         );
      } else {
         Class3192.method11474(
            (float)this.method13263(), (float)this.method13265(), (float)this.method13267(), (float)this.method13269(), (float)this.field20586, var5
         );
      }

      int var10 = this.method13263()
         + (
            this.field20914.method19411() != Class2218.field14492
               ? 0
               : (this.field20914.method19411() != Class2218.field14490 ? this.method13267() / 2 : this.method13267())
         );
      int var11 = this.method13265()
         + (
            this.field20914.method19413() != Class2218.field14492
               ? 0
               : (this.field20914.method19413() != Class2218.field14491 ? this.method13269() / 2 : this.method13269())
         );
      if (this.method13303() != null) {
         Class3192.method11440(
            this.method13305(),
            (float)(this.field20585 + var10),
            (float)var11,
            this.method13303(),
            Class5628.method17688(this.field20914.method19409(), var1),
            this.field20914.method19411(),
            this.field20914.method19413()
         );
      }

      super.method13027(var1);
   }

   public void method13034(int var1) {
      this.field20585 = var1;
   }

   public int method13035() {
      return this.field20585;
   }
}
