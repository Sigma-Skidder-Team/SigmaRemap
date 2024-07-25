package remapped;

public class class_6342 implements Runnable {
   private static String[] field_32381;

   public class_6342(class_4133 var1, long var2, long var4, long var6, class_4330 var8) {
      this.field_32383 = var1;
      this.field_32385 = var2;
      this.field_32384 = var4;
      this.field_32382 = var6;
      this.field_32386 = var8;
   }

   @Override
   public void run() {
      long var3 = this.field_32385 + class_4133.method_19198(this.field_32383) - 1L;

      for (long var5 = this.field_32384; var5 < this.field_32382; var5++) {
         long var7 = this.field_32385 + var5;
         float var9 = this.field_32386.method_36133(var7);
         long var10 = var3 - var5;
         this.field_32386.method_36123(var7, this.field_32386.method_36133(var10));
         this.field_32386.method_36123(var10, var9);
      }
   }
}
