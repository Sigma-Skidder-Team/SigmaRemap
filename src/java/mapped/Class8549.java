package mapped;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class8549 {
   private static FloatBuffer field38434 = BufferUtils.createFloatBuffer(16);
   private static float[] field38435 = new float[16];

   public static String method30463() {
      ((Buffer)field38434).clear();
      GL11.glGetFloatv(2982, field38434);
      field38434.get(field38435);
      float[] var2 = method30465(field38435);
      return method30467(var2);
   }

   public static String method30464() {
      ((Buffer)field38434).clear();
      GL11.glGetFloatv(2983, field38434);
      field38434.get(field38435);
      float[] var2 = method30465(field38435);
      return method30467(var2);
   }

   private static float[] method30465(float[] var0) {
      float[] var3 = new float[16];

      for (int var4 = 0; var4 < 4; var4++) {
         for (int var5 = 0; var5 < 4; var5++) {
            var3[var4 * 4 + var5] = var0[var5 * 4 + var4];
         }
      }

      return var3;
   }

   public static String method30466(Matrix4f var0) {
      var0.method35524(field38435);
      return method30467(field38435);
   }

   private static String method30467(float[] var0) {
      StringBuffer var3 = new StringBuffer();

      for (int var4 = 0; var4 < var0.length; var4++) {
         String var5 = String.format("%.2f", var0[var4]);
         if (var4 > 0) {
            if (var4 % 4 != 0) {
               var3.append(", ");
            } else {
               var3.append("\n");
            }
         }

         var5 = Class9402.method35758(var5, 5, ' ');
         var3.append(var5);
      }

      return var3.toString();
   }
}
