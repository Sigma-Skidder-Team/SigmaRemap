package remapped;

public class class_7090 implements Runnable {
   public class_7090(class_1144 var1) {
      this.field_36584 = var1;
   }

   @Override
   public void run() {
      String var3;
      if (class_1144.method_5023(this.field_36584) && class_1144.method_5048() && class_1144.method_5062(this.field_36584).contains("websocket")) {
         var3 = "websocket";
      } else {
         if (0 == class_1144.method_5062(this.field_36584).size()) {
            class_1144 var4 = this.field_36584;
            class_8482.method_39080(new class_7765(this, var4));
            return;
         }

         var3 = (String)class_1144.method_5062(this.field_36584).get(0);
      }

      class_1144.method_5046(this.field_36584, class_5119.field_26407);
      class_2291 var5 = class_1144.method_5035(this.field_36584, var3);
      class_1144.method_5049(this.field_36584, var5);
      var5.method_10548();
   }
}
