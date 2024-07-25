package remapped;

import java.util.Iterator;
import java.util.List;

public class class_3420 extends class_3757 implements class_3745 {
   private class_2522 field_16829;
   private Direction field_16834;
   private boolean field_16827;
   private boolean field_16836;
   private static final ThreadLocal<Direction> field_16831 = ThreadLocal.<Direction>withInitial(() -> null);
   private float field_16835;
   private float field_16833;
   private long field_16832;
   private int field_16830;

   public class_3420() {
      super(class_133.field_364);
   }

   public class_3420(class_2522 var1, Direction var2, boolean var3, boolean var4) {
      this();
      this.field_16829 = var1;
      this.field_16834 = var2;
      this.field_16827 = var3;
      this.field_16836 = var4;
   }

   @Override
   public CompoundNBT method_17414() {
      return this.method_17396(new CompoundNBT());
   }

   public boolean method_15786() {
      return this.field_16827;
   }

   public Direction method_15787() {
      return this.field_16834;
   }

   public boolean method_15791() {
      return this.field_16836;
   }

   public float method_15785(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return MathHelper.method_42795(var1, this.field_16833, this.field_16835);
   }

   public float method_15784(float var1) {
      return (float)this.field_16834.method_1041() * this.method_15799(this.method_15785(var1));
   }

   public float method_15789(float var1) {
      return (float)this.field_16834.method_1054() * this.method_15799(this.method_15785(var1));
   }

   public float method_15798(float var1) {
      return (float)this.field_16834.method_1034() * this.method_15799(this.method_15785(var1));
   }

   private float method_15799(float var1) {
      return !this.field_16827 ? 1.0F - var1 : var1 - 1.0F;
   }

   private class_2522 method_15794() {
      return !this.method_15786() && this.method_15791() && this.field_16829.method_8360() instanceof class_1990
         ? class_4783.field_23336
            .method_29260()
            .method_10308(class_1166.field_6610, Boolean.valueOf(this.field_16835 > 0.25F))
            .method_10308(class_1166.field_6616, !this.field_16829.method_8350(class_4783.field_23861) ? class_989.field_5039 : class_989.field_5035)
            .method_10308(class_1166.field_16180, this.field_16829.<Direction>method_10313(class_1990.field_16180))
         : this.field_16829;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_15783(float var1) {
      Direction var4 = this.method_15800();
      double var5 = (double)(var1 - this.field_16835);
      class_4190 var7 = this.method_15794().method_8324(this.field_18364, this.method_17399());
      if (!var7.method_19485()) {
         Box var8 = this.method_15797(var7.method_19483());
         List var9 = this.field_18364.method_25870((Entity)null, class_2686.method_12066(var8, var4, var5).method_18905(var8));
         if (!var9.isEmpty()) {
            List var10 = var7.method_19492();
            boolean var11 = this.field_16829.method_8350(class_4783.field_23498);
            Iterator var12 = var9.iterator();

            while (true) {
               Entity var13;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  var13 = (Entity)var12.next();
                  if (var13.method_37132() != class_718.field_3914) {
                     if (!var11) {
                        break;
                     }

                     if (!(var13 instanceof class_9359)) {
                        class_1343 var14 = var13.method_37098();
                        double var15 = var14.field_7336;
                        double var17 = var14.field_7333;
                        double var19 = var14.field_7334;
                        switch (var4.method_1029()) {
                           case field_47215:
                              var15 = (double)var4.method_1041();
                              break;
                           case field_47216:
                              var17 = (double)var4.method_1054();
                              break;
                           case field_47219:
                              var19 = (double)var4.method_1034();
                        }

                        var13.method_37214(var15, var17, var19);
                        break;
                     }
                  }
               }

               double var21 = 0.0;

               for (Box var24 : var10) {
                  Box var25 = class_2686.method_12066(this.method_15797(var24), var4, var5);
                  Box var26 = var13.getBoundingBox();
                  if (var25.method_18909(var26)) {
                     var21 = Math.max(var21, method_15781(var25, var4, var26));
                     if (var21 >= var5) {
                        break;
                     }
                  }
               }

               if (!(var21 <= 0.0)) {
                  var21 = Math.min(var21, var5) + 0.01;
                  method_15782(var4, var13, var21, var4);
                  if (!this.field_16827 && this.field_16836) {
                     this.method_15788(var13, var4, var5);
                  }
               }
            }
         }
      }
   }

