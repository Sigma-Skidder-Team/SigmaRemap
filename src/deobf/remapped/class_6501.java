package remapped;

public class class_6501 extends class_9128 {
   public int field_33089 = -1;

   public class_6501() {
      super(class_5664.field_28712, "AutoTools", "Picks the best tool when breaking blocks");
      this.method_42010(new class_2826("Inv Mode", "The way it will move tools in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
   }

   @class_9148
   public void method_29644(class_307 var1) {
      if (this.method_42015() && field_46692.field_9632 != null && var1.method_1364() == 0) {
         if (this.field_33089 != -1) {
            field_46692.field_9632.field_3853.field_36404 = this.field_33089;
            this.field_33089 = -1;
         }
      }
   }

   @class_9148
   private void method_29646(class_6435 var1) {
      if (this.method_42015() && field_46692.field_9632 != null && var1.method_29384() == 0) {
         this.method_29647(var1.method_29386());
      }
   }

   @class_9148
   private void method_29645(class_5596 var1) {
      if (this.method_42015() && field_46692.field_9632 != null && field_46692.field_9577.field_45530.method_27060()) {
         this.method_29647(null);
      }
   }

   public void method_29647(class_1331 var1) {
      class_1331 var4 = var1 == null
         ? (field_46692.field_9587.method_33990() != class_1430.field_7717 ? null : ((class_9529)field_46692.field_9587).method_43955())
         : var1;
      if (var4 != null) {
         int var5 = class_2740.method_12348(field_46692.field_9601.method_28262(var4));
         if (var5 != -1) {
            if (field_46692.field_9632.field_3853.field_36404 != var5 % 9 && this.field_33089 == -1) {
               this.field_33089 = field_46692.field_9632.field_3853.field_36404;
            }

            if (var5 >= 36 && var5 <= 44) {
               field_46692.field_9632.field_3853.field_36404 = var5 % 9;
            } else if (class_727.method_3328().method_3310().method_25303() > 1) {
               String var6 = this.method_42016("Inv Mode");
               if (var6.equals("OpenInv") && !(field_46692.field_9623 instanceof class_3431)) {
                  return;
               }

               if (var6.equals("FakeInv") && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                  field_46692.method_8614().method_4813(new class_8559(class_2105.field_10551));
               }

               field_46692.field_9632.field_3853.field_36404 = class_2740.method_12363(var5);
               if (var6.equals("FakeInv")) {
                  field_46692.method_8614().method_4813(new class_1194(-1));
               }
            }
         }
      }
   }
}
