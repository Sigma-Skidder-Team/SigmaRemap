package mapped;

import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.openal.AL10;

public class Class9675 {
   private static String[] field45175;
   private float field45176 = 1.0F;
   private Vector3d field45177 = Vector3d.ZERO;

   public void method37745(Vector3d var1) {
      this.field45177 = var1;
      AL10.alListener3f(4100, (float)var1.x, (float)var1.y, (float)var1.z);
   }

   public Vector3d method37746() {
      return this.field45177;
   }

   public void method37747(Vector3f var1, Vector3f var2) {
      AL10.alListenerfv(
         4111, new float[]{var1.method25269(), var1.method25270(), var1.method25271(), var2.method25269(), var2.method25270(), var2.method25271()}
      );
   }

   public void method37748(float var1) {
      AL10.alListenerf(4106, var1);
      this.field45176 = var1;
   }

   public float method37749() {
      return this.field45176;
   }

   public void method37750() {
      this.method37745(Vector3d.ZERO);
      this.method37747(Vector3f.field32901, Vector3f.YP);
   }
}
