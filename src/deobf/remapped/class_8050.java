package remapped;

public class class_8050 extends class_9335 {
   private static String[] field_41217;

   public class_8050(class_5542 var1) {
      this.field_41216 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_41216.method_25170()) {
         class_5834 var3 = this.field_41216.method_17809();
         if (var3 != null && var3.isAlive()) {
            if (var3.method_37235() == var3.method_37365()) {
               boolean var4 = class_5542.method_25207(this.field_41216, var3);
               if (!var4) {
                  this.field_41216.method_26927().method_5598(var3, 0);
                  this.field_41216.method_25168(false);
                  this.field_41216.method_25181(false);
               }

               return var4;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      class_5834 var3 = this.field_41216.method_17809();
      if (var3 != null && var3.isAlive()) {
         double var4 = this.field_41216.method_37098().field_7333;
         return (!(var4 * var4 < 0.05F) || !(Math.abs(this.field_41216.field_41755) < 15.0F) || !this.field_41216.field_41726)
            && !this.field_41216.method_25212();
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16801() {
      return false;
   }

   @Override
   public void method_16796() {
      this.field_41216.method_26528(true);
      this.field_41216.method_25171(true);
      this.field_41216.method_25181(false);
      class_5834 var3 = this.field_41216.method_17809();
      this.field_41216.method_26865().method_17240(var3, 60.0F, 30.0F);
      class_1343 var4 = new class_1343(
            var3.getPosX() - this.field_41216.method_37302(),
            var3.method_37309() - this.field_41216.method_37309(),
            var3.getPosZ() - this.field_41216.method_37156()
         )
         .method_6213();
      this.field_41216.method_37215(this.field_41216.method_37098().method_6214(var4.field_7336 * 0.8, 0.9, var4.field_7334 * 0.8));
      this.field_41216.method_26927().method_5620();
   }

   @Override
   public void method_16793() {
      this.field_41216.method_25168(false);
      class_5542.method_25178(this.field_41216, 0.0F);
      class_5542.method_25210(this.field_41216, 0.0F);
      this.field_41216.method_25181(false);
      this.field_41216.method_25171(false);
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_41216.method_17809();
      if (var3 != null) {
         this.field_41216.method_26865().method_17240(var3, 60.0F, 30.0F);
      }

      if (!this.field_41216.method_25212()) {
         class_1343 var4 = this.field_41216.method_37098();
         if (var4.field_7333 * var4.field_7333 < 0.03F && this.field_41216.field_41755 != 0.0F) {
            this.field_41216.field_41755 = class_9299.method_42833(this.field_41216.field_41755, 0.0F, 0.2F);
         } else {
            double var5 = Math.sqrt(Entity.method_37266(var4));
            double var7 = Math.signum(-var4.field_7333) * Math.acos(var5 / var4.method_6217()) * 180.0F / (float)Math.PI;
            this.field_41216.field_41755 = (float)var7;
         }
      }

      if (var3 != null && this.field_41216.method_37175(var3) <= 2.0F) {
         this.field_41216.method_26442(var3);
      } else if (this.field_41216.field_41755 > 0.0F
         && this.field_41216.field_41726
         && (float)this.field_41216.method_37098().field_7333 != 0.0F
         && this.field_41216.field_41768.method_28262(this.field_41216.method_37075()).method_8350(class_4783.field_23552)) {
         this.field_41216.field_41755 = 60.0F;
         this.field_41216.method_26860((class_5834)null);
         class_5542.method_25203(this.field_41216, true);
      }
   }
}
