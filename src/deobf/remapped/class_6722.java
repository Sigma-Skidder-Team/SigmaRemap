package remapped;

import javax.annotation.Nullable;

public class class_6722 extends class_4314 {
   private static String[] field_34721;
   public static final class_6162 field_34709 = class_380.field_1543;
   public static final class_7360<class_7048> field_34719 = class_6023.field_30710;
   public static final class_6720 field_34722 = class_6023.field_30696;
   private static final class_4190 field_34715 = class_6414.method_29292(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final class_4190 field_34716 = class_6414.method_29292(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final class_4190 field_34707 = class_6414.method_29292(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final class_4190 field_34713 = class_6414.method_29292(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final class_4190 field_34718 = class_3370.method_15530(field_34713, field_34707);
   private static final class_4190 field_34712 = class_3370.method_15530(field_34718, class_6414.method_29292(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final class_4190 field_34720 = class_3370.method_15530(field_34718, class_6414.method_29292(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final class_4190 field_34710 = class_3370.method_15530(field_34718, class_6414.method_29292(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final class_4190 field_34714 = class_3370.method_15530(field_34718, class_6414.method_29292(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final class_4190 field_34717 = class_3370.method_15530(field_34718, class_6414.method_29292(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final class_4190 field_34708 = class_3370.method_15530(field_34718, class_6414.method_29292(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final class_4190 field_34711 = class_3370.method_15530(field_34718, class_6414.method_29292(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));

   public class_6722(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_34709, class_240.field_818)
            .method_10308(field_34719, class_7048.field_36394)
            .method_10308(field_34722, Boolean.valueOf(false))
      );
   }

   @Override
   public void method_10801(class_2522 var1, class_6486 var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      boolean var9 = var2.method_29576(var3);
      if (var9 != var1.<Boolean>method_10313(field_34722)) {
         if (var9) {
            this.method_30850(var2, var3, (class_240)null);
         }

         var2.method_7513(var3, var1.method_10308(field_34722, Boolean.valueOf(var9)), 3);
      }
   }

   @Override
   public void method_10758(class_6486 var1, class_2522 var2, class_9529 var3, class_5783 var4) {
      class_8145 var7 = var4.method_26166();
      class_704 var8 = !(var7 instanceof class_704) ? null : (class_704)var7;
      this.method_30852(var1, var2, var3, var8, true);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      return !this.method_30852(var2, var1, var6, var4, true) ? class_6910.field_35521 : class_6910.method_31659(var2.field_33055);
   }

   public boolean method_30852(class_6486 var1, class_2522 var2, class_9529 var3, class_704 var4, boolean var5) {
      class_240 var8 = var3.method_43956();
      class_1331 var9 = var3.method_43955();
      boolean var10 = !var5 || this.method_30853(var2, var8, var3.method_33993().field_7333 - (double)var9.method_12165());
      if (!var10) {
         return false;
      } else {
         boolean var11 = this.method_30850(var1, var9, var8);
         if (var11 && var4 != null) {
            var4.method_3209(class_6234.field_31871);
         }

         return true;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean method_30853(class_2522 var1, class_240 var2, double var3) {
      if (var2.method_1029() != class_9249.field_47216 && !(var3 > 0.8124F)) {
         class_240 var7 = var1.<class_240>method_10313(field_34709);
         class_7048 var8 = var1.<class_7048>method_10313(field_34719);
         switch (var8) {
            case field_36394:
               return var7.method_1029() == var2.method_1029();
            case field_36397:
            case field_36395:
               return var7.method_1029() != var2.method_1029();
            case field_36399:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_30850(class_6486 var1, class_1331 var2, class_240 var3) {
      class_3757 var6 = var1.method_28260(var2);
      if (!var1.field_33055 && var6 instanceof class_9317) {
         if (var3 == null) {
            var3 = var1.method_28262(var2).<class_240>method_10313(field_34709);
         }

         ((class_9317)var6).method_43016(var3);
         var1.method_43359((class_704)null, var2, class_463.field_2276, class_562.field_3322, 2.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   private class_4190 method_30851(class_2522 var1) {
      class_240 var4 = var1.<class_240>method_10313(field_34709);
      class_7048 var5 = var1.<class_7048>method_10313(field_34719);
      if (var5 != class_7048.field_36394) {
         if (var5 != class_7048.field_36399) {
            if (var5 != class_7048.field_36395) {
               if (var4 != class_240.field_818) {
                  if (var4 != class_240.field_800) {
                     return var4 != class_240.field_804 ? field_34710 : field_34714;
                  } else {
                     return field_34708;
                  }
               } else {
                  return field_34717;
               }
            } else {
               return var4 != class_240.field_818 && var4 != class_240.field_800 ? field_34720 : field_34712;
            }
         } else {
            return field_34711;
         }
      } else {
         return var4 != class_240.field_818 && var4 != class_240.field_800 ? field_34716 : field_34715;
      }
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.method_30851(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.method_30851(var1);
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_240 var4 = var1.method_21857();
      class_1331 var5 = var1.method_21858();
      class_6486 var6 = var1.method_21862();
      class_9249 var7 = var4.method_1029();
      if (var7 != class_9249.field_47216) {
         boolean var8 = var7 == class_9249.field_47215
               && var6.method_28262(var5.method_6108()).method_8308(var6, var5.method_6108(), class_240.field_804)
               && var6.method_28262(var5.method_6090()).method_8308(var6, var5.method_6090(), class_240.field_809)
            || var7 == class_9249.field_47219
               && var6.method_28262(var5.method_6094()).method_8308(var6, var5.method_6094(), class_240.field_800)
               && var6.method_28262(var5.method_6073()).method_8308(var6, var5.method_6073(), class_240.field_818);
         class_2522 var9 = this.method_29260()
            .method_10308(field_34709, var4.method_1046())
            .method_10308(field_34719, !var8 ? class_7048.field_36397 : class_7048.field_36395);
         if (var9.method_8309(var1.method_21862(), var1.method_21858())) {
            return var9;
         }

         boolean var10 = var6.method_28262(var5.method_6100()).method_8308(var6, var5.method_6100(), class_240.field_817);
         var9 = var9.method_10308(field_34719, !var10 ? class_7048.field_36399 : class_7048.field_36394);
         if (var9.method_8309(var1.method_21862(), var1.method_21858())) {
            return var9;
         }
      } else {
         class_2522 var11 = this.method_29260()
            .method_10308(field_34719, var4 != class_240.field_802 ? class_7048.field_36394 : class_7048.field_36399)
            .method_10308(field_34709, var1.method_21863());
         if (var11.method_8309(var1.method_21862(), var5)) {
            return var11;
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      class_7048 var9 = var1.<class_7048>method_10313(field_34719);
      class_240 var10 = method_30849(var1).method_1046();
      if (var10 == var2 && !var1.method_8309(var4, var5) && var9 != class_7048.field_36395) {
         return class_4783.field_23184.method_29260();
      } else {
         if (var2.method_1029() == var1.<class_240>method_10313(field_34709).method_1029()) {
            if (var9 == class_7048.field_36395 && !var3.method_8308(var4, var6, var2)) {
               return var1.method_10308(field_34719, class_7048.field_36397).method_10308(field_34709, var2.method_1046());
            }

            if (var9 == class_7048.field_36397 && var10.method_1046() == var2 && var3.method_8308(var4, var6, var1.<class_240>method_10313(field_34709))) {
               return var1.method_10308(field_34719, class_7048.field_36395);
            }
         }

         return super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_240 var6 = method_30849(var1).method_1046();
      return var6 != class_240.field_817 ? class_2620.method_11867(var2, var3, var6) : class_6414.method_29266(var2, var3.method_6081(), class_240.field_802);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class_240 method_30849(class_2522 var0) {
      switch ((class_7048)var0.method_10313(field_34719)) {
         case field_36394:
            return class_240.field_817;
         case field_36399:
            return class_240.field_802;
         default:
            return var0.<class_240>method_10313(field_34709).method_1046();
      }
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3916;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_34709, field_34719, field_34722);
   }

   @Nullable
   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_9317();
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
