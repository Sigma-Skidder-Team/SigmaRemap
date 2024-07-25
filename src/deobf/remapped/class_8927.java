package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class class_8927 extends class_3403 {
   @Override
   public String[] 郝뫤竬鼒좯蛊(class_7114 var1, int var2) {
      if (var1 instanceof class_1188) {
         class_1188 var5 = (class_1188)var1;
         class_6843 var6 = var5.method_5243();
         return this.method_41032(var6, var2);
      } else {
         return null;
      }
   }

   private String[] method_41032(class_6843 var1, int var2) {
      String var5 = var1.method_31378();
      String var6 = class_3111.method_14305(var1.method_31392()).trim();
      String[] var7 = this.method_41033(var6);
      class_8881 var8 = class_3111.method_14310();
      String var9 = null;
      if (!var5.equals(var1.method_31405()) && var8.field_45482) {
         var9 = "§8" + class_3458.method_15912("of.general.id") + ": " + var1.method_31405();
      }

      String var10 = null;
      if (var1.method_31402() != null && var8.field_45482) {
         var10 = "§8" + class_3458.method_15912("of.general.from") + ": " + class_3111.method_14289(var1.method_31402());
      }

      String var11 = null;
      if (var1.method_31382() != null && var8.field_45482) {
         String var12 = !var1.method_31389() ? class_3458.method_15912("of.general.ambiguous") : var1.method_31395(var1.method_31382());
         var11 = "§8" + class_3458.method_15911() + ": " + var12;
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

      return this.method_41031(var2, var13);
   }

   private String[] method_41033(String var1) {
      if (var1.length() <= 0) {
         return new String[0];
      } else {
         var1 = class_8251.method_37832(var1, "//");
         String[] var4 = var1.split("\\. ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = "- " + var4[var5].trim();
            var4[var5] = class_8251.method_37822(var4[var5], ".");
         }

         return var4;
      }
   }

   private String[] method_41031(int var1, List<String> var2) {
      class_9854 var5 = class_3111.method_14327().field_9668;
      ArrayList var6 = new ArrayList();

      for (int var7 = 0; var7 < var2.size(); var7++) {
         String var8 = (String)var2.get(var7);
         if (var8 != null && var8.length() > 0) {
            StringTextComponent var9 = new StringTextComponent(var8);

            for (ITextProperties var11 : var5.method_45381().func_238362_b_(var9, var1, Style.EMPTY)) {
               var6.add(var11.getString());
            }
         }
      }

      return var6.<String>toArray(new String[var6.size()]);
   }
}
