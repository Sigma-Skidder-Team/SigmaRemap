package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class class_816 implements class_8147 {
   private static String[] field_4331;
   private int field_4332 = GL11.glGenTextures();
   private int field_4333 = 15;

   public class_816(int var1, int var2) {
      byte[] var5 = this.method_3573(var1, var2);
      ByteBuffer var6 = BufferUtils.createByteBuffer(var5.length);
      var6.put(var5);
      ((Buffer)var6).flip();
      GlStateManager.method_8791(this.field_4332);
      class_5525.method_25072();
      GL11.glTexImage2D(3553, 0, 6407, var1, var2, 0, 6407, 5121, var6);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GlStateManager.method_8791(0);
   }

   public int method_3572() {
      return this.field_4332;
   }

   public void 괠欫蛊浦室敤() {
      GlStateManager.method_8904(this.field_4332);
      this.field_4332 = 0;
   }

   private int method_3575(int var1) {
      var1 ^= var1 << 13;
      var1 ^= var1 >> 17;
      return var1 ^ var1 << 5;
   }

   private byte method_3576(int var1, int var2, int var3) {
      int var6 = (this.method_3575(var1) + this.method_3575(var2 * 19)) * this.method_3575(var3 * 23) - var3;
      return (byte)(this.method_3575(var6) % 128);
   }

   private byte[] method_3573(int var1, int var2) {
      byte[] var5 = new byte[var1 * var2 * 3];
      int var6 = 0;

      for (int var7 = 0; var7 < var2; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 1; var9 < 4; var9++) {
               var5[var6++] = this.method_3576(var8, var7, var9);
            }
         }
      }

      return var5;
   }

   public int ಽ佉竁阢贞Ⱋ() {
      return this.field_4332;
   }

   public int 햠쇽醧쇽陬卫() {
      return this.field_4333;
   }
}
