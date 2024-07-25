package remapped;

public class class_7397 {
   private static String[] field_37764;
   private float field_37760 = Float.MAX_VALUE;
   private float field_37761 = Float.MAX_VALUE;
   private float field_37763 = Float.MAX_VALUE;
   private float field_37762 = -Float.MAX_VALUE;
   private float field_37759 = -Float.MAX_VALUE;
   private float field_37765 = -Float.MAX_VALUE;

   public class_7397(int[] var1) {
      int var4 = var1.length / 4;

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = var5 * var4;
         float var7 = Float.intBitsToFloat(var1[var6 + 0]);
         float var8 = Float.intBitsToFloat(var1[var6 + 1]);
         float var9 = Float.intBitsToFloat(var1[var6 + 2]);
         if (this.field_37760 > var7) {
            this.field_37760 = var7;
         }

         if (this.field_37761 > var8) {
            this.field_37761 = var8;
         }

         if (this.field_37763 > var9) {
            this.field_37763 = var9;
         }

         if (this.field_37762 < var7) {
            this.field_37762 = var7;
         }

         if (this.field_37759 < var8) {
            this.field_37759 = var8;
         }

         if (this.field_37765 < var9) {
            this.field_37765 = var9;
         }
      }
   }

   public float method_33690() {
      return this.field_37760;
   }

   public float method_33691() {
      return this.field_37761;
   }

   public float method_33686() {
      return this.field_37763;
   }

   public float method_33692() {
      return this.field_37762;
   }

   public float method_33685() {
      return this.field_37759;
   }

   public float method_33689() {
      return this.field_37765;
   }

   public boolean method_33684(Direction var1) {
      float var4;
      float var5;
      float var6;
      switch (var1) {
         case field_802:
            var4 = this.method_33691();
            var5 = this.method_33685();
            var6 = 0.0F;
            break;
         case field_817:
            var4 = this.method_33691();
            var5 = this.method_33685();
            var6 = 1.0F;
            break;
         case field_818:
            var4 = this.method_33686();
            var5 = this.method_33689();
            var6 = 0.0F;
            break;
         case field_800:
            var4 = this.method_33686();
            var5 = this.method_33689();
            var6 = 1.0F;
            break;
         case field_809:
            var4 = this.method_33690();
            var5 = this.method_33692();
            var6 = 0.0F;
            break;
         case field_804:
            var4 = this.method_33690();
            var5 = this.method_33692();
            var6 = 1.0F;
            break;
         default:
            return false;
      }

      return var4 == var6 && var5 == var6;
   }

   public boolean method_33688(Direction var1) {
      float var4;
      float var5;
      float var6;
      float var7;
      switch (var1) {
         case field_802:
         case field_817:
            var4 = this.method_33690();
            var5 = this.method_33692();
            var6 = this.method_33686();
            var7 = this.method_33689();
            break;
         case field_818:
         case field_800:
            var4 = this.method_33690();
            var5 = this.method_33692();
            var6 = this.method_33691();
            var7 = this.method_33685();
            break;
         case field_809:
         case field_804:
            var4 = this.method_33691();
            var5 = this.method_33685();
            var6 = this.method_33686();
            var7 = this.method_33689();
            break;
         default:
            return false;
      }

      return var4 == 0.0F && var5 == 1.0F && var6 == 0.0F && var7 == 1.0F;
   }
}
