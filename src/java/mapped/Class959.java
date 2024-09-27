package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Class959 extends TileEntity implements ITickableTileEntity {
   private static final Block[] field5381 = new Block[]{Blocks.field36767, Blocks.field36768, Blocks.field36776, Blocks.field36769};
   public int field5382;
   private float field5383;
   private boolean field5384;
   private boolean field5385;
   private final List<BlockPos> field5386 = Lists.newArrayList();
   private LivingEntity field5387;
   private UUID field5388;
   private long field5389;

   public Class959() {
      this(TileEntityType.field21445);
   }

   public Class959(TileEntityType<?> var1) {
      super(var1);
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      if (!var2.method106("Target")) {
         this.field5388 = null;
      } else {
         this.field5388 = var2.method105("Target");
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (this.field5387 != null) {
         var1.method104("Target", this.field5387.getUniqueID());
      }

      return var1;
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.field5325, 5, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   @Override
   public void method3647() {
      this.field5382++;
      long var3 = this.field5324.getGameTime();
      if (var3 % 40L == 0L) {
         this.method3905(this.method3896());
         if (!this.field5324.isRemote && this.method3903()) {
            this.method3897();
            this.method3898();
         }
      }

      if (var3 % 80L == 0L && this.method3903()) {
         this.method3908(SoundEvents.field26468);
      }

      if (var3 > this.field5389 && this.method3903()) {
         this.field5389 = var3 + 60L + (long)this.field5324.method6814().nextInt(40);
         this.method3908(SoundEvents.field26469);
      }

      if (this.field5324.isRemote) {
         this.method3899();
         this.method3902();
         if (this.method3903()) {
            this.field5383++;
         }
      }
   }

   private boolean method3896() {
      this.field5386.clear();

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               BlockPos var6 = this.field5325.method8336(var3, var4, var5);
               if (!this.field5324.method7013(var6)) {
                  return false;
               }
            }
         }
      }

      for (int var15 = -2; var15 <= 2; var15++) {
         for (int var16 = -2; var16 <= 2; var16++) {
            for (int var17 = -2; var17 <= 2; var17++) {
               int var18 = Math.abs(var15);
               int var7 = Math.abs(var16);
               int var8 = Math.abs(var17);
               if ((var18 > 1 || var7 > 1 || var8 > 1)
                  && (var15 == 0 && (var7 == 2 || var8 == 2) || var16 == 0 && (var18 == 2 || var8 == 2) || var17 == 0 && (var18 == 2 || var7 == 2))) {
                  BlockPos var9 = this.field5325.method8336(var15, var16, var17);
                  BlockState var10 = this.field5324.getBlockState(var9);

                  for (Block var14 : field5381) {
                     if (var10.isIn(var14)) {
                        this.field5386.add(var9);
                     }
                  }
               }
            }
         }
      }

      this.method3906(this.field5386.size() >= 42);
      return this.field5386.size() >= 16;
   }

   private void method3897() {
      int var3 = this.field5386.size();
      int var4 = var3 / 7 * 16;
      int var5 = this.field5325.getX();
      int var6 = this.field5325.getY();
      int var7 = this.field5325.getZ();
      AxisAlignedBB var8 = new AxisAlignedBB((double)var5, (double)var6, (double)var7, (double)(var5 + 1), (double)(var6 + 1), (double)(var7 + 1))
         .method19664((double)var4)
         .contract(0.0, (double)this.field5324.method7034(), 0.0);
      List<PlayerEntity> var9 = this.field5324.<PlayerEntity>method7182(PlayerEntity.class, var8);
      if (!var9.isEmpty()) {
         for (PlayerEntity var11 : var9) {
            if (this.field5325.method8316(var11.getPosition(), (double)var4) && var11.method3253()) {
               var11.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 260, 0, true, true));
            }
         }
      }
   }

   private void method3898() {
      LivingEntity var3 = this.field5387;
      int var4 = this.field5386.size();
      if (var4 >= 42) {
         if (this.field5387 == null && this.field5388 != null) {
            this.field5387 = this.method3901();
            this.field5388 = null;
         } else if (this.field5387 != null) {
            if (!this.field5387.isAlive() || !this.field5325.method8316(this.field5387.getPosition(), 8.0)) {
               this.field5387 = null;
            }
         } else {
            List var5 = this.field5324.<LivingEntity>method6772(LivingEntity.class, this.method3900(), var0 -> var0 instanceof Class1008 && var0.method3253());
            if (!var5.isEmpty()) {
               this.field5387 = (LivingEntity)var5.get(this.field5324.rand.nextInt(var5.size()));
            }
         }
      } else {
         this.field5387 = null;
      }

      if (this.field5387 != null) {
         this.field5324
            .method6743(
               (PlayerEntity)null,
               this.field5387.getPosX(),
               this.field5387.getPosY(),
               this.field5387.getPosZ(),
               SoundEvents.field26470,
               Class2266.field14732,
               1.0F,
               1.0F
            );
         this.field5387.attackEntityFrom(DamageSource.field39006, 4.0F);
      }

      if (var3 != this.field5387) {
         BlockState var6 = this.method3775();
         this.field5324.notifyBlockUpdate(this.field5325, var6, var6, 2);
      }
   }

   private void method3899() {
      if (this.field5388 != null) {
         if (this.field5387 == null || !this.field5387.getUniqueID().equals(this.field5388)) {
            this.field5387 = this.method3901();
            if (this.field5387 == null) {
               this.field5388 = null;
            }
         }
      } else {
         this.field5387 = null;
      }
   }

   private AxisAlignedBB method3900() {
      int var3 = this.field5325.getX();
      int var4 = this.field5325.getY();
      int var5 = this.field5325.getZ();
      return new AxisAlignedBB((double)var3, (double)var4, (double)var5, (double)(var3 + 1), (double)(var4 + 1), (double)(var5 + 1)).method19664(8.0);
   }

   @Nullable
   private LivingEntity method3901() {
      List var3 = this.field5324.<LivingEntity>method6772(LivingEntity.class, this.method3900(), var1 -> var1.getUniqueID().equals(this.field5388));
      return var3.size() != 1 ? null : (LivingEntity)var3.get(0);
   }

   private void method3902() {
      Random var3 = this.field5324.rand;
      double var4 = (double)(MathHelper.sin((float)(this.field5382 + 35) * 0.1F) / 2.0F + 0.5F);
      var4 = (var4 * var4 + var4) * 0.3F;
      Vector3d var6 = new Vector3d(
         (double)this.field5325.getX() + 0.5, (double)this.field5325.getY() + 1.5 + var4, (double)this.field5325.getZ() + 0.5
      );

      for (BlockPos var8 : this.field5386) {
         if (var3.nextInt(50) == 0) {
            float var9 = -0.5F + var3.nextFloat();
            float var10 = -2.0F + var3.nextFloat();
            float var11 = -0.5F + var3.nextFloat();
            BlockPos var12 = var8.method8338(this.field5325);
            Vector3d var13 = new Vector3d((double)var9, (double)var10, (double)var11)
               .add((double)var12.getX(), (double)var12.getY(), (double)var12.getZ());
            this.field5324
               .addParticle(ParticleTypes.field34104, var6.x, var6.y, var6.z, var13.x, var13.y, var13.z);
         }
      }

      if (this.field5387 != null) {
         Vector3d var15 = new Vector3d(this.field5387.getPosX(), this.field5387.getPosYEye(), this.field5387.getPosZ());
         float var16 = (-0.5F + var3.nextFloat()) * (3.0F + this.field5387.getWidth());
         float var17 = -1.0F + var3.nextFloat() * this.field5387.getHeight();
         float var18 = (-0.5F + var3.nextFloat()) * (3.0F + this.field5387.getWidth());
         Vector3d var19 = new Vector3d((double)var16, (double)var17, (double)var18);
         this.field5324
            .addParticle(ParticleTypes.field34104, var15.x, var15.y, var15.z, var19.x, var19.y, var19.z);
      }
   }

   public boolean method3903() {
      return this.field5384;
   }

   public boolean method3904() {
      return this.field5385;
   }

   private void method3905(boolean var1) {
      if (var1 != this.field5384) {
         this.method3908(!var1 ? SoundEvents.field26471 : SoundEvents.field26467);
      }

      this.field5384 = var1;
   }

   private void method3906(boolean var1) {
      this.field5385 = var1;
   }

   public float method3907(float var1) {
      return (this.field5383 + var1) * -0.0375F;
   }

   public void method3908(SoundEvent var1) {
      this.field5324.method6742((PlayerEntity)null, this.field5325, var1, Class2266.field14732, 1.0F, 1.0F);
   }
}
