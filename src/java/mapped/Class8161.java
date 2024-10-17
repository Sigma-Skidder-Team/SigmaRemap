package mapped;

import net.minecraft.util.math.vector.Vector3f;

public class Class8161 {
   private static String[] field35117;
   public final Vector3f field35118;
   public final float field35119;
   public final float field35120;

   public Class8161(float var1, float var2, float var3, float var4, float var5) {
      this(new Vector3f(var1, var2, var3), var4, var5);
   }

   public Class8161 method28370(float var1, float var2) {
      return new Class8161(this.field35118, var1, var2);
   }

   public Class8161(Vector3f var1, float var2, float var3) {
      this.field35118 = var1;
      this.field35119 = var2;
      this.field35120 = var3;
   }
}
