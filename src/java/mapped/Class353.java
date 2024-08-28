package mapped;

public class Class353 extends Thread {
   private static String[] field1575;
   public final Class816 field1576;

   public Class353(Class816 var1, String var2) {
      super(var2);
      this.field1576 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Class1992 var4 = var3.method14554();
         if (var4 != Class1992.field12994) {
            return;
         }
      } catch (Class2435 var5) {
         if (var5.field16472 != 401) {
            Class816.method2323(false);
         }

         return;
      }

      Class816.method2324(true);
   }
}
