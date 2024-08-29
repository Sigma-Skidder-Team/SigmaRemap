package mapped;

import java.util.Optional;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class5810 extends Class5807 {
   public Class5810(MainWindow var1) {
      this(var1, var1.method8050());
   }

   private Class5810(MainWindow var1, Class7513 var2) {
      super(
         "options.fullscreen.resolution",
         -1.0,
         var2 == null ? -1.0 : (double)(var2.method24492() - 1),
         1.0F,
         var2x -> {
            if (var2 != null) {
               Optional<Class8737> var5 = var1.method8030();
               return var5.map(var1xx -> (double)var2.method24487(var1xx)).orElse(-1.0);
            } else {
               return -1.0;
            }
         },
         (var2x, var3) -> {
            if (var2 != null) {
               if (var3 != -1.0) {
                  var1.method8031(Optional.<Class8737>of(var2.method24491(var3.intValue())));
               } else {
                  var1.method8031(Optional.<Class8737>empty());
               }
            }
         },
         (var1x, var2x) -> {
            if (var2 != null) {
               double var5 = var2x.method18090(var1x);
               return var5 != -1.0
                  ? var2x.method17955(new StringTextComponent(var2.method24491((int)var5).toString()))
                  : var2x.method17955(new TranslationTextComponent("options.fullscreen.current"));
            } else {
               return new TranslationTextComponent("options.fullscreen.unavailable");
            }
         }
      );
   }
}
