package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class Class1718 implements Class1716 {
   private final Class4921 field9376;
   private boolean field9377;
   private long field9378;
   public final Class7933 field9379;

   public Class1718(Class7933 var1, long var2) {
      this.field9379 = var1;
      this.field9376 = new Class4921(this.field9379.field34015.method7541());
      this.field9378 = var2;
   }

   @Override
   public Class4916 method7541() {
      return this.field9376;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (!this.field9377) {
         Class9474.method36533(var1.method7582(), 0L, var2);
         if (var2 <= this.field9378) {
            this.field9379.field34015.method7540(var1, var2);
            this.field9378 -= var2;
         } else {
            throw new ProtocolException("expected " + this.field9378 + " bytes but received " + var2);
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public void flush() throws IOException {
      if (!this.field9377) {
         this.field9379.field34015.flush();
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field9377) {
         this.field9377 = true;
         if (this.field9378 <= 0L) {
            this.field9379.method26683(this.field9376);
            this.field9379.field34016 = 3;
         } else {
            throw new ProtocolException("unexpected end of stream");
         }
      }
   }
}
