package mapped;

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

public class FontRenderer {
   private static String[] field45926;
   private static final Class7680 field45927 = new Class7680(0.0F, 0.0F, 0.03F);
   public final int field45928 = 9;
   public final Random field45929 = new Random();
   private final Function<ResourceLocation, Class1807> field45930;
   private final CharacterManager field45931;
   private boolean field45932 = false;
   private Class8069 field45933 = new Class8069();
   private Class2052 field45934 = new Class2053(4.0F);

   public FontRenderer(Function<ResourceLocation, Class1807> var1) {
      this.field45930 = var1;
      this.field45931 = new CharacterManager((var1x, var2) -> this.method38798(var2.getFontId()).method7922(var1x).method8699(var2.getBold()));
   }

   private Class1807 method38798(ResourceLocation var1) {
      return this.field45930.apply(var1);
   }

   public int drawStringWithShadow(MatrixStack var1, String var2, float var3, float var4, int var5) {
      return this.method38807(var2, var3, var4, var5, var1.method35296().method32361(), true, this.method38829());
   }

   public int method38800(MatrixStack var1, String var2, float var3, float var4, int var5, boolean var6) {
      RenderSystem.disableAlphaTest();
      return this.method38807(var2, var3, var4, var5, var1.method35296().method32361(), true, var6);
   }

   public int method38801(MatrixStack var1, String var2, float var3, float var4, int var5) {
      RenderSystem.disableAlphaTest();
      return this.method38807(var2, var3, var4, var5, var1.method35296().method32361(), false, this.method38829());
   }

   public int method38802(MatrixStack var1, Class9125 var2, float var3, float var4, int var5) {
      RenderSystem.disableAlphaTest();
      return this.method38809(var2, var3, var4, var5, var1.method35296().method32361(), true);
   }

   public int method38803(MatrixStack var1, ITextComponent var2, float var3, float var4, int var5) {
      RenderSystem.disableAlphaTest();
      return this.method38809(var2.func_241878_f(), var3, var4, var5, var1.method35296().method32361(), true);
   }

   public int method38804(MatrixStack var1, Class9125 var2, float var3, float var4, int var5) {
      RenderSystem.disableAlphaTest();
      return this.method38809(var2, var3, var4, var5, var1.method35296().method32361(), false);
   }

   public int method38805(MatrixStack var1, ITextComponent var2, float var3, float var4, int var5) {
      RenderSystem.disableAlphaTest();
      return this.method38809(var2.func_241878_f(), var3, var4, var5, var1.method35296().method32361(), false);
   }

   public String method38806(String var1) {
      try {
         Bidi var4 = new Bidi(new ArabicShaping(8).shape(var1), 127);
         var4.setReorderingMode(0);
         return var4.writeReordered(2);
      } catch (ArabicShapingException var5) {
         return var1;
      }
   }

   public int method38807(String var1, float var2, float var3, int var4, Class9367 var5, boolean var6, boolean var7) {
      if (var1 != null) {
         Class7735 var10 = Class7733.method25595(Tessellator.getInstance().getBuffer());
         int var11 = this.method38811(var1, var2, var3, var4, var6, var5, var10, false, 0, 15728880, var7);
         var10.method25602();
         return var11;
      } else {
         return 0;
      }
   }

   public void method38808(List<String> var1, Class9718[] var2, int var3, Class9367 var4, boolean var5, boolean var6) {
      Class7735 var9 = Class7733.method25595(Tessellator.getInstance().getBuffer());

      for (int var10 = 0; var10 < var1.size(); var10++) {
         String var11 = (String)var1.get(var10);
         if (var11 != null && !var11.isEmpty()) {
            Class9718 var12 = var2[var10];
            if (var12 != null) {
               float var13 = (float)var12.method38078();
               float var14 = (float)var12.method38079();
               this.method38811(var11, var13, var14, var3, var5, var4, var9, false, 0, 15728880, var6);
            }
         }
      }

      var9.method25602();
   }

   private int method38809(Class9125 var1, float var2, float var3, int var4, Class9367 var5, boolean var6) {
      Class7735 var9 = Class7733.method25595(Tessellator.getInstance().getBuffer());
      int var10 = this.method38813(var1, var2, var3, var4, var6, var5, var9, false, 0, 15728880);
      var9.method25602();
      return var10;
   }

   public int method38810(String var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10) {
      return this.method38811(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.method38829());
   }

