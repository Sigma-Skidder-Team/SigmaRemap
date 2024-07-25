package remapped;

import java.util.Random;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class class_726 {
   private static final class_4639 field_3946 = new class_4639("minecraft", "alt");
   private static final Style field_3944 = Style.EMPTY.setFontId(field_3946);
   private static final class_726 field_3945 = new class_726();
   private final Random field_3947 = new Random();
   private final String[] field_3943 = new String[]{
      "the",
      "elder",
      "scrolls",
      "klaatu",
      "berata",
      "niktu",
      "xyzzy",
      "bless",
      "curse",
      "light",
      "darkness",
      "fire",
      "air",
      "earth",
      "water",
      "hot",
      "dry",
      "cold",
      "wet",
      "ignite",
      "snuff",
      "embiggen",
      "twist",
      "shorten",
      "stretch",
      "fiddle",
      "destroy",
      "imbue",
      "galvanize",
      "enchant",
      "free",
      "limited",
      "range",
      "of",
      "towards",
      "inside",
      "sphere",
      "cube",
      "self",
      "other",
      "ball",
      "mental",
      "physical",
      "grow",
      "shrink",
      "demon",
      "elemental",
      "spirit",
      "animal",
      "creature",
      "beast",
      "humanoid",
      "undead",
      "fresh",
      "stale",
      "phnglui",
      "mglwnafh",
      "cthulhu",
      "rlyeh",
      "wgahnagl",
      "fhtagn",
      "baguette"
   };

   private class_726() {
   }

   public static class_726 method_3294() {
      return field_3945;
   }

   public ITextProperties method_3295(class_9854 var1, int var2) {
      StringBuilder var5 = new StringBuilder();
      int var6 = this.field_3947.nextInt(2) + 3;

      for (int var7 = 0; var7 < var6; var7++) {
         if (var7 != 0) {
            var5.append(" ");
         }

         var5.append(class_9665.<String>method_44697(this.field_3943, this.field_3947));
      }

      return var1.method_45381().func_238358_a_(new StringTextComponent(var5.toString()).mergeStyle(field_3944), var2, Style.EMPTY);
   }

   public void method_3293(long var1) {
      this.field_3947.setSeed(var1);
   }
}
