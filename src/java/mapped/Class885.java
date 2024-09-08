package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public class Class885 extends AbstractArrowEntity {
   private int field5110 = 200;

   public Class885(EntityType<? extends Class885> var1, World var2) {
      super(var1, var2);
   }

   public Class885(World var1, LivingEntity var2) {
      super(EntityType.field41084, var2, var1);
   }

   public Class885(World var1, double var2, double var4, double var6) {
      super(EntityType.field41084, var2, var4, var6, var1);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.world.isRemote && !this.field5100) {
         this.world.method6746(ParticleTypes.field34081, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public ItemStack method3480() {
      return new ItemStack(Items.field38116);
   }

   @Override
   public void method3478(LivingEntity var1) {
      super.method3478(var1);
      Class2023 var4 = new Class2023(Effects.GLOWING, this.field5110, 0);
      var1.method3035(var4);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.contains("Duration")) {
         this.field5110 = var1.getInt("Duration");
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("Duration", this.field5110);
   }
}
