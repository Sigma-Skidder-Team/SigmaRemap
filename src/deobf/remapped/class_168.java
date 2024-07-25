package remapped;

public class class_168 {
   public static class_1299 field_526 = class_3980.method_18363();
   public static final int field_507 = 1;
   public static final int field_515 = 2;
   public static final int field_508 = 3;
   public float field_512;
   public float field_523;
   public float field_522;
   public float field_513;
   public float field_520 = 10.0F;
   public class_8709 field_519 = class_8709.field_44646;
   public float field_518;
   public float field_509;
   private class_8095 field_521;
   private class_3377 field_511;
   public class_8112 field_517;
   public int field_510;
   public int field_516 = 1;
   public boolean field_514 = false;
   public float field_524 = 1.0F;

   public class_168(class_8095 var1) {
      this.field_521 = var1;
   }

   public float method_701() {
      return this.field_512;
   }

   public float method_689() {
      return this.field_523;
   }

   public void method_698(float var1, float var2) {
      this.field_512 += var1;
      this.field_523 += var2;
   }

   public float method_680() {
      return this.field_520;
   }

   public class_8709 method_696() {
      return this.field_519;
   }

   public void method_674(class_8112 var1) {
      this.field_517 = var1;
   }

   public float method_700() {
      return this.field_509;
   }

   public float method_673() {
      return this.field_518;
   }

   public boolean method_686() {
      return this.field_518 > 0.0F;
   }

   public void method_684() {
      if ((!this.field_521.method_36760() || this.field_516 != 1) && this.field_516 != 2) {
         if (!this.field_514 && this.field_524 == 1.0F) {
            this.field_519.method_40021();
            this.field_517
               .method_36903(
                  (float)((int)(this.field_512 - this.field_520 / 2.0F)),
                  (float)((int)(this.field_523 - this.field_520 / 2.0F)),
                  (float)((int)this.field_520),
                  (float)((int)this.field_520)
               );
         } else {
            field_526.method_5899();
            field_526.method_5902(this.field_512, this.field_523, 0.0F);
            if (this.field_514) {
               float var3 = (float)(Math.atan2((double)this.field_523, (double)this.field_512) * 180.0 / Math.PI);
               field_526.method_5937(var3, 0.0F, 0.0F, 1.0F);
            }

            field_526.method_5895(1.0F, this.field_524, 1.0F);
            this.field_517
               .method_36892(
                  (float)((int)(-(this.field_520 / 2.0F))),
                  (float)((int)(-(this.field_520 / 2.0F))),
                  (float)((int)this.field_520),
                  (float)((int)this.field_520),
                  this.field_519
               );
            field_526.method_5900();
         }
      } else {
         class_9162.method_42217();
         field_526.method_5911(2832);
         field_526.method_5910(this.field_520 / 2.0F);
         this.field_519.method_40021();
         field_526.method_5934(0);
         field_526.method_5919(this.field_512, this.field_523);
         field_526.method_5940();
      }
   }

   public void method_699(int var1) {
      this.field_511.method_15574(this, var1);
      this.field_518 -= (float)var1;
      if (!(this.field_518 > 0.0F)) {
         this.field_521.method_36776(this);
      } else {
         this.field_512 = this.field_512 + (float)var1 * this.field_522;
         this.field_523 = this.field_523 + (float)var1 * this.field_513;
      }
   }

   public void method_670(class_3377 var1, float var2) {
      this.field_512 = 0.0F;
      this.field_511 = var1;
      this.field_523 = 0.0F;
      this.field_522 = 0.0F;
      this.field_513 = 0.0F;
      this.field_520 = 10.0F;
      this.field_510 = 0;
      this.field_509 = this.field_518 = var2;
      this.field_514 = false;
      this.field_524 = 1.0F;
   }

   public void method_702(int var1) {
      this.field_510 = var1;
   }

   public void method_679(int var1) {
      this.field_516 = var1;
   }

   public int method_672() {
      return this.field_510;
   }

   public void method_692(float var1) {
      this.field_520 = var1;
   }

   public void method_688(float var1) {
      this.field_520 += var1;
      this.field_520 = Math.max(0.0F, this.field_520);
   }

   public void method_671(float var1) {
      this.field_518 = var1;
   }

   public void method_695(float var1) {
      this.field_518 += var1;
   }

   public void method_685() {
      this.field_518 = 1.0F;
   }

   public void method_690(float var1, float var2, float var3, float var4) {
      if (this.field_519 != class_8709.field_44646) {
         this.field_519.field_44663 = var1;
         this.field_519.field_44649 = var2;
         this.field_519.field_44648 = var3;
         this.field_519.field_44645 = var4;
      } else {
         this.field_519 = new class_8709(var1, var2, var3, var4);
      }
   }

   public void method_681(float var1, float var2) {
      this.field_512 = var1;
      this.field_523 = var2;
   }

   public void method_669(float var1, float var2, float var3) {
      this.field_522 = var1 * var3;
      this.field_513 = var2 * var3;
   }

   public void method_676(float var1) {
      float var4 = (float)Math.sqrt((double)(this.field_522 * this.field_522 + this.field_513 * this.field_513));
      this.field_522 *= var1;
      this.field_513 *= var1;
      this.field_522 /= var4;
      this.field_513 /= var4;
   }

   public void method_668(float var1, float var2) {
      this.method_669(var1, var2, 1.0F);
   }

   public void method_683(float var1, float var2) {
      this.field_512 += var1;
      this.field_523 += var2;
   }

   public void method_677(float var1, float var2, float var3, float var4) {
      if (this.field_519 == class_8709.field_44646) {
         this.field_519 = new class_8709(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.field_519.field_44663 += var1;
      this.field_519.field_44649 += var2;
      this.field_519.field_44648 += var3;
      this.field_519.field_44645 += var4;
   }

   public void method_678(int var1, int var2, int var3, int var4) {
      if (this.field_519 == class_8709.field_44646) {
         this.field_519 = new class_8709(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.field_519.field_44663 += (float)var1 / 255.0F;
      this.field_519.field_44649 += (float)var2 / 255.0F;
      this.field_519.field_44648 += (float)var3 / 255.0F;
      this.field_519.field_44645 += (float)var4 / 255.0F;
   }

   public void method_687(float var1, float var2) {
      this.field_522 += var1;
      this.field_513 += var2;
   }

   public class_3377 method_697() {
      return this.field_511;
   }

   @Override
   public String toString() {
      return super.toString() + " : " + this.field_518;
   }

   public boolean method_682() {
      return this.field_514;
   }

   public void method_693(boolean var1) {
      this.field_514 = var1;
   }

   public float method_675() {
      return this.field_524;
   }

   public void method_694(float var1) {
      this.field_524 = var1;
   }
}
