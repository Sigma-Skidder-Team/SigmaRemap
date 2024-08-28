package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

public final class Class9148 implements ProfileLookupCallback {
   public final MinecraftServer field42026;
   public final Class4530 field42027;

   public Class9148(MinecraftServer var1, Class4530 var2) {
      this.field42026 = var1;
      this.field42027 = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field42026.method1386().method31790(var1);
      this.field42027.method14436(new Class6790(var1, this.field42026.method1288(), false));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      Class9061.method33743().warn("Could not lookup oplist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new Class2502("Could not request user " + var1.getName() + " from backend systems", var2, null);
      }
   }
}
