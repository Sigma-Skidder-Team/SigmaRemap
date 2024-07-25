package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.text.ITextComponent;

public class class_720 extends RuntimeException {
   private static String[] field_3918;
   private final ITextComponent field_3919;

   public class_720(ITextComponent var1) {
      super(var1.getString(), (Throwable)null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.field_3919 = var1;
   }

   public ITextComponent method_3276() {
      return this.field_3919;
   }
}
