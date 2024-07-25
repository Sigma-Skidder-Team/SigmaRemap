package remapped;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class class_4190 {
   public final class_5791 field_20395;
   private class_4190[] field_20394;

   public class_4190(class_5791 var1) {
      this.field_20395 = var1;
   }

   public double method_19491(class_9249 var1) {
      int var4 = this.field_20395.method_26201(var1);
      return var4 < this.field_20395.method_26199(var1) ? this.method_19490(var1, var4) : Double.POSITIVE_INFINITY;
   }

   public double method_19495(class_9249 var1) {
      int var4 = this.field_20395.method_26206(var1);
      return var4 > 0 ? this.method_19490(var1, var4) : Double.NEGATIVE_INFINITY;
   }

   public Box method_19483() {
      if (!this.method_19485()) {
         return new Box(
            this.method_19491(class_9249.field_47215),
            this.method_19491(class_9249.field_47216),
            this.method_19491(class_9249.field_47219),
            this.method_19495(class_9249.field_47215),
            this.method_19495(class_9249.field_47216),
            this.method_19495(class_9249.field_47219)
         );
      } else {
         throw (UnsupportedOperationException) Util.method_44658(new UnsupportedOperationException("No bounds for empty shape."));
      }
   }

   public double method_19490(class_9249 var1, int var2) {
      return this.method_19486(var1).getDouble(var2);
   }

   public abstract DoubleList method_19486(class_9249 var1);

   public boolean method_19485() {
      return this.field_20395.method_26192();
   }

   public class_4190 method_19496(double var1, double var3, double var5) {
      return (class_4190)(!this.method_19485()
         ? new class_2573(
            this.field_20395,
            new class_2385(this.method_19486(class_9249.field_47215), var1),
            new class_2385(this.method_19486(class_9249.field_47216), var3),
            new class_2385(this.method_19486(class_9249.field_47219), var5)
         )
         : class_3370.method_15536());
   }

   public class_4190 method_19497() {
      class_4190[] var3 = new class_4190[]{class_3370.method_15536()};
      this.method_19500(
         (var1, var3x, var5, var7, var9, var11) -> var3[0] = class_3370.method_15529(
               var3[0], class_3370.method_15522(var1, var3x, var5, var7, var9, var11), class_8529.field_43644
            )
      );
      return var3[0];
   }

   public void method_19489(class_969 var1) {
      this.field_20395
         .method_26193(
            (var2, var3, var4, var5, var6, var7) -> var1.method_4247(
                  this.method_19490(class_9249.field_47215, var2),
                  this.method_19490(class_9249.field_47216, var3),
                  this.method_19490(class_9249.field_47219, var4),
                  this.method_19490(class_9249.field_47215, var5),
                  this.method_19490(class_9249.field_47216, var6),
                  this.method_19490(class_9249.field_47219, var7)
               ),
            true
         );
   }

   public void method_19500(class_969 var1) {
      DoubleList var4 = this.method_19486(class_9249.field_47215);
      DoubleList var5 = this.method_19486(class_9249.field_47216);
      DoubleList var6 = this.method_19486(class_9249.field_47219);
      this.field_20395
         .method_26212(
            (var4x, var5x, var6x, var7, var8, var9) -> var1.method_4247(
                  var4.getDouble(var4x), var5.getDouble(var5x), var6.getDouble(var6x), var4.getDouble(var7), var5.getDouble(var8), var6.getDouble(var9)
               ),
            true
         );
   }

   public List<Box> method_19492() {
      ArrayList var3 = Lists.newArrayList();
      this.method_19500((var1, var3x, var5, var7, var9, var11) -> var3.add(new Box(var1, var3x, var5, var7, var9, var11)));
      return var3;
   }

   public double method_19499(class_9249 var1, double var2, double var4) {
      class_9249 var8 = class_5587.field_28371.method_25382(var1);
      class_9249 var9 = class_5587.field_28368.method_25382(var1);
      int var10 = this.method_19487(var8, var2);
      int var11 = this.method_19487(var9, var4);
      int var12 = this.field_20395.method_26205(var1, var10, var11);
      return var12 > 0 ? this.method_19490(var1, var12) : Double.NEGATIVE_INFINITY;
   }

   public int method_19487(class_9249 var1, double var2) {
      return MathHelper.method_42803(0, this.field_20395.method_26199(var1) + 1, var4 -> {
         if (var4 >= 0) {
            return var4 <= this.field_20395.method_26199(var1) ? var2 < this.method_19490(var1, var4) : true;
         } else {
            return false;
         }
      }) - 1;
   }

   public boolean method_19484(double var1, double var3, double var5) {
      return this.field_20395
         .method_26204(
            this.method_19487(class_9249.field_47215, var1), this.method_19487(class_9249.field_47216, var3), this.method_19487(class_9249.field_47219, var5)
         );
   }

   @Nullable
   public class_9529 method_19493(class_1343 var1, class_1343 var2, BlockPos var3) {
      if (!this.method_19485()) {
         class_1343 var6 = var2.method_6194(var1);
         if (!(var6.method_6221() < 1.0E-7)) {
            class_1343 var7 = var1.method_6215(var6.method_6209(0.001));
            return !this.method_19484(
                  var7.field_7336 - (double)var3.getX(), var7.field_7333 - (double)var3.method_12165(), var7.field_7334 - (double)var3.method_12185()
               )
               ? Box.method_18922(this.method_19492(), var1, var2, var3)
               : new class_9529(var7, Direction.method_1044(var6.field_7336, var6.field_7333, var6.field_7334).method_1046(), var3, true);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public class_4190 method_19494(Direction var1) {
      if (!this.method_19485() && this != class_3370.method_15524()) {
         if (this.field_20394 == null) {
            this.field_20394 = new class_4190[6];
         } else {
            class_4190 var4 = this.field_20394[var1.ordinal()];
            if (var4 != null) {
               return var4;
            }
         }

         class_4190 var5 = this.method_19498(var1);
         this.field_20394[var1.ordinal()] = var5;
         return var5;
      } else {
         return this;
      }
   }

   private class_4190 method_19498(Direction var1) {
      class_9249 var4 = var1.method_1029();
      class_137 var5 = var1.method_1049();
      DoubleList var6 = this.method_19486(var4);
      if (var6.size() == 2 && DoubleMath.fuzzyEquals(var6.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals(var6.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         int var7 = this.method_19487(var4, var5 != class_137.field_405 ? 1.0E-7 : 0.9999999);
         return new class_641(this, var4, var7);
      }
   }

   public double method_19482(class_9249 var1, Box var2, double var3) {
      return this.method_19481(class_5587.method_25381(var1, class_9249.field_47215), var2, var3);
   }

   public double method_19481(class_5587 var1, Box var2, double var3) {
      if (!this.method_19485()) {
         if (Math.abs(var3) < 1.0E-7) {
            return 0.0;
         } else {
            class_5587 var7 = var1.method_25383();
            class_9249 var8 = var7.method_25382(class_9249.field_47215);
            class_9249 var9 = var7.method_25382(class_9249.field_47216);
            class_9249 var10 = var7.method_25382(class_9249.field_47219);
            double var11 = var2.method_18917(var8);
            double var13 = var2.method_18915(var8);
            int var15 = this.method_19487(var8, var13 + 1.0E-7);
            int var16 = this.method_19487(var8, var11 - 1.0E-7);
            int var17 = Math.max(0, this.method_19487(var9, var2.method_18915(var9) + 1.0E-7));
            int var18 = Math.min(this.field_20395.method_26199(var9), this.method_19487(var9, var2.method_18917(var9) - 1.0E-7) + 1);
            int var19 = Math.max(0, this.method_19487(var10, var2.method_18915(var10) + 1.0E-7));
            int var20 = Math.min(this.field_20395.method_26199(var10), this.method_19487(var10, var2.method_18917(var10) - 1.0E-7) + 1);
            int var21 = this.field_20395.method_26199(var8);
            if (!(var3 > 0.0)) {
               if (var3 < 0.0) {
                  for (int var22 = var15 - 1; var22 >= 0; var22--) {
                     for (int var23 = var17; var23 < var18; var23++) {
                        for (int var24 = var19; var24 < var20; var24++) {
                           if (this.field_20395.method_26210(var7, var22, var23, var24)) {
                              double var25 = this.method_19490(var8, var22 + 1) - var13;
                              if (var25 <= 1.0E-7) {
                                 var3 = Math.max(var3, var25);
                              }

                              return var3;
                           }
                        }
                     }
                  }
               }
            } else {
               for (int var27 = var16 + 1; var27 < var21; var27++) {
                  for (int var28 = var17; var28 < var18; var28++) {
                     for (int var29 = var19; var29 < var20; var29++) {
                        if (this.field_20395.method_26210(var7, var27, var28, var29)) {
                           double var30 = this.method_19490(var8, var27) - var11;
                           if (var30 >= -1.0E-7) {
                              var3 = Math.min(var3, var30);
                           }

                           return var3;
                        }
                     }
                  }
               }
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @Override
   public String toString() {
      return !this.method_19485() ? "VoxelShape[" + this.method_19483() + "]" : "EMPTY";
   }
}
