package mapped;

public class Class387 extends Thread {
   public final Class806 field1652;

   public Class387(Class806 var1, String var2) {
      super(var2);
      this.field1652 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Boolean var4 = var3.method14553();
         if (var4) {
            Class4624.method14544();
            Class806.method2084().info("Switched to stage");
            Class806.method2097().method36019();
         }
      } catch (Class2435 var5) {
         Class806.method2084().error("Couldn't connect to Realms: " + var5);
      }
   }
}
