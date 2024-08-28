package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8686 {
   private static final SimpleCommandExceptionType field39214 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.setblock.failed"));

   public static void method31294(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("setblock").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("pos", Class6849.method20826())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("block", Class7971.method27103())
                                 .executes(
                                    var0x -> method31295(
                                          (Class6619)var0x.getSource(),
                                          Class6849.method20827(var0x, "pos"),
                                          Class7971.method27104(var0x, "block"),
                                          Class2047.field13361,
                                          (Predicate<Class9632>)null
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("destroy")
                                    .executes(
                                       var0x -> method31295(
                                             (Class6619)var0x.getSource(),
                                             Class6849.method20827(var0x, "pos"),
                                             Class7971.method27104(var0x, "block"),
                                             Class2047.field13362,
                                             (Predicate<Class9632>)null
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("keep")
                                 .executes(
                                    var0x -> method31295(
                                          (Class6619)var0x.getSource(),
                                          Class6849.method20827(var0x, "pos"),
                                          Class7971.method27104(var0x, "block"),
                                          Class2047.field13361,
                                          var0xx -> var0xx.method37550().method7007(var0xx.method37551())
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("replace")
                              .executes(
                                 var0x -> method31295(
                                       (Class6619)var0x.getSource(),
                                       Class6849.method20827(var0x, "pos"),
                                       Class7971.method27104(var0x, "block"),
                                       Class2047.field13361,
                                       (Predicate<Class9632>)null
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method31295(Class6619 var0, BlockPos var1, Class164 var2, Class2047 var3, Predicate<Class9632> var4) throws CommandSyntaxException {
      Class1657 var7 = var0.method20172();
      if (var4 != null && !var4.test(new Class9632(var7, var1, true))) {
         throw field39214.create();
      } else {
         boolean var9;
         if (var3 != Class2047.field13362) {
            Class944 var8 = var7.method6759(var1);
            Class946.method3802(var8);
            var9 = true;
         } else {
            var7.method7179(var1, true);
            var9 = !var2.method495().method23393() || !var7.method6738(var1).method23393();
         }

         if (var9 && !var2.method496(var7, var1, 2)) {
            throw field39214.create();
         } else {
            var7.method6964(var1, var2.method495().method23383());
            var0.method20179(new TranslationTextComponent("commands.setblock.success", var1.method8304(), var1.getY(), var1.method8306()), true);
            return 1;
         }
      }
   }
}
