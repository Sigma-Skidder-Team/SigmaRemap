package mapped;

import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;

import java.util.List;

public class Class373 extends Thread {
   public final Class807 field1626;

   public Class373(Class807 var1, String var2) {
      super(var2);
      this.field1626 = var1;
   }

   @Override
   public void run() {
      RealmsClient var3 = RealmsClient.method14543();

      try {
         List<Class6122> var4 = var3.method14558(Class807.method2184(this.field1626).field27443).field27437;
         Class807.method2185(this.field1626).execute(() -> {
            Class807.method2187(this.field1626, var4);
            Class807.method2188(this.field1626, Class807.method2189(this.field1626).isEmpty());
            Class807.method2190(this.field1626).method6111();

            for (Class6122 var5x : Class807.method2189(this.field1626)) {
               Class807.method2190(this.field1626).method6114(var5x);
            }

            Class807.method2191(this.field1626);
         });
      } catch (RealmsServiceException var5) {
         Class807.method2186().error("Couldn't request backups", var5);
      }
   }
}
