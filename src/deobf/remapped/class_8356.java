package remapped;

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

public class class_8356 {
   private String field_42798 = null;
   private int field_42794 = 0;
   private Proxy field_42784 = Proxy.NO_PROXY;
   private List<class_9144> field_42783 = new LinkedList<class_9144>();
   private List<class_9144> field_42791 = new LinkedList<class_9144>();
   private Socket field_42797 = null;
   private InputStream field_42778 = null;
   private OutputStream field_42792 = null;
   private class_9380 field_42780 = null;
   private class_3220 field_42787 = null;
   private int field_42795 = 0;
   private boolean field_42790 = false;
   private long field_42793 = 5000L;
   private int field_42786 = 1000;
   private long field_42781 = System.currentTimeMillis();
   private boolean field_42796 = false;
   private static final String field_42782 = "\n";
   public static final int field_42789 = 5000;
   public static final int field_42788 = 5000;
   private static final Pattern field_42785 = Pattern.compile("^[a-zA-Z]+://.*");

   public class_8356(String var1, int var2) {
      this(var1, var2, Proxy.NO_PROXY);
   }

   public class_8356(String var1, int var2, Proxy var3) {
      this.field_42798 = var1;
      this.field_42794 = var2;
      this.field_42784 = var3;
      this.field_42780 = new class_9380(this);
      this.field_42780.start();
      this.field_42787 = new class_3220(this);
      this.field_42787.start();
   }

   public synchronized boolean method_38480(class_9144 var1) {
      if (!this.method_38468()) {
         this.method_38481(var1, this.field_42783);
         this.method_38481(var1, this.field_42791);
         this.field_42795++;
         return true;
      } else {
         return false;
      }
   }

   private void method_38481(class_9144 var1, List<class_9144> var2) {
      var2.add(var1);
      this.notifyAll();
   }

   public synchronized void method_38489(Socket var1) throws IOException {
      if (!this.field_42796) {
         if (this.field_42797 != null) {
            throw new IllegalArgumentException("Already connected");
         }

         this.field_42797 = var1;
         this.field_42797.setTcpNoDelay(true);
         this.field_42778 = this.field_42797.getInputStream();
         this.field_42792 = new BufferedOutputStream(this.field_42797.getOutputStream());
         this.method_38492();
         this.notifyAll();
      }
   }

   public synchronized OutputStream method_38478() throws IOException, InterruptedException {
      while (this.field_42792 == null) {
         this.method_38486();
         this.wait(1000L);
      }

      return this.field_42792;
   }

   public synchronized InputStream method_38487() throws IOException, InterruptedException {
      while (this.field_42778 == null) {
         this.method_38486();
         this.wait(1000L);
      }

      return this.field_42778;
   }

   public synchronized class_9144 method_38493() throws InterruptedException, IOException {
      if (this.field_42791.size() <= 0 && this.field_42792 != null) {
         this.field_42792.flush();
      }

      return this.method_38475(this.field_42791, true);
   }

   public synchronized class_9144 method_38470() throws InterruptedException {
      return this.method_38475(this.field_42783, false);
   }

   private class_9144 method_38475(List<class_9144> var1, boolean var2) throws InterruptedException {
      while (var1.size() <= 0) {
         this.method_38486();
         this.wait(1000L);
      }

      this.method_38492();
      return !var2 ? (class_9144)var1.get(0) : (class_9144)var1.remove(0);
   }

   private void method_38486() {
      if (this.field_42797 != null) {
         long var3 = this.field_42793;
         if (this.field_42783.size() > 0) {
            var3 = 5000L;
         }

         long var5 = System.currentTimeMillis();
         if (var5 > this.field_42781 + var3) {
            this.method_38484(new InterruptedException("Timeout " + var3));
         }
      }
   }

   private void method_38492() {
      this.field_42781 = System.currentTimeMillis();
   }

   public synchronized void method_38473(class_9144 var1) {
      if (!this.field_42796) {
         this.method_38492();
      }
   }

