package remapped;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.util.text.CharacterManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextProcessing;

public class TextRenderer {
   private static String[] field_49883;
   private static final class_2426 field_49884 = new class_2426(0.0F, 0.0F, 0.03F);
   public final int field_49880 = 9;
   public final Random field_49887 = new Random();
   private final Function<class_4639, class_6988> field_49886;
   private final CharacterManager field_49881;
   private boolean field_49888 = false;
   private class_3525 field_49885 = new class_3525();
   private class_5543 field_49882 = new class_1095(4.0F);

   public TextRenderer(Function<class_4639, class_6988> var1) {
      this.field_49886 = var1;
      this.field_49881 = new CharacterManager((var1x, var2) -> this.method_45393(var2.getFontId()).method_31974(var1x).method_25221(var2.getBold()));
   }

   private class_6988 method_45393(class_4639 var1) {
      return this.field_49886.apply(var1);
   }

   public int method_45390(class_7966 var1, String var2, float var3, float var4, int var5) {
      return this.method_45410(var2, var3, var4, var5, var1.method_36058().method_28620(), true, this.method_45383());
   }

   public int method_45380(class_7966 var1, String var2, float var3, float var4, int var5, boolean var6) {
      class_3542.method_16374();
      return this.method_45410(var2, var3, var4, var5, var1.method_36058().method_28620(), true, var6);
   }

   public int method_45385(class_7966 var1, String var2, float var3, float var4, int var5) {
      class_3542.method_16374();
      return this.method_45410(var2, var3, var4, var5, var1.method_36058().method_28620(), false, this.method_45383());
   }

   public int method_45402(class_7966 var1, class_7107 var2, float var3, float var4, int var5) {
      class_3542.method_16374();
      return this.method_45386(var2, var3, var4, var5, var1.method_36058().method_28620(), true);
   }

   public int method_45392(class_7966 var1, ITextComponent var2, float var3, float var4, int var5) {
      class_3542.method_16374();
      return this.method_45386(var2.func_241878_f(), var3, var4, var5, var1.method_36058().method_28620(), true);
   }

   public int method_45382(class_7966 var1, class_7107 var2, float var3, float var4, int var5) {
      class_3542.method_16374();
      return this.method_45386(var2, var3, var4, var5, var1.method_36058().method_28620(), false);
   }

   public int method_45378(class_7966 var1, ITextComponent var2, float var3, float var4, int var5) {
      class_3542.method_16374();
      return this.method_45386(var2.func_241878_f(), var3, var4, var5, var1.method_36058().method_28620(), false);
   }

   public String method_45403(String var1) {
      try {
         Bidi var4 = new Bidi(new ArabicShaping(8).shape(var1), 127);
         var4.setReorderingMode(0);
         return var4.writeReordered(2);
      } catch (ArabicShapingException var5) {
         return var1;
      }
   }

   public int method_45410(String var1, float var2, float var3, int var4, class_8107 var5, boolean var6, boolean var7) {
      if (var1 != null) {
         class_3758 var10 = class_2565.method_11648(class_8042.method_36499().method_36501());
         int var11 = this.method_45396(var1, var2, var3, var4, var6, var5, var10, false, 0, 15728880, var7);
         var10.method_17415();
         return var11;
      } else {
         return 0;
      }
   }

   public void method_45401(List<String> var1, class_9460[] var2, int var3, class_8107 var4, boolean var5, boolean var6) {
      class_3758 var9 = class_2565.method_11648(class_8042.method_36499().method_36501());

      for (int var10 = 0; var10 < var1.size(); var10++) {
         String var11 = (String)var1.get(var10);
         if (var11 != null && !var11.isEmpty()) {
            class_9460 var12 = var2[var10];
            if (var12 != null) {
               float var13 = (float)var12.method_43732();
               float var14 = (float)var12.method_43731();
               this.method_45396(var11, var13, var14, var3, var5, var4, var9, false, 0, 15728880, var6);
            }
         }
      }

      var9.method_17415();
   }

   private int method_45386(class_7107 var1, float var2, float var3, int var4, class_8107 var5, boolean var6) {
      class_3758 var9 = class_2565.method_11648(class_8042.method_36499().method_36501());
      int var10 = this.method_45376(var1, var2, var3, var4, var6, var5, var9, false, 0, 15728880);
      var9.method_17415();
      return var10;
   }

