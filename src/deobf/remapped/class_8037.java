package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public final class class_8037 implements ProfileLookupCallback {
   public class_8037(class_341 var1, Map var2, class_161 var3) {
      this.field_41127 = var1;
      this.field_41124 = var2;
      this.field_41126 = var3;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_41127.method_1647().method_27258(var1);
      String[] var4 = (String[])this.field_41124.get(var1.getName().toLowerCase(Locale.ROOT));
      if (var4 != null) {
         Date var5 = var4.length <= 1 ? null : class_6860.method_31473(var4[1], (Date)null);
         String var6 = var4.length <= 2 ? null : var4[2];
         Date var7 = var4.length <= 3 ? null : class_6860.method_31473(var4[3], (Date)null);
         String var8 = var4.length <= 4 ? null : var4[4];
         this.field_41126.method_19928(new class_937(var1, var5, var6, var7, var8));
      } else {
         class_6860.method_31465().warn("Could not convert user banlist entry for {}", var1.getName());
         throw new class_8811("Profile not in the conversionlist", null);
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      class_6860.method_31465().warn("Could not lookup user banlist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class_8811("Could not request user " + var1.getName() + " from backend systems", var2, null);
      }
   }
}
