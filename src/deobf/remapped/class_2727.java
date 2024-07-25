package remapped;

public class class_2727 extends class_6414 {
   private static String[] field_13315;
   public static final class_6720 field_13316 = class_6023.field_30729;

   public class_2727(class_3073 var1) {
      super(var1);
      this.method_29284(this.method_29260().method_10308(field_13316, Boolean.valueOf(false)));
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360()) && var2.method_29576(var3)) {
         method_12256(var2, var3);
         var2.method_7508(var3, false);
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (var2.method_29576(var3)) {
         method_12256(var2, var3);
         var2.method_7508(var3, false);
      }
   }

   @Override
   public void method_29265(World var1, BlockPos var2, class_2522 var3, class_704 var4) {
      if (!var1.method_22567() && !var4.method_3186() && var3.<Boolean>method_10313(field_13316)) {
         method_12256(var1, var2);
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Override
   public void method_29279(World var1, BlockPos var2, class_2730 var3) {
      if (!var1.field_33055) {
         class_1356 var6 = new class_1356(
            var1, (double)var2.method_12173() + 0.5, (double)var2.method_12165(), (double)var2.method_12185() + 0.5, var3.method_12273()
         );
         var6.method_6255((short)(var1.field_33033.nextInt(var6.method_6258() / 4) + var6.method_6258() / 8));
         var1.method_7509(var6);
      }
   }

   public static void method_12256(World var0, BlockPos var1) {
      method_12257(var0, var1, (class_5834)null);
   }

   private static void method_12257(World var0, BlockPos var1, class_5834 var2) {
      if (!var0.field_33055) {
         class_1356 var5 = new class_1356(var0, (double)var1.method_12173() + 0.5, (double)var1.method_12165(), (double)var1.method_12185() + 0.5, var2);
         var0.method_7509(var5);
         var0.method_29528(
            (class_704)null, var5.method_37302(), var5.method_37309(), var5.method_37156(), class_463.field_2660, class_562.field_3322, 1.0F, 1.0F
         );
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      ItemStack var9 = var4.method_26617(var5);
      class_2451 var10 = var9.method_27960();
      if (var10 != class_4897.field_25188 && var10 != class_4897.field_24352) {
         return super.method_10777(var1, var2, var3, var4, var5, var6);
      } else {
         method_12257(var2, var3, var4);
         var2.method_7513(var3, class_4783.field_23184.method_29260(), 11);
         if (!var4.method_3186()) {
            if (var10 != class_4897.field_25188) {
               var9.method_27970(1);
            } else {
               var9.method_28003(1, var4, var1x -> var1x.method_26447(var5));
            }
         }

         return class_6910.method_31659(var2.field_33055);
      }
   }

   @Override
   public void method_10758(World var1, class_2522 var2, class_9529 var3, class_5783 var4) {
      if (!var1.field_33055) {
         Entity var7 = var4.method_26166();
         if (var4.method_37264()) {
            BlockPos var8 = var3.method_43955();
            method_12257(var1, var8, !(var7 instanceof class_5834) ? null : (class_5834)var7);
            var1.method_7508(var8, false);
         }
      }
   }

   @Override
   public boolean method_29256(class_2730 var1) {
      return false;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_13316);
   }
}
