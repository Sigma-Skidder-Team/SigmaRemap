package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ExperienceBottleEntity extends Class890 {
   private static String[] field5127;

   public ExperienceBottleEntity(EntityType<? extends ExperienceBottleEntity> var1, World var2) {
      super(var1, var2);
   }

   public ExperienceBottleEntity(World var1, LivingEntity var2) {
      super(EntityType.EXPERIENCE_BOTTLE, var2, var1);
   }

   public ExperienceBottleEntity(World var1, double var2, double var4, double var6) {
      super(EntityType.EXPERIENCE_BOTTLE, var2, var4, var6, var1);
   }

   @Override
   public Item method3512() {
      return Items.EXPERIENCE_BOTTLE;
   }

   @Override
   public float method3515() {
      return 0.07F;
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         this.world.playEvent(2002, this.getPosition(), PotionUtils.method38183(Class8137.field34977));
         int var4 = 3 + this.world.rand.nextInt(5) + this.world.rand.nextInt(5);

         while (var4 > 0) {
            int var5 = ExperienceOrbEntity.getXPSplit(var4);
            var4 -= var5;
            this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), var5));
         }

         this.remove();
      }
   }
}
