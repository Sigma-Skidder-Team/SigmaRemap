package net.minecraft.entity.boss.dragon;

import mapped.EnderDragonEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.Pose;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;

public class EnderDragonPartEntity extends Entity {
   private static String[] field5185;
   public final EnderDragonEntity dragon;
   public final String field5187;
   private final EntitySize field5188;

   public EnderDragonPartEntity(EnderDragonEntity var1, String var2, float var3, float var4) {
      super(var1.getType(), var1.world);
      this.field5188 = EntitySize.method32101(var3, var4);
      this.recalculateSize();
      this.dragon = var1;
      this.field5187 = var2;
   }

   @Override
   public void registerData() {
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
   }

   @Override
   public boolean canBeCollidedWith() {
      return true;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return !this.isInvulnerableTo(var1) ? this.dragon.method4325(this, var1, var2) : false;
   }

   @Override
   public boolean isEntityEqual(Entity var1) {
      return this == var1 || this.dragon == var1;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      throw new UnsupportedOperationException();
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return this.field5188;
   }
}
