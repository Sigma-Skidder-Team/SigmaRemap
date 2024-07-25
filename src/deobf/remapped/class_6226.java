package remapped;

public class class_6226 implements Runnable {
   private static String[] field_31795;

   public class_6226(class_573 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_31799 = var1;
      this.field_31796 = var2;
      this.field_31798 = var3;
      this.field_31797 = var4;
      this.field_31794 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2721(this.field_31799)];

      for (int var4 = this.field_31796; var4 < this.field_31798; var4++) {
         int var5 = var4 * class_573.method_2737(this.field_31799);

         for (int var6 = 0; var6 < class_573.method_2730(this.field_31799); var6++) {
            for (int var7 = 0; var7 < class_573.method_2721(this.field_31799); var7++) {
               int var8 = var5 + var7 * class_573.method_2717(this.field_31799) + var6;
               var3[var7] = this.field_31797[var8];
            }

            class_573.method_2711(this.field_31799).method_44821(var3, this.field_31794);

            for (int var9 = 0; var9 < class_573.method_2721(this.field_31799); var9++) {
               int var10 = var5 + var9 * class_573.method_2717(this.field_31799) + var6;
               this.field_31797[var10] = var3[var9];
            }
         }
      }
   }
}
