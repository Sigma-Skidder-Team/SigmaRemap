package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class class_3993 {
   private final List<class_4331> field_19407 = new ArrayList<class_4331>();
   private final class_8067 field_19405;
   private final int field_19404;
   private int field_19399;
   public class_4331[] field_19403 = new class_4331[8];
   public int field_19401 = this.field_19403.length - 1;
   public int field_19400 = 0;
   public int field_19402 = 0;

   public class_3993(int var1, class_5322 var2) {
      this(var1, var1, var2);
   }

   public class_3993(int var1, int var2, class_5322 var3) {
      this.field_19404 = var1;
      this.field_19399 = var2;
      this.field_19405 = class_1259.method_5671(var3);
   }

   public int method_18406() {
      return this.field_19399;
   }

   private void method_18407() {
      if (this.field_19399 < this.field_19402) {
         if (this.field_19399 != 0) {
            this.method_18405(this.field_19402 - this.field_19399);
         } else {
            this.method_18416();
         }
      }
   }

   private void method_18416() {
      Arrays.fill(this.field_19403, null);
      this.field_19401 = this.field_19403.length - 1;
      this.field_19400 = 0;
      this.field_19402 = 0;
   }

   private int method_18405(int var1) {
      int var4 = 0;
      if (var1 > 0) {
         for (int var5 = this.field_19403.length - 1; var5 >= this.field_19401 && var1 > 0; var5--) {
            var1 -= this.field_19403[var5].field_21067;
            this.field_19402 = this.field_19402 - this.field_19403[var5].field_21067;
            this.field_19400--;
            var4++;
         }

         System.arraycopy(this.field_19403, this.field_19401 + 1, this.field_19403, this.field_19401 + 1 + var4, this.field_19400);
         this.field_19401 += var4;
      }

      return var4;
   }

   public void method_18402() throws IOException {
      while (!this.field_19405.method_36605()) {
         int var3 = this.field_19405.method_36602() & 255;
         if (var3 == 128) {
            throw new IOException("index == 0");
         }

         if ((var3 & 128) != 128) {
            if (var3 != 64) {
               if ((var3 & 64) != 64) {
                  if ((var3 & 32) != 32) {
                     if (var3 != 16 && var3 != 0) {
                        int var6 = this.method_18404(var3, 15);
                        this.method_18403(var6 - 1);
                     } else {
                        this.method_18412();
                     }
                  } else {
                     this.field_19399 = this.method_18404(var3, 31);
                     if (this.field_19399 < 0 || this.field_19399 > this.field_19404) {
                        throw new IOException("Invalid dynamic table size update " + this.field_19399);
                     }

                     this.method_18407();
                  }
               } else {
                  int var5 = this.method_18404(var3, 63);
                  this.method_18400(var5 - 1);
               }
            } else {
               this.method_18415();
            }
         } else {
            int var4 = this.method_18404(var3, 127);
            this.method_18399(var4 - 1);
         }
      }
   }

   public List<class_4331> method_18410() {
      ArrayList var3 = new ArrayList<class_4331>(this.field_19407);
      this.field_19407.clear();
      return var3;
   }

   private void method_18399(int var1) throws IOException {
      if (!this.method_18401(var1)) {
         int var4 = this.method_18409(var1 - class_9533.field_48519.length);
         if (var4 < 0 || var4 > this.field_19403.length - 1) {
            throw new IOException("Header index too large " + (var1 + 1));
         }

         this.field_19407.add(this.field_19403[var4]);
      } else {
         class_4331 var5 = class_9533.field_48519[var1];
         this.field_19407.add(var5);
      }
   }

   private int method_18409(int var1) {
      return this.field_19401 + 1 + var1;
   }

   private void method_18403(int var1) throws IOException {
      class_9091 var4 = this.method_18408(var1);
      class_9091 var5 = this.method_18417();
      this.field_19407.add(new class_4331(var4, var5));
   }

   private void method_18412() throws IOException {
      class_9091 var3 = class_9533.method_43972(this.method_18417());
      class_9091 var4 = this.method_18417();
      this.field_19407.add(new class_4331(var3, var4));
   }

   private void method_18400(int var1) throws IOException {
      class_9091 var4 = this.method_18408(var1);
      class_9091 var5 = this.method_18417();
      this.method_18411(-1, new class_4331(var4, var5));
   }

   private void method_18415() throws IOException {
      class_9091 var3 = class_9533.method_43972(this.method_18417());
      class_9091 var4 = this.method_18417();
      this.method_18411(-1, new class_4331(var3, var4));
   }

   private class_9091 method_18408(int var1) {
      return !this.method_18401(var1)
         ? this.field_19403[this.method_18409(var1 - class_9533.field_48519.length)].field_21066
         : class_9533.field_48519[var1].field_21066;
   }

   private boolean method_18401(int var1) {
      return var1 >= 0 && var1 <= class_9533.field_48519.length - 1;
   }

   private void method_18411(int var1, class_4331 var2) {
      this.field_19407.add(var2);
      int var5 = var2.field_21067;
      if (var1 != -1) {
         var5 -= this.field_19403[this.method_18409(var1)].field_21067;
      }

      if (var5 <= this.field_19399) {
         int var6 = this.field_19402 + var5 - this.field_19399;
         int var7 = this.method_18405(var6);
         if (var1 != -1) {
            var1 += this.method_18409(var1) + var7;
            this.field_19403[var1] = var2;
         } else {
            if (this.field_19400 + 1 > this.field_19403.length) {
               class_4331[] var8 = new class_4331[this.field_19403.length * 2];
               System.arraycopy(this.field_19403, 0, var8, this.field_19403.length, this.field_19403.length);
               this.field_19401 = this.field_19403.length - 1;
               this.field_19403 = var8;
            }

            var1 = this.field_19401--;
            this.field_19403[var1] = var2;
            this.field_19400++;
         }

         this.field_19402 += var5;
      } else {
         this.method_18416();
      }
   }

   private int method_18413() throws IOException {
      return this.field_19405.method_36602() & 0xFF;
   }

   public int method_18404(int var1, int var2) throws IOException {
      int var5 = var1 & var2;
      if (var5 >= var2) {
         byte var7 = 0;
         int var8 = this.method_18413();
         return var2 + (var8 << var7);
      } else {
         return var5;
      }
   }

   public class_9091 method_18417() throws IOException {
      int var3 = this.method_18413();
      boolean var4 = (var3 & 128) == 128;
      int var5 = this.method_18404(var3, 127);
      return !var4
         ? this.field_19405.method_36587((long)var5)
         : class_9091.method_41910(class_1230.method_5476().method_5474(this.field_19405.method_36600((long)var5)));
   }
}
