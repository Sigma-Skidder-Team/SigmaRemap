package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class GiantEntity extends MonsterEntity {
   private static String[] field6050;

   public GiantEntity(EntityType<? extends GiantEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 10.440001F;
   }

   public static MutableAttribute method5268() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 100.0).method21849(Attributes.MOVEMENT_SPEED, 0.5).method21849(Attributes.ATTACK_DAMAGE, 50.0);
   }

   @Override
   public float getBlockPathWeight(BlockPos var1, IWorldReader var2) {
      return var2.method7009(var1) - 0.5F;
   }
}
