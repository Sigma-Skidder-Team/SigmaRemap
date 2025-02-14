package mapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class Class4531 extends Class4529<GameProfile, Class6791> {
   private static String[] field21846;

   public Class4531(File var1) {
      super(var1);
   }

   @Override
   public Class6789<GameProfile> method14430(JsonObject var1) {
      return new Class6791(var1);
   }

   public boolean method14448(GameProfile var1) {
      return this.method14441(var1);
   }

   @Override
   public String[] method14432() {
      String[] var3 = new String[this.method14443().size()];
      int var4 = 0;

      for (Class6789 var6 : this.method14443()) {
         var3[var4++] = ((GameProfile)var6.method20686()).getName();
      }

      return var3;
   }

   public String method14434(GameProfile var1) {
      return var1.getId().toString();
   }
}
