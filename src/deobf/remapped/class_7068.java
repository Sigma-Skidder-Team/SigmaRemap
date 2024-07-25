package remapped;

import java.util.Random;

public class class_7068 extends class_3266 {
   private static String[] field_36496;
   public static final class_6720 field_36495 = class_6023.field_30696;

   public class_7068(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_16180, class_240.field_800).method_10308(field_36495, Boolean.valueOf(false)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16180, field_36495);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_16180, var2.method_30489(var1.<class_240>method_10313(field_16180)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_16180)));
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (!var1.<Boolean>method_10313(field_36495)) {
         var2.method_7513(var3, var1.method_10308(field_36495, Boolean.valueOf(true)), 2);
         var2.method_28968().method_14011(var3, this, 2);
      } else {
         var2.method_7513(var3, var1.method_10308(field_36495, Boolean.valueOf(false)), 2);
      }

      this.method_32560(var2, var3, var1);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<class_240>method_10313(field_16180) == var2 && !var1.<Boolean>method_10313(field_36495)) {
         this.method_32559(var4, var5);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   private void method_32559(class_9379 var1, class_1331 var2) {
      if (!var1.method_22567() && !var1.method_43367().method_14013(var2, this)) {
         var1.method_43367().method_14011(var2, this, 2);
      }
   }

   public void method_32560(class_6486 var1, class_1331 var2, class_2522 var3) {
      class_240 var6 = var3.<class_240>method_10313(field_16180);
      class_1331 var7 = var2.method_6098(var6.method_1046());
      var1.method_29520(var7, this, var2);
      var1.method_29526(var7, this, var6);
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return var1.method_8327(var2, var3, var4);
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return var1.<Boolean>method_10313(field_36495) && var1.method_10313(field_16180) == var4 ? 15 : 0;
   }

   @Override
   public void method_10760(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())
         && !var2.method_22567()
         && var1.<Boolean>method_10313(field_36495)
         && !var2.method_43367().method_14013(var3, this)) {
         class_2522 var8 = var1.method_10308(field_36495, Boolean.valueOf(false));
         var2.method_7513(var3, var8, 18);
         this.method_32560(var2, var3, var8);
      }
   }

   @Override
   public void method_10761(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360()) && !var2.field_33055 && var1.<Boolean>method_10313(field_36495) && var2.method_43367().method_14013(var3, this)
         )
       {
         this.method_32560(var2, var3, var1.method_10308(field_36495, Boolean.valueOf(false)));
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_16180, var1.method_1782().method_1046().method_1046());
   }
}
