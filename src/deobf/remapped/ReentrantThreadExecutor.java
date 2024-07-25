package remapped;

public abstract class ReentrantThreadExecutor<R extends Runnable> extends class_7582<R> {
   private int field_39343;

   public ReentrantThreadExecutor(String var1) {
      super(var1);
   }

   @Override
   public boolean method_34464() {
      return this.method_35205() || super.method_34464();
   }

   public boolean method_35205() {
      return this.field_39343 != 0;
   }

   @Override
   public void run(R var1) {
      this.field_39343++;

      try {
         super.run((R)var1);
      } finally {
         this.field_39343--;
      }
   }
}
