package mapped;

import io.netty.buffer.ByteBuf;

public class Class4759 extends Class4750<Long> implements Class4755<Long> {
   public Class4759() {
      super(Long.class);
   }

   public Long method14894(ByteBuf var1) {
      return var1.readLong();
   }

   public void method14895(ByteBuf var1, Long var2) {
      var1.writeLong(var2);
   }

   public Long method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Long)var1 : !(Boolean)var1 ? 0L : 1L;
      } else {
         return ((Number)var1).longValue();
      }
   }
}
