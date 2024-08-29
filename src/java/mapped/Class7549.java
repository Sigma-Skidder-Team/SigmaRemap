package mapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class Class7549 extends Class7548 {
   @Override
   public String[] method24669(Class1197 var1, int var2) {
      if (var1 instanceof Class1213) {
         Class1213 var5 = (Class1213)var1;
         Class6679 var6 = var5.method5769();
         return this.method24672(var6, var2);
      } else {
         return null;
      }
   }

   private String[] method24672(Class6679 var1, int var2) {
      String var5 = var1.method20385();
      String var6 = Class7944.method26946(var1.method20368()).trim();
      String[] var7 = this.method24673(var6);
      GameSettings var8 = Class7944.method26928();
      String var9 = null;
      if (!var5.equals(var1.method20366()) && var8.field44588) {
         var9 = "§8" + Class8043.method27619("of.general.id") + ": " + var1.method20366();
      }

      String var10 = null;
      if (var1.method20377() != null && var8.field44588) {
         var10 = "§8" + Class8043.method27619("of.general.from") + ": " + Class7944.method26854(var1.method20377());
      }

      String var11 = null;
      if (var1.method20372() != null && var8.field44588) {
         String var12 = !var1.method20379() ? Class8043.method27619("of.general.ambiguous") : var1.method20361(var1.method20372());
         var11 = "§8" + Class8043.method27626() + ": " + var12;
      }

      ArrayList var13 = new ArrayList();
      var13.add(var5);
      var13.addAll(Arrays.asList(var7));
      if (var9 != null) {
         var13.add(var9);
      }

      if (var10 != null) {
         var13.add(var10);
      }

      if (var11 != null) {
         var13.add(var11);
      }

      return this.method24674(var2, var13);
   }

   private String[] method24673(String var1) {
      if (var1.length() <= 0) {
         return new String[0];
      } else {
         var1 = Class9402.method35762(var1, "//");
         String[] var4 = var1.split("\\. ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = "- " + var4[var5].trim();
            var4[var5] = Class9402.method35763(var4[var5], ".");
         }

         return var4;
      }
   }

   private String[] method24674(int var1, List<String> var2) {
      FontRenderer var5 = Class7944.method26860().fontRenderer;
      ArrayList<String> var6 = new ArrayList();

      for (int var7 = 0; var7 < var2.size(); var7++) {
         String var8 = (String)var2.get(var7);
         if (var8 != null && var8.length() > 0) {
            StringTextComponent var9 = new StringTextComponent(var8);

            for (ITextProperties var11 : var5.method38830().func_238362_b_(var9, var1, Style.EMPTY)) {
               var6.add(var11.getString());
            }
         }
      }

      return var6.toArray(new String[var6.size()]);
   }
}
