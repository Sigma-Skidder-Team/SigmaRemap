package remapped;

public class class_8915 {
   private static String[] field_45706;
   private int field_45713 = 18;
   private int field_45705 = 128;
   private int field_45707 = 18;
   private int field_45712 = 0;
   private int field_45711 = 0;
   private int field_45710 = 0;
   private int[][][] field_45709 = (int[][][])null;
   private int[] field_45714 = null;
   private int field_45708 = 0;

   public class_8915(int var1, int var2, int var3) {
      this.field_45713 = var1;
      this.field_45705 = var2;
      this.field_45707 = var3;
      this.field_45709 = new int[var1][var2][var3];
      this.method_41007();
   }

   public void method_41007() {
      for (int var3 = 0; var3 < this.field_45713; var3++) {
         int[][] var4 = this.field_45709[var3];

         for (int var5 = 0; var5 < this.field_45705; var5++) {
            int[] var6 = var4[var5];

            for (int var7 = 0; var7 < this.field_45707; var7++) {
               var6[var7] = -1;
            }
         }
      }
   }

   public void method_41010(int var1, int var2, int var3) {
      this.field_45712 = var1;
      this.field_45711 = var2;
      this.field_45710 = var3;
      this.method_41007();
   }

   public int method_41009(int var1, int var2, int var3) {
      try {
         this.field_45714 = this.field_45709[var1 - this.field_45712][var2 - this.field_45711];
         this.field_45708 = var3 - this.field_45710;
         return this.field_45714[this.field_45708];
      } catch (ArrayIndexOutOfBoundsException var7) {
         var7.printStackTrace();
         return -1;
      }
   }

   public void method_41008(int var1) {
      try {
         this.field_45714[this.field_45708] = var1;
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
