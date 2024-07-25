package remapped;

import javax.annotation.Nullable;

public class class_6344 extends class_6414 implements class_2593 {
   private static String[] field_32397;
   public static final class_7360<class_6666> field_32395 = class_6023.field_30748;
   public static final class_6720 field_32398 = class_6023.field_30719;
   public static final class_4190 field_32396 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final class_4190 field_32394 = class_6414.method_29292(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public class_6344(class_3073 var1) {
      super(var1);
      this.method_29284(this.method_29260().method_10308(field_32395, class_6666.field_34465).method_10308(field_32398, Boolean.valueOf(false)));
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return var1.<class_6666>method_10313(field_32395) != class_6666.field_34469;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_32395, field_32398);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      class_6666 var7 = var1.<class_6666>method_10313(field_32395);
      switch (var7) {
         case field_34469:
            return class_3370.method_15524();
         case field_34466:
            return field_32394;
         default:
            return field_32396;
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_1331 var4 = var1.method_21858();
      class_2522 var5 = var1.method_21862().method_28262(var4);
      if (!var5.method_8350(this)) {
         class_4774 var6 = var1.method_21862().method_28258(var4);
         class_2522 var7 = this.method_29260()
            .method_10308(field_32395, class_6666.field_34465)
            .method_10308(field_32398, Boolean.valueOf(var6.method_22005() == class_8532.field_43674));
         Direction var8 = var1.method_21857();
         return var8 != Direction.field_802 && (var8 == Direction.field_817 || !(var1.method_21865().field_7333 - (double)var4.method_12165() > 0.5))
            ? var7
            : var7.method_10308(field_32395, class_6666.field_34466);
      } else {
         return var5.method_10308(field_32395, class_6666.field_34469).method_10308(field_32398, Boolean.valueOf(false));
      }
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      class_6098 var5 = var2.method_21867();
      class_6666 var6 = var1.<class_6666>method_10313(field_32395);
      if (var6 == class_6666.field_34469 || var5.method_27960() != this.method_10803()) {
         return false;
      } else if (!var2.method_1783()) {
         return true;
      } else {
         boolean var7 = var2.method_21865().field_7333 - (double)var2.method_21858().method_12165() > 0.5;
         Direction var8 = var2.method_21857();
         return var6 != class_6666.field_34465
            ? var8 == Direction.field_802 || !var7 && var8.method_1029().method_42629()
            : var8 == Direction.field_817 || var7 && var8.method_1029().method_42629();
      }
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_32398) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_21237(class_9379 var1, class_1331 var2, class_2522 var3, class_4774 var4) {
      return var3.method_10313(field_32395) == class_6666.field_34469 ? false : class_2593.super.method_21237(var1, var2, var3, var4);
   }

   @Override
   public boolean method_21238(class_6163 var1, class_1331 var2, class_2522 var3, class_2340 var4) {
      return var3.method_10313(field_32395) == class_6666.field_34469 ? false : class_2593.super.method_21238(var1, var2, var3, var4);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_32398)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      switch (var4) {
         case field_14271:
            return false;
         case field_14272:
            return var2.method_28258(var3).method_22007(class_6503.field_33094);
         case field_14275:
            return false;
         default:
            return false;
      }
   }
}
