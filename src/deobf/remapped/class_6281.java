package remapped;

public class class_6281 {
   private static String[] field_32098;
   private int field_32097;
   private int field_32103;
   private int field_32106;
   private int field_32095;
   private int field_32105;
   private int field_32101;
   private int field_32102;
   private int field_32104;
   private int field_32100;
   private int field_32096;
   private int field_32099;

   public class_6281(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_32097 = var1;
      this.field_32103 = var2;
      this.field_32106 = var3;
      this.field_32095 = var4 - var1 + 1;
      this.field_32105 = var5 - var2 + 1;
      this.field_32101 = var6 - var3 + 1;
      this.field_32102 = this.field_32095 * this.field_32105 * this.field_32101;
   }

   public boolean method_28626() {
      if (this.field_32104 != this.field_32102) {
         this.field_32100 = this.field_32104 % this.field_32095;
         int var3 = this.field_32104 / this.field_32095;
         this.field_32096 = var3 % this.field_32105;
         this.field_32099 = var3 / this.field_32105;
         this.field_32104++;
         return true;
      } else {
         return false;
      }
   }

   public int method_28624() {
      return this.field_32097 + this.field_32100;
   }

   public int method_28628() {
      return this.field_32103 + this.field_32096;
   }

   public int method_28623() {
      return this.field_32106 + this.field_32099;
   }

   public int method_28625() {
      int var3 = 0;
      if (this.field_32100 == 0 || this.field_32100 == this.field_32095 - 1) {
         var3++;
      }

      if (this.field_32096 == 0 || this.field_32096 == this.field_32105 - 1) {
         var3++;
      }

      if (this.field_32099 == 0 || this.field_32099 == this.field_32101 - 1) {
         var3++;
      }

      return var3;
   }
}
