package mapped;

import net.minecraft.entity.monster.ZombieEntity;

public class ZombieAttackGoal extends MeleeAttackGoal {
   private static String[] field16989;
   private final ZombieEntity field17006;
   private int field17007;

   public ZombieAttackGoal(ZombieEntity var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.field17006 = var1;
   }

   @Override
   public void startExecuting() {
      super.startExecuting();
      this.field17007 = 0;
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field17006.method4304(false);
   }

   @Override
   public void method10805() {
      super.method10805();
      this.field17007++;
      if (this.field17007 >= 5 && this.method10857() < this.method10858() / 2) {
         this.field17006.method4304(true);
      } else {
         this.field17006.method4304(false);
      }
   }
}
