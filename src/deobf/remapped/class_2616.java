package remapped;

public final class class_2616 extends class_7582<Runnable> {
   private class_2616(class_2206 var1, class_6486 var2) {
      super("Chunk source main thread executor for " + var2.method_29545().method_25499());
      this.field_12908 = var1;
   }

   @Override
   public Runnable method_34462(Runnable var1) {
      return var1;
   }

   @Override
   public boolean method_34463(Runnable var1) {
      return true;
   }

   @Override
   public boolean method_34464() {
      return true;
   }

   @Override
   public Thread method_34460() {
      return class_2206.method_10179(this.field_12908);
   }

   @Override
   public void run(Runnable var1) {
      class_2206.method_10178(this.field_12908).method_29599().method_16055("runTask");
      super.run(var1);
   }

   @Override
   public boolean method_34453() {
      if (!class_2206.method_10206(this.field_12908)) {
         class_2206.method_10192(this.field_12908).method_9760();
         return super.method_34453();
      } else {
         return true;
      }
   }
}
