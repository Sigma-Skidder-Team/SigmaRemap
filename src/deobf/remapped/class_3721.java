package remapped;

public class class_3721 extends class_367 {
   public boolean field_18223 = false;

   public class_3721() {
      super("BoatFly", "Fly with a boat", Category.MOVEMENT);
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
   }

   @EventListen
   public void method_17260(class_5596 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.method_37243() != null) {
            float var4 = class_8865.method_40785();
            float var5 = this.method_42002("Speed");
            double var6 = Math.cos(Math.toRadians((double)var4)) * (double)var5;
            double var8 = Math.sin(Math.toRadians((double)var4)) * (double)var5;
            if (!class_8865.method_40772()) {
               var6 = 0.0;
               var8 = 0.0;
            }

            Entity var10 = mcInstance.field_9632.method_37243();
            var10.field_41701 = mcInstance.field_9632.field_41701;
            var10.method_37214(var6, !mcInstance.field_9632.field_29654 ? (!this.field_18223 ? 0.0 : (double)(-var5)) : (double)var5, var8);
         }
      }
   }

   @EventListen
   private void method_17262(class_6435 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.method_37243() != null) {
            if (!mcInstance.field_9632.method_37243().field_41726) {
               if (var1.method_29384() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = true;
               }
            }
         }
      }
   }

   @EventListen
   private void method_17261(class_307 var1) {
      if (this.method_42015()) {
         if (this.field_18223 && var1.method_1364() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            this.field_18223 = false;
         }

         if (mcInstance.field_9632.method_37243() != null) {
            if (!mcInstance.field_9632.method_37243().field_41726) {
               if (var1.method_1364() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = false;
               }
            }
         }
      }
   }

   @Override
   public void method_42006() {
      if (!mcInstance.field_9577.field_45560.method_27060()) {
         if (!mcInstance.field_9577.field_45560.method_27060()) {
            this.field_18223 = false;
         }
      } else {
         mcInstance.field_9577.field_45560.field_30024 = false;
         this.field_18223 = true;
      }
   }

   @Override
   public void method_42020() {
      mcInstance.field_9577.field_45560.field_30024 = this.field_18223;
   }
}
