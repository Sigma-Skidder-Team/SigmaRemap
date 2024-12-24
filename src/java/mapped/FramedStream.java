package mapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public final class FramedStream {
   public long unacknowledgedBytesRead = 0L;
   public long bytesLeftInWriteWindow;
   public final int id;
   public final FramedConnection connection;
   private final List<Header> requestHeaders;
   private List<Header> responseHeaders;
   private boolean field45335;
   private final Class1754 field45336;
   public final Class1723 field45337;
   public final Class4919 field45338 = new Class4919(this);
   public final Class4919 field45339 = new Class4919(this);
   public Class2077 field45340 = null;
   public static final boolean field45341 = !FramedStream.class.desiredAssertionStatus();

   public FramedStream(int id, FramedConnection connection, boolean var3, boolean var4, List<Header> var5) {
      if (connection != null) {
         if (var5 != null) {
            this.id = id;
            this.connection = connection;
            this.bytesLeftInWriteWindow = (long)connection.field9570.method31385();
            this.field45336 = new Class1754(this, (long)connection.field9568.method31385());
            this.field45337 = new Class1723(this);
            this.field45336.field9490 = var4;
            this.field45337.field9400 = var3;
            this.requestHeaders = var5;
         } else {
            throw new NullPointerException("requestHeaders == null");
         }
      } else {
         throw new NullPointerException("connection == null");
      }
   }

   public int method37976() {
      return this.id;
   }

   public synchronized boolean method37977() {
      return this.field45340 != null
         ? false
         : !this.field45336.field9490 && !this.field45336.field9489 || !this.field45337.field9400 && !this.field45337.field9399 || !this.field45335;
   }

   public boolean method37978() {
      boolean var3 = (this.id & 1) == 1;
      return this.connection.field9555 == var3;
   }

   public FramedConnection method37979() {
      return this.connection;
   }

   public List<Header> method37980() {
      return this.requestHeaders;
   }

   public synchronized List<Header> method37981() throws IOException {
      if (!this.method37978()) {
         throw new IllegalStateException("servers cannot read response headers");
      } else {
         this.field45338.method15219();

         try {
            while (this.responseHeaders == null && this.field45340 == null) {
               this.method37998();
            }
         } finally {
            this.field45338.method15231();
         }

         List var3 = this.responseHeaders;
         if (var3 != null) {
            this.responseHeaders = null;
            return var3;
         } else {
            throw new Class2461(this.field45340);
         }
      }
   }

   public synchronized Class2077 method37982() {
      return this.field45340;
   }

   public void method37983(List<Header> var1, boolean var2) throws IOException {
      if (!field45341 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else if (var1 == null) {
         throw new NullPointerException("responseHeaders == null");
      } else {
         boolean var5 = false;
         synchronized (this) {
            this.field45335 = true;
            if (!var2) {
               this.field45337.field9400 = true;
               var5 = true;
            }
         }

         this.connection.method7713(this.id, var5, var1);
         if (var5) {
            this.connection.method7723();
         }
      }
   }

   public Class4916 method37984() {
      return this.field45338;
   }

   public Class4916 method37985() {
      return this.field45339;
   }

   public Class1737 method37986() {
      return this.field45336;
   }

   public Sink getSink() {
      synchronized (this) {
         if (!this.field45335 && !this.method37978()) {
            throw new IllegalStateException("reply before requesting the sink");
         }
      }

      return this.field45337;
   }

   public void method37988(Class2077 var1) throws IOException {
      if (this.method37990(var1)) {
         this.connection.method7717(this.id, var1);
      }
   }

   public void method37989(Class2077 var1) {
      if (this.method37990(var1)) {
         this.connection.method7716(this.id, var1);
      }
   }

   private boolean method37990(Class2077 var1) {
      if (!field45341 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         synchronized (this) {
            if (this.field45340 != null) {
               return false;
            }

            if (this.field45336.field9490 && this.field45337.field9400) {
               return false;
            }

            this.field45340 = var1;
            this.notifyAll();
         }

         this.connection.method7708(this.id);
         return true;
      }
   }

   public void method37991(List<Header> var1) {
      if (!field45341 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         boolean var4 = true;
         synchronized (this) {
            this.field45335 = true;
            if (this.responseHeaders == null) {
               this.responseHeaders = var1;
               var4 = this.method37977();
               this.notifyAll();
            } else {
               ArrayList var6 = new ArrayList();
               var6.addAll(this.responseHeaders);
               var6.add(null);
               var6.addAll(var1);
               this.responseHeaders = var6;
            }
         }

         if (!var4) {
            this.connection.method7708(this.id);
         }
      }
   }

   public void method37992(Class1735 var1, int var2) throws IOException {
      if (!field45341 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         this.field45336.method7673(var1, (long)var2);
      }
   }

   public void method37993() {
      if (!field45341 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         boolean var4;
         synchronized (this) {
            this.field45336.field9490 = true;
            var4 = this.method37977();
            this.notifyAll();
         }

         if (!var4) {
            this.connection.method7708(this.id);
         }
      }
   }

   public synchronized void method37994(Class2077 var1) {
      if (this.field45340 == null) {
         this.field45340 = var1;
         this.notifyAll();
      }
   }

   public void method37995() throws IOException {
      if (!field45341 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         boolean var4;
         boolean var5;
         synchronized (this) {
            var4 = !this.field45336.field9490 && this.field45336.field9489 && (this.field45337.field9400 || this.field45337.field9399);
            var5 = this.method37977();
         }

         if (var4) {
            this.method37988(Class2077.field13532);
         } else if (!var5) {
            this.connection.method7708(this.id);
         }
      }
   }

   public void method37996(long var1) {
      this.bytesLeftInWriteWindow += var1;
      if (var1 > 0L) {
         this.notifyAll();
      }
   }

   public void method37997() throws IOException {
      if (!this.field45337.field9399) {
         if (!this.field45337.field9400) {
            if (this.field45340 != null) {
               throw new Class2461(this.field45340);
            }
         } else {
            throw new IOException("stream finished");
         }
      } else {
         throw new IOException("stream closed");
      }
   }

   public void method37998() throws InterruptedIOException {
      try {
         this.wait();
      } catch (InterruptedException var4) {
         throw new InterruptedIOException();
      }
   }
}
