package mapped;

import java.util.concurrent.TimeUnit;

public final class Class8729 {
   public boolean field39368;
   public boolean field39369;
   public int field39370 = -1;
   public int field39371 = -1;
   public int field39372 = -1;
   public boolean field39373;
   public boolean field39374;
   public boolean field39375;

   public Class8729 method31499() {
      this.field39368 = true;
      return this;
   }

   public Class8729 method31500() {
      this.field39369 = true;
      return this;
   }

   public Class8729 method31501(int var1, TimeUnit var2) {
      if (var1 >= 0) {
         long var5 = var2.toSeconds((long)var1);
         this.field39370 = var5 <= 2147483647L ? (int)var5 : Integer.MAX_VALUE;
         return this;
      } else {
         throw new IllegalArgumentException("maxAge < 0: " + var1);
      }
   }

   public Class8729 method31502(int var1, TimeUnit var2) {
      if (var1 >= 0) {
         long var5 = var2.toSeconds((long)var1);
         this.field39371 = var5 <= 2147483647L ? (int)var5 : Integer.MAX_VALUE;
         return this;
      } else {
         throw new IllegalArgumentException("maxStale < 0: " + var1);
      }
   }

   public Class8729 method31503(int var1, TimeUnit var2) {
      if (var1 >= 0) {
         long var5 = var2.toSeconds((long)var1);
         this.field39372 = var5 <= 2147483647L ? (int)var5 : Integer.MAX_VALUE;
         return this;
      } else {
         throw new IllegalArgumentException("minFresh < 0: " + var1);
      }
   }

   public Class8729 method31504() {
      this.field39373 = true;
      return this;
   }

   public Class8729 method31505() {
      this.field39374 = true;
      return this;
   }

   public Class8729 method31506() {
      this.field39375 = true;
      return this;
   }

   public Class7319 method31507() {
      return new Class7319(this);
   }
}
