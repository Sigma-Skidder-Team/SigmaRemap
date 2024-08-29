package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

public final class Class8301 implements ProfileLookupCallback {
   public final DedicatedServer field35688;
   public final File field35689;
   public final File field35690;
   public final File field35691;
   public final String[] field35692;

   public Class8301(DedicatedServer var1, File var2, File var3, File var4, String[] var5) {
      this.field35688 = var1;
      this.field35689 = var2;
      this.field35690 = var3;
      this.field35691 = var4;
      this.field35692 = var5;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field35688.method1386().method31790(var1);
      UUID var4 = var1.getId();
      if (var4 != null) {
         this.method29028(this.field35689, this.method29029(var1), var4.toString());
      } else {
         throw new Class2502("Missing UUID for user profile " + var1.getName(), null);
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      Class9061.method33743().warn("Could not lookup user uuid for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new Class2502("Could not request user " + var1.getName() + " from backend systems", var2, null);
      } else {
         String var5 = this.method29029(var1);
         this.method29028(this.field35690, var5, var5);
      }
   }

   private void method29028(File var1, String var2, String var3) {
      File var6 = new File(this.field35691, var2 + ".dat");
      File var7 = new File(var1, var3 + ".dat");
      Class9061.method33745(var1);
      if (!var6.renameTo(var7)) {
         throw new Class2502("Could not convert file for " + var2, null);
      }
   }

   private String method29029(GameProfile var1) {
      String var4 = null;

      for (String var8 : this.field35692) {
         if (var8 != null && var8.equalsIgnoreCase(var1.getName())) {
            var4 = var8;
            break;
         }
      }

      if (var4 != null) {
         return var4;
      } else {
         throw new Class2502("Could not find the filename for " + var1.getName() + " anymore", null);
      }
   }
}
