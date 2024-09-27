package mapped;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnExperienceOrbPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Map.Entry;

public class ExperienceOrbEntity extends Entity {
   public int field5555;
   public int field5556;
   public int field5557;
   private int field5558 = 5;
   private int field5559;
   private PlayerEntity field5560;
   private int field5561;

   public ExperienceOrbEntity(World var1, double var2, double var4, double var6, int var8) {
      this(EntityType.field41029, var1);
      this.setPosition(var2, var4, var6);
      this.rotationYaw = (float)(this.rand.nextDouble() * 360.0);
      this.setMotion(
         (this.rand.nextDouble() * 0.2F - 0.1F) * 2.0, this.rand.nextDouble() * 0.2 * 2.0, (this.rand.nextDouble() * 0.2F - 0.1F) * 2.0
      );
      this.field5559 = var8;
   }

   public ExperienceOrbEntity(EntityType<? extends ExperienceOrbEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public void registerData() {
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5557 > 0) {
         this.field5557--;
      }

      this.prevPosX = this.getPosX();
      this.prevPosY = this.getPosY();
      this.prevPosZ = this.getPosZ();
      if (!this.areEyesInFluid(FluidTags.field40469)) {
         if (!this.method3247()) {
            this.setMotion(this.getMotion().add(0.0, -0.03, 0.0));
         }
      } else {
         this.method4174();
      }

      if (this.world.getFluidState(this.getPosition()).method23486(FluidTags.field40470)) {
         this.setMotion(
            (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F),
            0.2F,
            (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F)
         );
         this.playSound(SoundEvents.field26606, 0.4F, 2.0F + this.rand.nextFloat() * 0.4F);
      }

      if (!this.world.hasNoCollisions(this.getBoundingBox())) {
         this.pushOutOfBlocks(this.getPosX(), (this.getBoundingBox().minY + this.getBoundingBox().maxY) / 2.0, this.getPosZ());
      }

      double var3 = 8.0;
      if (this.field5561 < this.field5555 - 20 + this.getEntityId() % 100) {
         if (this.field5560 == null || this.field5560.getDistanceSq(this) > 64.0) {
            this.field5560 = this.world.method7185(this, 8.0);
         }

         this.field5561 = this.field5555;
      }

      if (this.field5560 != null && this.field5560.isSpectator()) {
         this.field5560 = null;
      }

      if (this.field5560 != null) {
         Vector3d var5 = new Vector3d(
            this.field5560.getPosX() - this.getPosX(),
            this.field5560.getPosY() + (double)this.field5560.getEyeHeight() / 2.0 - this.getPosY(),
            this.field5560.getPosZ() - this.getPosZ()
         );
         double var6 = var5.lengthSquared();
         if (var6 < 64.0) {
            double var8 = 1.0 - Math.sqrt(var6) / 8.0;
            this.setMotion(this.getMotion().add(var5.method11333().scale(var8 * var8 * 0.1)));
         }
      }

      this.move(MoverType.SELF, this.getMotion());
      float var10 = 0.98F;
      if (this.onGround) {
         var10 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).getBlock().method11571() * 0.98F;
      }

      this.setMotion(this.getMotion().method11347((double)var10, 0.98, (double)var10));
      if (this.onGround) {
         this.setMotion(this.getMotion().method11347(1.0, -0.9, 1.0));
      }

      this.field5555++;
      this.field5556++;
      if (this.field5556 >= 6000) {
         this.remove();
      }
   }

   private void method4174() {
      Vector3d var3 = this.getMotion();
      this.setMotion(var3.x * 0.99F, Math.min(var3.y + 5.0E-4F, 0.06F), var3.z * 0.99F);
   }

   @Override
   public void doWaterSplashEffect() {
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         this.markVelocityChanged();
         this.field5558 = (int)((float)this.field5558 - var2);
         if (this.field5558 <= 0) {
            this.remove();
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.putShort("Health", (short)this.field5558);
      var1.putShort("Age", (short)this.field5556);
      var1.putShort("Value", (short)this.field5559);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field5558 = var1.getShort("Health");
      this.field5556 = var1.getShort("Age");
      this.field5559 = var1.getShort("Value");
   }

   @Override
   public void onCollideWithPlayer(PlayerEntity var1) {
      if (!this.world.isRemote && this.field5557 == 0 && var1.field4910 == 0) {
         var1.field4910 = 2;
         var1.onItemPickup(this, 1);
         Entry var4 = EnchantmentHelper.method26340(Enchantments.MENDING, var1, ItemStack::method32116);
         if (var4 != null) {
            ItemStack var5 = (ItemStack)var4.getValue();
            if (!var5.isEmpty() && var5.method32116()) {
               int var6 = Math.min(this.method4176(this.field5559), var5.method32117());
               this.field5559 = this.field5559 - this.method4175(var6);
               var5.method32118(var5.method32117() - var6);
            }
         }

         if (this.field5559 > 0) {
            var1.method2781(this.field5559);
         }

         this.remove();
      }
   }

   private int method4175(int var1) {
      return var1 / 2;
   }

   private int method4176(int var1) {
      return var1 * 2;
   }

   public int method4177() {
      return this.field5559;
   }

   public int method4178() {
      if (this.field5559 < 2477) {
         if (this.field5559 < 1237) {
            if (this.field5559 < 617) {
               if (this.field5559 < 307) {
                  if (this.field5559 < 149) {
                     if (this.field5559 < 73) {
                        if (this.field5559 < 37) {
                           if (this.field5559 < 17) {
                              if (this.field5559 < 7) {
                                 return this.field5559 < 3 ? 0 : 1;
                              } else {
                                 return 2;
                              }
                           } else {
                              return 3;
                           }
                        } else {
                           return 4;
                        }
                     } else {
                        return 5;
                     }
                  } else {
                     return 6;
                  }
               } else {
                  return 7;
               }
            } else {
               return 8;
            }
         } else {
            return 9;
         }
      } else {
         return 10;
      }
   }

   public static int getXPSplit(int var0) {
      if (var0 < 2477) {
         if (var0 < 1237) {
            if (var0 < 617) {
               if (var0 < 307) {
                  if (var0 < 149) {
                     if (var0 < 73) {
                        if (var0 < 37) {
                           if (var0 < 17) {
                              if (var0 < 7) {
                                 return var0 < 3 ? 1 : 3;
                              } else {
                                 return 7;
                              }
                           } else {
                              return 17;
                           }
                        } else {
                           return 37;
                        }
                     } else {
                        return 73;
                     }
                  } else {
                     return 149;
                  }
               } else {
                  return 307;
               }
            } else {
               return 617;
            }
         } else {
            return 1237;
         }
      } else {
         return 2477;
      }
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnExperienceOrbPacket(this);
   }
}
