package mapped;

import io.netty.buffer.ByteBuf;

public class Class4756 extends BruhMotha<Short> implements Class4755<Short> {
   public Class4756() {
      super("Unsigned Byte", Short.class);
   }

   public Short method14894(ByteBuf var1) {
      return var1.readUnsignedByte();
   }

   public void method14895(ByteBuf var1, Short var2) {
      var1.writeByte(var2);
   }

   public Short method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Short)var1 : Short.valueOf((short)(!(Boolean)var1 ? 0 : 1));
      } else {
         return ((Number)var1).shortValue();
      }
   }
}
