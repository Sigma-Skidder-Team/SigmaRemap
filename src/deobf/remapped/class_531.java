package remapped;

import java.util.Optional;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_531 {
   field_3234(new TranslationTextComponent("gameMode.creative"), "/gamemode creative", new class_6098(class_4783.field_23259)),
   field_3227(new TranslationTextComponent("gameMode.survival"), "/gamemode survival", new class_6098(class_4897.field_25277)),
   field_3229(new TranslationTextComponent("gameMode.adventure"), "/gamemode adventure", new class_6098(class_4897.field_25113)),
   field_3233(new TranslationTextComponent("gameMode.spectator"), "/gamemode spectator", new class_6098(class_4897.field_24519));

   public static final class_531[] field_3230 = values();
   public final ITextComponent field_3231;
   public final String field_3235;
   public final class_6098 field_3232;

   private class_531(ITextComponent var3, String var4, class_6098 var5) {
      this.field_3231 = var3;
      this.field_3235 = var4;
      this.field_3232 = var5;
   }

   private void method_2579(class_8765 var1, int var2, int var3) {
      var1.method_40274(this.field_3232, var2, var3);
   }

   private ITextComponent method_2583() {
      return this.field_3231;
   }

   private String method_2588() {
      return this.field_3235;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Optional<class_531> method_2585() {
      switch (this) {
         case field_3234:
            return Optional.<class_531>of(field_3227);
         case field_3227:
            return Optional.<class_531>of(field_3229);
         case field_3229:
            return Optional.<class_531>of(field_3233);
         default:
            return Optional.<class_531>of(field_3234);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static Optional<class_531> method_2584(class_4666 var0) {
      switch (var0) {
         case field_22756:
            return Optional.<class_531>of(field_3233);
         case field_22764:
            return Optional.<class_531>of(field_3227);
         case field_22761:
            return Optional.<class_531>of(field_3234);
         case field_22760:
            return Optional.<class_531>of(field_3229);
         default:
            return Optional.<class_531>empty();
      }
   }
}
