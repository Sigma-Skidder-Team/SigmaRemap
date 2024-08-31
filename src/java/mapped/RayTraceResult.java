package mapped;

import net.minecraft.entity.Entity;

public abstract class RayTraceResult {
   public final Vector3d field39316;

   public RayTraceResult(Vector3d var1) {
      this.field39316 = var1;
   }

   public double method31418(Entity var1) {
      double var4 = this.field39316.x - var1.getPosX();
      double var6 = this.field39316.y - var1.getPosY();
      double var8 = this.field39316.z - var1.getPosZ();
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public abstract Type getType();

   public Vector3d method31419() {
      return this.field39316;
   }

   public enum Type {
       MISS,
      BLOCK,
      ENTITY;

      private static final Type[] field13692 = new Type[]{MISS, BLOCK, ENTITY};
   }
}
