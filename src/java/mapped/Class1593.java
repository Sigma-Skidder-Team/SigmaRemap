package mapped;

public class Class1593 implements Runnable {
   public final Class9408 field8633;

   public Class1593(Class9408 var1) {
      this.field8633 = var1;
   }

   @Override
   public void run() {
      if (Class9408.method36032(this.field8633)) {
         this.method6488();
      }
   }

   private void method6488() {
      try {
         Class4624 var3 = Class4624.method14543();
         Class9408.method36033(this.field8633, var3.method14549());
         Class9408.method36034(this.field8633).put(Class2310.field15837, true);
      } catch (Exception var4) {
         Class9408.method36035().error("Couldn't get live stats", var4);
      }
   }
}
