package remapped;

import io.netty.handler.codec.DecoderException;

public class class_8753 extends DecoderException implements class_2767 {
   public static final class_8753 field_44809 = new class_5526("This packet is supposed to be cancelled; If you have debug enabled, you can ignore these");

   public class_8753() {
   }

   public class_8753(String var1, Throwable var2) {
      super(var1, var2);
   }

   public class_8753(String var1) {
      super(var1);
   }

   public class_8753(Throwable var1) {
      super(var1);
   }

   public static class_8753 method_40189(Throwable var0) {
      return !class_3446.method_15883().method_33731() ? field_44809 : new class_8753(var0);
   }
}
