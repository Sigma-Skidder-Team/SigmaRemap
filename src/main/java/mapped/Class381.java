package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.ProtocolType;
import net.minecraft.util.text.TranslationTextComponent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class381 extends Thread {
   public final String field1639;
   public final int field1640;
   public final ConnectingScreen field1641;

   public Class381(ConnectingScreen var1, String var2, String var3, int var4) {
      super(var2);
      this.field1641 = var1;
      this.field1639 = var3;
      this.field1640 = var4;
   }

   @Override
   public void run() {
      InetAddress var3 = null;

      try {
         if (ConnectingScreen.method6222(this.field1641)) {
            return;
         }

         var3 = InetAddress.getByName(this.field1639);
         ConnectingScreen.method6223(this.field1641, NetworkManager.createNetworkManagerAndConnect(var3, this.field1640, this.field1641.mc.gameSettings.method37154()));
         ConnectingScreen.method6224(this.field1641)
            .setNetHandler(
               new ClientLoginNetHandler(
                  ConnectingScreen.method6224(this.field1641),
                  this.field1641.mc,
                  ConnectingScreen.method6225(this.field1641),
                  var1 -> ConnectingScreen.method6227(this.field1641, var1)
               )
            );
         ConnectingScreen.method6224(this.field1641).sendPacket(new CHandshakePacket(this.field1639, this.field1640, ProtocolType.LOGIN));
         ConnectingScreen.method6224(this.field1641).sendPacket(new CLoginStartPacket(this.field1641.mc.getSession().getProfile()));
      } catch (UnknownHostException var6) {
         if (ConnectingScreen.method6222(this.field1641)) {
            return;
         }

         ConnectingScreen.method6226().error("Couldn't connect to server", var6);
         this.field1641
            .mc
            .execute(
               () -> this.field1641
                     .mc
                     .displayGuiScreen(
                        new Class832(
                           ConnectingScreen.method6225(this.field1641), DialogTexts.field30664, new TranslationTextComponent("disconnect.genericReason", "Unknown host")
                        )
                     )
            );
      } catch (Exception var7) {
         if (ConnectingScreen.method6222(this.field1641)) {
            return;
         }

         ConnectingScreen.method6226().error("Couldn't connect to server", var7);
         String var5 = var3 == null ? var7.toString() : var7.toString().replaceAll(var3 + ":" + this.field1640, "");
         this.field1641
            .mc
            .execute(
               () -> this.field1641
                     .mc
                     .displayGuiScreen(
                        new Class832(ConnectingScreen.method6225(this.field1641), DialogTexts.field30664, new TranslationTextComponent("disconnect.genericReason", var5))
                     )
            );
      }
   }
}
