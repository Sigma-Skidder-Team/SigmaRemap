package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.concurrent.atomic.AtomicReference;

public final class class_4682 implements ProfileLookupCallback {
   private static String[] field_22812;

   public class_4682(AtomicReference var1) {
      this.field_22813 = var1;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_22813.set(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.field_22813.set((GameProfile)null);
   }
}
