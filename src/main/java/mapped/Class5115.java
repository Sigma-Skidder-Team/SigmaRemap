package mapped;

import net.minecraft.network.NetworkManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class5115 implements Class5114 {
   private static final ITextComponent field23263 = new TranslationTextComponent("multiplayer.status.request_handled");
   private final MinecraftServer field23264;
   private final NetworkManager field23265;
   private boolean field23266;

   public Class5115(MinecraftServer var1, NetworkManager var2) {
      this.field23264 = var1;
      this.field23265 = var2;
   }

   @Override
   public void onDisconnect(ITextComponent var1) {
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23265;
   }

   @Override
   public void method15691(Class5566 var1) {
      if (!this.field23266) {
         this.field23266 = true;
         this.field23265.sendPacket(new Class5552(this.field23264.method1387()));
      } else {
         this.field23265.closeChannel(field23263);
      }
   }

   @Override
   public void method15690(Class5587 var1) {
      this.field23265.sendPacket(new Class5489(var1.method17560()));
      this.field23265.closeChannel(field23263);
   }
}
