package remapped;

public class class_8327 extends class_2308 {
   private static String[] field_42639;
   public int field_42641;
   public int field_42635;
   public float field_42644;
   public float field_42638;
   public float field_42642;
   public int[] field_42636 = new int[]{0};
   public float[] field_42637 = new float[]{0.0F};
   public float[] field_42640;
   public float[] field_42643 = new float[]{0.0F};
   public float[] field_42645 = new float[]{0.0F};

   public class_8327(int var1) {
      super(var1);
      this.field_42640 = new float[3];
   }

   @Override
   public void method_20555(class_8212 var1, class_1915 var2, class_4546 var3) {
      int var6 = this.method_10612(var2);
      this.field_11535 = var1.method_37602(var6);
      this.field_42641 = var1.method_37602(var6);
      if (var3 != null) {
         var3.method_21089(this.field_11535, var6);
         var3.method_21089(this.field_42641, var6);
      }
   }

   @Override
   public void method_10613(class_8212 var1, class_4546 var2) {
      if (this.field_11535 != 0) {
         this.field_11549 = var1.method_37602(2);
         if (var2 != null) {
            var2.method_21089(this.field_11549, 2);
         }
      }

      if (this.field_42641 != 0) {
         this.field_42635 = var1.method_37602(2);
         if (var2 != null) {
            var2.method_21089(this.field_42635, 2);
         }
      }
   }

   @Override
   public void method_20558(class_8212 var1, class_1915 var2) {
      super.method_20558(var1, var2);
      if (this.field_42641 != 0) {
         switch (this.field_42635) {
            case 0:
               this.field_42644 = field_21609[var1.method_37602(6)];
               this.field_42638 = field_21609[var1.method_37602(6)];
               this.field_42642 = field_21609[var1.method_37602(6)];
               break;
            case 1:
               this.field_42644 = this.field_42638 = field_21609[var1.method_37602(6)];
               this.field_42642 = field_21609[var1.method_37602(6)];
               break;
            case 2:
               this.field_42644 = this.field_42638 = this.field_42642 = field_21609[var1.method_37602(6)];
               break;
            case 3:
               this.field_42644 = field_21609[var1.method_37602(6)];
               this.field_42638 = this.field_42642 = field_21609[var1.method_37602(6)];
         }

         this.method_10611(var2, this.field_42641, 1, this.field_42637, this.field_42636, this.field_42643, this.field_42645);
      }
   }

   @Override
   public boolean method_20556(class_8212 var1) {
      boolean var4 = super.method_20556(var1);
      if (this.field_42641 != 0) {
         if (this.field_11533[1] == null) {
            this.field_42640[0] = (float)((double)((float)var1.method_37602(this.field_42636[0]) * this.field_42637[0]) - 1.0);
            this.field_42640[1] = (float)((double)((float)var1.method_37602(this.field_42636[0]) * this.field_42637[0]) - 1.0);
            this.field_42640[2] = (float)((double)((float)var1.method_37602(this.field_42636[0]) * this.field_42637[0]) - 1.0);
         } else {
            int var5 = var1.method_37602(this.field_42636[0]);
            var5 += var5 << 1;
            float[] var6 = this.field_42640;
            float[] var7 = this.field_11533[1];
            int var8 = 0;
            var6[var8] = var7[var5];
            int var9 = var5 + 1;
            var8++;
            var6[var8] = var7[var9];
            var9++;
            var8++;
            var6[var8] = var7[var9];
         }
      }

      return var4;
   }

   @Override
   public boolean method_20554(int var1, class_2948 var2, class_2948 var3) {
      boolean var6 = super.method_20554(var1, var2, var3);
      if (this.field_42641 != 0 && var1 != 1) {
         float var7 = this.field_42640[this.field_11546 - 1];
         if (this.field_11533[1] == null) {
            var7 = (var7 + this.field_42645[0]) * this.field_42643[0];
         }

         if (this.field_11513 > 4) {
            if (this.field_11513 > 8) {
               var7 *= this.field_42642;
            } else {
               var7 *= this.field_42638;
            }
         } else {
            var7 *= this.field_42644;
         }

         if (var1 != 0) {
            var2.method_13496(var7, this.field_11545);
         } else {
            var3.method_13496(var7, this.field_11545);
         }
      }

      return var6;
   }
}
