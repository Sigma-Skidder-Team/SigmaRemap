package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

public final class class_7227 implements ProfileLookupCallback {
   public class_7227(class_341 var1, class_8053 var2) {
      this.field_37086 = var1;
      this.field_37088 = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_37086.method_1647().method_27258(var1);
      this.field_37088.method_19928(new class_3791(var1, this.field_37086.method_1675(), false));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      class_6860.method_31465().warn("Could not lookup oplist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class_8811("Could not request user " + var1.getName() + " from backend systems", var2, null);
      }
   }
}
