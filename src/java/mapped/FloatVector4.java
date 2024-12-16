package mapped;

public class FloatVector4 {
   public float x;
   public float y;
   public float z;
   public float w;

   public FloatVector4(float x, float y, float z) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.w = 0.1F;
   }

   public FloatVector4(float x, float y, float z, float w) {
      this(x, y, z);
      this.w = w;
   }

   public float interpolateX(float by) {
      if (by != this.x) {
         this.x = this.x + (by - this.x) * this.w;
      }

      return this.x;
   }

   public float interpolateY(float by) {
      if (by != this.y) {
         this.y = this.y + (by - this.y) * this.w;
      }

      return this.y;
   }

   public float interpolateZ(float by) {
      if (by != this.z) {
         this.z = this.z + (by - this.z) * this.w;
      }

      return this.z;
   }
}
