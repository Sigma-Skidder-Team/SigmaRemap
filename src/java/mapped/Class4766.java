package mapped;

import io.netty.buffer.ByteBuf;

public class Class4766 extends Class4750<Short> implements Class4755<Short> {
   public Class4766() {
      super(Short.class);
   }

   public short method14909(ByteBuf var1) {
      return var1.readShort();
   }

   public void method14910(ByteBuf var1, short var2) {
      var1.writeShort(var2);
   }

   @Deprecated
   public Short method14894(ByteBuf var1) {
      return var1.readShort();
   }

   @Deprecated
   public void method14895(ByteBuf var1, Short var2) {
      var1.writeShort(var2);
   }

   public Short method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Short)var1 : Short.valueOf((short)(!(Boolean)var1 ? 0 : 1));
      } else {
         return ((Number)var1).shortValue();
      }
   }
}
