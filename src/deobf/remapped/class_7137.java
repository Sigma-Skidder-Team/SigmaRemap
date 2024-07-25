package remapped;

public class class_7137 implements Runnable {
   private static String[] field_36768;

   public class_7137(class_5298 var1, long var2, long var4, long var6, class_4330 var8, class_4330 var9) {
      this.field_36766 = var1;
      this.field_36764 = var2;
      this.field_36763 = var4;
      this.field_36767 = var6;
      this.field_36765 = var8;
      this.field_36769 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_36764; var3 < this.field_36763; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field_36767 + var3;
         this.field_36765.method_36123(var5, this.field_36769.method_36133(var9) * class_5298.method_24218(this.field_36766).method_36133(var5));
         this.field_36765.method_36123(var7, -this.field_36769.method_36133(var9) * class_5298.method_24218(this.field_36766).method_36133(var7));
      }
   }
}
