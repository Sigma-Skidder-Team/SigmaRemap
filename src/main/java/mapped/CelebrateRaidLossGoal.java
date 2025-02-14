package mapped;

import net.minecraft.world.raid.Raid;

import java.util.EnumSet;

public class CelebrateRaidLossGoal extends Class2595 {
   private static String[] field17235;
   private final AbstractRaiderEntity field17236;
   public final AbstractRaiderEntity field17237;

   public CelebrateRaidLossGoal(AbstractRaiderEntity var1, AbstractRaiderEntity var2) {
      this.field17237 = var1;
      this.field17236 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      Raid var3 = this.field17236.method4551();
      return this.field17236.isAlive() && this.field17236.getAttackTarget() == null && var3 != null && var3.method25393();
   }

   @Override
   public void startExecuting() {
      this.field17236.method4556(true);
      super.startExecuting();
   }

   @Override
   public void method10807() {
      this.field17236.method4556(false);
      super.method10807();
   }

   @Override
   public void method10805() {
      if (!this.field17236.isSilent() && AbstractRaiderEntity.method4560(this.field17236).nextInt(100) == 0) {
         this.field17237.playSound(this.field17237.method4546(), AbstractRaiderEntity.method4561(this.field17237), AbstractRaiderEntity.method4562(this.field17237));
      }

      if (!this.field17236.isPassenger() && AbstractRaiderEntity.method4563(this.field17236).nextInt(50) == 0) {
         this.field17236.method4229().method27049();
      }

      super.method10805();
   }
}
