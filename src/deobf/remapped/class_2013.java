package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_2013 extends class_4314 {
   public static final class_6162 field_10210 = class_380.field_1543;
   public static final class_6720 field_10205 = class_6023.field_30696;
   public static final class_6720 field_10203 = class_6023.field_30699;
   public static final class_4190 field_10204 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final class_4190 field_10209 = class_6414.method_29292(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final class_4190 field_10211 = class_3370.method_15530(field_10204, field_10209);
   public static final class_4190 field_10208 = class_6414.method_29292(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final class_4190 field_10201 = class_3370.method_15530(field_10211, field_10208);
   public static final class_4190 field_10207 = class_3370.method_15531(
      class_6414.method_29292(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0),
      class_6414.method_29292(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0),
      class_6414.method_29292(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0),
      field_10211
   );
   public static final class_4190 field_10206 = class_3370.method_15531(
      class_6414.method_29292(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333),
      class_6414.method_29292(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667),
      class_6414.method_29292(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0),
      field_10211
   );
   public static final class_4190 field_10213 = class_3370.method_15531(
      class_6414.method_29292(15.0, 10.0, 0.0, 10.666667, 14.0, 16.0),
      class_6414.method_29292(10.666667, 12.0, 0.0, 6.333333, 16.0, 16.0),
      class_6414.method_29292(6.333333, 14.0, 0.0, 2.0, 18.0, 16.0),
      field_10211
   );
   public static final class_4190 field_10212 = class_3370.method_15531(
      class_6414.method_29292(0.0, 10.0, 15.0, 16.0, 14.0, 10.666667),
      class_6414.method_29292(0.0, 12.0, 10.666667, 16.0, 16.0, 6.333333),
      class_6414.method_29292(0.0, 14.0, 6.333333, 16.0, 18.0, 2.0),
      field_10211
   );

   public class_2013(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_10210, Direction.field_818)
            .method_10308(field_10205, Boolean.valueOf(false))
            .method_10308(field_10203, Boolean.valueOf(false))
      );
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_4190 method_10790(class_2522 var1, class_6163 var2, BlockPos var3) {
      return field_10211;
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      World var4 = var1.method_21862();
      ItemStack var5 = var1.method_21867();
      CompoundNBT var6 = var5.method_27990();
      PlayerEntity var7 = var1.method_21868();
      boolean var8 = false;
      if (!var4.field_33055 && var7 != null && var6 != null && var7.method_3184() && var6.method_25938("BlockEntityTag")) {
         CompoundNBT var9 = var6.getCompound("BlockEntityTag");
         if (var9.method_25938("Book")) {
            var8 = true;
         }
      }

      return this.method_29260().method_10308(field_10210, var1.method_21863().method_1046()).method_10308(field_10203, Boolean.valueOf(var8));
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_10201;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      switch ((Direction)var1.method_10313(field_10210)) {
         case field_818:
            return field_10206;
         case field_800:
            return field_10212;
         case field_804:
            return field_10213;
         case field_809:
            return field_10207;
         default:
            return field_10211;
      }
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_10210, var2.method_30489(var1.<Direction>method_10313(field_10210)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_10210)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_10210, field_10205, field_10203);
   }

   @Nullable
   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_1788();
   }

   public static boolean method_9334(World var0, BlockPos var1, class_2522 var2, ItemStack var3) {
      if (var2.<Boolean>method_10313(field_10203)) {
         return false;
      } else {
         if (!var0.field_33055) {
            method_9340(var0, var1, var2, var3);
         }

         return true;
      }
   }

   private static void method_9340(World var0, BlockPos var1, class_2522 var2, ItemStack var3) {
      class_3757 var6 = var0.method_28260(var1);
      if (var6 instanceof class_1788) {
         class_1788 var7 = (class_1788)var6;
         var7.method_7956(var3.method_27953(1));
         method_9339(var0, var1, var2, true);
         var0.method_43359((PlayerEntity)null, var1, SoundEvents.field_2482, class_562.field_3322, 1.0F, 1.0F);
      }
   }

   public static void method_9339(World var0, BlockPos var1, class_2522 var2, boolean var3) {
      var0.method_7513(var1, var2.method_10308(field_10205, Boolean.valueOf(false)).method_10308(field_10203, Boolean.valueOf(var3)), 3);
      method_9337(var0, var1, var2);
   }

   public static void method_9335(World var0, BlockPos var1, class_2522 var2) {
      method_9338(var0, var1, var2, true);
      var0.method_43367().method_14011(var1, var2.method_8360(), 2);
      var0.method_43364(1043, var1, 0);
   }

   private static void method_9338(World var0, BlockPos var1, class_2522 var2, boolean var3) {
      var0.method_7513(var1, var2.method_10308(field_10205, Boolean.valueOf(var3)), 3);
      method_9337(var0, var1, var2);
   }

   private static void method_9337(World var0, BlockPos var1, class_2522 var2) {
      var0.method_29563(var1.method_6100(), var2.method_8360());
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      method_9338(var2, var3, var1, false);
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         if (var1.<Boolean>method_10313(field_10203)) {
            this.method_9336(var1, var2, var3);
         }

         if (var1.<Boolean>method_10313(field_10205)) {
            var2.method_29563(var3.method_6100(), this);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   private void method_9336(class_2522 var1, World var2, BlockPos var3) {
      class_3757 var6 = var2.method_28260(var3);
      if (var6 instanceof class_1788) {
         class_1788 var7 = (class_1788)var6;
         Direction var8 = var1.<Direction>method_10313(field_10210);
         ItemStack var9 = var7.method_7958().method_27973();
         float var10 = 0.25F * (float)var8.method_1041();
         float var11 = 0.25F * (float)var8.method_1034();
         class_91 var12 = new class_91(
            var2, (double)var3.getX() + 0.5 + (double)var10, (double)(var3.method_12165() + 1), (double)var3.method_12185() + 0.5 + (double)var11, var9
         );
         var12.method_257();
         var2.method_7509(var12);
         var7.method_24975();
      }
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method_10313(field_10205) ? 0 : 15;
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return var4 == Direction.field_817 && var1.<Boolean>method_10313(field_10205) ? 15 : 0;
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, BlockPos var3) {
      if (var1.<Boolean>method_10313(field_10203)) {
         class_3757 var6 = var2.method_28260(var3);
         if (var6 instanceof class_1788) {
            return ((class_1788)var6).method_7963();
         }
      }

      return 0;
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (var1.<Boolean>method_10313(field_10203)) {
         if (!var2.field_33055) {
            this.method_9341(var2, var3, var4);
         }

         return class_6910.method_31659(var2.field_33055);
      } else {
         ItemStack var9 = var4.method_26617(var5);
         return !var9.method_28022() && !var9.method_27960().method_11250(class_391.field_1614) ? class_6910.field_35518 : class_6910.field_35521;
      }
   }

   @Nullable
   @Override
   public class_4259 method_10767(class_2522 var1, World var2, BlockPos var3) {
      return var1.<Boolean>method_10313(field_10203) ? super.method_10767(var1, var2, var3) : null;
   }

   private void method_9341(World var1, BlockPos var2, PlayerEntity var3) {
      class_3757 var6 = var1.method_28260(var2);
      if (var6 instanceof class_1788) {
         var3.method_3152((class_1788)var6);
         var3.method_3209(class_6234.field_31895);
      }
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
