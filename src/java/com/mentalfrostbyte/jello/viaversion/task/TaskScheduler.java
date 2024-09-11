package com.mentalfrostbyte.jello.viaversion.task;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import mapped.Class7288;
import mapped.Class763;
import mapped.Class8880;
import mapped.Class8881;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler implements Class7288 {
   private final ExecutorService field31266;
   private final ScheduledExecutorService field31267;
   private final Multimap<Object, Class763> field31268 = Multimaps.synchronizedMultimap(Multimaps.newSetMultimap(new IdentityHashMap(), HashSet::new));

   public TaskScheduler() {
      this.field31266 = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Jello Portal Task Scheduler - #%d").build());
      this.field31267 = Executors.newSingleThreadScheduledExecutor(
         new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Jello Portal Task Scheduler Timer").build()
      );
   }

   @Override
   public Class8881 scheduleTask(Object var1, Runnable var2) {
      Preconditions.checkNotNull(var1, "plugin");
      Preconditions.checkNotNull(var2, "runnable");
      return new Class8880(this, var1, var2);
   }

   public boolean shutdown() throws InterruptedException {
      ImmutableList<Class763> var4;
      synchronized (this.field31268) {
         var4 = ImmutableList.copyOf(this.field31268.values());
      }

      for (Class763 var5 : var4) {
         var5.cancel();
      }

      this.field31267.shutdown();
      this.field31266.shutdown();
      return this.field31266.awaitTermination(10L, TimeUnit.SECONDS);
   }

   // $VF: synthetic method
   public static Multimap method23047(TaskScheduler var0) {
      return var0.field31268;
   }

   // $VF: synthetic method
   public static ScheduledExecutorService method23048(TaskScheduler var0) {
      return var0.field31267;
   }

   // $VF: synthetic method
   public static ExecutorService method23049(TaskScheduler var0) {
      return var0.field31266;
   }
}
