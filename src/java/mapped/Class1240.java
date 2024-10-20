package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1240 extends Button {
   public final RealmsMainScreen field6590;

   public Class1240(RealmsMainScreen var1) {
      super(var1.width - 37, 6, 20, 20, new TranslationTextComponent("mco.selectServer.info"), null);
      this.field6590 = var1;
      this.onPress = var1x -> RealmsMainScreen.method2111(this.field6590, !RealmsMainScreen.method2112(this.field6590));
   }

   @Override
   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      RealmsMainScreen.method2110(this.field6590, var1, var2, var3, this.x, this.y, this.isHovered());
   }
}
