package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Class1033 extends Class1031 implements Class1022 {
   private static String[] field5738;
   private int field5739;
   private final Vector3d[][] field5740;

   public Class1033(EntityType<? extends Class1033> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
      this.field5740 = new Vector3d[2][4];

      for (int var5 = 0; var5 < 4; var5++) {
         this.field5740[0][var5] = Vector3d.ZERO;
         this.field5740[1][var5] = Vector3d.ZERO;
      }
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2696(this));
      this.field5600.addGoal(4, new Class2677(this));
      this.field5600.addGoal(5, new Class2673(this));
      this.field5600.addGoal(6, new Class2758<Class1033>(this, 0.5, 20, 15.0F));
      this.field5600.addGoal(8, new Class2736(this, 0.6));
      this.field5600.addGoal(9, new Class2612(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.addGoal(10, new Class2612(this, MobEntity.class, 8.0F));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, Class1026.class).method10918());
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true).method10917(300));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, false).method10917(300));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1058>(this, Class1058.class, false).method10917(300));
   }

   public static MutableAttribute method4610() {
      return MonsterEntity.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.5).method21849(Attributes.FOLLOW_RANGE, 18.0).method21849(Attributes.MAX_HEALTH, 32.0);
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.BOW));
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void registerData() {
      super.registerData();
   }

   @Override
   public AxisAlignedBB getRenderBoundingBox() {
      return this.getBoundingBox().grow(3.0, 0.0, 3.0);
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.world.isRemote && this.isInvisible()) {
         this.field5739--;
         if (this.field5739 < 0) {
            this.field5739 = 0;
         }

         if (this.hurtTime == 1 || this.ticksExisted % 1200 == 0) {
            this.field5739 = 3;

            for (int var5 = 0; var5 < 4; var5++) {
               this.field5740[0][var5] = this.field5740[1][var5];
               this.field5740[1][var5] = new Vector3d(
                  (double)(-6.0F + (float)this.rand.nextInt(13)) * 0.5,
                  (double)Math.max(0, this.rand.nextInt(6) - 4),
                  (double)(-6.0F + (float)this.rand.nextInt(13)) * 0.5
               );
            }

            for (int var7 = 0; var7 < 16; var7++) {
               this.world.addParticle(ParticleTypes.field34053, this.getPosXRandom(0.5), this.getPosYRandom(), this.getPosZWidth(0.5), 0.0, 0.0, 0.0);
            }

            this.world.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26695, this.getSoundCategory(), 1.0F, 1.0F, false);
         } else if (this.hurtTime == this.maxHurtTime - 1) {
            this.field5739 = 3;

            for (int var3 = 0; var3 < 4; var3++) {
               this.field5740[0][var3] = this.field5740[1][var3];
               this.field5740[1][var3] = new Vector3d(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public SoundEvent method4546() {
      return SoundEvents.field26691;
   }

   public Vector3d[] method4611(float var1) {
      if (this.field5739 <= 0) {
         return this.field5740[1];
      } else {
         double var4 = (double)(((float)this.field5739 - var1) / 3.0F);
         var4 = Math.pow(var4, 0.25);
         Vector3d[] var6 = new Vector3d[4];

         for (int var7 = 0; var7 < 4; var7++) {
            var6[var7] = this.field5740[1][var7].scale(1.0 - var4).add(this.field5740[0][var7].scale(var4));
         }

         return var6;
      }
   }

   @Override
   public boolean isOnSameTeam(Entity var1) {
      if (super.isOnSameTeam(var1)) {
         return true;
      } else {
         return var1 instanceof LivingEntity && ((LivingEntity)var1).getCreatureAttribute() == CreatureAttribute.field33508
            ? this.getTeam() == null && var1.getTeam() == null
            : false;
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26691;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26693;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26694;
   }

   @Override
   public SoundEvent method4598() {
      return SoundEvents.field26692;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      ItemStack var5 = this.findAmmo(this.getHeldItem(ProjectileHelper.method36389(this, Items.BOW)));
      AbstractArrowEntity var6 = ProjectileHelper.method36390(this, var5, var2);
      double var7 = var1.getPosX() - this.getPosX();
      double var9 = var1.getPosYHeight(0.3333333333333333) - var6.getPosY();
      double var11 = var1.getPosZ() - this.getPosZ();
      double var13 = (double) MathHelper.sqrt(var7 * var7 + var11 * var11);
      var6.shoot(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.world.method6997().getId() * 4));
      this.playSound(SoundEvents.field27070, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
      this.world.addEntity(var6);
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4594()) {
         return !this.method4307() ? Class2117.field13794 : Class2117.field13797;
      } else {
         return Class2117.field13796;
      }
   }
}
