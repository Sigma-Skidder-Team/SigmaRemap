package remapped;

public class class_3725 extends class_8550 {
   private static String[] field_18228;
   public static final class_7044 field_18230 = class_6023.field_30680;
   public static final class_4190 field_18229 = class_6414.method_29292(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public class_3725(class_558 var1, class_3073 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_18230, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_18229;
   }

   @Override
   public class_4190 method_10790(class_2522 var1, class_6163 var2, BlockPos var3) {
      return class_3370.method_15536();
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_18230, Integer.valueOf(MathHelper.floor((double)(var1.method_21861() * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_18230, Integer.valueOf(var2.method_30488(var1.<Integer>method_10313(field_18230), 16)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_10308(field_18230, Integer.valueOf(var2.method_41389(var1.<Integer>method_10313(field_18230), 16)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_18230);
   }
}
