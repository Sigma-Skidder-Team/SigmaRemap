package remapped;

import java.util.function.Predicate;

public class class_9625<T extends class_5834> extends NearestAttackableTargetGoal<T> {
   private static String[] field_49024;
   private int field_49025 = 0;

   public class_9625(AbstractRaiderEntity var1, Class<T> var2, boolean var3, Predicate<class_5834> var4) {
      super(var1, var2, 500, var3, false, var4);
   }

   public int method_44423() {
      return this.field_49025;
   }

   public void method_44424() {
      this.field_49025--;
   }

   @Override
   public boolean method_16795() {
      if (this.field_49025 > 0 || !this.field_4915.method_26594().nextBoolean()) {
         return false;
      } else if (((AbstractRaiderEntity)this.field_4915).method_18600()) {
         this.method_19213();
         return this.field_20146 != null;
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_49025 = 200;
      super.method_16796();
   }
}
