package mapped;

public class Class380 extends Thread {
   public final Class806 field1638;

   public Class380(Class806 var1, String var2) {
      super(var2);
      this.field1638 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Boolean var4 = var3.method14552();
         if (var4) {
            Class806.method2084().info("Realms is available for this user");
            Class806.method2091(true);
         } else {
            Class806.method2084().info("Realms is not available for this user");
            Class806.method2091(false);
            Class806.method2092(this.field1638)
               .execute(() -> Class806.method2096(this.field1638).displayGuiScreen(new Class820(Class806.method2079(this.field1638))));
         }

         Class806.method2093(true);
      } catch (Class2435 var5) {
         Class806.method2084().error("Couldn't connect to realms", var5);
         Class806.method2094(this.field1638)
            .execute(() -> Class806.method2095(this.field1638).displayGuiScreen(new Class821(var5, Class806.method2079(this.field1638))));
      }
   }
}
