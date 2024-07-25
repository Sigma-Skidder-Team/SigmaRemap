package remapped;

import io.netty.buffer.ByteBuf;

public class class_429 extends class_8039<class_9523> {
   public class_429() {
      super(class_9523.class);
   }

   public class_9523 method_2118(ByteBuf var1) throws Exception {
      long var4 = class_8039.field_41148.method_10582(var1);
      short var6 = (short)((int)(var4 & 4095L));
      return new class_1152(var6 >>> 8 & 15, var6 & 15, var6 >>> 4 & 15, (int)(var4 >>> 12));
   }

   public void method_2117(ByteBuf var1, class_9523 var2) throws Exception {
      short var5 = (short)(var2.method_43936() << 8 | var2.method_43930() << 4 | var2.method_43934());
      class_8039.field_41148.method_10583(var1, (long)var2.method_43935() << 12 | (long)var5);
   }
}
