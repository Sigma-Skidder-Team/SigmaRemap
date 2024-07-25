package remapped;

import java.util.Arrays;

public class class_5118 extends class_7346<class_4656> {
   public class_5118(class_9656 var1) {
      super(var1.field_941, var1.field_940, class_9656.method_44569(0), var1.field_940 - 40, 36);
      this.field_26405 = var1;
   }

   public void method_23461(class_460 var1) {
      class_9656 var10003 = this.field_26405;
      this.field_26405.getClass();
      this.method_33483(new class_4656(var10003, var1));
   }

   @Override
   public int method_36205() {
      return class_9656.method_44555(this.field_26405).size() * 36;
   }

   @Override
   public boolean method_36221() {
      return this.field_26405.method_41185() == this;
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_26405.method_1183(var1);
   }

   @Override
   public void method_33482(int var1) {
      this.method_33485(var1);
      if (var1 != -1) {
         class_460 var4 = (class_460)class_9656.method_44555(this.field_26405).get(var1);
         String var5 = class_6956.method_31803("narrator.select.list.position", var1 + 1, class_9656.method_44555(this.field_26405).size());
         String var6 = class_7567.method_34407(
            Arrays.<String>asList(var4.method_2206(), class_9656.method_44572(var4), class_9656.method_44566(var4).getString(), var5)
         );
         class_7567.method_34410(class_6956.method_31803("narrator.select", var6));
      }
   }

   public void method_23460(class_4656 var1) {
      super.method_36197(var1);
      class_9656.method_44563(this.field_26405, this.method_41183().indexOf(var1));
      class_9656.method_44564(this.field_26405).field_36675 = class_9656.method_44568(this.field_26405) >= 0
         && class_9656.method_44568(this.field_26405) < this.method_36218()
         && !((class_460)class_9656.method_44555(this.field_26405).get(class_9656.method_44568(this.field_26405))).method_2197();
   }
}
