package remapped;

import io.netty.handler.codec.EncoderException;

public class class_7824 extends EncoderException implements class_2767 {
   public static final class_7824 field_39683 = new class_8211("This packet is supposed to be cancelled; If you have debug enabled, you can ignore these");

   public class_7824() {
   }

   public class_7824(String var1, Throwable var2) {
      super(var1, var2);
   }

   public class_7824(String var1) {
      super(var1);
   }

   public class_7824(Throwable var1) {
      super(var1);
   }

   public static class_7824 method_35427(Throwable var0) {
      return !class_3446.method_15883().method_33731() ? field_39683 : new class_7824(var0);
   }
}
