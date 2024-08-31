package mapped;

import java.util.Random;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class Class6577 {
   private static final ResourceLocation field28955 = new ResourceLocation("minecraft", "alt");
   private static final Style field28956 = Style.EMPTY.setFontId(field28955);
   private static final Class6577 field28957 = new Class6577();
   private final Random field28958 = new Random();
   private final String[] field28959 = new String[]{
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

   private Class6577() {
   }

   public static Class6577 method19915() {
      return field28957;
   }

   public ITextProperties method19916(FontRenderer var1, int var2) {
      StringBuilder var5 = new StringBuilder();
      int var6 = this.field28958.nextInt(2) + 3;

      for (int var7 = 0; var7 < var6; var7++) {
         if (var7 != 0) {
            var5.append(" ");
         }

         var5.append(Util.<String>method38518(this.field28959, this.field28958));
      }

      return var1.method38830().func_238358_a_(new StringTextComponent(var5.toString()).mergeStyle(field28956), var2, Style.EMPTY);
   }

   public void method19917(long var1) {
      this.field28958.setSeed(var1);
   }
}
