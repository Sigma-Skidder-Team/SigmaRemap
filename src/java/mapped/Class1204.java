package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.BeaconScreen;
import net.minecraft.network.play.client.CCloseWindowPacket;

public class Class1204 extends Class1202 {
   private static String[] field6504;
   public final BeaconScreen field6505;

   public Class1204(BeaconScreen var1, int var2, int var3) {
      super(var2, var3, 112, 220);
      this.field6505 = var1;
   }

   @Override
   public void method5759() {
      BeaconScreen.method2706(this.field6505).player.connection.sendPacket(new CCloseWindowPacket(BeaconScreen.method2705(this.field6505).player.openContainer.windowId));
      BeaconScreen.method2707(this.field6505).displayGuiScreen((Screen)null);
   }

   @Override
   public void method5738(MatrixStack var1, int var2, int var3) {
      this.field6505.method2459(var1, DialogTexts.GUI_CANCEL, var2, var3);
   }
}
