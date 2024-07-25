package remapped;

import io.netty.buffer.ByteBuf;

public class class_1140 extends class_8039<Double> implements class_7305<Double> {
   public class_1140() {
      super(Double.class);
   }

   public Double method_4997(ByteBuf var1) {
      return var1.readDouble();
   }

   public void method_4995(ByteBuf var1, Double var2) {
      var1.writeDouble(var2);
   }

   public Double method_4996(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Double)var1 : !(Boolean)var1 ? 0.0 : 1.0;
      } else {
         return ((Number)var1).doubleValue();
      }
   }
}
