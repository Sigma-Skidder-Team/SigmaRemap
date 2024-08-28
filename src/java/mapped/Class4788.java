package mapped;

import io.netty.buffer.ByteBuf;

public class Class4788 extends Class4750<Class6949> {
   public Class4788() {
      super(Class6949.class);
   }

   public Class6949 method14894(ByteBuf var1) throws Exception {
      long var4 = Class4750.field22548.method14901(var1);
      short var6 = (short)((int)(var4 & 4095L));
      return new Class6948(var6 >>> 8 & 15, var6 & 15, var6 >>> 4 & 15, (int)(var4 >>> 12));
   }

   public void method14895(ByteBuf var1, Class6949 var2) throws Exception {
      short var5 = (short)(var2.method21448() << 8 | var2.method21450() << 4 | var2.method21449());
      Class4750.field22548.method14902(var1, (long)var2.method21452() << 12 | (long)var5);
   }
}
