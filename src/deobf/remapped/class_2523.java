package remapped;

import io.netty.buffer.ByteBuf;

public abstract class class_2523<T, X> extends class_8039<T> {
   private final X field_12496;

   public class_2523(X var1, Class<T> var2) {
      super(var2);
      this.field_12496 = (X)var1;
   }

   public abstract T method_11480(ByteBuf var1, X var2) throws Exception;

   public abstract void method_11479(ByteBuf var1, X var2, T var3) throws Exception;

   @Override
   public T method_9912(ByteBuf var1) throws Exception {
      return this.method_11480(var1, this.field_12496);
   }

   @Override
   public void method_33275(ByteBuf var1, T var2) throws Exception {
      this.method_11479(var1, this.field_12496, (T)var2);
   }
}
