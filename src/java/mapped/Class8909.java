package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8909 {
   public static void method32551(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("give").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("targets", Class8700.method31353())
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("item", Class8722.method31481())
                           .executes(
                              var0x -> method32552(
                                    (Class6619)var0x.getSource(), Class8722.method31482(var0x, "item"), Class8700.method31354(var0x, "targets"), 1
                                 )
                           ))
                        .then(
                           Class6099.method18840("count", IntegerArgumentType.integer(1))
                              .executes(
                                 var0x -> method32552(
                                       (Class6619)var0x.getSource(),
                                       Class8722.method31482(var0x, "item"),
                                       Class8700.method31354(var0x, "targets"),
                                       IntegerArgumentType.getInteger(var0x, "count")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method32552(Class6619 var0, Class176 var1, Collection<ServerPlayerEntity> var2, int var3) throws CommandSyntaxException {
      for (ServerPlayerEntity var7 : var2) {
         int var8 = var3;

         while (var8 > 0) {
            int var9 = Math.min(var1.method502().method11710(), var8);
            var8 -= var9;
            ItemStack var10 = var1.method503(var9, false);
            boolean var11 = var7.inventory.method4045(var10);
            if (var11 && var10.isEmpty()) {
               var10.method32180(1);
               ItemEntity var13 = var7.method2882(var10, false);
               if (var13 != null) {
                  var13.method4137();
               }

               var7.world
                  .method6743(
                     (PlayerEntity)null,
                     var7.getPosX(),
                     var7.getPosY(),
                     var7.getPosZ(),
                     Sounds.field26714,
                     Class2266.field14735,
                     0.2F,
                     ((var7.method3013().nextFloat() - var7.method3013().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               var7.field4904.method18130();
            } else {
               ItemEntity var12 = var7.method2882(var10, false);
               if (var12 != null) {
                  var12.method4132();
                  var12.method4127(var7.getUniqueID());
               }
            }
         }
      }

      if (var2.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.give.success.single", var3, var1.method503(var3, false).method32173(), var2.size()), true);
      } else {
         var0.method20179(
            new TranslationTextComponent(
               "commands.give.success.single", var3, var1.method503(var3, false).method32173(), ((ServerPlayerEntity)var2.iterator().next()).getDisplayName()
            ),
            true
         );
      }

      return var2.size();
   }
}
