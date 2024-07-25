package remapped;

import io.netty.buffer.ByteBuf;

public class class_4680 extends class_8039<Byte> implements class_7305<Byte> {
   public class_4680() {
      super(Byte.class);
   }

   public Byte method_21637(ByteBuf var1) {
      return var1.readByte();
   }

   public void method_21635(ByteBuf var1, Byte var2) {
      var1.writeByte(var2);
   }

   public Byte method_21636(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Byte)var1 : Byte.valueOf((byte)(!(Boolean)var1 ? 0 : 1));
      } else {
         return ((Number)var1).byteValue();
      }
   }
}
