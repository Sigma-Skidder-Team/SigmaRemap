package remapped;

public class class_9279 extends class_4314 {
   private static String[] field_47328;
   public static final class_6162 field_47337 = class_6023.field_30743;
   public static final class_6720 field_47330 = class_6023.field_30714;
   private static final class_4190 field_47333 = class_6414.method_29292(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final class_4190 field_47329 = class_6414.method_29292(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final class_4190 field_47332 = class_3370.method_15530(field_47329, field_47333);
   private static final class_4190 field_47336 = class_3370.method_15533(field_47332, class_4511.field_22051, class_8529.field_43656);
   private static final class_4190 field_47321 = class_3370.method_15530(field_47336, class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final class_4190 field_47334 = class_3370.method_15530(field_47336, class_6414.method_29292(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final class_4190 field_47327 = class_3370.method_15530(field_47336, class_6414.method_29292(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final class_4190 field_47331 = class_3370.method_15530(field_47336, class_6414.method_29292(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final class_4190 field_47335 = class_3370.method_15530(field_47336, class_6414.method_29292(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final class_4190 field_47324 = class_4511.field_22051;
   private static final class_4190 field_47323 = class_3370.method_15530(class_4511.field_22051, class_6414.method_29292(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final class_4190 field_47326 = class_3370.method_15530(class_4511.field_22051, class_6414.method_29292(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final class_4190 field_47325 = class_3370.method_15530(class_4511.field_22051, class_6414.method_29292(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final class_4190 field_47322 = class_3370.method_15530(class_4511.field_22051, class_6414.method_29292(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public class_9279(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_47337, Direction.field_802).method_10308(field_47330, Boolean.valueOf(true)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      switch ((Direction)var1.method_10313(field_47337)) {
         case field_802:
            return field_47321;
         case field_818:
            return field_47327;
         case field_800:
            return field_47331;
         case field_809:
            return field_47335;
         case field_804:
            return field_47334;
         default:
            return field_47336;
      }
   }

   @Override
   public class_4190 method_10776(class_2522 var1, class_6163 var2, class_1331 var3) {
      switch ((Direction)var1.method_10313(field_47337)) {
         case field_802:
            return field_47324;
         case field_818:
            return field_47326;
         case field_800:
            return field_47325;
         case field_809:
            return field_47322;
         case field_804:
            return field_47323;
         default:
            return class_4511.field_22051;
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      Direction var4 = var1.method_21857().method_1046();
      return this.method_29260()
         .method_10308(field_47337, var4.method_1029() != class_9249.field_47216 ? var4 : Direction.field_802)
         .method_10308(field_47330, Boolean.valueOf(true));
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5772();
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_5772) {
            ((class_5772)var8).method_38432(var5.method_28008());
         }
      }
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         this.method_42743(var2, var3, var1);
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_5772) {
            var4.method_3152((class_5772)var9);
            var4.method_3209(class_6234.field_31851);
         }

         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      this.method_42743(var2, var3, var1);
   }

   private void method_42743(World var1, class_1331 var2, class_2522 var3) {
      boolean var6 = !var1.method_29576(var2);
      if (var6 != var3.<Boolean>method_10313(field_47330)) {
         var1.method_7513(var2, var3.method_10308(field_47330, Boolean.valueOf(var6)), 4);
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_5772) {
            class_1573.method_7104(var2, var3, (class_5772)var8);
            var2.method_29523(var3, this);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return class_4088.method_18863(var2.method_28260(var3));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_47337, var2.method_30489(var1.<Direction>method_10313(field_47337)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_47337)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_47337, field_47330);
   }

   @Override
   public void method_10784(class_2522 var1, World var2, class_1331 var3, Entity var4) {
      class_3757 var7 = var2.method_28260(var3);
      if (var7 instanceof class_5772) {
         ((class_5772)var7).method_26088(var4);
      }
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
