package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

public final class Class8858 implements ProfileLookupCallback {
   public final MinecraftServer field40045;
   public final List field40046;

   public Class8858(MinecraftServer var1, List var2) {
      this.field40045 = var1;
      this.field40046 = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field40045.getPlayerProfileCache().method31790(var1);
      this.field40046.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      PreYggdrasilConverter.method33743().warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
   }
}
