package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.EnumSet;
import java.util.function.Predicate;

public class NearestAttackableTargetGoal<T extends LivingEntity> extends Class2699 {
   private static String[] field17187;
   public final Class<T> field17188;
   public final int field17189;
   public LivingEntity field17190;
   public EntityPredicate field17191;

   public NearestAttackableTargetGoal(MobEntity var1, Class<T> var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public NearestAttackableTargetGoal(MobEntity var1, Class<T> var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate<LivingEntity>)null);
   }

   public NearestAttackableTargetGoal(MobEntity var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<LivingEntity> var6) {
      super(var1, var4, var5);
      this.field17188 = var2;
      this.field17189 = var3;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
      this.field17191 = new EntityPredicate().method30203(this.method10914()).method30209(var6);
   }

   @Override
   public boolean method10803() {
      if (this.field17189 > 0 && this.field17153.getRNG().nextInt(this.field17189) != 0) {
         return false;
      } else {
         this.method10922();
         return this.field17190 != null;
      }
   }

   public AxisAlignedBB method10921(double var1) {
      return this.field17153.getBoundingBox().grow(var1, 4.0, var1);
   }

   public void method10922() {
      if (this.field17188 != PlayerEntity.class && this.field17188 != ServerPlayerEntity.class) {
         this.field17190 = this.field17153
            .world
            .<LivingEntity>method7192(
               this.field17188,
               this.field17191,
               this.field17153,
               this.field17153.getPosX(),
               this.field17153.getPosYEye(),
               this.field17153.getPosZ(),
               this.method10921(this.method10914())
            );
      } else {
         this.field17190 = this.field17153
            .world
            .method7189(this.field17191, this.field17153, this.field17153.getPosX(), this.field17153.getPosYEye(), this.field17153.getPosZ());
      }
   }

   @Override
   public void startExecuting() {
      this.field17153.setAttackTarget(this.field17190);
      super.startExecuting();
   }

   public void method10923(LivingEntity var1) {
      this.field17190 = var1;
   }
}
