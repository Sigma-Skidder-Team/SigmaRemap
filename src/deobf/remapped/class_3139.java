package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_3139 {
   private final class_3139 field_15625;
   private final class_7750 field_15620;
   private final class_5123 field_15626;
   private final class_4639 field_15623;
   private final Map<String, class_7353> field_15627;
   private final String[][] field_15622;
   private final Set<class_3139> field_15619 = Sets.newLinkedHashSet();
   private final ITextComponent field_15621;

   public class_3139(class_4639 var1, class_3139 var2, class_7750 var3, class_5123 var4, Map<String, class_7353> var5, String[][] var6) {
      this.field_15623 = var1;
      this.field_15620 = var3;
      this.field_15627 = ImmutableMap.copyOf(var5);
      this.field_15625 = var2;
      this.field_15626 = var4;
      this.field_15622 = var6;
      if (var2 != null) {
         var2.method_14519(this);
      }

      if (var3 != null) {
         ITextComponent var9 = var3.method_35160();
         TextFormatting var10 = var3.method_35157().method_15386();
         IFormattableTextComponent var11 = TextComponentUtils.func_240648_a_(var9.deepCopy(), Style.EMPTY.setFormatting(var10))
            .appendString("\n")
            .append(var3.method_35167());
         IFormattableTextComponent var12 = var9.deepCopy().modifyStyle(var1x -> var1x.setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, var11)));
         this.field_15621 = TextComponentUtils.wrapWithSquareBrackets(var12).mergeStyle(var10);
      } else {
         this.field_15621 = new StringTextComponent(var1.toString());
      }
   }

   public class_3321 method_14514() {
      return new class_3321(
         this.field_15625 != null ? this.field_15625.method_14520() : null, this.field_15620, this.field_15626, this.field_15627, this.field_15622, null
      );
   }

   @Nullable
   public class_3139 method_14510() {
      return this.field_15625;
   }

   @Nullable
   public class_7750 method_14511() {
      return this.field_15620;
   }

   public class_5123 method_14517() {
      return this.field_15626;
   }

   @Override
   public String toString() {
      return "SimpleAdvancement{id="
         + this.method_14520()
         + ", parent="
         + (this.field_15625 != null ? this.field_15625.method_14520() : "null")
         + ", display="
         + this.field_15620
         + ", rewards="
         + this.field_15626
         + ", criteria="
         + this.field_15627
         + ", requirements="
         + Arrays.deepToString(this.field_15622)
         + '}';
   }

   public Iterable<class_3139> method_14516() {
      return this.field_15619;
   }

   public Map<String, class_7353> method_14518() {
      return this.field_15627;
   }

   public int method_14513() {
      return this.field_15622.length;
   }

   public void method_14519(class_3139 var1) {
      this.field_15619.add(var1);
   }

   public class_4639 method_14520() {
      return this.field_15623;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_3139) {
            class_3139 var4 = (class_3139)var1;
            return this.field_15623.equals(var4.field_15623);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_15623.hashCode();
   }

   public String[][] method_14515() {
      return this.field_15622;
   }

   public ITextComponent method_14512() {
      return this.field_15621;
   }
}
