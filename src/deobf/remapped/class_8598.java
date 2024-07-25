package remapped;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8598 {
   private static final Logger field_44027 = LogManager.getLogger();
   public class_6331 field_44037;
   public class_9359 field_44036;
   private class_4666 field_44033 = class_4666.field_22762;
   private class_4666 field_44030 = class_4666.field_22762;
   private boolean field_44040;
   private int field_44032;
   private class_1331 field_44038 = class_1331.field_7306;
   private int field_44035;
   private boolean field_44031;
   private class_1331 field_44028 = class_1331.field_7306;
   private int field_44029;
   private int field_44039 = -1;

   public class_8598(class_6331 var1) {
      this.field_44037 = var1;
   }

   public void method_39526(class_4666 var1) {
      this.method_39516(var1, var1 == this.field_44033 ? this.field_44030 : this.field_44033);
   }

   public void method_39516(class_4666 var1, class_4666 var2) {
      this.field_44030 = var2;
      this.field_44033 = var1;
      var1.method_21584(this.field_44036.field_3876);
      this.field_44036.method_3216();
      this.field_44036.field_47801.method_1600().method_39972(new class_7867(class_2236.field_11147, this.field_44036));
      this.field_44037.method_28928();
   }

   public class_4666 method_39517() {
      return this.field_44033;
   }

   public class_4666 method_39524() {
      return this.field_44030;
   }

   public boolean method_39515() {
      return this.field_44033.method_21593();
   }

   public boolean method_39519() {
      return this.field_44033.method_21587();
   }

   public void method_39521(class_4666 var1) {
      if (this.field_44033 == class_4666.field_22762) {
         this.field_44033 = var1;
      }

      this.method_39526(this.field_44033);
   }

   public void method_39514() {
      this.field_44035++;
      if (!this.field_44031) {
         if (this.field_44040) {
            class_2522 var3 = this.field_44037.method_28262(this.field_44038);
            if (!var3.method_8345()) {
               this.method_39522(var3, this.field_44038, this.field_44032);
            } else {
               this.field_44037.method_29568(this.field_44036.method_37145(), this.field_44038, -1);
               this.field_44039 = -1;
               this.field_44040 = false;
            }
         }
      } else {
         class_2522 var5 = this.field_44037.method_28262(this.field_44028);
         if (!var5.method_8345()) {
            float var4 = this.method_39522(var5, this.field_44028, this.field_44029);
            if (var4 >= 1.0F) {
               this.field_44031 = false;
               this.method_39518(this.field_44028);
            }
         } else {
            this.field_44031 = false;
         }
      }
   }

   private float method_39522(class_2522 var1, class_1331 var2, int var3) {
      int var6 = this.field_44035 - var3;
      float var7 = var1.method_8311(this.field_44036, this.field_44036.field_41768, var2) * (float)(var6 + 1);
      int var8 = (int)(var7 * 10.0F);
      if (var8 != this.field_44039) {
         this.field_44037.method_29568(this.field_44036.method_37145(), var2, var8);
         this.field_44039 = var8;
      }

      return var7;
   }

   public void method_39523(class_1331 var1, class_7500 var2, class_240 var3, int var4) {
      double var7 = this.field_44036.method_37302() - ((double)var1.method_12173() + 0.5);
      double var9 = this.field_44036.method_37309() - ((double)var1.method_12165() + 0.5) + 1.5;
      double var11 = this.field_44036.method_37156() - ((double)var1.method_12185() + 0.5);
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      if (!(var13 > 36.0)) {
         if (var1.method_12165() < var4) {
            if (var2 != class_7500.field_38263) {
               if (var2 != class_7500.field_38258) {
                  if (var2 == class_7500.field_38264) {
                     this.field_44040 = false;
                     if (!Objects.equals(this.field_44038, var1)) {
                        field_44027.warn("Mismatch in destroy block pos: " + this.field_44038 + " " + var1);
                        this.field_44037.method_29568(this.field_44036.method_37145(), this.field_44038, -1);
                        this.field_44036
                           .field_47794
                           .method_4156(
                              new class_7881(this.field_44038, this.field_44037.method_28262(this.field_44038), var2, true, "aborted mismatched destroying")
                           );
                     }

                     this.field_44037.method_29568(this.field_44036.method_37145(), var1, -1);
                     this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, true, "aborted destroying"));
                  }
               } else {
                  if (var1.equals(this.field_44038)) {
                     int var15 = this.field_44035 - this.field_44032;
                     class_2522 var16 = this.field_44037.method_28262(var1);
                     if (!var16.method_8345()) {
                        float var17 = var16.method_8311(this.field_44036, this.field_44036.field_41768, var1) * (float)(var15 + 1);
                        if (var17 >= 0.7F) {
                           this.field_44040 = false;
                           this.field_44037.method_29568(this.field_44036.method_37145(), var1, -1);
                           this.method_39513(var1, var2, "destroyed");
                           return;
                        }

                        if (!this.field_44031) {
                           this.field_44040 = false;
                           this.field_44031 = true;
                           this.field_44028 = var1;
                           this.field_44029 = this.field_44032;
                        }
                     }
                  }

                  this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, true, "stopped destroying"));
               }
            } else {
               if (!this.field_44037.method_29538(this.field_44036, var1)) {
                  this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, false, "may not interact"));
                  return;
               }

               if (this.method_39519()) {
                  this.method_39513(var1, var2, "creative destroy");
                  return;
               }

               if (this.field_44036.method_3228(this.field_44037, var1, this.field_44033)) {
                  this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, false, "block action restricted"));
                  return;
               }

               this.field_44032 = this.field_44035;
               float var18 = 1.0F;
               class_2522 var19 = this.field_44037.method_28262(var1);
               if (!var19.method_8345()) {
                  var19.method_8307(this.field_44037, var1, this.field_44036);
                  var18 = var19.method_8311(this.field_44036, this.field_44036.field_41768, var1);
               }

               if (!var19.method_8345() && var18 >= 1.0F) {
                  this.method_39513(var1, var2, "insta mine");
               } else {
                  if (this.field_44040) {
                     this.field_44036
                        .field_47794
                        .method_4156(
                           new class_7881(
                              this.field_44038,
                              this.field_44037.method_28262(this.field_44038),
                              class_7500.field_38263,
                              false,
                              "abort destroying since another started (client insta mine, server disagreed)"
                           )
                        );
                  }

                  this.field_44040 = true;
                  this.field_44038 = var1.method_6072();
                  int var20 = (int)(var18 * 10.0F);
                  this.field_44037.method_29568(this.field_44036.method_37145(), var1, var20);
                  this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, true, "actual start of destroying"));
                  this.field_44039 = var20;
               }
            }
         } else {
            this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, false, "too high"));
         }
      } else {
         this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, false, "too far"));
      }
   }

   public void method_39513(class_1331 var1, class_7500 var2, String var3) {
      if (!this.method_39518(var1)) {
         this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, false, var3));
      } else {
         this.field_44036.field_47794.method_4156(new class_7881(var1, this.field_44037.method_28262(var1), var2, true, var3));
      }
   }

   public boolean method_39518(class_1331 var1) {
      class_2522 var4 = this.field_44037.method_28262(var1);
      if (!this.field_44036.method_26446().method_27960().method_11203(var4, this.field_44037, var1, this.field_44036)) {
         return false;
      } else {
         class_3757 var5 = this.field_44037.method_28260(var1);
         class_6414 var6 = var4.method_8360();
         if ((var6 instanceof class_8151 || var6 instanceof class_7297 || var6 instanceof class_195) && !this.field_44036.method_3184()) {
            this.field_44037.method_29572(var1, var4, var4, 3);
            return false;
         } else if (!this.field_44036.method_3228(this.field_44037, var1, this.field_44033)) {
            var6.method_29265(this.field_44037, var1, var4, this.field_44036);
            boolean var7 = this.field_44037.method_7508(var1, false);
            if (var7) {
               var6.method_29290(this.field_44037, var1, var4);
            }

            if (!this.method_39519()) {
               class_6098 var8 = this.field_44036.method_26446();
               class_6098 var9 = var8.method_27973();
               boolean var10 = this.field_44036.method_3232(var4);
               var8.method_27987(this.field_44037, var4, var1, this.field_44036);
               if (var7 && var10) {
                  var6.method_29298(this.field_44037, this.field_44036, var1, var4, var5, var9);
               }

               return true;
            } else {
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public class_6910 method_39520(class_9359 var1, class_6486 var2, class_6098 var3, class_2584 var4) {
      if (this.field_44033 != class_4666.field_22756) {
         if (!var1.method_3173().method_32954(var3.method_27960())) {
            int var7 = var3.method_27997();
            int var8 = var3.method_28026();
            class_954 var9 = var3.method_28006(var2, var1, var4);
            class_6098 var10 = (class_6098)var9.method_4203();
            if (var10 == var3 && var10.method_27997() == var7 && var10.method_28004() <= 0 && var10.method_28026() == var8) {
               return var9.method_4204();
            } else if (var9.method_4204() == class_6910.field_35517 && var10.method_28004() > 0 && !var1.method_26554()) {
               return var9.method_4204();
            } else {
               var1.method_26615(var4, var10);
               if (this.method_39519()) {
                  var10.method_28017(var7);
                  if (var10.method_27959() && var10.method_28026() != var8) {
                     var10.method_27999(var8);
                  }
               }

               if (var10.method_28022()) {
                  var1.method_26615(var4, class_6098.field_31203);
               }

               if (!var1.method_26554()) {
                  var1.method_43264(var1.field_3869);
               }

               return var9.method_4204();
            }
         } else {
            return class_6910.field_35521;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   public class_6910 method_39528(class_9359 var1, class_6486 var2, class_6098 var3, class_2584 var4, class_9529 var5) {
      class_1331 var8 = var5.method_43955();
      class_2522 var9 = var2.method_28262(var8);
      if (this.field_44033 == class_4666.field_22756) {
         class_4259 var16 = var9.method_8317(var2, var8);
         if (var16 == null) {
            return class_6910.field_35521;
         } else {
            var1.method_3152(var16);
            return class_6910.field_35520;
         }
      } else {
         boolean var10 = !var1.method_26446().method_28022() || !var1.method_26568().method_28022();
         boolean var11 = var1.method_3236() && var10;
         class_6098 var12 = var3.method_27973();
         if (!var11) {
            class_6910 var13 = var9.method_8322(var2, var1, var4, var5);
            if (var13.method_31662()) {
               class_8807.field_45074.method_1490(var1, var8, var12);
               return var13;
            }
         }

         if (!var3.method_28022() && !var1.method_3173().method_32954(var3.method_27960())) {
            class_4734 var17 = new class_4734(var1, var4, var5);
            class_6910 var14;
            if (!this.method_39519()) {
               var14 = var3.method_27972(var17);
            } else {
               int var15 = var3.method_27997();
               var14 = var3.method_27972(var17);
               var3.method_28017(var15);
            }

            if (var14.method_31662()) {
               class_8807.field_45074.method_1490(var1, var8, var12);
            }

            return var14;
         } else {
            return class_6910.field_35521;
         }
      }
   }

   public void method_39527(class_6331 var1) {
      this.field_44037 = var1;
   }
}
