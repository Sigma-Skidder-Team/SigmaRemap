package remapped;

public class class_4830 implements Runnable {
   private static String[] field_24111;

   public class_4830(class_9697 var1, long var2, long var4, class_1702 var6, long var7, class_1702 var9) {
      this.field_24113 = var1;
      this.field_24112 = var2;
      this.field_24110 = var4;
      this.field_24108 = var6;
      this.field_24114 = var7;
      this.field_24109 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_24112; var3 < this.field_24110; var3++) {
         long var5 = 2L * var3;
         double var7 = this.field_24108.method_36107(this.field_24114 + var3);
         this.field_24109.method_36114(var5, class_9697.method_44811(this.field_24113).method_36107(var5) * var7);
         this.field_24109.method_36114(var5 + 1L, -class_9697.method_44811(this.field_24113).method_36107(var5 + 1L) * var7);
      }
   }
}
