package mapped;

import net.minecraft.network.play.client.CUpdateMinecartCommandBlockPacket;

public class Class1327 extends Class1325 {
   private static String[] field7024;
   private final CommandBlockLogic field7025;

   public Class1327(CommandBlockLogic var1) {
      this.field7025 = var1;
   }

   @Override
   public CommandBlockLogic method6304() {
      return this.field7025;
   }

   @Override
   public int method6305() {
      return 150;
   }

   @Override
   public void init() {
      super.init();
      this.field7015 = this.method6304().method3571();
      this.method6306();
      this.field7010.method5635(this.method6304().method3563());
   }

   @Override
   public void method6308(CommandBlockLogic var1) {
      if (var1 instanceof Class912) {
         Class912 var4 = (Class912)var1;
         this.mc.getConnection().sendPacket(new CUpdateMinecartCommandBlockPacket(var4.method3577().getEntityId(), this.field7010.getText(), var1.method3571()));
      }
   }
}
