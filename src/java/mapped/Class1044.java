package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class Class1044 extends Class1043 {
   private BlockPos field5798;
   private int field5799;

   public Class1044(EntityType<? extends Class1044> var1, World var2) {
      super(var1, var2);
      this.forceSpawn = true;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600
         .method20002(
            0,
            new Class2596<Class1044>(
               this,
               Class9741.method38187(new ItemStack(Items.field37971), Class8137.field34983),
               Sounds.field27217,
               var1 -> this.world.method6741() && !var1.method3342()
            )
         );
      this.field5600
         .method20002(
            0,
            new Class2596<Class1044>(this, new ItemStack(Items.field37891), Sounds.field27222, var1 -> this.world.method6740() && var1.method3342())
         );
      this.field5600.method20002(1, new Class2781(this));
      this.field5600.method20002(1, new Class2770<Class1038>(this, Class1038.class, 8.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1032>(this, Class1032.class, 12.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1030>(this, Class1030.class, 8.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1100>(this, Class1100.class, 8.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1024>(this, Class1024.class, 15.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1033>(this, Class1033.class, 12.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1093>(this, Class1093.class, 10.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2747(this, 0.5));
      this.field5600.method20002(1, new Class2615(this));
      this.field5600.method20002(2, new Class2789(this, this, 2.0, 0.35));
      this.field5600.method20002(4, new Class2660(this, 0.35));
      this.field5600.method20002(8, new Class2737(this, 0.35));
      this.field5600.method20002(9, new Class2613(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 8.0F));
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return null;
   }

   @Override
   public boolean method4746() {
      return false;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() != Items.field38034 && this.isAlive() && !this.method4741() && !this.method3005()) {
         if (var2 == Hand.MAIN_HAND) {
            var1.method2911(Class8876.field40139);
         }

         if (!this.method4742().isEmpty()) {
            if (!this.world.isRemote) {
               this.method4683(var1);
               this.method4872(var1, this.getDisplayName(), 1);
            }

            return ActionResultType.method9002(this.world.isRemote);
         } else {
            return ActionResultType.method9002(this.world.isRemote);
         }
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void method4713() {
      Class5391[] var3 = (Class5391[])Class9721.field45415.get(1);
      Class5391[] var4 = (Class5391[])Class9721.field45415.get(2);
      if (var3 != null && var4 != null) {
         Class46 var5 = this.method4742();
         this.method4754(var5, var3, 5);
         int var6 = this.rand.nextInt(var4.length);
         Class5391 var7 = var4[var6];
         Class9346 var8 = var7.method16977(this, this.rand);
         if (var8 != null) {
            var5.add(var8);
         }
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("DespawnDelay", this.field5799);
      if (this.field5798 != null) {
         var1.put("WanderTarget", Class8354.method29284(this.field5798));
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.contains("DespawnDelay", 99)) {
         this.field5799 = var1.getInt("DespawnDelay");
      }

      if (var1.contains("WanderTarget")) {
         this.field5798 = Class8354.method29283(var1.getCompound("WanderTarget"));
      }

      this.method4770(Math.max(0, this.method4767()));
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }

   @Override
   public void method4696(Class9346 var1) {
      if (var1.method35385()) {
         int var4 = 3 + this.rand.nextInt(4);
         this.world.method6916(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), var4));
      }
   }

   @Override
   public SoundEvent method4241() {
      return !this.method4741() ? Sounds.field27215 : Sounds.field27223;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field27220;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field27216;
   }

   @Override
   public SoundEvent method3059(ItemStack var1) {
      Item var4 = var1.getItem();
      return var4 != Items.field37891 ? Sounds.field27219 : Sounds.field27218;
   }

   @Override
   public SoundEvent method4749(boolean var1) {
      return !var1 ? Sounds.field27221 : Sounds.field27224;
   }

   @Override
   public SoundEvent method4748() {
      return Sounds.field27224;
   }

   public void method4755(int var1) {
      this.field5799 = var1;
   }

   public int method4756() {
      return this.field5799;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.world.isRemote) {
         this.method4757();
      }
   }

   private void method4757() {
      if (this.field5799 > 0 && !this.method4741() && --this.field5799 == 0) {
         this.method2904();
      }
   }

   public void method4758(BlockPos var1) {
      this.field5798 = var1;
   }

   @Nullable
   private BlockPos method4759() {
      return this.field5798;
   }

   // $VF: synthetic method
   public static Class6990 method4762(Class1044 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4763(Class1044 var0) {
      return var0.method4759();
   }

   // $VF: synthetic method
   public static Class6990 method4764(Class1044 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4765(Class1044 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4766(Class1044 var0) {
      return var0.field5599;
   }
}
