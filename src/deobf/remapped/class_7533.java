package remapped;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class class_7533 {
   private static String[] field_38457;
   private final CountDownLatch field_38455 = new CountDownLatch(1);
   private long field_38454 = -1L;
   private long field_38456 = -1L;

   public void method_34318() {
      if (this.field_38454 == -1L) {
         this.field_38454 = System.nanoTime();
      } else {
         throw new IllegalStateException();
      }
   }

   public void method_34321() {
      if (this.field_38456 == -1L && this.field_38454 != -1L) {
         this.field_38456 = System.nanoTime();
         this.field_38455.countDown();
      } else {
         throw new IllegalStateException();
      }
   }

   public void method_34323() {
      if (this.field_38456 == -1L && this.field_38454 != -1L) {
         this.field_38456 = this.field_38454 - 1L;
         this.field_38455.countDown();
      } else {
         throw new IllegalStateException();
      }
   }

   public long method_34319() throws InterruptedException {
      this.field_38455.await();
      return this.field_38456 - this.field_38454;
   }

   public long method_34320(long var1, TimeUnit var3) throws InterruptedException {
      return !this.field_38455.await(var1, var3) ? -2L : this.field_38456 - this.field_38454;
   }
}
