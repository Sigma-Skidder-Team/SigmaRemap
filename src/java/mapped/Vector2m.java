package mapped;

import net.minecraft.util.math.vector.Vector3m;

public class Vector2m {
   public final double x;
   public final double y;
   public Vector2m(double x, double y) {
      this.x = x;
      this.y = y;
   }
   public Vector2m(int x, int y) {
      this.x = x;
      this.y = y;
   }
   public Vector2m(float x, float y) {
      this.x = x;
      this.y = y;
   }
   public Vector2m(Vector2m from) {
      this.x = from.x;
      this.y = from.y;
   }
   public Vector2m() {
      this.x = 0.0;
      this.y = 0.0;
   }

   public double getX() {
      return this.x;
   }

   public int roundX() {
      return (int)Math.round(this.x);
   }

   public Vector2m withX(double x) {
      return new Vector2m(x, this.y);
   }

   public Vector2m withX(int y) {
      return new Vector2m((double)y, this.y);
   }

   public double getY() {
      return this.y;
   }

   public int roundY() {
      return (int)Math.round(this.y);
   }

   public Vector2m withY(double y) {
      return new Vector2m(this.x, y);
   }

   public Vector2m withY(int y) {
      return new Vector2m(this.x, (double)y);
   }

   public Vector2m add(Vector2m of) {
      return new Vector2m(this.x + of.x, this.y + of.y);
   }

   public Vector2m add(double x, double y) {
      return new Vector2m(this.x + x, this.y + y);
   }

   public Vector2m add(int x, int y) {
      return new Vector2m(this.x + (double)x, this.y + (double)y);
   }

   public Vector2m addAll(Vector2m... vectorsIn) {
      double x = this.x;
      double y = this.y;

      for (Vector2m var11 : vectorsIn) {
         x += var11.x;
         y += var11.y;
      }

      return new Vector2m(x, y);
   }

   public Vector2m subtract(Vector2m vec) {
      return new Vector2m(this.x - vec.x, this.y - vec.y);
   }

   public Vector2m subtract(double x, double y) {
      return new Vector2m(this.x - x, this.y - y);
   }

   public Vector2m subtract(int x, int y) {
      return new Vector2m(this.x - (double)x, this.y - (double)y);
   }

   public Vector2m subtractAll(Vector2m... vectorsIn) {
      double x = this.x;
      double y = this.y;

      for (Vector2m vec : vectorsIn) {
         x -= vec.x;
         y -= vec.y;
      }

      return new Vector2m(x, y);
   }

   public Vector2m multiply(Vector2m var1) {
      return new Vector2m(this.x * var1.x, this.y * var1.y);
   }

   public Vector2m multiply(double var1, double var3) {
      return new Vector2m(this.x * var1, this.y * var3);
   }

   public Vector2m multiply(int var1, int var2) {
      return new Vector2m(this.x * (double)var1, this.y * (double)var2);
   }

   public Vector2m multiplyAll(Vector2m... vectorsIn) {
      double x = this.x;
      double y = this.y;

      for (Vector2m vec : vectorsIn) {
         x *= vec.x;
         y *= vec.y;
      }

      return new Vector2m(x, y);
   }

   public Vector2m scale(double var1) {
      return new Vector2m(this.x * var1, this.y * var1);
   }

   public Vector2m multiply(float scalar) {
      return new Vector2m(this.x * (double)scalar, this.y * (double)scalar);
   }

   public Vector2m multiply(int scalar) {
      return new Vector2m(this.x * (double)scalar, this.y * (double)scalar);
   }

   public Vector2m divide(Vector2m vectorIn) {
      return new Vector2m(this.x / vectorIn.x, this.y / vectorIn.y);
   }

   public Vector2m divide(double x, double y) {
      return new Vector2m(this.x / x, this.y / y);
   }

   public Vector2m divide(int x, int y) {
      return new Vector2m(this.x / (double)x, this.y / (double)y);
   }

   public Vector2m divide(int scalar) {
      return new Vector2m(this.x / (double)scalar, this.y / (double)scalar);
   }

   public Vector2m divide(double scalar) {
      return new Vector2m(this.x / scalar, this.y / scalar);
   }

