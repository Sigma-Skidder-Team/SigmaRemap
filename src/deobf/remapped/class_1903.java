package remapped;

public class class_1903 extends Module {
   private int field_9716;
   private boolean field_9713;
   private double field_9715;

   public class_1903() {
      super(class_5664.field_28716, "Hypixel", "Highjump for Hypixel");
      this.method_42010(new class_2748<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
   }

   @Override
   public void method_42006() {
      this.field_9716 = -1;
      this.field_9713 = false;
      this.field_9715 = 999.0;
   }

   @class_9148
   public void method_8648(class_7767 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (mcInstance.field_9632.field_41706 > 3.0F + this.method_42002("Motion") * 4.0F && var1.method_35236() < -0.3) {
            if (this.field_9713) {
               if (mcInstance.field_9632.method_37309() + var1.method_35236() < this.field_9715) {
                  var1.method_35235(this.field_9715 - mcInstance.field_9632.method_37309());
                  this.field_9713 = false;
               }
            } else {
               this.field_9716 = 0;
            }
         }

         if (this.field_9716 >= 0) {
            this.field_9716++;
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
            var1.method_35235((double)this.method_42002("Motion"));
            this.field_9713 = true;
            this.field_9715 = mcInstance.field_9632.method_37309();
            this.field_9716 = -1;
         }

         if (this.field_9713 && class_314.method_1413(mcInstance.field_9632, 0.001F)) {
            this.field_9713 = !this.field_9713;
         }

         class_314.method_1408(var1.method_35236());
      }
   }

   @class_9148
   public void method_8649(class_1393 var1) {
      if (this.method_42015()) {
         if (this.field_9716 >= 0) {
            var1.method_6444(true);
         }
      }
   }
}
