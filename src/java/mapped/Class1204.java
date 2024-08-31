package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;

public class Class1204 extends Class1202 {
   private static String[] field6504;
   public final Class872 field6505;

   public Class1204(Class872 var1, int var2, int var3) {
      super(var2, var3, 112, 220);
      this.field6505 = var1;
   }

   @Override
   public void method5759() {
      Class872.method2706(this.field6505).player.connection.sendPacket(new CCloseWindowPacket(Class872.method2705(this.field6505).player.field4905.field25471));
      Class872.method2707(this.field6505).displayGuiScreen((Screen)null);
   }

   @Override
   public void method5738(MatrixStack var1, int var2, int var3) {
      this.field6505.method2459(var1, DialogTexts.GUI_CANCEL, var2, var3);
   }
}
