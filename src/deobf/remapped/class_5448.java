package remapped;

public class class_5448 implements Runnable {
   private static String[] field_27769;

   public class_5448(class_9035 var1, long var2, long var4, class_1702 var6, long var7, class_1702 var9, boolean var10) {
      this.field_27772 = var1;
      this.field_27771 = var2;
      this.field_27773 = var4;
      this.field_27768 = var6;
      this.field_27774 = var7;
      this.field_27767 = var9;
      this.field_27770 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_27771; var3 < this.field_27773; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < class_9035.method_41453(this.field_27772); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * class_9035.method_41456(this.field_27772) + var5;
            this.field_27768.method_36114(var3 * this.field_27774 + var9, this.field_27767.method_36107(var11));
            this.field_27768.method_36114(var3 * this.field_27774 + var9 + 1L, this.field_27767.method_36107(var11 + 1L));
         }

         class_9035.method_41455(this.field_27772).method_15033(this.field_27768, var3 * this.field_27774, this.field_27770);
      }
   }
}
