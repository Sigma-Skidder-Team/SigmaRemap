package remapped;

public class class_3821 extends class_9787 {
   private static String[] field_18687;
   private final class_4190[] field_18686;

   public class_3821(class_3073 var1) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_49671, Boolean.valueOf(false))
            .method_10308(field_49667, Boolean.valueOf(false))
            .method_10308(field_49670, Boolean.valueOf(false))
            .method_10308(field_49664, Boolean.valueOf(false))
            .method_10308(field_49673, Boolean.valueOf(false))
      );
      this.field_18686 = this.method_45185(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public class_4190 method_10790(class_2522 var1, class_6163 var2, class_1331 var3) {
      return this.field_18686[this.method_45184(var1)];
   }

   @Override
   public class_4190 method_10757(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.method_10769(var1, var2, var3, var4);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }

   public boolean method_17797(class_2522 var1, boolean var2, Direction var3) {
      class_6414 var6 = var1.method_8360();
      boolean var7 = this.method_17798(var6);
      boolean var8 = var6 instanceof class_1645 && class_1645.method_7366(var1, var3);
      return !method_29262(var6) && var2 || var7 || var8;
   }

   private boolean method_17798(class_6414 var1) {
      return var1.method_29299(class_2351.field_11728) && var1.method_29299(class_2351.field_11751) == this.method_29260().method_8349(class_2351.field_11751);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         return class_8187.method_37511(var4, var2, var3);
      } else {
         class_6098 var9 = var4.method_26617(var5);
         return var9.method_27960() != class_4897.field_25274 ? class_6910.field_35521 : class_6910.field_35520;
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_4774 var6 = var1.method_21862().method_28258(var1.method_21858());
      class_1331 var7 = var5.method_6094();
      class_1331 var8 = var5.method_6090();
      class_1331 var9 = var5.method_6073();
      class_1331 var10 = var5.method_6108();
      class_2522 var11 = var4.method_28262(var7);
      class_2522 var12 = var4.method_28262(var8);
      class_2522 var13 = var4.method_28262(var9);
      class_2522 var14 = var4.method_28262(var10);
      return super.method_29302(var1)
         .method_10308(field_49671, Boolean.valueOf(this.method_17797(var11, var11.method_8308(var4, var7, Direction.field_800), Direction.field_800)))
         .method_10308(field_49667, Boolean.valueOf(this.method_17797(var12, var12.method_8308(var4, var8, Direction.field_809), Direction.field_809)))
         .method_10308(field_49670, Boolean.valueOf(this.method_17797(var13, var13.method_8308(var4, var9, Direction.field_818), Direction.field_818)))
         .method_10308(field_49664, Boolean.valueOf(this.method_17797(var14, var14.method_8308(var4, var10, Direction.field_804), Direction.field_804)))
         .method_10308(field_49673, Boolean.valueOf(var6.method_22005() == class_8532.field_43674));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_49673)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return var2.method_1029().method_42628() != class_9594.field_48893
         ? super.method_10763(var1, var2, var3, var4, var5, var6)
         : var1.method_10308(
            field_49665.get(var2), Boolean.valueOf(this.method_17797(var3, var3.method_8308(var4, var6, var2.method_1046()), var2.method_1046()))
         );
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_49671, field_49667, field_49664, field_49670, field_49673);
   }
}
