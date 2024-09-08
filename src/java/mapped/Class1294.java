package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Class1294 extends Class1293<Class1180> {
   public final Class1127 field6858;

   public Class1294(Class1127 var1, Class5462 var2) {
      super(var1.mc, var1.width, var1.height, 43, var1.height - 32, 24);
      this.field6858 = var1;
      Map<Class2155, Map<Class9221<?>, Class1180>> var5 = Maps.newHashMap();
      Class5462.method17131(new Class7570(this, var1, var2, var5));
      var5.entrySet()
         .stream()
         .sorted(Entry.comparingByKey())
         .forEach(
            var1x -> {
                this.field6858.getClass();
               this.method6030(
                  new Class1181(
                          this.field6858,
                     new TranslationTextComponent(var1x.getKey().method8875())
                        .mergeStyle(TextFormatting.BOLD, TextFormatting.YELLOW)
                  )
               );
               var1x.getValue()
                  .entrySet()
                  .stream()
                  .sorted(Entry.comparingByKey(Comparator.comparing(Class9221::method34672)))
                  .forEach(var1xx -> this.method6030(var1xx.getValue()));
            }
         );
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      if (this.isMouseOver(var2, var3)) {
         Class1180 var7 = this.method6033(var2, var3);
         if (var7 != null) {
            Class1127.method5427(this.field6858, Class1180.method5611(var7));
         }
      }
   }
}
