package mapped;

import java.io.IOException;
import java.util.Random;

public final class Class7034 {
   public final boolean field30347;
   public final Random field30348;
   public final Class1733 field30349;
   public boolean field30350;
   public final Class1734 field30351 = new Class1734();
   public final Class1721 field30352 = new Class1721(this);
   public boolean field30353;
   public final byte[] field30354;
   public final byte[] field30355;
   public static final boolean field30356 = !Class7034.class.desiredAssertionStatus();

   public Class7034(boolean var1, Class1733 var2, Random var3) {
      if (var2 != null) {
         if (var3 != null) {
            this.field30347 = var1;
            this.field30349 = var2;
            this.field30348 = var3;
            this.field30354 = !var1 ? null : new byte[4];
            this.field30355 = !var1 ? null : new byte[8192];
         } else {
            throw new NullPointerException("random == null");
         }
      } else {
         throw new NullPointerException("sink == null");
      }
   }

   public void method21829(Class2003 var1) throws IOException {
      synchronized (this) {
         this.method21832(9, var1);
      }
   }

   public void method21830(Class2003 var1) throws IOException {
      synchronized (this) {
         this.method21832(10, var1);
      }
   }

   public void method21831(int var1, Class2003 var2) throws IOException {
      Class2003 var5 = Class2003.field13051;
      if (var1 != 0 || var2 != null) {
         if (var1 != 0) {
            Class9677.method37753(var1);
         }

         Class1734 var6 = new Class1734();
         var6.method7571(var1);
         if (var2 != null) {
            var6.method7562(var2);
         }

         var5 = var6.method7606();
      }

      synchronized (this) {
         try {
            this.method21832(8, var5);
         } finally {
            this.field30350 = true;
         }
      }
   }

   private void method21832(int var1, Class2003 var2) throws IOException {
      if (!field30356 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else if (!this.field30350) {
         int var5 = var2.method8458();
         if ((long)var5 <= 125L) {
            int var6 = 128 | var1;
            this.field30349.method7570(var6);
            if (!this.field30347) {
               this.field30349.method7570(var5);
               this.field30349.method7560(var2);
            } else {
               int var7 = var5 | 128;
               this.field30349.method7570(var7);
               this.field30348.nextBytes(this.field30354);
               this.field30349.method7561(this.field30354);
               byte[] var8 = var2.method8459();
               Class9677.method37751(var8, (long)var8.length, this.field30354, 0L);
               this.field30349.method7561(var8);
            }

            this.field30349.flush();
         } else {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
         }
      } else {
         throw new IOException("closed");
      }
   }

   public Class1716 method21833(int var1, long var2) {
      if (!this.field30353) {
         this.field30353 = true;
         this.field30352.field9386 = var1;
         this.field30352.field9387 = var2;
         this.field30352.field9388 = true;
         this.field30352.field9389 = false;
         return this.field30352;
      } else {
         throw new IllegalStateException("Another message writer is active. Did you call close()?");
      }
   }

   public void method21834(int var1, long var2, boolean var4, boolean var5) throws IOException {
      if (!field30356 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else if (!this.field30350) {
         int var8 = !var4 ? 0 : var1;
         if (var5) {
            var8 |= 128;
         }

         this.field30349.method7570(var8);
         int var9 = 0;
         if (this.field30347) {
            var9 |= 128;
         }

         if (var2 > 125L) {
            if (var2 > 65535L) {
               var9 |= 127;
               this.field30349.method7570(var9);
               this.field30349.method7575(var2);
            } else {
               var9 |= 126;
               this.field30349.method7570(var9);
               this.field30349.method7571((int)var2);
            }
         } else {
            var9 |= (int)var2;
            this.field30349.method7570(var9);
         }

         if (!this.field30347) {
            this.field30349.method7540(this.field30351, var2);
         } else {
            this.field30348.nextBytes(this.field30354);
            this.field30349.method7561(this.field30354);
            long var10 = 0L;

            while (var10 < var2) {
               int var12 = (int)Math.min(var2, (long)this.field30355.length);
               int var13 = this.field30351.method7625(this.field30355, 0, var12);
               if (var13 == -1) {
                  throw new AssertionError();
               }

               Class9677.method37751(this.field30355, (long)var13, this.field30354, var10);
               this.field30349.method7562(this.field30355, 0, var13);
               var10 += (long)var13;
            }
         }

         this.field30349.method7579();
      } else {
         throw new IOException("closed");
      }
   }
}
