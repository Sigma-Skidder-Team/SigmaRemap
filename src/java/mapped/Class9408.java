package mapped;

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

public class Class9408 {
   private static final Logger field43645 = LogManager.getLogger();
   private final ScheduledExecutorService field43646 = Executors.newScheduledThreadPool(3);
   private volatile boolean field43647 = true;
   private final Runnable field43648 = new Class603(this);
   private final Runnable field43649 = new Class1462(this);
   private final Runnable field43650 = new Class350(this);
   private final Runnable field43651 = new Class1593(this);
   private final Runnable field43652 = new Class756(this);
   private final Set<Class6128> field43653 = Sets.newHashSet();
   private List<Class6128> field43654 = Lists.newArrayList();
   private Class6119 field43655;
   private int field43656;
   private boolean field43657;
   private boolean field43658;
   private String field43659;
   private ScheduledFuture<?> field43660;
   private ScheduledFuture<?> field43661;
   private ScheduledFuture<?> field43662;
   private ScheduledFuture<?> field43663;
   private ScheduledFuture<?> field43664;
   private final Map<Class2310, Boolean> field43665 = new ConcurrentHashMap<Class2310, Boolean>(Class2310.values().length);

   public boolean method36014() {
      return this.field43647;
   }

   public synchronized void method36015() {
      if (this.field43647) {
         this.field43647 = false;
         this.method36028();
         this.method36027();
      }
   }

   public synchronized void method36016() {
      if (this.field43647) {
         this.field43647 = false;
         this.method36028();
         this.field43665.put(Class2310.field15835, false);
         this.field43661 = this.field43646.scheduleAtFixedRate(this.field43649, 0L, 10L, TimeUnit.SECONDS);
         this.field43665.put(Class2310.field15836, false);
         this.field43662 = this.field43646.scheduleAtFixedRate(this.field43650, 0L, 60L, TimeUnit.SECONDS);
         this.field43665.put(Class2310.field15838, false);
         this.field43664 = this.field43646.scheduleAtFixedRate(this.field43652, 0L, 300L, TimeUnit.SECONDS);
      }
   }

   public boolean method36017(Class2310 var1) {
      Boolean var4 = this.field43665.get(var1);
      return var4 != null ? var4 : false;
   }

   public void method36018() {
      for (Class2310 var4 : this.field43665.keySet()) {
         this.field43665.put(var4, false);
      }
   }

   public synchronized void method36019() {
      this.method36026();
      this.method36015();
   }

   public synchronized List<Class6128> method36020() {
      return Lists.newArrayList(this.field43654);
   }

   public synchronized int method36021() {
      return this.field43656;
   }

   public synchronized boolean method36022() {
      return this.field43657;
   }

   public synchronized Class6119 method36023() {
      return this.field43655;
   }

   public synchronized boolean method36024() {
      return this.field43658;
   }

   public synchronized String method36025() {
      return this.field43659;
   }

   public synchronized void method36026() {
      this.field43647 = true;
      this.method36028();
   }

   private void method36027() {
      for (Class2310 var6 : Class2310.values()) {
         this.field43665.put(var6, false);
      }

      this.field43660 = this.field43646.scheduleAtFixedRate(this.field43648, 0L, 60L, TimeUnit.SECONDS);
      this.field43661 = this.field43646.scheduleAtFixedRate(this.field43649, 0L, 10L, TimeUnit.SECONDS);
      this.field43662 = this.field43646.scheduleAtFixedRate(this.field43650, 0L, 60L, TimeUnit.SECONDS);
      this.field43663 = this.field43646.scheduleAtFixedRate(this.field43651, 0L, 10L, TimeUnit.SECONDS);
      this.field43664 = this.field43646.scheduleAtFixedRate(this.field43652, 0L, 300L, TimeUnit.SECONDS);
   }

   private void method36028() {
      try {
         if (this.field43660 != null) {
            this.field43660.cancel(false);
         }

         if (this.field43661 != null) {
            this.field43661.cancel(false);
         }

         if (this.field43662 != null) {
            this.field43662.cancel(false);
         }

         if (this.field43663 != null) {
            this.field43663.cancel(false);
         }

         if (this.field43664 != null) {
            this.field43664.cancel(false);
         }
      } catch (Exception var4) {
         field43645.error("Failed to cancel Realms tasks", var4);
      }
   }

   private synchronized void method36029(List<Class6128> var1) {
      int var4 = 0;

      for (Class6128 var6 : this.field43653) {
         if (var1.remove(var6)) {
            var4++;
         }
      }

      if (var4 == 0) {
         this.field43653.clear();
      }

      this.field43654 = var1;
   }

   public synchronized void method36030(Class6128 var1) {
      this.field43654.remove(var1);
      this.field43653.add(var1);
   }

   private boolean method36031() {
      return !this.field43647;
   }

   // $VF: synthetic method
   public static boolean method36032(Class9408 var0) {
      return var0.method36031();
   }

   // $VF: synthetic method
   public static Class6119 method36033(Class9408 var0, Class6119 var1) {
      return var0.field43655 = var1;
   }

   // $VF: synthetic method
   public static Map method36034(Class9408 var0) {
      return var0.field43665;
   }

   // $VF: synthetic method
   public static Logger method36035() {
      return field43645;
   }

   // $VF: synthetic method
   public static int method36036(Class9408 var0, int var1) {
      return var0.field43656 = var1;
   }

   // $VF: synthetic method
   public static void method36037(Class9408 var0, List var1) {
      var0.method36029(var1);
   }

   // $VF: synthetic method
   public static boolean method36038(Class9408 var0, boolean var1) {
      return var0.field43657 = var1;
   }

   // $VF: synthetic method
   public static boolean method36039(Class9408 var0, boolean var1) {
      return var0.field43658 = var1;
   }

   // $VF: synthetic method
   public static String method36040(Class9408 var0, String var1) {
      return var0.field43659 = var1;
   }
}
