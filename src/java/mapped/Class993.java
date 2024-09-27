package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class993 extends AbstractMinecartEntity {
   private int field5480 = -1;

   public Class993(EntityType<? extends Class993> var1, World var2) {
      super(var1, var2);
   }

   public Class993(World var1, double var2, double var4, double var6) {
      super(EntityType.field41056, var1, var2, var4, var6);
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.TNT;
   }

   @Override
   public BlockState method3604() {
      return Blocks.TNT.method11579();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5480 <= 0) {
         if (this.field5480 == 0) {
            this.method4071(horizontalMag(this.getMotion()));
         }
      } else {
         this.field5480--;
         this.world.addParticle(ParticleTypes.field34092, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 0.0, 0.0, 0.0);
      }

      if (this.collidedHorizontally) {
         double var3 = horizontalMag(this.getMotion());
         if (var3 >= 0.01F) {
            this.method4071(var3);
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      Entity var5 = var1.getImmediateSource();
      if (var5 instanceof AbstractArrowEntity) {
         AbstractArrowEntity var6 = (AbstractArrowEntity)var5;
         if (var6.isBurning()) {
            this.method4071(var6.getMotion().lengthSquared());
         }
      }

      return super.attackEntityFrom(var1, var2);
   }

   @Override
   public void method3586(DamageSource var1) {
      double var4 = horizontalMag(this.getMotion());
      if (!var1.method31141() && !var1.method31131() && !(var4 >= 0.01F)) {
         super.method3586(var1);
         if (!var1.method31131() && this.world.getGameRules().getBoolean(Class5462.field24229)) {
            this.entityDropItem(Blocks.TNT);
         }
      } else if (this.field5480 < 0) {
         this.method4072();
         this.field5480 = this.rand.nextInt(20) + this.rand.nextInt(20);
      }
   }

   public void method4071(double var1) {
      if (!this.world.isRemote) {
         double var5 = Math.sqrt(var1);
         if (var5 > 5.0) {
            var5 = 5.0;
         }

         this.world
            .method6755(
               this, this.getPosX(), this.getPosY(), this.getPosZ(), (float)(4.0 + this.rand.nextDouble() * 1.5 * var5), Class2141.field14015
            );
         this.remove();
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      if (var1 >= 3.0F) {
         float var5 = var1 / 10.0F;
         this.method4071((double)(var5 * var5));
      }

      return super.onLivingFall(var1, var2);
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.field5480 < 0) {
         this.method4072();
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 10) {
         super.handleStatusUpdate(var1);
      } else {
         this.method4072();
      }
   }

   public void method4072() {
      this.field5480 = 80;
      if (!this.world.isRemote) {
         this.world.setEntityState(this, (byte)10);
         if (!this.isSilent()) {
            this.world
               .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field27146, Class2266.field14732, 1.0F, 1.0F);
         }
      }
   }

   public int method4073() {
      return this.field5480;
   }

   public boolean method4074() {
      return this.field5480 > -1;
   }

   @Override
   public float getExplosionResistance(Explosion var1, IBlockReader var2, BlockPos var3, BlockState var4, FluidState var5, float var6) {
      return this.method4074() && (var4.isIn(BlockTags.field32766) || var2.getBlockState(var3.up()).isIn(BlockTags.field32766))
         ? 0.0F
         : super.getExplosionResistance(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method3369(Explosion var1, IBlockReader var2, BlockPos var3, BlockState var4, float var5) {
      return this.method4074() && (var4.isIn(BlockTags.field32766) || var2.getBlockState(var3.up()).isIn(BlockTags.field32766))
         ? false
         : super.method3369(var1, var2, var3, var4, var5);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("TNTFuse", 99)) {
         this.field5480 = var1.getInt("TNTFuse");
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("TNTFuse", this.field5480);
   }
}
