package mapped;

public class Class4743 extends Class4742 {
   private static String[] field22496;
   public static final float[] field22497 = new float[]{
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
   public static final float[] field22498 = new float[]{
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
   public int field22499;
   public int field22500;
   public int field22501;
   public float field22502;
   public int field22503;
   public float field22504;
   public float field22505;
   public float field22506;

   public Class4743(int var1) {
      this.field22499 = var1;
      this.field22500 = 0;
   }

   @Override
   public void method14883(Class2443 var1, Class7413 var2, Class8428 var3) throws Class2438 {
      if ((this.field22501 = var1.method10451(4)) != 15) {
         if (var3 != null) {
            var3.method29609(this.field22501, 4);
         }

         if (this.field22501 != 0) {
            this.field22503 = this.field22501 + 1;
            this.field22505 = field22497[this.field22501];
            this.field22506 = field22498[this.field22501];
         }
      } else {
         throw new Class2438(514, null);
      }
   }

   @Override
   public void method14885(Class2443 var1, Class7413 var2) {
      if (this.field22501 != 0) {
         this.field22502 = field22495[var1.method10451(6)];
      }
   }

   @Override
   public boolean method14886(Class2443 var1) {
      if (this.field22501 != 0) {
         this.field22504 = (float)var1.method10451(this.field22503);
      }

      if (++this.field22500 != 12) {
         return false;
      } else {
         this.field22500 = 0;
         return true;
      }
   }

   @Override
   public boolean method14887(int var1, Class7870 var2, Class7870 var3) {
      if (this.field22501 != 0 && var1 != 2) {
         float var6 = (this.field22504 * this.field22505 + this.field22506) * this.field22502;
         var2.method26365(var6, this.field22499);
      }

      return true;
   }
}
