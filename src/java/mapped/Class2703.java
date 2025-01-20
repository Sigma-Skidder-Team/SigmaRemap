package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;

import java.util.EnumSet;

public class Class2703 extends Class2699 {
   private static String[] field17174;
   private final TameableEntity field17175;
   private LivingEntity field17176;
   private int field17177;

   public Class2703(TameableEntity var1) {
      super(var1, false);
      this.field17175 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      if (this.field17175.method4393() && !this.field17175.method4402()) {
         LivingEntity var3 = this.field17175.method4400();
         if (var3 == null) {
            return false;
         } else {
            this.field17176 = var3.getLastAttackedEntity();
            int var4 = var3.getLastAttackedEntityTime();
            return var4 != this.field17177 && this.method10915(this.field17176, EntityPredicate.field38240) && this.field17175.method4388(this.field17176, var3);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17153.method4233(this.field17176);
      LivingEntity var3 = this.field17175.method4400();
      if (var3 != null) {
         this.field17177 = var3.getLastAttackedEntityTime();
      }

      super.method10804();
   }
}
