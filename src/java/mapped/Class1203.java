package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.BeaconScreen;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.network.play.client.CUpdateBeaconPacket;

public class Class1203 extends Class1202 {
   private static String[] field6502;
   public final BeaconScreen field6503;

   public Class1203(BeaconScreen var1, int var2, int var3) {
      super(var2, var3, 90, 220);
      this.field6503 = var1;
   }

   @Override
   public void onPress() {
      BeaconScreen.method2710(this.field6503)
         .getConnection()
         .sendPacket(new CUpdateBeaconPacket(Effect.getId(BeaconScreen.method2708(this.field6503)), Effect.getId(BeaconScreen.method2709(this.field6503))));
      BeaconScreen.method2712(this.field6503).player.connection.sendPacket(new CCloseWindowPacket(BeaconScreen.method2711(this.field6503).player.openContainer.windowId));
      BeaconScreen.method2713(this.field6503).displayGuiScreen((Screen)null);
   }

   @Override
   public void renderToolTip(MatrixStack var1, int var2, int var3) {
      this.field6503.method2459(var1, DialogTexts.field30658, var2, var3);
   }
}
