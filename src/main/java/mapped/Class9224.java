package mapped;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class Class9224 {
   private static String[] field42460;
   private final CountDownLatch field42461 = new CountDownLatch(1);
   private long field42462 = -1L;
   private long field42463 = -1L;

   public void method34699() {
      if (this.field42462 == -1L) {
         this.field42462 = System.nanoTime();
      } else {
         throw new IllegalStateException();
      }
   }

   public void method34700() {
      if (this.field42463 == -1L && this.field42462 != -1L) {
         this.field42463 = System.nanoTime();
         this.field42461.countDown();
      } else {
         throw new IllegalStateException();
      }
   }

   public void method34701() {
      if (this.field42463 == -1L && this.field42462 != -1L) {
         this.field42463 = this.field42462 - 1L;
         this.field42461.countDown();
      } else {
         throw new IllegalStateException();
      }
   }

   public long method34702() throws InterruptedException {
      this.field42461.await();
      return this.field42463 - this.field42462;
   }

   public long method34703(long var1, TimeUnit var3) throws InterruptedException {
      return !this.field42461.await(var1, var3) ? -2L : this.field42463 - this.field42462;
   }
}
