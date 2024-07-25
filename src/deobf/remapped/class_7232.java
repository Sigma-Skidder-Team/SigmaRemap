package remapped;

import com.mentalfrostbyte.jello.mods.util.InDevelopment;

@InDevelopment
public class class_7232 extends Module {
   private double field_37111;
   private int field_37112;
   private int field_37110;
   private class_1343 field_37114 = null;

   public class_7232() {
      super(class_5664.field_28710, "AntiVoid", "Avoids you from falling in the void");
      this.method_42010(new class_8563("Void", "Catch only above void", true));
      this.method_42010(new class_2748<Float>("Fall Distance", "Fall distance before catching you", 8.0F, Float.class, 2.0F, 15.0F, 0.5F));
      this.method_42010(new class_2826("Mode", "AntiVoid method", 0, "Hypixel", "Motion", "Cubecraft", "Legit"));
   }

   @Override
   public void method_42006() {
      this.field_37111 = 0.0;
      this.field_37110 = 0;
      this.field_37112 = 0;
      if (field_46692.field_9632.field_41726 || class_314.method_1413(field_46692.field_9632, 0.001F)) {
         this.field_37114 = new class_1343(field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309(), field_46692.field_9632.method_37156());
      }
   }

   @class_9148
   private void method_33097(class_7767 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.field_41726 || class_314.method_1413(field_46692.field_9632, 0.001F)) {
            this.field_37114 = new class_1343(
               field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309(), field_46692.field_9632.method_37156()
            );
         }

         if (this.field_37110 <= 0) {
            Module var4 = SigmaMainClass.method_3328().method_3298().method_847(class_2368.class);
            String var5 = var4.method_42016("Type");
            Module var6 = SigmaMainClass.method_3328().method_3298().method_847(class_5838.class);
            String var7 = var6.method_42016("Type");
            boolean var8 = var4.method_42015();
            if (var5.equals("Cubecraft") && var1.method_35236() < -0.4) {
               var8 = false;
            }

            if (var6.method_42015() && var7.equals("Hypixel")) {
               var8 = true;
            }

            if (field_46692.field_9632.method_37098().field_7333 < -0.08 && !var8) {
               this.field_37111 = this.field_37111 - field_46692.field_9632.method_37098().field_7333;
            } else if (field_46692.field_9632.field_41726) {
               this.field_37111 = 0.0;
            }
         } else {
            class_8865.method_40777(var1, 0.0);
            var1.method_35235(0.0);
            this.field_37110--;
         }

         if (this.field_37111 > (double)this.method_42002("Fall Distance") && (this.method_33100() || !this.method_42007("Void"))) {
            this.field_37111 = 0.0;
            this.method_33096(this.method_42016("Mode"), var1);
         }

         if (this.field_37112 > 0) {
            this.field_37112--;
            class_8865.method_40777(var1, 0.1);
         }
      }
   }

   @class_9148
   private void method_33099(class_1393 var1) {
      if (this.method_42015() && var1.method_6449() && this.field_37110 != 0) {
         var1.method_29715(true);
      }
   }

   @class_9148
   private void method_33098(class_139 var1) {
      if (this.method_42015() && this.field_37110 != 0) {
         if (var1.method_557() instanceof class_509) {
            this.field_37110 = 0;
            this.field_37112 = 4;
         }
      }
   }

   private boolean method_33100() {
      if (!(field_46692.field_9632.method_37245().field_7333 < 1.0)) {
         if (!field_46692.field_9632.field_41726) {
            class_4092 var3 = field_46692.field_9632.field_41712;
            var3 = var3.method_18928(0.0, -field_46692.field_9632.method_37245().field_7333, 0.0);
            return field_46692.field_9601.method_6680(field_46692.field_9632, var3).count() == 0L;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private void method_33096(String var1, class_7767 var2) {
      double var5 = field_46692.field_9632.method_37245().method_61();
      double var7 = field_46692.field_9632.method_37245().method_60();
      double var9 = field_46692.field_9632.method_37245().method_62();
      if (var1.equals("Cubecraft") && !class_314.method_1392()) {
         var1 = "Motion";
      }

      switch (var1) {
         case "Hypixel":
            field_46692.method_8614().method_4813(new class_9515(0.0, -999.0, 0.0, true));
            break;
         case "Motion":
            var2.method_35235(0.1);
            class_314.method_1408(var2.method_35236());
            break;
         case "Cubecraft":
            double var13 = 3.2E7;
            field_46692.method_8614().method_4813(new class_9515(var5, var13, var9, false));
            SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_41991(false);
            break;
         case "Legit":
            this.field_37110 = 200;
      }
   }
}
