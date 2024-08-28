package mapped;

import io.netty.buffer.ByteBuf;

public class Class4774 extends Class4750<Class6949> {
   public Class4774() {
      super(Class6949.class);
   }

   public Class6949 method14894(ByteBuf var1) throws Exception {
      short var4 = Class4750.field22534.method14909(var1);
      int var5 = Class4750.field22544.method14907(var1);
      return new Class6950(var4 >> 12 & 15, var4 & 255, var4 >> 8 & 15, var5);
   }

   public void method14895(ByteBuf var1, Class6949 var2) throws Exception {
      Class4750.field22534.method14910(var1, (short)(var2.method21448() << 12 | var2.method21450() << 8 | var2.method21454()));
      Class4750.field22544.method14908(var1, var2.method21452());
   }
}
