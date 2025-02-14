package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class1242 extends Button {
   private static String[] field6592;
   private final ResourceLocation field6593;
   public final RealmsResetWorldScreen field6594;

   public Class1242(RealmsResetWorldScreen var1, int var2, int var3, ITextComponent var4, ResourceLocation var5, IPressable var6) {
      super(var2, var3, 60, 72, var4, var6);
      this.field6594 = var1;
      this.field6593 = var5;
   }

   @Override
   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      RealmsResetWorldScreen.method2270(
         this.field6594,
         var1,
         this.x,
         this.y,
         this.method5745(),
         this.field6593,
         this.isHovered(),
         this.isMouseOver((double)var2, (double)var3)
      );
   }
}
