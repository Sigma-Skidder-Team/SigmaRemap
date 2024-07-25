package remapped;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5414 extends class_4855<class_3268> {
   private static String[] field_27600;

   public class_5414(class_3547 var1, GameRules var2) {
      super(var1.field_943, var1.field_941, var1.field_940, 43, var1.field_940 - 32, 24);
      this.field_27601 = var1;
      HashMap var5 = Maps.newHashMap();
      GameRules.method_1289(new class_7714(this, var1, var2, var5));
      var5.entrySet()
         .stream()
         .sorted(Entry.comparingByKey())
         .forEach(
            var1x -> {
               class_3547 var10003 = this.field_27601;
               this.field_27601.getClass();
               this.method_36202(
                  new class_2154(
                     var10003,
                     new TranslationTextComponent(((class_8094)var1x.getKey()).method_36744())
                        .mergeStyle(new TextFormatting[]{TextFormatting.BOLD, TextFormatting.YELLOW})
                  )
               );
               ((Map)var1x.getValue())
                  .entrySet()
                  .stream()
                  .sorted(Entry.comparingByKey(Comparator.comparing(class_7505::method_34215)))
                  .forEach(var1xx -> this.method_36202((class_4686)var1xx.getValue()));
            }
         );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      if (this.method_26937((double)var2, (double)var3)) {
         class_3268 var7 = this.method_36193((double)var2, (double)var3);
         if (var7 != null) {
            class_3547.method_16506(this.field_27601, class_3268.method_14894(var7));
         }
      }
   }
}
