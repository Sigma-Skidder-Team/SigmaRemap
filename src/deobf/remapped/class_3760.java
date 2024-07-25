package remapped;

import com.google.common.base.MoreObjects;
import java.util.Random;
import javax.annotation.Nullable;

public class class_3760 extends class_6414 {
   private static String[] field_18378;
   public static final class_6162 field_18377 = class_380.field_1543;
   public static final class_6720 field_18375 = class_6023.field_30696;
   public static final class_6720 field_18379 = class_6023.field_30716;
   public static final class_4190 field_18376 = class_6414.method_29292(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   public static final class_4190 field_18372 = class_6414.method_29292(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   public static final class_4190 field_18373 = class_6414.method_29292(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   public static final class_4190 field_18374 = class_6414.method_29292(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   public class_3760(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_18377, class_240.field_818)
            .method_10308(field_18375, Boolean.valueOf(false))
            .method_10308(field_18379, Boolean.valueOf(false))
      );
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      switch ((class_240)var1.method_10313(field_18377)) {
         case field_804:
         default:
            return field_18374;
         case field_809:
            return field_18373;
         case field_800:
            return field_18372;
         case field_818:
            return field_18376;
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_240 var6 = var1.<class_240>method_10313(field_18377);
      class_1331 var7 = var3.method_6098(var6.method_1046());
      class_2522 var8 = var2.method_28262(var7);
      return var6.method_1029().method_42629() && var8.method_8308(var2, var7, var6);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2.method_1046() == var1.method_10313(field_18377) && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = this.method_29260().method_10308(field_18375, Boolean.valueOf(false)).method_10308(field_18379, Boolean.valueOf(false));
      class_6486 var5 = var1.method_21862();
      class_1331 var6 = var1.method_21858();
      class_240[] var7 = var1.method_1786();

      for (class_240 var11 : var7) {
         if (var11.method_1029().method_42629()) {
            class_240 var12 = var11.method_1046();
            var4 = var4.method_10308(field_18377, var12);
            if (var4.method_8309(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public void method_29257(class_6486 var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      this.method_17424(var1, var2, var3, false, false, -1, (class_2522)null);
   }

   public void method_17424(class_6486 var1, class_1331 var2, class_2522 var3, boolean var4, boolean var5, int var6, class_2522 var7) {
      class_240 var10 = var3.<class_240>method_10313(field_18377);
      boolean var11 = var3.<Boolean>method_10313(field_18379);
      boolean var12 = var3.<Boolean>method_10313(field_18375);
      boolean var13 = !var4;
      boolean var14 = false;
      int var15 = 0;
      class_2522[] var16 = new class_2522[42];

      for (int var17 = 1; var17 < 42; var17++) {
         class_1331 var18 = var2.method_6099(var10, var17);
         class_2522 var19 = var1.method_28262(var18);
         if (var19.method_8350(class_4783.field_23812)) {
            if (var19.<class_240>method_10313(field_18377) == var10.method_1046()) {
               var15 = var17;
            }
            break;
         }

         if (!var19.method_8350(class_4783.field_23460) && var17 != var6) {
            var16[var17] = null;
            var13 = false;
         } else {
            if (var17 == var6) {
               var19 = (class_2522)MoreObjects.firstNonNull(var7, var19);
            }

            boolean var20 = !var19.<Boolean>method_10313(class_7959.field_40783);
            boolean var21 = var19.<Boolean>method_10313(class_7959.field_40774);
            var14 |= var20 && var21;
            var16[var17] = var19;
            if (var17 == var6) {
               var1.method_43367().method_14011(var2, this, 10);
               var13 &= var20;
            }
         }
      }

      var13 &= var15 > 1;
      var14 &= var13;
      class_2522 var24 = this.method_29260().method_10308(field_18379, Boolean.valueOf(var13)).method_10308(field_18375, Boolean.valueOf(var14));
      if (var15 > 0) {
         class_1331 var25 = var2.method_6099(var10, var15);
         class_240 var27 = var10.method_1046();
         var1.method_7513(var25, var24.method_10308(field_18377, var27), 3);
         this.method_17425(var1, var25, var27);
         this.method_17423(var1, var25, var13, var14, var11, var12);
      }

      this.method_17423(var1, var2, var13, var14, var11, var12);
      if (!var4) {
         var1.method_7513(var2, var24.method_10308(field_18377, var10), 3);
         if (var5) {
            this.method_17425(var1, var2, var10);
         }
      }

      if (var11 != var13) {
         for (int var26 = 1; var26 < var15; var26++) {
            class_1331 var28 = var2.method_6099(var10, var26);
            class_2522 var29 = var16[var26];
            if (var29 != null) {
               var1.method_7513(var28, var29.method_10308(field_18379, Boolean.valueOf(var13)), 3);
               if (var1.method_28262(var28).method_8345()) {
               }
            }
         }
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      this.method_17424(var2, var3, var1, false, true, -1, (class_2522)null);
   }

   private void method_17423(class_6486 var1, class_1331 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (var4 && !var6) {
         var1.method_43359((class_704)null, var2, class_463.field_2588, class_562.field_3322, 0.4F, 0.6F);
      } else if (!var4 && var6) {
         var1.method_43359((class_704)null, var2, class_463.field_2873, class_562.field_3322, 0.4F, 0.5F);
      } else if (var3 && !var5) {
         var1.method_43359((class_704)null, var2, class_463.field_2480, class_562.field_3322, 0.4F, 0.7F);
      } else if (!var3 && var5) {
         var1.method_43359((class_704)null, var2, class_463.field_2628, class_562.field_3322, 0.4F, 1.2F / (var1.field_33033.nextFloat() * 0.2F + 0.9F));
      }
   }

   private void method_17425(class_6486 var1, class_1331 var2, class_240 var3) {
      var1.method_29563(var2, this);
      var1.method_29563(var2.method_6098(var3.method_1046()), this);
   }

   @Override
   public void method_10761(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         boolean var8 = var1.<Boolean>method_10313(field_18379);
         boolean var9 = var1.<Boolean>method_10313(field_18375);
         if (var8 || var9) {
            this.method_17424(var2, var3, var1, true, false, -1, (class_2522)null);
         }

         if (var9) {
            var2.method_29563(var3, this);
            var2.method_29563(var3.method_6098(var1.<class_240>method_10313(field_18377).method_1046()), this);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return !var1.<Boolean>method_10313(field_18375) ? 0 : 15;
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      if (var1.<Boolean>method_10313(field_18375)) {
         return var1.method_10313(field_18377) != var4 ? 0 : 15;
      } else {
         return 0;
      }
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_18377, var2.method_30489(var1.<class_240>method_10313(field_18377)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_18377)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_18377, field_18375, field_18379);
   }
}
