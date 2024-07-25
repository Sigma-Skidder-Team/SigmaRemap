package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7372 extends class_305 {
   public static final class_6162 field_37674 = class_380.field_1543;
   private static final class_4190 field_37671 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final class_4190 field_37675 = class_6414.method_29292(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final class_4190 field_37668 = class_6414.method_29292(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final class_4190 field_37677 = class_6414.method_29292(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final class_4190 field_37676 = class_6414.method_29292(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final class_4190 field_37673 = class_6414.method_29292(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final class_4190 field_37679 = class_6414.method_29292(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final class_4190 field_37669 = class_3370.method_15531(field_37671, field_37675, field_37668, field_37677);
   private static final class_4190 field_37672 = class_3370.method_15531(field_37671, field_37676, field_37673, field_37679);
   private static final ITextComponent field_37670 = new TranslationTextComponent("container.repair");

   public class_7372(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_37674, Direction.field_818));
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_37674, var1.method_21863().method_1042());
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055) {
         var4.method_3152(var1.method_8317(var2, var3));
         var4.method_3209(class_6234.field_31836);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Nullable
   @Override
   public class_4259 method_10767(class_2522 var1, World var2, BlockPos var3) {
      return new class_6872((var2x, var3x, var4) -> new class_6600(var2x, var3x, class_9210.method_42530(var2, var3)), field_37670);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      Direction var7 = var1.<Direction>method_10313(field_37674);
      return var7.method_1029() != class_9249.field_47215 ? field_37672 : field_37669;
   }

   @Override
   public void method_1359(class_1453 var1) {
      var1.method_6691(true);
   }

   @Override
   public void method_1360(World var1, BlockPos var2, class_2522 var3, class_2522 var4, class_1453 var5) {
      if (!var5.method_37378()) {
         var1.method_43364(1031, var2, 0);
      }
   }

   @Override
   public void method_1362(World var1, BlockPos var2, class_1453 var3) {
      if (!var3.method_37378()) {
         var1.method_43364(1029, var2, 0);
      }
   }

   @Nullable
   public static class_2522 method_33579(class_2522 var0) {
      if (!var0.method_8350(class_4783.field_23796)) {
         return !var0.method_8350(class_4783.field_23839)
            ? null
            : class_4783.field_23845.method_29260().method_10308(field_37674, var0.<Direction>method_10313(field_37674));
      } else {
         return class_4783.field_23839.method_29260().method_10308(field_37674, var0.<Direction>method_10313(field_37674));
      }
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_37674, var2.method_30489(var1.<Direction>method_10313(field_37674)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_37674);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }

   @Override
   public int method_1358(class_2522 var1, class_6163 var2, BlockPos var3) {
      return var1.method_8323(var2, var3).field_8060;
   }
}
