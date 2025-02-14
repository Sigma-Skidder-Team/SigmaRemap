package mapped;

import java.util.EnumSet;

public class FindFlowerGoal extends Class2661 {
   private static String[] field17037;
   private int field17038;
   public final BeeEntity field17022;

   public FindFlowerGoal(BeeEntity var1) {
      super(var1, null);
      this.field17022 = var1;
      this.field17038 = this.field17022.world.rand.nextInt(10);
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean canBeeStart() {
      return BeeEntity.method4469(this.field17022) != null
         && !this.field17022.method4291()
         && this.method10881()
         && BeeEntity.method4470(this.field17022, BeeEntity.method4469(this.field17022))
         && !BeeEntity.method4458(this.field17022, BeeEntity.method4469(this.field17022), 2);
   }

   @Override
   public boolean canBeeContinue() {
      return this.canBeeStart();
   }

   @Override
   public void startExecuting() {
      this.field17038 = 0;
      super.startExecuting();
   }

   @Override
   public void method10807() {
      this.field17038 = 0;
      BeeEntity.method4471(this.field17022).method21666();
      BeeEntity.method4472(this.field17022).method21641();
   }

   @Override
   public void method10805() {
      if (BeeEntity.method4469(this.field17022) != null) {
         this.field17038++;
         if (this.field17038 <= 600) {
            if (!BeeEntity.method4474(this.field17022).method21665()) {
               if (!BeeEntity.method4459(this.field17022, BeeEntity.method4469(this.field17022))) {
                  BeeEntity.method4460(this.field17022, BeeEntity.method4469(this.field17022));
               } else {
                  BeeEntity.method4473(this.field17022, null);
               }
            }
         } else {
            BeeEntity.method4473(this.field17022, null);
         }
      }
   }

   private boolean method10881() {
      return BeeEntity.method4475(this.field17022) > 2400;
   }
}
