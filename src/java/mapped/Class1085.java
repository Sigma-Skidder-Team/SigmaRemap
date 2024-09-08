package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Class1085 extends Class1082 {
   private static String[] field5950;

   public Class1085(EntityType<? extends Class1085> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27059;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27069;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27060;
   }

   @Override
   public SoundEvent method5030() {
      return SoundEvents.field27071;
   }

   @Override
   public void method3054(DamageSource var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      Entity var6 = var1.method31109();
      if (var6 instanceof Class1081) {
         Class1081 var7 = (Class1081)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.method3300(Items.field38058);
         }
      }
   }
}
