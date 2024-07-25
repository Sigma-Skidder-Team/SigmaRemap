package remapped;

import java.util.Random;

public class class_2677 extends class_3266 {
   private static String[] field_13142;
   public static final class_4190 field_13144 = class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   public static final class_4190 field_13145 = class_6414.method_29292(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   public static final class_4190 field_13143 = class_6414.method_29292(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   public class_2677(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_16180, Direction.field_817));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_16180, var2.method_30489(var1.<Direction>method_10313(field_16180)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_10308(field_16180, var2.method_41392(var1.<Direction>method_10313(field_16180)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      switch (var1.<Direction>method_10313(field_16180).method_1029()) {
         case field_47215:
         default:
            return field_13143;
         case field_47219:
            return field_13145;
         case field_47216:
            return field_13144;
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      Direction var4 = var1.method_21857();
      class_2522 var5 = var1.method_21862().method_28262(var1.method_21858().method_6098(var4.method_1046()));
      return var5.method_8350(this) && var5.method_10313(field_16180) == var4
         ? this.method_29260().method_10308(field_16180, var4.method_1046())
         : this.method_29260().method_10308(field_16180, var4);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = var1.<Direction>method_10313(field_16180);
      double var8 = (double)var3.method_12173() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var10 = (double)var3.method_12165() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var12 = (double)var3.method_12185() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var14 = (double)(0.4F - (var4.nextFloat() + var4.nextFloat()) * 0.4F);
      if (var4.nextInt(5) == 0) {
         var2.method_43361(
            class_3090.field_15332,
            var8 + (double)var7.method_1041() * var14,
            var10 + (double)var7.method_1054() * var14,
            var12 + (double)var7.method_1034() * var14,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005
         );
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16180);
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3913;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
