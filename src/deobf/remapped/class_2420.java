package remapped;

public class class_2420 extends class_9128 {
   private int field_12052;
   private class_1331 field_12051;

   public class_2420() {
      super(class_5664.field_28716, "Spartan", "ClickTP for spartan anticheat");
   }

   @Override
   public void method_42006() {
      this.field_12052 = -1;
      this.field_12051 = null;
   }

   @Override
   public void method_42020() {
      class_314.method_1408(-0.08);
      double var3 = class_8865.method_40775();
      class_8865.method_40776(var3);
      field_46692.field_9616.field_32603 = 1.0F;
   }

   @class_9148
   private void method_11040(class_8706 var1) {
      if (this.method_42015() && (field_46692.field_9632.method_37252() || !this.method_42017().method_42007("Sneak"))) {
         if (var1.method_40004() == class_3237.field_16101) {
            class_9529 var4 = class_7494.method_34079(
               field_46692.field_9632.field_41701, field_46692.field_9632.field_41755, this.method_42017().method_42002("Maximum range")
            );
            class_1331 var5 = null;
            if (var4 != null) {
               var5 = var4.method_43955();
            }

            if (var5 == null) {
               return;
            }

            this.field_12051 = var5;
            field_46692.method_8614()
               .method_4813(
                  new class_9515(
                     (double)this.field_12051.method_12173() + 0.5,
                     (double)(this.field_12051.method_12165() + 1),
                     (double)this.field_12051.method_12185() + 0.5,
                     true
                  )
               );
            this.field_12052 = 0;
         }
      }
   }

   @class_9148
   public void method_11042(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            class_509 var4 = (class_509)var1.method_557();
            if (var4.field_3139 == (double)this.field_12051.method_12173() + 0.5
               && var4.field_3144 == (double)(this.field_12051.method_12165() + 1)
               && var4.field_3141 == (double)this.field_12051.method_12185() + 0.5) {
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("ClickTP", "Successfully teleported"));
               if (!this.method_42017().method_42007("Auto Disable")) {
                  this.field_12052 = -1;
                  this.field_12051 = null;
                  class_314.method_1408(-0.08);
                  double var5 = class_8865.method_40775();
                  class_8865.method_40776(var5);
                  field_46692.field_9616.field_32603 = 1.0F;
               } else {
                  this.method_42017().method_41999();
               }
            }
         }
      }
   }

   @class_9148
   private void method_11041(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_12052 > -1 && this.field_12051 != null) {
            var1.method_35235(0.01);
            this.field_12052++;
            if (this.field_12052 >= 20) {
               field_46692.field_9616.field_32603 = 1.4F;
            } else {
               field_46692.field_9616.field_32603 = 2.0F;
            }

            field_46692.method_8614()
               .method_4813(
                  new class_9515(field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309(), field_46692.field_9632.method_37156(), true)
               );
            field_46692.method_8614()
               .method_4813(
                  new class_9515(
                     (double)this.field_12051.method_12173() + 0.5,
                     (double)(this.field_12051.method_12165() + 1),
                     (double)this.field_12051.method_12185() + 0.5,
                     true
                  )
               );
         }
      }
   }
}
