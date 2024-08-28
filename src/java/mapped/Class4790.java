package mapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class Class4790 extends Class4750<String> {
   private static final int field22587 = Character.toString('\uffff').getBytes(StandardCharsets.UTF_8).length;
   private final int field22588;

   public Class4790() {
      this(32767);
   }

   public Class4790(int var1) {
      super(String.class);
      this.field22588 = var1;
   }

   public String method14894(ByteBuf var1) throws Exception {
      int var4 = Class4750.field22544.method14907(var1);
      Preconditions.checkArgument(
         var4 <= this.field22588 * field22587, "Cannot receive string longer than Short.MAX_VALUE * " + field22587 + " bytes (got %s bytes)", var4
      );
      String var5 = var1.toString(var1.readerIndex(), var4, StandardCharsets.UTF_8);
      var1.skipBytes(var4);
      Preconditions.checkArgument(
         var5.length() <= this.field22588, "Cannot receive string longer than Short.MAX_VALUE characters (got %s bytes)", var5.length()
      );
      return var5;
   }

   public void method14895(ByteBuf var1, String var2) throws Exception {
      Preconditions.checkArgument(var2.length() <= this.field22588, "Cannot send string longer than Short.MAX_VALUE (got %s characters)", var2.length());
      byte[] var5 = var2.getBytes(StandardCharsets.UTF_8);
      Class4750.field22544.method14908(var1, var5.length);
      var1.writeBytes(var5);
   }
}
