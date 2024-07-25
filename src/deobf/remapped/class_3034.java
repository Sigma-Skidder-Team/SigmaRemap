package remapped;

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

public final class class_3034 implements Closeable, Flushable {
   public static final String field_14883 = "journal";
   public static final String field_14871 = "journal.tmp";
   public static final String field_14870 = "journal.bkp";
   public static final String field_14889 = "libcore.io.DiskLruCache";
   public static final String field_14876 = "1";
   public static final long field_14882 = -1L;
   public static final Pattern field_14894 = Pattern.compile("[a-z0-9_-]{1,120}");
   private static final String field_14890 = "CLEAN";
   private static final String field_14897 = "DIRTY";
   private static final String field_14896 = "REMOVE";
   private static final String field_14874 = "READ";
   public final class_6112 field_14891;
   public final File field_14869;
   private final File field_14872;
   private final File field_14893;
   private final File field_14886;
   private final int field_14880;
   private long field_14895;
   public final int field_14884;
   private long field_14887 = 0L;
   public class_3947 field_14881;
   public final LinkedHashMap<String, class_4203> field_14868 = new LinkedHashMap<String, class_4203>(0, 0.75F, true);
   public int field_14878;
   public boolean field_14877;
   public boolean field_14879;
   public boolean field_14875;
   public boolean field_14892;
   public boolean field_14867;
   private long field_14888 = 0L;
   private final Executor field_14873;
   private final Runnable field_14865 = new class_506(this);

   public class_3034(class_6112 var1, File var2, int var3, int var4, long var5, Executor var7) {
      this.field_14891 = var1;
      this.field_14869 = var2;
      this.field_14880 = var3;
      this.field_14872 = new File(var2, "journal");
      this.field_14893 = new File(var2, "journal.tmp");
      this.field_14886 = new File(var2, "journal.bkp");
      this.field_14884 = var4;
      this.field_14895 = var5;
      this.field_14873 = var7;
   }

   public synchronized void method_13850() throws IOException {
      assert Thread.holdsLock(this);

      if (!this.field_14879) {
         if (this.field_14891.method_28075(this.field_14886)) {
            if (this.field_14891.method_28075(this.field_14872)) {
               this.field_14891.method_28078(this.field_14886);
            } else {
               this.field_14891.method_28080(this.field_14886, this.field_14872);
            }
         }

         if (this.field_14891.method_28075(this.field_14872)) {
            try {
               this.method_13864();
               this.method_13861();
               this.field_14879 = true;
               return;
            } catch (IOException var8) {
               class_3307.method_15163().method_15167(5, "DiskLruCache " + this.field_14869 + " is corrupt: " + var8.getMessage() + ", removing", var8);

               try {
                  this.method_13853();
               } finally {
                  this.field_14875 = false;
               }
            }
         }

         this.method_13849();
         this.field_14879 = true;
      }
   }

