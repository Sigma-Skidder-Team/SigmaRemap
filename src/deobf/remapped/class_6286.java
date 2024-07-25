package remapped;

public final class class_6286 implements Runnable {
   private static String[] field_32128;

   public class_6286(long var1, long var3, class_4516 var5, long var6, class_4516 var8, long var9) {
      this.field_32131 = var1;
      this.field_32132 = var3;
      this.field_32130 = var5;
      this.field_32129 = var6;
      this.field_32126 = var8;
      this.field_32127 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_32131; var3 < this.field_32132; var3++) {
         this.field_32130.method_36129(this.field_32129 + var3, this.field_32126.method_36124(this.field_32127 + var3));
      }
   }
}
