package remapped;

public class class_1175 implements Runnable {
   private static String[] field_6633;

   public class_1175(class_8720 var1, long var2, long var4, class_8720 var6, class_8720 var7) {
      this.field_6631 = var1;
      this.field_6632 = var2;
      this.field_6635 = var4;
      this.field_6636 = var6;
      this.field_6634 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_6632; var3 < this.field_6635; var3++) {
         this.field_6636.method_36117(var3, (byte)(this.field_6631.method_36121(var3) | this.field_6634.method_36121(var3)));
      }
   }
}
