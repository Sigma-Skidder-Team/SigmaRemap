package remapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class class_161 extends class_4290<GameProfile, class_937> {
   private static String[] field_484;

   public class_161(File var1) {
      super(var1);
   }

   @Override
   public class_8227<GameProfile> method_19924(JsonObject var1) {
      return new class_937(var1);
   }

   public boolean method_653(GameProfile var1) {
      return this.method_19933(var1);
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

   public String method_654(GameProfile var1) {
      return var1.getId().toString();
   }
}
