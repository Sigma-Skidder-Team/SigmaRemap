package mapped;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;

public final class Class7571 implements Class7567 {
   public final LiteralArgumentBuilder field32510;

   public Class7571(LiteralArgumentBuilder var1) {
      this.field32510 = var1;
   }

   @Override
   public <T extends Class7465<T>> void method24776(Class9221<T> var1, Class7989<T> var2) {
      this.field32510
         .then(
            ((LiteralArgumentBuilder) Commands.method18839(var1.method34672()).executes(var1x -> Class9643.method37599((CommandSource)var1x.getSource(), var1)))
               .then(var2.method27158("value").executes(var1x -> Class9643.method37598(var1x, var1)))
         );
   }
}
