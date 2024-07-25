package remapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Random;

public class class_6451 extends class_4314 {
   private static String[] field_32902;
   public static final class_6162 field_32900 = class_3266.field_16180;
   public static final class_6720 field_32899 = class_6023.field_30746;
   private static final Map<class_2451, class_6191> field_32901 = Util.<Map<class_2451, class_6191>>method_44659(
      new Object2ObjectOpenHashMap(), var0 -> var0.defaultReturnValue(new class_9446())
   );

   public static void method_29408(class_8525 var0, class_6191 var1) {
      field_32901.put(var0.method_10803(), var1);
   }

   public class_6451(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_32900, Direction.field_818).method_10308(field_32899, Boolean.valueOf(false)));
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_7434) {
            var4.method_3152((class_7434)var9);
            if (!(var9 instanceof class_5705)) {
               var4.method_3209(class_6234.field_31881);
            } else {
               var4.method_3209(class_6234.field_31872);
            }
         }

         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   public void method_29410(class_6331 var1, class_1331 var2) {
      class_1010 var5 = new class_1010(var1, var2);
      class_7434 var6 = var5.<class_7434>method_40143();
      int var7 = var6.method_33831();
      if (var7 >= 0) {
         ItemStack var8 = var6.method_31498(var7);
         class_6191 var9 = this.method_29409(var8);
         if (var9 != class_6191.field_31621) {
            var6.method_31503(var7, var9.method_28324(var5, var8));
         }
      } else {
         var1.method_43364(1001, var2, 0);
      }
   }

   public class_6191 method_29409(ItemStack var1) {
      return field_32901.get(var1.method_27960());
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      boolean var9 = var2.method_29576(var3) || var2.method_29576(var3.method_6081());
      boolean var10 = var1.<Boolean>method_10313(field_32899);
      if (var9 && !var10) {
         var2.method_43367().method_14011(var3, this, 4);
         var2.method_7513(var3, var1.method_10308(field_32899, Boolean.valueOf(true)), 4);
      } else if (!var9 && var10) {
         var2.method_7513(var3, var1.method_10308(field_32899, Boolean.valueOf(false)), 4);
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      this.method_29410(var2, var3);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_7434();
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_32900, var1.method_1782().method_1046());
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_7434) {
            ((class_7434)var8).method_38432(var5.method_28008());
         }
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_7434) {
            class_1573.method_7104(var2, var3, (class_7434)var8);
            var2.method_29523(var3, this);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   public static class_66 method_29411(class_8743 var0) {
      Direction var3 = var0.method_40141().<Direction>method_10313(field_32900);
      double var4 = var0.method_61() + 0.7 * (double)var3.method_1041();
      double var6 = var0.method_60() + 0.7 * (double)var3.method_1054();
      double var8 = var0.method_62() + 0.7 * (double)var3.method_1034();
      return new class_8998(var4, var6, var8);
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
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_32900, var2.method_30489(var1.<Direction>method_10313(field_32900)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_32900)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_32900, field_32899);
   }
}
