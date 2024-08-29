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
import net.minecraft.util.text.TranslationTextComponent;

public class Class8031 {
   private static final Dynamic2CommandExceptionType field34511 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.fill.toobig", var0, var1)
   );
   private static final Class164 field34512 = new Class164(Blocks.AIR.method11579(), Collections.<Class8550<?>>emptySet(), (CompoundNBT)null);
   private static final SimpleCommandExceptionType field34513 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.fill.failed"));

   public static void method27540(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("fill").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("from", Class6849.method20826())
                  .then(
                     Class6099.method18840("to", Class6849.method20826())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                                "block", Class7971.method27103()
                                             )
                                             .executes(
                                                var0x -> method27541(
                                                      (Class6619)var0x.getSource(),
                                                      new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                                      Class7971.method27104(var0x, "block"),
                                                      Class2222.field14510,
                                                      (Predicate<Class9632>)null
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)Class6099.method18839("replace")
                                                   .executes(
                                                      var0x -> method27541(
                                                            (Class6619)var0x.getSource(),
                                                            new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                                            Class7971.method27104(var0x, "block"),
                                                            Class2222.field14510,
                                                            (Predicate<Class9632>)null
                                                         )
                                                   ))
                                                .then(
                                                   Class6099.method18840("filter", Class7505.method24464())
                                                      .executes(
                                                         var0x -> method27541(
                                                               (Class6619)var0x.getSource(),
                                                               new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                                               Class7971.method27104(var0x, "block"),
                                                               Class2222.field14510,
                                                               Class7505.method24465(var0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839("keep")
                                             .executes(
                                                var0x -> method27541(
                                                      (Class6619)var0x.getSource(),
                                                      new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                                      Class7971.method27104(var0x, "block"),
                                                      Class2222.field14510,
                                                      var0xx -> var0xx.method37550().method7007(var0xx.method37551())
                                                   )
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("outline")
                                          .executes(
                                             var0x -> method27541(
                                                   (Class6619)var0x.getSource(),
                                                   new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                                   Class7971.method27104(var0x, "block"),
                                                   Class2222.field14511,
                                                   (Predicate<Class9632>)null
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("hollow")
                                       .executes(
                                          var0x -> method27541(
                                                (Class6619)var0x.getSource(),
                                                new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                                Class7971.method27104(var0x, "block"),
                                                Class2222.field14512,
                                                (Predicate<Class9632>)null
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("destroy")
                                    .executes(
                                       var0x -> method27541(
                                             (Class6619)var0x.getSource(),
                                             new Class9764(Class6849.method20827(var0x, "from"), Class6849.method20827(var0x, "to")),
                                             Class7971.method27104(var0x, "block"),
                                             Class2222.field14513,
                                             (Predicate<Class9632>)null
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method27541(Class6619 var0, Class9764 var1, Class164 var2, Class2222 var3, Predicate<Class9632> var4) throws CommandSyntaxException {
      int var7 = var1.method38398() * var1.method38399() * var1.method38400();
      if (var7 > 32768) {
         throw field34511.create(32768, var7);
      } else {
        List<BlockPos> var8 = Lists.newArrayList();
         ServerWorld var9 = var0.method20172();
         int var10 = 0;

         for (BlockPos var12 : BlockPos.method8364(var1.field45678, var1.field45679, var1.field45680, var1.field45681, var1.field45682, var1.field45683)) {
            if (var4 == null || var4.test(new Class9632(var9, var12, true))) {
               Class164 var13 = var3.field14514.method26284(var1, var12, var2, var9);
               if (var13 != null) {
                  TileEntity var14 = var9.getTileEntity(var12);
                  Class946.method3802(var14);
                  if (var13.method496(var9, var12, 2)) {
                     var8.add(var12.method8353());
                     var10++;
                  }
               }
            }
         }

         for (BlockPos var16 : var8) {
            Block var17 = var9.getBlockState(var16).getBlock();
            var9.method6964(var16, var17);
         }

         if (var10 != 0) {
            var0.method20179(new TranslationTextComponent("commands.fill.success", var10), true);
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
