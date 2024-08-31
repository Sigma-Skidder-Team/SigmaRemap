package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;

public class Class2791 {
   public static final DynamicCommandExceptionType field17425 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.locatebiome.invalid", var0)
   );
   private static final DynamicCommandExceptionType field17426 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.locatebiome.notFound", var0)
   );

   public static void method10982(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("locatebiome").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("biome", Class8303.method29031())
                  .suggests(Class9222.field42456)
                  .executes(var0x -> method10983((Class6619)var0x.getSource(), (ResourceLocation)var0x.getArgument("biome", ResourceLocation.class)))
            )
      );
   }

   private static int method10983(Class6619 var0, ResourceLocation var1) throws CommandSyntaxException {
      Biome var4 = var0.method20177().method1437().<Biome>getRegistry(Registry.BIOME_KEY).method9187(var1).orElseThrow(() -> field17425.create(var1));
      BlockPos var5 = new BlockPos(var0.method20171());
      BlockPos var6 = var0.method20172().method6944(var4, var5, 6400, 8);
      String var7 = var1.toString();
      if (var6 != null) {
         return Class9417.method36133(var0, var7, var5, var6, "commands.locatebiome.success");
      } else {
         throw field17426.create(var7);
      }
   }
}
