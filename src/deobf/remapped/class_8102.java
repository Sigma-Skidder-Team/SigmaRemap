package remapped;

import java.util.concurrent.ThreadFactory;

public final class class_8102 implements ThreadFactory {
   @Override
   public Thread newThread(Runnable var1) {
      class_8482.method_39082(new class_8482(var1, null));
      class_8482.method_39081().setName("EventThread");
      class_8482.method_39081().setDaemon(Thread.currentThread().isDaemon());
      return class_8482.method_39081();
   }
}
