package mapped;

import java.util.Optional;

import net.minecraft.client.settings.SliderPercentageOption;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class5810 extends SliderPercentageOption {
   public Class5810(MainWindow var1) {
      this(var1, var1.getMonitor());
   }

   private Class5810(MainWindow var1, Monitor var2) {
      super(
         "options.fullscreen.resolution",
         -1.0,
         var2 == null ? -1.0 : (double)(var2.method24492() - 1),
         1.0F,
         var2x -> {
            if (var2 != null) {
               Optional<VideoMode> var5 = var1.getVideoMode();
               return var5.map(var1xx -> (double)var2.method24487(var1xx)).orElse(-1.0);
            } else {
               return -1.0;
            }
         },
         (var2x, var3) -> {
            if (var2 != null) {
               if (var3 != -1.0) {
                  var1.setVideoMode(Optional.<VideoMode>of(var2.method24491(var3.intValue())));
               } else {
                  var1.setVideoMode(Optional.<VideoMode>empty());
               }
            }
         },
         (var1x, var2x) -> {
            if (var2 != null) {
               double var5 = var2x.get(var1x);
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
