package mapped;

import java.nio.ByteBuffer;

import lol.ImageData;
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
   public int method21455() {
      return 32;
   }

   @Override
   public int method21457() {
      return this.field30127;
   }

   @Override
   public ByteBuffer method21460() {
      return BufferUtils.createByteBuffer(this.method21458() * this.method21459() * 4);
   }

   @Override
   public int method21459() {
      return InternalTextureLoader.method35800(this.field30127);
   }

   @Override
   public int method21458() {
      return InternalTextureLoader.method35800(this.field30126);
   }

   @Override
   public int method21456() {
      return this.field30126;
   }
}
