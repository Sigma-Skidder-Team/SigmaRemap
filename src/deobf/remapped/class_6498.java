package remapped;

public class class_6498 extends class_9787 {
   private static String[] field_33084;

   public class_6498(class_3073 var1) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_49671, Boolean.valueOf(false))
            .method_10308(field_49667, Boolean.valueOf(false))
            .method_10308(field_49670, Boolean.valueOf(false))
            .method_10308(field_49664, Boolean.valueOf(false))
            .method_10308(field_49673, Boolean.valueOf(false))
      );
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_6486 var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_4774 var6 = var1.method_21862().method_28258(var1.method_21858());
      class_1331 var7 = var5.method_6094();
      class_1331 var8 = var5.method_6073();
      class_1331 var9 = var5.method_6108();
      class_1331 var10 = var5.method_6090();
      class_2522 var11 = var4.method_28262(var7);
      class_2522 var12 = var4.method_28262(var8);
      class_2522 var13 = var4.method_28262(var9);
      class_2522 var14 = var4.method_28262(var10);
      return this.method_29260()
         .method_10308(field_49671, Boolean.valueOf(this.method_29628(var11, var11.method_8308(var4, var7, class_240.field_800))))
         .method_10308(field_49670, Boolean.valueOf(this.method_29628(var12, var12.method_8308(var4, var8, class_240.field_818))))
         .method_10308(field_49664, Boolean.valueOf(this.method_29628(var13, var13.method_8308(var4, var9, class_240.field_804))))
         .method_10308(field_49667, Boolean.valueOf(this.method_29628(var14, var14.method_8308(var4, var10, class_240.field_809))))
         .method_10308(field_49673, Boolean.valueOf(var6.method_22005() == class_8532.field_43674));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_49673)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return !var2.method_1029().method_42629()
         ? super.method_10763(var1, var2, var3, var4, var5, var6)
         : var1.method_10308(field_49665.get(var2), Boolean.valueOf(this.method_29628(var3, var3.method_8308(var4, var6, var2.method_1046()))));
   }

   @Override
   public class_4190 method_10757(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return class_3370.method_15536();
   }

   @Override
   public boolean method_10764(class_2522 var1, class_2522 var2, class_240 var3) {
      if (var2.method_8350(this)) {
         if (!var3.method_1029().method_42629()) {
            return true;
         }

         if (var1.<Boolean>method_10313(field_49665.get(var3)) && var2.<Boolean>method_10313(field_49665.get(var3.method_1046()))) {
            return true;
         }
      }

      return super.method_10764(var1, var2, var3);
   }

   public final boolean method_29628(class_2522 var1, boolean var2) {
      class_6414 var5 = var1.method_8360();
      return !method_29262(var5) && var2 || var5 instanceof class_6498 || var5.method_29299(class_2351.field_11759);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_49671, field_49667, field_49664, field_49670, field_49673);
   }
}
