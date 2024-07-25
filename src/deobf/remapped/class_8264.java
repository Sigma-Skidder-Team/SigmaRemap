package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8264 {
   private static final Logger field_42395 = LogManager.getLogger();
   private final ScheduledExecutorService field_42404 = Executors.newScheduledThreadPool(3);
   private volatile boolean field_42399 = true;
   private final Runnable field_42402 = new class_6401(this, null);
   private final Runnable field_42410 = new class_4987(this, null);
   private final Runnable field_42392 = new class_9800(this, null);
   private final Runnable field_42405 = new class_8277(this, null);
   private final Runnable field_42397 = new class_1528(this, null);
   private final Set<class_7675> field_42407 = Sets.newHashSet();
   private List<class_7675> field_42391 = Lists.newArrayList();
   private class_8793 field_42394;
   private int field_42393;
   private boolean field_42406;
   private boolean field_42398;
   private String field_42400;
   private ScheduledFuture<?> field_42409;
   private ScheduledFuture<?> field_42412;
   private ScheduledFuture<?> field_42403;
   private ScheduledFuture<?> field_42396;
   private ScheduledFuture<?> field_42401;
   private final Map<class_2845, Boolean> field_42408 = new ConcurrentHashMap<class_2845, Boolean>(class_2845.values().length);

   public boolean method_38095() {
      return this.field_42399;
   }

   public synchronized void method_38110() {
      if (this.field_42399) {
         this.field_42399 = false;
         this.method_38086();
         this.method_38106();
      }
   }

   public synchronized void method_38104() {
      if (this.field_42399) {
         this.field_42399 = false;
         this.method_38086();
         this.field_42408.put(class_2845.field_13950, false);
         this.field_42412 = this.field_42404.scheduleAtFixedRate(this.field_42410, 0L, 10L, TimeUnit.SECONDS);
         this.field_42408.put(class_2845.field_13952, false);
         this.field_42403 = this.field_42404.scheduleAtFixedRate(this.field_42392, 0L, 60L, TimeUnit.SECONDS);
         this.field_42408.put(class_2845.field_13949, false);
         this.field_42401 = this.field_42404.scheduleAtFixedRate(this.field_42397, 0L, 300L, TimeUnit.SECONDS);
      }
   }

   public boolean method_38103(class_2845 var1) {
      Boolean var4 = this.field_42408.get(var1);
      return var4 != null ? var4 : false;
   }

   public void method_38084() {
      for (class_2845 var4 : this.field_42408.keySet()) {
         this.field_42408.put(var4, false);
      }
   }

   public synchronized void method_38094() {
      this.method_38107();
      this.method_38110();
   }

   public synchronized List<class_7675> method_38098() {
      return Lists.newArrayList(this.field_42391);
   }

   public synchronized int method_38101() {
      return this.field_42393;
   }

   public synchronized boolean method_38089() {
      return this.field_42406;
   }

   public synchronized class_8793 method_38109() {
      return this.field_42394;
   }

   public synchronized boolean method_38105() {
      return this.field_42398;
   }

   public synchronized String method_38099() {
      return this.field_42400;
   }

   public synchronized void method_38107() {
      this.field_42399 = true;
      this.method_38086();
   }

   private void method_38106() {
      for (class_2845 var6 : class_2845.values()) {
         this.field_42408.put(var6, false);
      }

      this.field_42409 = this.field_42404.scheduleAtFixedRate(this.field_42402, 0L, 60L, TimeUnit.SECONDS);
      this.field_42412 = this.field_42404.scheduleAtFixedRate(this.field_42410, 0L, 10L, TimeUnit.SECONDS);
      this.field_42403 = this.field_42404.scheduleAtFixedRate(this.field_42392, 0L, 60L, TimeUnit.SECONDS);
      this.field_42396 = this.field_42404.scheduleAtFixedRate(this.field_42405, 0L, 10L, TimeUnit.SECONDS);
      this.field_42401 = this.field_42404.scheduleAtFixedRate(this.field_42397, 0L, 300L, TimeUnit.SECONDS);
   }

   private void method_38086() {
      try {
         if (this.field_42409 != null) {
            this.field_42409.cancel(false);
         }

         if (this.field_42412 != null) {
            this.field_42412.cancel(false);
         }

         if (this.field_42403 != null) {
            this.field_42403.cancel(false);
         }

         if (this.field_42396 != null) {
            this.field_42396.cancel(false);
         }

         if (this.field_42401 != null) {
            this.field_42401.cancel(false);
         }
      } catch (Exception var4) {
         field_42395.error("Failed to cancel Realms tasks", var4);
      }
   }

   private synchronized void method_38085(List<class_7675> var1) {
      int var4 = 0;

      for (class_7675 var6 : this.field_42407) {
         if (var1.remove(var6)) {
            var4++;
         }
      }

      if (var4 == 0) {
         this.field_42407.clear();
      }

      this.field_42391 = var1;
   }

   public synchronized void method_38108(class_7675 var1) {
      this.field_42391.remove(var1);
      this.field_42407.add(var1);
   }

   private boolean method_38091() {
      return !this.field_42399;
   }
}
