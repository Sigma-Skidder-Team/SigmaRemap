package remapped;

import java.util.Random;

public class class_1475 extends class_2620 {
   private static String[] field_7906;
   public static final class_6720 field_7907 = class_6023.field_30696;
   public static final class_4190 field_7904 = class_6414.method_29292(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   public static final class_4190 field_7910 = class_6414.method_29292(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   public static final class_4190 field_7905 = class_6414.method_29292(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   public static final class_4190 field_7912 = class_6414.method_29292(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   public static final class_4190 field_7908 = class_6414.method_29292(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   public static final class_4190 field_7913 = class_6414.method_29292(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   public static final class_4190 field_7911 = class_6414.method_29292(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   public static final class_4190 field_7909 = class_6414.method_29292(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   public class_1475(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_1543, Direction.field_818)
            .method_10308(field_7907, Boolean.valueOf(false))
            .method_10308(field_12920, class_1895.field_9680)
      );
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      switch ((class_1895)var1.method_10313(field_12920)) {
         case field_9677:
            switch (var1.<Direction>method_10313(field_1543).method_1029()) {
               case field_47215:
                  return field_7913;
               case field_47219:
               default:
                  return field_7908;
            }
         case field_9680:
            switch ((Direction)var1.method_10313(field_1543)) {
               case field_804:
                  return field_7912;
               case field_809:
                  return field_7905;
               case field_800:
                  return field_7910;
               case field_818:
               default:
                  return field_7904;
            }
         case field_9679:
         default:
            switch (var1.<Direction>method_10313(field_1543).method_1029()) {
               case field_47215:
                  return field_7909;
               case field_47219:
               default:
                  return field_7911;
            }
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_2522 var11 = this.method_6805(var1, var2, var3);
         float var10 = !var11.<Boolean>method_10313(field_7907) ? 0.5F : 0.6F;
         var2.method_43359((PlayerEntity)null, var3, SoundEvents.field_2125, class_562.field_3322, 0.3F, var10);
         return class_6910.field_35518;
      } else {
         class_2522 var9 = var1.method_10317(field_7907);
         if (var9.<Boolean>method_10313(field_7907)) {
            method_6807(var9, var2, var3, 1.0F);
         }

         return class_6910.field_35520;
      }
   }

   public class_2522 method_6805(class_2522 var1, World var2, BlockPos var3) {
      var1 = var1.method_10317(field_7907);
      var2.method_7513(var3, var1, 3);
      this.method_6806(var1, var2, var3);
      return var1;
   }

   private static void method_6807(class_2522 var0, class_9379 var1, BlockPos var2, float var3) {
      Direction var6 = var0.<Direction>method_10313(field_1543).method_1046();
      Direction var7 = method_11868(var0).method_1046();
      double var8 = (double)var2.getX() + 0.5 + 0.1 * (double)var6.method_1041() + 0.2 * (double)var7.method_1041();
      double var10 = (double)var2.getY() + 0.5 + 0.1 * (double)var6.method_1054() + 0.2 * (double)var7.method_1054();
      double var12 = (double)var2.getZ() + 0.5 + 0.1 * (double)var6.method_1034() + 0.2 * (double)var7.method_1034();
      var1.method_43361(new class_5727(1.0F, 0.0F, 0.0F, var3), var8, var10, var12, 0.0, 0.0, 0.0);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method_10313(field_7907) && var4.nextFloat() < 0.25F) {
         method_6807(var1, var2, var3, 0.5F);
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         if (var1.<Boolean>method_10313(field_7907)) {
            this.method_6806(var1, var2, var3);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method_10313(field_7907) ? 0 : 15;
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method_10313(field_7907) && method_11868(var1) == var4 ? 15 : 0;
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   private void method_6806(class_2522 var1, World var2, BlockPos var3) {
      var2.method_29563(var3, this);
      var2.method_29563(var3.method_6098(method_11868(var1).method_1046()), this);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_12920, field_1543, field_7907);
   }
}
