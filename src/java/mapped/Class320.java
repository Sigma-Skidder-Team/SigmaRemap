package mapped;

public final class Class320 extends Class318<Runnable> {
   public final Class1703 field1383;

   public Class320(Class1703 var1, World var2) {
      super("Chunk source main thread executor for " + var2.method6813().method31399());
      this.field1383 = var1;
   }

   @Override
   public Runnable method1440(Runnable var1) {
      return var1;
   }

   @Override
   public boolean method1439(Runnable var1) {
      return true;
   }

   @Override
   public boolean method1390() {
      return true;
   }

   @Override
   public Thread method1391() {
      return Class1703.method7394(this.field1383);
   }

   @Override
   public void run(Runnable var1) {
      Class1703.method7395(this.field1383).method6820().func_230035_c_("runTask");
      super.run(var1);
   }

   @Override
   public boolean method1302() {
      if (!Class1703.method7396(this.field1383)) {
         Class1703.method7397(this.field1383).method611();
         return super.method1302();
      } else {
         return true;
      }
   }
}
