package mapped;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;

public abstract class Class7465<T extends Class7465<T>> {
   public final Class7989<T> field32101;

   public Class7465(Class7989<T> var1) {
      this.field32101 = var1;
   }

   public abstract void method24154(CommandContext<CommandSource> var1, String var2);

   public void method24170(CommandContext<CommandSource> var1, String var2) {
      this.method24154(var1, var2);
      this.method24171(((CommandSource)var1.getSource()).method20177());
   }

   public void method24171(MinecraftServer var1) {
      if (var1 != null) {
         Class7989.method27161(this.field32101).accept(var1, this.method24166());
      }
   }

   public abstract void method24157(String var1);

   public abstract String method24156();

   @Override
   public String toString() {
      return this.method24156();
   }

   public abstract int method24160();

   public abstract T method24166();

   public abstract T method24165();

   public abstract void method24164(T var1, MinecraftServer var2);
}
