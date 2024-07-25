package remapped;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class class_7855 extends class_6414 implements class_5978 {
   private static String[] field_39803;
   public static final class_7044 field_39806 = class_6023.field_30705;
   public final class_3798 field_39804;
   private final List<class_4774> field_39805;
   public static final class_4190 field_39807 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

   public class_7855(class_3798 var1, class_3073 var2) {
      super(var2);
      this.field_39804 = var1;
      this.field_39805 = Lists.newArrayList();
      this.field_39805.add(var1.method_17649(false));

      for (int var5 = 1; var5 < 8; var5++) {
         this.field_39805.add(var1.method_17659(8 - var5, false));
      }

      this.field_39805.add(var1.method_17659(8, true));
      this.method_29284(this.field_32751.method_36446().method_10308(field_39806, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return var4.method_927(field_39807, var3, true)
            && var1.<Integer>method_10313(field_39806) == 0
            && var4.method_929(var2.method_28258(var3.method_6081()), this.field_39804)
         ? field_39807
         : class_3370.method_15536();
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.method_8364().method_22000();
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      var1.method_8364().method_21999(var2, var3, var4);
   }

   @Override
   public boolean method_29275(class_2522 var1, class_6163 var2, class_1331 var3) {
      return false;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return !this.field_39804.method_10724(class_6503.field_33095);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      int var4 = var1.<Integer>method_10313(field_39806);
      return this.field_39805.get(Math.min(var4, 8));
   }

   @Override
   public boolean method_10764(class_2522 var1, class_2522 var2, Direction var3) {
      return var2.method_8364().method_22005().method_10723(this.field_39804);
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38470;
   }

   @Override
   public List<ItemStack> method_10796(class_2522 var1, class_8480 var2) {
      return Collections.<ItemStack>emptyList();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return class_3370.method_15536();
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (this.method_35531(var2, var3, var1)) {
         var2.method_43362().method_14011(var3, var1.method_8364().method_22005(), this.field_39804.method_10711(var2));
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.method_8364().method_21993() || var3.method_8364().method_21993()) {
         var4.method_43362().method_14011(var5, var1.method_8364().method_22005(), this.field_39804.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (this.method_35531(var2, var3, var1)) {
         var2.method_43362().method_14011(var3, var1.method_8364().method_22005(), this.field_39804.method_10711(var2));
      }
   }

   private boolean method_35531(World var1, class_1331 var2, class_2522 var3) {
      if (this.field_39804.method_10724(class_6503.field_33095)) {
         boolean var6 = var1.method_28262(var2.method_6100()).method_8350(class_4783.field_23531);

         for (Direction var10 : Direction.values()) {
            if (var10 != Direction.field_802) {
               class_1331 var11 = var2.method_6098(var10);
               if (var1.method_28258(var11).method_22007(class_6503.field_33094)) {
                  class_6414 var12 = !var1.method_28258(var2).method_21993() ? class_4783.field_23808 : class_4783.field_23881;
                  var1.method_29594(var2, var12.method_29260());
                  this.method_35532(var1, var2);
                  return false;
               }

               if (var6 && var1.method_28262(var11).method_8350(class_4783.field_23437)) {
                  var1.method_29594(var2, class_4783.field_23788.method_29260());
                  this.method_35532(var1, var2);
                  return false;
               }
            }
         }
      }

      return true;
   }

   private void method_35532(class_9379 var1, class_1331 var2) {
      var1.method_43364(1501, var2, 0);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_39806);
   }

   @Override
   public class_2340 method_27280(class_9379 var1, class_1331 var2, class_2522 var3) {
      if (var3.<Integer>method_10313(field_39806) != 0) {
         return class_8532.field_43673;
      } else {
         var1.method_7513(var2, class_4783.field_23184.method_29260(), 11);
         return this.field_39804;
      }
   }
}
