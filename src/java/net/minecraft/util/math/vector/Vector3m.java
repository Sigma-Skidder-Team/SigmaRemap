package net.minecraft.util.math.vector;

import mapped.Class8828;

public class Vector3m implements Comparable<Vector3m> {
   public final double x;
   public final double y;
   public final double z;

   public Vector3m(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public Vector3m(int x, int y, int z) {
      this.x = (double)x;
      this.y = (double)y;
      this.z = (double)z;
   }

   public Vector3m(float x, float y, float z) {
      this.x = (double)x;
      this.y = (double)y;
      this.z = (double)z;
   }

   public Vector3m(Vector3m vectorIn) {
      this.x = vectorIn.x;
      this.y = vectorIn.y;
      this.z = vectorIn.z;
   }

   public Vector3m() {
      this.x = 0.0;
      this.y = 0.0;
      this.z = 0.0;
   }

   public double getX() {
      return this.x;
   }

   public int getRoundedX() {
      return (int)Math.round(this.x);
   }

   public Vector3m withX(double x) {
      return new Vector3m(x, this.y, this.z);
   }

   public Vector3m withX(int x) {
      return new Vector3m((double)x, this.y, this.z);
   }

   public double getY() {
      return this.y;
   }

   public int getRoundedY() {
      return (int)Math.round(this.y);
   }

   public Vector3m withY(double y) {
      return new Vector3m(this.x, y, this.z);
   }

   public Vector3m withY(int y) {
      return new Vector3m(this.x, (double)y, this.z);
   }

   public double getZ() {
      return this.z;
   }

   public int getRoundedZ() {
      return (int)Math.round(this.z);
   }

   public Vector3m withZ(double z) {
      return new Vector3m(this.x, this.y, z);
   }

   public Vector3m withZ(int z) {
      return new Vector3m(this.x, this.y, (double)z);
   }

   public Vector3m add(Vector3m vectorIn) {
      return new Vector3m(this.x + vectorIn.x, this.y + vectorIn.y, this.z + vectorIn.z);
   }

   public Vector3m add(double x, double y, double z) {
      return new Vector3m(this.x + x, this.y + y, this.z + z);
   }

   public Vector3m add(int x, int y, int z) {
      return new Vector3m(this.x + (double)x, this.y + (double)y, this.z + (double)z);
   }

   public Vector3m addAll(Vector3m... vectorsIn) {
      double x = this.x;
      double y = this.y;
      double z = this.z;

      for (Vector3m vec : vectorsIn) {
         x += vec.x;
         y += vec.y;
         z += vec.z;
      }

      return new Vector3m(x, y, z);
   }

   public Vector3m subtract(Vector3m vectorIn) {
      return new Vector3m(this.x - vectorIn.x, this.y - vectorIn.y, this.z - vectorIn.z);
   }

   public Vector3m subtract(double x, double y, double z) {
      return new Vector3m(this.x - x, this.y - y, this.z - z);
   }

   public Vector3m subtract(int x, int y, int z) {
      return new Vector3m(this.x - (double)x, this.y - (double)y, this.z - (double)z);
   }

   public Vector3m subtractAll(Vector3m... vectorsIn) {
      double x = this.x;
      double y = this.y;
      double z = this.z;

      for (Vector3m vec : vectorsIn) {
         x -= vec.x;
         y -= vec.y;
         z -= vec.z;
      }

      return new Vector3m(x, y, z);
   }

   public Vector3m multiply(Vector3m vectorIn) {
      return new Vector3m(this.x * vectorIn.x, this.y * vectorIn.y, this.z * vectorIn.z);
   }

   public Vector3m multiply(double x, double y, double z) {
      return new Vector3m(this.x * x, this.y * y, this.z * z);
   }

   public Vector3m multiply(int x, int y, int z) {
      return new Vector3m(this.x * (double)x, this.y * (double)y, this.z * (double)z);
   }

   public Vector3m multiplyAll(Vector3m... vectorsIn) {
      double x = this.x;
      double y = this.y;
      double z = this.z;

      for (Vector3m vec : vectorsIn) {
         x *= vec.x;
         y *= vec.y;
         z *= vec.z;
      }

      return new Vector3m(x, y, z);
   }

   public Vector3m scale(double scaleVector) {
      return new Vector3m(this.x * scaleVector, this.y * scaleVector, this.z * scaleVector);
   }

   public Vector3m scale(float scalar) {
      return new Vector3m(this.x * (double)scalar, this.y * (double)scalar, this.z * (double)scalar);
   }

   public Vector3m scale(int scalar) {
      return new Vector3m(this.x * (double)scalar, this.y * (double)scalar, this.z * (double)scalar);
   }

   public Vector3m divide(Vector3m vectorIn) {
      return new Vector3m(this.x / vectorIn.x, this.y / vectorIn.y, this.z / vectorIn.z);
   }

   public Vector3m divide(double x, double y, double z) {
      return new Vector3m(this.x / x, this.y / y, this.z / z);
   }

   public Vector3m divide(int x, int y, int z) {
      return new Vector3m(this.x / (double)x, this.y / (double)y, this.z / (double)z);
   }

   public Vector3m divide(int scalar) {
      return new Vector3m(this.x / (double)scalar, this.y / (double)scalar, this.z / (double)scalar);
   }

   public Vector3m divide(double scalar) {
      return new Vector3m(this.x / scalar, this.y / scalar, this.z / scalar);
   }

   public Vector3m dvidide(float scalar) {
      return new Vector3m(this.x / (double)scalar, this.y / (double)scalar, this.z / (double)scalar);
   }

   public double magnitude() {
      return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
   }

   public double magnitudeSquared() {
      return this.x * this.x + this.y * this.y + this.z * this.z;
   }

   public double distanceTo(Vector3m var1) {
      return Math.sqrt(
         Math.pow(var1.x - this.x, 2.0) + Math.pow(var1.y - this.y, 2.0) + Math.pow(var1.z - this.z, 2.0)
      );
   }

   public double squaredDistanceTo(Vector3m var1) {
      return Math.pow(var1.x - this.x, 2.0)
         + Math.pow(var1.y - this.y, 2.0)
         + Math.pow(var1.z - this.z, 2.0);
   }

   public Vector3m normalize() {
      return this.divide(this.magnitude());
   }

   public double dotProduct(Vector3m vectorIn) {
      return this.x * vectorIn.x + this.y * vectorIn.y + this.z * vectorIn.z;
   }

   public Vector3m crossProduct(Vector3m vectorIn) {
      return new Vector3m(
         this.y * vectorIn.z - this.z * vectorIn.y,
         this.z * vectorIn.x - this.x * vectorIn.z,
         this.x * vectorIn.y - this.y * vectorIn.x
      );
   }

   public boolean isWithinBounds(Vector3m vector1In, Vector3m vector2In) {
      return this.x >= vector1In.x
         && this.x <= vector2In.x
         && this.y >= vector1In.y
         && this.y <= vector2In.y
         && this.z >= vector1In.z
         && this.z <= vector2In.z;
   }

   public boolean isWithinRoundedBounds(Vector3m vector1In, Vector3m vector2In) {
      return this.getRoundedX() >= vector1In.getRoundedX()
         && this.getRoundedX() <= vector2In.getRoundedX()
         && this.getRoundedY() >= vector1In.getRoundedY()
         && this.getRoundedY() <= vector2In.getRoundedY()
         && this.getRoundedZ() >= vector1In.getRoundedZ()
         && this.getRoundedZ() <= vector2In.getRoundedZ();
   }

   public Vector3m clampY(int min, int max) {
      return new Vector3m(this.x, Math.max((double)min, Math.min((double)max, this.y)), this.z);
   }

   public Vector3m floor() {
      return new Vector3m(Math.floor(this.x), Math.floor(this.y), Math.floor(this.z));
   }

   public Vector3m ceil() {
      return new Vector3m(Math.ceil(this.x), Math.ceil(this.y), Math.ceil(this.z));
   }

   public Vector3m round() {
      return new Vector3m(Math.floor(this.x + 0.5), Math.floor(this.y + 0.5), Math.floor(this.z + 0.5));
   }

   public Vector3m abs() {
      return new Vector3m(Math.abs(this.x), Math.abs(this.y), Math.abs(this.z));
   }

   public Vector3m rotateAroundPoint(double angleDegrees, double centerX, double centerZ, double offsetX, double offsetZ) {
      angleDegrees = Math.toRadians(angleDegrees);
      double var13 = this.x - centerX;
      double var15 = this.z - centerZ;
      double var17 = var13 * Math.cos(angleDegrees) - var15 * Math.sin(angleDegrees);
      double var19 = var13 * Math.sin(angleDegrees) + var15 * Math.cos(angleDegrees);
      return new Vector3m(var17 + centerX + offsetX, this.y, var19 + centerZ + offsetZ);
   }

   public boolean isProportionalTo(Vector3m vectorIn) {
      if (this.x == 0.0 && this.y == 0.0 && this.z == 0.0) {
         return true;
      } else {
         double x = vectorIn.x;
         double y = vectorIn.y;
         double z = vectorIn.z;
         if (x == 0.0 && y == 0.0 && z == 0.0) {
            return true;
         } else if (this.x == 0.0 == (x == 0.0)) {
            if (this.y == 0.0 == (y == 0.0)) {
               if (this.z == 0.0 == (z == 0.0)) {
                  double var10 = x / this.x;
                  if (Double.isNaN(var10)) {
                     double var12 = y / this.y;
                     if (Double.isNaN(var12)) {
                        double var14 = z / this.z;
                        if (Double.isNaN(var14)) {
                           throw new RuntimeException("This should not happen");
                        } else {
                           return vectorIn.equals(this.scale(var14));
                        }
                     } else {
                        return vectorIn.equals(this.scale(var12));
                     }
                  } else {
                     return vectorIn.equals(this.scale(var10));
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public float pitchAngle() {
      double x = this.getX();
      double y = this.getZ();
      if (x == 0.0 && y == 0.0) {
         return !(this.getY() > 0.0) ? 90.0F : -90.0F;
      } else {
         double xSquared = x * x;
         double ySquared = y * y;
         double squaredRoot = Math.sqrt(xSquared + ySquared);
         return (float)Math.toDegrees(Math.atan(-this.getY() / squaredRoot));
      }
   }

   public float yawAngle() {
      double x = this.getX();
      double y = this.getZ();
      double var7 = Math.atan2(-x, y);
      double var9 = Math.PI * 2;
      return (float)Math.toDegrees((var7 + var9) % var9);
   }

   public static IntegerVector method8603(double var0, double var2, double var4) {
      return new IntegerVector(Math.floor(var0), Math.floor(var2), Math.floor(var4));
   }

   public IntegerVector method8604() {
      return new IntegerVector(Math.floor(this.x), Math.floor(this.y), Math.floor(this.z));
   }

   public IntegerVector getIntegerVector() {
      return new IntegerVector(this);
   }

   public Class8828 method8606() {
      return new Class8828(this.x, this.z);
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof Vector3m)) {
         return false;
      } else {
         Vector3m vec = (Vector3m)obj;
         return vec.x == this.x && vec.y == this.y && vec.z == this.z;
      }
   }

   public int compareTo(Vector3m vectorIn) {
      if (vectorIn != null) {
         if (this.y == vectorIn.y) {
            if (this.z == vectorIn.z) {
               return this.x == vectorIn.x ? 0 : Double.compare(this.x, vectorIn.x);
            } else {
               return Double.compare(this.z, vectorIn.z);
            }
         } else {
            return Double.compare(this.y, vectorIn.y);
         }
      } else {
         throw new IllegalArgumentException("null not supported");
      }
   }

   @Override
   public int hashCode() {
      int var3 = 7;
      var3 = 79 * var3 + (int)(Double.doubleToLongBits(this.x) ^ Double.doubleToLongBits(this.x) >>> 32);
      var3 = 79 * var3 + (int)(Double.doubleToLongBits(this.y) ^ Double.doubleToLongBits(this.y) >>> 32);
      return 79 * var3 + (int)(Double.doubleToLongBits(this.z) ^ Double.doubleToLongBits(this.z) >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.x + ", " + this.y + ", " + this.z + ")";
   }

   public static Vector3m min(Vector3m vec1, Vector3m vec2) {
      return new Vector3m(Math.min(vec1.x, vec2.x), Math.min(vec1.y, vec2.y), Math.min(vec1.z, vec2.z));
   }

   public static Vector3m max(Vector3m vec1, Vector3m vec2) {
      return new Vector3m(Math.max(vec1.x, vec2.x), Math.max(vec1.y, vec2.y), Math.max(vec1.z, vec2.z));
   }

   public static Vector3m average(Vector3m vec1, Vector3m vec2) {
      return new Vector3m((vec1.x + vec2.x) / 2.0, (vec1.y + vec2.y) / 2.0, (vec1.z + vec2.z) / 2.0);
   }

   public static class IntegerVector extends Vector3m {
      public IntegerVector(Vector3m var1) {
         super(var1);
      }

      public IntegerVector(int x, int y, int z) {
         super(x, y, z);
      }

      public IntegerVector(float x, float y, float z) {
         super(x, y, z);
      }

      public IntegerVector(double x, double y, double z) {
         super(x, y, z);
      }

      @Override
      public boolean equals(Object obj) {
         if (!(obj instanceof Vector3m)) {
            return false;
         } else {
            Vector3m vectorI = (Vector3m) obj;
            return (int)vectorI.getX() == (int)this.x
               && (int)vectorI.getY() == (int)this.y
               && (int)vectorI.getZ() == (int)this.z;
         }
      }

      @Override
      public int hashCode() {
         return (int)this.x << 19 ^ (int)this.y << 12 ^ (int)this.z;
      }

      @Override
      public IntegerVector getIntegerVector() {
         return this;
      }
   }
}
