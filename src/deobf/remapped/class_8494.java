package remapped;

import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;

public class class_8494 {
   private static String[] field_43512;
   private final float field_43514;
   private final AtomicReference<class_1577> field_43513 = new AtomicReference<class_1577>();

   public class_8494(Duration var1) {
      this.field_43514 = 1000.0F / (float)var1.toMillis();
   }

   public void method_39148(String var1) {
      class_1577 var4 = this.field_43513
         .updateAndGet(
            var2 -> var2 != null && var1.equals(class_1577.method_7115(var2)) ? var2 : new class_1577(var1, RateLimiter.create((double)this.field_43514))
         );
      if (class_1577.method_7113(var4).tryAcquire(1)) {
         NarratorChatListener.INSTANCE.method_44914(ChatType.SYSTEM, new StringTextComponent(var1), Util.NIL_UUID);
      }
   }
}
