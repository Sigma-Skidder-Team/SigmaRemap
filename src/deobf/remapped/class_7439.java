package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7439 extends Thread {
   public class_7439(class_3194 var1, String var2, String var3) {
      super(var2);
      this.field_37921 = var1;
      this.field_37922 = var3;
   }

   @Override
   public void run() {
      GameProfile var3 = class_3194.method_14699(this.field_37921);

      try {
         class_3194.method_14701(
            this.field_37921,
            class_3194.method_14704(this.field_37921)
               .method_1639()
               .hasJoinedServer(new GameProfile((UUID)null, var3.getName()), this.field_37922, this.method_33837())
         );
         if (class_3194.method_14699(this.field_37921) != null) {
            class_3194.method_14698()
               .info("UUID of player {} is {}", class_3194.method_14699(this.field_37921).getName(), class_3194.method_14699(this.field_37921).getId());
            class_3194.method_14695(this.field_37921, class_8527.field_43636);
         } else if (class_3194.method_14704(this.field_37921).method_1689()) {
            class_3194.method_14698().warn("Failed to verify username but will let them in anyway!");
            class_3194.method_14701(this.field_37921, this.field_37921.method_14694(var3));
            class_3194.method_14695(this.field_37921, class_8527.field_43636);
         } else {
            this.field_37921.method_14703(new TranslationTextComponent("multiplayer.disconnect.unverified_username"));
            class_3194.method_14698().error("Username '{}' tried to join with an invalid session", var3.getName());
         }
      } catch (AuthenticationUnavailableException var5) {
         if (class_3194.method_14704(this.field_37921).method_1689()) {
            class_3194.method_14698().warn("Authentication servers are down but will let them in anyway!");
            class_3194.method_14701(this.field_37921, this.field_37921.method_14694(var3));
            class_3194.method_14695(this.field_37921, class_8527.field_43636);
         } else {
            this.field_37921.method_14703(new TranslationTextComponent("multiplayer.disconnect.authservers_down"));
            class_3194.method_14698().error("Couldn't verify username because servers are unavailable");
         }
      }
   }

   @Nullable
   private InetAddress method_33837() {
      SocketAddress var3 = this.field_37921.field_15951.method_23494();
      return class_3194.method_14704(this.field_37921).method_1688() && var3 instanceof InetSocketAddress ? ((InetSocketAddress)var3).getAddress() : null;
   }
}
