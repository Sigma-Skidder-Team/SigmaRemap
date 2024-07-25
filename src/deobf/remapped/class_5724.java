package remapped;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public final class class_5724 extends ForkJoinWorkerThread {
   public class_5724(ForkJoinPool var1) {
      super(var1);
   }

   @Override
   public void onTermination(Throwable var1) {
      if (var1 == null) {
         Util.method_44663().debug("{} shutdown", this.getName());
      } else {
         Util.method_44663().warn("{} died", this.getName(), var1);
      }

      super.onTermination(var1);
   }
}
