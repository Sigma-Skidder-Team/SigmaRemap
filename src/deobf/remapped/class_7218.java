package remapped;

public class class_7218 extends class_9128 {
   private double[] field_37059 = new double[]{0.0, 0.0};
   private boolean field_37058;

   public class_7218() {
      super(class_5664.field_28710, "AutoSprint", "Sprints for you");
      this.method_42010(new class_8563("Keep Sprint", "Keep Sprinting after hitting a player", true));
   }

   @class_9148
   public void method_33059(class_5596 var1) {
      if (this.method_42015()) {
         class_3620 var4 = (class_3620)class_727.method_3328().method_3298().method_847(class_3709.class);
         class_9128 var5 = var4.field_17664;
         if (var5 == null || !var5.method_42015() || !(var5 instanceof class_2461) || var5.method_42007("Haphe (AACAP)")) {
            if (field_46692.field_9632.field_29673 > 0.0F && !((class_3709)class_727.method_3328().method_3298().method_847(class_3709.class)).method_17212()) {
               field_46692.field_9632.method_37140(true);
            } else {
               field_46692.field_9632.method_37140(false);
            }
         }
      }
   }

   @class_9148
   public void method_33060(class_8128 var1) {
      if (this.method_42015()
         && !(field_46692.field_9632.field_29673 <= 0.0F)
         && (!field_46692.field_9632.method_26554() || field_46692.field_9632.method_26576().method_27960() != class_4897.field_25206)
         && !((class_3709)class_727.method_3328().method_3298().method_847(class_3709.class)).method_17212()) {
         class_9747 var4 = field_46692.field_9632.method_26561(class_7331.field_37465);
         float var5 = (float)(
               (var4.method_44996() + 0.03F + (double)(0.015F * (float)class_8865.method_40770())) / (double)field_46692.field_9632.field_3876.method_4229()
                  + 1.0
            )
            / 2.0F;
         var1.field_41637 = var5;
      }
   }

   @class_9148
   public void method_33058(class_3645 var1) {
      if (this.method_42015() && this.method_42007("Keep Sprint")) {
         if (!var1.method_16971()) {
            if (this.field_37059.length == 2) {
               double var4 = this.field_37059[0] - field_46692.field_9632.method_37098().field_7336;
               double var6 = this.field_37059[1] - field_46692.field_9632.method_37098().field_7334;
               if (var4 != 0.0 || var6 != 0.0) {
                  field_46692.field_9632.method_37214(this.field_37059[0], field_46692.field_9632.method_37098().field_7333, this.field_37059[1]);
               }

               if (this.field_37058 && !field_46692.field_9632.method_37321()) {
                  field_46692.field_9632.method_37140(true);
               }
            }
         } else {
            this.field_37059[0] = field_46692.field_9632.method_37098().field_7336;
            this.field_37059[1] = field_46692.field_9632.method_37098().field_7334;
            this.field_37058 = field_46692.field_9632.method_37321();
         }
      }
   }
}
