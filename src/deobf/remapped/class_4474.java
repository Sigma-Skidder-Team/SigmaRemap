package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

public final class class_4474 implements ProfileLookupCallback {
   public class_4474(class_341 var1, class_5686 var2) {
      this.field_21805 = var1;
      this.field_21804 = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_21805.method_1647().method_27258(var1);
      this.field_21804.method_19928(new class_5090(var1));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      class_6860.method_31465().warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class_8811("Could not request user " + var1.getName() + " from backend systems", var2, null);
      }
   }
}
