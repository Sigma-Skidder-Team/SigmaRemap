package remapped;

import org.lwjgl.glfw.GLFW;

public class class_9844 extends Module {
   public int field_49843 = 0;
   private float field_49839;
   private float field_49840;
   private float field_49841;
   private boolean field_49845;
   public int field_49842 = 0;

   public class_9844() {
      super(class_5664.field_28716, "ElytraFly", "Better elytra flying");
      this.addSetting(new BooleanSetting("NCP", "Bypass NCP", true));
   }

   @class_9148
   public void method_45348(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.field_9577.field_45560.field_30024 = false;
         if (!(mcInstance.field_9632.method_37098().field_7333 < 0.08) || mcInstance.field_9632.field_41726) {
            mcInstance.field_9632.method_37220(7, false);
            if (mcInstance.field_9632.method_37252()) {
               this.method_41991(false);
            }
         } else if (!mcInstance.field_9632.method_26618()) {
            mcInstance.method_8614().method_4813(new class_2317(mcInstance.field_9632, class_4127.field_20093));
            mcInstance.field_9632.method_37220(7, true);
         }
      }
   }

   @class_9148
   public void method_45349(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = class_8865.method_40775();
         boolean var6 = class_314.method_1434();
         if (!this.method_42007("NCP") && mcInstance.field_9632.method_37252()) {
            var4 *= 2.5;
         }

         class_8865.method_40777(var1, 0.0);
         if (!mcInstance.field_9632.method_26618()) {
            this.field_49843 = 0;
         } else {
            if (this.field_49843 > 0) {
               if (this.field_49843 > 7) {
                  class_8865.method_40777(var1, var4 * 6.3F);
               }

               class_314.method_1408(-0.071);
               var1.method_35235(-1.0001E-4F);
            }

            this.field_49843++;
         }

         if (this.field_49840 > 1.0001E-4F && mcInstance.field_9632.field_29654) {
            class_8865.method_40777(var1, var4 * 6.3F);
            var1.method_35235((double)this.field_49840);
         }

         int var7 = GLFW.glfwGetKey(mcInstance.window.method_43181(), mcInstance.field_9577.field_45560.field_30027.field_17800);
         if (var7 == 1 && this.method_42007("NCP")) {
            var1.method_35235(-0.9F);
         } else if (!mcInstance.field_9632.method_37252()) {
            if (mcInstance.field_9632.field_29654 && !this.method_42007("NCP")) {
               var1.method_35235(1.4F);
            }
         } else {
            var1.method_35235(1.4F);
         }

         this.field_49840 = (float)((double)this.field_49840 * 0.85);
      }
   }

   @class_9148
   private void method_45346(class_139 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            Entity var5 = mcInstance.field_9601.method_29534(var4.method_21093());
            if (var5 instanceof class_8612) {
               class_8612 var6 = (class_8612)var5;
               if (var6.field_44173 != null && var6.field_44173.method_37145() == mcInstance.field_9632.method_37145()) {
                  this.field_49839 = this.field_49839 + (float)var4.field_22171 / 8000.0F;
                  this.field_49841 = this.field_49841 + (float)var4.field_22167 / 8000.0F;
                  this.field_49840 = this.field_49840 + (float)var4.field_22168 / 8000.0F;
                  this.field_49845 = true;
               }
            }
         }
      }
   }

   @class_9148
   private void method_45345(class_1393 var1) {
      if (this.method_42015()) {
         byte var4 = 65;
         if (this.field_49842 != var4 - 1) {
            if (this.field_49842 <= 0 && mcInstance.field_9632.field_29654) {
               this.field_49842 = var4;
            }
         } else {
            int var5 = class_2740.method_12336(class_4897.field_24479);
            if (var5 >= 0) {
               if (var5 != mcInstance.field_9632.field_3853.field_36404) {
                  mcInstance.method_8614().method_4813(new class_7371(var5));
               }

               mcInstance.method_8614().method_4813(new class_1022(class_2584.field_12791));
               if (var5 != mcInstance.field_9632.field_3853.field_36404) {
                  mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
               }
            }
         }

         if (this.field_49842 > 0) {
            var1.method_6448(-90.0F);
         }

         if (!mcInstance.field_9632.field_29654) {
            this.field_49842 = 0;
         }

         this.field_49842--;
      }
   }

   @class_9148
   @class_315
   private void method_45347(class_2157 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @class_9148
   private void method_45344(class_307 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @Override
   public void method_42006() {
      if (mcInstance.field_9632.field_41726) {
         class_314.method_1408(0.3994F);
      }
   }

   @Override
   public void method_42020() {
      if (!class_8865.method_40772()) {
         class_314.method_1463(0.0);
         class_314.method_1405(0.0);
      }
   }
}
