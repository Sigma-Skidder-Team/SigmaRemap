package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8071 {
   public static void method27787(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("time")
                     .requires(var0x -> var0x.method20129(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("set")
                                    .then(Class6099.method18839("day").executes(var0x -> method27790((Class6619)var0x.getSource(), 1000))))
                                 .then(Class6099.method18839("noon").executes(var0x -> method27790((Class6619)var0x.getSource(), 6000))))
                              .then(Class6099.method18839("night").executes(var0x -> method27790((Class6619)var0x.getSource(), 13000))))
                           .then(Class6099.method18839("midnight").executes(var0x -> method27790((Class6619)var0x.getSource(), 18000))))
                        .then(
                           Class6099.method18840("time", Class8127.method28154())
                              .executes(var0x -> method27790((Class6619)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  ))
               .then(
                  Class6099.method18839("add")
                     .then(
                        Class6099.method18840("time", Class8127.method28154())
                           .executes(var0x -> method27791((Class6619)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("query")
                        .then(
                           Class6099.method18839("daytime")
                              .executes(var0x -> method27789((Class6619)var0x.getSource(), method27788(((Class6619)var0x.getSource()).method20172())))
                        ))
                     .then(
                        Class6099.method18839("gametime")
                           .executes(
                              var0x -> method27789((Class6619)var0x.getSource(), (int)(((Class6619)var0x.getSource()).method20172().method6783() % 2147483647L))
                           )
                     ))
                  .then(
                     Class6099.method18839("day")
                        .executes(
                           var0x -> method27789(
                                 (Class6619)var0x.getSource(), (int)(((Class6619)var0x.getSource()).method20172().method6784() / 24000L % 2147483647L)
                              )
                        )
                  )
            )
      );
   }

   private static int method27788(ServerWorld var0) {
      return (int)(var0.method6784() % 24000L);
   }

   private static int method27789(Class6619 var0, int var1) {
      var0.method20179(new TranslationTextComponent("commands.time.query", var1), false);
      return var1;
   }

   public static int method27790(Class6619 var0, int var1) {
      for (ServerWorld var5 : var0.method20177().method1320()) {
         var5.method6896((long)var1);
      }

      var0.method20179(new TranslationTextComponent("commands.time.set", var1), true);
      return method27788(var0.method20172());
   }

   public static int method27791(Class6619 var0, int var1) {
      for (ServerWorld var5 : var0.method20177().method1320()) {
         var5.method6896(var5.method6784() + (long)var1);
      }

      int var6 = method27788(var0.method20172());
      var0.method20179(new TranslationTextComponent("commands.time.set", var6), true);
      return var6;
   }
}
