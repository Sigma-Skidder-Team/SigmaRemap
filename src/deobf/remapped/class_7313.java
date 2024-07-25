package remapped;

public class class_7313 implements Runnable {
   private static String[] field_37392;

   public class_7313(class_3101 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_37390 = var1;
      this.field_37393 = var2;
      this.field_37389 = var3;
      this.field_37391 = var4;
      this.field_37394 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14204(this.field_37390)];

      for (int var4 = this.field_37393; var4 < this.field_37389; var4++) {
         for (int var5 = 0; var5 < class_3101.method_14191(this.field_37390); var5++) {
            for (int var6 = 0; var6 < class_3101.method_14204(this.field_37390); var6++) {
               var3[var6] = this.field_37391[var4][var6][var5];
            }

            class_3101.method_14199(this.field_37390).method_19204(var3, this.field_37394);

            for (int var7 = 0; var7 < class_3101.method_14204(this.field_37390); var7++) {
               this.field_37391[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
