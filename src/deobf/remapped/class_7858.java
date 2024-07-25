package remapped;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class class_7858 {
   private static String[] field_39830;
   private static final int field_39827 = 4096;
   private static final int field_39828 = 16384;
   private final class_7059 field_39820;
   private final boolean field_39824;
   private int field_39832 = Integer.MAX_VALUE;
   private boolean field_39826;
   public int field_39825;
   public int field_39822;
   public class_4331[] field_39821 = new class_4331[8];
   public int field_39823 = this.field_39821.length - 1;
   public int field_39831 = 0;
   public int field_39829 = 0;

   public class_7858(class_7059 var1) {
      this(4096, true, var1);
   }

   public class_7858(int var1, boolean var2, class_7059 var3) {
      this.field_39825 = var1;
      this.field_39822 = var1;
      this.field_39824 = var2;
      this.field_39820 = var3;
   }

   private void method_35541() {
      Arrays.fill(this.field_39821, null);
      this.field_39823 = this.field_39821.length - 1;
      this.field_39831 = 0;
      this.field_39829 = 0;
   }

   private int method_35540(int var1) {
      int var4 = 0;
      if (var1 > 0) {
         for (int var5 = this.field_39821.length - 1; var5 >= this.field_39823 && var1 > 0; var5--) {
            var1 -= this.field_39821[var5].field_21067;
            this.field_39829 = this.field_39829 - this.field_39821[var5].field_21067;
            this.field_39831--;
            var4++;
         }

         System.arraycopy(this.field_39821, this.field_39823 + 1, this.field_39821, this.field_39823 + 1 + var4, this.field_39831);
         Arrays.fill(this.field_39821, this.field_39823 + 1, this.field_39823 + 1 + var4, null);
         this.field_39823 += var4;
      }

      return var4;
   }

   private void method_35542(class_4331 var1) {
      int var4 = var1.field_21067;
      if (var4 <= this.field_39822) {
         int var5 = this.field_39829 + var4 - this.field_39822;
         this.method_35540(var5);
         if (this.field_39831 + 1 > this.field_39821.length) {
            class_4331[] var6 = new class_4331[this.field_39821.length * 2];
            System.arraycopy(this.field_39821, 0, var6, this.field_39821.length, this.field_39821.length);
            this.field_39823 = this.field_39821.length - 1;
            this.field_39821 = var6;
         }

         int var7 = this.field_39823--;
         this.field_39821[var7] = var1;
         this.field_39831++;
         this.field_39829 += var4;
      } else {
         this.method_35541();
      }
   }

   public void method_35538(List<class_4331> var1) throws IOException {
      if (this.field_39826) {
         if (this.field_39832 < this.field_39822) {
            this.method_35543(this.field_39832, 31, 32);
         }

         this.field_39826 = false;
         this.field_39832 = Integer.MAX_VALUE;
         this.method_35543(this.field_39822, 31, 32);
      }

      int var4 = 0;

      for (int var5 = var1.size(); var4 < var5; var4++) {
         class_4331 var6 = (class_4331)var1.get(var4);
         class_9091 var7 = var6.field_21066.method_41870();
         class_9091 var8 = var6.field_21065;
         int var9 = -1;
         int var10 = -1;
         Integer var11 = class_9533.field_48518.get(var7);
         if (var11 != null) {
            var10 = var11 + 1;
            if (var10 > 1 && var10 < 8) {
               if (!class_8515.method_39214(class_9533.field_48519[var10 - 1].field_21065, var8)) {
                  if (class_8515.method_39214(class_9533.field_48519[var10].field_21065, var8)) {
                     var9 = var10 + 1;
                  }
               } else {
                  var9 = var10;
               }
            }
         }

         if (var9 == -1) {
            int var12 = this.field_39823 + 1;

            for (int var13 = this.field_39821.length; var12 < var13; var12++) {
               if (class_8515.method_39214(this.field_39821[var12].field_21066, var7)) {
                  if (class_8515.method_39214(this.field_39821[var12].field_21065, var8)) {
                     var9 = var12 - this.field_39823 + class_9533.field_48519.length;
                     break;
                  }

                  if (var10 == -1) {
                     var10 = var12 - this.field_39823 + class_9533.field_48519.length;
                  }
               }
            }
         }

         if (var9 == -1) {
            if (var10 != -1) {
               if (var7.method_41912(class_4331.field_21062) && !class_4331.field_21068.equals(var7)) {
                  this.method_35543(var10, 15, 0);
                  this.method_35536(var8);
               } else {
                  this.method_35543(var10, 63, 64);
                  this.method_35536(var8);
                  this.method_35542(var6);
               }
            } else {
               this.field_39820.method_32494(64);
               this.method_35536(var7);
               this.method_35536(var8);
               this.method_35542(var6);
            }
         } else {
            this.method_35543(var9, 127, 128);
         }
      }
   }

   public void method_35543(int var1, int var2, int var3) {
      if (var1 < var2) {
         this.field_39820.method_32494(var3 | var1);
      } else {
         this.field_39820.method_32494(var3 | var2);

         for (var1 -= var2; var1 >= 128; var1 >>>= 7) {
            int var6 = var1 & 127;
            this.field_39820.method_32494(var6 | 128);
         }

         this.field_39820.method_32494(var1);
      }
   }

   public void method_35536(class_9091 var1) throws IOException {
      if (this.field_39824 && class_1230.method_5476().method_5478(var1) < var1.method_41902()) {
         class_7059 var4 = new class_7059();
         class_1230.method_5476().method_5475(var1, var4);
         class_9091 var5 = var4.method_36586();
         this.method_35543(var5.method_41902(), 127, 128);
         this.field_39820.method_32487(var5);
      } else {
         this.method_35543(var1.method_41902(), 127, 0);
         this.field_39820.method_32487(var1);
      }
   }

   public void method_35537(int var1) {
      this.field_39825 = var1;
      int var4 = Math.min(var1, 16384);
      if (this.field_39822 != var4) {
         if (var4 < this.field_39822) {
            this.field_39832 = Math.min(this.field_39832, var4);
         }

         this.field_39826 = true;
         this.field_39822 = var4;
         this.method_35535();
      }
   }

   private void method_35535() {
      if (this.field_39822 < this.field_39829) {
         if (this.field_39822 != 0) {
            this.method_35540(this.field_39829 - this.field_39822);
         } else {
            this.method_35541();
         }
      }
   }
}
