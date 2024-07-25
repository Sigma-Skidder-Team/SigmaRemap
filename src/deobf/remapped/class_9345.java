package remapped;

public class class_9345 implements Runnable {
   private static String[] field_47696;

   public class_9345(class_3381 var1, long var2, long var4, long var6, long var8, long var10, class_4330 var12) {
      this.field_47698 = var1;
      this.field_47694 = var2;
      this.field_47699 = var4;
      this.field_47700 = var6;
      this.field_47701 = var8;
      this.field_47697 = var10;
      this.field_47695 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_47694; var3 < this.field_47699; var3++) {
         long var5 = (class_3381.method_15636(this.field_47698) - var3) % class_3381.method_15636(this.field_47698) * this.field_47700;
         long var7 = var3 * this.field_47700;

         for (long var9 = 1L; var9 < this.field_47701; var9++) {
            long var11 = var7 + (class_3381.method_15624(this.field_47698) - var9) * this.field_47697;
            long var13 = var5 + var9 * this.field_47697 + class_3381.method_15582(this.field_47698);
            long var15 = var11 + class_3381.method_15582(this.field_47698);
            long var17 = var11 + 1L;
            this.field_47695.method_36123(var13, this.field_47695.method_36133(var17));
            this.field_47695.method_36123(var15, this.field_47695.method_36133(var17));
            this.field_47695.method_36123(var13 + 1L, -this.field_47695.method_36133(var11));
            this.field_47695.method_36123(var15 + 1L, this.field_47695.method_36133(var11));
         }
      }
   }
}
