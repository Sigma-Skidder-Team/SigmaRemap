package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;

public class Class1103 extends Class1009 {
   private static String[] field6059;
   private float field6060 = 0.5F;
   private int field6061;
   private static final DataParameter<Byte> field6062 = EntityDataManager.<Byte>createKey(Class1103.class, DataSerializers.field33390);

   public Class1103(EntityType<? extends Class1103> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14191, -1.0F);
      this.method4224(Class2163.field14190, 8.0F);
      this.method4224(Class2163.field14195, 0.0F);
      this.method4224(Class2163.field14196, 0.0F);
      this.field5594 = 10;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(4, new Class2783(this));
      this.field5600.method20002(5, new Class2660(this, 1.0));
      this.field5600.method20002(7, new Class2737(this, 1.0, 0.0F));
      this.field5600.method20002(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
   }

   public static Class7037 method5292() {
      return Class1009.method4343().method21849(Attributes.field42110, 6.0).method21849(Attributes.MOVEMENT_SPEED, 0.23F).method21849(Attributes.field42106, 48.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6062, (byte)0);
   }

   @Override
   public SoundEvent method4241() {
      return Sounds.field26402;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field26405;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field26404;
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public void method2871() {
      if (!this.onGround && this.method3433().y < 0.0) {
         this.method3434(this.method3433().method11347(1.0, 0.6, 1.0));
      }

      if (this.world.isRemote) {
         if (this.rand.nextInt(24) == 0 && !this.method3245()) {
            this.world
               .method6745(
                  this.getPosX() + 0.5,
                  this.getPosY() + 0.5,
                  this.getPosZ() + 0.5,
                  Sounds.field26403,
                  this.method2864(),
                  1.0F + this.rand.nextFloat(),
                  this.rand.nextFloat() * 0.7F + 0.3F,
                  false
               );
         }

         for (int var3 = 0; var3 < 2; var3++) {
            this.world.method6746(Class7940.field34085, this.method3438(0.5), this.method3441(), this.method3445(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.method2871();
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public void method4258() {
      this.field6061--;
      if (this.field6061 <= 0) {
         this.field6061 = 100;
         this.field6060 = 0.5F + (float)this.rand.nextGaussian() * 3.0F;
      }

      LivingEntity var3 = this.method4232();
      if (var3 != null && var3.method3442() > this.method3442() + (double)this.field6060 && this.method3026(var3)) {
         Vector3d var4 = this.method3433();
         this.method3434(this.method3433().method11339(0.0, (0.3F - var4.y) * 0.3F, 0.0));
         this.isAirBorne = true;
      }

      super.method4258();
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method3327() {
      return this.method5293();
   }

   private boolean method5293() {
      return (this.dataManager.<Byte>method35445(field6062) & 1) != 0;
   }

   private void method5294(boolean var1) {
      byte var4 = this.dataManager.method35445(field6062);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.dataManager.method35446(field6062, var4);
   }

   // $VF: synthetic method
   public static void method5295(Class1103 var0, boolean var1) {
      var0.method5294(var1);
   }
}
