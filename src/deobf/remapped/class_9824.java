package remapped;

public class class_9824 extends Module {
   private int field_49775 = 1;
   private boolean field_49776;

   public class_9824() {
      super(class_5664.field_28716, "TargetStrafe", "Allows you to strafe arround targets with speed");
      this.method_42010(new class_2826("Mode", "Mode", 0, "Basic", "Ninja", "Random"));
      this.method_42010(new class_2748<Float>("Radius", "Radius of the circle", 2.0F, Float.class, 1.0F, 6.0F, 0.01F));
      this.method_42010(new class_8563("Only speed", "Use target strafe only when speed is enabled", true));
      this.method_42010(
         new class_2826("AntiVoid", "The way you will avoid the void", 0, "Smart", "Halt", "Command", "None").method_23029(var1 -> this.field_49776 = false)
      );
   }

   @class_9148
   @class_7664
   public void method_45280(class_7767 var1) {
      if (this.method_42015()) {
         Entity var4 = null;
         if (SigmaMainClass.method_3328().method_3298().method_847(class_6908.class).method_42003() || !this.method_42007("Only speed")) {
            if (class_2534.field_12556 != null) {
               var4 = class_2534.field_12556.method_15377();
            } else if (class_2534.field_12558 != null) {
               var4 = class_2534.field_12558;
            }
         }

         if (var4 != null) {
            double var5 = Math.sqrt(var1.method_35234() * var1.method_35234() + var1.method_35231() * var1.method_35231());
            float var7 = this.method_42002("Radius");
            String var8 = this.method_42016("Mode");
            switch (var8) {
               case "Basic":
                  this.method_45282(var4, var5, (double)var7, var1);
                  break;
               case "Ninja":
                  float var15 = (float)Math.toRadians((double)(var4.method_37267() - 180.0F));
                  double var16 = var4.method_37245().field_7336 - (double)(class_9299.method_42818(var15) * var7);
                  double var17 = var4.method_37245().field_7334 + (double)(class_9299.method_42840(var15) * var7);
                  var1.method_35232(var16 - field_46692.field_9632.method_37245().field_7336);
                  var1.method_35229(var17 - field_46692.field_9632.method_37245().field_7334);
                  break;
               case "Random":
                  float var10 = (float)(Math.random() * 2.0 * Math.PI);
                  double var11 = var4.method_37245().field_7336 - (double)(class_9299.method_42818(var10) * var7);
                  double var13 = var4.method_37245().field_7334 + (double)(class_9299.method_42840(var10) * var7);
                  var1.method_35232(var11 - field_46692.field_9632.method_37245().field_7336);
                  var1.method_35229(var13 - field_46692.field_9632.method_37245().field_7334);
            }
         }
      }
   }

   public void method_45282(Entity var1, double var2, double var4, class_7767 var6) {
      double var9 = var2 / (var4 * Math.PI * 2.0) * 360.0 * (double)this.field_49775;
      double var11 = field_46692.field_9632.method_37302() - var1.method_37302();
      double var13 = field_46692.field_9632.method_37156() - var1.method_37156();
      double var15 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
      double var17 = (var15 + var9) * Math.PI / 180.0;
      double var19 = var1.method_37245().field_7336 - Math.sin(var17) * var4;
      double var21 = var1.method_37245().field_7334 + Math.cos(var17) * var4;
      var11 = var19 - field_46692.field_9632.method_37302();
      var13 = var21 - field_46692.field_9632.method_37156();
      double var23 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
      var17 = var23 * Math.PI / 180.0;
      var6.method_35232(-Math.sin(var17) * var2);
      var6.method_35229(Math.cos(var17) * var2);
      class_1343 var25 = field_46692.field_9632.method_37287(var6.method_35233());
      if (var25.field_7336 != var6.method_35234() || var25.field_7334 != var6.method_35231()) {
         this.field_49775 *= -1;
         var9 *= -1.0;
         var17 = (var15 + var9) * Math.PI / 180.0;
         var19 = var1.method_37245().field_7336 - Math.sin(var17) * var4;
         var21 = var1.method_37245().field_7334 + Math.cos(var17) * var4;
         var11 = var19 - field_46692.field_9632.method_37302();
         var13 = var21 - field_46692.field_9632.method_37156();
         var23 = Math.atan2(var13, var11) * 180.0 / Math.PI - 90.0;
         var17 = var23 * Math.PI / 180.0;
         var6.method_35232(-Math.sin(var17) * var2);
         var6.method_35229(Math.cos(var17) * var2);
      }

      class_1343 var26 = new class_1343(
         field_46692.field_9632.method_37245().field_7336 + var6.method_35234(),
         field_46692.field_9632.method_37245().field_7333 + var6.method_35236(),
         field_46692.field_9632.method_37245().field_7334 + var6.method_35231()
      );
      String var27 = this.method_42016("AntiVoid");
      if (!var27.equals("None")) {
         if (!this.field_49776 && this.method_45278(var26) && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
            this.field_49775 *= -1;
            this.field_49776 = true;
         } else if (this.field_49776 && !this.method_45278(var26)) {
            this.field_49776 = false;
         }
      }

      if (this.field_49776 && field_46692.field_9632.method_37175(var1) > this.method_42002("Radius")) {
         if (!var27.equals("Halt")) {
            class_8865.method_40777(var6, var2);
            if (var27.equals("Smart")) {
               var26 = new class_1343(
                  field_46692.field_9632.method_37245().field_7336 + var6.method_35234(),
                  field_46692.field_9632.method_37245().field_7333 + var6.method_35236(),
                  field_46692.field_9632.method_37245().field_7334 + var6.method_35231()
               );
               if (this.method_45278(var26) && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
                  class_8865.method_40777(var6, 0.0);
               }
            }
         } else {
            class_8865.method_40777(var6, 0.0);
         }
      }
   }

   private boolean method_45278(class_1343 var1) {
      if (!(field_46692.field_9632.method_37245().field_7333 < 1.0)) {
         class_4092 var4 = new class_4092(var1.method_6214(-0.15, 0.0, -0.15), var1.method_6214(0.15, (double)field_46692.field_9632.method_37074(), 0.15));
         var4 = var4.method_18928(0.0, -field_46692.field_9632.method_37245().field_7333, 0.0);
         return field_46692.field_9601.method_6680(field_46692.field_9632, var4).count() == 0L;
      } else {
         return true;
      }
   }

   private boolean method_45279(double var1, double var3, double var5) {
      return field_46692.field_9601.method_6680(field_46692.field_9632, field_46692.field_9632.field_41712.method_18918(var1, var3, var5)).count() == 0L;
   }
}
