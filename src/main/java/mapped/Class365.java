package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import net.minecraft.network.play.ServerLoginNetHandler;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.UUID;

public class Class365 extends Thread {
   public final String field1602;
   public final ServerLoginNetHandler field1603;

   public Class365(ServerLoginNetHandler var1, String var2, String var3) {
      super(var2);
      this.field1603 = var1;
      this.field1602 = var3;
   }

   @Override
   public void run() {
      GameProfile var3 = ServerLoginNetHandler.method15605(this.field1603);

      try {
         ServerLoginNetHandler.method15606(
            this.field1603,
            ServerLoginNetHandler.method15607(this.field1603).getMinecraftSessionService().hasJoinedServer(new GameProfile((UUID)null, var3.getName()), this.field1602, this.method1831())
         );
         if (ServerLoginNetHandler.method15605(this.field1603) != null) {
            ServerLoginNetHandler.method15608()
               .info("UUID of player {} is {}", ServerLoginNetHandler.method15605(this.field1603).getName(), ServerLoginNetHandler.method15605(this.field1603).getId());
            ServerLoginNetHandler.method15609(this.field1603, Class2241.field14666);
         } else if (ServerLoginNetHandler.method15607(this.field1603).isSinglePlayer()) {
            ServerLoginNetHandler.method15608().warn("Failed to verify username but will let them in anyway!");
            ServerLoginNetHandler.method15606(this.field1603, this.field1603.method15603(var3));
            ServerLoginNetHandler.method15609(this.field1603, Class2241.field14666);
         } else {
            this.field1603.method15600(new TranslationTextComponent("multiplayer.disconnect.unverified_username"));
            ServerLoginNetHandler.method15608().error("Username '{}' tried to join with an invalid session", var3.getName());
         }
      } catch (AuthenticationUnavailableException var5) {
         if (ServerLoginNetHandler.method15607(this.field1603).isSinglePlayer()) {
            ServerLoginNetHandler.method15608().warn("Authentication servers are down but will let them in anyway!");
            ServerLoginNetHandler.method15606(this.field1603, this.field1603.method15603(var3));
            ServerLoginNetHandler.method15609(this.field1603, Class2241.field14666);
         } else {
            this.field1603.method15600(new TranslationTextComponent("multiplayer.disconnect.authservers_down"));
            ServerLoginNetHandler.method15608().error("Couldn't verify username because servers are unavailable");
         }
      }
   }

   @Nullable
   private InetAddress method1831() {
      SocketAddress var3 = this.field1603.field23216.getRemoteAddress();
      return ServerLoginNetHandler.method15607(this.field1603).method1352() && var3 instanceof InetSocketAddress ? ((InetSocketAddress)var3).getAddress() : null;
   }
}
