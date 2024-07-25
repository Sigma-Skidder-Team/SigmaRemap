package remapped;

public class class_7561 implements Runnable {
   private static String[] field_38527;

   public class_7561(class_3381 var1, int var2, int var3, int var4, float[][][] var5) {
      this.field_38531 = var1;
      this.field_38529 = var2;
      this.field_38530 = var3;
      this.field_38532 = var4;
      this.field_38528 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_38529; var3 < this.field_38530; var3++) {
         int var4 = (class_3381.method_15623(this.field_38531) - var3) % class_3381.method_15623(this.field_38531);

         for (int var5 = 1; var5 < this.field_38532; var5++) {
            int var6 = class_3381.method_15581(this.field_38531) - var5;
            this.field_38528[var4][var5][class_3381.method_15629(this.field_38531)] = this.field_38528[var3][var6][1];
            this.field_38528[var3][var6][class_3381.method_15629(this.field_38531)] = this.field_38528[var3][var6][1];
            this.field_38528[var4][var5][class_3381.method_15629(this.field_38531) + 1] = -this.field_38528[var3][var6][0];
            this.field_38528[var3][var6][class_3381.method_15629(this.field_38531) + 1] = this.field_38528[var3][var6][0];
         }
      }
   }
}
