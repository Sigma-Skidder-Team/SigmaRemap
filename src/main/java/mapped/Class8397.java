package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

public final class Class8397 implements ProfileLookupCallback {
   public final MinecraftServer field36034;
   public final Class4531 field36035;

   public Class8397(MinecraftServer var1, Class4531 var2) {
      this.field36034 = var1;
      this.field36035 = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field36034.getPlayerProfileCache().method31790(var1);
      this.field36035.method14436(new Class6791(var1));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      PreYggdrasilConverter.method33743().warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new Class2502("Could not request user " + var1.getName() + " from backend systems", var2, null);
      }
   }
}
