package remapped;

public abstract class class_9506 extends class_5783 {
   public class_9506(EntityType<? extends class_9506> var1, World var2) {
      super(var1, var2);
   }

   public class_9506(EntityType<? extends class_9506> var1, double var2, double var4, double var6, World var8) {
      this(var1, var8);
      this.method_37256(var2, var4, var6);
   }

   public class_9506(EntityType<? extends class_9506> var1, LivingEntity var2, World var3) {
      this(var1, var2.getPosX(), var2.method_37388() - 0.1F, var2.getPosZ(), var3);
      this.method_26159(var2);
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = this.getBoundingBox().method_18906() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      class_7474 var3 = class_8462.method_38935(this, this::method_26164);
      boolean var4 = false;
      if (var3.method_33990() == class_1430.field_7717) {
         BlockPos var5 = ((class_9529)var3).method_43955();
         class_2522 var13 = this.world.method_28262(var5);
         if (!var13.method_8350(class_4783.field_23588)) {
            if (var13.method_8350(class_4783.field_23824)) {
               class_3757 var14 = this.world.method_28260(var5);
               if (var14 instanceof class_5555 && class_5555.method_25250(this)) {
                  ((class_5555)var14).method_25252(this);
               }

               var4 = true;
            }
         } else {
            this.method_37213(var5);
            var4 = true;
         }
      }

      if (var3.method_33990() != class_1430.field_7721 && !var4) {
         this.method_26160(var3);
      }

      this.method_37097();
      class_1343 var17 = this.method_37098();
      double var6 = this.getPosX() + var17.field_7336;
      double var8 = this.method_37309() + var17.field_7333;
      double var10 = this.getPosZ() + var17.field_7334;
      this.method_26167();
      float var12;
      if (!this.method_37285()) {
         var12 = 0.99F;
      } else {
         for (int var15 = 0; var15 < 4; var15++) {
            float var16 = 0.25F;
            this.world
               .method_43361(
                  class_3090.field_15340,
                  var6 - var17.field_7336 * 0.25,
                  var8 - var17.field_7333 * 0.25,
                  var10 - var17.field_7334 * 0.25,
                  var17.field_7336,
                  var17.field_7333,
                  var17.field_7334
               );
         }

         var12 = 0.8F;
      }

      this.method_37215(var17.method_6209((double)var12));
      if (!this.method_37078()) {
         class_1343 var18 = this.method_37098();
         this.method_37214(var18.field_7336, var18.field_7333 - (double)this.method_43874(), var18.field_7334);
      }

      this.method_37256(var6, var8, var10);
   }

   public float method_43874() {
      return 0.03F;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
