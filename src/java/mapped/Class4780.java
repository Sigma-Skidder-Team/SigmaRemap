package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;

public abstract class Class4780 extends Class4779 {
   public abstract Class4750<Class8656> method14911();

   public List<Class8656> method14894(ByteBuf var1) throws Exception {
      Class4750 var4 = this.method14911();
      ArrayList var5 = new ArrayList();

      Class8656 var6;
      do {
         var6 = (Class8656)var4.method14894(var1);
         if (var6 != null) {
            var5.add(var6);
         }
      } while (var6 != null);

      return var5;
   }

   public void method14895(ByteBuf var1, List<Class8656> var2) throws Exception {
      Class4750 var5 = this.method14911();

      for (Class8656 var7 : var2) {
         var5.method14895(var1, var7);
      }

      this.method14912(var5, var1);
   }

   public abstract void method14912(Class4750<Class8656> var1, ByteBuf var2) throws Exception;
}
