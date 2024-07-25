package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class class_5177 extends class_6414 implements class_2593 {
   private static String[] field_26646;
   public static final class_6720 field_26651 = class_6023.field_30711;
   public static final class_7360<class_8506> field_26643 = class_6023.field_30706;
   public static final class_7360<class_8506> field_26641 = class_6023.field_30737;
   public static final class_7360<class_8506> field_26652 = class_6023.field_30679;
   public static final class_7360<class_8506> field_26642 = class_6023.field_30752;
   public static final class_6720 field_26653 = class_6023.field_30719;
   private final Map<class_2522, class_4190> field_26645;
   private final Map<class_2522, class_4190> field_26648;
   private static final class_4190 field_26647 = class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final class_4190 field_26654 = class_6414.method_29292(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final class_4190 field_26649 = class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final class_4190 field_26650 = class_6414.method_29292(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final class_4190 field_26644 = class_6414.method_29292(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public class_5177(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_26651, Boolean.valueOf(true))
            .method_10308(field_26641, class_8506.field_43546)
            .method_10308(field_26643, class_8506.field_43546)
            .method_10308(field_26652, class_8506.field_43546)
            .method_10308(field_26642, class_8506.field_43546)
            .method_10308(field_26653, Boolean.valueOf(false))
      );
      this.field_26645 = this.method_23729(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.field_26648 = this.method_23729(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static class_4190 method_23737(class_4190 var0, class_8506 var1, class_4190 var2, class_4190 var3) {
      if (var1 != class_8506.field_43543) {
         return var1 != class_8506.field_43547 ? var0 : class_3370.method_15530(var0, var2);
      } else {
         return class_3370.method_15530(var0, var3);
      }
   }

   private Map<class_2522, class_4190> method_23729(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 8.0F - var1;
      float var10 = 8.0F + var1;
      float var11 = 8.0F - var2;
      float var12 = 8.0F + var2;
      class_4190 var13 = class_6414.method_29292((double)var9, 0.0, (double)var9, (double)var10, (double)var3, (double)var10);
      class_4190 var14 = class_6414.method_29292((double)var11, (double)var4, 0.0, (double)var12, (double)var5, (double)var12);
      class_4190 var15 = class_6414.method_29292((double)var11, (double)var4, (double)var11, (double)var12, (double)var5, 16.0);
      class_4190 var16 = class_6414.method_29292(0.0, (double)var4, (double)var11, (double)var12, (double)var5, (double)var12);
      class_4190 var17 = class_6414.method_29292((double)var11, (double)var4, (double)var11, 16.0, (double)var5, (double)var12);
      class_4190 var18 = class_6414.method_29292((double)var11, (double)var4, 0.0, (double)var12, (double)var6, (double)var12);
      class_4190 var19 = class_6414.method_29292((double)var11, (double)var4, (double)var11, (double)var12, (double)var6, 16.0);
      class_4190 var20 = class_6414.method_29292(0.0, (double)var4, (double)var11, (double)var12, (double)var6, (double)var12);
      class_4190 var21 = class_6414.method_29292((double)var11, (double)var4, (double)var11, 16.0, (double)var6, (double)var12);
      Builder var22 = ImmutableMap.builder();

      for (Boolean var24 : field_26651.method_23105()) {
         for (class_8506 var26 : field_26643.method_23105()) {
            for (class_8506 var28 : field_26641.method_23105()) {
               for (class_8506 var30 : field_26642.method_23105()) {
                  for (class_8506 var32 : field_26652.method_23105()) {
                     class_4190 var33 = class_3370.method_15536();
                     var33 = method_23737(var33, var26, var17, var21);
                     var33 = method_23737(var33, var30, var16, var20);
                     var33 = method_23737(var33, var28, var14, var18);
                     var33 = method_23737(var33, var32, var15, var19);
                     if (var24) {
                        var33 = class_3370.method_15530(var33, var13);
                     }

                     class_2522 var34 = this.method_29260()
                        .method_10308(field_26651, var24)
                        .method_10308(field_26643, var26)
                        .method_10308(field_26642, var30)
                        .method_10308(field_26641, var28)
                        .method_10308(field_26652, var32);
                     var22.put(var34.method_10308(field_26653, Boolean.valueOf(false)), var33);
                     var22.put(var34.method_10308(field_26653, Boolean.valueOf(true)), var33);
                  }
               }
            }
         }
      }

      return var22.build();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.field_26645.get(var1);
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.field_26648.get(var1);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }

   private boolean method_23739(class_2522 var1, boolean var2, class_240 var3) {
      class_6414 var6 = var1.method_8360();
      boolean var7 = var6 instanceof class_1645 && class_1645.method_7366(var1, var3);
      return var1.method_8349(class_2351.field_11759) || !method_29262(var6) && var2 || var6 instanceof class_6498 || var7;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_6486 var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_4774 var6 = var1.method_21862().method_28258(var1.method_21858());
      class_1331 var7 = var5.method_6094();
      class_1331 var8 = var5.method_6090();
      class_1331 var9 = var5.method_6073();
      class_1331 var10 = var5.method_6108();
      class_1331 var11 = var5.method_6081();
      class_2522 var12 = var4.method_28262(var7);
      class_2522 var13 = var4.method_28262(var8);
      class_2522 var14 = var4.method_28262(var9);
      class_2522 var15 = var4.method_28262(var10);
      class_2522 var16 = var4.method_28262(var11);
      boolean var17 = this.method_23739(var12, var12.method_8308(var4, var7, class_240.field_800), class_240.field_800);
      boolean var18 = this.method_23739(var13, var13.method_8308(var4, var8, class_240.field_809), class_240.field_809);
      boolean var19 = this.method_23739(var14, var14.method_8308(var4, var9, class_240.field_818), class_240.field_818);
      boolean var20 = this.method_23739(var15, var15.method_8308(var4, var10, class_240.field_804), class_240.field_804);
      class_2522 var21 = this.method_29260().method_10308(field_26653, Boolean.valueOf(var6.method_22005() == class_8532.field_43674));
      return this.method_23732(var4, var21, var11, var16, var17, var18, var19, var20);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_26653)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      if (var2 != class_240.field_802) {
         return var2 != class_240.field_817 ? this.method_23735(var4, var5, var1, var6, var3, var2) : this.method_23731(var4, var1, var6, var3);
      } else {
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }

   private static boolean method_23730(class_2522 var0, class_5019<class_8506> var1) {
      return var0.method_10313(var1) != class_8506.field_43546;
   }

   private static boolean method_23734(class_4190 var0, class_4190 var1) {
      return !class_3370.method_15537(var1, var0, class_8529.field_43656);
   }

   private class_2522 method_23731(class_4924 var1, class_2522 var2, class_1331 var3, class_2522 var4) {
      boolean var7 = method_23730(var2, field_26641);
      boolean var8 = method_23730(var2, field_26643);
      boolean var9 = method_23730(var2, field_26652);
      boolean var10 = method_23730(var2, field_26642);
      return this.method_23732(var1, var2, var3, var4, var7, var8, var9, var10);
   }

   private class_2522 method_23735(class_4924 var1, class_1331 var2, class_2522 var3, class_1331 var4, class_2522 var5, class_240 var6) {
      class_240 var9 = var6.method_1046();
      boolean var10 = var6 != class_240.field_818 ? method_23730(var3, field_26641) : this.method_23739(var5, var5.method_8308(var1, var4, var9), var9);
      boolean var11 = var6 != class_240.field_804 ? method_23730(var3, field_26643) : this.method_23739(var5, var5.method_8308(var1, var4, var9), var9);
      boolean var12 = var6 != class_240.field_800 ? method_23730(var3, field_26652) : this.method_23739(var5, var5.method_8308(var1, var4, var9), var9);
      boolean var13 = var6 != class_240.field_809 ? method_23730(var3, field_26642) : this.method_23739(var5, var5.method_8308(var1, var4, var9), var9);
      class_1331 var14 = var2.method_6081();
      class_2522 var15 = var1.method_28262(var14);
      return this.method_23732(var1, var3, var14, var15, var10, var11, var12, var13);
   }

   private class_2522 method_23732(class_4924 var1, class_2522 var2, class_1331 var3, class_2522 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      class_4190 var11 = var4.method_8324(var1, var3).method_19494(class_240.field_802);
      class_2522 var12 = this.method_23738(var2, var5, var6, var7, var8, var11);
      return var12.method_10308(field_26651, Boolean.valueOf(this.method_23733(var12, var4, var11)));
   }

   private boolean method_23733(class_2522 var1, class_2522 var2, class_4190 var3) {
      boolean var6 = var2.method_8360() instanceof class_5177 && var2.<Boolean>method_10313(field_26651);
      if (!var6) {
         class_8506 var7 = var1.<class_8506>method_10313(field_26641);
         class_8506 var8 = var1.<class_8506>method_10313(field_26652);
         class_8506 var9 = var1.<class_8506>method_10313(field_26643);
         class_8506 var10 = var1.<class_8506>method_10313(field_26642);
         boolean var11 = var8 == class_8506.field_43546;
         boolean var12 = var10 == class_8506.field_43546;
         boolean var13 = var9 == class_8506.field_43546;
         boolean var14 = var7 == class_8506.field_43546;
         boolean var15 = var14 && var11 && var12 && var13 || var14 != var11 || var12 != var13;
         if (var15) {
            return true;
         } else {
            boolean var16 = var7 == class_8506.field_43543 && var8 == class_8506.field_43543
               || var9 == class_8506.field_43543 && var10 == class_8506.field_43543;
            return var16 ? false : var2.method_8360().method_29299(class_2351.field_11794) || method_23734(var3, field_26647);
         }
      } else {
         return true;
      }
   }

   private class_2522 method_23738(class_2522 var1, boolean var2, boolean var3, boolean var4, boolean var5, class_4190 var6) {
      return var1.method_10308(field_26641, this.method_23736(var2, var6, field_26654))
         .method_10308(field_26643, this.method_23736(var3, var6, field_26644))
         .method_10308(field_26652, this.method_23736(var4, var6, field_26649))
         .method_10308(field_26642, this.method_23736(var5, var6, field_26650));
   }

   private class_8506 method_23736(boolean var1, class_4190 var2, class_4190 var3) {
      if (!var1) {
         return class_8506.field_43546;
      } else {
         return !method_23734(var2, var3) ? class_8506.field_43547 : class_8506.field_43543;
      }
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_26653) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_29275(class_2522 var1, class_6163 var2, class_1331 var3) {
      return !var1.<Boolean>method_10313(field_26653);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_26651, field_26641, field_26643, field_26642, field_26652, field_26653);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            return var1.method_10308(field_26641, var1.<class_8506>method_10313(field_26652))
               .method_10308(field_26643, var1.<class_8506>method_10313(field_26642))
               .method_10308(field_26652, var1.<class_8506>method_10313(field_26641))
               .method_10308(field_26642, var1.<class_8506>method_10313(field_26643));
         case field_34335:
            return var1.method_10308(field_26641, var1.<class_8506>method_10313(field_26643))
               .method_10308(field_26643, var1.<class_8506>method_10313(field_26652))
               .method_10308(field_26652, var1.<class_8506>method_10313(field_26642))
               .method_10308(field_26642, var1.<class_8506>method_10313(field_26641));
         case field_34334:
            return var1.method_10308(field_26641, var1.<class_8506>method_10313(field_26642))
               .method_10308(field_26643, var1.<class_8506>method_10313(field_26641))
               .method_10308(field_26652, var1.<class_8506>method_10313(field_26643))
               .method_10308(field_26642, var1.<class_8506>method_10313(field_26652));
         default:
            return var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      switch (var2) {
         case field_46148:
            return var1.method_10308(field_26641, var1.<class_8506>method_10313(field_26652))
               .method_10308(field_26652, var1.<class_8506>method_10313(field_26641));
         case field_46144:
            return var1.method_10308(field_26643, var1.<class_8506>method_10313(field_26642))
               .method_10308(field_26642, var1.<class_8506>method_10313(field_26643));
         default:
            return super.method_10773(var1, var2);
      }
   }
}
