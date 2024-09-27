package mapped;

import io.netty.buffer.ByteBuf;

public class Class4792 extends BruhMotha<Class9695> {
   public Class4792() {
      super(Class9695.class);
   }

   public Class9695 method14894(ByteBuf var1) {
      long var4 = var1.readLong();
      long var6 = var4 >> 38;
      long var8 = var4 << 52 >> 52;
      long var10 = var4 << 26 >> 38;
      return new Class9695((int)var6, (short)((int)var8), (int)var10);
   }

   public void method14895(ByteBuf var1, Class9695 var2) {
      var1.writeLong(((long)var2.method37962() & 67108863L) << 38 | (long)(var2.method37963() & 4095) | ((long)var2.method37964() & 67108863L) << 12);
   }
}
