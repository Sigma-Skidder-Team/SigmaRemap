package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class Class4239 extends Class4240 implements Class4238 {
   private static String[] field20580;
   public float field20581;
   public boolean field20582 = false;

   public Class4239(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public Class4239(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class4239(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public Class4239(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20582 = this.method13298();
      this.field20581 = this.field20581 + (!this.field20582 ? -1.0F * this.method13033() : this.method13033());
      this.field20581 = Math.min(Math.max(1.0F, this.field20581), this.method13032());
   }

   @Override
   public void draw(float var1) {
      float var4 = !this.isHovered() ? 0.3F : (!this.field20582 ? (!this.method13212() ? Math.max(var1 * this.field20584, 0.0F) : 1.5F) : 0.0F);
      int var5 = (int)((float)this.method13267() * this.field20581);
      int var6 = (int)((float)this.method13269() * this.field20581);
      int var7 = this.method13263() - (var5 - this.method13267()) / 2;
      int var8 = this.method13265() - (var6 - this.method13269()) / 2;
      RenderUtil.drawPortalBackground(
         this.method13271() + var7 - this.field20895,
         this.method13272() + var8 - this.field20896,
         this.method13271() + var7 - this.field20895 + var5,
         this.method13272() + var8 - this.field20896 + var6
      );
      RenderUtil.method11426(
         (float)var7,
         (float)var8,
         (float)(var7 + var5),
         (float)(var8 + var6),
         ColorUtils.applyAlpha(ColorUtils.method17690(this.field20914.method19405(), this.field20914.method19403(), 1.0F - var4), var1)
      );
      if (this.method13303() != null) {
         RenderUtil.method11440(
            this.method13305(),
            (float)(var7 + var5 / 2),
            (float)(var8 + var6 / 2),
            this.method13303(),
            ColorUtils.applyAlpha(this.field20914.method19409(), var1),
            this.field20914.method19411(),
            this.field20914.method19413()
         );
      }

      RenderUtil.endScissor();
      super.method13226(var1);
   }

   @Override
   public float method13032() {
      return 1.3F;
   }

   @Override
   public float method13033() {
      return 0.05F;
   }
}
