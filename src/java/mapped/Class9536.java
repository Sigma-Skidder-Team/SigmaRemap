package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.IRenderCall;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Class9536 {
   private static String[] field44397;
   private final List<ConcurrentLinkedQueue<IRenderCall>> field44398 = ImmutableList.of(
      new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue()
   );
   private volatile int field44399;
   private volatile int field44400;
   private volatile int field44401;

   public Class9536() {
      this.field44399 = this.field44400 = this.field44401 + 1;
   }
}
