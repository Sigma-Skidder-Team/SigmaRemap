package remapped;

public class class_3134 extends class_9128 {
   private int field_15607;
   private double field_15606;
   private boolean field_15609;

   public class_3134() {
      super(class_5664.field_28716, "SlowHop", "SlowHop speed");
      this.method_42010(new class_8563("AutoJump", "Automatically jumps for you.", true));
   }

   @Override
   public void method_42006() {
      this.field_15606 = class_8865.method_40775();
      this.field_15607 = 2;
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(class_8865.method_40775());
   }

   @class_9148
   public void method_14501(class_7767 var1) {
      if (this.method_42015()) {
         boolean var4 = this.method_42007("AutoJump");
         double var5 = class_8865.method_40775();
         boolean var7 = class_314.method_1434();
         if (!field_46692.field_9632.field_41726) {
            this.field_15607++;
            this.field_15606 = 0.36 - (double)this.field_15607 / 250.0;
            if (this.field_15606 < var5) {
               this.field_15606 = var5;
            }

            class_8865.method_40777(var1, this.field_15606);
         } else {
            this.field_15607 = 0;
            field_46692.field_9632.method_26595();
            var1.method_35235(field_46692.field_9632.method_37098().field_7333);
         }
      }
   }

   @class_9148
   public void method_14500(class_2911 var1) {
      if (this.method_42015()) {
         var1.method_13313(0.407 + 0.1 * (double)class_8865.method_40769());
         this.field_15607 = 0;
         var1.method_13315(1.8);
      }
   }
}
