package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1222 extends Button {
   public final RealmsMainScreen field6566;

   public Class1222(RealmsMainScreen var1) {
      super(RealmsMainScreen.method2104(var1) + 4, RealmsMainScreen.method2105(var1) + 4, 12, 12, new TranslationTextComponent("mco.selectServer.close"), null);
      this.field6566 = var1;
      this.field6513 = var1x -> RealmsMainScreen.method2109(this.field6566);
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      RealmsMainScreen.method2107(this.field6566).getTextureManager().bindTexture(RealmsMainScreen.method2106());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = !this.method5737() ? 0.0F : 12.0F;
      method5699(var1, this.field6477, this.field6478, 0.0F, var7, 12, 12, 12, 24);
      if (this.isMouseOver((double)var2, (double)var3)) {
         RealmsMainScreen.method2108(this.field6566, new ITextComponent[]{this.method5745()});
      }
   }
}
