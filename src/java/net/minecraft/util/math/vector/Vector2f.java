package net.minecraft.util.math.vector;

public class Vector2f {
   private static String[] field37211;
   public static final Vector2f ZERO = new Vector2f(0.0F, 0.0F);
   public static final Vector2f field37213 = new Vector2f(1.0F, 1.0F);
   public static final Vector2f field37214 = new Vector2f(1.0F, 0.0F);
   public static final Vector2f field37215 = new Vector2f(-1.0F, 0.0F);
   public static final Vector2f field37216 = new Vector2f(0.0F, 1.0F);
   public static final Vector2f field37217 = new Vector2f(0.0F, -1.0F);
   public static final Vector2f field37218 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final Vector2f field37219 = new Vector2f(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float field37220;
   public final float field37221;

   public Vector2f(float var1, float var2) {
      this.field37220 = var1;
      this.field37221 = var2;
   }

   public boolean equals(Vector2f var1) {
      return this.field37220 == var1.field37220 && this.field37221 == var1.field37221;
   }
}
