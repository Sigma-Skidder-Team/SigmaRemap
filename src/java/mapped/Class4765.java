package mapped;

import io.netty.buffer.ByteBuf;

public class Class4765 extends Class4750<Byte> implements Class4755<Byte> {
   public Class4765() {
      super(Byte.class);
   }

   public Byte method14894(ByteBuf var1) {
      return var1.readByte();
   }

   public void method14895(ByteBuf var1, Byte var2) {
      var1.writeByte(var2);
   }

   public Byte method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Byte)var1 : Byte.valueOf((byte)(!(Boolean)var1 ? 0 : 1));
      } else {
         return ((Number)var1).byteValue();
      }
   }
}
