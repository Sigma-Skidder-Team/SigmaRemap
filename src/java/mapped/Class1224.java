package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.StringTextComponent;

public class Class1224 extends Button {
   private static String[] field6568;
   public final RealmsMainScreen field6569;

   public Class1224(RealmsMainScreen var1) {
      super(var1.width - 62, 6, 20, 20, StringTextComponent.EMPTY, null);
      this.field6569 = var1;
      this.field6513 = var1x -> {
         if (RealmsMainScreen.method2115(this.field6569) != null) {
            Util.getOSType().method8181(RealmsMainScreen.method2115(this.field6569));
            if (RealmsMainScreen.method2113(this.field6569)) {
               Class6113 var4 = Class8068.method27770();
               var4.field27379 = false;
               RealmsMainScreen.method2116(this.field6569, false);
               Class8068.method27771(var4);
            }
         }
      };
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      RealmsMainScreen.method2114(
         this.field6569, var1, var2, var3, RealmsMainScreen.method2113(this.field6569), this.field6477, this.field6478, this.method5737(), this.active
      );
   }
}
