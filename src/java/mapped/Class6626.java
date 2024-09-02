package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class6626 implements Class6627 {
   private static String[] field29150;
   private int field29151 = GL11.glGenTextures();
   private int field29152 = 15;

   public Class6626(int var1, int var2) {
      byte[] var5 = this.method20206(var1, var2);
      ByteBuffer var6 = BufferUtils.createByteBuffer(var5.length);
      var6.put(var5);
      ((Buffer)var6).flip();
      GlStateManager.method23814(this.field29151);
      Class8684.method31292();
      GL11.glTexImage2D(3553, 0, 6407, var1, var2, 0, 6407, 5121, var6);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GlStateManager.method23814(0);
   }

   public int method20202() {
      return this.field29151;
   }

   @Override
   public void method20203() {
      GlStateManager.method23812(this.field29151);
      this.field29151 = 0;
   }

   private int method20204(int var1) {
      var1 ^= var1 << 13;
      var1 ^= var1 >> 17;
      return var1 ^ var1 << 5;
   }

   private byte method20205(int var1, int var2, int var3) {
      int var6 = (this.method20204(var1) + this.method20204(var2 * 19)) * this.method20204(var3 * 23) - var3;
      return (byte)(this.method20204(var6) % 128);
   }

   private byte[] method20206(int var1, int var2) {
      byte[] var5 = new byte[var1 * var2 * 3];
      int var6 = 0;

      for (int var7 = 0; var7 < var2; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 1; var9 < 4; var9++) {
               var5[var6++] = this.method20205(var8, var7, var9);
            }
         }
      }

      return var5;
   }

   @Override
   public int method20207() {
      return this.field29151;
   }

   @Override
   public int method20208() {
      return this.field29152;
   }
}
