package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class Class2616 extends Class2612 {
   private static String[] field16880;
   private final Class1097 field16890;

   public Class2616(Class1097 var1, Class<? extends LivingEntity> var2, float var3) {
      super(var1, var2, var3);
      this.field16890 = var1;
   }

   public void method10824(LivingEntity var1) {
      this.field16882 = var1;
   }

   @Override
   public boolean method10806() {
      return this.field16882 != null && super.method10806();
   }

   @Override
   public boolean method10803() {
      if (!(this.field16881.getRNG().nextFloat() >= this.field16885)) {
         if (this.field16882 == null) {
            if (this.field16886 != PlayerEntity.class) {
               this.field16882 = this.field16881
                  .world
                  .<LivingEntity>method7192(
                     this.field16886,
                     this.field16887,
                     this.field16881,
                     this.field16881.getPosX(),
                     this.field16881.getPosYEye(),
                     this.field16881.getPosZ(),
                     this.field16881.getBoundingBox().method19663((double)this.field16883, 3.0, (double)this.field16883)
                  );
            } else {
               this.field16882 = this.field16881
                  .world
                  .method7189(this.field16887, this.field16881, this.field16881.getPosX(), this.field16881.getPosYEye(), this.field16881.getPosZ());
            }
         }

         return this.field16890.method5230() && this.field16882 != null;
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      if (this.field16882 != null) {
         super.method10805();
      }
   }
}
