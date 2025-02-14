package mapped;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Class7077 implements ThreadFactory {
   private final ThreadFactory field30465 = Executors.defaultThreadFactory();
   private final AtomicInteger field30466 = new AtomicInteger(1);
   private final String field30467;

   public Class7077(String var1) {
      this.field30467 = var1;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var4 = this.field30465.newThread(var1);
      var4.setName(this.field30467 + "-" + this.field30466);
      return var4;
   }
}
