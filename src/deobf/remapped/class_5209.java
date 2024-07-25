package remapped;

public class class_5209 implements Runnable {
   private static String[] field_26764;
   private long field_26766;
   private final long field_26765;
   private final long field_26763;

   public class_5209(long var1, long var3, long var5) {
      this.field_26766 = var1;
      this.field_26765 = var3;
      this.field_26763 = var5;
   }

   @Override
   public void run() {
      if (this.field_26766 != 0L) {
         class_3685.field_18064.freeMemory(this.field_26766);
         this.field_26766 = 0L;
         class_3506.method_16124(this.field_26765 * this.field_26763);
      }
   }
}