   public int method38811(
      String var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10, boolean var11
   ) {
      return this.method38815(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public int method38812(
      ITextComponent var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10
   ) {
      return this.method38813(var1.func_241878_f(), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public int method38813(Class9125 var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10) {
      return this.method38816(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private static int method38814(int var0) {
      return var0 | 0xFF000000;
   }

   private int method38815(
      String var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10, boolean var11
   ) {
      if (var11) {
         var1 = this.method38806(var1);
      }

      var4 = method38814(var4);
      Class9367 var14 = var6.method35514();
      if (var5) {
         this.method38817(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var14.method35513(field45927);
      }

      var2 = this.method38817(var1, var2, var3, var4, false, var14, var7, var8, var9, var10);
      return (int)var2 + (!var5 ? 0 : 1);
   }

   private int method38816(Class9125 var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10) {
      var4 = method38814(var4);
      Class9367 var13 = var6.method35514();
      if (var5) {
         this.method38818(var1, var2, var3, var4, true, var6, var7, var8, var9, var10);
         var13.method35513(field45927);
      }

      var2 = this.method38818(var1, var2, var3, var4, false, var13, var7, var8, var9, var10);
      return (int)var2 + (!var5 ? 0 : 1);
   }

   private float method38817(String var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10) {
      Class2546 var13 = new Class2546(this, var7, var2, var3, var4, var5, var6, var8, var10);
      TextProcessing.func_238346_c_(var1, Style.EMPTY, var13);
      return var13.method10741(var9, var2);
   }

   private float method38818(Class9125 var1, float var2, float var3, int var4, boolean var5, Class9367 var6, Class7733 var7, boolean var8, int var9, int var10) {
      Class2546 var13 = new Class2546(this, var7, var2, var3, var4, var5, var6, var8, var10);
      var1.method34036(var13);
      return var13.method10741(var9, var2);
   }

   private void method38819(
      Class8978 var1,
      boolean var2,
      boolean var3,
      float var4,
      float var5,
      float var6,
      Class9367 var7,
      Class5422 var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      var1.method32940(var3, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var2) {
         var1.method32940(var3, var5 + var4, var6, var7, var8, var9, var10, var11, var12, var13);
      }
   }

   public int getStringWidth(String var1) {
      return MathHelper.method37773(this.field45931.func_238350_a_(var1));
   }

   public int method38821(ITextProperties var1) {
      return MathHelper.method37773(this.field45931.func_238356_a_(var1));
   }

   public int method38822(Class9125 var1) {
      return MathHelper.method37773(this.field45931.func_243238_a(var1));
   }

   public String method38823(String var1, int var2, boolean var3) {
      return !var3 ? this.field45931.func_238361_b_(var1, var2, Style.EMPTY) : this.field45931.func_238364_c_(var1, var2, Style.EMPTY);
   }

   public String method38824(String var1, int var2) {
      return this.field45931.func_238361_b_(var1, var2, Style.EMPTY);
   }

   public ITextProperties method38825(ITextProperties var1, int var2) {
      return this.field45931.func_238358_a_(var1, var2, Style.EMPTY);
   }

   public void method38826(ITextProperties var1, int var2, int var3, int var4, int var5) {
      Class9367 var8 = Class6979.method21542().method21548();

      for (Class9125 var10 : this.method38828(var1, var4)) {
         this.method38809(var10, (float)var2, (float)var3, var5, var8, false);
         var3 += 9;
      }
   }

   public int method38827(String var1, int var2) {
      return 9 * this.field45931.func_238365_g_(var1, var2, Style.EMPTY).size();
   }

   public List<Class9125> method38828(ITextProperties var1, int var2) {
      return LanguageMap.getInstance().func_244260_a(this.field45931.func_238362_b_(var1, var2, Style.EMPTY));
   }

   public boolean method38829() {
      return LanguageMap.getInstance().func_230505_b_();
   }

   public CharacterManager method38830() {
      return this.field45931;
   }

   // $VF: synthetic method
   public static void method38832(
      FontRenderer var0,
      Class8978 var1,
      boolean var2,
      boolean var3,
      float var4,
      float var5,
      float var6,
      Class9367 var7,
      Class5422 var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      var0.method38819(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   // $VF: synthetic method
   public static Class1807 method38833(FontRenderer var0, ResourceLocation var1) {
      return var0.method38798(var1);
   }
}
