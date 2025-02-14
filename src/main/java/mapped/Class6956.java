package mapped;

import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.LoadableImageData;

import java.nio.ByteBuffer;

public class Class6956 implements ImageData {
   private static String[] field30133;
   public final LoadableImageData field30134;
   public final int field30135;
   public final int field30136;
   public final ByteBuffer field30137;
   public final int field30138;
   public final int field30139;
   public final Class7390 field30140;

   public Class6956(Class7390 var1, LoadableImageData var2, int var3, int var4, ByteBuffer var5, int var6, int var7) {
      this.field30140 = var1;
      this.field30134 = var2;
      this.field30135 = var3;
      this.field30136 = var4;
      this.field30137 = var5;
      this.field30138 = var6;
      this.field30139 = var7;
   }

   @Override
   public int getDepth() {
      return this.field30134.getDepth();
   }

   @Override
   public int getHeight() {
      return this.field30135;
   }

   @Override
   public int getWidth() {
      return this.field30136;
   }

   @Override
   public ByteBuffer getImageBufferData() {
      return this.field30137;
   }

   @Override
   public int getTexHeight() {
      return this.field30138;
   }

   @Override
   public int getTexWidth() {
      return this.field30139;
   }
}
