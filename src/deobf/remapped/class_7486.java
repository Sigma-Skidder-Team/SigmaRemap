package remapped;

public class class_7486 implements Runnable {
   private static String[] field_38212;

   public class_7486(class_5298 var1, long var2, long var4, long var6, long var8, class_4330 var10) {
      this.field_38210 = var1;
      this.field_38213 = var2;
      this.field_38208 = var4;
      this.field_38211 = var6;
      this.field_38214 = var8;
      this.field_38209 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_38213; var3 < this.field_38208; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field_38211 + (this.field_38214 - var5) % this.field_38214;
         this.field_38209.method_36123(var7, this.field_38209.method_36133(this.field_38211 + var5));
         this.field_38209.method_36123(var7 + 1L, -this.field_38209.method_36133(this.field_38211 + var5 + 1L));
      }
   }
}
