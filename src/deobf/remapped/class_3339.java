package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class class_3339 {
   public static final String field_16481 = "publicsuffixes.gz";
   private static final byte[] field_16478 = new byte[]{42};
   private static final String[] field_16474 = new String[0];
   private static final String[] field_16475 = new String[]{"*"};
   private static final byte field_16476 = 33;
   private static final class_3339 field_16479 = new class_3339();
   private final AtomicBoolean field_16472 = new AtomicBoolean(false);
   private final CountDownLatch field_16471 = new CountDownLatch(1);
   private byte[] field_16473;
   private byte[] field_16477;

   public static class_3339 method_15322() {
      return field_16479;
   }

   public String method_15319(String var1) {
      if (var1 == null) {
         throw new NullPointerException("domain == null");
      } else {
         String var4 = IDN.toUnicode(var1);
         String[] var5 = var4.split("\\.");
         String[] var6 = this.method_15323(var5);
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

   private String[] method_15323(String[] var1) {
      if (!this.field_16472.get() && this.field_16472.compareAndSet(false, true)) {
         this.method_15320();
      } else {
         try {
            this.field_16471.await();
         } catch (InterruptedException var10) {
         }
      }

      synchronized (this) {
         if (this.field_16473 == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
         }
      }

      byte[][] var4 = new byte[var1.length][];

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4[var5] = var1[var5].getBytes(class_8515.field_43592);
      }

      String var12 = null;

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = method_15321(this.field_16473, var4, var6);
         if (var7 != null) {
            var12 = var7;
            break;
         }
      }

      String var13 = null;
      if (var4.length > 1) {
         byte[][] var14 = (byte[][])var4.clone();

         for (int var8 = 0; var8 < var14.length - 1; var8++) {
            var14[var8] = field_16478;
            String var9 = method_15321(this.field_16473, var14, var8);
            if (var9 != null) {
               var13 = var9;
               break;
            }
         }
      }

      String var15 = null;
      if (var13 != null) {
         for (int var17 = 0; var17 < var4.length - 1; var17++) {
            String var19 = method_15321(this.field_16477, var4, var17);
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
         return field_16475;
      } else {
         String[] var18 = var12 != null ? var12.split("\\.") : field_16474;
         String[] var20 = var13 != null ? var13.split("\\.") : field_16474;
         return var18.length > var20.length ? var18 : var20;
      }
   }

   private static String method_15321(byte[] var0, byte[][] var1, int var2) {
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
                  var7 = new String(var0, var8, var10, class_8515.field_43592);
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

   private void method_15320() {
      byte[] var3 = null;
      byte[] var4 = null;
      InputStream var5 = class_3339.class.getClassLoader().getResourceAsStream("publicsuffixes.gz");
      if (var5 != null) {
         class_8067 var6 = class_1259.method_5671(new class_4408(class_1259.method_5666(var5)));

         try {
            int var7 = var6.method_36603();
            var3 = new byte[var7];
            var6.method_36576(var3);
            int var8 = var6.method_36603();
            var4 = new byte[var8];
            var6.method_36576(var4);
         } catch (IOException var15) {
            class_3307.method_15163().method_15167(5, "Failed to read public suffix list", var15);
            var3 = null;
            var4 = null;
         } finally {
            class_8515.method_39200(var6);
         }
      }

      synchronized (this) {
         this.field_16473 = var3;
         this.field_16477 = var4;
      }

      this.field_16471.countDown();
   }

   public void method_15318(byte[] var1, byte[] var2) {
      this.field_16473 = var1;
      this.field_16477 = var2;
      this.field_16472.set(true);
      this.field_16471.countDown();
   }
}
