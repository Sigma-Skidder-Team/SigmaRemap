package mapped;

import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;

public class Class389 extends Thread {
   public final int field1653;
   public final RealmsScreenReal field1654;

   public Class389(RealmsScreenReal var1, String var2, int var3) {
      super(var2);
      this.field1654 = var1;
      this.field1653 = var3;
   }

   @Override
   public void run() {
      try {
         RealmsClient var3 = RealmsClient.method14543();
         var3.method14578(Class1160.method5558(RealmsScreenReal.method2390(this.field1654).getEventListeners().get(this.field1653)).field27370);
         RealmsScreenReal.method2391(this.field1654).execute(() -> RealmsScreenReal.method2392(this.field1654, field1653));
      } catch (RealmsServiceException var4) {
         RealmsScreenReal.method2388().error("Couldn't reject invite");
      }
   }
}
