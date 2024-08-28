package mapped;

import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;

public class Class9469 {
   private static String[] field44002;
   private final float field44003;
   private final AtomicReference<Class7240> field44004 = new AtomicReference<Class7240>();

   public Class9469(Duration var1) {
      this.field44003 = 1000.0F / (float)var1.toMillis();
   }

   public void method36514(String var1) {
      Class7240 var4 = this.field44004
         .updateAndGet(
            var2 -> var2 != null && var1.equals(Class7240.method22735(var2)) ? var2 : new Class7240(var1, RateLimiter.create((double)this.field44003))
         );
      if (Class7240.method22734(var4).tryAcquire(1)) {
         Class6688.field29302.method20400(ChatType.SYSTEM, new StringTextComponent(var1), Util.field45724);
      }
   }
}
