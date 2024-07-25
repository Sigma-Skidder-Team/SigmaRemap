package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;

public abstract class class_1681 extends class_1777 {
   public abstract class_8039<class_5407> method_7527();

   public List<class_5407> method_7529(ByteBuf var1) throws Exception {
      class_8039 var4 = this.method_7527();
      ArrayList var5 = new ArrayList();

      class_5407 var6;
      do {
         var6 = (class_5407)var4.method_9912(var1);
         if (var6 != null) {
            var5.add(var6);
         }
      } while (var6 != null);

      return var5;
   }

   public void method_7526(ByteBuf var1, List<class_5407> var2) throws Exception {
      class_8039 var5 = this.method_7527();

      for (class_5407 var7 : var2) {
         var5.method_33275(var1, var7);
      }

      this.method_7528(var5, var1);
   }

   public abstract void method_7528(class_8039<class_5407> var1, ByteBuf var2) throws Exception;
}
