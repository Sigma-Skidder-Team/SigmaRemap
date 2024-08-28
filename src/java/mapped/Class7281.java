package mapped;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Class7281 {
   private int field31229 = 64;
   private int field31230 = 5;
   private Runnable field31231;
   private ExecutorService field31232;
   private final Deque<Class1568> field31233 = new ArrayDeque<Class1568>();
   private final Deque<Class1568> field31234 = new ArrayDeque<Class1568>();
   private final Deque<Class2371> field31235 = new ArrayDeque<Class2371>();

   public Class7281(ExecutorService var1) {
      this.field31232 = var1;
   }

   public Class7281() {
   }

   public synchronized ExecutorService method22916() {
      if (this.field31232 == null) {
         this.field31232 = new ThreadPoolExecutor(
            0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Class9474.method36542("OkHttp Dispatcher", false)
         );
      }

      return this.field31232;
   }

   public synchronized void method22917(int var1) {
      if (var1 >= 1) {
         this.field31229 = var1;
         this.method22924();
      } else {
         throw new IllegalArgumentException("max < 1: " + var1);
      }
   }

   public synchronized int method22918() {
      return this.field31229;
   }

   public synchronized void method22919(int var1) {
      if (var1 >= 1) {
         this.field31230 = var1;
         this.method22924();
      } else {
         throw new IllegalArgumentException("max < 1: " + var1);
      }
   }

   public synchronized int method22920() {
      return this.field31230;
   }

   public synchronized void method22921(Runnable var1) {
      this.field31231 = var1;
   }

   public synchronized void method22922(Class1568 var1) {
      if (this.field31234.size() < this.field31229 && this.method22925(var1) < this.field31230) {
         this.field31234.add(var1);
         this.method22916().execute(var1);
      } else {
         this.field31233.add(var1);
      }
   }

   public synchronized void method22923() {
      for (Class1568 var4 : this.field31233) {
         var4.method6487().method9547();
      }

      for (Class1568 var7 : this.field31234) {
         var7.method6487().method9547();
      }

      for (Class2371 var8 : this.field31235) {
         var8.method9547();
      }
   }

   private void method22924() {
      if (this.field31234.size() < this.field31229) {
         if (!this.field31233.isEmpty()) {
            Iterator var3 = this.field31233.iterator();

            while (var3.hasNext()) {
               Class1568 var4 = (Class1568)var3.next();
               if (this.method22925(var4) < this.field31230) {
                  var3.remove();
                  this.field31234.add(var4);
                  this.method22916().execute(var4);
               }

               if (this.field31234.size() >= this.field31229) {
                  return;
               }
            }
         }
      }
   }

   private int method22925(Class1568 var1) {
      int var4 = 0;

      for (Class1568 var6 : this.field31234) {
         if (var6.method6485().equals(var1.method6485())) {
            var4++;
         }
      }

      return var4;
   }

   public synchronized void method22926(Class2371 var1) {
      this.field31235.add(var1);
   }

   public void method22927(Class1568 var1) {
      this.method22929(this.field31234, var1, true);
   }

   public void method22928(Class2371 var1) {
      this.method22929(this.field31235, var1, false);
   }

   private <T> void method22929(Deque<T> var1, T var2, boolean var3) {
      int var7;
      Runnable var8;
      synchronized (this) {
         if (!var1.remove(var2)) {
            throw new AssertionError("Call wasn't in-flight!");
         }

         if (var3) {
            this.method22924();
         }

         var7 = this.method22933();
         var8 = this.field31231;
      }

      if (var7 == 0 && var8 != null) {
         var8.run();
      }
   }

   public synchronized List<Class2370> method22930() {
      ArrayList var3 = new ArrayList();

      for (Class1568 var5 : this.field31233) {
         var3.add(var5.method6487());
      }

      return Collections.<Class2370>unmodifiableList(var3);
   }

   public synchronized List<Class2370> method22931() {
      ArrayList var3 = new ArrayList();
      var3.addAll(this.field31235);

      for (Class1568 var5 : this.field31234) {
         var3.add(var5.method6487());
      }

      return Collections.<Class2370>unmodifiableList(var3);
   }

   public synchronized int method22932() {
      return this.field31233.size();
   }

   public synchronized int method22933() {
      return this.field31234.size() + this.field31235.size();
   }
}
