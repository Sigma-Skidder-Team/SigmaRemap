package remapped;

public class class_7502 extends class_380 implements class_2593 {
   private static String[] field_38303;
   public static final class_6720 field_38300 = class_6023.field_30688;
   public static final class_7360<class_5122> field_38296 = class_6023.field_30709;
   public static final class_6720 field_38297 = class_6023.field_30696;
   public static final class_6720 field_38295 = class_6023.field_30719;
   public static final class_4190 field_38298 = class_6414.method_29292(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   public static final class_4190 field_38304 = class_6414.method_29292(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_38299 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final class_4190 field_38305 = class_6414.method_29292(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_38302 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   public static final class_4190 field_38301 = class_6414.method_29292(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

   public class_7502(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_1543, Direction.field_818)
            .method_10308(field_38300, Boolean.valueOf(false))
            .method_10308(field_38296, class_5122.field_26439)
            .method_10308(field_38297, Boolean.valueOf(false))
            .method_10308(field_38295, Boolean.valueOf(false))
      );
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      if (!var1.<Boolean>method_10313(field_38300)) {
         return var1.method_10313(field_38296) == class_5122.field_26440 ? field_38301 : field_38302;
      } else {
         switch ((Direction)var1.method_10313(field_1543)) {
            case field_818:
            default:
               return field_38305;
            case field_800:
               return field_38299;
            case field_809:
               return field_38304;
            case field_804:
               return field_38298;
         }
      }
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      switch (var4) {
         case field_14271:
            return var1.<Boolean>method_10313(field_38300);
         case field_14272:
            return var1.<Boolean>method_10313(field_38295);
         case field_14275:
            return var1.<Boolean>method_10313(field_38300);
         default:
            return false;
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (this.field_11820 != class_5371.field_27408) {
         var1 = var1.method_10317(field_38300);
         var2.method_7513(var3, var1, 2);
         if (var1.<Boolean>method_10313(field_38295)) {
            var2.method_43362().method_14011(var3, class_8532.field_43674, class_8532.field_43674.method_10711(var2));
         }

         this.method_34210(var4, var2, var3, var1.<Boolean>method_10313(field_38300));
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   public void method_34210(PlayerEntity var1, World var2, BlockPos var3, boolean var4) {
      if (!var4) {
         int var7 = this.field_11820 != class_5371.field_27408 ? 1013 : 1036;
         var2.method_43365(var1, var7, var3, 0);
      } else {
         int var8 = this.field_11820 != class_5371.field_27408 ? 1007 : 1037;
         var2.method_43365(var1, var8, var3, 0);
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (!var2.field_33055) {
         boolean var9 = var2.method_29576(var3);
         if (var9 != var1.<Boolean>method_10313(field_38297)) {
            if (var1.<Boolean>method_10313(field_38300) != var9) {
               var1 = var1.method_10308(field_38300, Boolean.valueOf(var9));
               this.method_34210((PlayerEntity)null, var2, var3, var9);
            }

            var2.method_7513(var3, var1.method_10308(field_38297, Boolean.valueOf(var9)), 2);
            if (var1.<Boolean>method_10313(field_38295)) {
               var2.method_43362().method_14011(var3, class_8532.field_43674, class_8532.field_43674.method_10711(var2));
            }
         }
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = this.method_29260();
      class_4774 var5 = var1.method_21862().method_28258(var1.method_21858());
      Direction var6 = var1.method_21857();
      if (!var1.method_1783() && var6.method_1029().method_42629()) {
         var4 = var4.method_10308(field_1543, var6)
            .method_10308(
               field_38296,
               !(var1.method_21865().field_7333 - (double)var1.method_21858().getY() > 0.5) ? class_5122.field_26439 : class_5122.field_26440
            );
      } else {
         var4 = var4.method_10308(field_1543, var1.method_21863().method_1046())
            .method_10308(field_38296, var6 != Direction.field_817 ? class_5122.field_26440 : class_5122.field_26439);
      }

      if (var1.method_21862().method_29576(var1.method_21858())) {
         var4 = var4.method_10308(field_38300, Boolean.valueOf(true)).method_10308(field_38297, Boolean.valueOf(true));
      }

      return var4.method_10308(field_38295, Boolean.valueOf(var5.method_22005() == class_8532.field_43674));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_38300, field_38296, field_38297, field_38295);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_38295) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method_10313(field_38295)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }
}
