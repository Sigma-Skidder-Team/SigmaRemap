package remapped;

import java.util.Arrays;

public class class_1166 extends class_3266 {
   private static String[] field_6614;
   public static final class_7360<class_989> field_6616 = class_6023.field_30671;
   public static final class_6720 field_6610 = class_6023.field_30678;
   public static final class_4190 field_6620 = class_6414.method_29292(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_6603 = class_6414.method_29292(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   public static final class_4190 field_6598 = class_6414.method_29292(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_6599 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   public static final class_4190 field_6604 = class_6414.method_29292(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_6611 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   public static final class_4190 field_6612 = class_6414.method_29292(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   public static final class_4190 field_6605 = class_6414.method_29292(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   public static final class_4190 field_6601 = class_6414.method_29292(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   public static final class_4190 field_6619 = class_6414.method_29292(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   public static final class_4190 field_6615 = class_6414.method_29292(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   public static final class_4190 field_6606 = class_6414.method_29292(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   public static final class_4190 field_6618 = class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   public static final class_4190 field_6602 = class_6414.method_29292(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   public static final class_4190 field_6608 = class_6414.method_29292(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   public static final class_4190 field_6607 = class_6414.method_29292(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   public static final class_4190 field_6600 = class_6414.method_29292(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   public static final class_4190 field_6617 = class_6414.method_29292(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final class_4190[] field_6613 = method_5185(true);
   private static final class_4190[] field_6609 = method_5185(false);

   private static class_4190[] method_5185(boolean var0) {
      return Arrays.<Direction>stream(Direction.values()).<class_4190>map(var1 -> method_5183(var1, var0)).<class_4190>toArray(class_4190[]::new);
   }

   private static class_4190 method_5183(Direction var0, boolean var1) {
      switch (var0) {
         case field_802:
         default:
            return class_3370.method_15530(field_6611, var1 ? field_6602 : field_6605);
         case field_817:
            return class_3370.method_15530(field_6604, var1 ? field_6618 : field_6612);
         case field_818:
            return class_3370.method_15530(field_6599, var1 ? field_6607 : field_6619);
         case field_800:
            return class_3370.method_15530(field_6598, var1 ? field_6608 : field_6601);
         case field_809:
            return class_3370.method_15530(field_6603, var1 ? field_6617 : field_6606);
         case field_804:
            return class_3370.method_15530(field_6620, var1 ? field_6600 : field_6615);
      }
   }

   public class_1166(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_16180, Direction.field_818)
            .method_10308(field_6616, class_989.field_5039)
            .method_10308(field_6610, Boolean.valueOf(false))
      );
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return (!var1.<Boolean>method_10313(field_6610) ? field_6609 : field_6613)[var1.<Direction>method_10313(field_16180).ordinal()];
   }

   private boolean method_5184(class_2522 var1, class_2522 var2) {
      class_6414 var5 = var1.method_10313(field_6616) != class_989.field_5039 ? class_4783.field_23861 : class_4783.field_23649;
      return var2.method_8350(var5)
         && var2.<Boolean>method_10313(class_1990.field_10077)
         && var2.<Direction>method_10313(field_16180) == var1.<Direction>method_10313(field_16180);
   }

   @Override
   public void method_29265(World var1, class_1331 var2, class_2522 var3, class_704 var4) {
      if (!var1.field_33055 && var4.field_3876.isCreativeMode) {
         class_1331 var7 = var2.method_6098(var3.<Direction>method_10313(field_16180).method_1046());
         if (this.method_5184(var3, var1.method_28262(var7))) {
            var1.method_7510(var7, false);
         }
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         super.method_10761(var1, var2, var3, var4, var5);
         class_1331 var8 = var3.method_6098(var1.<Direction>method_10313(field_16180).method_1046());
         if (this.method_5184(var1, var2.method_28262(var8))) {
            var2.method_7510(var8, true);
         }
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2.method_1046() == var1.method_10313(field_16180) && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3.method_6098(var1.<Direction>method_10313(field_16180).method_1046()));
      return this.method_5184(var1, var6)
         || var6.method_8350(class_4783.field_23833) && var6.<Direction>method_10313(field_16180) == var1.<Direction>method_10313(field_16180);
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (var1.method_8309(var2, var3)) {
         class_1331 var9 = var3.method_6098(var1.<Direction>method_10313(field_16180).method_1046());
         var2.method_28262(var9).method_8343(var2, var9, var4, var5, false);
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      return new ItemStack(var3.method_10313(field_6616) != class_989.field_5035 ? class_4783.field_23649 : class_4783.field_23861);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_16180, var2.method_30489(var1.<Direction>method_10313(field_16180)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_16180)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16180, field_6616, field_6610);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
