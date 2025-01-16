package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class VexEntity extends MonsterEntity {
   public static final DataParameter<Byte> field6051 = EntityDataManager.<Byte>createKey(VexEntity.class, DataSerializers.field33390);
   private MobEntity field6052;
   private BlockPos field6053;
   private boolean field6054;
   private int field6055;

   public VexEntity(EntityType<? extends VexEntity> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6839(this, this);
      this.field5594 = 3;
   }

   @Override
   public void move(MoverType var1, Vector3d var2) {
      super.move(var1, var2);
      this.doBlockCollisions();
   }

   @Override
   public void tick() {
      this.noClip = true;
      super.tick();
      this.noClip = false;
      this.method3248(true);
      if (this.field6054 && --this.field6055 <= 0) {
         this.field6055 = 20;
         this.attackEntityFrom(DamageSource.field39000, 1.0F);
      }
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(4, new Class2766(this));
      this.field5600.addGoal(8, new Class2678(this));
      this.field5600.addGoal(9, new Class2612(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.addGoal(10, new Class2612(this, MobEntity.class, 8.0F));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, Class1026.class).method10918());
      this.field5601.addGoal(2, new Class2722(this, this));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
   }

   public static MutableAttribute method5269() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 14.0).method21849(Attributes.ATTACK_DAMAGE, 4.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6051, (byte)0);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("BoundX")) {
         this.field6053 = new BlockPos(var1.getInt("BoundX"), var1.getInt("BoundY"), var1.getInt("BoundZ"));
      }

      if (var1.contains("LifeTicks")) {
         this.method5278(var1.getInt("LifeTicks"));
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field6053 != null) {
         var1.putInt("BoundX", this.field6053.getX());
         var1.putInt("BoundY", this.field6053.getY());
         var1.putInt("BoundZ", this.field6053.getZ());
      }

      if (this.field6054) {
         var1.putInt("LifeTicks", this.field6055);
      }
   }

   public MobEntity method5270() {
      return this.field6052;
   }

   @Nullable
   public BlockPos method5271() {
      return this.field6053;
   }

   public void method5272(BlockPos var1) {
      this.field6053 = var1;
   }

   private boolean method5273(int var1) {
      int var4 = this.dataManager.<Byte>method35445(field6051);
      return (var4 & var1) != 0;
   }

   private void method5274(int var1, boolean var2) {
      int var5 = this.dataManager.<Byte>method35445(field6051);
      if (!var2) {
         var5 &= ~var1;
      } else {
         var5 |= var1;
      }

      this.dataManager.method35446(field6051, (byte)(var5 & 0xFF));
   }

   public boolean method5275() {
      return this.method5273(1);
   }

   public void method5276(boolean var1) {
      this.method5274(1, var1);
   }

   public void method5277(MobEntity var1) {
      this.field6052 = var1;
   }

   public void method5278(int var1) {
      this.field6054 = true;
      this.field6055 = var1;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27185;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27187;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27188;
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      this.method4270(var2);
      this.method4273(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void method4270(Class9755 var1) {
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.field37820));
      this.method4279(EquipmentSlotType.MAINHAND, 0.0F);
   }

   // $VF: synthetic method
   public static Random method5279(VexEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class6829 method5280(VexEntity var0) {
      return var0.field5596;
   }

   // $VF: synthetic method
   public static Class6829 method5281(VexEntity var0) {
      return var0.field5596;
   }

   // $VF: synthetic method
   public static MobEntity method5282(VexEntity var0) {
      return var0.field6052;
   }

   // $VF: synthetic method
   public static Random method5283(VexEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5284(VexEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5285(VexEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5286(VexEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class6829 method5287(VexEntity var0) {
      return var0.field5596;
   }
}
