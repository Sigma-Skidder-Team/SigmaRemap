package mapped;

import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;

public class Class4239 extends ButtonPanel implements Class4238 {
   private static String[] field20580;
   public float field20581;
   public boolean field20582 = false;

   public Class4239(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, TrueTypeFont var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public Class4239(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class4239(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public Class4239(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
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
      int var5 = (int)((float)this.getWidthA() * this.field20581);
      int var6 = (int)((float)this.getHeightA() * this.field20581);
      int var7 = this.getXA() - (var5 - this.getWidthA()) / 2;
      int var8 = this.getYA() - (var6 - this.getHeightA()) / 2;
      RenderUtil.drawPortalBackground(
         this.method13271() + var7 - this.xA,
         this.method13272() + var8 - this.yA,
         this.method13271() + var7 - this.xA + var5,
         this.method13272() + var8 - this.yA + var6
      );
      RenderUtil.drawRect(
         (float)var7,
         (float)var8,
         (float)(var7 + var5),
         (float)(var8 + var6),
         MultiUtilities.applyAlpha(MultiUtilities.method17690(this.textColor.method19405(), this.textColor.method19403(), 1.0F - var4), var1)
      );
      if (this.getTypedText() != null) {
         RenderUtil.method11440(
            this.getFont(),
            (float)(var7 + var5 / 2),
            (float)(var8 + var6 / 2),
            this.getTypedText(),
            MultiUtilities.applyAlpha(this.textColor.getTextColor(), var1),
            this.textColor.method19411(),
            this.textColor.method19413()
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
