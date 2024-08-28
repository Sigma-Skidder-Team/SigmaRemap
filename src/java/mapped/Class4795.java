package mapped;

import io.netty.buffer.ByteBuf;

public class Class4795 extends Class4750<Class9691> {
   public Class4795() {
      super(Class9691.class);
   }

   public Class9691 method14894(ByteBuf var1) throws Exception {
      int var4 = Class4750.field22526.method14894(var1);
      int var5 = Class4750.field22526.method14894(var1);
      int var6 = Class4750.field22526.method14894(var1);
      return new Class9691(var4, var5, var6);
   }

   public void method14895(ByteBuf var1, Class9691 var2) throws Exception {
      Class4750.field22526.method14895(var1, Integer.valueOf(var2.method37938()));
      Class4750.field22526.method14895(var1, Integer.valueOf(var2.method37940()));
      Class4750.field22526.method14895(var1, Integer.valueOf(var2.method37942()));
   }
}
