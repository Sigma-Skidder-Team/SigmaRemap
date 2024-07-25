package remapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class class_8053 extends class_4290<GameProfile, class_3791> {
   private static String[] field_41227;

   public class_8053(File var1) {
      super(var1);
   }

   @Override
   public class_8227<GameProfile> method_19924(JsonObject var1) {
      return new class_3791(var1);
   }

   @Override
   public String[] method_19929() {
      String[] var3 = new String[this.method_19919().size()];
      int var4 = 0;

      for (class_8227 var6 : this.method_19919()) {
         var3[var4++] = ((GameProfile)var6.method_37661()).getName();
      }

      return var3;
   }

   public boolean method_36526(GameProfile var1) {
      class_3791 var4 = this.method_19927(var1);
      return var4 == null ? false : var4.method_17606();
   }

   public String method_36525(GameProfile var1) {
      return var1.getId().toString();
   }
}
