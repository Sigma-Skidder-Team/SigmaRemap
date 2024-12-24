package net.minecraft.entity.passive.fish;

import mapped.*;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Stream;

public abstract class AbstractGroupFishEntity extends AbstractFishEntity {
   private AbstractGroupFishEntity field5810;
   private int field5811 = 1;

   public AbstractGroupFishEntity(EntityType<? extends AbstractGroupFishEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(5, new Class2622(this));
   }

   @Override
   public int method4267() {
      return this.getMaxGroupSize();
   }

   public int getMaxGroupSize() {
      return super.method4267();
   }

   @Override
   public boolean method4797() {
      return !this.method4800();
   }

   public boolean method4800() {
      return this.field5810 != null && this.field5810.isAlive();
   }

   public AbstractGroupFishEntity method4801(AbstractGroupFishEntity var1) {
      this.field5810 = var1;
      var1.method4803();
      return var1;
   }

   public void method4802() {
      this.field5810.method4804();
      this.field5810 = null;
   }

   private void method4803() {
      this.field5811++;
   }

   private void method4804() {
      this.field5811--;
   }

   public boolean method4805() {
      return this.method4806() && this.field5811 < this.getMaxGroupSize();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method4806() && this.world.rand.nextInt(200) == 1) {
         List var3 = this.world.getEntitiesWithinAABB(this.getClass(), this.getBoundingBox().grow(8.0, 8.0, 8.0));
         if (var3.size() <= 1) {
            this.field5811 = 1;
         }
      }
   }

   public boolean method4806() {
      return this.field5811 > 1;
   }

   public boolean method4807() {
      return this.getDistanceSq(this.field5810) <= 121.0;
   }

   public void method4808() {
      if (this.method4800()) {
         this.method4230().method21655(this.field5810, 1.0);
      }
   }

   public void method4809(Stream<AbstractGroupFishEntity> var1) {
      var1.limit((long)(this.getMaxGroupSize() - this.field5811)).filter(var1x -> var1x != this).forEach(var1x -> var1x.method4801(this));
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      super.method4276(var1, var2, var3, (Class5093)var4, var5);
      if (var4 != null) {
         this.method4801(((Class5094)var4).field23182);
      } else {
         var4 = new Class5094(this);
      }

      return (Class5093)var4;
   }
}
