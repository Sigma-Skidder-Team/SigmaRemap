package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_3854 extends Module {
   private short field_18796;
   private double field_18795;
   private float field_18794;
   private boolean field_18798;
   private int field_18800;
   private Timer field_18799;
   private List<Short> field_18793 = new ArrayList<Short>();

   public class_3854() {
      super(Category.MOVEMENT, "Hypixel", "Fly for Hypixel");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Fast", "NoDmg", "Funcraft").method_12861("Fast"));
      this.addSetting(new FloatSetting<Float>("Speed", "Fast and Funcraft speed", 1.0F, Float.class, 0.0F, 1.0F, 0.1F));
      this.addSetting(new BooleanSetting("No Collision", "Prevents block collison.", true));
      this.addSetting(new FloatSetting<Float>("Timer Boost", "Boost strength", 2.5F, Float.class, 1.0F, 3.0F, 0.1F));
      this.addSetting(new FloatSetting<Float>("Timer Duration", "Boost duration", 0.3F, Float.class, 0.1F, 1.0F, 0.01F));
   }

   @Override
   public void onEnable() {
      String var3 = this.getStringValueByName("Mode");
      this.field_18794 = 1.0F;
      this.field_18800 = -1;
      if (mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.001F)) {
         this.field_18794 = this.getFloatValueByName("Timer Boost");
      }

      if (mcInstance.field_9632.field_41726) {
         switch (var3) {
            case "Basic":
               this.field_18795 = 0.0;
               this.field_18798 = true;
               break;
            case "Fast":
               class_314.method_1450(false);
               this.field_18798 = true;
               break;
            case "NoDmg":
               this.field_18798 = true;
               break;
            case "Funcraft":
               this.field_18798 = true;
         }

         this.field_18800 = 0;
      } else {
         this.field_18795 = 0.0;
         this.field_18798 = false;
      }
   }

   @Override
   public void onDisable() {
      double var3 = class_8865.method_40775();
      class_8865.method_40776(var3 * 0.7);
      this.field_18794 = 1.0F;
      mcInstance.field_9616.field_32603 = 1.0F;
      this.field_18800 = -1;
   }

   @EventListen
   @class_3932
   public void method_17885(class_717 var1) {
      this.field_18796 = 0;
      this.field_18799 = new Timer();
      this.field_18793 = null;
   }

   @EventListen
   @class_4249
   @class_3932
   public void method_17886(class_2157 var1) {
      if (class_314.method_1387()) {
         class_6310 var4 = var1.method_10047();
         if (var4 instanceof class_5955) {
            class_5955 var5 = (class_5955)var4;
            this.field_18796 = var5.method_27203();
         }
      }
   }

   @EventListen
   @class_3932
   @class_5355
   public void method_17884(class_139 var1) {
      if (mcInstance.method_8614() != null && class_314.method_1387()) {
         class_6310 var4 = var1.method_557();
         if (this.method_42015()) {
            if (var4 instanceof class_509) {
               this.method_42017().method_41999();
            }
         }
      }
   }

   @EventListen
   @class_3932
   public void method_17887(class_5596 var1) {
   }

   @EventListen
   public void method_17888(class_1393 var1) {
      if (var1.method_6449()) {
         for (double var7 : class_314.method_1466()) {
            if ((double)((int)var1.method_6454()) - var1.method_6454() + var7 == 0.0) {
               var1.method_6451(true);
               break;
            }
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_17889(class_7767 var1) {
      String var4 = this.getStringValueByName("Mode");
      float var5 = this.getFloatValueByName("Timer Boost");
      this.field_18794 = (float)((double)this.field_18794 - 0.01);
      if (this.field_18794 < var5 - this.getFloatValueByName("Timer Duration") || this.field_18794 < 1.0F) {
         this.field_18794 = 1.0F;
      }

      if (!SigmaMainClass.method_3328().getModuleManager().method_847(class_6803.class).method_42015()) {
         mcInstance.field_9616.field_32603 = this.field_18794;
      }

      if (this.field_18798) {
         double var28 = 0.64 - Math.random() * 1.0E-10;
         if (var4.equals("Funcraft")) {
            var28 -= 0.04;
         }

         switch (var4) {
            case "Basic":
               this.field_18798 = !this.field_18798;
               break;
            case "Fast":
               var1.method_35235(class_8865.method_40786());
               class_8865.method_40777(var1, var28);
               this.field_18798 = !this.field_18798;
               this.field_18795 = 0.51 + (double)this.getFloatValueByName("Speed") + 0.015 * (double)class_8865.method_40770();
               break;
            case "NoDmg":
               var1.method_35235(class_8865.method_40786());
               class_8865.method_40777(var1, var28);
               this.field_18798 = !this.field_18798;
               this.field_18795 = var28 * 0.987;
               break;
            case "Funcraft":
               var1.method_35235(class_8865.method_40786());
               class_8865.method_40777(var1, var28);
               this.field_18798 = !this.field_18798;
               this.field_18795 = 0.51 + (double)this.getFloatValueByName("Speed");
         }
      } else {
         if (var4.equals("NoDmg") && this.field_18800 > 20) {
            this.field_18795 = 0.0;
         }

         double var6 = 0.99375 - (double)this.field_18800 * 1.0E-13;
         this.field_18795 *= var6;
         if (mcInstance.field_9632.field_41744 || mcInstance.field_9632.field_41774) {
            this.field_18795 = 0.0;
         }

         double var10 = var4.equals("Basic") ? class_8865.method_40767() : class_8865.method_40767() - 0.008;
         if (this.field_18795 < var10) {
            this.field_18795 = var10;
         } else if (!class_314.method_1434()) {
            this.field_18795 = var10;
         }

         class_8865.method_40777(var1, this.field_18795);
         if (!mcInstance.field_9632.field_41726 || !class_314.method_1413(mcInstance.field_9632, 0.001F)) {
            this.field_18800++;
            var1.method_35235(0.0);
            class_314.method_1408(0.0);
            if (this.field_18800 % 5 < 4) {
               double var12 = mcInstance.field_9632.method_37302();
               double var14 = mcInstance.field_9632.method_37309();
               double var16 = mcInstance.field_9632.method_37156();
               mcInstance.field_9632.method_37256(var12, var14 + 1.0E-14, var16);
            }
         }

         class_1343 var18 = mcInstance.field_9632.method_37287(var1.method_35233().method_6214(0.0, -var1.method_35233().method_60(), 0.0));
         double var19 = Math.abs(Math.sqrt(var18.method_6221()) - this.field_18795);
         boolean var21 = var19 < 1.0E-4;
         if (this.getBooleanValueByName("No Collision") && this.field_18795 > var10) {
            ArrayList var22 = new ArrayList();
            float var23 = class_9299.method_42810(class_8865.method_40785());
            if (var23 > 0.0F && var23 < 90.0F) {
               var22.add(new class_1343(1.0, 0.0, 0.0));
               var22.add(new class_1343(0.0, 0.0, 1.0));
               var22.add(new class_1343(0.0, 0.0, -1.0));
               var22.add(new class_1343(-1.0, 0.0, 0.0));
            } else if (var23 > 90.0F && var23 < 180.0F) {
               var22.add(new class_1343(0.0, 0.0, 1.0));
               var22.add(new class_1343(-1.0, 0.0, 0.0));
               var22.add(new class_1343(0.0, 0.0, -1.0));
               var22.add(new class_1343(1.0, 0.0, 0.0));
            } else if (var23 > -180.0F && var23 < -90.0F) {
               var22.add(new class_1343(0.0, 0.0, -1.0));
               var22.add(new class_1343(-1.0, 0.0, 0.0));
               var22.add(new class_1343(1.0, 0.0, 0.0));
               var22.add(new class_1343(0.0, 0.0, 1.0));
            } else {
               var22.add(new class_1343(0.0, 0.0, -1.0));
               var22.add(new class_1343(1.0, 0.0, 0.0));
               var22.add(new class_1343(0.0, 0.0, 1.0));
               var22.add(new class_1343(-1.0, 0.0, 0.0));
            }

            var1.method_35230(var18);
            if (!var21 && mcInstance.field_9632.method_37309() % 1.0 > 0.1F && class_8865.method_40772()) {
               for (class_1343 var25 : var22) {
                  var25.field_7336 = var25.field_7336 * this.field_18795;
                  var25.field_7334 = var25.field_7334 * this.field_18795;
                  double var26 = Math.abs(Math.sqrt(mcInstance.field_9632.method_37287(var25).method_6221()) - this.field_18795);
                  var21 = var26 < 1.0E-4;
                  if (var21) {
                     var1.method_35230(var25);
                     break;
                  }
               }
            }
         }

         if (mcInstance.field_9577.field_45450.field_30024) {
            var1.method_35235(0.25);
         }
      }
   }
}
