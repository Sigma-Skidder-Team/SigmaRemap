package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1222 extends Class1206 {
   public final Class806 field6566;

   public Class1222(Class806 var1) {
      super(Class806.method2104(var1) + 4, Class806.method2105(var1) + 4, 12, 12, new TranslationTextComponent("mco.selectServer.close"), null);
      this.field6566 = var1;
      this.field6513 = var1x -> Class806.method2109(this.field6566);
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Class806.method2107(this.field6566).getTextureManager().bindTexture(Class806.method2106());
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = !this.method5737() ? 0.0F : 12.0F;
      method5699(var1, this.field6477, this.field6478, 0.0F, var7, 12, 12, 12, 24);
      if (this.method2485((double)var2, (double)var3)) {
         Class806.method2108(this.field6566, new ITextComponent[]{this.method5745()});
      }
   }
}
