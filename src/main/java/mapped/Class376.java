package mapped;

import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;

import java.util.List;
import java.util.stream.Collectors;

public class Class376 extends Thread {
   public final RealmsScreenReal field1630;

   public Class376(RealmsScreenReal var1, String var2) {
      super(var2);
      this.field1630 = var1;
   }

   @Override
   public void run() {
      RealmsClient var3 = RealmsClient.method14543();

      try {
         List<Class6110> var4 = var3.method14573().field27476;
         List<Class1160> var5 = var4.stream().<Class1160>map(var1 -> {
            RealmsScreenReal var10002 = this.field1630;
            this.field1630.getClass();
            return new Class1160(var10002, var1);
         }).collect(Collectors.toList());
         RealmsScreenReal.method2387(this.field1630).execute(() -> RealmsScreenReal.method2390(this.field1630).method6028(var5));
      } catch (RealmsServiceException var9) {
         RealmsScreenReal.method2388().error("Couldn't list invites");
      } finally {
         RealmsScreenReal.method2389(this.field1630, true);
      }
   }
}
