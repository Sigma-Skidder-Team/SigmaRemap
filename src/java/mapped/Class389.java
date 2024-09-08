package mapped;

public class Class389 extends Thread {
   public final int field1653;
   public final Class823 field1654;

   public Class389(Class823 var1, String var2, int var3) {
      super(var2);
      this.field1654 = var1;
      this.field1653 = var3;
   }

   @Override
   public void run() {
      try {
         Class4624 var3 = Class4624.method14543();
         var3.method14578(Class1160.method5558(Class823.method2390(this.field1654).getEventListeners().get(this.field1653)).field27370);
         Class823.method2391(this.field1654).execute(() -> Class823.method2392(this.field1654, field1653));
      } catch (Class2435 var4) {
         Class823.method2388().error("Couldn't reject invite");
      }
   }
}
