package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;

public class LeashKnotEntity extends Class995 {
   private static String[] field5490;

   public LeashKnotEntity(EntityType<? extends LeashKnotEntity> var1, World var2) {
      super(var1, var2);
   }

   public LeashKnotEntity(World var1, BlockPos var2) {
      super(EntityType.field41045, var1, var2);
      this.setPosition((double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5);
      float var5 = 0.125F;
      float var6 = 0.1875F;
      float var7 = 0.25F;
      this.setBoundingBox(
         new AxisAlignedBB(
            this.getPosX() - 0.1875,
            this.getPosY() - 0.25 + 0.125,
            this.getPosZ() - 0.1875,
            this.getPosX() + 0.1875,
            this.getPosY() + 0.25 + 0.125,
            this.getPosZ() + 0.1875
         )
      );
      this.forceSpawn = true;
   }

   @Override
   public void setPosition(double var1, double var3, double var5) {
      super.setPosition((double) MathHelper.floor(var1) + 0.5, (double) MathHelper.floor(var3) + 0.5, (double) MathHelper.floor(var5) + 0.5);
   }

   @Override
   public void method4078() {
      this.setRawPosition((double)this.field5488.getX() + 0.5, (double)this.field5488.getY() + 0.5, (double)this.field5488.getZ() + 0.5);
   }

   @Override
   public void method4077(Direction var1) {
   }

   @Override
   public int method4081() {
      return 9;
   }

   @Override
   public int method4082() {
      return 9;
   }

   @Override
   public float getEyeHeight(Pose var1, EntitySize var2) {
      return -0.0625F;
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      return var1 < 1024.0;
   }

   @Override
   public void method4083(Entity var1) {
      this.playSound(SoundEvents.field26728, 1.0F, 1.0F);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
   }

   @Override
   public ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      if (this.world.isRemote) {
         return ActionResultType.SUCCESS;
      } else {
         boolean var5 = false;
         double var6 = 7.0;
         List<MobEntity> var8 = this.world
            .<MobEntity>getEntitiesWithinAABB(
               MobEntity.class,
               new AxisAlignedBB(
                  this.getPosX() - 7.0,
                  this.getPosY() - 7.0,
                  this.getPosZ() - 7.0,
                  this.getPosX() + 7.0,
                  this.getPosY() + 7.0,
                  this.getPosZ() + 7.0
               )
            );

         for (MobEntity var10 : var8) {
            if (var10.method4297() == var1) {
               var10.method4298(this, true);
               var5 = true;
            }
         }

         if (!var5) {
            this.remove();
            if (var1.abilities.isCreativeMode) {
               for (MobEntity var12 : var8) {
                  if (var12.method4296() && var12.method4297() == this) {
                     var12.method4294(true, false);
                  }
               }
            }
         }

         return ActionResultType.field14819;
      }
   }

   @Override
   public boolean method4080() {
      return this.world.getBlockState(this.field5488).getBlock().isIn(BlockTags.field32771);
   }

   public static LeashKnotEntity method4087(World var0, BlockPos var1) {
      int var4 = var1.getX();
      int var5 = var1.getY();
      int var6 = var1.getZ();

      for (LeashKnotEntity var8 : var0.<LeashKnotEntity>getEntitiesWithinAABB(
         LeashKnotEntity.class, new AxisAlignedBB((double)var4 - 1.0, (double)var5 - 1.0, (double)var6 - 1.0, (double)var4 + 1.0, (double)var5 + 1.0, (double)var6 + 1.0)
      )) {
         if (var8.method4085().equals(var1)) {
            return var8;
         }
      }

      LeashKnotEntity var9 = new LeashKnotEntity(var0, var1);
      var0.addEntity(var9);
      var9.method4084();
      return var9;
   }

   @Override
   public void method4084() {
      this.playSound(SoundEvents.field26729, 1.0F, 1.0F);
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this, this.getType(), 0, this.method4085());
   }

   @Override
   public Vector3d getLeashPosition(float var1) {
      return this.method3288(var1).add(0.0, 0.2, 0.0);
   }
}
