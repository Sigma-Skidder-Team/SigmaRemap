package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Difficulty;

public class Class8773 {
   private static final DynamicCommandExceptionType field39476 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.difficulty.failure", var0)
   );

   public static void method31643(CommandDispatcher<Class6619> var0) {
      LiteralArgumentBuilder<Class6619> var3 = Class6099.method18839("difficulty");

      for (Difficulty var7 : Difficulty.values()) {
         var3.then(Class6099.method18839(var7.getTranslationKey()).executes(var1 -> method31644((Class6619)var1.getSource(), var7)));
      }

      var0.register((LiteralArgumentBuilder)(var3.requires(var0x -> var0x.method20129(2))).executes(var0x -> {
         Difficulty var3x = ((Class6619)var0x.getSource()).method20172().method6997();
         ((Class6619)var0x.getSource()).method20179(new TranslationTextComponent("commands.difficulty.query", var3x.getDisplayName()), false);
         return var3x.getId();
      }));
   }

   public static int method31644(Class6619 var0, Difficulty var1) throws CommandSyntaxException {
      MinecraftServer var4 = var0.method20177();
      if (var4.func_240793_aU_().method20047() != var1) {
         var4.setDifficultyForAllWorlds(var1, true);
         var0.method20179(new TranslationTextComponent("commands.difficulty.success", var1.getDisplayName()), true);
         return 0;
      } else {
         throw field39476.create(var1.getTranslationKey());
      }
   }
}
