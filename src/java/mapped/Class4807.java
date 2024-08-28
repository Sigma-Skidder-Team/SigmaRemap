package mapped;

import io.netty.buffer.ByteBuf;

public abstract class Class4807 extends Class4806 {
   public Class8656 method14894(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      if (var4 != 255) {
         Class1949 var5 = this.method14916(var1.readByte());
         return new Class8656(var4, var5, var5.method8208().method14894(var1));
      } else {
         return null;
      }
   }

   public abstract Class1949 method14916(int var1);

   public void method14895(ByteBuf var1, Class8656 var2) throws Exception {
      if (var2 != null) {
         var1.writeByte(var2.method31148());
         Class1949 var5 = var2.method31150();
         var1.writeByte(var5.method8207());
         var5.method8208().method14895(var1, var2.method31152());
      } else {
         var1.writeByte(255);
      }
   }
}
