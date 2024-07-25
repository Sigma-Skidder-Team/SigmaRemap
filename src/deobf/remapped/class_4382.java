package remapped;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_4382 {
   private final class_6943[] field_21497;
   private final class_5855 field_21495;
   public final class_8718 field_21496;
   public String field_21498;

   @Nullable
   public static class_4382 method_20431(int var0) {
      return class_8669.field_44445.method_14040(var0);
   }

   public class_4382(class_5855 var1, class_8718 var2, class_6943[] var3) {
      this.field_21495 = var1;
      this.field_21496 = var2;
      this.field_21497 = var3;
   }

   public Map<class_6943, class_6098> method_20420(class_5834 var1) {
      EnumMap var4 = Maps.newEnumMap(class_6943.class);

      for (class_6943 var8 : this.field_21497) {
         class_6098 var9 = var1.method_26520(var8);
         if (!var9.method_28022()) {
            var4.put(var8, var9);
         }
      }

      return var4;
   }

   public class_5855 method_20432() {
      return this.field_21495;
   }

   public int method_20425() {
      return 1;
   }

   public int method_20417() {
      return 1;
   }

   public int method_20433(int var1) {
      return 1 + var1 * 10;
   }

   public int method_20437(int var1) {
      return this.method_20433(var1) + 5;
   }

   public int method_20438(int var1, class_6199 var2) {
      return 0;
   }

   public float method_20419(int var1, class_2780 var2) {
      return 0.0F;
   }

   public final boolean method_20422(class_4382 var1) {
      return this.method_20426(var1) && var1.method_20426(this);
   }

   public boolean method_20426(class_4382 var1) {
      return this != var1;
   }

   public String method_20424() {
      if (this.field_21498 == null) {
         this.field_21498 = class_9665.method_44671("enchantment", class_8669.field_44445.method_39797(this));
      }

      return this.field_21498;
   }

   public String method_20418() {
      return this.method_20424();
   }

   public ITextComponent method_20423(int var1) {
      TranslationTextComponent var4 = new TranslationTextComponent(this.method_20418());
      if (!this.method_20435()) {
         var4.mergeStyle(TextFormatting.GRAY);
      } else {
         var4.mergeStyle(TextFormatting.RED);
      }

      if (var1 != 1 || this.method_20417() != 1) {
         var4.appendString(" ").append(new TranslationTextComponent("enchantment.level." + var1));
      }

      return var4;
   }

   public boolean method_20430(class_6098 var1) {
      return this.field_21496.method_40057(var1.method_27960());
   }

   public void method_20421(class_5834 var1, class_8145 var2, int var3) {
   }

   public void method_20427(class_5834 var1, class_8145 var2, int var3) {
   }

   public boolean method_20429() {
      return false;
   }

   public boolean method_20435() {
      return false;
   }

   public boolean method_20436() {
      return true;
   }

   public boolean method_20434() {
      return true;
   }
}
