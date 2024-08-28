package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.UUID;

public class Class365 extends Thread {
   public final String field1602;
   public final Class5109 field1603;

   public Class365(Class5109 var1, String var2, String var3) {
      super(var2);
      this.field1603 = var1;
      this.field1602 = var3;
   }

   @Override
   public void run() {
      GameProfile var3 = Class5109.method15605(this.field1603);

      try {
         Class5109.method15606(
            this.field1603,
            Class5109.method15607(this.field1603).method1384().hasJoinedServer(new GameProfile((UUID)null, var3.getName()), this.field1602, this.method1831())
         );
         if (Class5109.method15605(this.field1603) != null) {
            Class5109.method15608()
               .info("UUID of player {} is {}", Class5109.method15605(this.field1603).getName(), Class5109.method15605(this.field1603).getId());
            Class5109.method15609(this.field1603, Class2241.field14666);
         } else if (Class5109.method15607(this.field1603).method1334()) {
            Class5109.method15608().warn("Failed to verify username but will let them in anyway!");
            Class5109.method15606(this.field1603, this.field1603.method15603(var3));
            Class5109.method15609(this.field1603, Class2241.field14666);
         } else {
            this.field1603.method15600(new TranslationTextComponent("multiplayer.disconnect.unverified_username"));
            Class5109.method15608().error("Username '{}' tried to join with an invalid session", var3.getName());
         }
      } catch (AuthenticationUnavailableException var5) {
         if (Class5109.method15607(this.field1603).method1334()) {
            Class5109.method15608().warn("Authentication servers are down but will let them in anyway!");
            Class5109.method15606(this.field1603, this.field1603.method15603(var3));
            Class5109.method15609(this.field1603, Class2241.field14666);
         } else {
            this.field1603.method15600(new TranslationTextComponent("multiplayer.disconnect.authservers_down"));
            Class5109.method15608().error("Couldn't verify username because servers are unavailable");
         }
      }
   }

   @Nullable
   private InetAddress method1831() {
      SocketAddress var3 = this.field1603.field23216.method30700();
      return Class5109.method15607(this.field1603).method1352() && var3 instanceof InetSocketAddress ? ((InetSocketAddress)var3).getAddress() : null;
   }
}
