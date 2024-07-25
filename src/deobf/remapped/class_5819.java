package remapped;

import java.util.Optional;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5819 extends class_8369 {
   public class_5819(MainWindow var1) {
      this(var1, var1.method_43192());
   }

   private class_5819(MainWindow var1, Monitor var2) {
      super(
         "options.fullscreen.resolution",
         -1.0,
         var2 == null ? -1.0 : (double)(var2.method_9701() - 1),
         1.0F,
         var2x -> {
            if (var2 != null) {
               Optional var5 = var1.getVideoMode();
               return var5.<Double>map(var1xx -> (double)var2.method_9704(var1xx)).orElse(-1.0);
            } else {
               return -1.0;
            }
         },
         (var2x, var3) -> {
            if (var2 != null) {
               if (var3 != -1.0) {
                  var1.setVideoMode(Optional.<VideoMode>of(var2.method_9695(var3.intValue())));
               } else {
                  var1.setVideoMode(Optional.<VideoMode>empty());
               }
            }
         },
         (var1x, var2x) -> {
            if (var2 != null) {
               double var5 = var2x.method_38570(var1x);
               return var5 != -1.0
                  ? var2x.method_4492(new StringTextComponent(var2.method_9695((int)var5).toString()))
                  : var2x.method_4492(new TranslationTextComponent("options.fullscreen.current"));
            } else {
               return new TranslationTextComponent("options.fullscreen.unavailable");
            }
         }
      );
   }
}
