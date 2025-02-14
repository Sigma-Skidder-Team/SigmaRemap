package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.text.ITextComponent;

public class Class2468 extends RuntimeException {
   private static String[] field16551;
   private final ITextComponent field16552;

   public Class2468(ITextComponent var1) {
      super(var1.getString(), (Throwable)null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.field16552 = var1;
   }

   public ITextComponent method10468() {
      return this.field16552;
   }
}
