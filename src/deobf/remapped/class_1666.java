package remapped;

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

public final class class_1666 {
   private int field_8635 = 64;
   private int field_8634 = 5;
   private Runnable field_8629;
   private ExecutorService field_8633;
   private final Deque<class_9722> field_8630 = new ArrayDeque<class_9722>();
   private final Deque<class_9722> field_8631 = new ArrayDeque<class_9722>();
   private final Deque<class_1987> field_8632 = new ArrayDeque<class_1987>();

   public class_1666(ExecutorService var1) {
      this.field_8633 = var1;
   }

   public class_1666() {
   }

   public synchronized ExecutorService method_7436() {
      if (this.field_8633 == null) {
         this.field_8633 = new ThreadPoolExecutor(
            0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), class_8515.method_39209("OkHttp Dispatcher", false)
         );
      }

      return this.field_8633;
   }

   public synchronized void method_7433(int var1) {
      if (var1 >= 1) {
         this.field_8635 = var1;
         this.method_7425();
      } else {
         throw new IllegalArgumentException("max < 1: " + var1);
      }
   }

   public synchronized int method_7429() {
      return this.field_8635;
   }

   public synchronized void method_7423(int var1) {
      if (var1 >= 1) {
         this.field_8634 = var1;
         this.method_7425();
      } else {
         throw new IllegalArgumentException("max < 1: " + var1);
      }
   }

   public synchronized int method_7432() {
      return this.field_8634;
   }

   public synchronized void method_7424(Runnable var1) {
      this.field_8629 = var1;
   }

   public synchronized void method_7431(class_9722 var1) {
      if (this.field_8631.size() < this.field_8635 && this.method_7435(var1) < this.field_8634) {
         this.field_8631.add(var1);
         this.method_7436().execute(var1);
      } else {
         this.field_8630.add(var1);
      }
   }

   public synchronized void method_7421() {
      for (class_9722 var4 : this.field_8630) {
         var4.method_44924().method_20244();
      }

      for (class_9722 var7 : this.field_8631) {
         var7.method_44924().method_20244();
      }

      for (class_1987 var8 : this.field_8632) {
         var8.method_20244();
      }
   }

   private void method_7425() {
      if (this.field_8631.size() < this.field_8635) {
         if (!this.field_8630.isEmpty()) {
            Iterator var3 = this.field_8630.iterator();

            while (var3.hasNext()) {
               class_9722 var4 = (class_9722)var3.next();
               if (this.method_7435(var4) < this.field_8634) {
                  var3.remove();
                  this.field_8631.add(var4);
                  this.method_7436().execute(var4);
               }

               if (this.field_8631.size() >= this.field_8635) {
                  return;
               }
            }
         }
      }
   }

   private int method_7435(class_9722 var1) {
      int var4 = 0;

      for (class_9722 var6 : this.field_8631) {
         if (var6.method_44923().equals(var1.method_44923())) {
            var4++;
         }
      }

      return var4;
   }

   public synchronized void method_7422(class_1987 var1) {
      this.field_8632.add(var1);
   }

   public void method_7428(class_9722 var1) {
      this.method_7426(this.field_8631, var1, true);
   }

   public void method_7427(class_1987 var1) {
      this.method_7426(this.field_8632, var1, false);
   }

   private <T> void method_7426(Deque<T> var1, T var2, boolean var3) {
      int var7;
      Runnable var8;
      synchronized (this) {
         if (!var1.remove(var2)) {
            throw new AssertionError("Call wasn't in-flight!");
         }

         if (var3) {
            this.method_7425();
         }

         var7 = this.method_7437();
         var8 = this.field_8629;
      }

      if (var7 == 0 && var8 != null) {
         var8.run();
      }
   }

   public synchronized List<class_4365> method_7430() {
      ArrayList var3 = new ArrayList();

      for (class_9722 var5 : this.field_8630) {
         var3.add(var5.method_44924());
      }

      return Collections.<class_4365>unmodifiableList(var3);
   }

   public synchronized List<class_4365> method_7434() {
      ArrayList var3 = new ArrayList();
      var3.addAll(this.field_8632);

      for (class_9722 var5 : this.field_8631) {
         var3.add(var5.method_44924());
      }

      return Collections.<class_4365>unmodifiableList(var3);
   }

   public synchronized int method_7438() {
      return this.field_8630.size();
   }

   public synchronized int method_7437() {
      return this.field_8631.size() + this.field_8632.size();
   }
}
