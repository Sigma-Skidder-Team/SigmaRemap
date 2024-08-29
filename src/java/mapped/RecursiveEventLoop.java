package mapped;

public abstract class RecursiveEventLoop<R extends Runnable> extends Class318<R> {
   private int field1376;

   public RecursiveEventLoop(String var1) {
      super(var1);
   }

   @Override
   public boolean method1390() {
      return this.method1628() || super.method1390();
   }

   public boolean method1628() {
      return this.field1376 != 0;
   }

   @Override
   public void run(R var1) {
      this.field1376++;

      try {
         super.run((R)var1);
      } finally {
         this.field1376--;
      }
   }
}
