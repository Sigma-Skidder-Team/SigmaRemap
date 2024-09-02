package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Optional;

public class EnderCrystalEntity extends Entity {
   private static final DataParameter<Optional<BlockPos>> field5521 = EntityDataManager.<Optional<BlockPos>>createKey(EnderCrystalEntity.class, DataSerializers.field33402);
   private static final DataParameter<Boolean> field5522 = EntityDataManager.<Boolean>createKey(EnderCrystalEntity.class, DataSerializers.field33398);
   public int field5523;

   public EnderCrystalEntity(EntityType<? extends EnderCrystalEntity> var1, World var2) {
      super(var1, var2);
      this.preventEntitySpawning = true;
      this.field5523 = this.rand.nextInt(100000);
   }

   public EnderCrystalEntity(World var1, double var2, double var4, double var6) {
      this(EntityType.field41023, var1);
      this.setPosition(var2, var4, var6);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void registerData() {
      this.method3210().register(field5521, Optional.<BlockPos>empty());
      this.method3210().register(field5522, true);
   }

   @Override
   public void tick() {
      this.field5523++;
      if (this.world instanceof ServerWorld) {
         BlockPos var3 = this.getPosition();
         if (((ServerWorld)this.world).method6968() != null && this.world.getBlockState(var3).isAir()) {
            this.world.setBlockState(var3, AbstractFireBlock.method12009(this.world, var3));
         }
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      if (this.method4143() != null) {
         var1.put("BeamTarget", Class8354.method29284(this.method4143()));
      }

      var1.putBoolean("ShowBottom", this.method4145());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      if (var1.contains("BeamTarget", 10)) {
         this.method4142(Class8354.method29283(var1.getCompound("BeamTarget")));
      }

      if (var1.contains("ShowBottom", 1)) {
         this.method4144(var1.getBoolean("ShowBottom"));
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
            if (!this.removed && !this.world.isRemote) {
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
   public boolean isInRangeToRenderDist(double var1) {
      return super.isInRangeToRenderDist(var1) || this.method4143() != null;
   }

   @Override
   public Packet<?> method2835() {
      return new SSpawnObjectPacket(this);
   }
}
