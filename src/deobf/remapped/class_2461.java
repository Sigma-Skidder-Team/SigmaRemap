package remapped;

import java.util.List;

public class class_2461 extends Module {
   private float field_12315;
   private float field_12313;
   private int field_12316 = 0;
   private int field_12311 = 0;
   private int field_12318;
   private int field_12312;
   private double field_12314;

   public class_2461() {
      super(Category.MOVEMENT, "AAC", "Places block underneath if it is in hand");
      this.addSetting(new BooleanSetting("Haphe (AACAP)", "Never let's you touch the ground.", false));
   }

   @Override
   public void onEnable() {
      this.field_12311 = mcInstance.field_9632.field_3853.field_36404;
      this.field_12315 = mcInstance.field_9632.field_41701;
      this.field_12313 = mcInstance.field_9632.field_41755;
      this.field_12316 = (int) mcInstance.field_9632.method_37309();
      this.field_12312 = -1;
      ((BlockFlyModule)this.method_42017()).field_18196 = -1;
   }

   @Override
   public void onDisable() {
      if (this.field_12311 != -1 && this.method_42017().getStringValueByName("ItemSpoof").equals("Switch")) {
         mcInstance.field_9632.field_3853.field_36404 = this.field_12311;
      }

      this.field_12311 = -1;
      if (((BlockFlyModule)this.method_42017()).field_18196 >= 0) {
         mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
         ((BlockFlyModule)this.method_42017()).field_18196 = -1;
      }

      mcInstance.field_9616.field_32603 = 1.0F;
   }

