package remapped;

public class class_8973 extends class_5210 {
   private static String[] field_45979;
   public static final class_7044 field_45980 = class_6023.field_30680;

   public class_8973(class_3073 var1, class_9271 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_45980, Integer.valueOf(0)).method_10308(field_26767, Boolean.valueOf(false)));
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return var2.method_28262(var3.method_6100()).method_8362().method_24499();
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      return this.method_29260()
         .method_10308(field_45980, Integer.valueOf(class_9299.method_42847((double)((180.0F + var1.method_21861()) * 16.0F / 360.0F) + 0.5) & 15))
         .method_10308(field_26767, Boolean.valueOf(var4.method_22005() == class_8532.field_43674));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 == class_240.field_802 && !this.method_10787(var1, var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_45980, Integer.valueOf(var2.method_30488(var1.<Integer>method_10313(field_45980), 16)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_10308(field_45980, Integer.valueOf(var2.method_41389(var1.<Integer>method_10313(field_45980), 16)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_45980, field_26767);
   }
}
