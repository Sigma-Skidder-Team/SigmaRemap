package remapped;

import java.util.Random;

public class class_8370 extends class_8131 {
   private final Identifier field_42853;
   private final class_6631 field_42852;

   public class_8370(class_5799 var1, Identifier var2, class_1331 var3, class_6631 var4) {
      super(class_2746.field_13419, 0);
      this.field_42853 = var2;
      this.field_41648 = var3;
      this.field_42852 = var4;
      this.method_38575(var1);
   }

   public class_8370(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13419, var2);
      this.field_42853 = new Identifier(var2.method_25965("Template"));
      this.field_42852 = class_6631.valueOf(var2.method_25965("Rot"));
      this.method_38575(var1);
   }

   private void method_38575(class_5799 var1) {
      class_6561 var4 = var1.method_26279(this.field_42853);
      class_8478 var5 = new class_8478().method_39053(this.field_42852).method_39055(class_9022.field_46145).method_39048(class_2010.field_10193);
      this.method_36998(var4, this.field_41648, var5);
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_42853.toString());
      var1.method_25941("Rot", this.field_42852.name());
   }

   @Override
   public void method_36999(String var1, class_1331 var2, class_1556 var3, Random var4, class_9616 var5) {
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      var5.method_44392(this.field_41647.method_29986(this.field_41650, this.field_41648));
      return super.method_32501(var1, var2, var3, var4, var5, var6, var7);
   }
}
