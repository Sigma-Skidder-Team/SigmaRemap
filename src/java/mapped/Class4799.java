package mapped;

import io.netty.buffer.ByteBuf;

public class Class4799 extends Class4750<Class8665> {
   public Class4799() {
      super(Class8665.class);
   }

   public Class8665 method14894(ByteBuf var1) throws Exception {
      float var4 = Class4750.field22532.method14905(var1);
      float var5 = Class4750.field22532.method14905(var1);
      float var6 = Class4750.field22532.method14905(var1);
      return new Class8665(var4, var5, var6);
   }

   public void method14895(ByteBuf var1, Class8665 var2) throws Exception {
      Class4750.field22532.method14906(var1, var2.method31200());
      Class4750.field22532.method14906(var1, var2.method31201());
      Class4750.field22532.method14906(var1, var2.method31202());
   }
}