   @EventListen
   @class_7664
   public void method_11335(class_2157 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (var1.method_10047() instanceof class_7371 && ((BlockFlyModule)this.method_42017()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_11338(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            this.field_12312 = 0;
         }
      }
   }

   @EventListen
   public void method_11342(class_7982 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.field_41726 && SigmaMainClass.getInstance().getModuleManager().method_847(class_1396.class).method_42015()) {
            var1.method_36186(true);
         }
      }
   }

   @EventListen
   public void method_11337(class_7767 var1) {
      if (this.method_42015()) {
         if (this.method_42017().getBooleanValueByName("No Sprint")) {
            mcInstance.field_9632.method_37140(false);
         }

         if (!this.getBooleanValueByName("Haphe (AACAP)")) {
            mcInstance.gameOptions.field_45444.field_30024 = false;
            mcInstance.field_9632.method_37140(false);
         }

         ((BlockFlyModule)this.method_42017()).method_17220(var1);
         if (this.getBooleanValueByName("Haphe (AACAP)")) {
            if (!mcInstance.field_9632.field_41726 || mcInstance.field_9632.field_29673 == 0.0F && mcInstance.field_9632.field_29676 == 0.0F) {
               if (this.field_12318 >= 0) {
                  this.field_12318++;
               }
            } else {
               this.field_12318 = 0;
               mcInstance.field_9632.method_26595();
               var1.method_35235(0.419998 + (double)class_8865.method_40769() * 0.1);
               if (this.field_12312 < 3) {
                  this.field_12312++;
               }
            }

            if (mcInstance.field_9632.field_29673 == 0.0F && mcInstance.field_9632.field_29676 == 0.0F || mcInstance.field_9632.field_41744) {
               this.field_12312 = 0;
            }

            this.field_12314 = class_6053.method_27638(this.field_12318, this.field_12312, () -> this.field_12312 = 0);
            if (this.field_12318 >= 0) {
               class_8865.method_40777(var1, this.field_12314);
            }
         }
      }
   }

   @EventListen
   private void method_11341(class_8128 var1) {
      if (this.method_42015() && mcInstance.field_9601 != null && mcInstance.field_9632 != null) {
         if (this.getBooleanValueByName("Haphe (AACAP)") && class_8865.method_40772() && !mcInstance.field_9632.method_37321()) {
            var1.field_41637 *= 1.14F;
         }
      }
   }

   private boolean method_11333() {
      class_9529 var3 = (class_9529)class_7494.method_34115(
         mcInstance.field_9632.field_30535, mcInstance.field_9632.field_30524, class_7494.method_34074(), 0.0F
      );
      boolean var4 = false;
      if (var3 != null && var3.method_33990() == class_1430.field_7717) {
         if (this.method_42017().getStringValueByName("ItemSpoof").equals("None")) {
            BlockFlyModule var10000 = (BlockFlyModule)this.method_42017();
            if (!BlockFlyModule.method_17216(mcInstance.field_9632.method_26617(class_2584.field_12791).method_27960())) {
               return false;
            }
         }

         if (this.getBooleanValueByName("Haphe (AACAP)") && !mcInstance.field_9632.field_29654 && !mcInstance.field_9632.field_41726) {
            if (var3.method_43956() == Direction.field_817) {
               return false;
            }

            if (var3.method_43955().method_12165() != this.field_12316 - 1) {
               return false;
            }
         }

         if (var3.method_43956() == Direction.field_817
            && (double)(var3.method_43955().method_12165() + 2) > mcInstance.field_9632.method_37309()
            && class_7494.method_34090(var3.method_43955())) {
            return false;
         }

         if ((double)var3.method_43955().method_12165() == mcInstance.field_9632.method_37309()) {
            return false;
         }

         ((BlockFlyModule)this.method_42017()).method_17215();
         int var5 = mcInstance.field_9632.field_3853.field_36404;
         if (!this.method_42017().getStringValueByName("ItemSpoof").equals("None")) {
            ((BlockFlyModule)this.method_42017()).method_17211();
         }

         class_6910 var6 = mcInstance.field_9647.method_42147(mcInstance.field_9632, mcInstance.field_9601, class_2584.field_12791, var3);
         if (this.method_42017().getStringValueByName("ItemSpoof").equals("Spoof") || this.method_42017().getStringValueByName("ItemSpoof").equals("LiteSpoof")) {
            mcInstance.field_9632.field_3853.field_36404 = var5;
         }

         if (var6 == class_6910.field_35520) {
            if (!this.method_42017().getBooleanValueByName("NoSwing")) {
               mcInstance.field_9632.method_26597(class_2584.field_12791);
            } else {
               mcInstance.method_8614().method_4813(new class_3195(class_2584.field_12791));
            }

            if (var3.method_43956() == Direction.field_817) {
               this.field_12316 = var3.method_43955().method_12165() + 2;
            }

            var4 = true;
         }
      }

      return var4;
   }

   public List<class_7606> method_11334(class_6414 var1, class_1331 var2) {
      return class_7829.method_35452(var1, var2, (int) mcInstance.field_9647.method_42146());
   }

   @EventListen
   public void method_11339(class_1711 var1) {
      if (this.method_42015()) {
         if (!this.getBooleanValueByName("Haphe (AACAP)")) {
            ;
         }
      }
   }

   @EventListen
   @class_4249
   private void method_11336(class_1393 var1) {
      if (this.method_42015()) {
         if (!var1.method_6449()) {
            if (class_8865.method_40772() && mcInstance.field_9632.field_41726 && this.getBooleanValueByName("Haphe (AACAP)") && !mcInstance.field_9632.field_29654) {
               mcInstance.field_9632.method_26595();
            }

            if (!this.getBooleanValueByName("Haphe (AACAP)")) {
               if (!this.method_11333()) {
                  float var11 = 0.0F;

                  while (var11 < 0.7F && !this.method_11333()) {
                     var11 += 0.1F;
                  }
               }
            } else {
               this.method_11333();
            }
         } else {
            double var4 = mcInstance.field_9632.method_37309();
            if (!mcInstance.field_9632.field_29654 && this.getBooleanValueByName("Haphe (AACAP)")) {
               var4 = (double)this.field_12316;
            }

            class_1331 var6 = new class_1331(mcInstance.field_9632.method_37302(), (double)Math.round(var4 - 1.0), mcInstance.field_9632.method_37156());
            List var7 = this.method_11334(class_4783.field_23644, var6);
            if (!var7.isEmpty()) {
               class_7606 var8 = (class_7606)var7.get(var7.size() - 1);
               class_9529 var9 = class_7494.method_34079(this.field_12315, this.field_12313, 5.0F);
               if (!var9.method_43955().equals(var8.field_38725) || !var9.method_43956().equals(var8.field_38724)) {
                  float[] var10 = class_7494.method_34097(var8.field_38725, var8.field_38724);
                  this.field_12315 = class_7494.method_34097(var8.field_38725, var8.field_38724)[0];
                  this.field_12313 = class_7494.method_34097(var8.field_38725, var8.field_38724)[1];
               }
            }

            var1.method_6448(this.field_12313);
            var1.method_6441(this.field_12315);
         }
      }
   }

   @EventListen
   public void method_11340(class_2911 var1) {
      if (this.method_42015()) {
         if (this.method_42017().getStringValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.method_42017().getBooleanValueByName("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }
}
