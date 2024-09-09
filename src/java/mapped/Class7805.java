package mapped;

import io.netty.handler.codec.EncoderException;

public class Class7805 extends EncoderException implements Class7804 {
   public static final Class7805 field33502 = new Class7806("This packet is supposed to be cancelled; If you have debug enabled, you can ignore these");

   public Class7805() {
   }

   public Class7805(String var1, Throwable var2) {
      super(var1, var2);
   }

   public Class7805(String var1) {
      super(var1);
   }

   public Class7805(Throwable var1) {
      super(var1);
   }

   public static Class7805 method26072(Throwable var0) {
      return !ViaVersion3.method27614().method34425() ? field33502 : new Class7805(var0);
   }
}
