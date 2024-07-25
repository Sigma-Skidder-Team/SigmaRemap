package remapped;

import java.util.ArrayList;

public class class_2419 extends class_9128 {
   private int field_12048;
   private ArrayList<class_6287> field_12047 = new ArrayList<class_6287>();

   public class_2419() {
      super(class_5664.field_28717, "Viper", "Disabler for ViperMC");
   }

   @Override
   public void method_42006() {
      this.field_12048 = 0;
   }

   @class_9148
   public void method_11038(class_1393 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         this.field_12048++;
         boolean var4 = var1.method_6454() > field_46692.field_9632.method_37309() - 1.0E-6
            && var1.method_6454() < field_46692.field_9632.method_37309() + 1.0E-6;
         if (var4) {
            var1.method_6455(field_46692.field_9632.method_37309() + 0.4);
            var1.method_6451(false);
         }

         if (this.field_12048 > 60) {
            var1.method_6455(field_46692.field_9632.method_37309() + 0.4);
            var1.method_6451(false);
         } else {
            for (int var5 = 0; var5 < 10; var5++) {
               boolean var6 = var5 > 2 && var5 < 8;
               double var7 = !var6 ? -0.2 : 0.2;
               class_9515 var9 = new class_9515(
                  field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() + var7, field_46692.field_9632.method_37156(), true
               );
               field_46692.method_8614().method_4813(var9);
            }

            field_46692.field_9632.field_30502 = 0.0;
            if (field_46692.field_9632.field_41697 <= 1) {
               this.field_12047.clear();
            }

            if (!this.field_12047.isEmpty()) {
               for (int var10 = 0; var10 < this.field_12047.size(); var10++) {
                  class_6287 var11 = this.field_12047.get(var10);
                  if (var11.method_28689()) {
                     field_46692.method_8614().method_4813(var11.method_28687());
                     this.field_12047.remove(var10);
                  }
               }
            }
         }
      }
   }

   @class_9148
   public void method_11039(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_7573) {
            class_7573 var5 = (class_7573)var4;
            var1.method_29715(true);
         }

         if (var4 instanceof class_8913) {
            class_8913 var6 = (class_8913)var4;
            var1.method_29715(true);
         }
      }
   }
}
