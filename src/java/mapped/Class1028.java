package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.raid.Raid;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class1028 extends MonsterEntity {
   private BlockPos field5724;
   private boolean field5725;
   private boolean field5726;

   public Class1028(EntityType<? extends Class1028> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(4, new Class2723<Class1028>(this, 0.7, 0.595));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field5724 != null) {
         var1.put("PatrolTarget", NBTUtil.writeBlockPos(this.field5724));
      }

      var1.putBoolean("PatrolLeader", this.field5725);
      var1.putBoolean("Patrolling", this.field5726);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("PatrolTarget")) {
         this.field5724 = NBTUtil.readBlockPos(var1.getCompound("PatrolTarget"));
      }

      this.field5725 = var1.getBoolean("PatrolLeader");
      this.field5726 = var1.getBoolean("Patrolling");
   }

   @Override
   public double getYOffset() {
      return -0.45;
   }

   public boolean method4570() {
      return true;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var3 != Class2202.field14406
         && var3 != Class2202.field14398
         && var3 != Class2202.field14394
         && this.rand.nextFloat() < 0.06F
         && this.method4570()) {
         this.field5725 = true;
      }

      if (this.method4577()) {
         this.setItemStackToSlot(EquipmentSlotType.HEAD, Raid.method25421());
         this.method4279(EquipmentSlotType.HEAD, 2.0F);
      }

      if (var3 == Class2202.field14406) {
         this.field5726 = true;
      }

      return super.method4276(var1, var2, var3, var4, var5);
   }

   public static boolean method4572(EntityType<? extends Class1028> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.getLightFor(LightType.BLOCK, var3) <= 8 ? canMonsterSpawn(var0, var1, var2, var3, var4) : false;
   }

   @Override
   public boolean method4254(double var1) {
      return !this.field5726 || var1 > 16384.0;
   }

   public void method4573(BlockPos var1) {
      this.field5724 = var1;
      this.field5726 = true;
   }

   public BlockPos method4574() {
      return this.field5724;
   }

   public boolean method4575() {
      return this.field5724 != null;
   }

   public void method4576(boolean var1) {
      this.field5725 = var1;
      this.field5726 = true;
   }

   public boolean method4577() {
      return this.field5725;
   }

   public boolean method4549() {
      return true;
   }

   public void method4578() {
      this.field5724 = this.getPosition().add(-500 + this.rand.nextInt(1000), 0, -500 + this.rand.nextInt(1000));
      this.field5726 = true;
   }

   public boolean method4579() {
      return this.field5726;
   }

   public void method4580(boolean var1) {
      this.field5726 = var1;
   }
}
