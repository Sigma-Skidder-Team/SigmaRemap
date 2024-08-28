package mapped;

import io.netty.buffer.ByteBuf;

public class Class4758 extends Class4750<Boolean> implements Class4755<Boolean> {
   public Class4758() {
      super(Boolean.class);
   }

   public Boolean method14894(ByteBuf var1) {
      return var1.readBoolean();
   }

   public void method14895(ByteBuf var1, Boolean var2) {
      var1.writeBoolean(var2);
   }

   public Boolean method14904(Object var1) {
      return !(var1 instanceof Number) ? (Boolean)var1 : ((Number)var1).intValue() == 1;
   }
}
