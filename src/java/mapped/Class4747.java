package mapped;

import io.netty.buffer.ByteBuf;

public abstract class Class4747<T, X> extends Class4750<T> {
   private final X field22514;

   public Class4747(X var1, Class<T> var2) {
      super(var2);
      this.field22514 = (X)var1;
   }

   public abstract T method14893(ByteBuf var1, X var2) throws Exception;

   public abstract void method14892(ByteBuf var1, X var2, T var3) throws Exception;

   @Override
   public T method14894(ByteBuf var1) throws Exception {
      return this.method14893(var1, this.field22514);
   }

   @Override
   public void method14895(ByteBuf var1, T var2) throws Exception {
      this.method14892(var1, this.field22514, (T)var2);
   }
}
