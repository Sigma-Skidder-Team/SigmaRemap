package remapped;

public class class_2720 implements Runnable {
   private static String[] field_13297;

   public class_2720(class_3817 var1, long var2, long var4, class_4330 var6, long var7, class_4330 var9) {
      this.field_13298 = var1;
      this.field_13299 = var2;
      this.field_13293 = var4;
      this.field_13296 = var6;
      this.field_13294 = var7;
      this.field_13295 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_13299; var3 < this.field_13293; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field_13296.method_36123(this.field_13294 + var3, this.field_13295.method_36133(var5) - this.field_13295.method_36133(var7));
         this.field_13296
            .method_36123(
               this.field_13294 + class_3817.method_17791(this.field_13298) - var3, this.field_13295.method_36133(var5) + this.field_13295.method_36133(var7)
            );
      }
   }
}
