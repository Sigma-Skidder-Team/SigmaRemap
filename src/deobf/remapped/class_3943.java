package remapped;

public class class_3943 implements Runnable {
   private static String[] field_19152;

   public class_3943(class_5298 var1, int var2, long var3, long var5, class_4330 var7) {
      this.field_19154 = var1;
      this.field_19156 = var2;
      this.field_19155 = var3;
      this.field_19151 = var5;
      this.field_19153 = var7;
   }

   @Override
   public void run() {
      if (this.field_19156 <= 0) {
         for (long var3 = this.field_19155; var3 < this.field_19151; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            float var9 = this.field_19153.method_36133(var5) * class_5298.method_24192(this.field_19154).method_36133(var7)
               + this.field_19153.method_36133(var7) * class_5298.method_24192(this.field_19154).method_36133(var5);
            this.field_19153
               .method_36123(
                  var5,
                  this.field_19153.method_36133(var5) * class_5298.method_24192(this.field_19154).method_36133(var5)
                     - this.field_19153.method_36133(var7) * class_5298.method_24192(this.field_19154).method_36133(var7)
               );
            this.field_19153.method_36123(var7, var9);
         }
      } else {
         for (long var10 = this.field_19155; var10 < this.field_19151; var10++) {
            long var11 = 2L * var10;
            long var12 = var11 + 1L;
            float var13 = -this.field_19153.method_36133(var11) * class_5298.method_24192(this.field_19154).method_36133(var12)
               + this.field_19153.method_36133(var12) * class_5298.method_24192(this.field_19154).method_36133(var11);
            this.field_19153
               .method_36123(
                  var11,
                  this.field_19153.method_36133(var11) * class_5298.method_24192(this.field_19154).method_36133(var11)
                     + this.field_19153.method_36133(var12) * class_5298.method_24192(this.field_19154).method_36133(var12)
               );
            this.field_19153.method_36123(var12, var13);
         }
      }
   }
}
