package remapped;

import java.util.ArrayList;

public class NCPStep extends Module {
   private float field_49101;
   private ArrayList<Packet<?>> field_49102 = new ArrayList<Packet<?>>();
   private int field_49103;

   public NCPStep() {
      super(Category.MOVEMENT, "NCP", "Step for NCP");
      this.addSetting(new FloatSetting<Float>("Maximum heigh", "Maximum heigh", 2.0F, Float.class, 1.0F, 2.5F, 0.5F));
      this.addSetting(new FloatSetting<Float>("Timer", "Timer speed", 0.1F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @Override
   public void onEnable() {
      this.field_49101 = -1.0F;
      this.field_49103 = 0;
   }

   @EventListen
   private void method_44492(class_717 var1) {
      this.field_49103 = 0;
      this.field_49102.clear();
   }

   @EventListen
   @class_7664
   private void method_44493(class_8544 var1) {
      if (this.isEnabled() && !var1.method_29716()) {
         double var4 = var1.method_39326();
         if (class_314.method_1413(client.thePlayer, 1.0E-4F) && !class_8865.method_40771()) {
            if (var4 >= 0.625) {
               double var6 = client.thePlayer.getPosX();
               double var8 = client.thePlayer.method_37309();
               double var10 = client.thePlayer.getPosZ();
               this.field_49103 = 1;
               if (!(var4 < 1.1)) {
                  if (!(var4 < 1.6)) {
                     if (!(var4 < 2.1)) {
                        double[] var21 = new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.907};
                        float var24 = 1.0F / (float)(var21.length + 1);
                        this.field_49101 = var24 + (1.0F - var24) * this.getFloatValueByName("Timer");

                        for (double var36 : var21) {
                           this.field_49102.add(new class_9515(var6, var8 + var36, var10, false));
                        }
                     } else {
                        double[] var20 = new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869};
                        float var23 = 1.0F / (float)(var20.length + 1);
                        this.field_49101 = var23 + (1.0F - var23) * this.getFloatValueByName("Timer");

                        for (double var35 : var20) {
                           if (var35 - 0.027 <= var4) {
                              this.field_49102.add(new class_9515(var6, var8 + var35, var10, false));
                           }
                        }
                     }
                  } else {
                     double[] var19 = new double[]{0.41999998, 0.7531999805212, 1.01, 1.093, 1.015};
                     float var22 = 1.0F / (float)(var19.length + 1);
                     this.field_49101 = var22 + (1.0F - var22) * this.getFloatValueByName("Timer");

                     for (double var34 : var19) {
                        this.field_49102.add(new class_9515(var6, var8 + var34, var10, false));
                     }
                  }
               } else {
                  double[] var12 = new double[]{0.41999998688698 * var4, 0.7531999805212 * var4};
                  float var13 = 1.0F / (float)(var12.length + 1);
                  this.field_49101 = var13 + (1.0F - var13) * this.getFloatValueByName("Timer");

                  for (double var17 : var12) {
                     this.field_49102.add(new class_9515(var6, var8 + var17, var10, false));
                  }
               }

               client.theTimer.timerSpeed = this.field_49101;
            }
         } else {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   private void method_44491(class_7982 var1) {
      if (this.isEnabled() && client.thePlayer != null) {
         if (this.field_49103 > 0) {
            this.field_49103--;
         }

         if (!var1.method_36184()) {
            client.thePlayer.field_41733 = this.getFloatValueByName("Maximum heigh");
         } else {
            client.thePlayer.field_41733 = 0.5F;
            if (this.field_49101 != -1.0F) {
               this.field_49101 = -1.0F;
               client.theTimer.timerSpeed = 1.0F;
            }
         }
      }
   }

   @EventListen
   private void method_44490(class_2157 var1) {
      if (var1.method_10047() instanceof class_4609 && !this.field_49102.isEmpty()) {
         this.field_49102.add(var1.method_10047());
         var1.method_29715(true);
         if (this.field_49103 == 0) {
            for (Packet var5 : this.field_49102) {
               client.method_8614().method_9091().method_23481(var5);
            }

            this.field_49102.clear();
         }
      }
   }
}
