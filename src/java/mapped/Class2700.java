package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.EnumSet;
import java.util.List;

public class Class2700 extends Class2699 {
   private static String[] field17161;
   private final IronGolemEntity field17162;
   private LivingEntity field17163;
   private final EntityPredicate field17164 = new EntityPredicate().method30203(64.0);

   public Class2700(IronGolemEntity var1) {
      super(var1, false, true);
      this.field17162 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      AxisAlignedBB var3 = this.field17162.getBoundingBox().grow(10.0, 8.0, 10.0);
      List<VillagerEntity> var4 = this.field17162.world.<VillagerEntity>method7195(VillagerEntity.class, this.field17164, this.field17162, var3);
      List<PlayerEntity> var5 = this.field17162.world.method7194(this.field17164, this.field17162, var3);

      for (LivingEntity var7 : var4) {
         VillagerEntity var8 = (VillagerEntity)var7;

         for (PlayerEntity var10 : var5) {
            int var11 = var8.method4703(var10);
            if (var11 <= -100) {
               this.field17163 = var10;
            }
         }
      }

      return this.field17163 == null
         ? false
         : !(this.field17163 instanceof PlayerEntity) || !this.field17163.isSpectator() && !((PlayerEntity)this.field17163).isCreative();
   }

   @Override
   public void method10804() {
      this.field17162.setAttackTarget(this.field17163);
      super.method10804();
   }
}
