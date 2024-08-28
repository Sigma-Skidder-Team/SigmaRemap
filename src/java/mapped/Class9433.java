package mapped;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Class9433 {
   private String field43755 = null;
   private int field43756 = 0;
   private Proxy field43757 = Proxy.NO_PROXY;
   private List<Class9638> field43758 = new LinkedList<Class9638>();
   private List<Class9638> field43759 = new LinkedList<Class9638>();
   private Socket field43760 = null;
   private InputStream field43761 = null;
   private OutputStream field43762 = null;
   private Class379 field43763 = null;
   private Class360 field43764 = null;
   private int field43765 = 0;
   private boolean field43766 = false;
   private long field43767 = 5000L;
   private int field43768 = 1000;
   private long field43769 = System.currentTimeMillis();
   private boolean field43770 = false;
   private static final String field43771 = "\n";
   public static final int field43772 = 5000;
   public static final int field43773 = 5000;
   private static final Pattern field43774 = Pattern.compile("^[a-zA-Z]+://.*");

   public Class9433(String var1, int var2) {
      this(var1, var2, Proxy.NO_PROXY);
   }

   public Class9433(String var1, int var2, Proxy var3) {
      this.field43755 = var1;
      this.field43756 = var2;
      this.field43757 = var3;
      this.field43763 = new Class379(this);
      this.field43763.start();
      this.field43764 = new Class360(this);
      this.field43764.start();
   }

   public synchronized boolean method36208(Class9638 var1) {
      if (!this.method36227()) {
         this.method36209(var1, this.field43758);
         this.method36209(var1, this.field43759);
         this.field43765++;
         return true;
      } else {
         return false;
      }
   }

   private void method36209(Class9638 var1, List<Class9638> var2) {
      var2.add(var1);
      this.notifyAll();
   }

   public synchronized void method36210(Socket var1) throws IOException {
      if (!this.field43770) {
         if (this.field43760 != null) {
            throw new IllegalArgumentException("Already connected");
         }

         this.field43760 = var1;
         this.field43760.setTcpNoDelay(true);
         this.field43761 = this.field43760.getInputStream();
         this.field43762 = new BufferedOutputStream(this.field43760.getOutputStream());
         this.method36217();
         this.notifyAll();
      }
   }

   public synchronized OutputStream method36211() throws IOException, InterruptedException {
      while (this.field43762 == null) {
         this.method36216();
         this.wait(1000L);
      }

      return this.field43762;
   }

   public synchronized InputStream method36212() throws IOException, InterruptedException {
      while (this.field43761 == null) {
         this.method36216();
         this.wait(1000L);
      }

      return this.field43761;
   }

   public synchronized Class9638 method36213() throws InterruptedException, IOException {
      if (this.field43759.size() <= 0 && this.field43762 != null) {
         this.field43762.flush();
      }

      return this.method36215(this.field43759, true);
   }

   public synchronized Class9638 method36214() throws InterruptedException {
      return this.method36215(this.field43758, false);
   }

   private Class9638 method36215(List<Class9638> var1, boolean var2) throws InterruptedException {
      while (var1.size() <= 0) {
         this.method36216();
         this.wait(1000L);
      }

      this.method36217();
      return !var2 ? (Class9638)var1.get(0) : (Class9638)var1.remove(0);
   }

   private void method36216() {
      if (this.field43760 != null) {
         long var3 = this.field43767;
         if (this.field43758.size() > 0) {
            var3 = 5000L;
         }

         long var5 = System.currentTimeMillis();
         if (var5 > this.field43769 + var3) {
            this.method36225(new InterruptedException("Timeout " + var3));
         }
      }
   }

   private void method36217() {
      this.field43769 = System.currentTimeMillis();
   }

   public synchronized void method36218(Class9638 var1) {
      if (!this.field43770) {
         this.method36217();
      }
   }

   public synchronized void method36219(Class9638 var1, Class8075 var2) {
      if (!this.field43770) {
         this.field43766 = true;
         this.method36217();
         if (this.field43758.size() <= 0 || this.field43758.get(0) != var1) {
            throw new IllegalArgumentException("Response out of order: " + var1);
         }

         this.field43758.remove(0);
         var1.method37565(true);
         String var5 = var2.method27945("Location");
         if (var2.method27942() / 100 == 3 && var5 != null && var1.method37562().method24002() < 5) {
            try {
               var5 = this.method36220(var5, var1.method37562());
               Class7432 var10 = Class7615.method24943(var5, var1.method37562().method24004());
               var10.method24003(var1.method37562().method24002() + 1);
               Class9638 var7 = new Class9638(var10, var1.method37563());
               Class7615.method24944(var7);
            } catch (IOException var8) {
               var1.method37563().method22733(var1.method37562(), var8);
            }
         } else {
            Class7238 var6 = var1.method37563();
            var6.method22732(var1.method37562(), var2);
         }

         this.method36221(var2);
      }
   }

   private String method36220(String var1, Class7432 var2) {
      if (!field43774.matcher(var1).matches()) {
         if (!var1.startsWith("//")) {
            String var5 = var2.method23995();
            if (var2.method23996() != 80) {
               var5 = var5 + ":" + var2.method23996();
            }

            if (!var1.startsWith("/")) {
               String var6 = var2.method23998();
               int var7 = var6.lastIndexOf("/");
               return var7 < 0 ? "http://" + var5 + "/" + var1 : "http://" + var5 + var6.substring(0, var7 + 1) + var1;
            } else {
               return "http://" + var5 + var1;
            }
         } else {
            return "http:" + var1;
         }
      } else {
         return var1;
      }
   }

   private void method36221(Class8075 var1) {
      String var4 = var1.method27945("Connection");
      if (var4 != null && !var4.toLowerCase().equals("keep-alive")) {
         this.method36225(new EOFException("Connection not keep-alive"));
      }

      String var5 = var1.method27945("Keep-Alive");
      if (var5 != null) {
         String[] var6 = Class7944.method26903(var5, ",;");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            String[] var9 = this.method36222(var8, '=');
            if (var9.length >= 2) {
               if (var9[0].equals("timeout")) {
                  int var10 = Class7944.method26899(var9[1], -1);
                  if (var10 > 0) {
                     this.field43767 = (long)(var10 * 1000);
                  }
               }

               if (var9[0].equals("max")) {
                  int var11 = Class7944.method26899(var9[1], -1);
                  if (var11 > 0) {
                     this.field43768 = var11;
                  }
               }
            }
         }
      }
   }

   private String[] method36222(String var1, char var2) {
      int var5 = var1.indexOf(var2);
      if (var5 >= 0) {
         String var6 = var1.substring(0, var5);
         String var7 = var1.substring(var5 + 1);
         return new String[]{var6, var7};
      } else {
         return new String[]{var1};
      }
   }

   public synchronized void method36223(Class9638 var1, Exception var2) {
      this.method36225(var2);
   }

   public synchronized void method36224(Class9638 var1, Exception var2) {
      this.method36225(var2);
   }

   private synchronized void method36225(Exception var1) {
      if (!this.field43770) {
         this.field43770 = true;
         this.method36226(var1);
         if (this.field43763 != null) {
            this.field43763.interrupt();
         }

         if (this.field43764 != null) {
            this.field43764.interrupt();
         }

         try {
            if (this.field43760 != null) {
               this.field43760.close();
            }
         } catch (IOException var5) {
         }

         this.field43760 = null;
         this.field43761 = null;
         this.field43762 = null;
      }
   }

   private void method36226(Exception var1) {
      if (this.field43758.size() > 0) {
         if (!this.field43766) {
            Class9638 var4 = this.field43758.remove(0);
            var4.method37563().method22733(var4.method37562(), var1);
            var4.method37565(true);
         }

         while (this.field43758.size() > 0) {
            Class9638 var5 = this.field43758.remove(0);
            Class7615.method24944(var5);
         }
      }
   }

   public synchronized boolean method36227() {
      return !this.field43770 ? this.field43765 >= this.field43768 : true;
   }

   public int method36228() {
      return this.field43765;
   }

   public synchronized boolean method36229() {
      return this.field43758.size() > 0;
   }

   public String method36230() {
      return this.field43755;
   }

   public int method36231() {
      return this.field43756;
   }

   public Proxy method36232() {
      return this.field43757;
   }
}
