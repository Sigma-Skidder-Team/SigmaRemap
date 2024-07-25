package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;

public class class_2610 implements class_6310<class_392> {
   private static String[] field_12890;
   private int field_12892;
   private Suggestions field_12891;

   public class_2610() {
   }

   public class_2610(int var1, Suggestions var2) {
      this.field_12892 = var1;
      this.field_12891 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_12892 = var1.method_37778();
      int var4 = var1.method_37778();
      int var5 = var1.method_37778();
      StringRange var6 = StringRange.between(var4, var4 + var5);
      int var7 = var1.method_37778();
      ArrayList var8 = Lists.newArrayListWithCapacity(var7);

      for (int var9 = 0; var9 < var7; var9++) {
         String var10 = var1.method_37784(32767);
         ITextComponent var11 = !var1.readBoolean() ? null : var1.method_37776();
         var8.add(new Suggestion(var6, var10, var11));
      }

      this.field_12891 = new Suggestions(var6, var8);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_12892);
      var1.method_37743(this.field_12891.getRange().getStart());
      var1.method_37743(this.field_12891.getRange().getLength());
      var1.method_37743(this.field_12891.getList().size());

      for (Suggestion var5 : this.field_12891.getList()) {
         var1.method_37760(var5.getText());
         var1.writeBoolean(var5.getTooltip() != null);
         if (var5.getTooltip() != null) {
            var1.method_37779(TextComponentUtils.toTextComponent(var5.getTooltip()));
         }
      }
   }

   public void method_11844(class_392 var1) {
      var1.method_1953(this);
   }

   public int method_11845() {
      return this.field_12892;
   }

   public Suggestions method_11842() {
      return this.field_12891;
   }
}
