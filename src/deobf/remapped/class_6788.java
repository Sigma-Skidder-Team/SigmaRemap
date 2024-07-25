package remapped;

public abstract class class_6788 extends class_6414 {
   public static final class_4190 field_35008 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final class_4190 field_35007 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final boolean field_35009;

   public static boolean method_31116(World var0, BlockPos var1) {
      return method_31115(var0.method_28262(var1));
   }

   public static boolean method_31115(class_2522 var0) {
      return var0.method_8349(class_2351.field_11745) && var0.method_8360() instanceof class_6788;
   }

   public class_6788(boolean var1, class_3073 var2) {
      super(var2);
      this.field_35009 = var1;
   }

   public boolean method_31119() {
      return this.field_35009;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      class_3665 var7 = !var1.method_8350(this) ? null : var1.<class_3665>method_10313(this.method_31121());
      return var7 != null && var7.method_17011() ? field_35007 : field_35008;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return method_29273(var2, var3.method_6100());
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         this.method_31120(var1, var2, var3, var5);
      }
   }

   public class_2522 method_31120(class_2522 var1, World var2, BlockPos var3, boolean var4) {
      var1 = this.method_31117(var2, var3, var1, true);
      if (this.field_35009) {
         var1.method_8343(var2, var3, this, var3, var4);
      }

      return var1;
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (!var2.field_33055 && var2.method_28262(var3).method_8350(this)) {
         class_3665 var9 = var1.<class_3665>method_10313(this.method_31121());
         if (!method_31114(var3, var2, var9)) {
            this.method_31118(var1, var2, var3, var4);
         } else {
            method_29294(var1, var2, var3);
            var2.method_7508(var3, var6);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean method_31114(BlockPos var0, World var1, class_3665 var2) {
      if (!method_29273(var1, var0.method_6100())) {
         return true;
      } else {
         switch (var2) {
            case field_17835:
               return !method_29273(var1, var0.method_6090());
            case field_17826:
               return !method_29273(var1, var0.method_6108());
            case field_17833:
               return !method_29273(var1, var0.method_6094());
            case field_17836:
               return !method_29273(var1, var0.method_6073());
            default:
               return false;
         }
      }
   }

   public void method_31118(class_2522 var1, World var2, BlockPos var3, class_6414 var4) {
   }

   public class_2522 method_31117(World var1, BlockPos var2, class_2522 var3, boolean var4) {
      if (!var1.field_33055) {
         class_3665 var7 = var3.<class_3665>method_10313(this.method_31121());
         return new class_8360(var1, var2, var3).method_38534(var1.method_29576(var2), var4, var7).method_38543();
      } else {
         return var3;
      }
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3913;
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var5) {
         super.method_10761(var1, var2, var3, var4, var5);
         if (var1.<class_3665>method_10313(this.method_31121()).method_17011()) {
            var2.method_29563(var3.method_6081(), this);
         }

         if (this.field_35009) {
            var2.method_29563(var3, this);
            var2.method_29563(var3.method_6100(), this);
         }
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = super.method_29260();
      Direction var5 = var1.method_21863();
      boolean var6 = var5 == Direction.field_804 || var5 == Direction.field_809;
      return var4.method_10308(this.method_31121(), !var6 ? class_3665.field_17829 : class_3665.field_17831);
   }

   public abstract class_5019<class_3665> method_31121();
}
