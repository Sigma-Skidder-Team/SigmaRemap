package remapped;

public class class_2644 implements Runnable {
   private static String[] field_13024;

   public class_2644(class_9035 var1, long var2, long var4, long var6, long var8, class_1702 var10, class_1702 var11, long var12) {
      this.field_13025 = var1;
      this.field_13026 = var2;
      this.field_13027 = var4;
      this.field_13022 = var6;
      this.field_13023 = var8;
      this.field_13021 = var10;
      this.field_13028 = var11;
      this.field_13020 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_13026; var3 < this.field_13027; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field_13022; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field_13023 + var9;
            this.field_13021.method_36114(var11, this.field_13028.method_36107(var7 * this.field_13020 + var5));
            this.field_13021.method_36114(var11 + 1L, this.field_13028.method_36107(var7 * this.field_13020 + var5 + 1L));
         }
      }
   }
}
