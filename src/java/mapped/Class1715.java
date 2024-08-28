package mapped;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

public final class Class1715 implements Closeable, Flushable {
   private static final int field9363 = 201105;
   private static final int field9364 = 0;
   private static final int field9365 = 1;
   private static final int field9366 = 2;
   public final Class8530 field9367 = new Class8531(this);
   public final Class1756 field9368;
   public int field9369;
   public int field9370;
   private int field9371;
   private int field9372;
   private int field9373;

   public Class1715(File var1, long var2) {
      this(var1, var2, Class8745.field39423);
   }

   public Class1715(File var1, long var2, Class8745 var4) {
      this.field9368 = Class1756.method7676(var4, var1, 201105, 2, var2);
   }

   public static String method7518(Class7284 var0) {
      return Class2003.method8433(var0.toString()).method8438().method8449();
   }

   @Nullable
   public Class1797 method7519(Class8223 var1) {
      String var4 = method7518(var1.method28612());

      Class1792 var5;
      try {
         var5 = this.field9368.method7682(var4);
         if (var5 == null) {
            return null;
         }
      } catch (IOException var9) {
         return null;
      }

      Class9161 var7;
      try {
         var7 = new Class9161(var5.method7830(0));
      } catch (IOException var8) {
         Class9474.method36535(var5);
         return null;
      }

      Class1797 var6 = var7.method34206(var5);
      if (!var7.method34205(var1, var6)) {
         Class9474.method36535(var6.method7855());
         return null;
      } else {
         return var6;
      }
   }

   @Nullable
   public Class6441 method7520(Class1797 var1) {
      String var4 = var1.method7844().method28613();
      if (Class8059.method27666(var1.method7844().method28613())) {
         try {
            this.method7521(var1.method7844());
         } catch (IOException var8) {
         }

         return null;
      } else if (!var4.equals("GET")) {
         return null;
      } else if (Class8394.method29445(var1)) {
         return null;
      } else {
         Class9161 var5 = new Class9161(var1);
         Class7163 var6 = null;

         try {
            var6 = this.field9368.method7683(method7518(var1.method7844().method28612()));
            if (var6 == null) {
               return null;
            } else {
               var5.method34201(var6);
               return new Class6440(this, var6);
            }
         } catch (IOException var9) {
            this.method7523(var6);
            return null;
         }
      }
   }

   public void method7521(Class8223 var1) throws IOException {
      this.field9368.method7691(method7518(var1.method28612()));
   }

   public void method7522(Class1797 var1, Class1797 var2) {
      Class9161 var5 = new Class9161(var2);
      Class1792 var6 = ((Class1795)var1.method7855()).field9676;
      Class7163 var7 = null;

      try {
         var7 = var6.method7829();
         if (var7 != null) {
            var5.method34201(var7);
            var7.method22498();
         }
      } catch (IOException var9) {
         this.method7523(var7);
      }
   }

   private void method7523(Class7163 var1) {
      try {
         if (var1 != null) {
            var1.method22499();
         }
      } catch (IOException var5) {
      }
   }

   public void method7524() throws IOException {
      this.field9368.method7675();
   }

   public void method7525() throws IOException {
      this.field9368.method7696();
   }

   public void method7526() throws IOException {
      this.field9368.method7697();
   }

   public Iterator<String> method7527() throws IOException {
      return new Class4537(this);
   }

   public synchronized int method7528() {
      return this.field9370;
   }

   public synchronized int method7529() {
      return this.field9369;
   }

   public long method7530() throws IOException {
      return this.field9368.method7688();
   }

   public long method7531() {
      return this.field9368.method7686();
   }

   @Override
   public void flush() throws IOException {
      this.field9368.flush();
   }

   @Override
   public void close() throws IOException {
      this.field9368.close();
   }

   public File method7532() {
      return this.field9368.method7685();
   }

   public boolean method7533() {
      return this.field9368.method7693();
   }

   public synchronized void method7534(Class9660 var1) {
      this.field9373++;
      if (var1.field45146 == null) {
         if (var1.field45147 != null) {
            this.field9372++;
         }
      } else {
         this.field9371++;
      }
   }

   public synchronized void method7535() {
      this.field9372++;
   }

   public synchronized int method7536() {
      return this.field9371;
   }

   public synchronized int method7537() {
      return this.field9372;
   }

   public synchronized int method7538() {
      return this.field9373;
   }

   public static int method7539(Class1735 var0) throws IOException {
      try {
         long var3 = var0.method7604();
         String var5 = var0.method7617();
         if (var3 >= 0L && var3 <= 2147483647L && var5.isEmpty()) {
            return (int)var3;
         } else {
            throw new IOException("expected an int but was \"" + var3 + var5 + "\"");
         }
      } catch (NumberFormatException var7) {
         throw new IOException(var7.getMessage());
      }
   }
}
