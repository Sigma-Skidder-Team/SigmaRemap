package remapped;

import io.netty.buffer.ByteBuf;

public class class_9771 extends class_8039<Short> implements class_7305<Short> {
   public class_9771() {
      super("Unsigned Byte", Short.class);
   }

   public Short method_45077(ByteBuf var1) {
      return var1.readUnsignedByte();
   }

   public void method_45075(ByteBuf var1, Short var2) {
      var1.writeByte(var2);
   }

   public Short method_45076(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Short)var1 : Short.valueOf((short)(!(Boolean)var1 ? 0 : 1));
      } else {
         return ((Number)var1).shortValue();
      }
   }
}
