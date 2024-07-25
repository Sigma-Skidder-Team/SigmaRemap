package remapped;

public final class class_208 implements Runnable {
   private static String[] field_699;

   public class_208(long var1, long var3, class_8514 var5, long var6, class_8514 var8, long var9) {
      this.field_701 = var1;
      this.field_698 = var3;
      this.field_696 = var5;
      this.field_702 = var6;
      this.field_697 = var8;
      this.field_700 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_701; var3 < this.field_698; var3++) {
         this.field_696.method_36117(this.field_702 + var3, this.field_697.method_36121(this.field_700 + var3));
      }
   }
}
