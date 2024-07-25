package remapped;

public class class_5372 extends Module {
   private boolean field_27443 = false;

   public class_5372() {
      super(Category.MOVEMENT, "Minemen", "Minemen spider");
      this.addSetting(new BooleanSetting("AutoClimb", "Automatically climbs for you", true));
      this.addSetting(new BooleanSetting("Ceiling", "Allows you to fly under ceiling", true));
      this.addSetting(new BooleanSetting("SneakVClip", "Allows you to phase through ground", true));
   }

   @Override
   public void method_42006() {
      this.field_27443 = false;
   }

   @class_9148
   private void method_24505(class_7767 var1) {
      double var4 = 1.0E-5;
      boolean var6 = mcInstance.field_9601
            .method_6680(mcInstance.field_9632, mcInstance.field_9632.field_41712.method_18928(var4, 0.0, var4).method_18928(-var4, 0.0, -var4))
            .count()
         > 0L;
      if (var6) {
         if (!mcInstance.field_9632.field_41744) {
            if (!mcInstance.field_9632.field_41726) {
               var1.method_35235(!mcInstance.field_9577.field_45560.method_27060() ? 0.0 : var1.method_35236());
            }
         } else if (!this.method_42007("AutoClimb") && !mcInstance.field_9577.field_45450.method_27060()) {
            var1.method_35235(!mcInstance.field_9577.field_45560.method_27060() ? 0.0 : var1.method_35236());
         } else {
            var1.method_35235(0.6);
         }

         class_8865.method_40777(var1, 0.689 + (double)class_8865.method_40770() * 0.06);
      }

      if (class_314.method_1413(mcInstance.field_9632, 0.001F) && this.method_42007("SneakVClip")) {
         if (mcInstance.field_9577.field_45560.method_27060()
            && !this.field_27443
            && mcInstance.field_9601.method_6680(mcInstance.field_9632, mcInstance.field_9632.field_41712.method_18918(0.0, -2.8, 0.0)).count() == 0L) {
            mcInstance.method_8614()
               .method_4813(
                  new class_9515(
                     mcInstance.field_9632.method_37245().field_7336,
                     mcInstance.field_9632.method_37245().field_7333 - 1.0E-14,
                     mcInstance.field_9632.method_37245().field_7334,
                     false
                  )
               );
            mcInstance.field_9632
               .method_37256(
                  mcInstance.field_9632.method_37245().field_7336,
                  mcInstance.field_9632.method_37245().field_7333 - 2.8,
                  mcInstance.field_9632.method_37245().field_7334
               );
            mcInstance.field_9577.field_45560.field_30024 = false;
            mcInstance.field_9632.field_41726 = false;
            mcInstance.field_9616.field_32603 = 0.08F;
            var1.method_29715(true);
            this.field_27443 = true;
            var1.method_35235(1.0E-14);
         }
      } else {
         if (this.method_42007("Ceiling")
            && !mcInstance.field_9577.field_45560.method_27060()
            && mcInstance.field_9601.method_6680(mcInstance.field_9632, mcInstance.field_9632.field_41712.method_18918(0.0, 0.01, 0.0)).count() > 0L) {
            var1.method_35235(1.0E-14);
            class_8865.method_40777(var1, 0.689 + (double)class_8865.method_40770() * 0.06);
         }

         if (this.field_27443) {
            mcInstance.field_9616.field_32603 = 1.0F;
            this.field_27443 = false;
            var1.method_35235(1.0E-14);
            class_8865.method_40777(var1, 0.28);
         }
      }

      class_314.method_1408(var1.method_35236());
   }

   @class_9148
   private void method_24504(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         class_9097 var4 = class_314.method_1462(1.0E-4);
         if (this.method_42007("Ceiling")
            && !mcInstance.field_9632.field_41726
            && mcInstance.field_9601.method_6680(mcInstance.field_9632, mcInstance.field_9632.field_41712.method_18918(0.0, 1.0E-6, 0.0)).count() > 0L) {
            var1.method_6455(var1.method_6454() + 4.9E-7);
         }

         double var5 = 1.0E-5;
         if (var4 != null
            && mcInstance.field_9601
                  .method_6680(mcInstance.field_9632, mcInstance.field_9632.field_41712.method_18928(var5, 0.0, var5).method_18928(-var5, 0.0, -var5))
                  .count()
               > 0L) {
            if (!class_314.method_1413(mcInstance.field_9632, 1.0E-4F)) {
               var1.method_6451(true);
            }

            double var7 = 4.88E-7;
            if (((Direction)var4.method_41933()).method_1029() != class_9249.field_47215) {
               var1.method_6453(
                  (double)Math.round((((class_1343)var4.method_41934()).field_7334 + 1.1921022E-8) * 10000.0) / 10000.0
                     + (double)((Direction)var4.method_41933()).method_1034() * var7
               );
            } else {
               var1.method_6443(
                  (double)Math.round((((class_1343)var4.method_41934()).field_7336 + 1.1921022E-8) * 10000.0) / 10000.0
                     + (double)((Direction)var4.method_41933()).method_1041() * var7
               );
            }
         }
      }
   }

   @class_9148
   private void method_24503(class_5243 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (var1.method_23988() != null
            && !var1.method_23988().method_19485()
            && var1.method_23988().method_19483().field_19937 > mcInstance.field_9632.field_41712.field_19937 + 1.0) {
            var1.method_29715(true);
         }
      }
   }
}
