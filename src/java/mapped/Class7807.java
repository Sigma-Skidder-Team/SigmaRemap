package mapped;

import io.netty.handler.codec.DecoderException;

public class Class7807 extends DecoderException implements Class7804 {
   public static final Class7807 field33503 = new Class7808("This packet is supposed to be cancelled; If you have debug enabled, you can ignore these");

   public Class7807() {
   }

   public Class7807(String var1, Throwable var2) {
      super(var1, var2);
   }

   public Class7807(String var1) {
      super(var1);
   }

   public Class7807(Throwable var1) {
      super(var1);
   }

   public static Class7807 method26073(Throwable var0) {
      return !Class8042.method27614().method34425() ? field33503 : new Class7807(var0);
   }
}
