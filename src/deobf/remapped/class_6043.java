package remapped;

public abstract class class_6043 extends class_6165 {
   public final class_8829 field_30852;
   private boolean field_30853;

   public class_6043(class_8829 var1, SoundEvent var2, class_562 var3) {
      super(var2, var3);
      this.field_30852 = var1;
      this.field_5761 = (double)((float)var1.getPosX());
      this.field_5765 = (double)((float)var1.method_37309());
      this.field_5762 = (double)((float)var1.getPosZ());
      this.field_5768 = true;
      this.field_5764 = 0;
      this.field_5766 = 0.0F;
   }

   @Override
   public void method_29511() {
      boolean var3 = this.method_27593();
      if (var3 && !this.method_29512()) {
         MinecraftClient.getInstance().getSoundHandler().method_16351(this.method_27592());
         this.field_30853 = true;
      }

      if (!this.field_30852.removed && !this.field_30853) {
         this.field_5761 = (double)((float)this.field_30852.getPosX());
         this.field_5765 = (double)((float)this.field_30852.method_37309());
         this.field_5762 = (double)((float)this.field_30852.getPosZ());
         float var4 = MathHelper.sqrt(Entity.method_37266(this.field_30852.method_37098()));
         if (!((double)var4 >= 0.01)) {
            this.field_5773 = 0.0F;
            this.field_5766 = 0.0F;
         } else {
            this.field_5773 = MathHelper.lerp(
               MathHelper.clamp(var4, this.method_27591(), this.method_27590()), this.method_27591(), this.method_27590()
            );
            this.field_5766 = MathHelper.lerp(MathHelper.clamp(var4, 0.0F, 0.5F), 0.0F, 1.2F);
         }
      } else {
         this.method_28267();
      }
   }

   private float method_27591() {
      return !this.field_30852.method_26449() ? 0.7F : 1.1F;
   }

   private float method_27590() {
      return !this.field_30852.method_26449() ? 1.1F : 1.5F;
   }

   @Override
   public boolean method_16558() {
      return true;
   }

   @Override
   public boolean method_16554() {
      return !this.field_30852.method_37378();
   }

   public abstract class_6165 method_27592();

   public abstract boolean method_27593();
}
