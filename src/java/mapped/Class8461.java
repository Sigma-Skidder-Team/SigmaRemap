package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.concurrent.atomic.AtomicReference;

public final class Class8461 implements ProfileLookupCallback {
   private static String[] field36276;
   public final AtomicReference field36277;

   public Class8461(AtomicReference var1) {
      this.field36277 = var1;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field36277.set(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.field36277.set((GameProfile)null);
   }
}
