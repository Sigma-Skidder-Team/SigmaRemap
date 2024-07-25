package remapped;

import java.util.Iterator;

public class AGCFlyModule extends Module {
   private int field_6382;
   private int field_6384;
   private boolean field_6385;

   public AGCFlyModule() {
      super(Category.MOVEMENT, "AGC", "A fly for AntiGamingChair");
   }

   @Override
   public void onEnable() {
      this.field_6382 = 0;
      if (!mcInstance.field_9577.field_45560.method_27060()) {
         this.field_6385 = false;
      } else {
         mcInstance.field_9577.field_45560.field_30024 = false;
         this.field_6385 = true;
      }

      this.field_6384 = 1;
   }

   @EventListen
   private void method_4929(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_6385 = true;
         }
      }
   }

   @EventListen
   private void method_4930(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_6385 = false;
         }
      }
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (mcInstance.field_9632.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   @class_7664
   public void method_4931(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_6382 <= (this.field_6384 != 3 ? this.field_6384 : 1) - 2) {
            if (this.field_6382 == -1) {
               var1.method_35235(this.field_6384 != 3 ? 0.001 : 0.095);
               if (this.field_6384 != 3) {
                  class_8865.method_40777(var1, 0.32);
               }

               class_314.method_1408(var1.method_35236());
            }
         } else {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_4926(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_6382++;
         if (this.field_6382 != (this.field_6384 != 3 ? this.field_6384 : 1)) {
            if (this.field_6382 > (this.field_6384 != 3 ? this.field_6384 : 1)) {
               if (this.field_6382 % 20 != 0) {
                  var1.method_29715(true);
               } else {
                  double var4 = this.method_4927();
                  var1.method_6455(var4 - 1.0E-4);
                  var1.method_6444(true);
                  var1.method_6451(true);
               }
            }
         } else {
            double var6 = this.method_4927();
            var1.method_6455(var6 - 1.0E-4);
            var1.method_6451(true);
            var1.method_6444(true);
            this.field_6384 = !this.field_6385
               ? (!mcInstance.field_9577.field_45450.method_27060() ? 1 : 3)
               : (!mcInstance.field_9577.field_45450.method_27060() ? 2 : 1);
         }
      }
   }

   @EventListen
   public void method_4928(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_6382 >= (this.field_6384 != 3 ? this.field_6384 : 1)) {
               this.field_6382 = -1;
            }

            var5.field_3143 = mcInstance.field_9632.field_41701;
            var5.field_3140 = mcInstance.field_9632.field_41755;
         }
      }
   }

   private double method_4927() {
      if (!(mcInstance.field_9632.method_37245().field_7333 < 1.0)) {
         if (!mcInstance.field_9632.field_41726) {
            class_4092 var3 = mcInstance.field_9632.field_41712.method_18928(0.0, -mcInstance.field_9632.method_37245().field_7333, 0.0);
            Iterator var4 = mcInstance.field_9601.method_6680(mcInstance.field_9632, var3).iterator();
            double var5 = -1.0;
            class_1331 var7 = null;

            while (var4.hasNext()) {
               class_4190 var8 = (class_4190)var4.next();
               if (var8.method_19483().field_19939 > var5) {
                  var5 = var8.method_19483().field_19939;
                  var7 = new class_1331(var8.method_19483().field_19941, var8.method_19483().field_19937, var8.method_19483().field_19938);
               }
            }

            if (var7 != null) {
               class_6414 var9 = mcInstance.field_9601.method_28262(var7).method_8360();
               if (var9 instanceof class_163) {
                  var5 = (double)((int)var5) - 1.0E-4;
               }
            }

            return var5;
         } else {
            return mcInstance.field_9632.method_37309();
         }
      } else {
         return -1.0;
      }
   }
}
