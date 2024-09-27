package mapped;

import io.netty.buffer.ByteBuf;

public class Class4762 extends BruhMotha<Integer> implements Class4755<Integer> {
   public Class4762() {
      super(Integer.class);
   }

   public Integer method14894(ByteBuf var1) {
      return var1.readInt();
   }

   public void method14895(ByteBuf var1, Integer var2) {
      var1.writeInt(var2);
   }

   public Integer method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Integer)var1 : !(Boolean)var1 ? 0 : 1;
      } else {
         return ((Number)var1).intValue();
      }
   }
}
