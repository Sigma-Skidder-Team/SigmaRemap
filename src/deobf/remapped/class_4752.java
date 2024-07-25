package remapped;

public class class_4752 implements Runnable {
   private static String[] field_23017;

   public class_4752(class_3381 var1, long var2, long var4, long var6, long var8, class_4330 var10, boolean var11, long var12) {
      this.field_23018 = var1;
      this.field_23016 = var2;
      this.field_23020 = var4;
      this.field_23023 = var6;
      this.field_23022 = var8;
      this.field_23021 = var10;
      this.field_23019 = var11;
      this.field_23024 = var12;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_23016);

      for (long var4 = this.field_23020; var4 >= this.field_23023; var4--) {
         long var6 = var4 * class_3381.method_15598(this.field_23018);
         long var8 = var4 * this.field_23022;

         for (long var10 = class_3381.method_15624(this.field_23018) - 1L; var10 >= 0L; var10--) {
            class_3685.method_17117(
               this.field_23021, var6 + var10 * class_3381.method_15638(this.field_23018), var3, 0L, class_3381.method_15582(this.field_23018)
            );
            class_3381.method_15625(this.field_23018).method_24169(var3, this.field_23019);
            class_3685.method_17117(var3, 0L, this.field_23021, var8 + var10 * this.field_23024, this.field_23016);
         }
      }
   }
}
