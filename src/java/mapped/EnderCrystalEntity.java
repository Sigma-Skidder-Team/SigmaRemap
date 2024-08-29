package mapped;

import javax.annotation.Nullable;
import java.util.Optional;

public class EnderCrystalEntity extends Entity {
   private static final Class9289<Optional<BlockPos>> field5521 = Class9361.<Optional<BlockPos>>method35441(EnderCrystalEntity.class, Class7784.field33402);
   private static final Class9289<Boolean> field5522 = Class9361.<Boolean>method35441(EnderCrystalEntity.class, Class7784.field33398);
   public int field5523;

   public EnderCrystalEntity(EntityType<? extends EnderCrystalEntity> var1, World var2) {
      super(var1, var2);
      this.field5019 = true;
      this.field5523 = this.field5054.nextInt(100000);
   }

   public EnderCrystalEntity(World var1, double var2, double var4, double var6) {
      this(EntityType.field41023, var1);
      this.method3215(var2, var4, var6);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5521, Optional.<BlockPos>empty());
      this.method3210().method35442(field5522, true);
   }

   @Override
   public void tick() {
      this.field5523++;
      if (this.world instanceof ServerWorld) {
         BlockPos var3 = this.getPosition();
         if (((ServerWorld)this.world).method6968() != null && this.world.getBlockState(var3).isAir()) {
            this.world.method6730(var3, Class3397.method12009(this.world, var3));
         }
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      if (this.method4143() != null) {
         var1.put("BeamTarget", Class8354.method29284(this.method4143()));
      }

      var1.method115("ShowBottom", this.method4145());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      if (var1.method119("BeamTarget", 10)) {
         this.method4142(Class8354.method29283(var1.getCompound("BeamTarget")));
      }

      if (var1.method119("ShowBottom", 1)) {
         this.method4144(var1.method132("ShowBottom"));
      }
   }

   @Override
   public boolean method3139() {
      return true;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (!(var1.method31109() instanceof Class1007)) {
            if (!this.field5041 && !this.world.field9020) {
               this.method2904();
               if (!var1.method31131()) {
                  this.world.method6755((Entity)null, this.getPosX(), this.getPosY(), this.getPosZ(), 6.0F, Class2141.field14016);
               }

               this.method4141(var1);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method2995() {
      this.method4141(Class8654.field39005);
      super.method2995();
   }

   private void method4141(Class8654 var1) {
      if (this.world instanceof ServerWorld) {
         Class7819 var4 = ((ServerWorld)this.world).method6968();
         if (var4 != null) {
            var4.method26126(this, var1);
         }
      }
   }

   public void method4142(BlockPos var1) {
      this.method3210().method35446(field5521, Optional.<BlockPos>ofNullable(var1));
   }

   @Nullable
   public BlockPos method4143() {
      return this.method3210().<Optional<BlockPos>>method35445(field5521).orElse((BlockPos)null);
   }

   public void method4144(boolean var1) {
      this.method3210().method35446(field5522, var1);
   }

   public boolean method4145() {
      return this.method3210().<Boolean>method35445(field5522);
   }

   @Override
   public boolean method3291(double var1) {
      return super.method3291(var1) || this.method4143() != null;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
