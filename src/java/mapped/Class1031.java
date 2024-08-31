package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;

public abstract class Class1031 extends Class1025 {
   private static final DataParameter<Byte> field5733 = EntityDataManager.<Byte>createKey(Class1031.class, DataSerializers.field33390);
   public int field5734;
   private Class2031 field5735 = Class2031.field13181;

   public Class1031(EntityType<? extends Class1031> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5733, (byte)0);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5734 = var1.method122("SpellTicks");
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("SpellTicks", this.field5734);
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4594()) {
         return !this.method4555() ? Class2117.field13794 : Class2117.field13800;
      } else {
         return Class2117.field13796;
      }
   }

   public boolean method4594() {
      return !this.world.isRemote ? this.field5734 > 0 : this.dataManager.<Byte>method35445(field5733) > 0;
   }

   public void method4595(Class2031 var1) {
      this.field5735 = var1;
      this.dataManager.method35446(field5733, (byte)Class2031.method8665(var1));
   }

   public Class2031 method4596() {
      return this.world.isRemote ? Class2031.method8664(this.dataManager.<Byte>method35445(field5733)) : this.field5735;
   }

   @Override
   public void method4258() {
      super.method4258();
      if (this.field5734 > 0) {
         this.field5734--;
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (this.world.isRemote && this.method4594()) {
         Class2031 var3 = this.method4596();
         double var4 = Class2031.method8666(var3)[0];
         double var6 = Class2031.method8666(var3)[1];
         double var8 = Class2031.method8666(var3)[2];
         float var10 = this.field4965 * (float) (Math.PI / 180.0) + MathHelper.cos((float)this.ticksExisted * 0.6662F) * 0.25F;
         float var11 = MathHelper.cos(var10);
         float var12 = MathHelper.sin(var10);
         this.world
            .method6746(
               ParticleTypes.field34068,
               this.getPosX() + (double)var11 * 0.6,
               this.getPosY() + 1.8,
               this.getPosZ() + (double)var12 * 0.6,
               var4,
               var6,
               var8
            );
         this.world
            .method6746(
               ParticleTypes.field34068,
               this.getPosX() - (double)var11 * 0.6,
               this.getPosY() + 1.8,
               this.getPosZ() - (double)var12 * 0.6,
               var4,
               var6,
               var8
            );
      }
   }

   public int method4597() {
      return this.field5734;
   }

   public abstract SoundEvent method4598();

   // $VF: synthetic method
   public static Class6990 method4599(Class1031 var0) {
      return var0.field5599;
   }
}
