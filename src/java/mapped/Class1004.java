package mapped;

import net.minecraft.entity.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class1004 extends Entity {
   private static final DataParameter<Integer> field5562 = EntityDataManager.<Integer>createKey(Class1004.class, DataSerializers.VARINT);
   private LivingEntity field5563;
   private int field5564 = 80;

   public Class1004(EntityType<? extends Class1004> var1, World var2) {
      super(var1, var2);
      this.preventEntitySpawning = true;
   }

   public Class1004(World var1, double var2, double var4, double var6, LivingEntity var8) {
      this(EntityType.field41069, var1);
      this.setPosition(var2, var4, var6);
      double var11 = var1.rand.nextDouble() * (float) (Math.PI * 2);
      this.method3435(-Math.sin(var11) * 0.02, 0.2F, -Math.cos(var11) * 0.02);
      this.method4182(80);
      this.prevPosX = var2;
      this.prevPosY = var4;
      this.prevPosZ = var6;
      this.field5563 = var8;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5562, 80);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public boolean method3139() {
      return !this.removed;
   }

   @Override
   public void tick() {
      if (!this.method3247()) {
         this.method3434(this.getVec().method11339(0.0, -0.04, 0.0));
      }

      this.move(Class2107.field13742, this.getVec());
      this.method3434(this.getVec().method11344(0.98));
      if (this.onGround) {
         this.method3434(this.getVec().method11347(0.7, -0.5, 0.7));
      }

      this.field5564--;
      if (this.field5564 > 0) {
         this.method3257();
         if (this.world.isRemote) {
            this.world.method6746(ParticleTypes.field34092, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 0.0, 0.0, 0.0);
         }
      } else {
         this.method2904();
         if (!this.world.isRemote) {
            this.method4180();
         }
      }
   }

   private void method4180() {
      float var3 = 4.0F;
      this.world.method6755(this, this.getPosX(), this.method3440(0.0625), this.getPosZ(), 4.0F, Class2141.field14015);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      var1.method101("Fuse", (short)this.method4184());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      this.method4182(var1.getShort("Fuse"));
   }

   @Nullable
   public LivingEntity method4181() {
      return this.field5563;
   }

   @Override
   public float method3181(Pose var1, EntitySize var2) {
      return 0.15F;
   }

   public void method4182(int var1) {
      this.dataManager.method35446(field5562, var1);
      this.field5564 = var1;
   }

   @Override
   public void method3155(DataParameter<?> var1) {
      if (field5562.equals(var1)) {
         this.field5564 = this.method4183();
      }
   }

   public int method4183() {
      return this.dataManager.<Integer>method35445(field5562);
   }

   public int method4184() {
      return this.field5564;
   }

   @Override
   public Packet<?> method2835() {
      return new SSpawnObjectPacket(this);
   }
}
