package remapped;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7738 extends class_2451 {
   private static final Map<class_8461, class_7738> field_39237 = Maps.newHashMap();
   private final int field_39238;
   private final class_8461 field_39239;

   public class_7738(int var1, class_8461 var2, class_317 var3) {
      super(var3);
      this.field_39238 = var1;
      this.field_39239 = var2;
      field_39237.put(this.field_39239, this);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      class_6486 var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (var6.method_8350(class_4783.field_23312) && !var6.<Boolean>method_10313(class_3995.field_19411)) {
         class_6098 var7 = var1.method_21867();
         if (!var4.field_33055) {
            ((class_3995)class_4783.field_23312).method_18419(var4, var5, var6, var7);
            var4.method_43365((class_704)null, 1010, var5, class_2451.method_11244(this));
            var7.method_27970(1);
            class_704 var8 = var1.method_21868();
            if (var8 != null) {
               var8.method_3209(class_6234.field_31864);
            }
         }

         return class_6910.method_31659(var4.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   public int method_35030() {
      return this.field_39238;
   }

   @Override
   public void method_11218(class_6098 var1, class_6486 var2, List<ITextComponent> var3, class_4605 var4) {
      var3.add(this.method_35029().mergeStyle(TextFormatting.GRAY));
   }

   public IFormattableTextComponent method_35029() {
      return new TranslationTextComponent(this.method_11216() + ".desc");
   }

   @Nullable
   public static class_7738 method_35031(class_8461 var0) {
      return field_39237.get(var0);
   }

   public class_8461 method_35032() {
      return this.field_39239;
   }
}