   public int method_45411(String var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10) {
      return this.method_45396(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.method_45383());
   }

   public int method_45396(
      String var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10, boolean var11
   ) {
      return this.method_45409(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public int method_45405(
      ITextComponent var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10
   ) {
      return this.method_45376(var1.func_241878_f(), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public int method_45376(class_7107 var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10) {
      return this.method_45408(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private static int method_45404(int var0) {
      return var0 | 0xFF000000;
   }

   private int method_45409(
      String var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10, boolean var11
   ) {
      if (var11) {
         var1 = this.method_45403(var1);
      }

      var4 = method_45404(var4);
      class_8107 var14 = var6.method_36824();
      if (var5) {
         this.method_45397(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var14.method_36808(field_49884);
      }

      var2 = this.method_45397(var1, var2, var3, var4, false, var14, var7, var8, var9, var10);
      return (int)var2 + (!var5 ? 0 : 1);
   }

   private int method_45408(
      class_7107 var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10
   ) {
      var4 = method_45404(var4);
      class_8107 var13 = var6.method_36824();
      if (var5) {
         this.method_45377(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var13.method_36808(field_49884);
      }

      var2 = this.method_45377(var1, var2, var3, var4, false, var13, var7, var8, var9, var10);
      return (int)var2 + (!var5 ? 0 : 1);
   }

   private float method_45397(String var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10) {
      class_3762 var13 = new class_3762(this, var7, var2, var3, var4, var5, var6, var8, var10);
      TextProcessing.func_238346_c_(var1, Style.EMPTY, var13);
      return var13.method_17432(var9, var2);
   }

   private float method_45377(
      class_7107 var1, float var2, float var3, int var4, boolean var5, class_8107 var6, class_2565 var7, boolean var8, int var9, int var10
   ) {
      class_3762 var13 = new class_3762(this, var7, var2, var3, var4, var5, var6, var8, var10);
      var1.method_32665(var13);
      return var13.method_17432(var9, var2);
   }

   private void method_45389(
      class_6938 var1,
      boolean var2,
      boolean var3,
      float var4,
      float var5,
      float var6,
      class_8107 var7,
      class_7907 var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      var1.method_31742(var3, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var2) {
         var1.method_31742(var3, var5 + var4, var6, var7, var8, var9, var10, var11, var12, var13);
      }
   }

   public int method_45395(String var1) {
      return class_9299.method_42816(this.field_49881.func_238350_a_(var1));
   }

   public int method_45379(ITextProperties var1) {
      return class_9299.method_42816(this.field_49881.func_238356_a_(var1));
   }

   public int method_45400(class_7107 var1) {
      return class_9299.method_42816(this.field_49881.func_243238_a(var1));
   }

   public String method_45384(String var1, int var2, boolean var3) {
      return !var3 ? this.field_49881.func_238361_b_(var1, var2, Style.EMPTY) : this.field_49881.func_238364_c_(var1, var2, Style.EMPTY);
   }

   public String method_45394(String var1, int var2) {
      return this.field_49881.func_238361_b_(var1, var2, Style.EMPTY);
   }

   public ITextProperties method_45399(ITextProperties var1, int var2) {
      return this.field_49881.func_238358_a_(var1, var2, Style.EMPTY);
   }

   public void method_45407(ITextProperties var1, int var2, int var3, int var4, int var5) {
      class_8107 var8 = class_1221.method_5406().method_5410();

      for (class_7107 var10 : this.method_45391(var1, var4)) {
         this.method_45386(var10, (float)var2, (float)var3, var5, var8, false);
         var3 += 9;
      }
   }

   public int method_45387(String var1, int var2) {
      return 9 * this.field_49881.func_238365_g_(var1, var2, Style.EMPTY).size();
   }

   public List<class_7107> method_45391(ITextProperties var1, int var2) {
      return LanguageMap.getInstance().func_244260_a(this.field_49881.func_238362_b_(var1, var2, Style.EMPTY));
   }

   public boolean method_45383() {
      return LanguageMap.getInstance().func_230505_b_();
   }

   public CharacterManager method_45381() {
      return this.field_49881;
   }
}
