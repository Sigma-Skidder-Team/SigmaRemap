package remapped;

public class class_6592 extends class_9128 {
   public float field_34011 = 3.0F;
   public int field_34012 = 0;

   public class_6592() {
      super(class_5664.field_28716, "EntitySpeed", "Speed up your rideable entities");
   }

   @Override
   public void method_42006() {
   }

   @class_9148
   public void method_30357(class_5088 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9577.field_45450.method_27060() && !field_46692.field_9632.method_37243().field_41726) {
         }

         class_8859 var4 = field_46692.field_9632.field_30533;
         float var5 = var4.field_45287;
         float var6 = var4.field_45282;
         if (!field_46692.field_9632.method_37243().field_41744
            && !field_46692.field_9632.method_37243().field_41726
            && class_314.method_1413(field_46692.field_9632.method_37243(), 5.0F)
            && !field_46692.field_9632.method_37243().method_37285()
            && field_46692.field_9601.method_28262(field_46692.field_9632.method_37243().method_37075()).method_8360() != class_4783.field_23900) {
            var1.method_23388(-2.0);
         }

         if (field_46692.field_9632.method_37243().method_37285()) {
            if (field_46692.field_9632.method_37243().field_41744) {
               var1.method_23388(-1.0);
            } else {
               double var13 = Math.floor(field_46692.field_9632.method_37243().method_37309())
                  + 0.7725465413369861
                  - field_46692.field_9632.method_37243().method_37309();
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
            if (field_46692.field_9632.method_37243() instanceof class_3551) {
               class_3551 var15 = (class_3551)field_46692.field_9632.method_37243();
               if (var15.field_41726 && field_46692.field_9577.field_45450.method_27060()) {
                  field_46692.field_9632.field_30501 = 1.0F;
               }
            }

            var1.method_23385(var8 * (double)var12);
            var1.method_23389(var10 * (double)var12);
            if (this.field_34012 < 2 || !field_46692.field_9632.method_37243().field_41726) {
               field_46692.field_9632.method_37243().field_41733 = 0.0F;
            }
         }
      }
   }

   @class_9148
   public void method_30358(class_139 var1) {
      if (this.method_42015()) {
         if (!(var1.method_557() instanceof class_3931)) {
         }
      }
   }

   @class_9148
   public void method_30359(class_2157 var1) {
      if (var1.method_10047() instanceof class_4148
         && field_46692.field_9632.method_37243() != null
         && this.field_34012++ > 2
         && field_46692.field_9632.method_37243().field_41726) {
         field_46692.field_9632.method_37243().field_41733 = 1.0F;
      }
   }

   @class_9148
   public void method_30360(class_7247 var1) {
      field_46692.field_9632.method_37243().field_41733 = 0.0F;
      this.field_34012 = 0;
   }
}