   public static class_3034 method_13851(class_6112 var0, File var1, int var2, int var3, long var4) {
      if (var4 > 0L) {
         if (var3 > 0) {
            ThreadPoolExecutor var8 = new ThreadPoolExecutor(
               0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), class_8515.method_39209("OkHttp DiskLruCache", true)
            );
            return new class_3034(var0, var1, var2, var3, var4, var8);
         } else {
            throw new IllegalArgumentException("valueCount <= 0");
         }
      } else {
         throw new IllegalArgumentException("maxSize <= 0");
      }
   }

   private void method_13864() throws IOException {
      class_8067 var3 = class_1259.method_5671(this.field_14891.method_28081(this.field_14872));

      try {
         String var4 = var3.method_36584();
         String var5 = var3.method_36584();
         String var6 = var3.method_36584();
         String var7 = var3.method_36584();
         String var8 = var3.method_36584();
         if (!"libcore.io.DiskLruCache".equals(var4)
            || !"1".equals(var5)
            || !Integer.toString(this.field_14880).equals(var6)
            || !Integer.toString(this.field_14884).equals(var7)
            || !"".equals(var8)) {
            throw new IOException("unexpected journal header: [" + var4 + ", " + var5 + ", " + var7 + ", " + var8 + "]");
         }

         int var9 = 0;

         while (true) {
            try {
               this.method_13852(var3.method_36584());
               var9++;
            } catch (EOFException var14) {
               this.field_14878 = var9 - this.field_14868.size();
               if (!var3.method_36605()) {
                  this.method_13849();
               } else {
                  this.field_14881 = this.method_13857();
               }
               break;
            }
         }
      } finally {
         class_8515.method_39200(var3);
      }
   }

   private class_3947 method_13857() throws FileNotFoundException {
      class_4131 var3 = this.field_14891.method_28077(this.field_14872);
      class_1905 var4 = new class_1905(this, var3);
      return class_1259.method_5670(var4);
   }

   private void method_13852(String var1) throws IOException {
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
               this.field_14868.remove(var7);
               return;
            }
         }

         class_4203 var8 = this.field_14868.get(var7);
         if (var8 == null) {
            var8 = new class_4203(this, var7);
            this.field_14868.put(var7, var8);
         }

         if (var6 != -1 && var4 == "CLEAN".length() && var1.startsWith("CLEAN")) {
            String[] var9 = var1.substring(var6 + 1).split(" ");
            var8.field_20438 = true;
            var8.field_20443 = null;
            var8.method_19567(var9);
         } else if (var6 == -1 && var4 == "DIRTY".length() && var1.startsWith("DIRTY")) {
            var8.field_20443 = new class_1469(this, var8);
         } else if (var6 != -1 || var4 != "READ".length() || !var1.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + var1);
         }
      } else {
         throw new IOException("unexpected journal line: " + var1);
      }
   }

   private void method_13861() throws IOException {
      this.field_14891.method_28078(this.field_14893);
      Iterator var3 = this.field_14868.values().iterator();

      while (var3.hasNext()) {
         class_4203 var4 = (class_4203)var3.next();
         if (var4.field_20443 != null) {
            var4.field_20443 = null;

            for (int var6 = 0; var6 < this.field_14884; var6++) {
               this.field_14891.method_28078(var4.field_20441[var6]);
               this.field_14891.method_28078(var4.field_20442[var6]);
            }

            var3.remove();
         } else {
            for (int var5 = 0; var5 < this.field_14884; var5++) {
               this.field_14887 = this.field_14887 + var4.field_20439[var5];
            }
         }
      }
   }

   public synchronized void method_13849() throws IOException {
      if (this.field_14881 != null) {
         this.field_14881.close();
      }

      class_3947 var3 = class_1259.method_5670(this.field_14891.method_28079(this.field_14893));

      try {
         var3.method_18250("libcore.io.DiskLruCache").method_18253(10);
         var3.method_18250("1").method_18253(10);
         var3.method_18238((long)this.field_14880).method_18253(10);
         var3.method_18238((long)this.field_14884).method_18253(10);
         var3.method_18253(10);

         for (class_4203 var5 : this.field_14868.values()) {
            if (var5.field_20443 != null) {
               var3.method_18250("DIRTY").method_18253(32);
               var3.method_18250(var5.field_20435);
               var3.method_18253(10);
            } else {
               var3.method_18250("CLEAN").method_18253(32);
               var3.method_18250(var5.field_20435);
               var5.method_19564(var3);
               var3.method_18253(10);
            }
         }
      } finally {
         var3.close();
      }

      if (this.field_14891.method_28075(this.field_14872)) {
         this.field_14891.method_28080(this.field_14872, this.field_14886);
      }

      this.field_14891.method_28080(this.field_14893, this.field_14872);
      this.field_14891.method_28078(this.field_14886);
      this.field_14881 = this.method_13857();
      this.field_14877 = false;
      this.field_14867 = false;
   }

   public synchronized class_8748 method_13839(String var1) throws IOException {
      this.method_13850();
      this.method_13856();
      this.method_13862(var1);
      class_4203 var4 = this.field_14868.get(var1);
      if (var4 != null && var4.field_20438) {
         class_8748 var5 = var4.method_19565();
         if (var5 != null) {
            this.field_14878++;
            this.field_14881.method_18250("READ").method_18253(32).method_18250(var1).method_18253(10);
            if (this.method_13863()) {
               this.field_14873.execute(this.field_14865);
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
   public class_1469 method_13844(String var1) throws IOException {
      return this.method_13845(var1, -1L);
   }

   public synchronized class_1469 method_13845(String var1, long var2) throws IOException {
      this.method_13850();
      this.method_13856();
      this.method_13862(var1);
      class_4203 var6 = this.field_14868.get(var1);
      if (var2 == -1L || var6 != null && var6.field_20440 == var2) {
         if (var6 != null && var6.field_20443 != null) {
            return null;
         } else if (!this.field_14892 && !this.field_14867) {
            this.field_14881.method_18250("DIRTY").method_18253(32).method_18250(var1).method_18253(10);
            this.field_14881.flush();
            if (!this.field_14877) {
               if (var6 == null) {
                  var6 = new class_4203(this, var1);
                  this.field_14868.put(var1, var6);
               }

               class_1469 var7 = new class_1469(this, var6);
               var6.field_20443 = var7;
               return var7;
            } else {
               return null;
            }
         } else {
            this.field_14873.execute(this.field_14865);
            return null;
         }
      } else {
         return null;
      }
   }

   public File method_13840() {
      return this.field_14869;
   }

   public synchronized long method_13843() {
      return this.field_14895;
   }

   public synchronized void method_13855(long var1) {
      this.field_14895 = var1;
      if (this.field_14879) {
         this.field_14873.execute(this.field_14865);
      }
   }

   public synchronized long method_13854() throws IOException {
      this.method_13850();
      return this.field_14887;
   }

   public synchronized void method_13859(class_1469 var1, boolean var2) throws IOException {
      class_4203 var5 = var1.field_7888;
      if (var5.field_20443 != var1) {
         throw new IllegalStateException();
      } else {
         if (var2 && !var5.field_20438) {
            for (int var6 = 0; var6 < this.field_14884; var6++) {
               if (!var1.field_7889[var6]) {
                  var1.method_6783();
                  throw new IllegalStateException("Newly created entry didn't create value for index " + var6);
               }

               if (!this.field_14891.method_28075(var5.field_20442[var6])) {
                  var1.method_6783();
                  return;
               }
            }
         }

         for (int var13 = 0; var13 < this.field_14884; var13++) {
            File var7 = var5.field_20442[var13];
            if (!var2) {
               this.field_14891.method_28078(var7);
            } else if (this.field_14891.method_28075(var7)) {
               File var8 = var5.field_20441[var13];
               this.field_14891.method_28080(var7, var8);
               long var9 = var5.field_20439[var13];
               long var11 = this.field_14891.method_28076(var8);
               var5.field_20439[var13] = var11;
               this.field_14887 = this.field_14887 - var9 + var11;
            }
         }

         this.field_14878++;
         var5.field_20443 = null;
         if (!(var5.field_20438 | var2)) {
            this.field_14868.remove(var5.field_20435);
            this.field_14881.method_18250("REMOVE").method_18253(32);
            this.field_14881.method_18250(var5.field_20435);
            this.field_14881.method_18253(10);
         } else {
            var5.field_20438 = true;
            this.field_14881.method_18250("CLEAN").method_18253(32);
            this.field_14881.method_18250(var5.field_20435);
            var5.method_19564(this.field_14881);
            this.field_14881.method_18253(10);
            if (var2) {
               var5.field_20440 = this.field_14888++;
            }
         }

         this.field_14881.flush();
         if (this.field_14887 > this.field_14895 || this.method_13863()) {
            this.field_14873.execute(this.field_14865);
         }
      }
   }

   public boolean method_13863() {
      short var3 = 2000;
      return this.field_14878 >= 2000 && this.field_14878 >= this.field_14868.size();
   }

   public synchronized boolean method_13860(String var1) throws IOException {
      this.method_13850();
      this.method_13856();
      this.method_13862(var1);
      class_4203 var4 = this.field_14868.get(var1);
      if (var4 != null) {
         boolean var5 = this.method_13848(var4);
         if (var5 && this.field_14887 <= this.field_14895) {
            this.field_14892 = false;
         }

         return var5;
      } else {
         return false;
      }
   }

   public boolean method_13848(class_4203 var1) throws IOException {
      if (var1.field_20443 != null) {
         var1.field_20443.method_6787();
      }

      for (int var4 = 0; var4 < this.field_14884; var4++) {
         this.field_14891.method_28078(var1.field_20441[var4]);
         this.field_14887 = this.field_14887 - var1.field_20439[var4];
         var1.field_20439[var4] = 0L;
      }

      this.field_14878++;
      this.field_14881.method_18250("REMOVE").method_18253(32).method_18250(var1.field_20435).method_18253(10);
      this.field_14868.remove(var1.field_20435);
      if (this.method_13863()) {
         this.field_14873.execute(this.field_14865);
      }

      return true;
   }

   public synchronized boolean method_13842() {
      return this.field_14875;
   }

   private synchronized void method_13856() {
      if (this.method_13842()) {
         throw new IllegalStateException("cache is closed");
      }
   }

   @Override
   public synchronized void flush() throws IOException {
      if (this.field_14879) {
         this.method_13856();
         this.method_13841();
         this.field_14881.flush();
      }
   }

   @Override
   public synchronized void close() throws IOException {
      if (this.field_14879 && !this.field_14875) {
         for (class_4203 var6 : this.field_14868.values().<class_4203>toArray(new class_4203[this.field_14868.size()])) {
            if (var6.field_20443 != null) {
               var6.field_20443.method_6783();
            }
         }

         this.method_13841();
         this.field_14881.close();
         this.field_14881 = null;
         this.field_14875 = true;
      } else {
         this.field_14875 = true;
      }
   }

   public void method_13841() throws IOException {
      while (this.field_14887 > this.field_14895) {
         class_4203 var3 = this.field_14868.values().iterator().next();
         this.method_13848(var3);
      }

      this.field_14892 = false;
   }

   public void method_13853() throws IOException {
      this.close();
      this.field_14891.method_28074(this.field_14869);
   }

   public synchronized void method_13858() throws IOException {
      this.method_13850();

      for (class_4203 var6 : this.field_14868.values().<class_4203>toArray(new class_4203[this.field_14868.size()])) {
         this.method_13848(var6);
      }

      this.field_14892 = false;
   }

   private void method_13862(String var1) {
      Matcher var4 = field_14894.matcher(var1);
      if (!var4.matches()) {
         throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + var1 + "\"");
      }
   }

   public synchronized Iterator<class_8748> method_13846() throws IOException {
      this.method_13850();
      return new class_8291(this);
   }
}
