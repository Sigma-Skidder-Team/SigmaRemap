package remapped;

import io.netty.buffer.ByteBuf;

public class class_2660 extends class_8039<class_9371> {
   public class_2660() {
      super(class_9371.class);
   }

   public class_9371 method_12017(ByteBuf var1) {
      long var4 = var1.readLong();
      long var6 = var4 >> 38;
      long var8 = var4 << 52 >> 52;
      long var10 = var4 << 26 >> 38;
      return new class_9371((int)var6, (short)((int)var8), (int)var10);
   }

   public void method_12016(ByteBuf var1, class_9371 var2) {
      var1.writeLong(((long)var2.method_43340() & 67108863L) << 38 | (long)(var2.method_43342() & 4095) | ((long)var2.method_43343() & 67108863L) << 12);
   }
}
