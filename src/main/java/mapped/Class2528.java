package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class2528 extends Class2527 {
   public static final int field16706 = 1;
   public static final int field16707 = 2;
   public static final int field16708 = 4;
   public static final int field16709 = 8;
   public static final int field16710 = 15;
   private static final int field16711 = 25;
   private float field16712;
   private int field16713;
   private int field16714;

   public Class2528(float var1, float var2, float var3, float var4, float var5) {
      this(var1, var2, var3, var4, var5, 25);
   }

   public Class2528(float var1, float var2, float var3, float var4, float var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, 15);
   }

   public Class2528(float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      super(var1, var2, var3, var4);
      if (!(var5 < 0.0F)) {
         this.field16673 = var1;
         this.field16674 = var2;
         this.field16704 = var3;
         this.field16705 = var4;
         this.field16712 = var5;
         this.field16713 = var6;
         this.field16680 = true;
         this.field16714 = var7;
      } else {
         throw new IllegalArgumentException("corner radius must be >= 0");
      }
   }

   public float method10654() {
      return this.field16712;
   }

   public void method10655(float var1) {
      if (var1 >= 0.0F && var1 != this.field16712) {
         this.field16712 = var1;
         this.field16680 = true;
      }
   }

   @Override
   public float method10617() {
      return this.field16705;
   }

   @Override
   public void method10651(float var1) {
      if (this.field16705 != var1) {
         this.field16705 = var1;
         this.field16680 = true;
      }
   }

   @Override
   public float method10616() {
      return this.field16704;
   }

   @Override
   public void method10650(float var1) {
      if (var1 != this.field16704) {
         this.field16704 = var1;
         this.field16680 = true;
      }
   }

   @Override
   public void method10578() {
      this.field16675 = this.field16673 + this.field16704;
      this.field16676 = this.field16674 + this.field16705;
      this.field16677 = this.field16673;
      this.field16678 = this.field16674;
      float var3 = this.field16704 - 1.0F;
      float var4 = this.field16705 - 1.0F;
      if (this.field16712 != 0.0F) {
         float var5 = this.field16712 * 2.0F;
         if (var5 > var3) {
            var5 = var3;
            this.field16712 = var3 / 2.0F;
         }

         if (var5 > var4) {
            this.field16712 = var4 / 2.0F;
         }

         ArrayList var6 = new ArrayList();
         if ((this.field16714 & 1) == 0) {
            var6.add(new Float(this.field16673));
            var6.add(new Float(this.field16674));
         } else {
            var6.addAll(
               this.method10656(this.field16713, this.field16712, this.field16673 + this.field16712, this.field16674 + this.field16712, 180.0F, 270.0F)
            );
         }

         if ((this.field16714 & 2) == 0) {
            var6.add(new Float(this.field16673 + var3));
            var6.add(new Float(this.field16674));
         } else {
            var6.addAll(
               this.method10656(this.field16713, this.field16712, this.field16673 + var3 - this.field16712, this.field16674 + this.field16712, 270.0F, 360.0F)
            );
         }

         if ((this.field16714 & 4) == 0) {
            var6.add(new Float(this.field16673 + var3));
            var6.add(new Float(this.field16674 + var4));
         } else {
            var6.addAll(
               this.method10656(
                  this.field16713, this.field16712, this.field16673 + var3 - this.field16712, this.field16674 + var4 - this.field16712, 0.0F, 90.0F
               )
            );
         }

         if ((this.field16714 & 8) == 0) {
            var6.add(new Float(this.field16673));
            var6.add(new Float(this.field16674 + var4));
         } else {
            var6.addAll(
               this.method10656(this.field16713, this.field16712, this.field16673 + this.field16712, this.field16674 + var4 - this.field16712, 90.0F, 180.0F)
            );
         }

         this.field16671 = new float[var6.size()];

         for (int var7 = 0; var7 < var6.size(); var7++) {
            this.field16671[var7] = (Float)var6.get(var7);
         }
      } else {
         this.field16671 = new float[8];
         this.field16671[0] = this.field16673;
         this.field16671[1] = this.field16674;
         this.field16671[2] = this.field16673 + var3;
         this.field16671[3] = this.field16674;
         this.field16671[4] = this.field16673 + var3;
         this.field16671[5] = this.field16674 + var4;
         this.field16671[6] = this.field16673;
         this.field16671[7] = this.field16674 + var4;
      }

      this.method10605();
      this.method10606();
   }

   private List method10656(int var1, float var2, float var3, float var4, float var5, float var6) {
      ArrayList var9 = new ArrayList();
      int var10 = 360 / var1;

      for (float var11 = var5; var11 <= var6 + (float)var10; var11 += (float)var10) {
         float var12 = var11;
         if (var11 > var6) {
            var12 = var6;
         }

         float var13 = (float)((double)var3 + Class4835.method14957(Math.toRadians((double)var12)) * (double)var2);
         float var14 = (float)((double)var4 + Class4835.method14956(Math.toRadians((double)var12)) * (double)var2);
         var9.add(new Float(var13));
         var9.add(new Float(var14));
      }

      return var9;
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      this.method10610();
      Class2526 var4 = new Class2526();
      float[] var5 = new float[this.field16671.length];
      var1.method29529(this.field16671, 0, var5, 0, this.field16671.length / 2);
      var4.field16671 = var5;
      var4.method10605();
      return var4;
   }
}
