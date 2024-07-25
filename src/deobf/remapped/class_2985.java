package remapped;

public class class_2985 extends class_6414 {
   private static String[] field_14687;
   public static final class_6720 field_14686 = class_6023.field_30728;

   public class_2985(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_14686, Boolean.valueOf(false)));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field_817
         ? var1.method_10308(field_14686, Boolean.valueOf(var3.method_8350(class_4783.field_23813) || var3.method_8350(class_4783.field_23552)))
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858().method_6081());
      return this.method_29260()
         .method_10308(field_14686, Boolean.valueOf(var4.method_8350(class_4783.field_23813) || var4.method_8350(class_4783.field_23552)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_14686);
   }
}
