package remapped;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class class_5018 {
   private static FloatBuffer field_25959 = BufferUtils.createFloatBuffer(16);
   private static float[] field_25960 = new float[16];

   public static String method_23098() {
      ((Buffer)field_25959).clear();
      GL11.glGetFloatv(2982, field_25959);
      field_25959.get(field_25960);
      float[] var2 = method_23101(field_25960);
      return method_23097(var2);
   }

   public static String method_23100() {
      ((Buffer)field_25959).clear();
      GL11.glGetFloatv(2983, field_25959);
      field_25959.get(field_25960);
      float[] var2 = method_23101(field_25960);
      return method_23097(var2);
   }

   private static float[] method_23101(float[] var0) {
      float[] var3 = new float[16];

      for (int var4 = 0; var4 < 4; var4++) {
         for (int var5 = 0; var5 < 4; var5++) {
            var3[var4 * 4 + var5] = var0[var5 * 4 + var4];
         }
      }

      return var3;
   }

   public static String method_23096(class_8107 var0) {
      var0.method_36828(field_25960);
      return method_23097(field_25960);
   }

   private static String method_23097(float[] var0) {
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

         var5 = class_8251.method_37808(var5, 5, ' ');
         var3.append(var5);
      }

      return var3.toString();
   }
}