   public synchronized void method_38471(class_9144 var1, class_3548 var2) {
      if (!this.field_42796) {
         this.field_42790 = true;
         this.method_38492();
         if (this.field_42783.size() <= 0 || this.field_42783.get(0) != var1) {
            throw new IllegalArgumentException("Response out of order: " + var1);
         }

         this.field_42783.remove(0);
         var1.method_42079(true);
         String var5 = var2.method_16509("Location");
         if (var2.method_16508() / 100 == 3 && var5 != null && var1.method_42078().method_9016() < 5) {
            try {
               var5 = this.method_38477(var5, var1.method_42078());
               class_1951 var10 = class_2316.method_10646(var5, var1.method_42078().method_9018());
               var10.method_9015(var1.method_42078().method_9016() + 1);
               class_9144 var7 = new class_9144(var10, var1.method_42080());
               class_2316.method_10641(var7);
            } catch (IOException var8) {
               var1.method_42080().method_7112(var1.method_42078(), var8);
            }
         } else {
            class_1576 var6 = var1.method_42080();
            var6.method_7111(var1.method_42078(), var2);
         }

         this.method_38482(var2);
      }
   }

   private String method_38477(String var1, class_1951 var2) {
      if (!field_42785.matcher(var1).matches()) {
         if (!var1.startsWith("//")) {
            String var5 = var2.method_9020();
            if (var2.method_9019() != 80) {
               var5 = var5 + ":" + var2.method_9019();
            }

            if (!var1.startsWith("/")) {
               String var6 = var2.method_9011();
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

   private void method_38482(class_3548 var1) {
      String var4 = var1.method_16509("Connection");
      if (var4 != null && !var4.toLowerCase().equals("keep-alive")) {
         this.method_38484(new EOFException("Connection not keep-alive"));
      }

      String var5 = var1.method_16509("Keep-Alive");
      if (var5 != null) {
         String[] var6 = class_3111.method_14302(var5, ",;");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            String[] var9 = this.method_38476(var8, '=');
            if (var9.length >= 2) {
               if (var9[0].equals("timeout")) {
                  int var10 = class_3111.method_14361(var9[1], -1);
                  if (var10 > 0) {
                     this.field_42793 = (long)(var10 * 1000);
                  }
               }

               if (var9[0].equals("max")) {
                  int var11 = class_3111.method_14361(var9[1], -1);
                  if (var11 > 0) {
                     this.field_42786 = var11;
                  }
               }
            }
         }
      }
   }

   private String[] method_38476(String var1, char var2) {
      int var5 = var1.indexOf(var2);
      if (var5 >= 0) {
         String var6 = var1.substring(0, var5);
         String var7 = var1.substring(var5 + 1);
         return new String[]{var6, var7};
      } else {
         return new String[]{var1};
      }
   }

   public synchronized void method_38485(class_9144 var1, Exception var2) {
      this.method_38484(var2);
   }

   public synchronized void method_38491(class_9144 var1, Exception var2) {
      this.method_38484(var2);
   }

   private synchronized void method_38484(Exception var1) {
      if (!this.field_42796) {
         this.field_42796 = true;
         this.method_38479(var1);
         if (this.field_42780 != null) {
            this.field_42780.interrupt();
         }

         if (this.field_42787 != null) {
            this.field_42787.interrupt();
         }

         try {
            if (this.field_42797 != null) {
               this.field_42797.close();
            }
         } catch (IOException var5) {
         }

         this.field_42797 = null;
         this.field_42778 = null;
         this.field_42792 = null;
      }
   }

   private void method_38479(Exception var1) {
      if (this.field_42783.size() > 0) {
         if (!this.field_42790) {
            class_9144 var4 = this.field_42783.remove(0);
            var4.method_42080().method_7112(var4.method_42078(), var1);
            var4.method_42079(true);
         }

         while (this.field_42783.size() > 0) {
            class_9144 var5 = this.field_42783.remove(0);
            class_2316.method_10641(var5);
         }
      }
   }

   public synchronized boolean method_38468() {
      return !this.field_42796 ? this.field_42795 >= this.field_42786 : true;
   }

   public int method_38472() {
      return this.field_42795;
   }

   public synchronized boolean method_38488() {
      return this.field_42783.size() > 0;
   }

   public String method_38469() {
      return this.field_42798;
   }

   public int method_38474() {
      return this.field_42794;
   }

   public Proxy method_38490() {
      return this.field_42784;
   }
}
