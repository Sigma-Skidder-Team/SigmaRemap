package mapped;

import com.google.common.base.Predicates;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.scoreboard.Team;
import net.minecraft.world.Difficulty;

import java.util.function.Predicate;

public final class EntityPredicates {
   private static String[] field34756;
   public static final Predicate<Entity> IS_ALIVE = Entity::isAlive;
   public static final Predicate<LivingEntity> field34758 = LivingEntity::isAlive;
   public static final Predicate<Entity> field34759 = var0 -> var0.isAlive() && !var0.isBeingRidden() && !var0.isPassenger();
   public static final Predicate<Entity> field34760 = var0 -> var0 instanceof IInventory && var0.isAlive();
   public static final Predicate<Entity> field34761 = var0 -> !(var0 instanceof PlayerEntity) || !var0.isSpectator() && !((PlayerEntity)var0).isCreative();
   public static final Predicate<Entity> field34762 = var0 -> !(var0 instanceof PlayerEntity)
         || !var0.isSpectator() && !((PlayerEntity)var0).isCreative() && var0.world.method6997() != Difficulty.PEACEFUL;
   public static final Predicate<Entity> field34763 = var0 -> !var0.isSpectator();

   public static Predicate<Entity> withinRange(double var0, double var2, double var4, double var6) {
      double var10 = var6 * var6;
      return var8 -> var8 != null && var8.getDistanceNearest(var0, var2, var4) <= var10;
   }

   public static Predicate<Entity> method27981(Entity var0) {
      Team var3 = var0.getTeam();
      Team.CollisionRule var4 = var3 != null ? var3.method28586() : Team.CollisionRule.ALWAYS;
      return (Predicate<Entity>)(var4 != Team.CollisionRule.NEVER
         ? field34763.and(
            var3x -> {
               if (!var3x.canBePushed()) {
                  return false;
               } else if (!var0.world.isRemote || var3x instanceof PlayerEntity && ((PlayerEntity)var3x).method2905()) {
                  Team var6 = var3x.getTeam();
                  Team.CollisionRule var7 = var6 != null ? var6.method28586() : Team.CollisionRule.ALWAYS;
                  if (var7 == Team.CollisionRule.NEVER) {
                     return false;
                  } else {
                     boolean var8 = var3 != null && var3.method28592(var6);
                     return (var4 == Team.CollisionRule.PUSH_OWN_TEAM || var7 == Team.CollisionRule.PUSH_OWN_TEAM) && var8
                        ? false
                        : var4 != Team.CollisionRule.PUSH_OTHER_TEAMS && var7 != Team.CollisionRule.PUSH_OTHER_TEAMS || var8;
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
