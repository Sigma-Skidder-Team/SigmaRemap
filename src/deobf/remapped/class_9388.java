package remapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public final class class_9388 {
   public long field_47974 = 0L;
   public long field_47982;
   public final int field_47976;
   public final class_2695 field_47980;
   private final List<class_4331> field_47978;
   private List<class_4331> field_47981;
   private boolean field_47973;
   private final class_4679 field_47977;
   public final class_1497 field_47985;
   public final class_5136 field_47975 = new class_5136(this);
   public final class_5136 field_47984 = new class_5136(this);
   public class_1692 field_47986 = null;

   public class_9388(int var1, class_2695 var2, boolean var3, boolean var4, List<class_4331> var5) {
      if (var2 != null) {
         if (var5 != null) {
            this.field_47976 = var1;
            this.field_47980 = var2;
            this.field_47982 = (long)var2.field_13190.method_25452();
            this.field_47977 = new class_4679(this, (long)var2.field_13205.method_25452());
            this.field_47985 = new class_1497(this);
            this.field_47977.field_22805 = var4;
            this.field_47985.field_7953 = var3;
            this.field_47978 = var5;
         } else {
            throw new NullPointerException("requestHeaders == null");
         }
      } else {
         throw new NullPointerException("connection == null");
      }
   }

   public int method_43409() {
      return this.field_47976;
   }

   public synchronized boolean method_43414() {
      return this.field_47986 != null
         ? false
         : !this.field_47977.field_22805 && !this.field_47977.field_22810 || !this.field_47985.field_7953 && !this.field_47985.field_7954 || !this.field_47973;
   }

   public boolean method_43423() {
      boolean var3 = (this.field_47976 & 1) == 1;
      return this.field_47980.field_13208 == var3;
   }

   public class_2695 method_43405() {
      return this.field_47980;
   }

   public List<class_4331> method_43406() {
      return this.field_47978;
   }

   public synchronized List<class_4331> method_43407() throws IOException {
      if (!this.method_43423()) {
         throw new IllegalStateException("servers cannot read response headers");
      } else {
         this.field_47975.method_6243();

         try {
            while (this.field_47981 == null && this.field_47986 == null) {
               this.method_43428();
            }
         } finally {
            this.field_47975.method_23549();
         }

         List var3 = this.field_47981;
         if (var3 != null) {
            this.field_47981 = null;
            return var3;
         } else {
            throw new class_7199(this.field_47986);
         }
      }
   }

   public synchronized class_1692 method_43421() {
      return this.field_47986;
   }

   public void method_43411(List<class_4331> var1, boolean var2) throws IOException {
      assert !Thread.holdsLock(this);

      if (var1 == null) {
         throw new NullPointerException("responseHeaders == null");
      } else {
         boolean var5 = false;
         synchronized (this) {
            this.field_47973 = true;
            if (!var2) {
               this.field_47985.field_7953 = true;
               var5 = true;
            }
         }

         this.field_47980.method_12133(this.field_47976, var5, var1);
         if (var5) {
            this.field_47980.method_12127();
         }
      }
   }

   public class_245 method_43417() {
      return this.field_47975;
   }

   public class_245 method_43412() {
      return this.field_47984;
   }

   public class_5322 method_43408() {
      return this.field_47977;
   }

   public class_4131 method_43418() {
      synchronized (this) {
         if (!this.field_47973 && !this.method_43423()) {
            throw new IllegalStateException("reply before requesting the sink");
         }
      }

      return this.field_47985;
   }

   public void method_43415(class_1692 var1) throws IOException {
      if (this.method_43419(var1)) {
         this.field_47980.method_12130(this.field_47976, var1);
      }
   }

   public void method_43426(class_1692 var1) {
      if (this.method_43419(var1)) {
         this.field_47980.method_12129(this.field_47976, var1);
      }
   }

   private boolean method_43419(class_1692 var1) {
      assert !Thread.holdsLock(this);

      synchronized (this) {
         if (this.field_47986 != null) {
            return false;
         }

         if (this.field_47977.field_22805 && this.field_47985.field_7953) {
            return false;
         }

         this.field_47986 = var1;
         this.notifyAll();
      }

      this.field_47980.method_12136(this.field_47976);
      return true;
   }

   public void method_43416(List<class_4331> var1) {
      assert !Thread.holdsLock(this);

      boolean var4 = true;
      synchronized (this) {
         this.field_47973 = true;
         if (this.field_47981 == null) {
            this.field_47981 = var1;
            var4 = this.method_43414();
            this.notifyAll();
         } else {
            ArrayList var6 = new ArrayList();
            var6.addAll(this.field_47981);
            var6.add(null);
            var6.addAll(var1);
            this.field_47981 = var6;
         }
      }

      if (!var4) {
         this.field_47980.method_12136(this.field_47976);
      }
   }

   public void method_43420(class_8067 var1, int var2) throws IOException {
      assert !Thread.holdsLock(this);

      this.field_47977.method_21632(var1, (long)var2);
   }

   public void method_43424() {
      assert !Thread.holdsLock(this);

      boolean var4;
      synchronized (this) {
         this.field_47977.field_22805 = true;
         var4 = this.method_43414();
         this.notifyAll();
      }

      if (!var4) {
         this.field_47980.method_12136(this.field_47976);
      }
   }

   public synchronized void method_43425(class_1692 var1) {
      if (this.field_47986 == null) {
         this.field_47986 = var1;
         this.notifyAll();
      }
   }

   public void method_43427() throws IOException {
      assert !Thread.holdsLock(this);

      boolean var4;
      boolean var5;
      synchronized (this) {
         var4 = !this.field_47977.field_22805 && this.field_47977.field_22810 && (this.field_47985.field_7953 || this.field_47985.field_7954);
         var5 = this.method_43414();
      }

      if (var4) {
         this.method_43415(class_1692.field_8762);
      } else if (!var5) {
         this.field_47980.method_12136(this.field_47976);
      }
   }

   public void method_43410(long var1) {
      this.field_47982 += var1;
      if (var1 > 0L) {
         this.notifyAll();
      }
   }

   public void method_43413() throws IOException {
      if (!this.field_47985.field_7954) {
         if (!this.field_47985.field_7953) {
            if (this.field_47986 != null) {
               throw new class_7199(this.field_47986);
            }
         } else {
            throw new IOException("stream finished");
         }
      } else {
         throw new IOException("stream closed");
      }
   }

   public void method_43428() throws InterruptedIOException {
      try {
         this.wait();
      } catch (InterruptedException var4) {
         throw new InterruptedIOException();
      }
   }
}
