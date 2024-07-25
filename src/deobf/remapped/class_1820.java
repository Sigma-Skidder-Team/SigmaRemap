package remapped;

public abstract class class_1820 extends class_3599 {
   public class_5886 field_9241;
   public BlockPos field_9240 = BlockPos.field_7306;
   public boolean field_9242;
   private boolean field_9239;
   private float field_9238;
   private float field_9237;

   public class_1820(class_5886 var1) {
      this.field_9241 = var1;
      if (!class_3613.method_16840(var1)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   public boolean method_8057() {
      if (this.field_9242) {
         class_2522 var3 = this.field_9241.world.method_28262(this.field_9240);
         if (var3.method_8360() instanceof class_4115) {
            return var3.<Boolean>method_10313(class_4115.field_20051);
         } else {
            this.field_9242 = false;
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_8058(boolean var1) {
      if (this.field_9242) {
         class_2522 var4 = this.field_9241.world.method_28262(this.field_9240);
         if (var4.method_8360() instanceof class_4115) {
            ((class_4115)var4.method_8360()).method_19110(this.field_9241.world, var4, this.field_9240, var1);
         }
      }
   }

   @Override
   public boolean method_16795() {
      if (class_3613.method_16840(this.field_9241)) {
         if (this.field_9241.field_41744) {
            class_8985 var3 = (class_8985)this.field_9241.method_26927();
            class_3998 var4 = var3.method_5594();
            if (var4 != null && !var4.method_18436() && var3.method_41200()) {
               for (int var5 = 0; var5 < Math.min(var4.method_18429() + 2, var4.method_18437()); var5++) {
                  class_5851 var6 = var4.method_18447(var5);
                  this.field_9240 = new BlockPos(var6.field_29731, var6.field_29735 + 1, var6.field_29736);
                  if (!(
                     this.field_9241
                           .method_37273((double)this.field_9240.method_12173(), this.field_9241.method_37309(), (double)this.field_9240.method_12185())
                        > 2.25
                  )) {
                     this.field_9242 = class_4115.method_19107(this.field_9241.world, this.field_9240);
                     if (this.field_9242) {
                        return true;
                     }
                  }
               }

               this.field_9240 = this.field_9241.method_37075().method_6081();
               this.field_9242 = class_4115.method_19107(this.field_9241.world, this.field_9240);
               return this.field_9242;
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
      return !this.field_9239;
   }

   @Override
   public void method_16796() {
      this.field_9239 = false;
      this.field_9238 = (float)((double)this.field_9240.method_12173() + 0.5 - this.field_9241.method_37302());
      this.field_9237 = (float)((double)this.field_9240.method_12185() + 0.5 - this.field_9241.method_37156());
   }

   @Override
   public void method_16794() {
      float var3 = (float)((double)this.field_9240.method_12173() + 0.5 - this.field_9241.method_37302());
      float var4 = (float)((double)this.field_9240.method_12185() + 0.5 - this.field_9241.method_37156());
      float var5 = this.field_9238 * var3 + this.field_9237 * var4;
      if (var5 < 0.0F) {
         this.field_9239 = true;
      }
   }
}
