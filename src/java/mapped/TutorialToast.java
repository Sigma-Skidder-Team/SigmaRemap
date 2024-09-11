package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.ITextComponent;

public class TutorialToast implements Class7601 {
   private static String[] field32621;
   private final Icons field32622;
   private final ITextComponent field32623;
   private final ITextComponent field32624;
   private Class2139 field32625 = Class2139.field14003;
   private long field32626;
   private float field32627;
   private float field32628;
   private final boolean field32629;

   public TutorialToast(Icons var1, ITextComponent var2, ITextComponent var3, boolean var4) {
      this.field32622 = var1;
      this.field32623 = var2;
      this.field32624 = var3;
      this.field32629 = var4;
   }

   @Override
   public Class2139 method24894(MatrixStack var1, ToastGui var2, long var3) {
      var2.method5915().getTextureManager().bindTexture(field32630);
      RenderSystem.method27890(1.0F, 1.0F, 1.0F);
      var2.blit(var1, 0, 0, 0, 96, this.method24898(), this.method24899());
      this.field32622.method8813(var1, var2, 6, 6);
      if (this.field32624 != null) {
         var2.method5915().fontRenderer.func_243248_b(var1, this.field32623, 30.0F, 7.0F, -11534256);
         var2.method5915().fontRenderer.func_243248_b(var1, this.field32624, 30.0F, 18.0F, -16777216);
      } else {
         var2.method5915().fontRenderer.func_243248_b(var1, this.field32623, 30.0F, 12.0F, -11534256);
      }

      if (this.field32629) {
         AbstractGui.method5686(var1, 3, 28, 157, 29, -1);
         float var7 = (float) MathHelper.method37779((double)this.field32627, (double)this.field32628, (double)((float)(var3 - this.field32626) / 100.0F));
         int var8;
         if (!(this.field32628 >= this.field32627)) {
            var8 = -11206656;
         } else {
            var8 = -16755456;
         }

         AbstractGui.method5686(var1, 3, 28, (int)(3.0F + 154.0F * var7), 29, var8);
         this.field32627 = var7;
         this.field32626 = var3;
      }

      return this.field32625;
   }

   public void method24895() {
      this.field32625 = Class2139.field14004;
   }

   public void method24896(float var1) {
      this.field32628 = var1;
   }

    public enum Icons {
       field13895(0, 0),
       field13896(1, 0),
       field13897(2, 0),
       field13898(0, 1),
       field13899(1, 1),
       SOCIAL_INTERACTIONS(2, 1);

       private final int field13901;
       private final int field13902;
       private static final Icons[] field13903 = new Icons[]{field13895, field13896, field13897, field13898, field13899, SOCIAL_INTERACTIONS};

       private Icons(int var3, int var4) {
          this.field13901 = var3;
          this.field13902 = var4;
       }

       public void method8813(MatrixStack var1, AbstractGui var2, int var3, int var4) {
          RenderSystem.enableBlend();
          var2.blit(var1, var3, var4, 176 + this.field13901 * 20, this.field13902 * 20, 20, 20);
          RenderSystem.enableBlend();
       }
    }
}
