package mapped;

import io.netty.buffer.ByteBuf;
import java.lang.reflect.Array;

public class Class4752<T> extends BruhMotha<T[]> {
   private final BruhMotha<T> field22577;

   public Class4752(BruhMotha<T> var1) {
      super(var1.method14899() + " Array", (Class<? super T[]>)method14900(var1.method14898()));
      this.field22577 = var1;
   }

   public static Class<?> method14900(Class<?> var0) {
      return Array.newInstance(var0, 0).getClass();
   }

   public T[] method14894(ByteBuf var1) throws Exception {
      int var4 = BruhMotha.field22544.method14907(var1);
      Object[] var5 = (Object[])Array.newInstance(this.field22577.method14898(), var4);

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = this.field22577.method14894(var1);
      }

      return (T[])var5;
   }

   public void method14895(ByteBuf var1, T[] var2) throws Exception {
      BruhMotha.field22544.method14908(var1, var2.length);

      for (Object var8 : var2) {
         this.field22577.method14895(var1, (T)var8);
      }
   }
}
