package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;

import java.util.EnumSet;

public class Class2702 extends Class2699 {
   private static String[] field17170;
   private final TameableEntity field17171;
   private LivingEntity field17172;
   private int field17173;

   public Class2702(TameableEntity var1) {
      super(var1, false);
      this.field17171 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      if (this.field17171.method4393() && !this.field17171.method4402()) {
         LivingEntity var3 = this.field17171.method4400();
         if (var3 == null) {
            return false;
         } else {
            this.field17172 = var3.getRevengeTarget();
            int var4 = var3.getRevengeTiemr();
            return var4 != this.field17173 && this.method10915(this.field17172, EntityPredicate.field38240) && this.field17171.method4388(this.field17172, var3);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17153.method4233(this.field17172);
      LivingEntity var3 = this.field17171.method4400();
      if (var3 != null) {
         this.field17173 = var3.getRevengeTiemr();
      }

      super.method10804();
   }
}
