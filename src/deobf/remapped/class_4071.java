package remapped;

public class class_4071 implements Runnable {
   private static String[] field_19826;

   public class_4071(class_5298 var1, long var2, long var4, class_4330 var6) {
      this.field_19829 = var1;
      this.field_19828 = var2;
      this.field_19830 = var4;
      this.field_19827 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_19828; var3 < this.field_19830; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         float var9 = -this.field_19827.method_36133(var5) * class_5298.method_24192(this.field_19829).method_36133(var7)
            + this.field_19827.method_36133(var7) * class_5298.method_24192(this.field_19829).method_36133(var5);
         this.field_19827
            .method_36123(
               var5,
               this.field_19827.method_36133(var5) * class_5298.method_24192(this.field_19829).method_36133(var5)
                  + this.field_19827.method_36133(var7) * class_5298.method_24192(this.field_19829).method_36133(var7)
            );
         this.field_19827.method_36123(var7, var9);
      }
   }
}
