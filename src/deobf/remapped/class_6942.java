package remapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class class_6942 extends class_8218<class_7099> implements class_2593 {
   private static String[] field_35693;
   public static final class_6162 field_35692 = class_380.field_1543;
   public static final class_7360<class_9264> field_35695 = class_6023.field_30747;
   public static final class_6720 field_35690 = class_6023.field_30719;
   public static final class_4190 field_35688 = class_6414.method_29292(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   public static final class_4190 field_35691 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   public static final class_4190 field_35689 = class_6414.method_29292(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   public static final class_4190 field_35694 = class_6414.method_29292(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   public static final class_4190 field_35696 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final class_3606<class_7099, Optional<class_6867>> field_35687 = new class_9672();
   private static final class_3606<class_7099, Optional<class_4259>> field_35697 = new class_1170();

   public class_6942(class_3073 var1, Supplier<class_133<? extends class_7099>> var2) {
      super(var1, var2);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_35692, Direction.field_818)
            .method_10308(field_35695, class_9264.field_47274)
            .method_10308(field_35690, Boolean.valueOf(false))
      );
   }

   public static class_1168 method_31762(class_2522 var0) {
      class_9264 var3 = var0.<class_9264>method_10313(field_35695);
      if (var3 != class_9264.field_47274) {
         return var3 != class_9264.field_47277 ? class_1168.field_6625 : class_1168.field_6621;
      } else {
         return class_1168.field_6622;
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38467;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method_10313(field_35690)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      if (var3.method_8350(this) && var2.method_1029().method_42629()) {
         class_9264 var9 = var3.<class_9264>method_10313(field_35695);
         if (var1.<class_9264>method_10313(field_35695) == class_9264.field_47274
            && var9 != class_9264.field_47274
            && var1.<Direction>method_10313(field_35692) == var3.<Direction>method_10313(field_35692)
            && method_31758(var3) == var2.method_1046()) {
            return var1.method_10308(field_35695, var9.method_42710());
         }
      } else if (method_31758(var1) == var2) {
         return var1.method_10308(field_35695, class_9264.field_47274);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      if (var1.<class_9264>method_10313(field_35695) == class_9264.field_47274) {
         return field_35696;
      } else {
         switch (method_31758(var1)) {
            case field_818:
            default:
               return field_35688;
            case field_800:
               return field_35691;
            case field_809:
               return field_35689;
            case field_804:
               return field_35694;
         }
      }
   }

   public static Direction method_31758(class_2522 var0) {
      Direction var3 = var0.<Direction>method_10313(field_35692);
      return var0.method_10313(field_35695) != class_9264.field_47279 ? var3.method_1053() : var3.method_1042();
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_9264 var4 = class_9264.field_47274;
      Direction var5 = var1.method_21863().method_1046();
      class_4774 var6 = var1.method_21862().method_28258(var1.method_21858());
      boolean var7 = var1.method_21859();
      Direction var8 = var1.method_21857();
      if (var8.method_1029().method_42629() && var7) {
         Direction var9 = this.method_31760(var1, var8.method_1046());
         if (var9 != null && var9.method_1029() != var8.method_1029()) {
            var5 = var9;
            var4 = var9.method_1053() != var8.method_1046() ? class_9264.field_47279 : class_9264.field_47277;
         }
      }

      if (var4 == class_9264.field_47274 && !var7) {
         if (var5 != this.method_31760(var1, var5.method_1042())) {
            if (var5 == this.method_31760(var1, var5.method_1053())) {
               var4 = class_9264.field_47277;
            }
         } else {
            var4 = class_9264.field_47279;
         }
      }

      return this.method_29260()
         .method_10308(field_35692, var5)
         .method_10308(field_35695, var4)
         .method_10308(field_35690, Boolean.valueOf(var6.method_22005() == class_8532.field_43674));
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_35690) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Nullable
   private Direction method_31760(class_353 var1, Direction var2) {
      class_2522 var5 = var1.method_21862().method_28262(var1.method_21858().method_6098(var2));
      return var5.method_8350(this) && var5.method_10313(field_35695) == class_9264.field_47274 ? var5.<Direction>method_10313(field_35692) : null;
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, LivingEntity var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_7099) {
            ((class_7099)var8).method_38432(var5.method_28008());
         }
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_6867) {
            class_1573.method_7104(var2, var3, (class_6867)var8);
            var2.method_29523(var3, this);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_4259 var9 = this.method_10767(var1, var2, var3);
         if (var9 != null) {
            var4.method_3152(var9);
            var4.method_3211(this.method_31764());
            class_134.method_474(var4, true);
         }

         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   public class_6676<Identifier> method_31764() {
      return class_6234.field_31829.method_43790(class_6234.field_31885);
   }

   @Nullable
   public static class_6867 method_31759(class_6942 var0, class_2522 var1, World var2, BlockPos var3, boolean var4) {
      return var0.method_37624(var1, var2, var3, var4).<Optional<class_6867>>method_35688(field_35687).orElse((class_6867)null);
   }

   @Override
   public class_7892<? extends class_7099> method_37624(class_2522 var1, World var2, BlockPos var3, boolean var4) {
      BiPredicate var7;
      if (!var4) {
         var7 = class_6942::method_31765;
      } else {
         var7 = (var0, var1x) -> false;
      }

      return class_7951.method_35989(this.field_42052.get(), class_6942::method_31762, class_6942::method_31758, field_35692, var1, var2, var3, var7);
   }

   @Nullable
   @Override
   public class_4259 method_10767(class_2522 var1, World var2, BlockPos var3) {
      return this.method_37624(var1, var2, var3, false).<Optional<class_4259>>method_35688(field_35697).orElse((class_4259)null);
   }

   public static class_3606<class_7099, Float2FloatFunction> method_31761(class_3848 var0) {
      return new class_6671(var0);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_7099();
   }

   public static boolean method_31765(class_9379 var0, BlockPos var1) {
      return method_31766(var0, var1) || method_31763(var0, var1);
   }

   private static boolean method_31766(class_6163 var0, BlockPos var1) {
      BlockPos var4 = var1.method_6081();
      return var0.method_28262(var4).method_8356(var0, var4);
   }

   private static boolean method_31763(class_9379 var0, BlockPos var1) {
      List var4 = var0.<class_5583>method_25868(
         class_5583.class,
         new Box(
            (double)var1.method_12173(),
            (double)(var1.method_12165() + 1),
            (double)var1.method_12185(),
            (double)(var1.method_12173() + 1),
            (double)(var1.method_12165() + 2),
            (double)(var1.method_12185() + 1)
         )
      );
      if (!var4.isEmpty()) {
         for (class_5583 var6 : var4) {
            if (var6.method_41209()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, BlockPos var3) {
      return class_4088.method_18870(method_31759(this, var1, var2, var3, false));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_35692, var2.method_30489(var1.<Direction>method_10313(field_35692)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_35692)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_35692, field_35695, field_35690);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
