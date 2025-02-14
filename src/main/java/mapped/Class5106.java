package mapped;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.ProtocolType;
import net.minecraft.network.login.server.SDisconnectLoginPacket;
import net.minecraft.network.play.ServerLoginNetHandler;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class5106 implements Class5105 {
   private static final ITextComponent field23205 = new StringTextComponent("Ignoring status request");
   private final MinecraftServer field23206;
   private final NetworkManager field23207;

   public Class5106(MinecraftServer var1, NetworkManager var2) {
      this.field23206 = var1;
      this.field23207 = var2;
   }

   @Override
   public void method15595(CHandshakePacket var1) {
      switch (Class9334.field43314[var1.method17508().ordinal()]) {
         case 1:
            this.field23207.setConnectionState(ProtocolType.LOGIN);
            if (var1.method17509() != SharedConstants.getVersion().getProtocolVersion()) {
               TranslationTextComponent var4;
               if (var1.method17509() < 754) {
                  var4 = new TranslationTextComponent("multiplayer.disconnect.outdated_client", SharedConstants.getVersion().getName());
               } else {
                  var4 = new TranslationTextComponent("multiplayer.disconnect.incompatible", SharedConstants.getVersion().getName());
               }

               this.field23207.sendPacket(new SDisconnectLoginPacket(var4));
               this.field23207.closeChannel(var4);
            } else {
               this.field23207.setNetHandler(new ServerLoginNetHandler(this.field23206, this.field23207));
            }
            break;
         case 2:
            if (this.field23206.method1381()) {
               this.field23207.setConnectionState(ProtocolType.field9903);
               this.field23207.setNetHandler(new Class5115(this.field23206, this.field23207));
            } else {
               this.field23207.closeChannel(field23205);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + var1.method17508());
      }
   }

   @Override
   public void onDisconnect(ITextComponent var1) {
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23207;
   }
}
