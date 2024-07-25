package remapped;

public class class_2830 extends class_6414 {
   private static String[] field_13870;

   public class_2830(class_3073 var1) {
      super(var1);
   }

   public boolean method_12870(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8350(class_4783.field_23259)
         || var1.method_8350(class_4783.field_23592)
         || var1.method_8350(class_4783.field_23577)
         || var1.method_8350(class_4783.field_23201)
         || var1.method_8350(class_4783.field_23421);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var1.method_8309(var4, var5) ? super.method_10763(var1, var2, var3, var4, var5, var6) : class_4783.field_23184.method_29260();
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_1331 var6 = var3.method_6100();
      return this.method_12870(var2.method_28262(var6), var2, var6);
   }

   @Override
   public boolean method_29275(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8364().method_22001();
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return var4 == class_2929.field_14275 && !this.field_11822 ? true : super.method_10793(var1, var2, var3, var4);
   }
}