   private static void method_15782(Direction var0, Entity var1, double var2, Direction var4) {
      field_16831.set(var0);
      var1.method_37226(
         class_7412.field_37838, new class_1343(var2 * (double)var4.method_1041(), var2 * (double)var4.method_1054(), var2 * (double)var4.method_1034())
      );
      field_16831.set((Direction)null);
   }

   private void method_15802(float var1) {
      if (this.method_15793()) {
         Direction var4 = this.method_15800();
         if (var4.method_1029().method_42629()) {
            double var5 = this.field_16829.method_8324(this.field_18364, this.field_18358).method_19495(class_9249.field_47216);
            Box var7 = this.method_15797(new Box(0.0, var5, 0.0, 1.0, 1.5000000999999998, 1.0));
            double var8 = (double)(var1 - this.field_16835);

            for (Entity var11 : this.field_18364.method_25867((Entity)null, var7, var1x -> method_15790(var7, var1x))) {
               method_15782(var4, var11, var8, var4);
            }
         }
      }
   }

   private static boolean method_15790(Box var0, Entity var1) {
      return var1.method_37132() == class_718.field_3913
         && var1.method_37360()
         && var1.getPosX() >= var0.field_19941
         && var1.getPosX() <= var0.field_19940
         && var1.getPosZ() >= var0.field_19938
         && var1.getPosZ() <= var0.field_19942;
   }

   private boolean method_15793() {
      return this.field_16829.method_8350(class_4783.field_23899);
   }

