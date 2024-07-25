package remapped;

public class class_9740 extends Module {
   private int field_49494 = -1;
   private int field_49493;
   private int field_49495;

   public class_9740() {
      super(Category.PLAYER, "Basic", "Basic AutoGapple");
   }

   @Override
   public void onEnable() {
      this.field_49494 = -1;
      this.field_49495 = 20;
   }

   @EventListen
   public void method_44976(class_4996 var1) {
      if (this.method_42015()) {
         if (this.field_49494 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_44975(class_6435 var1) {
      if (this.method_42015()) {
         int var4 = mcInstance.gameOptions.hotbarKeys.length;

         for (int var5 = 0; var5 < var4; var5++) {
            class_5916 var6 = mcInstance.gameOptions.hotbarKeys[var5];
            String var7 = var6.method_27055();
            int var8 = Integer.parseInt(String.valueOf(var7.charAt(var7.length() - 1)));
            if (var1.method_29384() == var6.field_30027.field_17800 && var8 - 1 != mcInstance.field_9632.field_3853.field_36404) {
               this.field_49494 = -1;
               this.field_49495 = 0;
            }
         }
      }
   }

   @EventListen
   public void method_44977(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_49495 < 20) {
            this.field_49495++;
         }

         int var4 = -1;
         if (mcInstance.field_9632.method_26551() <= this.method_42017().getFloatValueByName("Health") * 2.0F) {
            var4 = ((class_6424)this.method_42017()).method_29349(false);
            if (this.field_49494 == -1 && this.field_49495 >= 20 && var4 != -1) {
               this.field_49494 = 0;
               this.field_49495 = 0;
            }
         }

         if (var4 >= 0 || this.field_49494 != -1) {
            if (this.field_49494 >= 0) {
               this.field_49494++;
               if (this.field_49494 != 1) {
                  if (this.field_49494 > 1
                     && mcInstance.field_9632.method_26617(class_2584.field_12791).method_27960() != class_4897.field_25037
                     && mcInstance.field_9632.method_26617(class_2584.field_12791).method_27960() != class_4897.field_24966) {
                     mcInstance.field_9632.field_3853.field_36404 = this.field_49493;
                     this.field_49493 = -1;
                     this.field_49494 = -1;
                  }
               } else {
                  this.field_49493 = mcInstance.field_9632.field_3853.field_36404;
                  mcInstance.field_9632.field_3853.field_36404 = var4;
                  mcInstance.field_9647.method_42129();
                  mcInstance.field_9647.method_42155(mcInstance.field_9632, mcInstance.field_9601, class_2584.field_12791);
               }
            }
         }
      }
   }

   @EventListen
   public void method_44978(class_139 var1) {
      if (this.method_42015() && this.field_49494 > 1) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_8163) {
            class_8163 var5 = (class_8163)var4;
            if (var5.method_37454() == mcInstance.field_9632.method_37145()) {
               for (class_9659 var7 : var5.method_37452()) {
                  class_7821 var8 = var7.method_44582();
                  if (var8.method_35423() == 14) {
                     mcInstance.field_9632.field_3853.field_36404 = this.field_49493;
                     this.field_49493 = -1;
                     this.field_49494 = -1;
                  }
               }
            }
         }
      }
   }
}
