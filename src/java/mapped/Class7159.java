package mapped;

import net.minecraft.command.CommandSource;

import java.util.ArrayDeque;

public class Class7159 {
   private static String[] field30758;
   private final FunctionManager field30759;
   private final CommandSource field30760;
   private final Class6797 field30761;

   public Class7159(FunctionManager var1, CommandSource var2, Class6797 var3) {
      this.field30759 = var1;
      this.field30760 = var2;
      this.field30761 = var3;
   }

   public void method22399(ArrayDeque<Class7159> var1, int var2) {
      try {
         this.field30761.method20710(this.field30759, this.field30760, var1, var2);
      } catch (Throwable var6) {
      }
   }

   @Override
   public String toString() {
      return this.field30761.toString();
   }
}
