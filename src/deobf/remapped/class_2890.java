package remapped;

public class class_2890 implements Runnable {
   private static String[] field_14138;

   public class_2890(class_4560 var1, long var2, long var4, class_4330 var6, long var7, class_4330 var9) {
      this.field_14144 = var1;
      this.field_14140 = var2;
      this.field_14142 = var4;
      this.field_14141 = var6;
      this.field_14143 = var7;
      this.field_14139 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_14140; var3 < this.field_14142; var3++) {
         long var5 = 2L * var3;
         float var7 = this.field_14141.method_36133(this.field_14143 + var3);
         this.field_14139.method_36123(var5, class_4560.method_21128(this.field_14144).method_36133(var5) * var7);
         this.field_14139.method_36123(var5 + 1L, -class_4560.method_21128(this.field_14144).method_36133(var5 + 1L) * var7);
      }
   }
}
