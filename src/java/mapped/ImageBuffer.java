package mapped;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import lol.ImageData;
import org.lwjgl.BufferUtils;

public class ImageBuffer implements ImageData {
   private int field30128;
   private int field30129;
   private int field30130;
   private int field30131;
   private byte[] field30132;

   public ImageBuffer(int var1, int var2) {
      this.field30128 = var1;
      this.field30129 = var2;
      this.field30130 = this.method21465(var1);
      this.field30131 = this.method21465(var2);
      this.field30132 = new byte[this.field30130 * this.field30131 * 4];
   }

   public byte[] method21461() {
      return this.field30132;
   }

   @Override
   public int method21455() {
      return 32;
   }

   @Override
   public int method21457() {
      return this.field30129;
   }

   @Override
   public int method21459() {
      return this.field30131;
   }

   @Override
   public int method21458() {
      return this.field30130;
   }

   @Override
   public int method21456() {
      return this.field30128;
   }

   @Override
   public ByteBuffer method21460() {
      ByteBuffer var3 = BufferUtils.createByteBuffer(this.field30132.length);
      var3.put(this.field30132);
      var3.flip();
      return var3;
   }

   public void method21462(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= 0 && var1 < this.field30128 && var2 >= 0 && var2 < this.field30129) {
         int var9 = (var1 + var2 * this.field30130) * 4;
         if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            this.field30132[var9] = (byte)var3;
            this.field30132[var9 + 1] = (byte)var4;
            this.field30132[var9 + 2] = (byte)var5;
            this.field30132[var9 + 3] = (byte)var6;
         } else {
            this.field30132[var9] = (byte)var5;
            this.field30132[var9 + 1] = (byte)var4;
            this.field30132[var9 + 2] = (byte)var3;
            this.field30132[var9 + 3] = (byte)var6;
         }
      } else {
         throw new RuntimeException("Specified location: " + var1 + "," + var2 + " outside of image");
      }
   }

   public Image method21463() {
      return new Image(this);
   }

   public Image method21464(int var1) {
      return new Image(this, var1);
   }

   private int method21465(int var1) {
      int var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }
}
