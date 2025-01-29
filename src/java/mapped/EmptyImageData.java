package mapped;

import java.nio.ByteBuffer;

import org.newdawn.slick.opengl.ImageData;
import lol.InternalTextureLoader;
import org.lwjgl.BufferUtils;

public class EmptyImageData implements ImageData {
   private static String[] field30125;
   private int field30126;
   private int field30127;

   public EmptyImageData(int var1, int var2) {
      this.field30126 = var1;
      this.field30127 = var2;
   }

   @Override
   public int getDepth() {
      return 32;
   }

   @Override
   public int getHeight() {
      return this.field30127;
   }

   @Override
   public ByteBuffer getImageBufferData() {
      return BufferUtils.createByteBuffer(this.getTexWidth() * this.getTexHeight() * 4);
   }

   @Override
   public int getTexHeight() {
      return InternalTextureLoader.method35800(this.field30127);
   }

   @Override
   public int getTexWidth() {
      return InternalTextureLoader.method35800(this.field30126);
   }

   @Override
   public int getWidth() {
      return this.field30126;
   }
}
