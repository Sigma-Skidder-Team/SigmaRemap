package remapped;

import io.netty.buffer.ByteBuf;

public class class_9206 extends class_8039<Short> implements class_7305<Short> {
   public class_9206() {
      super(Short.class);
   }

   public short method_42475(ByteBuf var1) {
      return var1.readShort();
   }

   public void method_42477(ByteBuf var1, short var2) {
      var1.writeShort(var2);
   }

   @Deprecated
   public Short method_42479(ByteBuf var1) {
      return var1.readShort();
   }

   @Deprecated
   public void method_42476(ByteBuf var1, Short var2) {
      var1.writeShort(var2);
   }

   public Short method_42478(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Short)var1 : Short.valueOf((short)(!(Boolean)var1 ? 0 : 1));
      } else {
         return ((Number)var1).shortValue();
      }
   }
}
