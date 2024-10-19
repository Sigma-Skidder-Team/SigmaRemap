package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7517 {
   private static final SimpleCommandExceptionType field32247 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType field32248 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.schedule.cleared.failure", var0)
   );
   private static final SuggestionProvider<CommandSource> field32249 = (var0, var1) -> ISuggestionProvider.method20147(
         ((CommandSource)var0.getSource()).getServer().func_240793_aU_().method20098().method20074().method30537(), var1
      );

   public static void method24504(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("schedule").requires(var0x -> var0x.method20129(2)))
               .then(
                  Commands.method18839("function")
                     .then(
                        Commands.method18840("function", Class7566.method24766())
                           .suggests(Class6206.field27688)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840("time", Class8127.method28154())
                                       .executes(
                                          var0x -> method24505(
                                                (CommandSource)var0x.getSource(),
                                                Class7566.method24770(var0x, "function"),
                                                IntegerArgumentType.getInteger(var0x, "time"),
                                                true
                                             )
                                       ))
                                    .then(
                                       Commands.method18839("append")
                                          .executes(
                                             var0x -> method24505(
                                                   (CommandSource)var0x.getSource(),
                                                   Class7566.method24770(var0x, "function"),
                                                   IntegerArgumentType.getInteger(var0x, "time"),
                                                   false
                                                )
                                          )
                                    ))
                                 .then(
                                    Commands.method18839("replace")
                                       .executes(
                                          var0x -> method24505(
                                                (CommandSource)var0x.getSource(),
                                                Class7566.method24770(var0x, "function"),
                                                IntegerArgumentType.getInteger(var0x, "time"),
                                                true
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               Commands.method18839("clear")
                  .then(
                     Commands.method18840("function", StringArgumentType.greedyString())
                        .suggests(field32249)
                        .executes(var0x -> method24506((CommandSource)var0x.getSource(), StringArgumentType.getString(var0x, "function")))
                  )
            )
      );
   }

   private static int method24505(CommandSource var0, Pair<ResourceLocation, Either<Class7744, ITag<Class7744>>> var1, int var2, boolean var3) throws CommandSyntaxException {
      if (var2 != 0) {
         long var6 = var0.method20172().getGameTime() + (long)var2;
         ResourceLocation var8 = (ResourceLocation)var1.getFirst();
         Class8559 var9 = var0.getServer().func_240793_aU_().method20098().method20074();
         ((Either)var1.getSecond()).ifLeft(var7 -> {
            String var10 = var8.toString();
            if (var3) {
               var9.method30536(var10);
            }

            var9.method30535(var10, var6, new Class6860(var8));
            var0.sendFeedback(new TranslationTextComponent("commands.schedule.created.function", var8, var2, var6), true);
         }).ifRight(var7 -> {
            String var10 = "#" + var8.toString();
            if (var3) {
               var9.method30536(var10);
            }

            var9.method30535(var10, var6, new Class6862(var8));
            var0.sendFeedback(new TranslationTextComponent("commands.schedule.created.tag", var8, var2, var6), true);
         });
         return (int)Math.floorMod(var6, 2147483647L);
      } else {
         throw field32247.create();
      }
   }

   private static int method24506(CommandSource var0, String var1) throws CommandSyntaxException {
      int var4 = var0.getServer().func_240793_aU_().method20098().method20074().method30536(var1);
      if (var4 != 0) {
         var0.sendFeedback(new TranslationTextComponent("commands.schedule.cleared.success", var4, var1), true);
         return var4;
      } else {
         throw field32248.create(var1);
      }
   }
}
