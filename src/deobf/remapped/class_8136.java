package remapped;

public class class_8136 extends Module {
   private boolean field_41672 = false;

   public class_8136() {
      super(class_5664.field_28716, "Jump", "Jump spider");
      this.method_42010(new class_2826("Mode", "Mode", 0, "Spartan"));
      this.method_42010(new class_8563("AutoJump", "Automatically jumps for you", true));
   }

   @Override
   public void method_42006() {
      this.field_41672 = false;
   }

   @class_9148
   private void method_37009(class_7767 var1) {
      if (!field_46692.field_9632.field_41744) {
         this.field_41672 = false;
      } else if (!field_46692.field_9632.field_41726) {
         if (field_46692.field_9632.method_37245().field_7333 != (double)((int)field_46692.field_9632.method_37245().field_7333)) {
            if (var1.method_35236() < 0.0
               && field_46692.field_9632.method_37245().field_7333 + var1.method_35236() < (double)((int)field_46692.field_9632.method_37245().field_7333)) {
               var1.method_35235((double)((int)field_46692.field_9632.method_37245().field_7333) - field_46692.field_9632.method_37245().field_7333);
               this.field_41672 = true;
            }
         } else if (this.method_42007("AutoJump") || field_46692.field_9577.field_45450.method_27060()) {
            field_46692.field_9632.method_26595();
            var1.method_35235(field_46692.field_9632.method_37098().field_7333);
         } else if (!field_46692.field_9577.field_45560.method_27060()) {
            class_8865.method_40777(var1, 0.28 + (double)class_8865.method_40770() * 0.05);
            var1.method_35235(0.0);
         } else {
            var1.method_35235(-0.0784);
         }
      } else if (this.method_42007("AutoJump")) {
         field_46692.field_9632.method_26595();
         var1.method_35235(field_46692.field_9632.method_37098().field_7333);
      }

      class_314.method_1408(var1.method_35236());
   }

   @class_9148
   private void method_37010(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         class_9097 var4 = class_314.method_1462(1.0E-4);
         String var5 = this.method_42016("Mode");
         if (this.method_42007("Ceiling")
            && !field_46692.field_9632.field_41726
            && field_46692.field_9601.method_6680(field_46692.field_9632, field_46692.field_9632.field_41712.method_18918(0.0, 1.0E-6, 0.0)).count() > 0L) {
            var1.method_6455(var1.method_6454() + 4.9E-7);
         }

         if (var4 != null) {
            var1.method_6444(true);
            double var6 = 0.0;
            switch (var5) {
               case "AGC":
                  var6 = 4.85E-7;
                  break;
               case "Spartan":
                  var6 = 1.0E-13;
            }

            if (this.field_41672) {
               if (this.method_42007("AutoJump") || field_46692.field_9577.field_45450.method_27060()) {
                  this.field_41672 = !this.field_41672;
               }

               var1.method_6451(true);
               switch (var5) {
                  case "AGC":
                     var6 = 4.85E-7;
                     break;
                  case "Spartan":
                     var6 = 1.0E-12;
               }
            }

            if (((Direction)var4.method_41933()).method_1029() == class_9249.field_47215) {
               var1.method_6443(
                  (double)Math.round((((class_1343)var4.method_41934()).field_7336 + 1.1921022E-8) * 10000.0) / 10000.0
                     + (double)((Direction)var4.method_41933()).method_1041() * var6
               );
            } else {
               var1.method_6453(
                  (double)Math.round((((class_1343)var4.method_41934()).field_7334 + 1.1921022E-8) * 10000.0) / 10000.0
                     + (double)((Direction)var4.method_41933()).method_1034() * var6
               );
            }
         }
      }
   }

   @class_9148
   private void method_37008(class_5243 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (var1.method_23988() != null
            && !var1.method_23988().method_19485()
            && var1.method_23988().method_19483().field_19937 > field_46692.field_9632.field_41712.field_19937 + 1.0) {
            var1.method_29715(true);
         }
      }
   }
}