   public Vector2m divide(float scalar) {
      return new Vector2m(this.x / (double)scalar, this.y / (double)scalar);
   }

   public double magnitude() {
      return Math.sqrt(this.x * this.x + this.y * this.y);
   }

   public double magnitudeSquared() {
      return this.x * this.x + this.y * this.y;
   }

   public double method31909(Vector2m var1) {
      return Math.sqrt(Math.pow(var1.x - this.x, 2.0) + Math.pow(var1.y - this.y, 2.0));
   }

   public double method31910(Vector2m var1) {
      return Math.pow(var1.x - this.x, 2.0) + Math.pow(var1.y - this.y, 2.0);
   }

   public Vector2m normalize() {
      return this.divide(this.magnitude());
   }

   public double dotProduct(Vector2m vectorIn) {
      return this.x * vectorIn.x + this.y * vectorIn.y;
   }

   public boolean isWithinBounds(Vector2m vector1In, Vector2m vector2In) {
      return this.x >= vector1In.x
         && this.x <= vector2In.x
         && this.y >= vector1In.y
         && this.y <= vector2In.y;
   }

   public boolean isWithinRoundedBounds(Vector2m vector1In, Vector2m vector2In) {
      return this.roundX() >= vector1In.roundX()
         && this.roundX() <= vector2In.roundX()
         && this.roundY() >= vector1In.roundY()
         && this.roundY() <= vector2In.roundY();
   }

   public Vector2m floor() {
      return new Vector2m(Math.floor(this.x), Math.floor(this.y));
   }

   public Vector2m ceil() {
      return new Vector2m(Math.ceil(this.x), Math.ceil(this.y));
   }

   public Vector2m round() {
      return new Vector2m(Math.floor(this.x + 0.5), Math.floor(this.y + 0.5));
   }

   public Vector2m abs() {
      return new Vector2m(Math.abs(this.x), Math.abs(this.y));
   }

   public Vector2m rotateAroundPoint(double angleDegrees, double centerX, double centerZ, double offsetX, double offsetZ) {
      angleDegrees = Math.toRadians(angleDegrees);
      double var13 = this.x - centerX;
      double var15 = this.y - centerZ;
      double var17 = var13 * Math.cos(angleDegrees) - var15 * Math.sin(angleDegrees);
      double var19 = var13 * Math.sin(angleDegrees) + var15 * Math.cos(angleDegrees);
      return new Vector2m(var17 + centerX + offsetX, var19 + centerZ + offsetZ);
   }

   public boolean isProportionalTo(Vector2m vectorIn) {
      if (this.x == 0.0 && this.y == 0.0) {
         return true;
      } else {
         double x = vectorIn.x;
         double y = vectorIn.y;
         if (x == 0.0 && y == 0.0) {
            return true;
         } else if (this.x == 0.0 == (x == 0.0)) {
            if (this.y == 0.0 == (y == 0.0)) {
               double var8 = x / this.x;
               if (Double.isNaN(var8)) {
                  double var10 = y / this.y;
                  if (Double.isNaN(var10)) {
                     throw new RuntimeException("This should not happen");
                  } else {
                     return vectorIn.equals(this.scale(var10));
                  }
               } else {
                  return vectorIn.equals(this.scale(var8));
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public Class8829 method31921() {
      return new Class8829(this);
   }

   public Vector3m method31922() {
      return new Vector3m(this.x, 0.0, this.y);
   }

   public Vector3m method31923(double var1) {
      return new Vector3m(this.x, var1, this.y);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Vector2m)) {
         return false;
      } else {
         Vector2m var4 = (Vector2m)var1;
         return var4.x == this.x && var4.y == this.y;
      }
   }

   @Override
   public int hashCode() {
      return new Double(this.x).hashCode() >> 13 ^ new Double(this.y).hashCode();
   }

   @Override
   public String toString() {
      return "(" + this.x + ", " + this.y + ")";
   }

   public static Vector2m method31924(Vector2m var0, Vector2m var1) {
      return new Vector2m(Math.min(var0.x, var1.x), Math.min(var0.y, var1.y));
   }

   public static Vector2m method31925(Vector2m var0, Vector2m var1) {
      return new Vector2m(Math.max(var0.x, var1.x), Math.max(var0.y, var1.y));
   }
}
