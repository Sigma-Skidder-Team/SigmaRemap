package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class Class1106 extends Class1105 {
   private static String[] field6077;
   public static final float field6078 = EntityType.field41022.method33213() / EntityType.field41036.method33213();

   public Class1106(EntityType<? extends Class1106> var1, World var2) {
      super(var1, var2);
      this.method4278();
      if (this.field6076 != null) {
         this.field6076.method10945(400);
      }
   }

   public static Class7037 method5314() {
      return Class1105.method5300().method21849(Attributes.MOVEMENT_SPEED, 0.3F).method21849(Attributes.field42110, 8.0).method21849(Attributes.field42105, 80.0);
   }

   @Override
   public int method5303() {
      return 60;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.method3255() ? SoundEvents.field26525 : SoundEvents.field26524;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return !this.method3255() ? SoundEvents.field26531 : SoundEvents.field26530;
   }

   @Override
   public SoundEvent getDeathSound() {
      return !this.method3255() ? SoundEvents.field26528 : SoundEvents.field26527;
   }

   @Override
   public SoundEvent method5307() {
      return SoundEvents.field26529;
   }

   @Override
   public void method4258() {
      super.method4258();
      short var3 = 1200;
      if ((this.ticksExisted + this.getEntityId()) % 1200 == 0) {
         Effect var4 = Effects.MINING_FATIGUE;
         List<ServerPlayerEntity> var5 = ((ServerWorld)this.world).method6914(var1 -> this.getDistanceSq(var1) < 2500.0 && var1.field4857.method33865());

         for (ServerPlayerEntity var10 : var5) {
            if (!var10.isPotionActive(var4) || var10.getActivePotionEffect(var4).method8629() < 2 || var10.getActivePotionEffect(var4).method8628() < 1200) {
               var10.field4855.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24570, !this.isSilent() ? 1.0F : 0.0F));
               var10.addPotionEffect(new EffectInstance(var4, 6000, 2));
            }
         }
      }

      if (!this.method4291()) {
         this.method4288(this.getPosition(), 16);
      }
   }
}
