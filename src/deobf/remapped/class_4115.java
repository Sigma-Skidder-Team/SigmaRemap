package remapped;

import javax.annotation.Nullable;

public class class_4115 extends class_6414 {
   private static String[] field_20054;
   public static final class_6162 field_20050 = class_380.field_1543;
   public static final class_6720 field_20051 = class_6023.field_30688;
   public static final class_7360<class_4340> field_20047 = class_6023.field_30721;
   public static final class_6720 field_20048 = class_6023.field_30696;
   public static final class_7360<class_7422> field_20045 = class_6023.field_30754;
   public static final class_4190 field_20049 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final class_4190 field_20046 = class_6414.method_29292(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_20052 = class_6414.method_29292(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_20053 = class_6414.method_29292(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

   public class_4115(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_20050, Direction.field_818)
            .method_10308(field_20051, Boolean.valueOf(false))
            .method_10308(field_20047, class_4340.field_21090)
            .method_10308(field_20048, Boolean.valueOf(false))
            .method_10308(field_20045, class_7422.field_37876)
      );
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      Direction var7 = var1.<Direction>method_10313(field_20050);
      boolean var8 = !var1.<Boolean>method_10313(field_20051);
      boolean var9 = var1.<class_4340>method_10313(field_20047) == class_4340.field_21091;
      switch (var7) {
         case field_804:
         default:
            return var8 ? field_20053 : (var9 ? field_20046 : field_20049);
         case field_800:
            return var8 ? field_20049 : (var9 ? field_20053 : field_20052);
         case field_809:
            return var8 ? field_20052 : (var9 ? field_20049 : field_20046);
         case field_818:
            return var8 ? field_20046 : (var9 ? field_20052 : field_20053);
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      class_7422 var9 = var1.<class_7422>method_10313(field_20045);
      if (var2.method_1029() == class_9249.field_47216 && var9 == class_7422.field_37876 == (var2 == Direction.field_817)) {
         return var3.method_8350(this) && var3.method_10313(field_20045) != var9
            ? var1.method_10308(field_20050, var3.<Direction>method_10313(field_20050))
               .method_10308(field_20051, var3.<Boolean>method_10313(field_20051))
               .method_10308(field_20047, var3.<class_4340>method_10313(field_20047))
               .method_10308(field_20048, var3.<Boolean>method_10313(field_20048))
            : class_4783.field_23184.method_29260();
      } else {
         return var9 == class_7422.field_37876 && var2 == Direction.field_802 && !var1.method_8309(var4, var5)
            ? class_4783.field_23184.method_29260()
            : super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void method_29265(World var1, class_1331 var2, class_2522 var3, class_704 var4) {
      if (!var1.field_33055 && var4.method_3186()) {
         class_3064.method_14008(var1, var2, var3, var4);
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      switch (var4) {
         case field_14271:
            return var1.<Boolean>method_10313(field_20051);
         case field_14272:
            return false;
         case field_14275:
            return var1.<Boolean>method_10313(field_20051);
         default:
            return false;
      }
   }

   private int method_19105() {
      return this.field_11820 != class_5371.field_27408 ? 1012 : 1011;
   }

   private int method_19111() {
      return this.field_11820 != class_5371.field_27408 ? 1006 : 1005;
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_1331 var4 = var1.method_21858();
      if (var4.method_12165() < 255 && var1.method_21862().method_28262(var4.method_6081()).method_8374(var1)) {
         World var5 = var1.method_21862();
         boolean var6 = var5.method_29576(var4) || var5.method_29576(var4.method_6081());
         return this.method_29260()
            .method_10308(field_20050, var1.method_21863())
            .method_10308(field_20047, this.method_19108(var1))
            .method_10308(field_20048, Boolean.valueOf(var6))
            .method_10308(field_20051, Boolean.valueOf(var6))
            .method_10308(field_20045, class_7422.field_37876);
      } else {
         return null;
      }
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      var1.method_7513(var2.method_6081(), var3.method_10308(field_20045, class_7422.field_37874), 3);
   }

   private class_4340 method_19108(class_353 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      Direction var6 = var1.method_21863();
      class_1331 var7 = var5.method_6081();
      Direction var8 = var6.method_1053();
      class_1331 var9 = var5.method_6098(var8);
      class_2522 var10 = var4.method_28262(var9);
      class_1331 var11 = var7.method_6098(var8);
      class_2522 var12 = var4.method_28262(var11);
      Direction var13 = var6.method_1042();
      class_1331 var14 = var5.method_6098(var13);
      class_2522 var15 = var4.method_28262(var14);
      class_1331 var16 = var7.method_6098(var13);
      class_2522 var17 = var4.method_28262(var16);
      int var18 = (!var10.method_8306(var4, var9) ? 0 : -1)
         + (!var12.method_8306(var4, var11) ? 0 : -1)
         + (!var15.method_8306(var4, var14) ? 0 : 1)
         + (!var17.method_8306(var4, var16) ? 0 : 1);
      boolean var19 = var10.method_8350(this) && var10.<class_7422>method_10313(field_20045) == class_7422.field_37876;
      boolean var20 = var15.method_8350(this) && var15.<class_7422>method_10313(field_20045) == class_7422.field_37876;
      if ((!var19 || var20) && var18 <= 0) {
         if ((!var20 || var19) && var18 >= 0) {
            int var21 = var6.method_1041();
            int var22 = var6.method_1034();
            class_1343 var23 = var1.method_21865();
            double var24 = var23.field_7336 - (double)var5.method_12173();
            double var26 = var23.field_7334 - (double)var5.method_12185();
            return var21 < 0 && var26 < 0.5 || var21 > 0 && var26 > 0.5 || var22 < 0 && var24 > 0.5 || var22 > 0 && var24 < 0.5
               ? class_4340.field_21091
               : class_4340.field_21090;
         } else {
            return class_4340.field_21090;
         }
      } else {
         return class_4340.field_21091;
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (this.field_11820 != class_5371.field_27408) {
         var1 = var1.method_10317(field_20051);
         var2.method_7513(var3, var1, 10);
         var2.method_43365(var4, !var1.<Boolean>method_10313(field_20051) ? this.method_19105() : this.method_19111(), var3, 0);
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   public boolean method_19104(class_2522 var1) {
      return var1.<Boolean>method_10313(field_20051);
   }

   public void method_19110(World var1, class_2522 var2, class_1331 var3, boolean var4) {
      if (var2.method_8350(this) && var2.<Boolean>method_10313(field_20051) != var4) {
         var1.method_7513(var3, var2.method_10308(field_20051, Boolean.valueOf(var4)), 10);
         this.method_19109(var1, var3, var4);
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      boolean var9 = var2.method_29576(var3)
         || var2.method_29576(var3.method_6098(var1.method_10313(field_20045) != class_7422.field_37876 ? Direction.field_802 : Direction.field_817));
      if (var4 != this && var9 != var1.<Boolean>method_10313(field_20048)) {
         if (var9 != var1.<Boolean>method_10313(field_20051)) {
            this.method_19109(var2, var3, var9);
         }

         var2.method_7513(var3, var1.method_10308(field_20048, Boolean.valueOf(var9)).method_10308(field_20051, Boolean.valueOf(var9)), 2);
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_1331 var6 = var3.method_6100();
      class_2522 var7 = var2.method_28262(var6);
      return var1.method_10313(field_20045) != class_7422.field_37876 ? var7.method_8350(this) : var7.method_8308(var2, var6, Direction.field_817);
   }

   private void method_19109(World var1, class_1331 var2, boolean var3) {
      var1.method_43365((class_704)null, !var3 ? this.method_19105() : this.method_19111(), var2, 0);
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3916;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_20050, var2.method_30489(var1.<Direction>method_10313(field_20050)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var2 != class_9022.field_46145 ? var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_20050))).method_10317(field_20047) : var1;
   }

   @Override
   public long method_10759(class_2522 var1, class_1331 var2) {
      return class_9299.method_42839(
         var2.method_12173(), var2.method_6101(var1.method_10313(field_20045) != class_7422.field_37876 ? 1 : 0).method_12165(), var2.method_12185()
      );
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_20045, field_20050, field_20051, field_20047, field_20048);
   }

   public static boolean method_19107(World var0, class_1331 var1) {
      return method_19106(var0.method_28262(var1));
   }

   public static boolean method_19106(class_2522 var0) {
      return var0.method_8360() instanceof class_4115 && (var0.method_8362() == class_5371.field_27441 || var0.method_8362() == class_5371.field_27389);
   }
}
