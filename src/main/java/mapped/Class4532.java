package mapped;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class Class4532 extends Class4529<String, Class6788> {
   public Class4532(File var1) {
      super(var1);
   }

   @Override
   public Class6789<String> method14430(JsonObject var1) {
      return new Class6788(var1);
   }

   public boolean method14449(SocketAddress var1) {
      String var4 = this.method14452(var1);
      return this.method14441(var4);
   }

   public boolean method14450(String var1) {
      return this.method14441(var1);
   }

   public Class6788 method14451(SocketAddress var1) {
      String var4 = this.method14452(var1);
      return this.method14437(var4);
   }

   private String method14452(SocketAddress var1) {
      String var4 = var1.toString();
      if (var4.contains("/")) {
         var4 = var4.substring(var4.indexOf(47) + 1);
      }

      if (var4.contains(":")) {
         var4 = var4.substring(0, var4.indexOf(58));
      }

      return var4;
   }
}
