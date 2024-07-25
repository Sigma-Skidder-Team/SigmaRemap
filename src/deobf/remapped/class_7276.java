package remapped;

public class class_7276 implements Runnable {
   private static String[] field_37251;

   public class_7276(class_5298 var1, long var2, long var4, long var6, class_4330 var8) {
      this.field_37247 = var1;
      this.field_37249 = var2;
      this.field_37248 = var4;
      this.field_37252 = var6;
      this.field_37250 = var8;
   }

   @Override
   public void run() {
      if (this.field_37249 <= 0L) {
         for (long var3 = this.field_37248; var3 < this.field_37252; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            float var9 = this.field_37250.method_36133(var5) * class_5298.method_24192(this.field_37247).method_36133(var7)
               + this.field_37250.method_36133(var7) * class_5298.method_24192(this.field_37247).method_36133(var5);
            this.field_37250
               .method_36123(
                  var5,
                  this.field_37250.method_36133(var5) * class_5298.method_24192(this.field_37247).method_36133(var5)
                     - this.field_37250.method_36133(var7) * class_5298.method_24192(this.field_37247).method_36133(var7)
               );
            this.field_37250.method_36123(var7, var9);
         }
      } else {
         for (long var10 = this.field_37248; var10 < this.field_37252; var10++) {
            long var11 = 2L * var10;
            long var12 = var11 + 1L;
            float var13 = -this.field_37250.method_36133(var11) * class_5298.method_24192(this.field_37247).method_36133(var12)
               + this.field_37250.method_36133(var12) * class_5298.method_24192(this.field_37247).method_36133(var11);
            this.field_37250
               .method_36123(
                  var11,
                  this.field_37250.method_36133(var11) * class_5298.method_24192(this.field_37247).method_36133(var11)
                     + this.field_37250.method_36133(var12) * class_5298.method_24192(this.field_37247).method_36133(var12)
               );
            this.field_37250.method_36123(var12, var13);
         }
      }
   }
}
