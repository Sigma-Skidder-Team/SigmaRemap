package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.BlockPosArgument;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.Property;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class8031 {
   private static final Dynamic2CommandExceptionType field34511 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.fill.toobig", var0, var1)
   );
   private static final Class164 field34512 = new Class164(Blocks.AIR.getDefaultState(), Collections.<Property<?>>emptySet(), (CompoundNBT)null);
   private static final SimpleCommandExceptionType field34513 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.fill.failed"));

   public static void method27540(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("fill").requires(var0x -> var0x.method20129(2)))
            .then(
               Commands.method18840("from", BlockPosArgument.method20826())
                  .then(
                     Commands.method18840("to", BlockPosArgument.method20826())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840(
                                                "block", Class7971.method27103()
                                             )
                                             .executes(
                                                var0x -> method27541(
                                                      (CommandSource)var0x.getSource(),
                                                      new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                                      Class7971.method27104(var0x, "block"),
                                                      Class2222.field14510,
                                                      (Predicate<CachedBlockInfo>)null
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder) Commands.method18839("replace")
                                                   .executes(
                                                      var0x -> method27541(
                                                            (CommandSource)var0x.getSource(),
                                                            new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                                            Class7971.method27104(var0x, "block"),
                                                            Class2222.field14510,
                                                            (Predicate<CachedBlockInfo>)null
                                                         )
                                                   ))
                                                .then(
                                                   Commands.method18840("filter", Class7505.method24464())
                                                      .executes(
                                                         var0x -> method27541(
                                                               (CommandSource)var0x.getSource(),
                                                               new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                                               Class7971.method27104(var0x, "block"),
                                                               Class2222.field14510,
                                                               Class7505.method24465(var0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          Commands.method18839("keep")
                                             .executes(
                                                var0x -> method27541(
                                                      (CommandSource)var0x.getSource(),
                                                      new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                                      Class7971.method27104(var0x, "block"),
                                                      Class2222.field14510,
                                                      var0xx -> var0xx.method37550().method7007(var0xx.method37551())
                                                   )
                                             )
                                       ))
                                    .then(
                                       Commands.method18839("outline")
                                          .executes(
                                             var0x -> method27541(
                                                   (CommandSource)var0x.getSource(),
                                                   new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                                   Class7971.method27104(var0x, "block"),
                                                   Class2222.field14511,
                                                   (Predicate<CachedBlockInfo>)null
                                                )
                                          )
                                    ))
                                 .then(
                                    Commands.method18839("hollow")
                                       .executes(
                                          var0x -> method27541(
                                                (CommandSource)var0x.getSource(),
                                                new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                                Class7971.method27104(var0x, "block"),
                                                Class2222.field14512,
                                                (Predicate<CachedBlockInfo>)null
                                             )
                                       )
                                 ))
                              .then(
                                 Commands.method18839("destroy")
                                    .executes(
                                       var0x -> method27541(
                                             (CommandSource)var0x.getSource(),
                                             new MutableBoundingBox(BlockPosArgument.method20827(var0x, "from"), BlockPosArgument.method20827(var0x, "to")),
                                             Class7971.method27104(var0x, "block"),
                                             Class2222.field14513,
                                             (Predicate<CachedBlockInfo>)null
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method27541(CommandSource var0, MutableBoundingBox var1, Class164 var2, Class2222 var3, Predicate<CachedBlockInfo> var4) throws CommandSyntaxException {
      int var7 = var1.method38398() * var1.method38399() * var1.method38400();
      if (var7 > 32768) {
         throw field34511.create(32768, var7);
      } else {
        List<BlockPos> var8 = Lists.newArrayList();
         ServerWorld var9 = var0.method20172();
         int var10 = 0;

         for (BlockPos var12 : BlockPos.method8364(var1.minX, var1.minY, var1.minZ, var1.maxX, var1.maxY, var1.maxZ)) {
            if (var4 == null || var4.test(new CachedBlockInfo(var9, var12, true))) {
               Class164 var13 = var3.field14514.method26284(var1, var12, var2, var9);
               if (var13 != null) {
                  TileEntity var14 = var9.getTileEntity(var12);
                  IClearable.method3802(var14);
                  if (var13.method496(var9, var12, 2)) {
                     var8.add(var12.toImmutable());
                     var10++;
                  }
               }
            }
         }

         for (BlockPos var16 : var8) {
            Block var17 = var9.getBlockState(var16).getBlock();
            var9.func_230547_a_(var16, var17);
         }

         if (var10 != 0) {
            var0.sendFeedback(new TranslationTextComponent("commands.fill.success", var10), true);
            return var10;
         } else {
            throw field34513.create();
         }
      }
   }

   // $VF: synthetic method
   public static Class164 method27552() {
      return field34512;
   }
}
