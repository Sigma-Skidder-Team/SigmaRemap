package remapped;

import java.util.function.Predicate;

public class class_9724 extends NearestAttackableTargetGoal<PlayerEntity> {
   private static String[] field_49435;

   public class_9724(class_9668 var1) {
      super(var1, PlayerEntity.class, 20, true, true, (Predicate<class_5834>)null);
      this.field_49434 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_49434.method_26449()) {
         return false;
      } else {
         if (super.method_16795()) {
            for (class_9668 var4 : this.field_49434
               .field_41768
               .<class_9668>method_25868(class_9668.class, this.field_49434.method_37241().method_18899(8.0, 4.0, 8.0))) {
               if (var4.method_26449()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public double method_4211() {
      return super.method_4211() * 0.5;
   }
}
