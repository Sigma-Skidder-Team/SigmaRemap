package mapped;

import java.util.List;
import java.util.stream.Collectors;

public class Class376 extends Thread {
   public final Class823 field1630;

   public Class376(Class823 var1, String var2) {
      super(var2);
      this.field1630 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         List<Class6110> var4 = var3.method14573().field27476;
         List<Class1160> var5 = var4.stream().<Class1160>map(var1 -> {
            Class823 var10002 = this.field1630;
            this.field1630.getClass();
            return new Class1160(var10002, var1);
         }).collect(Collectors.toList());
         Class823.method2387(this.field1630).execute(() -> Class823.method2390(this.field1630).method6028(var5));
      } catch (Class2435 var9) {
         Class823.method2388().error("Couldn't list invites");
      } finally {
         Class823.method2389(this.field1630, true);
      }
   }
}
