package remapped;

public class class_3721 extends class_367 {
   public boolean field_18223 = false;

   public class_3721() {
      super("BoatFly", "Fly with a boat", class_5664.field_28716);
      this.method_42010(new class_2748<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
   }

   @class_9148
   public void method_17260(class_5596 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.method_37243() != null) {
            float var4 = class_8865.method_40785();
            float var5 = this.method_42002("Speed");
            double var6 = Math.cos(Math.toRadians((double)var4)) * (double)var5;
            double var8 = Math.sin(Math.toRadians((double)var4)) * (double)var5;
            if (!class_8865.method_40772()) {
               var6 = 0.0;
               var8 = 0.0;
            }

            Entity var10 = field_46692.field_9632.method_37243();
            var10.field_41701 = field_46692.field_9632.field_41701;
            var10.method_37214(var6, !field_46692.field_9632.field_29654 ? (!this.field_18223 ? 0.0 : (double)(-var5)) : (double)var5, var8);
         }
      }
   }

   @class_9148
   private void method_17262(class_6435 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.method_37243() != null) {
            if (!field_46692.field_9632.method_37243().field_41726) {
               if (var1.method_29384() == field_46692.field_9577.field_45560.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = true;
               }
            }
         }
      }
   }

   @class_9148
   private void method_17261(class_307 var1) {
      if (this.method_42015()) {
         if (this.field_18223 && var1.method_1364() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            this.field_18223 = false;
         }

         if (field_46692.field_9632.method_37243() != null) {
            if (!field_46692.field_9632.method_37243().field_41726) {
               if (var1.method_1364() == field_46692.field_9577.field_45560.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = false;
               }
            }
         }
      }
   }

   @Override
   public void method_42006() {
      if (!field_46692.field_9577.field_45560.method_27060()) {
         if (!field_46692.field_9577.field_45560.method_27060()) {
            this.field_18223 = false;
         }
      } else {
         field_46692.field_9577.field_45560.field_30024 = false;
         this.field_18223 = true;
      }
   }

   @Override
   public void method_42020() {
      field_46692.field_9577.field_45560.field_30024 = this.field_18223;
   }
}
