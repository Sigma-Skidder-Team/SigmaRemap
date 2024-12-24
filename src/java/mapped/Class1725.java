package mapped;

import java.io.IOException;

public abstract class Class1725 implements Sink {
   private final Sink field9405;

   public Class1725(Sink var1) {
      if (var1 != null) {
         this.field9405 = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final Sink method7549() {
      return this.field9405;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      this.field9405.method7540(var1, var2);
   }

   @Override
   public void flush() throws IOException {
      this.field9405.flush();
   }

   @Override
   public Class4916 method7541() {
      return this.field9405.method7541();
   }

   @Override
   public void close() throws IOException {
      this.field9405.close();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "(" + this.field9405.toString() + ")";
   }
}
