package mapped;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Class340 extends Class341 implements Runnable {
   private static final int field1484 = Runtime.getRuntime().availableProcessors();
   private final Collection<Class345> field1485;
   private final InetSocketAddress field1486;
   private ServerSocketChannel field1487;
   private Selector field1488;
   private List<Class8844> field1489;
   private Thread field1490;
   private final AtomicBoolean field1491 = new AtomicBoolean(false);
   public List<Class359> field1492;
   private List<Class346> field1493;
   private BlockingQueue<ByteBuffer> field1494;
   private int field1495 = 0;
   private final AtomicInteger field1496 = new AtomicInteger(0);
   private Class6590 field1497 = new Class6592();

   public Class340() {
      this(new InetSocketAddress(80), field1484, null);
   }

   public Class340(InetSocketAddress var1) {
      this(var1, field1484, null);
   }

   public Class340(InetSocketAddress var1, int var2) {
      this(var1, var2, null);
   }

   public Class340(InetSocketAddress var1, List<Class8844> var2) {
      this(var1, field1484, var2);
   }

   public Class340(InetSocketAddress var1, int var2, List<Class8844> var3) {
      this(var1, var2, var3, new HashSet<Class345>());
   }

   public Class340(InetSocketAddress var1, int var2, List<Class8844> var3, Collection<Class345> var4) {
      if (var1 != null && var2 >= 1 && var4 != null) {
         if (var3 != null) {
            this.field1489 = var3;
         } else {
            this.field1489 = Collections.<Class8844>emptyList();
         }

         this.field1486 = var1;
         this.field1485 = var4;
         this.method1723(false);
         this.method1725(false);
         this.field1493 = new LinkedList<Class346>();
         this.field1492 = new ArrayList<Class359>(var2);
         this.field1494 = new LinkedBlockingQueue<ByteBuffer>();

         for (int var7 = 0; var7 < var2; var7++) {
            Class359 var8 = new Class359(this);
            this.field1492.add(var8);
         }
      } else {
         throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
      }
   }

   public void method1659() {
      if (this.field1490 == null) {
         new Thread(this).start();
      } else {
         throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
      }
   }

   public void method1660(int var1) throws InterruptedException {
      if (this.field1491.compareAndSet(false, true)) {
         List<Class345> var5;
         synchronized (this.field1485) {
            var5 = new ArrayList<>(this.field1485);
         }

         for (Class345 var6 : var5) {
            var6.method1772(1001);
         }

         this.field1497.method19994();
         synchronized (this) {
            if (this.field1490 != null && this.field1488 != null) {
               this.field1488.wakeup();
               this.field1490.join((long)var1);
            }
         }
      }
   }

   public void method1661() throws IOException, InterruptedException {
      this.method1660(0);
   }

   @Override
   public Collection<Class345> method1662() {
      return Collections.<Class345>unmodifiableCollection(new ArrayList(this.field1485));
   }

   public InetSocketAddress method1663() {
      return this.field1486;
   }

   public int method1664() {
      int var3 = this.method1663().getPort();
      if (var3 == 0 && this.field1487 != null) {
         var3 = this.field1487.socket().getLocalPort();
      }

      return var3;
   }

   public List<Class8844> method1665() {
      return Collections.<Class8844>unmodifiableList(this.field1489);
   }

   @Override
   public void run() {
      if (this.method1671()) {
         if (this.method1670()) {
            try {
               int var3 = 5;
               long var4 = 0;

               while (!this.field1490.isInterrupted() && var3 != 0) {
                  SelectionKey var5 = null;
                  Object var6 = null;

                  try {
                     if (this.field1491.get()) {
                        var4 = 5;
                     }

                     int var7 = this.field1488.select((long)var4);
                     if (var7 == 0 && this.field1491.get()) {
                        var3--;
                     }

                     Set var8 = this.field1488.selectedKeys();
                     Iterator var9 = var8.iterator();

                     while (var9.hasNext()) {
                        var5 = (SelectionKey)var9.next();
                        var6 = null;
                        if (var5.isValid()) {
                           if (var5.isAcceptable()) {
                              this.method1667(var5, var9);
                           } else if ((!var5.isReadable() || this.method1668(var5, var9)) && var5.isWritable()) {
                              this.method1669(var5);
                           }
                        }
                     }

                     this.method1666();
                  } catch (CancelledKeyException var17) {
                  } catch (ClosedByInterruptException var18) {
                     return;
                  } catch (IOException var19) {
                     if (var5 != null) {
                        var5.cancel();
                     }

                     this.method1679(var5, (Class345)var6, var19);
                  } catch (InterruptedException var20) {
                     Thread.currentThread().interrupt();
                  }
               }
            } catch (RuntimeException var21) {
               this.method1680(null, var21);
            } finally {
               this.method1672();
            }
         }
      }
   }

   private void method1666() throws InterruptedException, IOException {
      while (!this.field1493.isEmpty()) {
         Class346 var3 = this.field1493.remove(0);
         Class1788 var4 = (Class1788)var3.method1810();
         ByteBuffer var5 = this.method1677();

         try {
            if (Class8207.method28509(var5, var3, var4)) {
               this.field1493.add(var3);
            }

            if (var5.hasRemaining()) {
               var3.field1522.put(var5);
               this.method1676(var3);
            } else {
               this.method1678(var5);
            }
         } catch (IOException var7) {
            this.method1678(var5);
            throw var7;
         }
      }
   }

   private void method1667(SelectionKey var1, Iterator<SelectionKey> var2) throws IOException, InterruptedException {
      if (!this.method1695(var1)) {
         var1.cancel();
      } else {
         SocketChannel var5 = this.field1487.accept();
         if (var5 != null) {
            var5.configureBlocking(false);
            Socket var6 = var5.socket();
            var6.setTcpNoDelay(this.method1722());
            var6.setKeepAlive(true);
            Class346 var7 = this.field1497.method19992(this, this.field1489);
            var7.method1805(var5.register(this.field1488, 1, var7));

            try {
               var7.method1811(this.field1497.method19993(var5, var7.method1806()));
               var2.remove();
               this.method1673(var7);
            } catch (IOException var9) {
               if (var7.method1806() != null) {
                  var7.method1806().cancel();
               }

               this.method1679(var7.method1806(), null, var9);
            }
         }
      }
   }

   private boolean method1668(SelectionKey var1, Iterator<SelectionKey> var2) throws InterruptedException, IOException {
      Class346 var5 = (Class346)var1.attachment();
      ByteBuffer var6 = this.method1677();
      if (var5.method1810() == null) {
         var1.cancel();
         this.method1679(var1, var5, new IOException());
         return false;
      } else {
         try {
            if (Class8207.method28508(var6, var5, var5.method1810())) {
               if (var6.hasRemaining()) {
                  var5.field1522.put(var6);
                  this.method1676(var5);
                  var2.remove();
                  if (var5.method1810() instanceof Class1788 && ((Class1788)var5.method1810()).method7795()) {
                     this.field1493.add(var5);
                  }
               } else {
                  this.method1678(var6);
               }
            } else {
               this.method1678(var6);
            }

            return true;
         } catch (IOException var8) {
            this.method1678(var6);
            throw var8;
         }
      }
   }

   private void method1669(SelectionKey var1) throws IOException {
      Class346 var4 = (Class346)var1.attachment();
      if (Class8207.method28510(var4, var4.method1810()) && var1.isValid()) {
         var1.interestOps(1);
      }
   }

   private boolean method1670() {
      this.field1490.setName("WebSocketSelector-" + this.field1490.getId());

      try {
         this.field1487 = ServerSocketChannel.open();
         this.field1487.configureBlocking(false);
         ServerSocket var3 = this.field1487.socket();
         var3.setReceiveBufferSize(16384);
         var3.setReuseAddress(this.method1724());
         var3.bind(this.field1486);
         this.field1488 = Selector.open();
         this.field1487.register(this.field1488, this.field1487.validOps());
         this.method1718();

         for (Class359 var5 : this.field1492) {
            var5.start();
         }

         this.method1703();
         return true;
      } catch (IOException var6) {
         this.method1680(null, var6);
         return false;
      }
   }

   private boolean method1671() {
      synchronized (this) {
         if (this.field1490 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
         } else {
            this.field1490 = Thread.currentThread();
            return !this.field1491.get();
         }
      }
   }

   private void method1672() {
      this.method1717();
      if (this.field1492 != null) {
         for (Class359 var4 : this.field1492) {
            var4.interrupt();
         }
      }

      if (this.field1488 != null) {
         try {
            this.field1488.close();
         } catch (IOException var6) {
            System.err.println("IOException during selector.close");
            this.method1702(null, var6);
         }
      }

      if (this.field1487 != null) {
         try {
            this.field1487.close();
         } catch (IOException var5) {
            System.err.println("IOException during server.close");
            this.method1702(null, var5);
         }
      }
   }

   public void method1673(Class345 var1) throws InterruptedException {
      if (this.field1496.get() < 2 * this.field1492.size() + 1) {
         this.field1496.incrementAndGet();
         this.field1494.put(this.method1675());
      }
   }

   public void method1674(Class345 var1) throws InterruptedException {
   }

   public ByteBuffer method1675() {
      return ByteBuffer.allocate(16384);
   }

   public void method1676(Class346 var1) throws InterruptedException {
      if (var1.method1812() == null) {
         var1.method1813(this.field1492.get(this.field1495 % this.field1492.size()));
         this.field1495++;
      }

      var1.method1812().method1823(var1);
   }

   private ByteBuffer method1677() throws InterruptedException {
      return this.field1494.take();
   }

   private void method1678(ByteBuffer var1) throws InterruptedException {
      if (this.field1494.size() <= this.field1496.intValue()) {
         this.field1494.put(var1);
      }
   }

   private void method1679(SelectionKey var1, Class345 var2, IOException var3) {
      if (var2 != null) {
         var2.method1774(1006, var3.getMessage());
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

   private void method1680(Class345 var1, Exception var2) {
      System.err.println("Shutdown due to fatal error");
      this.method1702(var1, var2);
      if (this.field1492 != null) {
         for (Class359 var6 : this.field1492) {
            var6.interrupt();
         }
      }

      if (this.field1490 != null) {
         this.field1490.interrupt();
      }

      try {
         this.method1661();
      } catch (IOException var7) {
         System.err.println("Error during shutdown");
         this.method1702(null, var7);
      } catch (InterruptedException var8) {
         Thread.currentThread().interrupt();
         System.err.println("Interrupt during stop");
         this.method1702(null, var8);
      }
   }

   @Override
   public final void method1681(Class345 var1, String var2) {
      this.method1701(var1, var2);
   }

   @Override
   public final void method1682(Class345 var1, ByteBuffer var2) {
      this.method1704(var1, var2);
   }

   @Override
   public final void method1683(Class345 var1, Class7295 var2) {
      if (this.method1686(var1)) {
         this.method1699(var1, (Class7294)var2);
      }
   }

   @Override
   public final void method1684(Class345 var1, int var2, String var3, boolean var4) {
      this.field1488.wakeup();

      try {
         if (this.method1685(var1)) {
            this.method1700(var1, var2, var3, var4);
         }
      } finally {
         try {
            this.method1674(var1);
         } catch (InterruptedException var13) {
            Thread.currentThread().interrupt();
         }
      }
   }

   public boolean method1685(Class345 var1) {
      boolean var4 = false;
      synchronized (this.field1485) {
         if (this.field1485.contains(var1)) {
            var4 = this.field1485.remove(var1);
         }
      }

      if (this.field1491.get() && this.field1485.isEmpty()) {
         this.field1490.interrupt();
      }

      return var4;
   }

   public boolean method1686(Class345 var1) {
      if (!this.field1491.get()) {
         synchronized (this.field1485) {
            return this.field1485.add(var1);
         }
      } else {
         var1.method1772(1001);
         return true;
      }
   }

   @Override
   public final void method1687(Class345 var1, Exception var2) {
      this.method1702(var1, var2);
   }

   @Override
   public final void method1688(Class345 var1) {
      Class346 var4 = (Class346)var1;

      try {
         var4.method1806().interestOps(5);
      } catch (CancelledKeyException var6) {
         var4.field1521.clear();
      }

      this.field1488.wakeup();
   }

   @Override
   public void method1689(Class345 var1, int var2, String var3) {
      this.method1691(var1, var2, var3);
   }

   @Override
   public void method1690(Class345 var1, int var2, String var3, boolean var4) {
      this.method1692(var1, var2, var3, var4);
   }

   public void method1691(Class345 var1, int var2, String var3) {
   }

   public void method1692(Class345 var1, int var2, String var3, boolean var4) {
   }

   public final void method1693(Class6590 var1) {
      if (this.field1497 != null) {
         this.field1497.method19994();
      }

      this.field1497 = var1;
   }

   public final Class6591 method1694() {
      return this.field1497;
   }

   public boolean method1695(SelectionKey var1) {
      return true;
   }

   private Socket method1696(Class345 var1) {
      Class346 var4 = (Class346)var1;
      return ((SocketChannel)var4.method1806().channel()).socket();
   }

   @Override
   public InetSocketAddress method1697(Class345 var1) {
      return (InetSocketAddress)this.method1696(var1).getLocalSocketAddress();
   }

   @Override
   public InetSocketAddress method1698(Class345 var1) {
      return (InetSocketAddress)this.method1696(var1).getRemoteSocketAddress();
   }

   public abstract void method1699(Class345 var1, Class7294 var2);

   public abstract void method1700(Class345 var1, int var2, String var3, boolean var4);

   public abstract void method1701(Class345 var1, String var2);

   public abstract void method1702(Class345 var1, Exception var2);

   public abstract void method1703();

   public void method1704(Class345 var1, ByteBuffer var2) {
   }

   public void method1705(String var1) {
      this.method1710(var1, this.field1485);
   }

   public void method1706(byte[] var1) {
      this.method1708(var1, this.field1485);
   }

   public void method1707(ByteBuffer var1) {
      this.method1709(var1, this.field1485);
   }

   public void method1708(byte[] var1, Collection<Class345> var2) {
      if (var1 != null && var2 != null) {
         this.method1709(ByteBuffer.wrap(var1), var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1709(ByteBuffer var1, Collection<Class345> var2) {
      if (var1 != null && var2 != null) {
         this.method1711(var1, var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1710(String var1, Collection<Class345> var2) {
      if (var1 != null && var2 != null) {
         this.method1711(var1, var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void method1711(Object var1, Collection<Class345> var2) {
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

         for (Class345 var9 : var2) {
            if (var9 != null) {
               Class8844 var10 = var9.method1734();
               this.method1712(var10, var7, var5, var6);

               try {
                  var9.method1777((Collection<Class6454>)var7.get(var10));
               } catch (Class2498 var12) {
               }
            }
         }
      }
   }

   private void method1712(Class8844 var1, Map<Class8844, List<Class6454>> var2, String var3, ByteBuffer var4) {
      if (!var2.containsKey(var1)) {
         List var7 = null;
         if (var3 != null) {
            var7 = var1.method32053(var3, false);
         }

         if (var4 != null) {
            var7 = var1.method32052(var4, false);
         }

         if (var7 != null) {
            var2.put(var1, var7);
         }
      }
   }

   // $VF: synthetic method
   public static void method1713(Class340 var0, Class345 var1, Exception var2) {
      var0.method1680(var1, var2);
   }

   // $VF: synthetic method
   public static void method1714(Class340 var0, ByteBuffer var1) throws InterruptedException {
      var0.method1678(var1);
   }
}
