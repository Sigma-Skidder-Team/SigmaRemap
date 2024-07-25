package remapped;

public final class class_5364 implements Runnable {
   private static String[] field_27367;

   public class_5364(long var1, long var3, class_4330 var5, long var6, class_4330 var8, long var9) {
      this.field_27370 = var1;
      this.field_27366 = var3;
      this.field_27365 = var5;
      this.field_27371 = var6;
      this.field_27368 = var8;
      this.field_27369 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_27370; var3 < this.field_27366; var3++) {
         this.field_27365.method_36123(this.field_27371 + var3, this.field_27368.method_36133(this.field_27369 + var3));
      }
   }
}