   public Direction method_15800() {
      return !this.field_16827 ? this.field_16834.method_1046() : this.field_16834;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static double method_15781(Box var0, Direction var1, Box var2) {
      switch (var1) {
         case field_804:
            return var0.field_19940 - var2.field_19941;
         case field_809:
            return var2.field_19940 - var0.field_19941;
         case field_817:
         default:
            return var0.field_19939 - var2.field_19937;
         case field_802:
            return var2.field_19939 - var0.field_19937;
         case field_800:
            return var0.field_19942 - var2.field_19938;
         case field_818:
            return var2.field_19942 - var0.field_19938;
      }
   }

   private Box method_15797(Box var1) {
      double var4 = (double)this.method_15799(this.field_16835);
      return var1.method_18918(
         (double)this.field_18358.getX() + var4 * (double)this.field_16834.method_1041(),
         (double)this.field_18358.method_12165() + var4 * (double)this.field_16834.method_1054(),
         (double)this.field_18358.method_12185() + var4 * (double)this.field_16834.method_1034()
      );
   }

   private void method_15788(Entity var1, Direction var2, double var3) {
      Box var7 = var1.getBoundingBox();
      Box var8 = class_3370.method_15524().method_19483().method_18919(this.field_18358);
      if (var7.method_18909(var8)) {
         Direction var9 = var2.method_1046();
         double var10 = method_15781(var8, var9, var7) + 0.01;
         double var12 = method_15781(var8, var9, var7.method_18914(var8)) + 0.01;
         if (Math.abs(var10 - var12) < 0.01) {
            var10 = Math.min(var10, var3) + 0.01;
            method_15782(var2, var1, var10, var9);
         }
      }
   }

   public class_2522 method_15792() {
      return this.field_16829;
   }

   public void method_15795() {
      if (this.field_18364 != null && (this.field_16833 < 1.0F || this.field_18364.field_33055)) {
         this.field_16835 = 1.0F;
         this.field_16833 = this.field_16835;
         this.field_18364.method_29597(this.field_18358);
         this.method_17406();
         if (this.field_18364.method_28262(this.field_18358).method_8350(class_4783.field_23833)) {
            class_2522 var3;
            if (!this.field_16836) {
               var3 = class_6414.method_29274(this.field_16829, this.field_18364, this.field_18358);
            } else {
               var3 = class_4783.field_23184.method_29260();
            }

            this.field_18364.method_7513(this.field_18358, var3, 3);
            this.field_18364.method_29520(this.field_18358, var3.method_8360(), this.field_18358);
         }
      }
   }

   @Override
   public void method_17353() {
      this.field_16832 = this.field_18364.method_29546();
      this.field_16833 = this.field_16835;
      if (!(this.field_16833 >= 1.0F)) {
         float var3 = this.field_16835 + 0.5F;
         this.method_15783(var3);
         this.method_15802(var3);
         this.field_16835 = var3;
         if (this.field_16835 >= 1.0F) {
            this.field_16835 = 1.0F;
         }
      } else if (this.field_18364.field_33055 && this.field_16830 < 5) {
         this.field_16830++;
      } else {
         this.field_18364.method_29597(this.field_18358);
         this.method_17406();
         if (this.field_16829 != null && this.field_18364.method_28262(this.field_18358).method_8350(class_4783.field_23833)) {
            class_2522 var4 = class_6414.method_29274(this.field_16829, this.field_18364, this.field_18358);
            if (!var4.method_8345()) {
               if (var4.method_10307(class_6023.field_30719) && var4.<Boolean>method_10313(class_6023.field_30719)) {
                  var4 = var4.method_10308(class_6023.field_30719, Boolean.valueOf(false));
               }

               this.field_18364.method_7513(this.field_18358, var4, 67);
               this.field_18364.method_29520(this.field_18358, var4.method_8360(), this.field_18358);
            } else {
               this.field_18364.method_7513(this.field_18358, this.field_16829, 84);
               class_6414.method_29305(this.field_16829, var4, this.field_18364, this.field_18358, 3);
            }
         }
      }
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_16829 = class_4338.method_20185(var2.getCompound("blockState"));
      this.field_16834 = Direction.method_1033(var2.method_25947("facing"));
      this.field_16835 = var2.getFloat("progress");
      this.field_16833 = this.field_16835;
      this.field_16827 = var2.getBoolean("extending");
      this.field_16836 = var2.getBoolean("source");
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      var1.put("blockState", class_4338.method_20187(this.field_16829));
      var1.putInt("facing", this.field_16834.method_1050());
      var1.putFloat("progress", this.field_16833);
      var1.putBoolean("extending", this.field_16827);
      var1.putBoolean("source", this.field_16836);
      return var1;
   }

   public class_4190 method_15801(class_6163 var1, BlockPos var2) {
      class_4190 var5;
      if (!this.field_16827 && this.field_16836) {
         var5 = this.field_16829.method_10308(class_1990.field_10077, Boolean.valueOf(true)).method_8324(var1, var2);
      } else {
         var5 = class_3370.method_15536();
      }

      Direction var6 = field_16831.get();
      if ((double)this.field_16835 < 1.0 && var6 == this.method_15800()) {
         return var5;
      } else {
         class_2522 var7;
         if (!this.method_15791()) {
            var7 = this.field_16829;
         } else {
            var7 = class_4783.field_23336
               .method_29260()
               .method_10308(class_1166.field_16180, this.field_16834)
               .method_10308(class_1166.field_6610, Boolean.valueOf(this.field_16827 != 1.0F - this.field_16835 < 0.25F));
         }

         float var8 = this.method_15799(this.field_16835);
         double var9 = (double)((float)this.field_16834.method_1041() * var8);
         double var11 = (double)((float)this.field_16834.method_1054() * var8);
         double var13 = (double)((float)this.field_16834.method_1034() * var8);
         return class_3370.method_15530(var5, var7.method_8324(var1, var2).method_19496(var9, var11, var13));
      }
   }

   public long method_15796() {
      return this.field_16832;
   }

   @Override
   public double method_17404() {
      return 68.0;
   }
}
