package remapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class class_5925 implements class_4131 {
   private final class_8880 field_30055;
   private boolean field_30054;
   private long field_30057;

   public class_5925(class_9485 var1, long var2) {
      this.field_30058 = var1;
      this.field_30055 = new class_8880(this.field_30058.field_48344.method_19192());
      this.field_30057 = var2;
   }

   @Override
   public class_245 method_19192() {
      return this.field_30055;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (!this.field_30054) {
         class_8515.method_39203(var1.method_32468(), 0L, var2);
         if (var2 <= this.field_30057) {
            this.field_30058.field_48344.method_19191(var1, var2);
            this.field_30057 -= var2;
         } else {
            throw new ProtocolException("expected " + this.field_30057 + " bytes but received " + var2);
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public void flush() throws IOException {
      if (!this.field_30054) {
         this.field_30058.field_48344.flush();
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field_30054) {
         this.field_30054 = true;
         if (this.field_30057 <= 0L) {
            this.field_30058.method_43820(this.field_30055);
            this.field_30058.field_48339 = 3;
         } else {
            throw new ProtocolException("unexpected end of stream");
         }
      }
   }
}
