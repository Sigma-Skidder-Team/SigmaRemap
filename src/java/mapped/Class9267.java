package mapped;

import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9267 {
   private static final Logger field42630 = LogManager.getLogger();
   private final Screen field42631;
   private volatile boolean field42632;
   private NetworkManager field42633;

   public Class9267(Screen var1) {
      this.field42631 = var1;
   }

   public void method34896(RealmsServer var1, String var2, int var3) {
      Minecraft var6 = Minecraft.getInstance();
      var6.setConnectedToRealms(true);
      Class9229.method34711(I18n.format("mco.connect.success"));
      new Class358(this, "Realms-connect-task", var2, var3, var6, var1).start();
   }

   public void method34897() {
      this.field42632 = true;
      if (this.field42633 != null && this.field42633.isChannelOpen()) {
         this.field42633.method30701(new TranslationTextComponent("disconnect.genericReason"));
         this.field42633.handleDisconnection();
      }
   }

   public void method34898() {
      if (this.field42633 != null) {
         if (!this.field42633.isChannelOpen()) {
            this.field42633.handleDisconnection();
         } else {
            this.field42633.tick();
         }
      }
   }

   // $VF: synthetic method
   public static boolean method34899(Class9267 var0) {
      return var0.field42632;
   }

   // $VF: synthetic method
   public static NetworkManager method34900(Class9267 var0, NetworkManager var1) {
      return var0.field42633 = var1;
   }

   // $VF: synthetic method
   public static NetworkManager method34901(Class9267 var0) {
      return var0.field42633;
   }

   // $VF: synthetic method
   public static Screen method34902(Class9267 var0) {
      return var0.field42631;
   }

   // $VF: synthetic method
   public static Logger method34903() {
      return field42630;
   }
}
