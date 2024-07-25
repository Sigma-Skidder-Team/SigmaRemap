package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

public final class class_4186 implements ProfileLookupCallback {
   public class_4186(class_4497 var1, File var2, File var3, File var4, String[] var5) {
      this.field_20376 = var1;
      this.field_20374 = var2;
      this.field_20375 = var3;
      this.field_20373 = var4;
      this.field_20372 = var5;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_20376.method_1647().method_27258(var1);
      UUID var4 = var1.getId();
      if (var4 != null) {
         this.method_19468(this.field_20374, this.method_19469(var1), var4.toString());
      } else {
         throw new class_8811("Missing UUID for user profile " + var1.getName(), null);
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      class_6860.method_31465().warn("Could not lookup user uuid for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class_8811("Could not request user " + var1.getName() + " from backend systems", var2, null);
      } else {
         String var5 = this.method_19469(var1);
         this.method_19468(this.field_20375, var5, var5);
      }
   }

   private void method_19468(File var1, String var2, String var3) {
      File var6 = new File(this.field_20373, var2 + ".dat");
      File var7 = new File(var1, var3 + ".dat");
      class_6860.method_31458(var1);
      if (!var6.renameTo(var7)) {
         throw new class_8811("Could not convert file for " + var2, null);
      }
   }

   private String method_19469(GameProfile var1) {
      String var4 = null;

      for (String var8 : this.field_20372) {
         if (var8 != null && var8.equalsIgnoreCase(var1.getName())) {
            var4 = var8;
            break;
         }
      }

      if (var4 != null) {
         return var4;
      } else {
         throw new class_8811("Could not find the filename for " + var1.getName() + " anymore", null);
      }
   }
}
