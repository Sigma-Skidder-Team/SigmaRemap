package remapped;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class class_2264 extends class_7369 implements Runnable {
   private static final int field_11270 = Runtime.getRuntime().availableProcessors();
   private final Collection<class_4809> field_11267;
   private final InetSocketAddress field_11263;
   private ServerSocketChannel field_11265;
   private Selector field_11273;
   private List<class_7212> field_11271;
   private Thread field_11269;
   private final AtomicBoolean field_11274 = new AtomicBoolean(false);
   public List<class_2788> field_11266;
   private List<class_5913> field_11268;
   private BlockingQueue<ByteBuffer> field_11264;
   private int field_11262 = 0;
   private final AtomicInteger field_11272 = new AtomicInteger(0);
   private class_760 field_11261 = new class_4124();

   public class_2264() {
      this(new InetSocketAddress(80), field_11270, null);
   }

   public class_2264(InetSocketAddress var1) {
      this(var1, field_11270, null);
   }

   public class_2264(InetSocketAddress var1, int var2) {
      this(var1, var2, null);
   }

   public class_2264(InetSocketAddress var1, List<class_7212> var2) {
      this(var1, field_11270, var2);
   }

   public class_2264(InetSocketAddress var1, int var2, List<class_7212> var3) {
      this(var1, var2, var3, new HashSet<class_4809>());
   }

   public class_2264(InetSocketAddress var1, int var2, List<class_7212> var3, Collection<class_4809> var4) {
      if (var1 != null && var2 >= 1 && var4 != null) {
         if (var3 != null) {
            this.field_11271 = var3;
         } else {
            this.field_11271 = Collections.<class_7212>emptyList();
         }

         this.field_11263 = var1;
         this.field_11267 = var4;
         this.method_33564(false);
         this.method_33562(false);
         this.field_11268 = new LinkedList<class_5913>();
         this.field_11266 = new ArrayList<class_2788>(var2);
         this.field_11264 = new LinkedBlockingQueue<ByteBuffer>();

         for (int var7 = 0; var7 < var2; var7++) {
            class_2788 var8 = new class_2788(this);
            this.field_11266.add(var8);
         }
      } else {
         throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
      }
   }

   public void method_10404() {
      if (this.field_11269 == null) {
         new Thread(this).start();
      } else {
         throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
      }
   }

   public void method_10427(int var1) throws InterruptedException {
      if (this.field_11274.compareAndSet(false, true)) {
         ArrayList var5;
         synchronized (this.field_11267) {
            var5 = new ArrayList<class_4809>(this.field_11267);
         }

         for (class_4809 var6 : var5) {
            var6.method_22154(1001);
         }

         this.field_11261.method_3433();
         synchronized (this) {
            if (this.field_11269 != null && this.field_11273 != null) {
               this.field_11273.wakeup();
               this.field_11269.join((long)var1);
            }
         }
      }
   }

   public void method_10426() throws IOException, InterruptedException {
      this.method_10427(0);
   }

   @Override
   public Collection<class_4809> method_33573() {
      return Collections.<class_4809>unmodifiableCollection(new ArrayList(this.field_11267));
   }

   public InetSocketAddress method_10443() {
      return this.field_11263;
   }

   public int method_10421() {
      int var3 = this.method_10443().getPort();
      if (var3 == 0 && this.field_11265 != null) {
         var3 = this.field_11265.socket().getLocalPort();
      }

      return var3;
   }

   public List<class_7212> method_10429() {
      return Collections.<class_7212>unmodifiableList(this.field_11271);
   }

   @Override
   public void run() {
      if (this.method_10436()) {
         if (this.method_10442()) {
            try {
               int var3 = 5;
               byte var4 = 0;

               while (!this.field_11269.isInterrupted() && var3 != 0) {
                  SelectionKey var5 = null;
                  Object var6 = null;

                  try {
                     if (this.field_11274.get()) {
                        var4 = 5;
                     }

                     int var7 = this.field_11273.select((long)var4);
                     if (var7 == 0 && this.field_11274.get()) {
                        var3--;
                     }

                     Set var8 = this.field_11273.selectedKeys();
                     Iterator var9 = var8.iterator();

                     while (var9.hasNext()) {
                        var5 = (SelectionKey)var9.next();
                        var6 = null;
                        if (var5.isValid()) {
                           if (var5.isAcceptable()) {
                              this.method_10434(var5, var9);
                           } else if ((!var5.isReadable() || this.method_10425(var5, var9)) && var5.isWritable()) {
                              this.method_10423(var5);
                           }
                        }
                     }

                     this.method_10418();
                  } catch (CancelledKeyException var17) {
                  } catch (ClosedByInterruptException var18) {
                     return;
                  } catch (IOException var19) {
                     if (var5 != null) {
                        var5.cancel();
                     }

                     this.method_10419(var5, (class_4809)var6, var19);
                  } catch (InterruptedException var20) {
                     Thread.currentThread().interrupt();
                  }
               }
            } catch (RuntimeException var21) {
               this.method_10411(null, var21);
            } finally {
               this.method_10406();
            }
         }
      }
   }

   private void method_10418() throws InterruptedException, IOException {
      while (!this.field_11268.isEmpty()) {
         class_5913 var3 = this.field_11268.remove(0);
         class_3775 var4 = (class_3775)var3.method_27037();
         ByteBuffer var5 = this.method_10446();

         try {
            if (class_3877.method_17935(var5, var3, var4)) {
               this.field_11268.add(var3);
            }

            if (var5.hasRemaining()) {
               var3.field_30013.put(var5);
               this.method_10420(var3);
            } else {
               this.method_10408(var5);
            }
         } catch (IOException var7) {
            this.method_10408(var5);
            throw var7;
         }
      }
   }

   private void method_10434(SelectionKey var1, Iterator<SelectionKey> var2) throws IOException, InterruptedException {
      if (!this.method_10439(var1)) {
         var1.cancel();
      } else {
         SocketChannel var5 = this.field_11265.accept();
         if (var5 != null) {
            var5.configureBlocking(false);
            Socket var6 = var5.socket();
            var6.setTcpNoDelay(this.method_33569());
            var6.setKeepAlive(true);
            class_5913 var7 = this.field_11261.method_3434(this, this.field_11271);
            var7.method_27046(var5.register(this.field_11273, 1, var7));

            try {
               var7.method_27033(this.field_11261.method_3436(var5, var7.method_27026()));
               var2.remove();
               this.method_10441(var7);
            } catch (IOException var9) {
               if (var7.method_27026() != null) {
                  var7.method_27026().cancel();
               }

               this.method_10419(var7.method_27026(), null, var9);
            }
         }
      }
   }

   private boolean method_10425(SelectionKey var1, Iterator<SelectionKey> var2) throws InterruptedException, IOException {
      class_5913 var5 = (class_5913)var1.attachment();
      ByteBuffer var6 = this.method_10446();
      if (var5.method_27037() == null) {
         var1.cancel();
         this.method_10419(var1, var5, new IOException());
         return false;
      } else {
         try {
            if (class_3877.method_17934(var6, var5, var5.method_27037())) {
               if (var6.hasRemaining()) {
                  var5.field_30013.put(var6);
                  this.method_10420(var5);
                  var2.remove();
                  if (var5.method_27037() instanceof class_3775 && ((class_3775)var5.method_27037()).method_17472()) {
                     this.field_11268.add(var5);
                  }
               } else {
                  this.method_10408(var6);
               }
            } else {
               this.method_10408(var6);
            }

            return true;
         } catch (IOException var8) {
            this.method_10408(var6);
            throw var8;
         }
      }
   }

   private void method_10423(SelectionKey var1) throws IOException {
      class_5913 var4 = (class_5913)var1.attachment();
      if (class_3877.method_17936(var4, var4.method_27037()) && var1.isValid()) {
         var1.interestOps(1);
      }
   }

   private boolean method_10442() {
      this.field_11269.setName("WebSocketSelector-" + this.field_11269.getId());

      try {
         this.field_11265 = ServerSocketChannel.open();
         this.field_11265.configureBlocking(false);
         ServerSocket var3 = this.field_11265.socket();
         var3.setReceiveBufferSize(16384);
         var3.setReuseAddress(this.method_33563());
         var3.bind(this.field_11263);
         this.field_11273 = Selector.open();
         this.field_11265.register(this.field_11273, this.field_11265.validOps());
         this.method_33566();

         for (class_2788 var5 : this.field_11266) {
            var5.start();
         }

         this.method_10435();
         return true;
      } catch (IOException var6) {
         this.method_10411(null, var6);
         return false;
      }
   }

   private boolean method_10436() {
      synchronized (this) {
         if (this.field_11269 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
         } else {
            this.field_11269 = Thread.currentThread();
            return !this.field_11274.get();
         }
      }
   }

   private void method_10406() {
      this.method_33561();
      if (this.field_11266 != null) {
         for (class_2788 var4 : this.field_11266) {
            var4.interrupt();
         }
      }

      if (this.field_11273 != null) {
         try {
            this.field_11273.close();
         } catch (IOException var6) {
            System.err.println("IOException during selector.close");
            this.method_10440(null, var6);
         }
      }

      if (this.field_11265 != null) {
         try {
            this.field_11265.close();
         } catch (IOException var5) {
            System.err.println("IOException during server.close");
            this.method_10440(null, var5);
         }
      }
   }

   public void method_10441(class_4809 var1) throws InterruptedException {
      if (this.field_11272.get() < 2 * this.field_11266.size() + 1) {
         this.field_11272.incrementAndGet();
         this.field_11264.put(this.method_10447());
      }
   }

   public void method_10410(class_4809 var1) throws InterruptedException {
   }

   public ByteBuffer method_10447() {
      return ByteBuffer.allocate(16384);
   }

   public void method_10420(class_5913 var1) throws InterruptedException {
      if (var1.method_27047() == null) {
         var1.method_27023(this.field_11266.get(this.field_11262 % this.field_11266.size()));
         this.field_11262++;
      }

      var1.method_27047().method_12671(var1);
   }

   private ByteBuffer method_10446() throws InterruptedException {
      return this.field_11264.take();
   }

   private void method_10408(ByteBuffer var1) throws InterruptedException {
      if (this.field_11264.size() <= this.field_11272.intValue()) {
         this.field_11264.put(var1);
      }
   }

   private void method_10419(SelectionKey var1, class_4809 var2, IOException var3) {
      if (var2 != null) {
         var2.method_22173(1006, var3.getMessage());
      } else if (var1 != null) {
         SelectableChannel var6 = var1.channel();
         if (var6 != null && var6.isOpen()) {
            try {
               var6.close();
            } catch (IOException var8) {
            }
         }
      }
   }

   private void method_10411(class_4809 var1, Exception var2) {
      System.err.println("Shutdown due to fatal error");
      this.method_10440(var1, var2);
      if (this.field_11266 != null) {
         for (class_2788 var6 : this.field_11266) {
            var6.interrupt();
         }
      }

      if (this.field_11269 != null) {
         this.field_11269.interrupt();
      }

      try {
         this.method_10426();
      } catch (IOException var7) {
         System.err.println("Error during shutdown");
         this.method_10440(null, var7);
      } catch (InterruptedException var8) {
         Thread.currentThread().interrupt();
         System.err.println("Interrupt during stop");
         this.method_10440(null, var8);
      }
   }

   @Override
   public final void method_2693(class_4809 var1, String var2) {
      this.method_10432(var1, var2);
   }

   @Override
   public final void method_2694(class_4809 var1, ByteBuffer var2) {
      this.method_10433(var1, var2);
   }

   @Override
   public final void method_2682(class_4809 var1, class_6113 var2) {
      if (this.method_10407(var1)) {
         this.method_10428(var1, (class_9112)var2);
      }
   }

   @Override
   public final void method_2683(class_4809 var1, int var2, String var3, boolean var4) {
      this.field_11273.wakeup();

      try {
         if (this.method_10409(var1)) {
            this.method_10438(var1, var2, var3, var4);
         }
      } finally {
         try {
            this.method_10410(var1);
         } catch (InterruptedException var13) {
            Thread.currentThread().interrupt();
         }
      }
   }

   public boolean method_10409(class_4809 var1) {
      boolean var4 = false;
      synchronized (this.field_11267) {
         if (this.field_11267.contains(var1)) {
            var4 = this.field_11267.remove(var1);
         }
      }

      if (this.field_11274.get() && this.field_11267.isEmpty()) {
         this.field_11269.interrupt();
      }

      return var4;
   }

   public boolean method_10407(class_4809 var1) {
      if (!this.field_11274.get()) {
         synchronized (this.field_11267) {
            return this.field_11267.add(var1);
         }
      } else {
         var1.method_22154(1001);
         return true;
      }
   }

   @Override
   public final void method_2696(class_4809 var1, Exception var2) {
      this.method_10440(var1, var2);
   }

   @Override
   public final void method_2685(class_4809 var1) {
      class_5913 var4 = (class_5913)var1;

      try {
         var4.method_27026().interestOps(5);
      } catch (CancelledKeyException var6) {
         var4.field_30007.clear();
      }

      this.field_11273.wakeup();
   }

   @Override
   public void method_2686(class_4809 var1, int var2, String var3) {
      this.method_10405(var1, var2, var3);
   }

   @Override
   public void method_2688(class_4809 var1, int var2, String var3, boolean var4) {
      this.method_10424(var1, var2, var3, var4);
   }

   public void method_10405(class_4809 var1, int var2, String var3) {
   }

   public void method_10424(class_4809 var1, int var2, String var3, boolean var4) {
   }

   public final void method_10403(class_760 var1) {
      if (this.field_11261 != null) {
         this.field_11261.method_3433();
      }

      this.field_11261 = var1;
   }

   public final class_8615 method_10422() {
      return this.field_11261;
   }

   public boolean method_10439(SelectionKey var1) {
      return true;
   }

   private Socket method_10437(class_4809 var1) {
      class_5913 var4 = (class_5913)var1;
      return ((SocketChannel)var4.method_27026().channel()).socket();
   }

   @Override
   public InetSocketAddress method_2689(class_4809 var1) {
      return (InetSocketAddress)this.method_10437(var1).getLocalSocketAddress();
   }

   @Override
   public InetSocketAddress method_2695(class_4809 var1) {
      return (InetSocketAddress)this.method_10437(var1).getRemoteSocketAddress();
   }

   public abstract void method_10428(class_4809 var1, class_9112 var2);

   public abstract void method_10438(class_4809 var1, int var2, String var3, boolean var4);

   public abstract void method_10432(class_4809 var1, String var2);

   public abstract void method_10440(class_4809 var1, Exception var2);

   public abstract void method_10435();

   public void method_10433(class_4809 var1, ByteBuffer var2) {
   }

   public void method_10412(String var1) {
      this.method_10413(var1, this.field_11267);
   }

   public void method_10416(byte[] var1) {
      this.method_10417(var1, this.field_11267);
   }

   public void method_10414(ByteBuffer var1) {
      this.method_10415(var1, this.field_11267);
   }

   public void method_10417(byte[] var1, Collection<class_4809> var2) {
      if (var1 != null && var2 != null) {
         this.method_10415(ByteBuffer.wrap(var1), var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method_10415(ByteBuffer var1, Collection<class_4809> var2) {
      if (var1 != null && var2 != null) {
         this.method_10430(var1, var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method_10413(String var1, Collection<class_4809> var2) {
      if (var1 != null && var2 != null) {
         this.method_10430(var1, var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void method_10430(Object var1, Collection<class_4809> var2) {
      String var5 = null;
      if (var1 instanceof String) {
         var5 = (String)var1;
      }

      ByteBuffer var6 = null;
      if (var1 instanceof ByteBuffer) {
         var6 = (ByteBuffer)var1;
      }

      if (var5 != null || var6 != null) {
         HashMap var7 = new HashMap();

         for (class_4809 var9 : var2) {
            if (var9 != null) {
               class_7212 var10 = var9.method_22174();
               this.method_10431(var10, var7, var5, var6);

               try {
                  var9.method_22162((Collection<class_3106>)var7.get(var10));
               } catch (class_3701 var12) {
               }
            }
         }
      }
   }

   private void method_10431(class_7212 var1, Map<class_7212, List<class_3106>> var2, String var3, ByteBuffer var4) {
      if (!var2.containsKey(var1)) {
         List var7 = null;
         if (var3 != null) {
            var7 = var1.method_33029(var3, false);
         }

         if (var4 != null) {
            var7 = var1.method_33030(var4, false);
         }

         if (var7 != null) {
            var2.put(var1, var7);
         }
      }
   }
}
