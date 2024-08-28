package mapped;

public class Class350 implements Runnable {
   public final Class9408 field1558;

   public Class350(Class9408 var1) {
      this.field1558 = var1;
   }

   @Override
   public void run() {
      if (Class9408.method36032(this.field1558)) {
         this.method1814();
      }
   }

   private void method1814() {
      try {
         Class4624 var3 = Class4624.method14543();
         Class9408.method36038(this.field1558, var3.method14582());
         Class9408.method36034(this.field1558).put(Class2310.field15836, true);
      } catch (Exception var4) {
         Class9408.method36035().error("Couldn't get trial availability", var4);
      }
   }
}
