package mapped;

import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class1242 extends Button {
   private static String[] field6592;
   private final ResourceLocation field6593;
   public final RealmsResetWorldScreen field6594;

   public Class1242(RealmsResetWorldScreen var1, int var2, int var3, ITextComponent var4, ResourceLocation var5, Class7192 var6) {
      super(var2, var3, 60, 72, var4, var6);
      this.field6594 = var1;
      this.field6593 = var5;
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      RealmsResetWorldScreen.method2270(
         this.field6594,
         var1,
         this.field6477,
         this.field6478,
         this.method5745(),
         this.field6593,
         this.method5737(),
         this.method2485((double)var2, (double)var3)
      );
   }
}
