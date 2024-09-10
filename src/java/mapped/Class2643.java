package mapped;

import net.minecraft.world.Difficulty;

import java.util.function.Predicate;

public class Class2643 extends Class2642 {
   private static String[] field16980;
   private final Predicate<Difficulty> field16981;
   public int field16982;
   public int field16983 = -1;
   public int field16984 = -1;

   public Class2643(MobEntity var1, Predicate<Difficulty> var2) {
      super(var1);
      this.field16981 = var2;
   }

   public Class2643(MobEntity var1, int var2, Predicate<Difficulty> var3) {
      this(var1, var3);
      this.field16984 = var2;
   }

   public int method10852() {
      return Math.max(240, this.field16984);
   }

   @Override
   public boolean method10803() {
      if (super.method10803()) {
         return !this.field16974.world.getGameRules().getBoolean(Class5462.field24224)
            ? false
            : this.method10853(this.field16974.world.method6997()) && !this.method10850();
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16982 = 0;
   }

   @Override
   public boolean method10806() {
      return this.field16982 <= this.method10852()
         && !this.method10850()
         && this.field16975.method8317(this.field16974.getPositionVec(), 2.0)
         && this.method10853(this.field16974.world.method6997());
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16974.world.sendBlockBreakProgress(this.field16974.getEntityId(), this.field16975, -1);
   }

   @Override
   public void method10805() {
      super.method10805();
      if (this.field16974.getRNG().nextInt(20) == 0) {
         this.field16974.world.playEvent(1019, this.field16975, 0);
         if (!this.field16974.isSwingInProgress) {
            this.field16974.swingArm(this.field16974.getActiveHand());
         }
      }

      this.field16982++;
      int var3 = (int)((float)this.field16982 / (float)this.method10852() * 10.0F);
      if (var3 != this.field16983) {
         this.field16974.world.sendBlockBreakProgress(this.field16974.getEntityId(), this.field16975, var3);
         this.field16983 = var3;
      }

      if (this.field16982 == this.method10852() && this.method10853(this.field16974.world.method6997())) {
         this.field16974.world.removeBlock(this.field16975, false);
         this.field16974.world.playEvent(1021, this.field16975, 0);
         this.field16974.world.playEvent(2001, this.field16975, Block.getStateId(this.field16974.world.getBlockState(this.field16975)));
      }
   }

   private boolean method10853(Difficulty var1) {
      return this.field16981.test(var1);
   }
}
