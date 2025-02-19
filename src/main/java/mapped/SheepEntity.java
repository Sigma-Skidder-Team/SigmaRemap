package mapped;

import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.Util;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class SheepEntity extends AnimalEntity implements Class1020 {
   private static final DataParameter<Byte> field5704 = EntityDataManager.<Byte>createKey(SheepEntity.class, DataSerializers.field33390);
   private static final Map<DyeColor, IItemProvider> field5705 = Util.<Map<DyeColor, IItemProvider>>make(Maps.newEnumMap(DyeColor.class), var0 -> {
      var0.put(DyeColor.field386, Blocks.WHITE_WOOL);
      var0.put(DyeColor.field387, Blocks.ORANGE_WOOL);
      var0.put(DyeColor.field388, Blocks.MAGENTA_WOOL);
      var0.put(DyeColor.field389, Blocks.LIGHT_BLUE_WOOL);
      var0.put(DyeColor.field390, Blocks.YELLOW_WOOL);
      var0.put(DyeColor.field391, Blocks.LIME_WOOL);
      var0.put(DyeColor.field392, Blocks.PINK_WOOL);
      var0.put(DyeColor.field393, Blocks.GRAY_WOOL);
      var0.put(DyeColor.field394, Blocks.LIGHT_GRAY_WOOL);
      var0.put(DyeColor.field395, Blocks.CYAN_WOOL);
      var0.put(DyeColor.field396, Blocks.PURPLE_WOOL);
      var0.put(DyeColor.field397, Blocks.BLUE_WOOL);
      var0.put(DyeColor.field398, Blocks.BROWN_WOOL);
      var0.put(DyeColor.field399, Blocks.GREEN_WOOL);
      var0.put(DyeColor.field400, Blocks.RED_WOOL);
      var0.put(DyeColor.field401, Blocks.BLACK_WOOL);
   });

   private static final Map<DyeColor, float[]> field5706 = Maps.newEnumMap(Arrays.stream(DyeColor.values())
           .collect(Collectors.toMap((DyeColor p_200204_0_) -> p_200204_0_, SheepEntity::method4510)));

   private int field5707;
   private Class2597 field5708;

   private static float[] method4510(DyeColor var0) {
      if (var0 != DyeColor.field386) {
         float[] var3 = var0.method311();
         float var4 = 0.75F;
         return new float[]{var3[0] * 0.75F, var3[1] * 0.75F, var3[2] * 0.75F};
      } else {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      }
   }

   public static float[] method4511(DyeColor var0) {
      return field5706.get(var0);
   }

   public SheepEntity(EntityType<? extends SheepEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5708 = new Class2597(this);
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new Class2747(this, 1.25));
      this.goalSelector.addGoal(2, new BreedGoal(this, 1.0));
      this.goalSelector.addGoal(3, new TemptGoal(this, 1.1, Ingredient.fromItems(Items.field37842), false));
      this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1));
      this.goalSelector.addGoal(5, this.field5708);
      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
   }

   @Override
   public void updateAITasks() {
      this.field5707 = this.field5708.method10811();
      super.updateAITasks();
   }

   @Override
   public void livingTick() {
      if (this.world.isRemote) {
         this.field5707 = Math.max(0, this.field5707 - 1);
      }

      super.livingTick();
   }

   public static MutableAttribute method4512() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 8.0).method21849(Attributes.MOVEMENT_SPEED, 0.23F);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5704, (byte)0);
   }

   @Override
   public ResourceLocation method4242() {
      if (this.method4519()) {
         return this.getType().method33212();
      } else {
         switch (Class8608.field38723[this.method4517().ordinal()]) {
            case 1:
            default:
               return Class8793.field39575;
            case 2:
               return Class8793.field39576;
            case 3:
               return Class8793.field39577;
            case 4:
               return Class8793.field39578;
            case 5:
               return Class8793.field39579;
            case 6:
               return Class8793.field39580;
            case 7:
               return Class8793.field39581;
            case 8:
               return Class8793.field39582;
            case 9:
               return Class8793.field39583;
            case 10:
               return Class8793.field39584;
            case 11:
               return Class8793.field39585;
            case 12:
               return Class8793.field39586;
            case 13:
               return Class8793.field39587;
            case 14:
               return Class8793.field39588;
            case 15:
               return Class8793.field39589;
            case 16:
               return Class8793.field39590;
         }
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 10) {
         super.handleStatusUpdate(var1);
      } else {
         this.field5707 = 40;
      }
   }

   public float method4513(float var1) {
      if (this.field5707 > 0) {
         if (this.field5707 >= 4 && this.field5707 <= 36) {
            return 1.0F;
         } else {
            return this.field5707 >= 4 ? -((float)(this.field5707 - 40) - var1) / 4.0F : ((float)this.field5707 - var1) / 4.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public float method4514(float var1) {
      if (this.field5707 > 4 && this.field5707 <= 36) {
         float var4 = ((float)(this.field5707 - 4) - var1) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * MathHelper.sin(var4 * 28.7F);
      } else {
         return this.field5707 <= 0 ? this.rotationPitch * (float) (Math.PI / 180.0) : (float) (Math.PI / 5);
      }
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() != Items.field37956) {
         return super.method4285(var1, var2);
      } else if (!this.world.isRemote && this.method4516()) {
         this.method4515(SoundCategory.field14735);
         var5.damageItem(1, var1, var1x -> var1x.sendBreakAnimation(var2));
         return ActionResultType.SUCCESS;
      } else {
         return ActionResultType.field14819;
      }
   }

   @Override
   public void method4515(SoundCategory var1) {
      this.world.playSoundFromEntity((PlayerEntity)null, this, SoundEvents.field27033, var1, 1.0F, 1.0F);
      this.method4520(true);
      int var4 = 1 + this.rand.nextInt(3);

      for (int var5 = 0; var5 < var4; var5++) {
         ItemEntity var6 = this.entityDropItem(field5705.get(this.method4517()), 1);
         if (var6 != null) {
            var6.setMotion(
               var6.getMotion()
                  .add(
                     (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F),
                     (double)(this.rand.nextFloat() * 0.05F),
                     (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F)
                  )
            );
         }
      }
   }

   @Override
   public boolean method4516() {
      return this.isAlive() && !this.method4519() && !this.isChild();
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putBoolean("Sheared", this.method4519());
      compound.putByte("Color", (byte)this.method4517().method309());
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4520(compound.getBoolean("Sheared"));
      this.method4518(DyeColor.method315(compound.getByte("Color")));
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27030;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27032;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27031;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field27034, 0.15F, 1.0F);
   }

   public DyeColor method4517() {
      return DyeColor.method315(this.dataManager.<Byte>method35445(field5704) & 15);
   }

   public void method4518(DyeColor var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5704);
      this.dataManager.set(field5704, (byte)(var4 & 240 | var1.method309() & 15));
   }

   public boolean method4519() {
      return (this.dataManager.<Byte>method35445(field5704) & 16) != 0;
   }

   public void method4520(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5704);
      if (!var1) {
         this.dataManager.set(field5704, (byte)(var4 & -17));
      } else {
         this.dataManager.set(field5704, (byte)(var4 | 16));
      }
   }

   public static DyeColor method4521(Random var0) {
      int var3 = var0.nextInt(100);
      if (var3 >= 5) {
         if (var3 >= 10) {
            if (var3 >= 15) {
               if (var3 >= 18) {
                  return var0.nextInt(500) != 0 ? DyeColor.field386 : DyeColor.field392;
               } else {
                  return DyeColor.field398;
               }
            } else {
               return DyeColor.field394;
            }
         } else {
            return DyeColor.field393;
         }
      } else {
         return DyeColor.field401;
      }
   }

   public SheepEntity method4389(ServerWorld var1, Class1045 var2) {
      SheepEntity var5 = (SheepEntity)var2;
      SheepEntity var6 = EntityType.SHEEP.create(var1);
      var6.method4518(this.method4522(this, var5));
      return var6;
   }

   @Override
   public void method4235() {
      this.method4520(false);
      if (this.isChild()) {
         this.method4769(60);
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      this.method4518(method4521(var1.method6814()));
      return super.method4276(var1, var2, var3, var4, var5);
   }

   private DyeColor method4522(AnimalEntity var1, AnimalEntity var2) {
      DyeColor var5 = ((SheepEntity)var1).method4517();
      DyeColor var6 = ((SheepEntity)var2).method4517();
      Class926 var7 = method4523(var5, var6);
      return this.world
         .getRecipeManager()
         .<Class926, ICraftingRecipe>method1030(IRecipeType.CRAFTING, var7, this.world)
         .<ItemStack>map(var1x -> var1x.method14962(var7))
         .<Item>map(ItemStack::getItem)
         .filter(Class3321.class::isInstance)
         .<Class3321>map(Class3321.class::cast)
         .<DyeColor>map(Class3321::method11876)
         .orElseGet(() -> !this.world.rand.nextBoolean() ? var6 : var5);
   }

   private static Class926 method4523(DyeColor var0, DyeColor var1) {
      Class926 var4 = new Class926(new Class5835((ContainerType)null, -1), 2, 1);
      var4.setInventorySlotContents(0, new ItemStack(Class3321.method11877(var0)));
      var4.setInventorySlotContents(1, new ItemStack(Class3321.method11877(var1)));
      return var4;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.95F * var2.height;
   }
}
