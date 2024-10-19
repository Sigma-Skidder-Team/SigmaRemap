package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;

import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.BlockPosArgument;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class8686 {
   private static final SimpleCommandExceptionType field39214 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.setblock.failed"));

   public static void method31294(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("setblock").requires(var0x -> var0x.method20129(2)))
            .then(
               Commands.method18840("pos", BlockPosArgument.method20826())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840("block", Class7971.method27103())
                                 .executes(
                                    var0x -> method31295(
                                          (CommandSource)var0x.getSource(),
                                          BlockPosArgument.method20827(var0x, "pos"),
                                          Class7971.method27104(var0x, "block"),
                                          Class2047.field13361,
                                          (Predicate<CachedBlockInfo>)null
                                       )
                                 ))
                              .then(
                                 Commands.method18839("destroy")
                                    .executes(
                                       var0x -> method31295(
                                             (CommandSource)var0x.getSource(),
                                             BlockPosArgument.method20827(var0x, "pos"),
                                             Class7971.method27104(var0x, "block"),
                                             Class2047.field13362,
                                             (Predicate<CachedBlockInfo>)null
                                          )
                                    )
                              ))
                           .then(
                              Commands.method18839("keep")
                                 .executes(
                                    var0x -> method31295(
                                          (CommandSource)var0x.getSource(),
                                          BlockPosArgument.method20827(var0x, "pos"),
                                          Class7971.method27104(var0x, "block"),
                                          Class2047.field13361,
                                          var0xx -> var0xx.method37550().method7007(var0xx.method37551())
                                       )
                                 )
                           ))
                        .then(
                           Commands.method18839("replace")
                              .executes(
                                 var0x -> method31295(
                                       (CommandSource)var0x.getSource(),
                                       BlockPosArgument.method20827(var0x, "pos"),
                                       Class7971.method27104(var0x, "block"),
                                       Class2047.field13361,
                                       (Predicate<CachedBlockInfo>)null
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method31295(CommandSource var0, BlockPos var1, Class164 var2, Class2047 var3, Predicate<CachedBlockInfo> var4) throws CommandSyntaxException {
      ServerWorld var7 = var0.method20172();
      if (var4 != null && !var4.test(new CachedBlockInfo(var7, var1, true))) {
         throw field39214.create();
      } else {
         boolean var9;
         if (var3 != Class2047.field13362) {
            TileEntity var8 = var7.getTileEntity(var1);
            IClearable.method3802(var8);
            var9 = true;
         } else {
            var7.method7179(var1, true);
            var9 = !var2.method495().isAir() || !var7.getBlockState(var1).isAir();
         }

         if (var9 && !var2.method496(var7, var1, 2)) {
            throw field39214.create();
         } else {
            var7.func_230547_a_(var1, var2.method495().getBlock());
            var0.sendFeedback(new TranslationTextComponent("commands.setblock.success", var1.getX(), var1.getY(), var1.getZ()), true);
            return 1;
         }
      }
   }
}
