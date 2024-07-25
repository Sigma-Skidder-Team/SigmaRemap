package remapped;

import jaco.mp3.resources.DecoderException;

public class class_6364 extends class_4420 {
   private static String[] field_32540;
   public static final float[] field_32533 = new float[]{
      0.0F,
      0.6666667F,
      0.2857143F,
      0.13333334F,
      0.06451613F,
      0.031746034F,
      0.015748031F,
      0.007843138F,
      0.0039138943F,
      0.0019550342F,
      9.770396E-4F,
      4.884005E-4F,
      2.4417043E-4F,
      1.2207776E-4F,
      6.103702E-5F
   };
   public static final float[] field_32534 = new float[]{
      0.0F,
      -0.6666667F,
      -0.8571429F,
      -0.9333334F,
      -0.9677419F,
      -0.98412704F,
      -0.992126F,
      -0.9960785F,
      -0.99804306F,
      -0.9990225F,
      -0.9995115F,
      -0.99975586F,
      -0.9998779F,
      -0.99993896F,
      -0.9999695F
   };
   public int field_32538;
   public int field_32530;
   public int field_32535;
   public float field_32536;
   public int field_32531;
   public float field_32537;
   public float field_32532;
   public float field_32539;

   public class_6364(int var1) {
      this.field_32538 = var1;
      this.field_32530 = 0;
   }

   @Override
   public void method_20555(class_8212 var1, class_1915 var2, class_4546 var3) throws DecoderException {
      if ((this.field_32535 = var1.method_37602(4)) != 15) {
         if (var3 != null) {
            var3.method_21089(this.field_32535, 4);
         }

         if (this.field_32535 != 0) {
            this.field_32531 = this.field_32535 + 1;
            this.field_32532 = field_32533[this.field_32535];
            this.field_32539 = field_32534[this.field_32535];
         }
      } else {
         throw new class_477(514, null);
      }
   }

   @Override
   public void method_20558(class_8212 var1, class_1915 var2) {
      if (this.field_32535 != 0) {
         this.field_32536 = field_21609[var1.method_37602(6)];
      }
   }

   @Override
   public boolean method_20556(class_8212 var1) {
      if (this.field_32535 != 0) {
         this.field_32537 = (float)var1.method_37602(this.field_32531);
      }

      if (++this.field_32530 != 12) {
         return false;
      } else {
         this.field_32530 = 0;
         return true;
      }
   }

   @Override
   public boolean method_20554(int var1, class_2948 var2, class_2948 var3) {
      if (this.field_32535 != 0 && var1 != 2) {
         float var6 = (this.field_32537 * this.field_32532 + this.field_32539) * this.field_32536;
         var2.method_13496(var6, this.field_32538);
      }

      return true;
   }
}
