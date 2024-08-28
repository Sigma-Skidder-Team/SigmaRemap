package mapped;

public class Class363 extends Thread {
   public final Class806 field1600;

   public Class363(Class806 var1, String var2) {
      super(var2);
      this.field1600 = var1;
   }

   @Override
   public void run() {
      try {
         Class6128 var3 = Class806.method2099(this.field1600, Class806.method2098(this.field1600));
         if (var3 != null) {
            Class4624 var4 = Class4624.method14543();
            var4.method14556(var3.field27443);
            Class806.method2100(this.field1600).execute(() -> Class806.method2103(this.field1600, var3));
         }
      } catch (Class2435 var5) {
         Class806.method2084().error("Couldn't configure world");
         Class806.method2101(this.field1600).execute(() -> Class806.method2102(this.field1600).displayGuiScreen(new Class821(var5, this.field1600)));
      }
   }
}
