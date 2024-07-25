package remapped;

import java.util.Random;

public class class_5307 extends class_6169 {
   private static String[] field_27104;

   public class_5307(class_3073 var1) {
      super(0.3125F, var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_31564, Boolean.valueOf(false))
            .method_10308(field_31567, Boolean.valueOf(false))
            .method_10308(field_31569, Boolean.valueOf(false))
            .method_10308(field_31566, Boolean.valueOf(false))
            .method_10308(field_31563, Boolean.valueOf(false))
            .method_10308(field_31568, Boolean.valueOf(false))
      );
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_24237(var1.method_21862(), var1.method_21858());
   }

   public class_2522 method_24237(class_6163 var1, BlockPos var2) {
      class_6414 var5 = var1.method_28262(var2.method_6100()).method_8360();
      class_6414 var6 = var1.method_28262(var2.method_6081()).method_8360();
      class_6414 var7 = var1.method_28262(var2.method_6094()).method_8360();
      class_6414 var8 = var1.method_28262(var2.method_6090()).method_8360();
      class_6414 var9 = var1.method_28262(var2.method_6073()).method_8360();
      class_6414 var10 = var1.method_28262(var2.method_6108()).method_8360();
      return this.method_29260()
         .method_10308(field_31568, Boolean.valueOf(var5 == this || var5 == class_4783.field_23650 || var5 == class_4783.field_23894))
         .method_10308(field_31563, Boolean.valueOf(var6 == this || var6 == class_4783.field_23650))
         .method_10308(field_31564, Boolean.valueOf(var7 == this || var7 == class_4783.field_23650))
         .method_10308(field_31567, Boolean.valueOf(var8 == this || var8 == class_4783.field_23650))
         .method_10308(field_31569, Boolean.valueOf(var9 == this || var9 == class_4783.field_23650))
         .method_10308(field_31566, Boolean.valueOf(var10 == this || var10 == class_4783.field_23650));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var9 = var3.method_8360() == this
            || var3.method_8350(class_4783.field_23650)
            || var2 == Direction.field_802 && var3.method_8350(class_4783.field_23894);
         return var1.method_10308(field_31571.get(var2), Boolean.valueOf(var9));
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         var2.method_7510(var3, true);
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      class_2522 var6 = var2.method_28262(var3.method_6100());
      boolean var7 = !var2.method_28262(var3.method_6081()).method_8345() && !var6.method_8345();

      for (Direction var9 : class_9594.field_48893) {
         BlockPos var10 = var3.method_6098(var9);
         class_6414 var11 = var2.method_28262(var10).method_8360();
         if (var11 == this) {
            if (var7) {
               return false;
            }

            class_6414 var12 = var2.method_28262(var10.method_6100()).method_8360();
            if (var12 == this || var12 == class_4783.field_23894) {
               return true;
            }
         }
      }

      class_6414 var13 = var6.method_8360();
      return var13 == this || var13 == class_4783.field_23894;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_31564, field_31567, field_31569, field_31566, field_31563, field_31568);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
