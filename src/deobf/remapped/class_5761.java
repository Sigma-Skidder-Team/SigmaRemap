package remapped;

public class class_5761 extends Module {
   private int field_29131;
   private int field_29132;
   private int field_29133;
   private double field_29130;

   public class_5761() {
      super(Category.MOVEMENT, "Mineplex", "Speed for Mineplex");
      this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
      this.addSetting(new BooleanSetting("OnGround", "OnGround Speed.", true));
      this.addSetting(new FloatSetting<Float>("OnGround Speed", "OnGround value.", 0.8F, Float.class, 0.3F, 1.5F, 0.01F));
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(class_8865.method_40775() * 0.7);
      if (mcInstance.field_9632.field_3853.field_36404 != this.field_29133) {
         mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
         this.field_29133 = mcInstance.field_9632.field_3853.field_36404;
      }
   }

   @Override
   public void onEnable() {
      this.field_29132 = 0;
      this.field_29131 = 0;
      this.field_29133 = -1;
      this.field_29130 = (double)(this.getFloatValueByName("OnGround Speed") * 1.0F / 4.0F);
   }

   @EventListen
   @class_315
   public void method_26048(class_7767 var1) {
      if (this.method_42015()
         && !SigmaMainClass.getInstance().getModuleManager().method_847(BlockFlyModule.class).method_42015()
         && !class_314.method_1437(mcInstance.field_9632)) {
         double var4 = (double)this.getFloatValueByName("OnGround Speed");
         if (!mcInstance.field_9632.field_41726) {
            if (mcInstance.field_9632.field_41744) {
               this.field_29130 = 0.35;
               this.field_29132 = 1;
            }

            if (!class_314.method_1434()) {
               this.field_29130 = 0.3;
            }

            this.field_29130 -= 0.01;
            if (this.field_29130 < 0.3) {
               this.field_29130 = 0.3;
            }

            class_8865.method_40777(var1, this.field_29130);
         } else {
            if (this.field_29131 > 1) {
               this.field_29132 = 0;
            } else {
               this.field_29131++;
            }

            if (this.getBooleanValueByName("AutoJump") && class_314.method_1434()) {
               mcInstance.field_9632.method_26595();
               var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
            }

            if (var1.method_35236() == 0.4199998) {
               class_8865.method_40777(var1, 0.0);
               return;
            }

            if (!this.getBooleanValueByName("OnGround")) {
               return;
            }

            int var6 = this.method_26049();
            if (var6 == -1) {
               class_8865.method_40777(var1, 0.2);
               return;
            }

            class_1343 var7 = new class_1343(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
            class_1331 var8 = new class_1331(mcInstance.field_9632.method_37075()).method_6104(0, -1, 0);
            class_9529 var9 = new class_9529(var7, Direction.field_817, var8, false);
            class_8585 var10 = new class_8585(class_2584.field_12791, var9);
            mcInstance.method_8614().method_4813(var10);
            this.field_29130 += var4 / 4.0;
            if (mcInstance.field_9632.field_41744) {
               this.field_29130 /= 2.0;
            }

            if (this.field_29130 > var4) {
               this.field_29130 = var4;
            }

            if (this.field_29130 < 0.3) {
               this.field_29130 = 0.3;
            }

            class_8865.method_40777(var1, this.field_29130);
         }
      }
   }

   @EventListen
   public void method_26052(class_2911 var1) {
      if (this.method_42015()) {
         this.field_29130 = 0.81 + (double)this.field_29132 * 0.095;
         if (mcInstance.field_9632.method_37309() != (double)((int) mcInstance.field_9632.method_37309())) {
            this.field_29130 = 0.52;
            this.field_29132 = 1;
         }

         this.field_29131 = 0;
         if (this.field_29132 < 2) {
            this.field_29132++;
         }

         var1.method_13315(0.0);
         var1.method_13313(0.4199998);
         if (mcInstance.field_9632.field_3853.field_36404 != this.field_29133) {
            mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
            this.field_29133 = mcInstance.field_9632.field_3853.field_36404;
         }
      }
   }

   @EventListen
   public void method_26050(class_139 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (var1.method_557() instanceof class_509) {
            this.field_29132 = 0;
            this.field_29130 = 0.0;
         }
      }
   }

   @EventListen
   public void method_26051(class_8544 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (var1.method_39326() > 0.2) {
            this.field_29130 = this.field_29130 - (double)(this.getFloatValueByName("OnGround Speed") / 4.0F);
         }
      }
   }

   private int method_26049() {
      if (mcInstance.field_9632.method_26446().method_28022()) {
         this.field_29133 = mcInstance.field_9632.field_3853.field_36404;
         return this.field_29133;
      } else {
         for (int var3 = 36; var3 < 45; var3++) {
            int var4 = var3 - 36;
            if (mcInstance.field_9632.field_3869.method_18878(var3).method_35898().method_28022()) {
               if (mcInstance.field_9632.field_3853.field_36404 != var4 && this.field_29133 != var4) {
                  mcInstance.method_8614().method_4813(new class_7371(var4));
                  this.field_29133 = var4;
               }

               return var4;
            }
         }

         class_2740.method_12356(mcInstance.field_9632.field_3869.field_19925, 42, 0, class_6269.field_32019, mcInstance.field_9632, true);
         if (mcInstance.field_9632.field_3869.method_18878(42).method_35898().method_28022()
            && mcInstance.field_9632.field_3853.field_36404 != 6
            && this.field_29133 != 6) {
            mcInstance.method_8614().method_4813(new class_7371(6));
            this.field_29133 = 6;
            return 6;
         } else {
            return -1;
         }
      }
   }
}