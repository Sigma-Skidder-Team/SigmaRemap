package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class SpectralArrowEntity extends AbstractArrowEntity {
   private int field5110 = 200;

   public SpectralArrowEntity(EntityType<? extends SpectralArrowEntity> var1, World var2) {
      super(var1, var2);
   }

   public SpectralArrowEntity(World var1, LivingEntity var2) {
      super(EntityType.SPECTRAL_ARROW, var2, var1);
   }

   public SpectralArrowEntity(World var1, double var2, double var4, double var6) {
      super(EntityType.SPECTRAL_ARROW, var2, var4, var6, var1);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.world.isRemote && !this.field5100) {
         this.world.addParticle(ParticleTypes.field34081, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public ItemStack method3480() {
      return new ItemStack(Items.field38116);
   }

   @Override
   public void method3478(LivingEntity var1) {
      super.method3478(var1);
      EffectInstance var4 = new EffectInstance(Effects.GLOWING, this.field5110, 0);
      var1.addPotionEffect(var4);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("Duration")) {
         this.field5110 = var1.getInt("Duration");
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Duration", this.field5110);
   }
}
