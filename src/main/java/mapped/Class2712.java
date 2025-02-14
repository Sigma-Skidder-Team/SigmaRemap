package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class2712<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
   private static String[] field17199;
   private int field17200 = 0;

   public Class2712(AbstractRaiderEntity var1, Class<T> var2, boolean var3, Predicate<LivingEntity> var4) {
      super(var1, var2, 500, var3, false, var4);
   }

   public int method10926() {
      return this.field17200;
   }

   public void method10927() {
      this.field17200--;
   }

   @Override
   public boolean method10803() {
      if (this.field17200 > 0 || !this.field17153.getRNG().nextBoolean()) {
         return false;
      } else if (((AbstractRaiderEntity)this.field17153).method4552()) {
         this.method10922();
         return this.field17190 != null;
      } else {
         return false;
      }
   }

   @Override
   public void startExecuting() {
      this.field17200 = 200;
      super.startExecuting();
   }
}
