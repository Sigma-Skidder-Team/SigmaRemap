package remapped;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class class_8692 implements class_1689 {
   private final ExecutorService field_44584;
   private final ScheduledExecutorService field_44585;
   private final Multimap<Object, class_9786> field_44586 = Multimaps.synchronizedMultimap(Multimaps.newSetMultimap(new IdentityHashMap(), HashSet::new));

   public class_8692() {
      this.field_44584 = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Jello Portal Task Scheduler - #%d").build());
      this.field_44585 = Executors.newSingleThreadScheduledExecutor(
         new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Jello Portal Task Scheduler Timer").build()
      );
   }

   public class_8119 츚鶲뎫ꈍ쥡괠(Object var1, Runnable var2) {
      Preconditions.checkNotNull(var1, "plugin");
      Preconditions.checkNotNull(var2, "runnable");
      return new class_6245(this, var1, var2, null);
   }

   public boolean method_39920() throws InterruptedException {
      ImmutableList var4;
      synchronized (this.field_44586) {
         var4 = ImmutableList.copyOf(this.field_44586.values());
      }

      for (class_9786 var5 : var4) {
         var5.method_45180();
      }

      this.field_44585.shutdown();
      this.field_44584.shutdown();
      return this.field_44584.awaitTermination(10L, TimeUnit.SECONDS);
   }
}
