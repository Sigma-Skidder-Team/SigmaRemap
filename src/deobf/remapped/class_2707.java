package remapped;

import java.util.Arrays;
import java.util.List;

public class class_2707 extends class_7346<class_131> {
   public class_2707(class_4502 var1) {
      super(var1.field_941, var1.field_940, 32, var1.field_940 - 40, 36);
      this.field_13251 = var1;
   }

   public void method_12201(int var1) {
      this.method_36217(var1);
   }

   @Override
   public int method_36205() {
      return this.method_36218() * 36;
   }

   @Override
   public int method_36195() {
      return 260;
   }

   @Override
   public boolean method_36221() {
      return this.field_13251.method_41185() == this;
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_13251.method_1183(var1);
   }

   @Override
   public void method_33482(int var1) {
      this.method_33485(var1);
      if (var1 != -1) {
         List var4 = class_4502.method_20917(this.field_13251).method_41183();
         class_2926 var5 = class_131.method_403((class_131)var4.get(var1));
         String var6 = class_6956.method_31803("narrator.select.list.position", var1 + 1, var4.size());
         String var7 = class_7567.method_34407(Arrays.<String>asList(var5.field_14265, var5.field_14261, class_9539.method_43981(var5.field_14263), var6));
         class_7567.method_34410(class_6956.method_31803("narrator.select", var7));
      }

      this.method_12202(var1);
   }

   public void method_12202(int var1) {
      class_4502.method_20916(this.field_13251, var1);
      class_4502.method_20921(this.field_13251);
   }

   public void method_12200(class_131 var1) {
      super.method_36197(var1);
      class_4502.method_20916(this.field_13251, this.method_41183().indexOf(var1));
      class_4502.method_20921(this.field_13251);
   }
}
