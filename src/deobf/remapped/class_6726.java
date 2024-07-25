package remapped;

public class class_6726 extends class_6414 {
   private static String[] field_34735;
   public static final class_7044 field_34736 = class_6023.field_30684;
   public static final class_4190[] field_34734 = new class_4190[]{
      class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      class_6414.method_29292(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      class_6414.method_29292(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      class_6414.method_29292(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      class_6414.method_29292(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      class_6414.method_29292(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      class_6414.method_29292(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   public class_6726(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_34736, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_34734[var1.<Integer>method_10313(field_34736)];
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (var2.field_33055) {
         ItemStack var9 = var4.method_26617(var5);
         if (this.method_30861(var2, var3, var1, var4).method_31662()) {
            return class_6910.field_35520;
         }

         if (var9.method_28022()) {
            return class_6910.field_35518;
         }
      }

      return this.method_30861(var2, var3, var1, var4);
   }

   private class_6910 method_30861(class_9379 var1, class_1331 var2, class_2522 var3, class_704 var4) {
      if (var4.method_3231(false)) {
         var4.method_3209(class_6234.field_31859);
         var4.method_3161().method_42236(2, 0.1F);
         int var7 = var3.<Integer>method_10313(field_34736);
         if (var7 >= 6) {
            var1.method_7508(var2, false);
         } else {
            var1.method_7513(var2, var3.method_10308(field_34736, Integer.valueOf(var7 + 1)), 3);
         }

         return class_6910.field_35520;
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 == Direction.field_802 && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return var2.method_28262(var3.method_6100()).method_8362().method_24499();
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_34736);
   }

   @Override
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return (7 - var1.<Integer>method_10313(field_34736)) * 2;
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
