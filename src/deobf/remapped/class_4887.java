package remapped;

import io.netty.buffer.ByteBuf;

public class class_4887 extends class_8039<class_9371> {
   public class_4887() {
      super(class_9371.class);
   }

   public class_9371 method_22417(ByteBuf var1) {
      long var4 = var1.readLong();
      long var6 = var4 >> 38;
      long var8 = var4 >> 26 & 4095L;
      long var10 = var4 << 38 >> 38;
      return new class_9371((int)var6, (short)((int)var8), (int)var10);
   }

   public void method_22416(ByteBuf var1, class_9371 var2) {
      var1.writeLong(((long)var2.method_43340() & 67108863L) << 38 | ((long)var2.method_43342() & 4095L) << 26 | (long)(var2.method_43343() & 67108863));
   }
}
