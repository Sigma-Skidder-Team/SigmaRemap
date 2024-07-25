package remapped;

public class class_1755 extends class_9128 {
   private int field_9020;

   public class_1755() {
      super(class_5664.field_28717, "VeltPvP", "Disabler for VeltPvP.");
   }

   @Override
   public void method_42006() {
      this.field_9020 = 0;
   }

   @class_9148
   public void method_7848(class_1393 var1) {
      if (this.method_42015() && field_46692.field_9632 != null && var1.method_6449()) {
         this.field_9020++;
         double var4 = -0.1;
         if (this.field_9020 >= 20) {
            this.field_9020 = 0;
            var1.method_6455(var4);
            var1.method_6451(false);
         }
      }
   }

   @class_9148
   public void method_7847(class_139 var1) {
      if (!this.method_42015()) {
         ;
      }
   }
}
