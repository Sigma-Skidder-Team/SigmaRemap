package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class PiglinBruteEntity extends AbstractPiglinEntity {
   public static final ImmutableList<Class7963<? extends Class7882<? super PiglinBruteEntity>>> field5752 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240, Class7963.field34238, Class7963.field34242, Class7963.field34248
   );
   public static final ImmutableList<MemoryModuleType<?>> field5753 = ImmutableList.of(
      MemoryModuleType.field39825,
      MemoryModuleType.field39833,
      MemoryModuleType.field39818,
      MemoryModuleType.field39819,
      MemoryModuleType.field39822,
      MemoryModuleType.field39823,
      MemoryModuleType.field39862,
      MemoryModuleType.field39861,
      MemoryModuleType.field39835,
      MemoryModuleType.field39836,
      MemoryModuleType.field39824,
      MemoryModuleType.field39841,
      new MemoryModuleType[]{
         MemoryModuleType.ATTACK_TARGET,
         MemoryModuleType.field39827,
         MemoryModuleType.field39828,
         MemoryModuleType.field39831,
         MemoryModuleType.field39849,
         MemoryModuleType.field39848,
         MemoryModuleType.field39813
      }
   );

   public PiglinBruteEntity(EntityType<? extends PiglinBruteEntity> var1, World var2) {
      super(var1, var2);
      this.field5594 = 20;
   }

   public static MutableAttribute method4637() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 50.0).method21849(Attributes.MOVEMENT_SPEED, 0.35F).method21849(Attributes.ATTACK_DAMAGE, 7.0);
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      Class9743.method38193(this);
      this.method4270(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void method4270(Class9755 var1) {
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.field37818));
   }

   @Override
   public Class6971<PiglinBruteEntity> getBrainCodec() {
      return Brain.<PiglinBruteEntity>createCodec(field5753, field5752);
   }

   @Override
   public Brain<?> createBrain(Dynamic<?> var1) {
      return Class9743.method38192(this, this.getBrainCodec().deserialize(var1));
   }

   @Override
   public Brain<PiglinBruteEntity> getBrain() {
      return (Brain<PiglinBruteEntity>)super.getBrain();
   }

   @Override
   public boolean method4618() {
      return false;
   }

   @Override
   public boolean method4253(ItemStack var1) {
      return var1.getItem() != Items.field37818 ? false : super.method4253(var1);
   }

   @Override
   public void updateAITasks() {
      this.world.getProfiler().startSection("piglinBruteBrain");
      this.getBrain().method21432((ServerWorld)this.world, this);
      this.world.getProfiler().endSection();
      Class9743.method38199(this);
      Class9743.method38205(this);
      super.updateAITasks();
   }

   @Override
   public PiglinAction func_234424_eM_() {
      return this.method4307() && this.func_242338_eO() ? PiglinAction.field14259 : PiglinAction.field14264;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      boolean var5 = super.attackEntityFrom(source, var2);
      if (!this.world.isRemote) {
         if (var5 && source.getTrueSource() instanceof LivingEntity) {
            Class9743.method38204(this, (LivingEntity) source.getTrueSource());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26939;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26942;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26941;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26943, 0.15F, 1.0F);
   }

   public void method4638() {
      this.playSound(SoundEvents.field26940, 1.0F, this.getSoundPitch());
   }

   @Override
   public void func_241848_eP() {
      this.playSound(SoundEvents.field26944, 1.0F, this.getSoundPitch());
   }
}
