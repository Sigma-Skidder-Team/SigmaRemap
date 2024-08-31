package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;

public class Class1203 extends Class1202 {
   private static String[] field6502;
   public final Class872 field6503;

   public Class1203(Class872 var1, int var2, int var3) {
      super(var2, var3, 90, 220);
      this.field6503 = var1;
   }

   @Override
   public void method5759() {
      Class872.method2710(this.field6503)
         .getConnection()
         .sendPacket(new Class5597(Effect.method22288(Class872.method2708(this.field6503)), Effect.method22288(Class872.method2709(this.field6503))));
      Class872.method2712(this.field6503).player.connection.sendPacket(new Class5482(Class872.method2711(this.field6503).player.field4905.field25471));
      Class872.method2713(this.field6503).displayGuiScreen((Screen)null);
   }

   @Override
   public void method5738(MatrixStack var1, int var2, int var3) {
      this.field6503.method2459(var1, DialogTexts.field30658, var2, var3);
   }
}
