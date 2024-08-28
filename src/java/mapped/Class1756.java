package mapped;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class Class1756 implements Closeable, Flushable {
   public static final String field9496 = "journal";
   public static final String field9497 = "journal.tmp";
   public static final String field9498 = "journal.bkp";
   public static final String field9499 = "libcore.io.DiskLruCache";
   public static final String field9500 = "1";
   public static final long field9501 = -1L;
   public static final Pattern field9502 = Pattern.compile("[a-z0-9_-]{1,120}");
   private static final String field9503 = "CLEAN";
   private static final String field9504 = "DIRTY";
   private static final String field9505 = "REMOVE";
   private static final String field9506 = "READ";
   public final Class8745 field9507;
   public final File field9508;
   private final File field9509;
   private final File field9510;
   private final File field9511;
   private final int field9512;
   private long field9513;
   public final int field9514;
   private long field9515 = 0L;
   public Class1733 field9516;
   public final LinkedHashMap<String, Class8316> field9517 = new LinkedHashMap<String, Class8316>(0, 0.75F, true);
   public int field9518;
   public boolean field9519;
   public boolean field9520;
   public boolean field9521;
   public boolean field9522;
   public boolean field9523;
   private long field9524 = 0L;
   private final Executor field9525;
   private final Runnable field9526 = new Class494(this);
   public static final boolean field9527 = !Class1756.class.desiredAssertionStatus();

   public Class1756(Class8745 var1, File var2, int var3, int var4, long var5, Executor var7) {
      this.field9507 = var1;
      this.field9508 = var2;
      this.field9512 = var3;
      this.field9509 = new File(var2, "journal");
      this.field9510 = new File(var2, "journal.tmp");
      this.field9511 = new File(var2, "journal.bkp");
      this.field9514 = var4;
      this.field9513 = var5;
      this.field9525 = var7;
   }

   public synchronized void method7675() throws IOException {
      if (!field9527 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else if (!this.field9520) {
         if (this.field9507.method31551(this.field9511)) {
            if (this.field9507.method31551(this.field9509)) {
               this.field9507.method31550(this.field9511);
            } else {
               this.field9507.method31553(this.field9511, this.field9509);
            }
         }

         if (this.field9507.method31551(this.field9509)) {
            try {
               this.method7677();
               this.method7680();
               this.field9520 = true;
               return;
            } catch (IOException var8) {
               Class7596.method24879().method24873(5, "DiskLruCache " + this.field9508 + " is corrupt: " + var8.getMessage() + ", removing", var8);

               try {
                  this.method7696();
               } finally {
                  this.field9521 = false;
               }
            }
         }

         this.method7681();
         this.field9520 = true;
      }
   }

   public static Class1756 method7676(Class8745 var0, File var1, int var2, int var3, long var4) {
      if (var4 > 0L) {
         if (var3 > 0) {
            ThreadPoolExecutor var8 = new ThreadPoolExecutor(
               0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Class9474.method36542("OkHttp DiskLruCache", true)
            );
            return new Class1756(var0, var1, var2, var3, var4, var8);
         } else {
            throw new IllegalArgumentException("valueCount <= 0");
         }
      } else {
         throw new IllegalArgumentException("maxSize <= 0");
      }
   }

   private void method7677() throws IOException {
      Class1735 var3 = Class7001.method21696(this.field9507.method31547(this.field9509));

      try {
         String var4 = var3.method7617();
         String var5 = var3.method7617();
         String var6 = var3.method7617();
         String var7 = var3.method7617();
         String var8 = var3.method7617();
         if (!"libcore.io.DiskLruCache".equals(var4)
            || !"1".equals(var5)
            || !Integer.toString(this.field9512).equals(var6)
            || !Integer.toString(this.field9514).equals(var7)
            || !"".equals(var8)) {
            throw new IOException("unexpected journal header: [" + var4 + ", " + var5 + ", " + var7 + ", " + var8 + "]");
         }

         int var9 = 0;

         while (true) {
            try {
               this.method7679(var3.method7617());
               var9++;
            } catch (EOFException var14) {
               this.field9518 = var9 - this.field9517.size();
               if (!var3.method7583()) {
                  this.method7681();
               } else {
                  this.field9516 = this.method7678();
               }
               break;
            }
         }
      } finally {
         Class9474.method36535(var3);
      }
   }

   private Class1733 method7678() throws FileNotFoundException {
      Class1716 var3 = this.field9507.method31549(this.field9509);
      Class1728 var4 = new Class1728(this, var3);
      return Class7001.method21697(var4);
   }

   private void method7679(String var1) throws IOException {
      int var4 = var1.indexOf(32);
      if (var4 != -1) {
         int var5 = var4 + 1;
         int var6 = var1.indexOf(32, var5);
         String var7;
         if (var6 != -1) {
            var7 = var1.substring(var5, var6);
         } else {
            var7 = var1.substring(var5);
            if (var4 == "REMOVE".length() && var1.startsWith("REMOVE")) {
               this.field9517.remove(var7);
               return;
            }
         }

         Class8316 var8 = this.field9517.get(var7);
         if (var8 == null) {
            var8 = new Class8316(this, var7);
            this.field9517.put(var7, var8);
         }

         if (var6 != -1 && var4 == "CLEAN".length() && var1.startsWith("CLEAN")) {
            String[] var9 = var1.substring(var6 + 1).split(" ");
            var8.field35725 = true;
            var8.field35726 = null;
            var8.method29096(var9);
         } else if (var6 == -1 && var4 == "DIRTY".length() && var1.startsWith("DIRTY")) {
            var8.field35726 = new Class7163(this, var8);
         } else if (var6 != -1 || var4 != "READ".length() || !var1.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + var1);
         }
      } else {
         throw new IOException("unexpected journal line: " + var1);
      }
   }

   private void method7680() throws IOException {
      this.field9507.method31550(this.field9510);
      Iterator var3 = this.field9517.values().iterator();

      while (var3.hasNext()) {
         Class8316 var4 = (Class8316)var3.next();
         if (var4.field35726 != null) {
            var4.field35726 = null;

            for (int var6 = 0; var6 < this.field9514; var6++) {
               this.field9507.method31550(var4.field35723[var6]);
               this.field9507.method31550(var4.field35724[var6]);
            }

            var3.remove();
         } else {
            for (int var5 = 0; var5 < this.field9514; var5++) {
               this.field9515 = this.field9515 + var4.field35722[var5];
            }
         }
      }
   }

   public synchronized void method7681() throws IOException {
      if (this.field9516 != null) {
         this.field9516.close();
      }

      Class1733 var3 = Class7001.method21697(this.field9507.method31548(this.field9510));

      try {
         var3.method7565("libcore.io.DiskLruCache").method7570(10);
         var3.method7565("1").method7570(10);
         var3.method7577((long)this.field9512).method7570(10);
         var3.method7577((long)this.field9514).method7570(10);
         var3.method7570(10);

         for (Class8316 var5 : this.field9517.values()) {
            if (var5.field35726 != null) {
               var3.method7565("DIRTY").method7570(32);
               var3.method7565(var5.field35721);
               var3.method7570(10);
            } else {
               var3.method7565("CLEAN").method7570(32);
               var3.method7565(var5.field35721);
               var5.method29097(var3);
               var3.method7570(10);
            }
         }
      } finally {
         var3.close();
      }

      if (this.field9507.method31551(this.field9509)) {
         this.field9507.method31553(this.field9509, this.field9511);
      }

      this.field9507.method31553(this.field9510, this.field9509);
      this.field9507.method31550(this.field9511);
      this.field9516 = this.method7678();
      this.field9519 = false;
      this.field9523 = false;
   }

   public synchronized Class1792 method7682(String var1) throws IOException {
      this.method7675();
      this.method7694();
      this.method7698(var1);
      Class8316 var4 = this.field9517.get(var1);
      if (var4 != null && var4.field35725) {
         Class1792 var5 = var4.method29099();
         if (var5 != null) {
            this.field9518++;
            this.field9516.method7565("READ").method7570(32).method7565(var1).method7570(10);
            if (this.method7690()) {
               this.field9525.execute(this.field9526);
            }

            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Nullable
   public Class7163 method7683(String var1) throws IOException {
      return this.method7684(var1, -1L);
   }

   public synchronized Class7163 method7684(String var1, long var2) throws IOException {
      this.method7675();
      this.method7694();
      this.method7698(var1);
      Class8316 var6 = this.field9517.get(var1);
      if (var2 == -1L || var6 != null && var6.field35727 == var2) {
         if (var6 != null && var6.field35726 != null) {
            return null;
         } else if (!this.field9522 && !this.field9523) {
            this.field9516.method7565("DIRTY").method7570(32).method7565(var1).method7570(10);
            this.field9516.flush();
            if (!this.field9519) {
               if (var6 == null) {
                  var6 = new Class8316(this, var1);
                  this.field9517.put(var1, var6);
               }

               Class7163 var7 = new Class7163(this, var6);
               var6.field35726 = var7;
               return var7;
            } else {
               return null;
            }
         } else {
            this.field9525.execute(this.field9526);
            return null;
         }
      } else {
         return null;
      }
   }

   public File method7685() {
      return this.field9508;
   }

   public synchronized long method7686() {
      return this.field9513;
   }

   public synchronized void method7687(long var1) {
      this.field9513 = var1;
      if (this.field9520) {
         this.field9525.execute(this.field9526);
      }
   }

   public synchronized long method7688() throws IOException {
      this.method7675();
      return this.field9515;
   }

   public synchronized void method7689(Class7163 var1, boolean var2) throws IOException {
      Class8316 var5 = var1.field30811;
      if (var5.field35726 != var1) {
         throw new IllegalStateException();
      } else {
         if (var2 && !var5.field35725) {
            for (int var6 = 0; var6 < this.field9514; var6++) {
               if (!var1.field30812[var6]) {
                  var1.method22499();
                  throw new IllegalStateException("Newly created entry didn't create value for index " + var6);
               }

               if (!this.field9507.method31551(var5.field35724[var6])) {
                  var1.method22499();
                  return;
               }
            }
         }

         for (int var13 = 0; var13 < this.field9514; var13++) {
            File var7 = var5.field35724[var13];
            if (!var2) {
               this.field9507.method31550(var7);
            } else if (this.field9507.method31551(var7)) {
               File var8 = var5.field35723[var13];
               this.field9507.method31553(var7, var8);
               long var9 = var5.field35722[var13];
               long var11 = this.field9507.method31552(var8);
               var5.field35722[var13] = var11;
               this.field9515 = this.field9515 - var9 + var11;
            }
         }

         this.field9518++;
         var5.field35726 = null;
         if (!(var5.field35725 | var2)) {
            this.field9517.remove(var5.field35721);
            this.field9516.method7565("REMOVE").method7570(32);
            this.field9516.method7565(var5.field35721);
            this.field9516.method7570(10);
         } else {
            var5.field35725 = true;
            this.field9516.method7565("CLEAN").method7570(32);
            this.field9516.method7565(var5.field35721);
            var5.method29097(this.field9516);
            this.field9516.method7570(10);
            if (var2) {
               var5.field35727 = this.field9524++;
            }
         }

         this.field9516.flush();
         if (this.field9515 > this.field9513 || this.method7690()) {
            this.field9525.execute(this.field9526);
         }
      }
   }

   public boolean method7690() {
      short var3 = 2000;
      return this.field9518 >= 2000 && this.field9518 >= this.field9517.size();
   }

   public synchronized boolean method7691(String var1) throws IOException {
      this.method7675();
      this.method7694();
      this.method7698(var1);
      Class8316 var4 = this.field9517.get(var1);
      if (var4 != null) {
         boolean var5 = this.method7692(var4);
         if (var5 && this.field9515 <= this.field9513) {
            this.field9522 = false;
         }

         return var5;
      } else {
         return false;
      }
   }

   public boolean method7692(Class8316 var1) throws IOException {
      if (var1.field35726 != null) {
         var1.field35726.method22495();
      }

      for (int var4 = 0; var4 < this.field9514; var4++) {
         this.field9507.method31550(var1.field35723[var4]);
         this.field9515 = this.field9515 - var1.field35722[var4];
         var1.field35722[var4] = 0L;
      }

      this.field9518++;
      this.field9516.method7565("REMOVE").method7570(32).method7565(var1.field35721).method7570(10);
      this.field9517.remove(var1.field35721);
      if (this.method7690()) {
         this.field9525.execute(this.field9526);
      }

      return true;
   }

   public synchronized boolean method7693() {
      return this.field9521;
   }

   private synchronized void method7694() {
      if (this.method7693()) {
         throw new IllegalStateException("cache is closed");
      }
   }

   @Override
   public synchronized void flush() throws IOException {
      if (this.field9520) {
         this.method7694();
         this.method7695();
         this.field9516.flush();
      }
   }

   @Override
   public synchronized void close() throws IOException {
      if (this.field9520 && !this.field9521) {
         for (Class8316 var6 : this.field9517.values().<Class8316>toArray(new Class8316[this.field9517.size()])) {
            if (var6.field35726 != null) {
               var6.field35726.method22499();
            }
         }

         this.method7695();
         this.field9516.close();
         this.field9516 = null;
         this.field9521 = true;
      } else {
         this.field9521 = true;
      }
   }

   public void method7695() throws IOException {
      while (this.field9515 > this.field9513) {
         Class8316 var3 = this.field9517.values().iterator().next();
         this.method7692(var3);
      }

      this.field9522 = false;
   }

   public void method7696() throws IOException {
      this.close();
      this.field9507.method31554(this.field9508);
   }

   public synchronized void method7697() throws IOException {
      this.method7675();

      for (Class8316 var6 : this.field9517.values().<Class8316>toArray(new Class8316[this.field9517.size()])) {
         this.method7692(var6);
      }

      this.field9522 = false;
   }

   private void method7698(String var1) {
      Matcher var4 = field9502.matcher(var1);
      if (!var4.matches()) {
         throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + var1 + "\"");
      }
   }

   public synchronized Iterator<Class1792> method7699() throws IOException {
      this.method7675();
      return new Class4538(this);
   }
}
