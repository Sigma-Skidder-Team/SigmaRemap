package mapped;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class Class341 extends Class342 {
   private boolean field1498;
   private boolean field1499;
   private ScheduledExecutorService field1500;
   private ScheduledFuture field1501;
   private long field1502 = TimeUnit.SECONDS.toNanos(60L);
   private boolean field1503 = false;
   private final Object field1504 = new Object();

   public int method1715() {
      synchronized (this.field1504) {
         return (int)TimeUnit.NANOSECONDS.toSeconds(this.field1502);
      }
   }

   public void method1716(int var1) {
      synchronized (this.field1504) {
         this.field1502 = TimeUnit.SECONDS.toNanos((long)var1);
         if (this.field1502 <= 0L) {
            this.method1721();
         } else {
            if (this.field1503) {
               try {
                  for (Class345 var7 : new ArrayList<Class345>(this.method1662())) {
                     if (var7 instanceof Class346) {
                        Class346 var8 = (Class346)var7;
                        var8.method1808();
                     }
                  }
               } catch (Exception var10) {
                  var10.printStackTrace();
               }

               this.method1719();
            }
         }
      }
   }

   public void method1717() {
      synchronized (this.field1504) {
         if (this.field1500 != null || this.field1501 != null) {
            this.field1503 = false;
            this.method1721();
         }
      }
   }

   public void method1718() {
      synchronized (this.field1504) {
         if (this.field1502 > 0L) {
            this.field1503 = true;
            this.method1719();
         }
      }
   }

   private void method1719() {
      this.method1721();
      this.field1500 = Executors.newSingleThreadScheduledExecutor(new Class7077("connectionLostChecker"));
      Class1487 var3 = new Class1487(this);
      this.field1501 = this.field1500.scheduleAtFixedRate(var3, this.field1502, this.field1502, TimeUnit.NANOSECONDS);
   }

   private void method1720(Class345 var1, long var2) {
      if (var1 instanceof Class346) {
         Class346 var6 = (Class346)var1;
         if (var6.method1807() >= var2) {
            if (var6.method1767()) {
               var6.method1751();
            }
         } else {
            var6.method1774(
               1006,
               "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection"
            );
         }
      }
   }

   public abstract Collection<Class345> method1662();

   private void method1721() {
      if (this.field1500 != null) {
         this.field1500.shutdownNow();
         this.field1500 = null;
      }

      if (this.field1501 != null) {
         this.field1501.cancel(false);
         this.field1501 = null;
      }
   }

   public boolean method1722() {
      return this.field1498;
   }

   public void method1723(boolean var1) {
      this.field1498 = var1;
   }

   public boolean method1724() {
      return this.field1499;
   }

   public void method1725(boolean var1) {
      this.field1499 = var1;
   }

   // $VF: synthetic method
   public static long method1726(Class341 var0) {
      return var0.field1502;
   }

   // $VF: synthetic method
   public static void method1727(Class341 var0, Class345 var1, long var2) {
      var0.method1720(var1, var2);
   }
}
