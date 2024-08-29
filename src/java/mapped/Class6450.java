package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Class6450 {
    private static final SimpleCommandExceptionType field28360 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.clone.overlap"));
    private static final Dynamic2CommandExceptionType field28361 = new Dynamic2CommandExceptionType(
            (var0, var1) -> new TranslationTextComponent("commands.clone.toobig", var0, var1)
    );
    private static final SimpleCommandExceptionType field28362 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.clone.failed"));
    public static final Predicate<Class9632> field28363 = var0 -> !var0.method37548().isAir();

    public static void method19588(CommandDispatcher<Class6619> var0) {
        var0.register(
                (LiteralArgumentBuilder) ((LiteralArgumentBuilder) Class6099.method18839("clone").requires(var0x -> var0x.method20129(2)))
                        .then(
                                Class6099.method18840("begin", Class6849.method20826())
                                        .then(
                                                Class6099.method18840("end", Class6849.method20826())
                                                        .then(
                                                                ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) Class6099.method18840(
                                                                                "destination", Class6849.method20826()
                                                                        )
                                                                        .executes(
                                                                                var0x -> method19589(
                                                                                        (Class6619) var0x.getSource(),
                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                        Class6849.method20827(var0x, "end"),
                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                        var0xx -> true,
                                                                                        Class2109.field13763
                                                                                )
                                                                        ))
                                                                        .then(
                                                                                ((LiteralArgumentBuilder) ((LiteralArgumentBuilder) ((LiteralArgumentBuilder) Class6099.method18839("replace")
                                                                                        .executes(
                                                                                                var0x -> method19589(
                                                                                                        (Class6619) var0x.getSource(),
                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                        var0xx -> true,
                                                                                                        Class2109.field13763
                                                                                                )
                                                                                        ))
                                                                                        .then(
                                                                                                Class6099.method18839("force")
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        var0xx -> true,
                                                                                                                        Class2109.field13761
                                                                                                                )
                                                                                                        )
                                                                                        ))
                                                                                        .then(
                                                                                                Class6099.method18839("move")
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        var0xx -> true,
                                                                                                                        Class2109.field13762
                                                                                                                )
                                                                                                        )
                                                                                        ))
                                                                                        .then(
                                                                                                Class6099.method18839("normal")
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        var0xx -> true,
                                                                                                                        Class2109.field13763
                                                                                                                )
                                                                                                        )
                                                                                        )
                                                                        ))
                                                                        .then(
                                                                                ((LiteralArgumentBuilder) ((LiteralArgumentBuilder) ((LiteralArgumentBuilder) Class6099.method18839("masked")
                                                                                        .executes(
                                                                                                var0x -> method19589(
                                                                                                        (Class6619) var0x.getSource(),
                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                        field28363,
                                                                                                        Class2109.field13763
                                                                                                )
                                                                                        ))
                                                                                        .then(
                                                                                                Class6099.method18839("force")
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        field28363,
                                                                                                                        Class2109.field13761
                                                                                                                )
                                                                                                        )
                                                                                        ))
                                                                                        .then(
                                                                                                Class6099.method18839("move")
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        field28363,
                                                                                                                        Class2109.field13762
                                                                                                                )
                                                                                                        )
                                                                                        ))
                                                                                        .then(
                                                                                                Class6099.method18839("normal")
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        field28363,
                                                                                                                        Class2109.field13763
                                                                                                                )
                                                                                                        )
                                                                                        )
                                                                        ))
                                                                        .then(
                                                                                Class6099.method18839("filtered")
                                                                                        .then(
                                                                                                ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) Class6099.method18840(
                                                                                                                "filter", Class7505.method24464()
                                                                                                        )
                                                                                                        .executes(
                                                                                                                var0x -> method19589(
                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                        Class7505.method24465(var0x, "filter"),
                                                                                                                        Class2109.field13763
                                                                                                                )
                                                                                                        ))
                                                                                                        .then(
                                                                                                                Class6099.method18839("force")
                                                                                                                        .executes(
                                                                                                                                var0x -> method19589(
                                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                                        Class7505.method24465(var0x, "filter"),
                                                                                                                                        Class2109.field13761
                                                                                                                                )
                                                                                                                        )
                                                                                                        ))
                                                                                                        .then(
                                                                                                                Class6099.method18839("move")
                                                                                                                        .executes(
                                                                                                                                var0x -> method19589(
                                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                                        Class7505.method24465(var0x, "filter"),
                                                                                                                                        Class2109.field13762
                                                                                                                                )
                                                                                                                        )
                                                                                                        ))
                                                                                                        .then(
                                                                                                                Class6099.method18839("normal")
                                                                                                                        .executes(
                                                                                                                                var0x -> method19589(
                                                                                                                                        (Class6619) var0x.getSource(),
                                                                                                                                        Class6849.method20827(var0x, "begin"),
                                                                                                                                        Class6849.method20827(var0x, "end"),
                                                                                                                                        Class6849.method20827(var0x, "destination"),
                                                                                                                                        Class7505.method24465(var0x, "filter"),
                                                                                                                                        Class2109.field13763
                                                                                                                                )
                                                                                                                        )
                                                                                                        )
                                                                                        )
                                                                        )
                                                        )
                                        )
                        )
        );
    }

    private static int method19589(Class6619 var0, BlockPos var1, BlockPos var2, BlockPos var3, Predicate<Class9632> var4, Class2109 var5) throws CommandSyntaxException {
        Class9764 var8 = new Class9764(var1, var2);
        BlockPos var9 = var3.method8337(var8.method38397());
        Class9764 var10 = new Class9764(var3, var9);
        if (!var5.method8779() && var10.method38390(var8)) {
            throw field28360.create();
        } else {
            int var11 = var8.method38398() * var8.method38399() * var8.method38400();
            if (var11 > 32768) {
                throw field28361.create(32768, var11);
            } else {
                ServerWorld var12 = var0.method20172();
                if (var12.method7018(var1, var2) && var12.method7018(var3, var9)) {
                    List var13 = Lists.newArrayList();
                    List<Class6202> var14 = Lists.newArrayList();
                    List var15 = Lists.newArrayList();
                    LinkedList<BlockPos> var16 = Lists.newLinkedList();
                    BlockPos var17 = new BlockPos(var10.field45678 - var8.field45678, var10.field45679 - var8.field45679, var10.field45680 - var8.field45680);

                    for (int var18 = var8.field45680; var18 <= var8.field45683; var18++) {
                        for (int var19 = var8.field45679; var19 <= var8.field45682; var19++) {
                            for (int var20 = var8.field45678; var20 <= var8.field45681; var20++) {
                                BlockPos var21 = new BlockPos(var20, var19, var18);
                                BlockPos var22 = var21.method8337(var17);
                                Class9632 var23 = new Class9632(var12, var21, false);
                                BlockState var24 = var23.method37548();
                                if (var4.test(var23)) {
                                    TileEntity var25 = var12.getTileEntity(var21);
                                    if (var25 == null) {
                                        if (!var24.method23409(var12, var21) && !var24.method23456(var12, var21)) {
                                            var15.add(new Class6202(var22, var24, (CompoundNBT) null));
                                            var16.addFirst(var21);
                                        } else {
                                            var13.add(new Class6202(var22, var24, (CompoundNBT) null));
                                            var16.addLast(var21);
                                        }
                                    } else {
                                        CompoundNBT var26 = var25.write(new CompoundNBT());
                                        var14.add(new Class6202(var22, var24, var26));
                                        var16.addLast(var21);
                                    }
                                }
                            }
                        }
                    }

                    if (var5 == Class2109.field13762) {
                        for (BlockPos var30 : var16) {
                            TileEntity var33 = var12.getTileEntity(var30);
                            Class946.method3802(var33);
                            var12.setBlockState(var30, Blocks.field36765.method11579(), 2);
                        }

                        for (BlockPos var31 : var16) {
                            var12.setBlockState(var31, Blocks.AIR.method11579(), 3);
                        }
                    }

                    List<Class6202> var29 = Lists.newArrayList();
                    var29.addAll(var13);
                    var29.addAll(var14);
                    var29.addAll(var15);
                    List<Class6202> var32 = Lists.reverse(var29);

                    for (Class6202 var36 : var32) {
                        TileEntity var40 = var12.getTileEntity(var36.field27679);
                        Class946.method3802(var40);
                        var12.setBlockState(var36.field27679, Blocks.field36765.method11579(), 2);
                    }

                    int var35 = 0;

                    for (Class6202 var41 : var29) {
                        if (var12.setBlockState(var41.field27679, var41.field27680, 2)) {
                            var35++;
                        }
                    }

                    for (Class6202 var42 : var14) {
                        TileEntity var44 = var12.getTileEntity(var42.field27679);
                        if (var42.field27681 != null && var44 != null) {
                            var42.field27681.method102("x", var42.field27679.getX());
                            var42.field27681.method102("y", var42.field27679.getY());
                            var42.field27681.method102("z", var42.field27679.getZ());
                            var44.method3645(var42.field27680, var42.field27681);
                            var44.method3622();
                        }

                        var12.setBlockState(var42.field27679, var42.field27680, 2);
                    }

                    for (Class6202 var43 : var32) {
                        var12.func_230547_a_(var43.field27679, var43.field27680.getBlock());
                    }

                    var12.method6860().method20732(var8, var17);
                    if (var35 != 0) {
                        var0.method20179(new TranslationTextComponent("commands.clone.success", var35), true);
                        return var35;
                    } else {
                        throw field28362.create();
                    }
                } else {
                    throw Class6849.field29741.create();
                }
            }
        }
    }
}
