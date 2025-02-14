package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public final class Class9351 implements ProfileLookupCallback {
   public final MinecraftServer field43403;
   public final Map field43404;
   public final Class4528 field43405;

   public Class9351(MinecraftServer var1, Map var2, Class4528 var3) {
      this.field43403 = var1;
      this.field43404 = var2;
      this.field43405 = var3;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field43403.getPlayerProfileCache().method31790(var1);
      String[] var4 = (String[])this.field43404.get(var1.getName().toLowerCase(Locale.ROOT));
      if (var4 != null) {
         Date var5 = var4.length <= 1 ? null : PreYggdrasilConverter.method33744(var4[1], (Date)null);
         String var6 = var4.length <= 2 ? null : var4[2];
         Date var7 = var4.length <= 3 ? null : PreYggdrasilConverter.method33744(var4[3], (Date)null);
         String var8 = var4.length <= 4 ? null : var4[4];
         this.field43405.method14436(new Class6786(var1, var5, var6, var7, var8));
      } else {
         PreYggdrasilConverter.method33743().warn("Could not convert user banlist entry for {}", var1.getName());
         throw new Class2502("Profile not in the conversionlist", null);
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      PreYggdrasilConverter.method33743().warn("Could not lookup user banlist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new Class2502("Could not request user " + var1.getName() + " from backend systems", var2, null);
      }
   }
}
