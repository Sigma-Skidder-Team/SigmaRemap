package remapped;

import java.io.IOException;

public final class class_1497 implements class_4131 {
   private static String[] field_7956;
   private static final long field_7958 = 16384L;
   private final class_7059 field_7957;
   public boolean field_7954;
   public boolean field_7953;

   public class_1497(class_9388 var1) {
      this.field_7959 = var1;
      this.field_7957 = new class_7059();
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (!field_7955 && Thread.holdsLock(this.field_7959)) {
         throw new AssertionError();
      } else {
         this.field_7957.method_19191(var1, var2);

         while (this.field_7957.method_32468() >= 16384L) {
            this.method_6897(false);
         }
      }
   }

   private void method_6897(boolean var1) throws IOException {
      long var6;
      synchronized (this.field_7959) {
         this.field_7959.field_47984.method_6243();

         try {
            while (this.field_7959.field_47982 <= 0L && !this.field_7953 && !this.field_7954 && this.field_7959.field_47986 == null) {
               this.field_7959.method_43428();
            }
         } finally {
            this.field_7959.field_47984.method_23549();
         }

         this.field_7959.method_43413();
         var6 = Math.min(this.field_7959.field_47982, this.field_7957.method_32468());
         this.field_7959.field_47982 -= var6;
      }

      this.field_7959.field_47984.method_6243();

      try {
         this.field_7959.field_47980.method_12132(this.field_7959.field_47976, var1 && var6 == this.field_7957.method_32468(), this.field_7957, var6);
      } finally {
         this.field_7959.field_47984.method_23549();
      }
   }

   @Override
   public void flush() throws IOException {
      if (!field_7955 && Thread.holdsLock(this.field_7959)) {
         throw new AssertionError();
      } else {
         synchronized (this.field_7959) {
            this.field_7959.method_43413();
         }

         while (this.field_7957.method_32468() > 0L) {
            this.method_6897(false);
            this.field_7959.field_47980.method_12127();
         }
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_7959.field_47984;
   }

   @Override
   public void close() throws IOException {
      if (!field_7955 && Thread.holdsLock(this.field_7959)) {
         throw new AssertionError();
      } else {
         synchronized (this.field_7959) {
            if (this.field_7954) {
               return;
            }
         }

         if (!this.field_7959.field_47985.field_7953) {
            if (this.field_7957.method_32468() > 0L) {
               while (this.field_7957.method_32468() > 0L) {
                  this.method_6897(true);
               }
            } else {
               this.field_7959.field_47980.method_12132(this.field_7959.field_47976, true, null, 0L);
            }
         }

         synchronized (this.field_7959) {
            this.field_7954 = true;
         }

         this.field_7959.field_47980.method_12127();
         this.field_7959.method_43427();
      }
   }
}
