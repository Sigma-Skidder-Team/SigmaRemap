package remapped;

public final class class_9649 implements Runnable {
   private static String[] field_49151;

   public class_9649(long var1, long var3, class_5812 var5, long var6, Object[] var8, int var9) {
      this.field_49150 = var1;
      this.field_49148 = var3;
      this.field_49152 = var5;
      this.field_49153 = var6;
      this.field_49149 = var8;
      this.field_49147 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_49150; var3 < this.field_49148; var3++) {
         this.field_49152.method_36122(this.field_49153 + var3, this.field_49149[this.field_49147 + (int)var3]);
      }
   }
}
