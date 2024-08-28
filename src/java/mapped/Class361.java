package mapped;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public final class Class361 extends ForkJoinWorkerThread {
   public Class361(ForkJoinPool var1) {
      super(var1);
   }

   @Override
   public void onTermination(Throwable var1) {
      if (var1 == null) {
         Util.method38542().debug("{} shutdown", this.getName());
      } else {
         Util.method38542().warn("{} died", this.getName(), var1);
      }

      super.onTermination(var1);
   }
}
