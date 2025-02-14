package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;

public class Class2768 extends Class2595 {
   private static String[] field17343;
   private int field17344;
   public final PhantomEntity field17345;

   public Class2768(PhantomEntity var1) {
      this.field17345 = var1;
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17345.getAttackTarget();
      return var3 == null ? false : this.field17345.canAttack(this.field17345.getAttackTarget(), EntityPredicate.field38240);
   }

   @Override
   public void method10804() {
      this.field17344 = 10;
      PhantomEntity.method5352(this.field17345, Class2143.field14028);
      this.method10963();
   }

   @Override
   public void method10807() {
      PhantomEntity.method5350(
         this.field17345,
         this.field17345
            .world
            .getHeight(Heightmap.Type.MOTION_BLOCKING, PhantomEntity.method5349(this.field17345))
            .up(10 + PhantomEntity.method5353(this.field17345).nextInt(20))
      );
   }

   @Override
   public void method10805() {
      if (PhantomEntity.method5340(this.field17345) == Class2143.field14028) {
         this.field17344--;
         if (this.field17344 <= 0) {
            PhantomEntity.method5352(this.field17345, Class2143.field14029);
            this.method10963();
            this.field17344 = (8 + PhantomEntity.method5354(this.field17345).nextInt(4)) * 20;
            this.field17345.playSound(SoundEvents.field26923, 10.0F, 0.95F + PhantomEntity.method5355(this.field17345).nextFloat() * 0.1F);
         }
      }
   }

   private void method10963() {
      PhantomEntity.method5350(this.field17345, this.field17345.getAttackTarget().getPosition().up(20 + PhantomEntity.method5356(this.field17345).nextInt(20)));
      if (PhantomEntity.method5349(this.field17345).getY() < this.field17345.world.getSeaLevel()) {
         PhantomEntity.method5350(
            this.field17345,
            new BlockPos(
               PhantomEntity.method5349(this.field17345).getX(),
               this.field17345.world.getSeaLevel() + 1,
               PhantomEntity.method5349(this.field17345).getZ()
            )
         );
      }
   }
}
