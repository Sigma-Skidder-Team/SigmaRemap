package mapped;

public class Class382 extends Thread {
   public final int field1642;
   public final Class823 field1643;

   public Class382(Class823 var1, String var2, int var3) {
      super(var2);
      this.field1643 = var1;
      this.field1642 = var3;
   }

   @Override
   public void run() {
      try {
         Class4624 var3 = Class4624.method14543();
         var3.method14575(Class1160.method5558(Class823.method2390(this.field1643).method2468().get(this.field1642)).field27370);
         Class823.method2393(this.field1643).execute(() -> Class823.method2392(this.field1643, field1642));
      } catch (Class2435 var4) {
         Class823.method2388().error("Couldn't accept invite");
      }
   }
}
