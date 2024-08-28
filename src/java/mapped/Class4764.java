package mapped;

import io.netty.buffer.ByteBuf;

public class Class4764 extends Class4750<Double> implements Class4755<Double> {
   public Class4764() {
      super(Double.class);
   }

   public Double method14894(ByteBuf var1) {
      return var1.readDouble();
   }

   public void method14895(ByteBuf var1, Double var2) {
      var1.writeDouble(var2);
   }

   public Double method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Double)var1 : !(Boolean)var1 ? 0.0 : 1.0;
      } else {
         return ((Number)var1).doubleValue();
      }
   }
}
