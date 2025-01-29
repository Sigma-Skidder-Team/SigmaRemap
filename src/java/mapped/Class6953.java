package mapped;

import org.newdawn.slick.opengl.ImageData;
import lol.LoadableImageData;

import java.nio.ByteBuffer;

public class Class6953 implements ImageData {
   private static String[] field30119;
   public final LoadableImageData field30120;
   public final int field30121;
   public final ByteBuffer field30122;
   public final int field30123;
   public final Class7390 field30124;

   public Class6953(Class7390 var1, LoadableImageData var2, int var3, ByteBuffer var4, int var5) {
      this.field30124 = var1;
      this.field30120 = var2;
      this.field30121 = var3;
      this.field30122 = var4;
      this.field30123 = var5;
   }

   @Override
   public int getDepth() {
      return this.field30120.getDepth();
   }

   @Override
   public int getHeight() {
      return this.field30121;
   }

   @Override
   public ByteBuffer getImageBufferData() {
      return this.field30122;
   }

   @Override
   public int getTexHeight() {
      return this.field30121;
   }

   @Override
   public int getTexWidth() {
      return this.field30123;
   }

   @Override
   public int getWidth() {
      return this.field30123;
   }
}
