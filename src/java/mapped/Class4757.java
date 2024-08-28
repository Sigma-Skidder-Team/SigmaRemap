package mapped;

import io.netty.buffer.ByteBuf;

public class Class4757 extends Class4750<Integer> implements Class4755<Integer> {
   public Class4757() {
      super(Integer.class);
   }

   public Integer method14894(ByteBuf var1) {
      return var1.readUnsignedShort();
   }

   public void method14895(ByteBuf var1, Integer var2) {
      var1.writeShort(var2);
   }

   public Integer method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Integer)var1 : !(Boolean)var1 ? 0 : 1;
      } else {
         return ((Number)var1).intValue();
      }
   }
}
