package remapped;

public abstract class class_4612 extends MobEntity {
   public class_4612(EntityType<? extends class_4612> var1, World var2) {
      super(var1, var2);
   }

   public float method_21375(BlockPos var1) {
      return this.method_21376(var1, this.world);
   }

   public float method_21376(BlockPos var1, class_4924 var2) {
      return 0.0F;
   }

   @Override
   public boolean method_26889(class_9379 var1, class_2417 var2) {
      return this.method_21376(this.method_37075(), var1) >= 0.0F;
   }

   public boolean method_21379() {
      return !this.method_26927().method_5591();
   }

   @Override
   public void method_26921() {
      super.method_26921();
      Entity var3 = this.method_26922();
      if (var3 != null && var3.world == this.world) {
         this.method_26843(var3.method_37075(), 5);
         float var4 = this.method_37175(var3);
         if (this instanceof class_8990 && ((class_8990)this).method_41209()) {
            if (var4 > 10.0F) {
               this.method_26916(true, true);
            }

            return;
         }

         this.method_21377(var4);
         if (!(var4 > 10.0F)) {
            if (!(var4 > 6.0F)) {
               this.goalSelector.method_3491(Flag.MOVE);
               float var5 = 2.0F;
               class_1343 var6 = new class_1343(
                     var3.getPosX() - this.getPosX(), var3.method_37309() - this.method_37309(), var3.getPosZ() - this.getPosZ()
                  )
                  .method_6213()
                  .method_6209((double)Math.max(var4 - 2.0F, 0.0F));
               this.method_26927()
                  .method_5595(
                     this.getPosX() + var6.field_7336, this.method_37309() + var6.field_7333, this.getPosZ() + var6.field_7334, this.method_21378()
                  );
            } else {
               double var7 = (var3.getPosX() - this.getPosX()) / (double)var4;
               double var9 = (var3.method_37309() - this.method_37309()) / (double)var4;
               double var11 = (var3.getPosZ() - this.getPosZ()) / (double)var4;
               this.method_37215(
                  this.method_37098()
                     .method_6214(Math.copySign(var7 * var7 * 0.4, var7), Math.copySign(var9 * var9 * 0.4, var9), Math.copySign(var11 * var11 * 0.4, var11))
               );
            }
         } else {
            this.method_26916(true, true);
            this.goalSelector.method_3487(Flag.MOVE);
         }
      }
   }

   public double method_21378() {
      return 1.0;
   }

   public void method_21377(float var1) {
   }
}
