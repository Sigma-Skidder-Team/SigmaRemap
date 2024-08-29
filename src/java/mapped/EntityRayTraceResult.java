package mapped;

import net.minecraft.entity.Entity;

public class EntityRayTraceResult extends RayTraceResult {
   private static String[] field39314;
   private final Entity field39315;

   public EntityRayTraceResult(Entity var1) {
      this(var1, var1.getPositionVec());
   }

   public EntityRayTraceResult(Entity var1, Vector3d var2) {
      super(var2);
      this.field39315 = var1;
   }

   public Entity getEntity() {
      return this.field39315;
   }

   @Override
   public Type getType() {
      return Type.ENTITY;
   }
}
