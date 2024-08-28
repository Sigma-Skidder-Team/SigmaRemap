package mapped;

public class Class364 extends Thread {
   public final Class806 field1601;

   public Class364(Class806 var1, String var2) {
      super(var2);
      this.field1601 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Boolean var4 = var3.method14553();
         if (var4) {
            Class4624.method14546();
            Class806.method2084().info("Switched to local");
            Class806.method2097().method36019();
         }
      } catch (Class2435 var5) {
         Class806.method2084().error("Couldn't connect to Realms: " + var5);
      }
   }
}
