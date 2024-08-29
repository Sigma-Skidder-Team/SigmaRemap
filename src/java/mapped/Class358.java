package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.TranslationTextComponent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class358 extends Thread {
   public final String field1586;
   public final int field1587;
   public final Minecraft field1588;
   public final Class6128 field1589;
   public final Class9267 field1590;

   public Class358(Class9267 var1, String var2, String var3, int var4, Minecraft var5, Class6128 var6) {
      super(var2);
      this.field1590 = var1;
      this.field1586 = var3;
      this.field1587 = var4;
      this.field1588 = var5;
      this.field1589 = var6;
   }

   @Override
   public void run() {
      InetAddress var3 = null;

      try {
         var3 = InetAddress.getByName(this.field1586);
         if (Class9267.method34899(this.field1590)) {
            return;
         }

         Class9267.method34900(this.field1590, NetworkManager.method30703(var3, this.field1587, this.field1588.gameSettings.method37154()));
         if (Class9267.method34899(this.field1590)) {
            return;
         }

         Class9267.method34901(this.field1590)
            .setNetHandler(new ClientLoginNetHandler(Class9267.method34901(this.field1590), this.field1588, Class9267.method34902(this.field1590), var0 -> {
            }));
         if (Class9267.method34899(this.field1590)) {
            return;
         }

         Class9267.method34901(this.field1590).sendPacket(new CHandshakePacket(this.field1586, this.field1587, ProtocolType.LOGIN));
         if (Class9267.method34899(this.field1590)) {
            return;
         }

         Class9267.method34901(this.field1590).sendPacket(new CLoginStartPacket(this.field1588.getSession().getProfile()));
         this.field1588.setServerData(this.field1589.method18922(this.field1586));
      } catch (UnknownHostException var7) {
         this.field1588.getPackFinder().clearResourcePack();
         if (Class9267.method34899(this.field1590)) {
            return;
         }

         Class9267.method34903().error("Couldn't connect to world", var7);
         Class801 var9 = new Class801(
            Class9267.method34902(this.field1590),
            DialogTexts.field30664,
            new TranslationTextComponent("disconnect.genericReason", "Unknown host '" + this.field1586 + "'")
         );
         this.field1588.execute(() -> field1588.displayGuiScreen(var9));
      } catch (Exception var8) {
         this.field1588.getPackFinder().clearResourcePack();
         if (Class9267.method34899(this.field1590)) {
            return;
         }

         Class9267.method34903().error("Couldn't connect to world", var8);
         String var5 = var8.toString();
         if (var3 != null) {
            String var6 = var3 + ":" + this.field1587;
            var5 = var5.replaceAll(var6, "");
         }

         Class801 var10 = new Class801(
            Class9267.method34902(this.field1590), DialogTexts.field30664, new TranslationTextComponent("disconnect.genericReason", var5)
         );
         this.field1588.execute(() -> field1588.displayGuiScreen(var10));
      }
   }
}
