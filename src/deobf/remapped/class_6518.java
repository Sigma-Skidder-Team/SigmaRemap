package remapped;

import java.util.Random;

public class class_6518 extends class_9128 {
   private Random field_33187 = new Random();
   private boolean field_33189;
   private int field_33188;
   private int field_33191;

   public class_6518() {
      super(class_5664.field_28710, "Derp", "Spazzes around");
      this.method_42010(new class_2826("Rotation Mode", "Rotation Mode", 0, "Random", "Spin", "None"));
      this.method_42010(new class_8563("Hit", "Randomly hit", true));
      this.method_42010(new class_8563("Sneak", "Randomly sneak", true));
   }

   @class_9148
   public void method_29695(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (this.method_42007("Sneak")) {
            if (this.field_33189) {
               field_46692.method_8614().method_4813(new class_2317(field_46692.field_9632, class_4127.field_20097));
            } else {
               field_46692.method_8614().method_4813(new class_2317(field_46692.field_9632, class_4127.field_20098));
            }
         }

         this.field_33189 = !this.field_33189;
         this.field_33188++;
         if (this.method_42007("Hit") && this.field_33188 > this.field_33187.nextInt(5) + 3) {
            this.field_33188 = 0;
            class_2584 var4 = class_2584.values()[this.field_33187.nextInt(1)];
            field_46692.field_9632.method_26597(var4);
         }

         String var6 = this.method_42016("Rotation Mode");
         switch (var6) {
            case "Random":
               var1.method_6441(this.field_33187.nextFloat() * 360.0F);
               var1.method_6448(this.field_33187.nextFloat() * 180.0F - 90.0F);
               break;
            case "Spin":
               this.field_33191 += 20;

               while (this.field_33191 > 360) {
                  this.field_33191 -= 360;
               }

               var1.method_6441((float)this.field_33191 + this.field_33187.nextFloat());
         }
      }
   }

   @Override
   public void method_42006() {
      this.field_33191 = (int)field_46692.field_9632.field_41701;
   }
}
