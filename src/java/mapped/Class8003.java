package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class8003 {
   public static final String field34406 = "publicsuffixes.gz";
   private static final byte[] field34407 = new byte[]{42};
   private static final String[] field34408 = new String[0];
   private static final String[] field34409 = new String[]{"*"};
   private static final byte field34410 = 33;
   private static final Class8003 field34411 = new Class8003();
   private final AtomicBoolean field34412 = new AtomicBoolean(false);
   private final CountDownLatch field34413 = new CountDownLatch(1);
   private byte[] field34414;
   private byte[] field34415;

   public static Class8003 method27342() {
      return field34411;
   }

   public String method27343(String var1) {
      if (var1 == null) {
         throw new NullPointerException("domain == null");
      } else {
         String var4 = IDN.toUnicode(var1);
         String[] var5 = var4.split("\\.");
         String[] var6 = this.method27344(var5);
         if (var5.length == var6.length && var6[0].charAt(0) != '!') {
            return null;
         } else {
            int var7;
            if (var6[0].charAt(0) != '!') {
               var7 = var5.length - (var6.length + 1);
            } else {
               var7 = var5.length - var6.length;
            }

            StringBuilder var8 = new StringBuilder();
            String[] var9 = var1.split("\\.");

            for (int var10 = var7; var10 < var9.length; var10++) {
               var8.append(var9[var10]).append('.');
            }

            var8.deleteCharAt(var8.length() - 1);
            return var8.toString();
         }
      }
   }

   private String[] method27344(String[] var1) {
      if (!this.field34412.get() && this.field34412.compareAndSet(false, true)) {
         this.method27346();
      } else {
         try {
            this.field34413.await();
         } catch (InterruptedException var10) {
         }
      }

      synchronized (this) {
         if (this.field34414 == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
         }
      }

      byte[][] var4 = new byte[var1.length][];

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4[var5] = var1[var5].getBytes(Class9474.field44024);
      }

      String var12 = null;

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = method27345(this.field34414, var4, var6);
         if (var7 != null) {
            var12 = var7;
            break;
         }
      }

      String var13 = null;
      if (var4.length > 1) {
         byte[][] var14 = (byte[][])var4.clone();

         for (int var8 = 0; var8 < var14.length - 1; var8++) {
            var14[var8] = field34407;
            String var9 = method27345(this.field34414, var14, var8);
            if (var9 != null) {
               var13 = var9;
               break;
            }
         }
      }

      String var15 = null;
      if (var13 != null) {
         for (int var17 = 0; var17 < var4.length - 1; var17++) {
            String var19 = method27345(this.field34415, var4, var17);
            if (var19 != null) {
               var15 = var19;
               break;
            }
         }
      }

      if (var15 != null) {
         var15 = "!" + var15;
         return var15.split("\\.");
      } else if (var12 == null && var13 == null) {
         return field34409;
      } else {
         String[] var18 = var12 != null ? var12.split("\\.") : field34408;
         String[] var20 = var13 != null ? var13.split("\\.") : field34408;
         return var18.length > var20.length ? var18 : var20;
      }
   }

   private static String method27345(byte[] var0, byte[][] var1, int var2) {
      int var5 = 0;
      int var6 = var0.length;
      String var7 = null;

      while (var5 < var6) {
         int var8 = (var5 + var6) / 2;

         while (var8 > -1 && var0[var8] != 10) {
            var8--;
         }

         var8++;
         int var9 = 1;

         while (var0[var8 + var9] != 10) {
            var9++;
         }

         int var10 = var8 + var9 - var8;
         int var11 = var2;
         int var12 = 0;
         int var13 = 0;
         boolean var14 = false;

         int var17;
         while (true) {
            int var15;
            if (!var14) {
               var15 = var1[var11][var12] & 255;
            } else {
               var15 = 46;
               var14 = false;
            }

            int var16 = var0[var8 + var13] & 255;
            var17 = var15 - var16;
            if (var17 != 0) {
               break;
            }

            var13++;
            var12++;
            if (var13 == var10) {
               break;
            }

            if (var1[var11].length == var12) {
               if (var11 == var1.length - 1) {
                  break;
               }

               var11++;
               var12 = -1;
               var14 = true;
            }
         }

         if (var17 < 0) {
            var6 = var8 - 1;
         } else if (var17 > 0) {
            var5 = var8 + var9 + 1;
         } else {
            int var20 = var10 - var13;
            int var21 = var1[var11].length - var12;

            for (int var18 = var11 + 1; var18 < var1.length; var18++) {
               var21 += var1[var18].length;
            }

            if (var21 >= var20) {
               if (var21 <= var20) {
                  var7 = new String(var0, var8, var10, Class9474.field44024);
                  break;
               }

               var5 = var8 + var9 + 1;
            } else {
               var6 = var8 - 1;
            }
         }
      }

      return var7;
   }

   private void method27346() {
      byte[] var3 = null;
      byte[] var4 = null;
      InputStream var5 = Class8003.class.getClassLoader().getResourceAsStream("publicsuffixes.gz");
      if (var5 != null) {
         Class1735 var6 = Class7001.method21696(new Class1739(Class7001.method21701(var5)));

         try {
            int var7 = var6.method7599();
            var3 = new byte[var7];
            var6.method7624(var3);
            int var8 = var6.method7599();
            var4 = new byte[var8];
            var6.method7624(var4);
         } catch (IOException var15) {
            Class7596.method24879().method24873(5, "Failed to read public suffix list", var15);
            var3 = null;
            var4 = null;
         } finally {
            Class9474.method36535(var6);
         }
      }

      synchronized (this) {
         this.field34414 = var3;
         this.field34415 = var4;
      }

      this.field34413.countDown();
   }

   public void method27347(byte[] var1, byte[] var2) {
      this.field34414 = var1;
      this.field34415 = var2;
      this.field34412.set(true);
      this.field34413.countDown();
   }
}
