package mapped;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public final class Class9457 {
   private static final Executor field43939 = new ThreadPoolExecutor(
      0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Class9474.method36542("OkHttp ConnectionPool", true)
   );
   private final int field43940;
   private final long field43941;
   private final Runnable field43942 = new Class720(this);
   private final Deque<Class7263> field43943 = new ArrayDeque<Class7263>();
   public final Class8743 field43944 = new Class8743();
   public boolean field43945;
   public static final boolean field43946 = !Class9457.class.desiredAssertionStatus();

   public Class9457() {
      this(5, 5L, TimeUnit.MINUTES);
   }

   public Class9457(int var1, long var2, TimeUnit var4) {
      this.field43940 = var1;
      this.field43941 = var4.toNanos(var2);
      if (var2 <= 0L) {
         throw new IllegalArgumentException("keepAliveDuration <= 0: " + var2);
      }
   }

   public synchronized int method36391() {
      int var3 = 0;

      for (Class7263 var5 : this.field43943) {
         if (var5.field31166.isEmpty()) {
            var3++;
         }
      }

      return var3;
   }

   public synchronized int method36392() {
      return this.field43943.size();
   }

   @Nullable
   public Class7263 method36393(Class6165 var1, Class5751 var2, Class7723 var3) {
      if (!field43946 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         for (Class7263 var7 : this.field43943) {
            if (var7.method22808(var1, var3)) {
               var2.method17938(var7);
               return var7;
            }
         }

         return null;
      }
   }

   @Nullable
   public Socket method36394(Class6165 var1, Class5751 var2) {
      if (!field43946 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         for (Class7263 var6 : this.field43943) {
            if (var6.method22808(var1, null) && var6.method22819() && var6 != var2.method17932()) {
               return var2.method17940(var6);
            }
         }

         return null;
      }
   }

   public void method36395(Class7263 var1) {
      if (!field43946 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         if (!this.field43945) {
            this.field43945 = true;
            field43939.execute(this.field43942);
         }

         this.field43943.add(var1);
      }
   }

   public boolean method36396(Class7263 var1) {
      if (!field43946 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else if (!var1.field31163 && this.field43940 != 0) {
         this.notifyAll();
         return false;
      } else {
         this.field43943.remove(var1);
         return true;
      }
   }

   public void method36397() {
      List<Class7263> var3 = new ArrayList();
      synchronized (this) {
         Iterator<Class7263> var5 = this.field43943.iterator();

         while (var5.hasNext()) {
            Class7263 var6 = var5.next();
            if (var6.field31166.isEmpty()) {
               var6.field31163 = true;
               var3.add(var6);
               var5.remove();
            }
         }
      }

      for (Class7263 var9 : var3) {
         Class9474.method36536(var9.method22814());
      }
   }

   public long method36398(long var1) {
      int var5 = 0;
      int var6 = 0;
      Class7263 var7 = null;
      long var8 = Long.MIN_VALUE;
      synchronized (this) {
         for (Class7263 var12 : this.field43943) {
            if (this.method36399(var12, var1) > 0) {
               var5++;
            } else {
               var6++;
               long var13 = var1 - var12.field31167;
               if (var13 > var8) {
                  var8 = var13;
                  var7 = var12;
               }
            }
         }

         if (var8 < this.field43941 && var6 <= this.field43940) {
            if (var6 > 0) {
               return this.field43941 - var8;
            }

            if (var5 > 0) {
               return this.field43941;
            }

            this.field43945 = false;
            return -1L;
         }

         this.field43943.remove(var7);
      }

      Class9474.method36536(var7.method22814());
      return 0L;
   }

   private int method36399(Class7263 var1, long var2) {
      List var6 = var1.field31166;
      int var7 = 0;

      while (var7 < var6.size()) {
         Reference var8 = (Reference)var6.get(var7);
         if (var8.get() == null) {
            Class2 var9 = (Class2)var8;
            String var10 = "A connection to " + var1.method22812().method25539().method19049() + " was leaked. Did you forget to close a response body?";
            var6.remove(var7);
            var1.field31163 = true;
            if (var6.isEmpty()) {
               var1.field31167 = var2 - this.field43941;
               return 0;
            }
         } else {
            var7++;
         }
      }

      return var6.size();
   }
}
