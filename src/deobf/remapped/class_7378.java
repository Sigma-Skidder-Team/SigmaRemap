package remapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class class_7378 extends class_8039<String> {
   private static final int field_37697 = Character.toString('\uffff').getBytes(StandardCharsets.UTF_8).length;
   private final int field_37698;

   public class_7378() {
      this(32767);
   }

   public class_7378(int var1) {
      super(String.class);
      this.field_37698 = var1;
   }

   public String method_33600(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41157.method_15647(var1);
      Preconditions.checkArgument(
         var4 <= this.field_37698 * field_37697, "Cannot receive string longer than Short.MAX_VALUE * " + field_37697 + " bytes (got %s bytes)", var4
      );
      String var5 = var1.toString(var1.readerIndex(), var4, StandardCharsets.UTF_8);
      var1.skipBytes(var4);
      Preconditions.checkArgument(
         var5.length() <= this.field_37698, "Cannot receive string longer than Short.MAX_VALUE characters (got %s bytes)", var5.length()
      );
      return var5;
   }

   public void method_33599(ByteBuf var1, String var2) throws Exception {
      Preconditions.checkArgument(var2.length() <= this.field_37698, "Cannot send string longer than Short.MAX_VALUE (got %s characters)", var2.length());
      byte[] var5 = var2.getBytes(StandardCharsets.UTF_8);
      class_8039.field_41157.method_15644(var1, var5.length);
      var1.writeBytes(var5);
   }
}
