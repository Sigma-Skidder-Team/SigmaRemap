package remapped;

public class class_1645 extends class_380 {
   private static String[] field_8548;
   public static final class_6720 field_8559 = class_6023.field_30688;
   public static final class_6720 field_8553 = class_6023.field_30696;
   public static final class_6720 field_8557 = class_6023.field_30744;
   public static final class_4190 field_8547 = class_6414.method_29292(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   public static final class_4190 field_8556 = class_6414.method_29292(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   public static final class_4190 field_8558 = class_6414.method_29292(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   public static final class_4190 field_8551 = class_6414.method_29292(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   public static final class_4190 field_8560 = class_6414.method_29292(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   public static final class_4190 field_8555 = class_6414.method_29292(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   public static final class_4190 field_8552 = class_3370.method_15530(
      class_6414.method_29292(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), class_6414.method_29292(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)
   );
   public static final class_4190 field_8550 = class_3370.method_15530(
      class_6414.method_29292(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), class_6414.method_29292(7.0, 5.0, 14.0, 9.0, 16.0, 16.0)
   );
   public static final class_4190 field_8554 = class_3370.method_15530(
      class_6414.method_29292(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), class_6414.method_29292(14.0, 2.0, 7.0, 16.0, 13.0, 9.0)
   );
   public static final class_4190 field_8549 = class_3370.method_15530(
      class_6414.method_29292(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), class_6414.method_29292(7.0, 2.0, 14.0, 9.0, 13.0, 16.0)
   );

   public class_1645(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_8559, Boolean.valueOf(false))
            .method_10308(field_8553, Boolean.valueOf(false))
            .method_10308(field_8557, Boolean.valueOf(false))
      );
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      if (!var1.<Boolean>method_10313(field_8557)) {
         return var1.<Direction>method_10313(field_1543).method_1029() != class_9249.field_47215 ? field_8547 : field_8556;
      } else {
         return var1.<Direction>method_10313(field_1543).method_1029() != class_9249.field_47215 ? field_8558 : field_8551;
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      class_9249 var9 = var2.method_1029();
      if (var1.<Direction>method_10313(field_1543).method_1042().method_1029() != var9) {
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var10 = this.method_7365(var3) || this.method_7365(var4.method_28262(var5.method_6098(var2.method_1046())));
         return var1.method_10308(field_8557, Boolean.valueOf(var10));
      }
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      if (!var1.<Boolean>method_10313(field_8559)) {
         return var1.<Direction>method_10313(field_1543).method_1029() != class_9249.field_47219 ? field_8555 : field_8560;
      } else {
         return class_3370.method_15536();
      }
   }

   @Override
   public class_4190 method_10790(class_2522 var1, class_6163 var2, BlockPos var3) {
      if (!var1.<Boolean>method_10313(field_8557)) {
         return var1.<Direction>method_10313(field_1543).method_1029() != class_9249.field_47215 ? field_8552 : field_8550;
      } else {
         return var1.<Direction>method_10313(field_1543).method_1029() != class_9249.field_47215 ? field_8554 : field_8549;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      switch (var4) {
         case field_14271:
            return var1.<Boolean>method_10313(field_8559);
         case field_14272:
            return false;
         case field_14275:
            return var1.<Boolean>method_10313(field_8559);
         default:
            return false;
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      boolean var6 = var4.method_29576(var5);
      Direction var7 = var1.method_21863();
      class_9249 var8 = var7.method_1029();
      boolean var9 = var8 == class_9249.field_47219
            && (this.method_7365(var4.method_28262(var5.method_6108())) || this.method_7365(var4.method_28262(var5.method_6090())))
         || var8 == class_9249.field_47215
            && (this.method_7365(var4.method_28262(var5.method_6094())) || this.method_7365(var4.method_28262(var5.method_6073())));
      return this.method_29260()
         .method_10308(field_1543, var7)
         .method_10308(field_8559, Boolean.valueOf(var6))
         .method_10308(field_8553, Boolean.valueOf(var6))
         .method_10308(field_8557, Boolean.valueOf(var9));
   }

   private boolean method_7365(class_2522 var1) {
      return var1.method_8360().method_29299(class_2351.field_11759);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      if (!var1.<Boolean>method_10313(field_8559)) {
         Direction var9 = var4.method_37365();
         if (var1.<Direction>method_10313(field_1543) == var9.method_1046()) {
            var1 = var1.method_10308(field_1543, var9);
         }

         var1 = var1.method_10308(field_8559, Boolean.valueOf(true));
         var2.method_7513(var3, var1, 10);
      } else {
         var1 = var1.method_10308(field_8559, Boolean.valueOf(false));
         var2.method_7513(var3, var1, 10);
      }

      var2.method_43365(var4, !var1.<Boolean>method_10313(field_8559) ? 1014 : 1008, var3, 0);
      return class_6910.method_31659(var2.field_33055);
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (!var2.field_33055) {
         boolean var9 = var2.method_29576(var3);
         if (var1.<Boolean>method_10313(field_8553) != var9) {
            var2.method_7513(var3, var1.method_10308(field_8553, Boolean.valueOf(var9)).method_10308(field_8559, Boolean.valueOf(var9)), 2);
            if (var1.<Boolean>method_10313(field_8559) != var9) {
               var2.method_43365((class_704)null, !var9 ? 1014 : 1008, var3, 0);
            }
         }
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_8559, field_8553, field_8557);
   }

   public static boolean method_7366(class_2522 var0, Direction var1) {
      return var0.<Direction>method_10313(field_1543).method_1029() == var1.method_1042().method_1029();
   }
}
