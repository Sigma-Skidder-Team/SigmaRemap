package remapped;

import java.util.List;
import java.util.Random;

public abstract class class_7812 extends class_2620 {
   public static final class_6720 field_39638 = class_6023.field_30696;
   public static final class_4190 field_39635 = class_6414.method_29292(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   public static final class_4190 field_39623 = class_6414.method_29292(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   public static final class_4190 field_39631 = class_6414.method_29292(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   public static final class_4190 field_39640 = class_6414.method_29292(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   public static final class_4190 field_39628 = class_6414.method_29292(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   public static final class_4190 field_39626 = class_6414.method_29292(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   public static final class_4190 field_39624 = class_6414.method_29292(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   public static final class_4190 field_39633 = class_6414.method_29292(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   public static final class_4190 field_39627 = class_6414.method_29292(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   public static final class_4190 field_39632 = class_6414.method_29292(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   public static final class_4190 field_39639 = class_6414.method_29292(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   public static final class_4190 field_39636 = class_6414.method_29292(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   public static final class_4190 field_39630 = class_6414.method_29292(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   public static final class_4190 field_39625 = class_6414.method_29292(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   public static final class_4190 field_39634 = class_6414.method_29292(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   public static final class_4190 field_39637 = class_6414.method_29292(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final boolean field_39629;

   public class_7812(boolean var1, class_3073 var2) {
      super(var2);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_1543, Direction.field_818)
            .method_10308(field_39638, Boolean.valueOf(false))
            .method_10308(field_12920, class_1895.field_9680)
      );
      this.field_39629 = var1;
   }

   private int method_35402() {
      return !this.field_39629 ? 20 : 30;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      Direction var7 = var1.<Direction>method_10313(field_1543);
      boolean var8 = var1.<Boolean>method_10313(field_39638);
      switch ((class_1895)var1.method_10313(field_12920)) {
         case field_9677:
            if (var7.method_1029() == class_9249.field_47215) {
               return var8 ? field_39639 : field_39631;
            }

            return var8 ? field_39636 : field_39640;
         case field_9680:
            switch (var7) {
               case field_804:
                  return var8 ? field_39637 : field_39633;
               case field_809:
                  return var8 ? field_39634 : field_39624;
               case field_800:
                  return var8 ? field_39625 : field_39626;
               case field_818:
               default:
                  return var8 ? field_39630 : field_39628;
            }
         case field_9679:
         default:
            if (var7.method_1029() == class_9249.field_47215) {
               return var8 ? field_39627 : field_39635;
            } else {
               return var8 ? field_39632 : field_39623;
            }
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      if (!var1.<Boolean>method_10313(field_39638)) {
         this.method_35400(var1, var2, var3);
         this.method_35403(var4, var2, var3, true);
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35518;
      }
   }

   public void method_35400(class_2522 var1, World var2, BlockPos var3) {
      var2.method_7513(var3, var1.method_10308(field_39638, Boolean.valueOf(true)), 3);
      this.method_35404(var1, var2, var3);
      var2.method_43367().method_14011(var3, this, this.method_35402());
   }

   public void method_35403(class_704 var1, class_9379 var2, BlockPos var3, boolean var4) {
      var2.method_43359(!var4 ? null : var1, var3, this.method_35399(var4), class_562.field_3322, 0.3F, !var4 ? 0.5F : 0.6F);
   }

   public abstract class_8461 method_35399(boolean var1);

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         if (var1.<Boolean>method_10313(field_39638)) {
            this.method_35404(var1, var2, var3);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method_10313(field_39638) ? 0 : 15;
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method_10313(field_39638) && method_11868(var1) == var4 ? 15 : 0;
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method_10313(field_39638)) {
         if (!this.field_39629) {
            var2.method_7513(var3, var1.method_10308(field_39638, Boolean.valueOf(false)), 3);
            this.method_35404(var1, var2, var3);
            this.method_35403((class_704)null, var2, var3, false);
         } else {
            this.method_35401(var1, var2, var3);
         }
      }
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.field_33055 && this.field_39629 && !var1.<Boolean>method_10313(field_39638)) {
         this.method_35401(var1, var2, var3);
      }
   }

   private void method_35401(class_2522 var1, World var2, BlockPos var3) {
      List var6 = var2.<class_6749>method_25868(class_6749.class, var1.method_8334(var2, var3).method_19483().method_18919(var3));
      boolean var7 = !var6.isEmpty();
      boolean var8 = var1.<Boolean>method_10313(field_39638);
      if (var7 != var8) {
         var2.method_7513(var3, var1.method_10308(field_39638, Boolean.valueOf(var7)), 3);
         this.method_35404(var1, var2, var3);
         this.method_35403((class_704)null, var2, var3, var7);
      }

      if (var7) {
         var2.method_43367().method_14011(new BlockPos(var3), this, this.method_35402());
      }
   }

   private void method_35404(class_2522 var1, World var2, BlockPos var3) {
      var2.method_29563(var3, this);
      var2.method_29563(var3.method_6098(method_11868(var1).method_1046()), this);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_39638, field_12920);
   }
}
