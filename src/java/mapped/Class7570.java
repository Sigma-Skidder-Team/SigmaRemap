package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Map;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7570 implements Class7567 {
   public final Class1127 field32506;
   public final Class5462 field32507;
   public final Map<Class2155, Map<Class9221<?>, Class1180>> field32508;
   public final Class1294 field32509;

   public Class7570(Class1294 var1, Class1127 var2, Class5462 var3, Map<Class2155, Map<Class9221<?>, Class1180>> var4) {
      this.field32509 = var1;
      this.field32506 = var2;
      this.field32507 = var3;
      this.field32508 = var4;
   }

   @Override
   public void method24777(Class9221<Class7466> var1, Class7989<Class7466> var2) {
      this.method24779(var1, (var1x, var2x, var3, var4) -> {
         Class1127 var10002 = this.field32509.field6858;
         this.field32509.field6858.getClass();
         return new Class1184(var10002, var1x, var2x, var3, var4);
      });
   }

   @Override
   public void method24778(Class9221<Class7464> var1, Class7989<Class7464> var2) {
      this.method24779(var1, (var1x, var2x, var3, var4) -> {
         Class1127 var10002 = this.field32509.field6858;
         this.field32509.field6858.getClass();
         return new Class1183(var10002, var1x, var2x, var3, var4);
      });
   }

   private <T extends Class7465<T>> void method24779(Class9221<T> var1, Class5987<T> var2) {
      TranslationTextComponent var5 = new TranslationTextComponent(var1.method34673());
      IFormattableTextComponent var6 = new StringTextComponent(var1.method34672()).mergeStyle(TextFormatting.YELLOW);
      Class7465 var7 = this.field32507.method17128(var1);
      String var8 = var7.method24156();
      IFormattableTextComponent var9 = new TranslationTextComponent("editGamerule.default", new StringTextComponent(var8)).mergeStyle(TextFormatting.GRAY);
      String var10 = var1.method34673() + ".description";
      ImmutableList var11;
      String var12;
      if (! I18n.method33884(var10)) {
         var11 = ImmutableList.of(var6.func_241878_f(), var9.func_241878_f());
         var12 = var9.getString();
      } else {
         Builder var13 = ImmutableList.builder().add(var6.func_241878_f());
         TranslationTextComponent var14 = new TranslationTextComponent(var10);
         this.field32509.field6858.field4568.method38828(var14, 150).forEach(var13::add);
         var11 = var13.add(var9.func_241878_f()).build();
         var12 = var14.getString() + "\n" + var9.getString();
      }

      this.field32508.computeIfAbsent(var1.method34674(), var0 -> Maps.newHashMap()).put(var1, var2.method18563(var5, var11, var12, (T)var7));
   }
}
