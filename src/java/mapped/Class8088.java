package mapped;

import com.google.common.base.Predicates;
import net.minecraft.entity.Entity;

import java.util.function.Predicate;

public final class Class8088 {
   private static String[] field34756;
   public static final Predicate<Entity> field34757 = Entity::method3066;
   public static final Predicate<Class880> field34758 = Class880::method3066;
   public static final Predicate<Entity> field34759 = var0 -> var0.method3066() && !var0.isBeingRidden() && !var0.isPassenger();
   public static final Predicate<Entity> field34760 = var0 -> var0 instanceof Class920 && var0.method3066();
   public static final Predicate<Entity> field34761 = var0 -> !(var0 instanceof PlayerEntity) || !var0.isSpectator() && !((PlayerEntity)var0).isCreative();
   public static final Predicate<Entity> field34762 = var0 -> !(var0 instanceof PlayerEntity)
         || !var0.isSpectator() && !((PlayerEntity)var0).isCreative() && var0.world.method6997() != Class2197.field14351;
   public static final Predicate<Entity> field34763 = var0 -> !var0.isSpectator();

   public static Predicate<Entity> method27980(double var0, double var2, double var4, double var6) {
      double var10 = var6 * var6;
      return var8 -> var8 != null && var8.method3276(var0, var2, var4) <= var10;
   }

   public static Predicate<Entity> method27981(Entity var0) {
      Team var3 = var0.getTeam();
      Class2212 var4 = var3 != null ? var3.method28586() : Class2212.field14462;
      return (Predicate<Entity>)(var4 != Class2212.field14463
         ? field34763.and(
            var3x -> {
               if (!var3x.method3140()) {
                  return false;
               } else if (!var0.world.isRemote || var3x instanceof PlayerEntity && ((PlayerEntity)var3x).method2905()) {
                  Team var6 = var3x.getTeam();
                  Class2212 var7 = var6 != null ? var6.method28586() : Class2212.field14462;
                  if (var7 == Class2212.field14463) {
                     return false;
                  } else {
                     boolean var8 = var3 != null && var3.method28592(var6);
                     return (var4 == Class2212.field14465 || var7 == Class2212.field14465) && var8
                        ? false
                        : var4 != Class2212.field14464 && var7 != Class2212.field14464 || var8;
                  }
               } else {
                  return false;
               }
            }
         )
         : Predicates.alwaysFalse());
   }

   public static Predicate<Entity> method27982(Entity var0) {
      return var1 -> {
         while (var1.isPassenger()) {
            var1 = var1.getRidingEntity();
            if (var1 == var0) {
               return false;
            }
         }

         return true;
      };
   }
}
