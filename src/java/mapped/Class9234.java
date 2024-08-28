package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9234 {
   public static void method34726(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("list").executes(var0x -> method34727((Class6619)var0x.getSource())))
            .then(Class6099.method18839("uuids").executes(var0x -> method34728((Class6619)var0x.getSource())))
      );
   }

   private static int method34727(Class6619 var0) {
      return method34729(var0, PlayerEntity::getDisplayName);
   }

   private static int method34728(Class6619 var0) {
      return method34729(var0, var0x -> new TranslationTextComponent("commands.list.nameAndId", var0x.getName(), var0x.getGameProfile().getId()));
   }

   private static int method34729(Class6619 var0, Function<Class878, ITextComponent> var1) {
      Class6395 var4 = var0.method20177().getPlayerList();
      List var5 = var4.method19488();
      IFormattableTextComponent var6 = TextComponentUtils.func_240649_b_(var5, var1);
      var0.method20179(new TranslationTextComponent("commands.list.players", var5.size(), var4.method19475(), var6), false);
      return var5.size();
   }
}
