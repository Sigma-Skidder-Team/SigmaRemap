package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Map;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7714 implements class_2237 {
   public class_7714(class_5414 var1, class_3547 var2, class_291 var3, Map var4) {
      this.field_39127 = var1;
      this.field_39124 = var2;
      this.field_39123 = var3;
      this.field_39125 = var4;
   }

   @Override
   public void method_10290(class_7505<class_5850> var1, class_3275<class_5850> var2) {
      this.method_34903(var1, (var1x, var2x, var3, var4) -> {
         class_3547 var10002 = this.field_39127.field_27601;
         this.field_39127.field_27601.getClass();
         return new class_919(var10002, var1x, var2x, var3, var4);
      });
   }

   @Override
   public void method_10291(class_7505<class_1997> var1, class_3275<class_1997> var2) {
      this.method_34903(var1, (var1x, var2x, var3, var4) -> {
         class_3547 var10002 = this.field_39127.field_27601;
         this.field_39127.field_27601.getClass();
         return new class_1075(var10002, var1x, var2x, var3, var4);
      });
   }

   private <T extends class_9152<T>> void method_34903(class_7505<T> var1, class_403<T> var2) {
      TranslationTextComponent var5 = new TranslationTextComponent(var1.method_34214());
      IFormattableTextComponent var6 = new StringTextComponent(var1.method_34215()).mergeStyle(TextFormatting.YELLOW);
      class_9152 var7 = this.field_39123.<class_9152>method_1287(var1);
      String var8 = var7.method_42124();
      IFormattableTextComponent var9 = new TranslationTextComponent("editGamerule.default", new StringTextComponent(var8)).mergeStyle(TextFormatting.GRAY);
      String var10 = var1.method_34214() + ".description";
      ImmutableList var11;
      String var12;
      if (!class_6956.method_31804(var10)) {
         var11 = ImmutableList.of(var6.func_241878_f(), var9.func_241878_f());
         var12 = var9.getString();
      } else {
         Builder var13 = ImmutableList.builder().add(var6.func_241878_f());
         TranslationTextComponent var14 = new TranslationTextComponent(var10);
         this.field_39127.field_27601.field_948.method_45391(var14, 150).forEach(var13::add);
         var11 = var13.add(var9.func_241878_f()).build();
         var12 = var14.getString() + "\n" + var9.getString();
      }

      this.field_39125.computeIfAbsent(var1.method_34213(), var0 -> Maps.newHashMap()).put(var1, var2.method_2004(var5, var11, var12, (T)var7));
   }
}
