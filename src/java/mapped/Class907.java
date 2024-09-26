package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;

public class Class907 extends Entity {
   private BlockState field5176 = Blocks.SAND.method11579();
   public int field5177;
   public boolean field5178 = true;
   private boolean field5179;
   private boolean field5180;
   private int field5181 = 40;
   private float field5182 = 2.0F;
   public CompoundNBT field5183;
   public static final DataParameter<BlockPos> field5184 = EntityDataManager.<BlockPos>createKey(Class907.class, DataSerializers.field33401);

   public Class907(EntityType<? extends Class907> var1, World var2) {
      super(var1, var2);
   }

   public Class907(World var1, double var2, double var4, double var6, BlockState var8) {
      this(EntityType.field41031, var1);
      this.field5176 = var8;
      this.preventEntitySpawning = true;
      this.setPosition(var2, var4 + (double)((1.0F - this.getHeight()) / 2.0F), var6);
      this.setMotion(Vector3d.ZERO);
      this.prevPosX = var2;
      this.prevPosY = var4;
      this.prevPosZ = var6;
      this.method3552(this.getPosition());
   }

   @Override
   public boolean method3360() {
      return false;
   }

   public void method3552(BlockPos var1) {
      this.dataManager.method35446(field5184, var1);
   }

   public BlockPos method3553() {
      return this.dataManager.<BlockPos>method35445(field5184);
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5184, BlockPos.ZERO);
   }

   @Override
   public boolean canBeCollidedWith() {
      return !this.removed;
   }

   @Override
   public void tick() {
      if (!this.field5176.isAir()) {
         Block var3 = this.field5176.getBlock();
         if (this.field5177++ == 0) {
            BlockPos var4 = this.getPosition();
            if (!this.world.getBlockState(var4).isIn(var3)) {
               if (!this.world.isRemote) {
                  this.remove();
                  return;
               }
            } else {
               this.world.removeBlock(var4, false);
            }
         }

         if (!this.method3247()) {
            this.setMotion(this.getMotion().add(0.0, -0.04, 0.0));
         }

         this.move(MoverType.SELF, this.getMotion());
         if (!this.world.isRemote) {
            BlockPos var18 = this.getPosition();
            boolean var5 = this.field5176.getBlock() instanceof Class3217;
            boolean var6 = var5 && this.world.getFluidState(var18).method23486(FluidTags.field40469);
            double var7 = this.getMotion().lengthSquared();
            if (var5 && var7 > 1.0) {
               BlockRayTraceResult var9 = this.world
                  .rayTraceBlocks(
                     new RayTraceContext(
                        new Vector3d(this.prevPosX, this.prevPosY, this.prevPosZ), this.getPositionVec(), Class2271.field14774, Class1985.field12963, this
                     )
                  );
               if (var9.getType() != RayTraceResult.Type.MISS && this.world.getFluidState(var9.getPos()).method23486(FluidTags.field40469)) {
                  var18 = var9.getPos();
                  var6 = true;
               }
            }

            if (!this.onGround && !var6) {
               if (!this.world.isRemote && (this.field5177 > 100 && (var18.getY() < 1 || var18.getY() > 256) || this.field5177 > 600)) {
                  if (this.field5178 && this.world.getGameRules().getBoolean(Class5462.field24229)) {
                     this.entityDropItem(var3);
                  }

                  this.remove();
               }
            } else {
               BlockState var19 = this.world.getBlockState(var18);
               this.setMotion(this.getMotion().method11347(0.7, -0.5, 0.7));
               if (!var19.isIn(Blocks.MOVING_PISTON)) {
                  this.remove();
                  if (this.field5179) {
                     if (var3 instanceof Class3213) {
                        ((Class3213)var3).method11600(this.world, var18, this);
                     }
                  } else {
                     boolean var10 = var19.method23441(new Class5910(this.world, var18, Direction.DOWN, ItemStack.EMPTY, Direction.field673));
                     boolean var11 = Class3213.method11598(this.world.getBlockState(var18.down())) && (!var5 || !var6);
                     boolean var12 = this.field5176.method23443(this.world, var18) && !var11;
                     if (var10 && var12) {
                        if (this.field5176.method23462(Class8820.field39710) && this.world.getFluidState(var18).method23472() == Class9479.field44066) {
                           this.field5176 = this.field5176.method23465(Class8820.field39710, Boolean.valueOf(true));
                        }

                        if (!this.world.setBlockState(var18, this.field5176, 3)) {
                           if (this.field5178 && this.world.getGameRules().getBoolean(Class5462.field24229)) {
                              this.entityDropItem(var3);
                           }
                        } else {
                           if (var3 instanceof Class3213) {
                              ((Class3213)var3).method11599(this.world, var18, this.field5176, var19, this);
                           }

                           if (this.field5183 != null && var3 instanceof Class3245) {
                              TileEntity var13 = this.world.getTileEntity(var18);
                              if (var13 != null) {
                                 CompoundNBT var14 = var13.write(new CompoundNBT());

                                 for (String var16 : this.field5183.method97()) {
                                    INBT var17 = this.field5183.method116(var16);
                                    if (!"x".equals(var16) && !"y".equals(var16) && !"z".equals(var16)) {
                                       var14.put(var16, var17.method79());
                                    }
                                 }

                                 var13.method3645(this.field5176, var14);
                                 var13.markDirty();
                              }
                           }
                        }
                     } else if (this.field5178 && this.world.getGameRules().getBoolean(Class5462.field24229)) {
                        this.entityDropItem(var3);
                     }
                  }
               }
            }
         }

         this.setMotion(this.getMotion().scale(0.98));
      } else {
         this.remove();
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      if (this.field5180) {
         int var5 = MathHelper.ceil(var1 - 1.0F);
         if (var5 > 0) {
            List<Entity> var6 = Lists.newArrayList(this.world.method7181(this, this.getBoundingBox()));
            boolean var7 = this.field5176.method23446(BlockTags.field32765);
            DamageSource var8 = !var7 ? DamageSource.field39009 : DamageSource.field39008;

            for (Entity var10 : var6) {
               var10.attackEntityFrom(var8, (float)Math.min(MathHelper.method37767((float)var5 * this.field5182), this.field5181));
            }

            if (var7 && (double)this.rand.nextFloat() < 0.05F + (double)var5 * 0.05) {
               BlockState var11 = Class3218.method11607(this.field5176);
               if (var11 != null) {
                  this.field5176 = var11;
               } else {
                  this.field5179 = true;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.put("BlockState", Class8354.method29287(this.field5176));
      var1.putInt("Time", this.field5177);
      var1.putBoolean("DropItem", this.field5178);
      var1.putBoolean("HurtEntities", this.field5180);
      var1.putFloat("FallHurtAmount", this.field5182);
      var1.putInt("FallHurtMax", this.field5181);
      if (this.field5183 != null) {
         var1.put("TileEntityData", this.field5183);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field5176 = Class8354.method29285(var1.getCompound("BlockState"));
      this.field5177 = var1.getInt("Time");
      if (!var1.contains("HurtEntities", 99)) {
         if (this.field5176.method23446(BlockTags.field32765)) {
            this.field5180 = true;
         }
      } else {
         this.field5180 = var1.getBoolean("HurtEntities");
         this.field5182 = var1.getFloat("FallHurtAmount");
         this.field5181 = var1.getInt("FallHurtMax");
      }

      if (var1.contains("DropItem", 99)) {
         this.field5178 = var1.getBoolean("DropItem");
      }

      if (var1.contains("TileEntityData", 10)) {
         this.field5183 = var1.getCompound("TileEntityData");
      }

      if (this.field5176.isAir()) {
         this.field5176 = Blocks.SAND.method11579();
      }
   }

   public World method3554() {
      return this.world;
   }

   public void method3555(boolean var1) {
      this.field5180 = var1;
   }

   @Override
   public boolean canRenderOnFire() {
      return false;
   }

   @Override
   public void fillCrashReport(CrashReportCategory var1) {
      super.fillCrashReport(var1);
      var1.addDetail("Immitating BlockState", this.field5176.toString());
   }

   public BlockState method3556() {
      return this.field5176;
   }

   @Override
   public boolean method3404() {
      return true;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this, Block.getStateId(this.method3556()));
   }
}
