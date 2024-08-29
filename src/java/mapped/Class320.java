package mapped;

public final class Class320 extends Class318<Runnable> {
   public final Class1703 field1383;

   public Class320(Class1703 var1, World var2) {
      super("Chunk source main thread executor for " + var2.getDimensionKey().getLocation());
      this.field1383 = var1;
   }

   @Override
   public Runnable wrapTask(Runnable var1) {
      return var1;
   }

   @Override
   public boolean canRun(Runnable var1) {
      return true;
   }

   @Override
   public boolean method1390() {
      return true;
   }

   @Override
   public Thread getExecutionThread() {
      return Class1703.method7394(this.field1383);
   }

   @Override
   public void run(Runnable var1) {
      Class1703.method7395(this.field1383).getProfiler().func_230035_c_("runTask");
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
