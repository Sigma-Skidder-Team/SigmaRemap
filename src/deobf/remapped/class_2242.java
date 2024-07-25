package remapped;

public final class class_2242 implements Runnable {
   private static String[] field_11160;

   public class_2242(long var1, long var3, class_5812 var5, long var6, class_5812 var8, long var9) {
      this.field_11163 = var1;
      this.field_11159 = var3;
      this.field_11161 = var5;
      this.field_11164 = var6;
      this.field_11165 = var8;
      this.field_11162 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_11163; var3 < this.field_11159; var3++) {
         this.field_11161.method_36122(this.field_11164 + var3, this.field_11165.method_36098(this.field_11162 + var3));
      }
   }
}
