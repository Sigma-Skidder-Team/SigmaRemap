package remapped;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_7959 extends class_6414 {
   private static String[] field_40781;
   public static final class_6720 field_40774 = class_6023.field_30696;
   public static final class_6720 field_40778 = class_6023.field_30716;
   public static final class_6720 field_40783 = class_6023.field_30681;
   public static final class_6720 field_40779 = class_6169.field_31564;
   public static final class_6720 field_40777 = class_6169.field_31567;
   public static final class_6720 field_40780 = class_6169.field_31569;
   public static final class_6720 field_40782 = class_6169.field_31566;
   private static final Map<Direction, class_6720> field_40776 = class_9787.field_49665;
   public static final class_4190 field_40775 = class_6414.method_29292(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   public static final class_4190 field_40785 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final class_3760 field_40784;

   public class_7959(class_3760 var1, class_3073 var2) {
      super(var2);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_40774, Boolean.valueOf(false))
            .method_10308(field_40778, Boolean.valueOf(false))
            .method_10308(field_40783, Boolean.valueOf(false))
            .method_10308(field_40779, Boolean.valueOf(false))
            .method_10308(field_40777, Boolean.valueOf(false))
            .method_10308(field_40780, Boolean.valueOf(false))
            .method_10308(field_40782, Boolean.valueOf(false))
      );
      this.field_40784 = var1;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return !var1.<Boolean>method_10313(field_40778) ? field_40785 : field_40775;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      return this.method_29260()
         .method_10308(field_40779, Boolean.valueOf(this.method_36010(var4.method_28262(var5.method_6094()), Direction.field_818)))
         .method_10308(field_40777, Boolean.valueOf(this.method_36010(var4.method_28262(var5.method_6090()), Direction.field_804)))
         .method_10308(field_40780, Boolean.valueOf(this.method_36010(var4.method_28262(var5.method_6073()), Direction.field_800)))
         .method_10308(field_40782, Boolean.valueOf(this.method_36010(var4.method_28262(var5.method_6108()), Direction.field_809)));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      return !var2.method_1029().method_42629()
         ? super.method_10763(var1, var2, var3, var4, var5, var6)
         : var1.method_10308(field_40776.get(var2), Boolean.valueOf(this.method_36010(var3, var2)));
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         this.method_36009(var2, var3, var1);
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         this.method_36009(var2, var3, var1.method_10308(field_40774, Boolean.valueOf(true)));
      }
   }

   @Override
   public void method_29265(World var1, BlockPos var2, class_2522 var3, PlayerEntity var4) {
      if (!var1.field_33055 && !var4.method_26446().method_28022() && var4.method_26446().method_27960() == class_4897.field_24853) {
         var1.method_7513(var2, var3.method_10308(field_40783, Boolean.valueOf(true)), 4);
      }

      super.method_29265(var1, var2, var3, var4);
   }

   private void method_36009(World var1, BlockPos var2, class_2522 var3) {
      for (Direction var9 : new Direction[]{Direction.field_800, Direction.field_809}) {
         for (int var10 = 1; var10 < 42; var10++) {
            BlockPos var11 = var2.method_6099(var9, var10);
            class_2522 var12 = var1.method_28262(var11);
            if (var12.method_8350(this.field_40784)) {
               if (var12.<Direction>method_10313(class_3760.field_18377) == var9.method_1046()) {
                  this.field_40784.method_17424(var1, var11, var12, false, true, var10, var3);
               }
               break;
            }

            if (!var12.method_8350(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.field_33055 && !var1.<Boolean>method_10313(field_40774)) {
         this.method_36008(var2, var3);
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var2.method_28262(var3).<Boolean>method_10313(field_40774)) {
         this.method_36008(var2, var3);
      }
   }

   private void method_36008(World var1, BlockPos var2) {
      class_2522 var5 = var1.method_28262(var2);
      boolean var6 = var5.<Boolean>method_10313(field_40774);
      boolean var7 = false;
      List var8 = var1.method_25870((Entity)null, var5.method_8334(var1, var2).method_19483().method_18919(var2));
      if (!var8.isEmpty()) {
         for (Entity var10 : var8) {
            if (!var10.method_37276()) {
               var7 = true;
               break;
            }
         }
      }

      if (var7 != var6) {
         var5 = var5.method_10308(field_40774, Boolean.valueOf(var7));
         var1.method_7513(var2, var5, 3);
         this.method_36009(var1, var2, var5);
      }

      if (var7) {
         var1.method_43367().method_14011(new BlockPos(var2), this, 10);
      }
   }

   public boolean method_36010(class_2522 var1, Direction var2) {
      class_6414 var5 = var1.method_8360();
      return var5 != this.field_40784 ? var5 == this : var1.<Direction>method_10313(class_3760.field_18377) == var2.method_1046();
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            return var1.method_10308(field_40779, var1.<Boolean>method_10313(field_40780))
               .method_10308(field_40777, var1.<Boolean>method_10313(field_40782))
               .method_10308(field_40780, var1.<Boolean>method_10313(field_40779))
               .method_10308(field_40782, var1.<Boolean>method_10313(field_40777));
         case field_34335:
            return var1.method_10308(field_40779, var1.<Boolean>method_10313(field_40777))
               .method_10308(field_40777, var1.<Boolean>method_10313(field_40780))
               .method_10308(field_40780, var1.<Boolean>method_10313(field_40782))
               .method_10308(field_40782, var1.<Boolean>method_10313(field_40779));
         case field_34334:
            return var1.method_10308(field_40779, var1.<Boolean>method_10313(field_40782))
               .method_10308(field_40777, var1.<Boolean>method_10313(field_40779))
               .method_10308(field_40780, var1.<Boolean>method_10313(field_40777))
               .method_10308(field_40782, var1.<Boolean>method_10313(field_40780));
         default:
            return var1;
      }
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      switch (var2) {
         case field_46148:
            return var1.method_10308(field_40779, var1.<Boolean>method_10313(field_40780)).method_10308(field_40780, var1.<Boolean>method_10313(field_40779));
         case field_46144:
            return var1.method_10308(field_40777, var1.<Boolean>method_10313(field_40782)).method_10308(field_40782, var1.<Boolean>method_10313(field_40777));
         default:
            return super.method_10773(var1, var2);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_40774, field_40778, field_40783, field_40779, field_40777, field_40782, field_40780);
   }
}
