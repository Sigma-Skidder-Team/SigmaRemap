package remapped;

import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_3633 extends class_380 implements class_724 {
   public static final class_7360<class_7095> field_17729 = class_6023.field_30704;
   public static final class_6720 field_17728 = class_6023.field_30717;
   public static final class_4190 field_17732 = class_6414.method_29292(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   public static final class_4190 field_17730 = class_6414.method_29292(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   public static final class_4190 field_17726 = class_6414.method_29292(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   public static final class_4190 field_17737 = class_6414.method_29292(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   public static final class_4190 field_17733 = class_6414.method_29292(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   public static final class_4190 field_17738 = class_3370.method_15531(field_17732, field_17730, field_17737);
   public static final class_4190 field_17731 = class_3370.method_15531(field_17732, field_17726, field_17733);
   public static final class_4190 field_17727 = class_3370.method_15531(field_17732, field_17730, field_17726);
   public static final class_4190 field_17735 = class_3370.method_15531(field_17732, field_17737, field_17733);
   private final class_9077 field_17734;

   public class_3633(class_9077 var1, class_3073 var2) {
      super(var2);
      this.field_17734 = var1;
      this.method_29284(this.field_32751.method_36446().method_10308(field_17729, class_7095.field_36604).method_10308(field_17728, Boolean.valueOf(false)));
   }

   @Nullable
   public static Direction method_16936(class_6163 var0, class_1331 var1) {
      class_2522 var4 = var0.method_28262(var1);
      return !(var4.method_8360() instanceof class_3633) ? null : var4.<Direction>method_10313(field_1543);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         if (var1.<class_7095>method_10313(field_17729) != class_7095.field_36603) {
            var3 = var3.method_6098(var1.<Direction>method_10313(field_1543));
            var1 = var2.method_28262(var3);
            if (!var1.method_8350(this)) {
               return class_6910.field_35518;
            }
         }

         if (method_16930(var2)) {
            if (!var1.<Boolean>method_10313(field_17728)) {
               var4.method_3200(var3).ifLeft(var1x -> {
                  if (var1x != null) {
                     var4.method_3251(var1x.method_39593(), true);
                  }
               });
               return class_6910.field_35520;
            } else {
               if (!this.method_16934(var2, var3)) {
                  var4.method_3251(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
               }

               return class_6910.field_35520;
            }
         } else {
            var2.method_7508(var3, false);
            class_1331 var9 = var3.method_6098(var1.<Direction>method_10313(field_1543).method_1046());
            if (var2.method_28262(var9).method_8350(this)) {
               var2.method_7508(var9, false);
            }

            var2.method_29575(
               (Entity)null,
               class_6199.method_28378(),
               (class_7571)null,
               (double)var3.method_12173() + 0.5,
               (double)var3.method_12165() + 0.5,
               (double)var3.method_12185() + 0.5,
               5.0F,
               true,
               class_7298.field_37311
            );
            return class_6910.field_35520;
         }
      } else {
         return class_6910.field_35518;
      }
   }

   public static boolean method_16930(World var0) {
      return var0.method_22572().method_40245();
   }

   private boolean method_16934(World var1, class_1331 var2) {
      List var5 = var1.<class_7666>method_25869(class_7666.class, new class_4092(var2), class_5834::method_26507);
      if (!var5.isEmpty()) {
         ((class_7666)var5.get(0)).method_26557();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_29263(World var1, class_1331 var2, Entity var3, float var4) {
      super.method_29263(var1, var2, var3, var4 * 0.5F);
   }

   @Override
   public void method_29297(class_6163 var1, Entity var2) {
      if (!var2.method_37154()) {
         this.method_16927(var2);
      } else {
         super.method_29297(var1, var2);
      }
   }

   private void method_16927(Entity var1) {
      class_1343 var4 = var1.method_37098();
      if (var4.field_7333 < 0.0) {
         double var5 = !(var1 instanceof class_5834) ? 0.8 : 1.0;
         var1.method_37214(var4.field_7336, -var4.field_7333 * 0.66F * var5, var4.field_7334);
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 != method_16938(var1.<class_7095>method_10313(field_17729), var1.<Direction>method_10313(field_1543))) {
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         return var3.method_8350(this) && var3.method_10313(field_17729) != var1.method_10313(field_17729)
            ? var1.method_10308(field_17728, var3.<Boolean>method_10313(field_17728))
            : class_4783.field_23184.method_29260();
      }
   }

   private static Direction method_16938(class_7095 var0, Direction var1) {
      return var0 != class_7095.field_36604 ? var1.method_1046() : var1;
   }

   @Override
   public void method_29265(World var1, class_1331 var2, class_2522 var3, class_704 var4) {
      if (!var1.field_33055 && var4.method_3186()) {
         class_7095 var7 = var3.<class_7095>method_10313(field_17729);
         if (var7 == class_7095.field_36604) {
            class_1331 var8 = var2.method_6098(method_16938(var7, var3.<Direction>method_10313(field_1543)));
            class_2522 var9 = var1.method_28262(var8);
            if (var9.method_8360() == this && var9.<class_7095>method_10313(field_17729) == class_7095.field_36603) {
               var1.method_7513(var8, class_4783.field_23184.method_29260(), 35);
               var1.method_43365(var4, 2001, var8, class_6414.method_29285(var9));
            }
         }
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      Direction var4 = var1.method_21863();
      class_1331 var5 = var1.method_21858();
      class_1331 var6 = var5.method_6098(var4);
      return !var1.method_21862().method_28262(var6).method_8374(var1) ? null : this.method_29260().method_10308(field_1543, var4);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      Direction var7 = method_16931(var1).method_1046();
      switch (var7) {
         case field_818:
            return field_17738;
         case field_800:
            return field_17731;
         case field_809:
            return field_17727;
         default:
            return field_17735;
      }
   }

   public static Direction method_16931(class_2522 var0) {
      Direction var3 = var0.<Direction>method_10313(field_1543);
      return var0.method_10313(field_17729) != class_7095.field_36603 ? var3 : var3.method_1046();
   }

   public static class_1168 method_16926(class_2522 var0) {
      class_7095 var3 = var0.<class_7095>method_10313(field_17729);
      return var3 != class_7095.field_36603 ? class_1168.field_6625 : class_1168.field_6621;
   }

   private static boolean method_16929(class_6163 var0, class_1331 var1) {
      return var0.method_28262(var1.method_6100()).method_8360() instanceof class_3633;
   }

   public static Optional<class_1343> method_16932(class_6629<?> var0, class_1449 var1, class_1331 var2, float var3) {
      Direction var6 = var1.method_28262(var2).<Direction>method_10313(field_1543);
      Direction var7 = var6.method_1042();
      Direction var8 = !var7.method_1052(var3) ? var7 : var7.method_1046();
      if (!method_16929(var1, var2)) {
         int[][] var9 = method_16928(var6, var8);
         Optional var10 = method_16924(var0, var1, var2, var9, true);
         return !var10.isPresent() ? method_16924(var0, var1, var2, var9, false) : var10;
      } else {
         return method_16937(var0, var1, var2, var6, var8);
      }
   }

   private static Optional<class_1343> method_16937(class_6629<?> var0, class_1449 var1, class_1331 var2, Direction var3, Direction var4) {
      int[][] var7 = method_16933(var3, var4);
      Optional var8 = method_16924(var0, var1, var2, var7, true);
      if (!var8.isPresent()) {
         class_1331 var9 = var2.method_6100();
         Optional var10 = method_16924(var0, var1, var9, var7, true);
         if (!var10.isPresent()) {
            int[][] var11 = method_16925(var3);
            Optional var12 = method_16924(var0, var1, var2, var11, true);
            if (!var12.isPresent()) {
               Optional var13 = method_16924(var0, var1, var2, var7, false);
               if (!var13.isPresent()) {
                  Optional var14 = method_16924(var0, var1, var9, var7, false);
                  return !var14.isPresent() ? method_16924(var0, var1, var2, var11, false) : var14;
               } else {
                  return var13;
               }
            } else {
               return var12;
            }
         } else {
            return var10;
         }
      } else {
         return var8;
      }
   }

   private static Optional<class_1343> method_16924(class_6629<?> var0, class_1449 var1, class_1331 var2, int[][] var3, boolean var4) {
      class_2921 var7 = new class_2921();

      for (int[] var11 : var3) {
         var7.method_13362(var2.method_12173() + var11[0], var2.method_12165(), var2.method_12185() + var11[1]);
         class_1343 var12 = class_160.method_650(var0, var1, var7, var4);
         if (var12 != null) {
            return Optional.<class_1343>of(var12);
         }
      }

      return Optional.<class_1343>empty();
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3916;
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38467;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_17729, field_17728);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_1578(this.field_17734);
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      super.method_29257(var1, var2, var3, var4, var5);
      if (!var1.field_33055) {
         class_1331 var8 = var2.method_6098(var3.<Direction>method_10313(field_1543));
         var1.method_7513(var8, var3.method_10308(field_17729, class_7095.field_36603), 3);
         var1.method_43369(var2, class_4783.field_23184);
         var3.method_8367(var1, var2, 3);
      }
   }

   public class_9077 method_16935() {
      return this.field_17734;
   }

   @Override
   public long method_10759(class_2522 var1, class_1331 var2) {
      class_1331 var5 = var2.method_6099(var1.<Direction>method_10313(field_1543), var1.method_10313(field_17729) != class_7095.field_36603 ? 1 : 0);
      return class_9299.method_42839(var5.method_12173(), var2.method_12165(), var5.method_12185());
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }

   private static int[][] method_16928(Direction var0, Direction var1) {
      return (int[][])ArrayUtils.addAll(method_16933(var0, var1), method_16925(var0));
   }

   private static int[][] method_16933(Direction var0, Direction var1) {
      return new int[][]{
         {var1.method_1041(), var1.method_1034()},
         {var1.method_1041() - var0.method_1041(), var1.method_1034() - var0.method_1034()},
         {var1.method_1041() - var0.method_1041() * 2, var1.method_1034() - var0.method_1034() * 2},
         {-var0.method_1041() * 2, -var0.method_1034() * 2},
         {-var1.method_1041() - var0.method_1041() * 2, -var1.method_1034() - var0.method_1034() * 2},
         {-var1.method_1041() - var0.method_1041(), -var1.method_1034() - var0.method_1034()},
         {-var1.method_1041(), -var1.method_1034()},
         {-var1.method_1041() + var0.method_1041(), -var1.method_1034() + var0.method_1034()},
         {var0.method_1041(), var0.method_1034()},
         {var1.method_1041() + var0.method_1041(), var1.method_1034() + var0.method_1034()}
      };
   }

   private static int[][] method_16925(Direction var0) {
      return new int[][]{{0, 0}, {-var0.method_1041(), -var0.method_1034()}};
   }
}
