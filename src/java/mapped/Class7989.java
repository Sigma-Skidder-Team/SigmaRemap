package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.command.CommandSource;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class7989<T extends Class7465<T>> {
   private static String[] field34316;
   private final Supplier<ArgumentType<?>> field34317;
   private final Function<Class7989<T>, T> field34318;
   private final BiConsumer<MinecraftServer, T> field34319;
   private final Class8272<T> field34320;

   public Class7989(Supplier<ArgumentType<?>> var1, Function<Class7989<T>, T> var2, BiConsumer<MinecraftServer, T> var3, Class8272<T> var4) {
      this.field34317 = var1;
      this.field34318 = var2;
      this.field34319 = var3;
      this.field34320 = var4;
   }

   public RequiredArgumentBuilder<CommandSource, ?> method27158(String var1) {
      return Class6099.method18840(var1, (ArgumentType<T>)this.field34317.get());
   }

   public T method27159() {
      return this.field34318.apply(this);
   }

   public void method27160(Class7567 var1, Class9221<T> var2) {
      this.field34320.method28881(var1, var2, this);
   }

   // $VF: synthetic method
   public static BiConsumer method27161(Class7989 var0) {
      return var0.field34319;
   }
}
