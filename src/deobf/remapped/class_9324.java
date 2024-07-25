package remapped;

public class class_9324 implements Runnable {
   private static String[] field_47607;

   public class_9324(class_5298 var1, int var2, long var3, long var5, long var7, class_4330 var9, class_4330 var10) {
      this.field_47608 = var1;
      this.field_47611 = var2;
      this.field_47606 = var3;
      this.field_47609 = var5;
      this.field_47610 = var7;
      this.field_47613 = var9;
      this.field_47612 = var10;
   }

   @Override
   public void run() {
      if (this.field_47611 <= 0) {
         for (long var3 = this.field_47606; var3 < this.field_47609; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field_47610 + var5;
            long var11 = this.field_47610 + var7;
            this.field_47613
               .method_36123(
                  var5,
                  this.field_47612.method_36133(var9) * class_5298.method_24218(this.field_47608).method_36133(var5)
                     + this.field_47612.method_36133(var11) * class_5298.method_24218(this.field_47608).method_36133(var7)
               );
            this.field_47613
               .method_36123(
                  var7,
                  -this.field_47612.method_36133(var9) * class_5298.method_24218(this.field_47608).method_36133(var7)
                     + this.field_47612.method_36133(var11) * class_5298.method_24218(this.field_47608).method_36133(var5)
               );
         }
      } else {
         for (long var13 = this.field_47606; var13 < this.field_47609; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field_47610 + var14;
            long var17 = this.field_47610 + var15;
            this.field_47613
               .method_36123(
                  var14,
                  this.field_47612.method_36133(var16) * class_5298.method_24218(this.field_47608).method_36133(var14)
                     - this.field_47612.method_36133(var17) * class_5298.method_24218(this.field_47608).method_36133(var15)
               );
            this.field_47613
               .method_36123(
                  var15,
                  this.field_47612.method_36133(var16) * class_5298.method_24218(this.field_47608).method_36133(var15)
                     + this.field_47612.method_36133(var17) * class_5298.method_24218(this.field_47608).method_36133(var14)
               );
         }
      }
   }
}
