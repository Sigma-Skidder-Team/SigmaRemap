package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

public final class class_6136 implements ProfileLookupCallback {
   public class_6136(class_341 var1, List var2) {
      this.field_31482 = var1;
      this.field_31483 = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_31482.method_1647().method_27258(var1);
      this.field_31483.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      class_6860.method_31465().warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
   }
}
