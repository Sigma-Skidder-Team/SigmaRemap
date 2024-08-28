package mapped;

import io.netty.buffer.ByteBuf;

public class Class4789 extends Class4750<Class8600> {
   public Class4789() {
      super("Particle", Class8600.class);
   }

   public void method14895(ByteBuf var1, Class8600 var2) throws Exception {
      Class4750.field22544.method14908(var1, var2.method30771());

      for (Class9231 var6 : var2.method30773()) {
         var6.method34719().method14895(var1, var6.method34721());
      }
   }

   public Class8600 method14894(ByteBuf var1) throws Exception {
      int var4 = Class4750.field22544.method14907(var1);
      Class8600 var5 = new Class8600(var4);
      switch (var4) {
         case 3:
         case 20:
            var5.method30773().add(new Class9231(Class4750.field22544, Class4750.field22544.method14907(var1)));
            break;
         case 11:
            var5.method30773().add(new Class9231(Class4750.field22532, Class4750.field22532.method14905(var1)));
            var5.method30773().add(new Class9231(Class4750.field22532, Class4750.field22532.method14905(var1)));
            var5.method30773().add(new Class9231(Class4750.field22532, Class4750.field22532.method14905(var1)));
            var5.method30773().add(new Class9231(Class4750.field22532, Class4750.field22532.method14905(var1)));
            break;
         case 27:
            var5.method30773().add(new Class9231(Class4750.field22568, Class4750.field22568.method14894(var1)));
      }

      return var5;
   }
}
