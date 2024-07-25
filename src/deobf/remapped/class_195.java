package remapped;

import javax.annotation.Nullable;

public class class_195 extends class_6414 implements class_724 {
   public static final class_7360<class_7660> field_655 = class_6023.field_30677;

   public class_195(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_655, class_7660.field_38921));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_655);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_655, var2.method_30491().method_38394(var1.<class_7660>method_10313(field_655)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_10308(field_655, var2.method_41388().method_38394(var1.<class_7660>method_10313(field_655)));
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      Direction var4 = var1.method_21857();
      Direction var5;
      if (var4.method_1029() != class_9249.field_47216) {
         var5 = Direction.field_817;
      } else {
         var5 = var1.method_21863().method_1046();
      }

      return this.method_29260().method_10308(field_655, class_7660.method_34669(var4, var5));
   }

   @Nullable
   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_6786();
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      class_3757 var9 = var2.method_28260(var3);
      if (var9 instanceof class_6786 && var4.method_3184()) {
         var4.method_3201((class_6786)var9);
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   public static boolean method_862(class_4099 var0, class_4099 var1) {
      Direction var4 = method_860(var0.field_19967);
      Direction var5 = method_860(var1.field_19967);
      Direction var6 = method_861(var0.field_19967);
      Direction var7 = method_861(var1.field_19967);
      class_1252 var8 = class_1252.method_5640(var0.field_19968.method_25965("joint"))
         .orElseGet(() -> !var4.method_1029().method_42629() ? class_1252.field_6897 : class_1252.field_6898);
      boolean var9 = var8 == class_1252.field_6897;
      return var4 == var5.method_1046() && (var9 || var6 == var7) && var0.field_19968.method_25965("target").equals(var1.field_19968.method_25965("name"));
   }

   public static Direction method_860(class_2522 var0) {
      return var0.<class_7660>method_10313(field_655).method_34671();
   }

   public static Direction method_861(class_2522 var0) {
      return var0.<class_7660>method_10313(field_655).method_34670();
   }
}
