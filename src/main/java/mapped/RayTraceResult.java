package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;

public abstract class RayTraceResult {
   public final Vector3d vec;

   public RayTraceResult(Vector3d var1) {
      this.vec = var1;
   }

   public double method31418(Entity var1) {
      double var4 = this.vec.x - var1.getPosX();
      double var6 = this.vec.y - var1.getPosY();
      double var8 = this.vec.z - var1.getPosZ();
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public abstract Type getType();

   public Vector3d getHitVec() {
      return this.vec;
   }

   public enum Type {
      MISS,
      BLOCK,
      ENTITY;
   }
}
