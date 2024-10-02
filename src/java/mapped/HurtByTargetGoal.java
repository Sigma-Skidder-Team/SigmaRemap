package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.GameRules;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class HurtByTargetGoal extends Class2699 {
   private static String[] field17178;
   private static final Class8522 field17179 = new Class8522().method30206().method30208();
   private boolean field17180;
   private int field17181;
   private final Class<?>[] field17182;
   private Class<?>[] field17183;

   public HurtByTargetGoal(Class1046 var1, Class<?>... var2) {
      super(var1, true);
      this.field17182 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      int var3 = this.field17153.method3015();
      LivingEntity var4 = this.field17153.method3014();
      if (var3 != this.field17181 && var4 != null) {
         if (var4.getType() == EntityType.PLAYER && this.field17153.world.getGameRules().getBoolean(GameRules.field24255)) {
            return false;
         } else {
            for (Class var8 : this.field17182) {
               if (var8.isAssignableFrom(var4.getClass())) {
                  return false;
               }
            }

            return this.method10915(var4, field17179);
         }
      } else {
         return false;
      }
   }

   public HurtByTargetGoal method10918(Class<?>... var1) {
      this.field17180 = true;
      this.field17183 = var1;
      return this;
   }

   @Override
   public void method10804() {
      this.field17153.method4233(this.field17153.method3014());
      this.field17159 = this.field17153.method4232();
      this.field17181 = this.field17153.method3015();
      this.field17160 = 300;
      if (this.field17180) {
         this.method10919();
      }

      super.method10804();
   }

   public void method10919() {
      double var3 = this.method10914();
      AxisAlignedBB var5 = AxisAlignedBB.method19657(this.field17153.getPositionVec()).grow(var3, 10.0, var3);
      List var6 = this.field17153.world.method7183(this.field17153.getClass(), var5);
      Iterator var7 = var6.iterator();

      while (true) {
         MobEntity var8;
         while (true) {
            if (!var7.hasNext()) {
               return;
            }

            var8 = (MobEntity)var7.next();
            if (this.field17153 != var8
               && var8.method4232() == null
               && (!(this.field17153 instanceof TameableEntity) || ((TameableEntity)this.field17153).method4400() == ((TameableEntity)var8).method4400())
               && !var8.isOnSameTeam(this.field17153.method3014())) {
               if (this.field17183 == null) {
                  break;
               }

               boolean var9 = false;

               for (Class var13 : this.field17183) {
                  if (var8.getClass() == var13) {
                     var9 = true;
                     break;
                  }
               }

               if (!var9) {
                  break;
               }
            }
         }

         this.method10920(var8, this.field17153.method3014());
      }
   }

   public void method10920(MobEntity var1, LivingEntity var2) {
      var1.method4233(var2);
   }
}
