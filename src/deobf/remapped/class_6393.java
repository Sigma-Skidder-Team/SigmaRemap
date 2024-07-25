package remapped;

public class class_6393 implements Runnable {
   private static String[] field_32647;

   public class_6393(class_5298 var1, long var2, long var4, class_4330 var6) {
      this.field_32645 = var1;
      this.field_32646 = var2;
      this.field_32643 = var4;
      this.field_32644 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_32646; var3 < this.field_32643; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         float var9 = -this.field_32644.method_36133(var5) * class_5298.method_24192(this.field_32645).method_36133(var7)
            + this.field_32644.method_36133(var7) * class_5298.method_24192(this.field_32645).method_36133(var5);
         this.field_32644
            .method_36123(
               var5,
               this.field_32644.method_36133(var5) * class_5298.method_24192(this.field_32645).method_36133(var5)
                  + this.field_32644.method_36133(var7) * class_5298.method_24192(this.field_32645).method_36133(var7)
            );
         this.field_32644.method_36123(var7, var9);
      }
   }
}
