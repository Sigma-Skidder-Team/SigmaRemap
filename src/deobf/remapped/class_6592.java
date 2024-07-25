package remapped;

public class class_6592 extends Module {
   public float field_34011 = 3.0F;
   public int field_34012 = 0;

   public class_6592() {
      super(Category.MOVEMENT, "EntitySpeed", "Speed up your rideable entities");
   }

   @Override
   public void onEnable() {
   }

   @EventListen
   public void method_30357(class_5088 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9577.field_45450.method_27060() && !mcInstance.field_9632.method_37243().field_41726) {
         }

         class_8859 var4 = mcInstance.field_9632.field_30533;
         float var5 = var4.field_45287;
         float var6 = var4.field_45282;
         if (!mcInstance.field_9632.method_37243().field_41744
            && !mcInstance.field_9632.method_37243().field_41726
            && class_314.method_1413(mcInstance.field_9632.method_37243(), 5.0F)
            && !mcInstance.field_9632.method_37243().method_37285()
            && mcInstance.field_9601.method_28262(mcInstance.field_9632.method_37243().method_37075()).method_8360() != class_4783.field_23900) {
            var1.method_23388(-2.0);
         }

         if (mcInstance.field_9632.method_37243().method_37285()) {
            if (mcInstance.field_9632.method_37243().field_41744) {
               var1.method_23388(-1.0);
            } else {
               double var13 = Math.floor(mcInstance.field_9632.method_37243().method_37309())
                  + 0.7725465413369861
                  - mcInstance.field_9632.method_37243().method_37309();
               var1.method_23388(var13 / 2.0);
            }
         }

         if (var5 == 0.0F && var6 == 0.0F) {
            var1.method_23385(0.0);
            var1.method_23389(0.0);
         } else {
            float var7 = class_8865.method_40785();
            double var8 = Math.cos(Math.toRadians((double)var7));
            double var10 = Math.sin(Math.toRadians((double)var7));
            this.field_34011 = 2.75F;
            float var12 = this.field_34011;
            if (mcInstance.field_9632.method_37243() instanceof class_3551) {
               class_3551 var15 = (class_3551) mcInstance.field_9632.method_37243();
               if (var15.field_41726 && mcInstance.field_9577.field_45450.method_27060()) {
                  mcInstance.field_9632.field_30501 = 1.0F;
               }
            }

            var1.method_23385(var8 * (double)var12);
            var1.method_23389(var10 * (double)var12);
            if (this.field_34012 < 2 || !mcInstance.field_9632.method_37243().field_41726) {
               mcInstance.field_9632.method_37243().field_41733 = 0.0F;
            }
         }
      }
   }

   @EventListen
   public void method_30358(class_139 var1) {
      if (this.method_42015()) {
         if (!(var1.method_557() instanceof class_3931)) {
         }
      }
   }

   @EventListen
   public void method_30359(class_2157 var1) {
      if (var1.method_10047() instanceof class_4148
         && mcInstance.field_9632.method_37243() != null
         && this.field_34012++ > 2
         && mcInstance.field_9632.method_37243().field_41726) {
         mcInstance.field_9632.method_37243().field_41733 = 1.0F;
      }
   }

   @EventListen
   public void method_30360(class_7247 var1) {
      mcInstance.field_9632.method_37243().field_41733 = 0.0F;
      this.field_34012 = 0;
   }
}
