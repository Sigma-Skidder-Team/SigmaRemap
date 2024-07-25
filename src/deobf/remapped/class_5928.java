package remapped;

import java.util.Random;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5928 extends class_8218<class_9180> implements class_2593 {
   public static final class_6162 field_30070 = class_380.field_1543;
   public static final class_6720 field_30071 = class_6023.field_30719;
   public static final class_4190 field_30068 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ITextComponent field_30072 = new TranslationTextComponent("container.enderchest");

   public class_5928(class_3073 var1) {
      super(var1, () -> class_133.field_371);
      this.method_29284(this.field_32751.method_36446().method_10308(field_30070, Direction.field_818).method_10308(field_30071, Boolean.valueOf(false)));
   }

   @Override
   public class_7892<? extends class_7099> method_37624(class_2522 var1, World var2, BlockPos var3, boolean var4) {
      return class_3606::method_16828;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_30068;
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38467;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      return this.method_29260()
         .method_10308(field_30070, var1.method_21863().method_1046())
         .method_10308(field_30071, Boolean.valueOf(var4.method_22005() == class_8532.field_43674));
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      class_1031 var9 = var4.method_3237();
      class_3757 var10 = var2.method_28260(var3);
      if (var9 != null && var10 instanceof class_9180) {
         BlockPos var11 = var3.method_6081();
         if (var2.method_28262(var11).method_8356(var2, var11)) {
            return class_6910.method_31659(var2.field_33055);
         } else if (!var2.field_33055) {
            class_9180 var12 = (class_9180)var10;
            var9.method_4560(var12);
            var4.method_3152(new class_6872((var1x, var2x, var3x) -> class_1465.method_6776(var1x, var2x, var9), field_30072));
            var4.method_3209(class_6234.field_31848);
            class_134.method_474(var4, true);
            return class_6910.field_35518;
         } else {
            return class_6910.field_35520;
         }
      } else {
         return class_6910.method_31659(var2.field_33055);
      }
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_9180();
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      for (int var7 = 0; var7 < 3; var7++) {
         int var8 = var4.nextInt(2) * 2 - 1;
         int var9 = var4.nextInt(2) * 2 - 1;
         double var10 = (double)var3.getX() + 0.5 + 0.25 * (double)var8;
         double var12 = (double)((float)var3.method_12165() + var4.nextFloat());
         double var14 = (double)var3.method_12185() + 0.5 + 0.25 * (double)var9;
         double var16 = (double)(var4.nextFloat() * (float)var8);
         double var18 = ((double)var4.nextFloat() - 0.5) * 0.125;
         double var20 = (double)(var4.nextFloat() * (float)var9);
         var2.method_43361(class_3090.field_15356, var10, var12, var14, var16, var18, var20);
      }
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_30070, var2.method_30489(var1.<Direction>method_10313(field_30070)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_30070)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_30070, field_30071);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_30071) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method_10313(field_30071)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
