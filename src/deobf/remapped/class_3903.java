package remapped;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_3903 extends class_5086 {
   private final class_1097 field_18971;
   private final String field_18968;
   private final Set<String> field_18973 = Sets.newHashSet();
   private ITextComponent field_18974;
   private ITextComponent field_18970 = StringTextComponent.EMPTY;
   private ITextComponent field_18972 = StringTextComponent.EMPTY;
   private boolean field_18975 = true;
   private boolean field_18980 = true;
   private class_1014 field_18981 = class_1014.field_5325;
   private class_1014 field_18969 = class_1014.field_5325;
   private TextFormatting field_18978 = TextFormatting.RESET;
   private class_5006 field_18979 = class_5006.field_25901;
   private final Style field_18976;

   public class_3903(class_1097 var1, String var2) {
      this.field_18971 = var1;
      this.field_18968 = var2;
      this.field_18974 = new StringTextComponent(var2);
      this.field_18976 = Style.EMPTY.setInsertion(var2).setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new StringTextComponent(var2)));
   }

   @Override
   public String method_23383() {
      return this.field_18968;
   }

   public ITextComponent method_18066() {
      return this.field_18974;
   }

   public IFormattableTextComponent method_18069() {
      IFormattableTextComponent var3 = TextComponentUtils.wrapWithSquareBrackets(this.field_18974.deepCopy().mergeStyle(this.field_18976));
      TextFormatting var4 = this.method_23381();
      if (var4 != TextFormatting.RESET) {
         var3.mergeStyle(var4);
      }

      return var3;
   }

   public void method_18059(ITextComponent var1) {
      if (var1 != null) {
         this.field_18974 = var1;
         this.field_18971.method_4862(this);
      } else {
         throw new IllegalArgumentException("Name cannot be null");
      }
   }

   public void method_18064(ITextComponent var1) {
      this.field_18970 = var1 != null ? var1 : StringTextComponent.EMPTY;
      this.field_18971.method_4862(this);
   }

   public ITextComponent method_18058() {
      return this.field_18970;
   }

   public void method_18068(ITextComponent var1) {
      this.field_18972 = var1 != null ? var1 : StringTextComponent.EMPTY;
      this.field_18971.method_4862(this);
   }

   public ITextComponent method_18065() {
      return this.field_18972;
   }

   @Override
   public Collection<String> method_23378() {
      return this.field_18973;
   }

   @Override
   public IFormattableTextComponent method_23380(ITextComponent var1) {
      IFormattableTextComponent var4 = new StringTextComponent("").append(this.field_18970).append(var1).append(this.field_18972);
      TextFormatting var5 = this.method_23381();
      if (var5 != TextFormatting.RESET) {
         var4.mergeStyle(var5);
      }

      return var4;
   }

   public static IFormattableTextComponent method_18063(class_5086 var0, ITextComponent var1) {
      return var0 != null ? var0.method_23380(var1) : var1.deepCopy();
   }

   @Override
   public boolean method_23376() {
      return this.field_18975;
   }

   public void method_18062(boolean var1) {
      this.field_18975 = var1;
      this.field_18971.method_4862(this);
   }

   @Override
   public boolean method_23377() {
      return this.field_18980;
   }

   public void method_18070(boolean var1) {
      this.field_18980 = var1;
      this.field_18971.method_4862(this);
   }

   @Override
   public class_1014 method_23379() {
      return this.field_18981;
   }

   @Override
   public class_1014 method_23374() {
      return this.field_18969;
   }

   public void method_18061(class_1014 var1) {
      this.field_18981 = var1;
      this.field_18971.method_4862(this);
   }

   public void method_18057(class_1014 var1) {
      this.field_18969 = var1;
      this.field_18971.method_4862(this);
   }

   @Override
   public class_5006 method_23382() {
      return this.field_18979;
   }

   public void method_18071(class_5006 var1) {
      this.field_18979 = var1;
      this.field_18971.method_4862(this);
   }

   public int method_18067() {
      byte var3 = 0;
      if (this.method_23376()) {
         var3 |= 1;
      }

      if (this.method_23377()) {
         var3 |= 2;
      }

      return var3;
   }

   public void method_18072(int var1) {
      int var2 = 2146857813;
      class_3903 var10000 = this;

      do {
         if ((var2 & 262144) != 0) {
            var10000.method_18062(false);
            var10000 = this;
         }
      } while ((var2 & 262144) == 0);

      var10000.method_18070(false);
   }

   public void method_18060(TextFormatting var1) {
      this.field_18978 = var1;
      this.field_18971.method_4862(this);
   }

   @Override
   public TextFormatting method_23381() {
      return this.field_18978;
   }
}
