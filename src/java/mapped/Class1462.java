package mapped;

public class Class1462 implements Runnable {
   public final Class9408 field7860;

   public Class1462(Class9408 var1) {
      this.field7860 = var1;
   }

   @Override
   public void run() {
      if (Class9408.method36032(this.field7860)) {
         this.method6464();
      }
   }

   private void method6464() {
      try {
         Class4624 var3 = Class4624.method14543();
         Class9408.method36036(this.field7860, var3.method14572());
         Class9408.method36034(this.field7860).put(Class2310.field15835, true);
      } catch (Exception var4) {
         Class9408.method36035().error("Couldn't get pending invite count", var4);
      }
   }
}
