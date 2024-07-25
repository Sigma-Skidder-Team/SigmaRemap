package remapped;

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

public final class class_8467 {
   private static final Executor field_43279 = new ThreadPoolExecutor(
      0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), class_8515.method_39209("OkHttp ConnectionPool", true)
   );
   private final int field_43272;
   private final long field_43274;
   private final Runnable field_43277 = new class_5515(this);
   private final Deque<class_1617> field_43271 = new ArrayDeque<class_1617>();
   public final class_5740 field_43278 = new class_5740();
   public boolean field_43273;

   public class_8467() {
      this(5, 5L, TimeUnit.MINUTES);
   }

   public class_8467(int var1, long var2, TimeUnit var4) {
      this.field_43272 = var1;
      this.field_43274 = var4.toNanos(var2);
      if (var2 <= 0L) {
         throw new IllegalArgumentException("keepAliveDuration <= 0: " + var2);
      }
   }

   public synchronized int method_38948() {
      int var3 = 0;

      for (class_1617 var5 : this.field_43271) {
         if (var5.field_8404.isEmpty()) {
            var3++;
         }
      }

      return var3;
   }

   public synchronized int method_38940() {
      return this.field_43271.size();
   }

   @Nullable
   public class_1617 method_38944(class_497 var1, class_327 var2, class_2535 var3) {
      assert Thread.holdsLock(this);

      for (class_1617 var7 : this.field_43271) {
         if (var7.method_7209(var1, var3)) {
            var2.method_1514(var7);
            return var7;
         }
      }

      return null;
   }

   @Nullable
   public Socket method_38939(class_497 var1, class_327 var2) {
      assert Thread.holdsLock(this);

      for (class_1617 var6 : this.field_43271) {
         if (var6.method_7209(var1, null) && var6.method_7214() && var6 != var2.method_1522()) {
            return var2.method_1524(var6);
         }
      }

      return null;
   }

   public void method_38942(class_1617 var1) {
      assert Thread.holdsLock(this);

      if (!this.field_43273) {
         this.field_43273 = true;
         field_43279.execute(this.field_43277);
      }

      this.field_43271.add(var1);
   }

   public boolean method_38943(class_1617 var1) {
      assert Thread.holdsLock(this);

      if (!var1.field_8399 && this.field_43272 != 0) {
         this.notifyAll();
         return false;
      } else {
         this.field_43271.remove(var1);
         return true;
      }
   }

   public void method_38947() {
      ArrayList var3 = new ArrayList();
      synchronized (this) {
         Iterator var5 = this.field_43271.iterator();

         while (var5.hasNext()) {
            class_1617 var6 = (class_1617)var5.next();
            if (var6.field_8404.isEmpty()) {
               var6.field_8399 = true;
               var3.add(var6);
               var5.remove();
            }
         }
      }

      for (class_1617 var9 : var3) {
         class_8515.method_39202(var9.method_21599());
      }
   }

   public long method_38946(long var1) {
      int var5 = 0;
      int var6 = 0;
      class_1617 var7 = null;
      long var8 = Long.MIN_VALUE;
      synchronized (this) {
         for (class_1617 var12 : this.field_43271) {
            if (this.method_38941(var12, var1) > 0) {
               var5++;
            } else {
               var6++;
               long var13 = var1 - var12.field_8395;
               if (var13 > var8) {
                  var8 = var13;
                  var7 = var12;
               }
            }
         }

         if (var8 < this.field_43274 && var6 <= this.field_43272) {
            if (var6 > 0) {
               return this.field_43274 - var8;
            }

            if (var5 > 0) {
               return this.field_43274;
            }

            this.field_43273 = false;
            return -1L;
         }

         this.field_43271.remove(var7);
      }

      class_8515.method_39202(var7.method_21599());
      return 0L;
   }

   private int method_38941(class_1617 var1, long var2) {
      List var6 = var1.field_8404;
      int var7 = 0;

      while (var7 < var6.size()) {
         Reference var8 = (Reference)var6.get(var7);
         if (var8.get() == null) {
            class_9570 var9 = (class_9570)var8;
            String var10 = "A connection to " + var1.method_21597().method_11559().method_2484() + " was leaked. Did you forget to close a response body?";
            class_3307.method_15163().method_15170(var10, var9.field_48693);
            var6.remove(var7);
            var1.field_8399 = true;
            if (var6.isEmpty()) {
               var1.field_8395 = var2 - this.field_43274;
               return 0;
            }
         } else {
            var7++;
         }
      }

      return var6.size();
   }
}
