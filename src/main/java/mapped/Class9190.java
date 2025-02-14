package mapped;

import net.minecraft.util.Direction;

public class Class9190 {
   private static String[] field42206;
   private float field42207 = Float.MAX_VALUE;
   private float field42208 = Float.MAX_VALUE;
   private float field42209 = Float.MAX_VALUE;
   private float field42210 = -Float.MAX_VALUE;
   private float field42211 = -Float.MAX_VALUE;
   private float field42212 = -Float.MAX_VALUE;

   public Class9190(int[] var1) {
      int var4 = var1.length / 4;

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = var5 * var4;
         float var7 = Float.intBitsToFloat(var1[var6 + 0]);
         float var8 = Float.intBitsToFloat(var1[var6 + 1]);
         float var9 = Float.intBitsToFloat(var1[var6 + 2]);
         if (this.field42207 > var7) {
            this.field42207 = var7;
         }

         if (this.field42208 > var8) {
            this.field42208 = var8;
         }

         if (this.field42209 > var9) {
            this.field42209 = var9;
         }

         if (this.field42210 < var7) {
            this.field42210 = var7;
         }

         if (this.field42211 < var8) {
            this.field42211 = var8;
         }

         if (this.field42212 < var9) {
            this.field42212 = var9;
         }
      }
   }

   public float method34405() {
      return this.field42207;
   }

   public float method34406() {
      return this.field42208;
   }

   public float method34407() {
      return this.field42209;
   }

   public float method34408() {
      return this.field42210;
   }

   public float method34409() {
      return this.field42211;
   }

   public float method34410() {
      return this.field42212;
   }

   public boolean method34411(Direction var1) {
      float var4;
      float var5;
      float var6;
      switch (Class6012.field26198[var1.ordinal()]) {
         case 1:
            var4 = this.method34406();
            var5 = this.method34409();
            var6 = 0.0F;
            break;
         case 2:
            var4 = this.method34406();
            var5 = this.method34409();
            var6 = 1.0F;
            break;
         case 3:
            var4 = this.method34407();
            var5 = this.method34410();
            var6 = 0.0F;
            break;
         case 4:
            var4 = this.method34407();
            var5 = this.method34410();
            var6 = 1.0F;
            break;
         case 5:
            var4 = this.method34405();
            var5 = this.method34408();
            var6 = 0.0F;
            break;
         case 6:
            var4 = this.method34405();
            var5 = this.method34408();
            var6 = 1.0F;
            break;
         default:
            return false;
      }

      return var4 == var6 && var5 == var6;
   }

   public boolean method34412(Direction var1) {
      float var4;
      float var5;
      float var6;
      float var7;
      switch (Class6012.field26198[var1.ordinal()]) {
         case 1:
         case 2:
            var4 = this.method34405();
            var5 = this.method34408();
            var6 = this.method34407();
            var7 = this.method34410();
            break;
         case 3:
         case 4:
            var4 = this.method34405();
            var5 = this.method34408();
            var6 = this.method34406();
            var7 = this.method34409();
            break;
         case 5:
         case 6:
            var4 = this.method34406();
            var5 = this.method34409();
            var6 = this.method34407();
            var7 = this.method34410();
            break;
         default:
            return false;
      }

      return var4 == 0.0F && var5 == 1.0F && var6 == 0.0F && var7 == 1.0F;
   }
}
