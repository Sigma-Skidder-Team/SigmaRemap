package net.minecraft.world.biome;

import mapped.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class BiomeMaker {

   private static int getSkyColorWithTemperatureModifier(float var0) {
      float var3 = var0 / 3.0F;
      var3 = MathHelper.clamp(var3, -1.0F, 1.0F);
      return MathHelper.method37818(0.62222224F - var3 * 0.05F, 0.5F + var3 * 0.1F, 1.0F);
   }

   public static Biome makeGiantTaigaBiome(float var0, float var1, float var2, boolean var3) {
      Class9328 var6 = new Class9328();
      Class8468.method29838(var6);
      var6.method35249(Class179.field624, new Class6692(EntityType.field41105, 8, 4, 4));
      var6.method35249(Class179.field624, new Class6692(EntityType.RABBIT, 4, 2, 3));
      var6.method35249(Class179.field624, new Class6692(EntityType.FOX, 8, 2, 4));
      if (!var3) {
         Class8468.method29839(var6);
         Class8468.method29846(var6, 100, 25, 100);
      } else {
         Class8468.method29840(var6);
      }

      Class7935 var7 = new Class7935().method26688(Class9109.field41849);
      Class8468.method29771(var7);
      var7.method26693(Class9438.field43858);
      Class8468.method29773(var7);
      Class8468.method29775(var7);
      Class8468.method29777(var7);
      Class8468.method29785(var7);
      Class8468.method29786(var7);
      Class8468.method29778(var7);
      Class8468.method29779(var7);
      Class8468.method29783(var7);
      var7.method26690(Class1993.field13006, !var3 ? Class9104.field41821 : Class9104.field41820);
      Class8468.method29816(var7);
      Class8468.method29815(var7);
      Class8468.method29821(var7);
      Class8468.method29822(var7);
      Class8468.method29832(var7);
      Class8468.method29788(var7);
      Class8468.method29835(var7);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field275)
         .method37913(var0)
         .method37914(var1)
         .method37915(var2)
         .method37916(0.8F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var6.method35253())
         .method37919(var7.method26695())
         .method37921();
   }

   public static Biome method36063(float var0, float var1, boolean var2) {
      Class9328 var5 = new Class9328();
      Class8468.method29838(var5);
      Class8468.method29840(var5);
      Class7935 var6 = new Class7935().method26688(Class9109.field41850);
      Class8468.method29771(var6);
      var6.method26693(Class9438.field43858);
      Class8468.method29773(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      Class8468.method29809(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      if (!var2) {
         Class8468.method29793(var6);
      } else {
         Class8468.method29795(var6);
      }

      Class8468.method29816(var6);
      Class8468.method29810(var6);
      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      Class8468.method29835(var6);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field284)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.6F)
         .method37916(0.6F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.6F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var5.method35253())
         .method37919(var6.method26695())
         .method37921();
   }

   public static Biome method36064() {
      return method36071(0.1F, 0.2F, 40, 2, 3);
   }

   public static Biome method36065() {
      Class9328 var2 = new Class9328();
      Class8468.method29848(var2);
      return method36073(0.1F, 0.2F, 0.8F, false, true, false, var2);
   }

   public static Biome method36066() {
      Class9328 var2 = new Class9328();
      Class8468.method29848(var2);
      return method36073(0.2F, 0.4F, 0.8F, false, true, true, var2);
   }

   public static Biome method36067() {
      Class9328 var2 = new Class9328();
      Class8468.method29848(var2);
      var2.method35249(Class179.field624, new Class6692(EntityType.field41062, 10, 1, 1))
         .method35249(Class179.field623, new Class6692(EntityType.field41059, 2, 1, 1));
      return method36073(0.2F, 0.4F, 0.9F, false, false, true, var2);
   }

   public static Biome method36068() {
      return method36071(0.45F, 0.3F, 10, 1, 1);
   }

   public static Biome method36069() {
      return method36072(0.1F, 0.2F, 40, 2);
   }

   public static Biome method36070() {
      return method36072(0.45F, 0.3F, 10, 1);
   }

   private static Biome method36071(float var0, float var1, int var2, int var3, int var4) {
      Class9328 var7 = new Class9328();
      Class8468.method29848(var7);
      var7.method35249(Class179.field624, new Class6692(EntityType.field41062, var2, 1, var3))
         .method35249(Class179.field623, new Class6692(EntityType.field41059, 2, 1, var4))
         .method35249(Class179.field624, new Class6692(EntityType.field41061, 1, 1, 2));
      var7.method35252();
      return method36073(var0, var1, 0.9F, false, false, false, var7);
   }

   private static Biome method36072(float var0, float var1, int var2, int var3) {
      Class9328 var6 = new Class9328();
      Class8468.method29848(var6);
      var6.method35249(Class179.field624, new Class6692(EntityType.field41062, var2, 1, var3))
         .method35249(Class179.field624, new Class6692(EntityType.field41061, 80, 1, 2))
         .method35249(Class179.field623, new Class6692(EntityType.field41059, 2, 1, 1));
      return method36073(var0, var1, 0.9F, true, false, false, var6);
   }

   private static Biome method36073(float var0, float var1, float var2, boolean var3, boolean var4, boolean var5, Class9328 var6) {
      Class7935 var9 = new Class7935().method26688(Class9109.field41850);
      if (!var4 && !var5) {
         var9.method26693(Class9438.field43838);
      }

      Class8468.method29771(var9);
      var9.method26693(Class9438.field43860);
      Class8468.method29773(var9);
      Class8468.method29775(var9);
      Class8468.method29777(var9);
      Class8468.method29778(var9);
      Class8468.method29779(var9);
      Class8468.method29783(var9);
      if (!var3) {
         if (!var4 && !var5) {
            Class8468.method29789(var9);
         }

         if (!var4) {
            Class8468.method29800(var9);
         } else {
            Class8468.method29801(var9);
         }
      } else {
         Class8468.method29790(var9);
      }

      Class8468.method29817(var9);
      Class8468.method29804(var9);
      Class8468.method29821(var9);
      Class8468.method29822(var9);
      Class8468.method29832(var9);
      Class8468.method29824(var9);
      Class8468.method29835(var9);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field277)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.95F)
         .method37916(var2)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.95F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var6.method35253())
         .method37919(var9.method26695())
         .method37921();
   }

   public static Biome method36074(float var0, float var1, Class9319<Class8278> var2, boolean var3) {
      Class9328 var6 = new Class9328();
      Class8468.method29838(var6);
      var6.method35249(Class179.field624, new Class6692(EntityType.field41047, 5, 4, 6));
      Class8468.method29840(var6);
      Class7935 var7 = new Class7935().method26688(var2);
      Class8468.method29771(var7);
      var7.method26693(Class9438.field43862);
      Class8468.method29773(var7);
      Class8468.method29775(var7);
      Class8468.method29777(var7);
      Class8468.method29778(var7);
      Class8468.method29779(var7);
      Class8468.method29783(var7);
      if (!var3) {
         Class8468.method29798(var7);
      } else {
         Class8468.method29799(var7);
      }

      Class8468.method29816(var7);
      Class8468.method29818(var7);
      Class8468.method29821(var7);
      Class8468.method29822(var7);
      Class8468.method29832(var7);
      Class8468.method29781(var7);
      Class8468.method29782(var7);
      Class8468.method29835(var7);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field276)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.2F)
         .method37916(0.3F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.2F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var6.method35253())
         .method37919(var7.method26695())
         .method37921();
   }

   public static Biome method36075(float var0, float var1, boolean var2, boolean var3, boolean var4) {
      Class9328 var7 = new Class9328();
      Class8468.method29845(var7);
      Class7935 var8 = new Class7935().method26688(Class9109.field41844);
      if (var2) {
         var8.method26693(Class9438.field43854);
         var8.method26693(Class9438.field43834);
      }

      if (var3) {
         var8.method26693(Class9438.field43839);
      }

      if (var4) {
         Class8468.method29828(var8);
      }

      Class8468.method29771(var8);
      var8.method26693(Class9438.field43859);
      Class8468.method29773(var8);
      Class8468.method29776(var8);
      Class8468.method29777(var8);
      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29783(var8);
      Class8468.method29816(var8);
      Class8468.method29818(var8);
      Class8468.method29814(var8);
      Class8468.method29821(var8);
      Class8468.method29825(var8);
      Class8468.method29832(var8);
      Class8468.method29827(var8);
      Class8468.method29835(var8);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field286)
         .method37913(var0)
         .method37914(var1)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var7.method35253())
         .method37919(var8.method26695())
         .method37921();
   }

   public static Biome makePlainsBiome(boolean isSunflowerVariant) {
      Class9328 var3 = new Class9328();
      Class8468.method29843(var3);
      if (!isSunflowerVariant) {
         var3.method35252();
      }

      Class7935 var4 = new Class7935().method26688(Class9109.field41850);
      if (!isSunflowerVariant) {
         var4.method26693(Class9438.field43853).method26693(Class9438.field43834);
      }

      Class8468.method29771(var4);
      var4.method26693(Class9438.field43858);
      Class8468.method29773(var4);
      Class8468.method29775(var4);
      Class8468.method29777(var4);
      Class8468.method29820(var4);
      if (isSunflowerVariant) {
         var4.method26690(Class1993.field13006, Class9104.field41701);
      }

      Class8468.method29778(var4);
      Class8468.method29779(var4);
      Class8468.method29783(var4);
      Class8468.method29813(var4);
      if (isSunflowerVariant) {
         var4.method26690(Class1993.field13006, Class9104.field41729);
      }

      Class8468.method29821(var4);
      if (!isSunflowerVariant) {
         Class8468.method29822(var4);
      } else {
         var4.method26690(Class1993.field13006, Class9104.field41702);
      }

      Class8468.method29832(var4);
      Class8468.method29835(var4);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field279)
         .method37913(0.125F)
         .method37914(0.05F)
         .method37915(0.8F)
         .method37916(0.4F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.8F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var3.method35253())
         .method37919(var4.method26695())
         .method37921();
   }

   private static Biome method36077(Class7935 var0) {
      Class9328 var3 = new Class9328();
      Class8468.method29849(var3);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field282)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(0.5F)
         .method37916(0.5F)
         .method37917(
            new Class9265().method34869(4159204).method34870(329011).method34868(10518688).method34871(0).method34877(Class7959.field34224).method34880()
         )
         .method37918(var3.method35253())
         .method37919(var0.method26695())
         .method37921();
   }

   public static Biome method36078() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845);
      return method36077(var2);
   }

   public static Biome method36079() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845).method26690(Class1993.field13002, Class9104.field41633);
      return method36077(var2);
   }

   public static Biome method36080() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845).method26693(Class9438.field43850);
      return method36077(var2);
   }

   public static Biome method36081() {
      Class7935 var2 = new Class7935()
         .method26688(Class9109.field41845)
         .method26693(Class9438.field43850)
         .method26690(Class1993.field13002, Class9104.field41634)
         .method26690(Class1993.field13006, Class9104.field41636);
      return method36077(var2);
   }

   public static Biome method36082() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845).method26690(Class1993.field12998, Class9104.field41638);
      return method36077(var2);
   }

   public static Biome method36083(float var0, float var1) {
      Class9328 var4 = new Class9328();
      Class8468.method29847(var4);
      Class7935 var5 = new Class7935().method26688(Class9109.field41854);
      Class8468.method29771(var5);
      var5.method26693(Class9438.field43858);
      Class8468.method29773(var5);
      Class8468.method29775(var5);
      Class8468.method29777(var5);
      Class8468.method29778(var5);
      Class8468.method29779(var5);
      Class8468.method29783(var5);
      Class8468.method29812(var5);
      Class8468.method29821(var5);
      Class8468.method29822(var5);
      Class8468.method29832(var5);
      Class8468.method29835(var5);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field289)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.9F)
         .method37916(1.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.9F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var4.method35253())
         .method37919(var5.method26695())
         .method37921();
   }

   private static Biome method36084(float var0, float var1, float var2, boolean var3, boolean var4, Class9328 var5) {
      Class7935 var8 = new Class7935().method26688(!var4 ? Class9109.field41850 : Class9109.field41858);
      if (!var3 && !var4) {
         var8.method26693(Class9438.field43855).method26693(Class9438.field43834);
      }

      Class8468.method29771(var8);
      var8.method26693(!var3 ? Class9438.field43858 : Class9438.field43862);
      Class8468.method29773(var8);
      Class8468.method29775(var8);
      Class8468.method29777(var8);
      if (!var4) {
         Class8468.method29805(var8);
      }

      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29783(var8);
      if (!var4) {
         Class8468.method29796(var8);
         Class8468.method29817(var8);
         Class8468.method29807(var8);
      } else {
         Class8468.method29797(var8);
         Class8468.method29816(var8);
         Class8468.method29806(var8);
      }

      Class8468.method29821(var8);
      Class8468.method29822(var8);
      Class8468.method29832(var8);
      Class8468.method29835(var8);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field280)
         .method37913(var0)
         .method37914(var1)
         .method37915(var2)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var5.method35253())
         .method37919(var8.method26695())
         .method37921();
   }

   public static Biome method36085(float var0, float var1, float var2, boolean var3, boolean var4) {
      Class9328 var7 = method36086();
      return method36084(var0, var1, var2, var3, var4, var7);
   }

   private static Class9328 method36086() {
      Class9328 var2 = new Class9328();
      Class8468.method29838(var2);
      var2.method35249(Class179.field624, new Class6692(EntityType.field41038, 1, 2, 6))
         .method35249(Class179.field624, new Class6692(EntityType.field41019, 1, 1, 1));
      Class8468.method29840(var2);
      return var2;
   }

   public static Biome method36087() {
      Class9328 var2 = method36086();
      var2.method35249(Class179.field624, new Class6692(EntityType.field41047, 8, 4, 4));
      return method36084(1.5F, 0.025F, 1.0F, true, false, var2);
   }

   private static Biome method36088(Class9319<Class8278> var0, float var1, float var2, boolean var3, boolean var4) {
      Class9328 var7 = new Class9328();
      Class8468.method29840(var7);
      Class7935 var8 = new Class7935().method26688(var0);
      Class8468.method29770(var8);
      var8.method26693(!var3 ? Class9438.field43858 : Class9438.field43862);
      Class8468.method29773(var8);
      Class8468.method29775(var8);
      Class8468.method29777(var8);
      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29780(var8);
      Class8468.method29783(var8);
      if (var4) {
         Class8468.method29802(var8);
      }

      Class8468.method29808(var8);
      Class8468.method29821(var8);
      Class8468.method29823(var8);
      Class8468.method29832(var8);
      Class8468.method29835(var8);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field278)
         .method37913(var1)
         .method37914(var2)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34872(10387789)
               .method34873(9470285)
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var7.method35253())
         .method37919(var8.method26695())
         .method37921();
   }

   public static Biome method36089(float var0, float var1, boolean var2) {
      return method36088(Class9109.field41841, var0, var1, var2, false);
   }

   public static Biome method36090(float var0, float var1) {
      return method36088(Class9109.field41863, var0, var1, true, true);
   }

   public static Biome method36091() {
      return method36088(Class9109.field41846, 0.1F, 0.2F, true, false);
   }

   private static Biome method36092(Class9328 var0, int var1, int var2, boolean var3, Class7935 var4) {
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.OCEAN)
         .method37913(!var3 ? -1.0F : -1.8F)
         .method37914(0.1F)
         .method37915(0.5F)
         .method37916(0.5F)
         .method37917(
            new Class9265()
               .method34869(var1)
               .method34870(var2)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.5F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var0.method35253())
         .method37919(var4.method26695())
         .method37921();
   }

   private static Class7935 method36093(Class9319<Class8278> var0, boolean var1, boolean var2, boolean var3) {
      Class7935 var6 = new Class7935().method26688(var0);
      Class9300 var7 = !var2 ? Class9438.field43846 : Class9438.field43847;
      if (!var3) {
         var6.method26693(var7);
         if (var1) {
            var6.method26693(Class9438.field43845);
         }

         Class8468.method29772(var6);
      } else {
         if (var1) {
            var6.method26693(Class9438.field43845);
         }

         Class8468.method29772(var6);
         var6.method26693(var7);
      }

      var6.method26693(Class9438.field43863);
      Class8468.method29774(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      Class8468.method29792(var6);
      Class8468.method29816(var6);
      Class8468.method29818(var6);
      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      return var6;
   }

   public static Biome method36094(boolean var0) {
      Class9328 var3 = new Class9328();
      Class8468.method29841(var3, 3, 4, 15);
      var3.method35249(Class179.field627, new Class6692(EntityType.field41073, 15, 1, 5));
      boolean var4 = !var0;
      Class7935 var5 = method36093(Class9109.field41850, var0, false, var4);
      var5.method26690(Class1993.field13006, !var0 ? Class9104.field41652 : Class9104.field41653);
      Class8468.method29830(var5);
      Class8468.method29829(var5);
      Class8468.method29835(var5);
      return method36092(var3, 4020182, 329011, var0, var5);
   }

   public static Biome method36095(boolean var0) {
      Class9328 var3 = new Class9328();
      Class8468.method29841(var3, 1, 4, 10);
      var3.method35249(Class179.field626, new Class6692(EntityType.field41018, 1, 1, 2));
      Class7935 var4 = method36093(Class9109.field41850, var0, false, true);
      var4.method26690(Class1993.field13006, !var0 ? Class9104.field41654 : Class9104.field41656);
      Class8468.method29830(var4);
      Class8468.method29829(var4);
      Class8468.method29835(var4);
      return method36092(var3, 4159204, 329011, var0, var4);
   }

   public static Biome method36096(boolean var0) {
      Class9328 var3 = new Class9328();
      if (!var0) {
         Class8468.method29841(var3, 10, 2, 15);
      } else {
         Class8468.method29841(var3, 8, 4, 8);
      }

      var3.method35249(Class179.field627, new Class6692(EntityType.field41070, 5, 1, 3))
         .method35249(Class179.field627, new Class6692(EntityType.field41095, 25, 8, 8))
         .method35249(Class179.field626, new Class6692(EntityType.field41018, 2, 1, 2));
      Class7935 var4 = method36093(Class9109.field41857, var0, true, false);
      var4.method26690(Class1993.field13006, !var0 ? Class9104.field41658 : Class9104.field41659);
      if (var0) {
         Class8468.method29830(var4);
      }

      Class8468.method29831(var4);
      Class8468.method29835(var4);
      return method36092(var3, 4566514, 267827, var0, var4);
   }

   public static Biome method36097() {
      Class9328 var2 = new Class9328().method35249(Class179.field627, new Class6692(EntityType.field41070, 15, 1, 3));
      Class8468.method29842(var2, 10, 4);
      Class7935 var3 = method36093(Class9109.field41848, false, true, false)
         .method26690(Class1993.field13006, Class9104.field41807)
         .method26690(Class1993.field13006, Class9104.field41658)
         .method26690(Class1993.field13006, Class9104.field41660);
      Class8468.method29835(var3);
      return method36092(var2, 4445678, 270131, false, var3);
   }

   public static Biome method36098() {
      Class9328 var2 = new Class9328();
      Class8468.method29842(var2, 5, 1);
      var2.method35249(Class179.field623, new Class6692(EntityType.field41021, 5, 1, 1));
      Class7935 var3 = method36093(Class9109.field41848, true, true, false).method26690(Class1993.field13006, Class9104.field41659);
      Class8468.method29830(var3);
      Class8468.method29835(var3);
      return method36092(var2, 4445678, 270131, true, var3);
   }

   public static Biome method36099(boolean var0) {
      Class9328 var3 = new Class9328()
         .method35249(Class179.field626, new Class6692(EntityType.field41086, 1, 1, 4))
         .method35249(Class179.field627, new Class6692(EntityType.field41073, 15, 1, 5))
         .method35249(Class179.field624, new Class6692(EntityType.field41068, 1, 1, 2));
      Class8468.method29840(var3);
      var3.method35249(Class179.field623, new Class6692(EntityType.field41021, 5, 1, 1));
      float var4 = !var0 ? 0.0F : 0.5F;
      Class7935 var5 = new Class7935().method26688(Class9109.field41847);
      var5.method26693(Class9438.field43846);
      if (var0) {
         var5.method26693(Class9438.field43845);
      }

      Class8468.method29772(var5);
      var5.method26693(Class9438.field43863);
      Class8468.method29774(var5);
      Class8468.method29775(var5);
      Class8468.method29833(var5);
      Class8468.method29777(var5);
      Class8468.method29834(var5);
      Class8468.method29778(var5);
      Class8468.method29779(var5);
      Class8468.method29783(var5);
      Class8468.method29792(var5);
      Class8468.method29816(var5);
      Class8468.method29818(var5);
      Class8468.method29821(var5);
      Class8468.method29822(var5);
      Class8468.method29832(var5);
      Class8468.method29835(var5);
      return new Class9684()
         .method37911(!var0 ? Class87.field225 : Class87.field224)
         .method37912(Class100.OCEAN)
         .method37913(!var0 ? -1.0F : -1.8F)
         .method37914(0.1F)
         .method37915(var4)
         .method37920(Class93.field242)
         .method37916(0.5F)
         .method37917(
            new Class9265()
               .method34869(3750089)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var4))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var3.method35253())
         .method37919(var5.method26695())
         .method37921();
   }

   private static Biome method36100(float var0, float var1, boolean var2, Class9328 var3) {
      Class7935 var6 = new Class7935().method26688(Class9109.field41850);
      Class8468.method29771(var6);
      var6.method26693(Class9438.field43858);
      Class8468.method29773(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      if (!var2) {
         Class8468.method29809(var6);
      } else {
         var6.method26690(Class1993.field13006, Class9104.field41803);
      }

      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      if (!var2) {
         Class8468.method29794(var6);
         Class8468.method29816(var6);
         Class8468.method29810(var6);
      } else {
         var6.method26690(Class1993.field13006, Class9104.field41808);
         var6.method26690(Class1993.field13006, Class9104.field41798);
         Class8468.method29818(var6);
      }

      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      Class8468.method29835(var6);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field284)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.7F)
         .method37916(0.8F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.7F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var3.method35253())
         .method37919(var6.method26695())
         .method37921();
   }

   private static Class9328 method36101() {
      Class9328 var2 = new Class9328();
      Class8468.method29838(var2);
      Class8468.method29840(var2);
      return var2;
   }

   public static Biome method36102(float var0, float var1) {
      Class9328 var4 = method36101().method35249(Class179.field624, new Class6692(EntityType.field41105, 5, 4, 4)).method35252();
      return method36100(var0, var1, false, var4);
   }

   public static Biome method36103() {
      Class9328 var2 = method36101().method35249(Class179.field624, new Class6692(EntityType.RABBIT, 4, 2, 3));
      return method36100(0.1F, 0.4F, true, var2);
   }

   public static Biome method36104(float var0, float var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      Class9328 var8 = new Class9328();
      Class8468.method29838(var8);
      var8.method35249(Class179.field624, new Class6692(EntityType.field41105, 8, 4, 4))
         .method35249(Class179.field624, new Class6692(EntityType.RABBIT, 4, 2, 3))
         .method35249(Class179.field624, new Class6692(EntityType.FOX, 8, 2, 4));
      if (!var2 && !var3) {
         var8.method35252();
      }

      Class8468.method29840(var8);
      float var9 = !var2 ? 0.25F : -0.5F;
      Class7935 var10 = new Class7935().method26688(Class9109.field41850);
      if (var4) {
         var10.method26693(Class9438.field43857);
         var10.method26693(Class9438.field43834);
      }

      if (var5) {
         var10.method26693(Class9438.field43840);
      }

      Class8468.method29771(var10);
      var10.method26693(!var3 ? Class9438.field43858 : Class9438.field43862);
      Class8468.method29773(var10);
      Class8468.method29775(var10);
      Class8468.method29777(var10);
      Class8468.method29786(var10);
      Class8468.method29778(var10);
      Class8468.method29779(var10);
      Class8468.method29783(var10);
      Class8468.method29791(var10);
      Class8468.method29816(var10);
      Class8468.method29819(var10);
      Class8468.method29821(var10);
      Class8468.method29822(var10);
      Class8468.method29832(var10);
      if (!var2) {
         Class8468.method29788(var10);
      } else {
         Class8468.method29787(var10);
      }

      Class8468.method29835(var10);
      return new Class9684()
         .method37911(!var2 ? Class87.field224 : Class87.field225)
         .method37912(Class100.field275)
         .method37913(var0)
         .method37914(var1)
         .method37915(var9)
         .method37916(!var2 ? 0.8F : 0.4F)
         .method37917(
            new Class9265()
               .method34869(!var2 ? 4159204 : 4020182)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var9))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var8.method35253())
         .method37919(var10.method26695())
         .method37921();
   }

   public static Biome method36105(float var0, float var1, boolean var2) {
      Class9328 var5 = new Class9328();
      Class8468.method29838(var5);
      Class8468.method29840(var5);
      Class7935 var6 = new Class7935().method26688(Class9109.field41850);
      var6.method26693(Class9438.field43837);
      Class8468.method29771(var6);
      var6.method26693(Class9438.field43858);
      Class8468.method29773(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      var6.method26690(Class1993.field13006, !var2 ? Class9104.field41805 : Class9104.field41806);
      Class8468.method29809(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      Class8468.method29816(var6);
      Class8468.method29810(var6);
      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      Class8468.method29835(var6);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field284)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.7F)
         .method37916(0.8F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.7F))
               .method34874(Class88.field231)
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var5.method35253())
         .method37919(var6.method26695())
         .method37921();
   }

   public static Biome makeGenericSwampBiome(float var0, float var1, boolean var2) {
      Class9328 var5 = new Class9328();
      Class8468.method29838(var5);
      Class8468.method29840(var5);
      var5.method35249(Class179.field623, new Class6692(EntityType.field41080, 1, 1, 1));
      Class7935 var6 = new Class7935().method26688(Class9109.field41861);
      if (!var2) {
         var6.method26693(Class9438.field43843);
      }

      var6.method26693(Class9438.field43835);
      var6.method26693(Class9438.field43861);
      Class8468.method29773(var6);
      if (!var2) {
         Class8468.method29828(var6);
      }

      Class8468.method29775(var6);
      Class8468.method29777(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29784(var6);
      Class8468.method29811(var6);
      Class8468.method29821(var6);
      Class8468.method29826(var6);
      Class8468.method29832(var6);
      if (!var2) {
         var6.method26690(Class1993.field13006, Class9104.field41657);
      } else {
         Class8468.method29828(var6);
      }

      Class8468.method29835(var6);
      return new Class9684()
         .method37911(Class87.field224)
         .method37912(Class100.field288)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.8F)
         .method37916(0.9F)
         .method37917(
            new Class9265()
               .method34869(6388580)
               .method34870(2302743)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.8F))
               .method34872(6975545)
               .method34874(Class88.field232)
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var5.method35253())
         .method37919(var6.method26695())
         .method37921();
   }

   public static Biome method36107(float var0, float var1, boolean var2, boolean var3) {
      Class9328 var6 = new Class9328().method35251(0.07F);
      Class8468.method29844(var6);
      Class7935 var7 = new Class7935().method26688(!var2 ? Class9109.field41850 : Class9109.field41852);
      if (!var2 && !var3) {
         var7.method26693(Class9438.field43856).method26693(Class9438.field43840);
      }

      Class8468.method29771(var7);
      if (!var2 && !var3) {
         var7.method26693(Class9438.field43834);
      }

      var7.method26693(!var3 ? Class9438.field43858 : Class9438.field43862);
      Class8468.method29773(var7);
      Class8468.method29775(var7);
      Class8468.method29777(var7);
      if (var2) {
         var7.method26690(Class1993.field13002, Class9104.field41661);
         var7.method26690(Class1993.field13002, Class9104.field41662);
      }

      Class8468.method29778(var7);
      Class8468.method29779(var7);
      Class8468.method29783(var7);
      Class8468.method29803(var7);
      Class8468.method29816(var7);
      Class8468.method29818(var7);
      Class8468.method29821(var7);
      Class8468.method29822(var7);
      Class8468.method29832(var7);
      Class8468.method29835(var7);
      return new Class9684()
         .method37911(Class87.field225)
         .method37912(Class100.field281)
         .method37913(var0)
         .method37914(var1)
         .method37915(0.0F)
         .method37916(0.5F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.0F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var6.method35253())
         .method37919(var7.method26695())
         .method37921();
   }

   public static Biome method36108(float var0, float var1, float var2, int var3, boolean var4) {
      Class9328 var7 = new Class9328()
         .method35249(Class179.field626, new Class6692(EntityType.field41086, 2, 1, 4))
         .method35249(Class179.field627, new Class6692(EntityType.field41073, 5, 1, 5));
      Class8468.method29840(var7);
      var7.method35249(Class179.field623, new Class6692(EntityType.field41021, !var4 ? 100 : 1, 1, 1));
      Class7935 var8 = new Class7935().method26688(Class9109.field41850);
      var8.method26693(Class9438.field43835);
      var8.method26693(Class9438.field43858);
      Class8468.method29773(var8);
      Class8468.method29775(var8);
      Class8468.method29777(var8);
      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29783(var8);
      Class8468.method29792(var8);
      Class8468.method29816(var8);
      Class8468.method29818(var8);
      Class8468.method29821(var8);
      Class8468.method29822(var8);
      Class8468.method29832(var8);
      if (!var4) {
         var8.method26690(Class1993.field13006, Class9104.field41655);
      }

      Class8468.method29835(var8);
      return new Class9684()
         .method37911(!var4 ? Class87.field224 : Class87.field225)
         .method37912(Class100.RIVER)
         .method37913(var0)
         .method37914(var1)
         .method37915(var2)
         .method37916(0.5F)
         .method37917(
            new Class9265()
               .method34869(var3)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var7.method35253())
         .method37919(var8.method26695())
         .method37921();
   }

   public static Biome method36109(float var0, float var1, float var2, float var3, int var4, boolean var5, boolean var6) {
      Class9328 var9 = new Class9328();
      if (!var6 && !var5) {
         var9.method35249(Class179.field624, new Class6692(EntityType.field41096, 5, 2, 5));
      }

      Class8468.method29840(var9);
      Class7935 var10 = new Class7935().method26688(!var6 ? Class9109.field41844 : Class9109.field41860);
      if (!var6) {
         var10.method26693(Class9438.field43835);
         var10.method26693(Class9438.field43851);
         var10.method26693(Class9438.field43842);
      } else {
         Class8468.method29771(var10);
      }

      var10.method26693(!var6 ? Class9438.field43858 : Class9438.field43862);
      Class8468.method29773(var10);
      Class8468.method29775(var10);
      Class8468.method29777(var10);
      Class8468.method29778(var10);
      Class8468.method29779(var10);
      Class8468.method29783(var10);
      Class8468.method29816(var10);
      Class8468.method29818(var10);
      Class8468.method29821(var10);
      Class8468.method29822(var10);
      Class8468.method29832(var10);
      Class8468.method29835(var10);
      return new Class9684()
         .method37911(!var5 ? Class87.field224 : Class87.field225)
         .method37912(!var6 ? Class100.field283 : Class100.field274)
         .method37913(var0)
         .method37914(var1)
         .method37915(var2)
         .method37916(var3)
         .method37917(
            new Class9265()
               .method34869(var4)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(var9.method35253())
         .method37919(var10.method26695())
         .method37921();
   }

   public static Biome method36110() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41856);
      var2.method26690(Class1993.field13007, Class9104.field41680);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field274)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(0.5F)
         .method37916(0.5F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.5F))
               .method34877(Class7959.field34224)
               .method34880()
         )
         .method37918(Class8835.field39899)
         .method37919(var2.method26695())
         .method37921();
   }

   public static Biome method36111() {
      Class8835 var2 = new Class9328()
         .method35249(Class179.field623, new Class6692(EntityType.field41034, 50, 4, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41110, 100, 4, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41049, 2, 4, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41025, 1, 4, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41065, 15, 4, 4))
         .method35249(Class179.field624, new Class6692(EntityType.field41088, 60, 1, 2))
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41855)
         .method26693(Class9438.field43864)
         .method26693(Class9438.field43848)
         .method26693(Class9438.field43852)
         .method26692(Class97.field259, Class7827.field33611)
         .method26690(Class1993.field13006, Class9104.field41685);
      Class8468.method29821(var3);
      var3.method26690(Class1993.field13005, Class9104.field41689)
         .method26690(Class1993.field13005, Class9104.field41696)
         .method26690(Class1993.field13005, Class9104.field41697)
         .method26690(Class1993.field13005, Class9104.field41644)
         .method26690(Class1993.field13005, Class9104.field41645)
         .method26690(Class1993.field13005, Class9104.field41730)
         .method26690(Class1993.field13005, Class9104.field41731)
         .method26690(Class1993.field13005, Class9104.field41740)
         .method26690(Class1993.field13005, Class9104.field41687);
      Class8468.method29836(var3);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field290)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(3344392)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34876(SoundEvents.field26321)
               .method34877(new Class7959(SoundEvents.field26322, 6000, 8, 2.0))
               .method34878(new Class8217(SoundEvents.field26320, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26796))
               .method34880()
         )
         .method37918(var2)
         .method37919(var3.method26695())
         .method37921();
   }

   public static Biome method36112() {
      double var2 = 0.7;
      double var4 = 0.15;
      Class8835 var6 = new Class9328()
         .method35249(Class179.field623, new Class6692(EntityType.field41078, 20, 5, 5))
         .method35249(Class179.field623, new Class6692(EntityType.field41034, 50, 4, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41025, 1, 4, 4))
         .method35249(Class179.field624, new Class6692(EntityType.field41088, 60, 1, 2))
         .method35250(EntityType.field41078, 0.7, 0.15)
         .method35250(EntityType.field41034, 0.7, 0.15)
         .method35250(EntityType.field41025, 0.7, 0.15)
         .method35250(EntityType.field41088, 0.7, 0.15)
         .method35253();
      Class7935 var7 = new Class7935()
         .method26688(Class9109.field41859)
         .method26693(Class9438.field43848)
         .method26693(Class9438.field43849)
         .method26693(Class9438.field43864)
         .method26693(Class9438.field43852)
         .method26692(Class97.field259, Class7827.field33611)
         .method26690(Class1993.field13006, Class9104.field41685)
         .method26690(Class1993.field13000, Class9104.field41651)
         .method26690(Class1993.field13005, Class9104.field41689)
         .method26690(Class1993.field13005, Class9104.field41644)
         .method26690(Class1993.field13005, Class9104.field41645)
         .method26690(Class1993.field13005, Class9104.field41700)
         .method26690(Class1993.field13005, Class9104.field41696)
         .method26690(Class1993.field13005, Class9104.field41697)
         .method26690(Class1993.field13005, Class9104.field41740)
         .method26690(Class1993.field13005, Class9104.field41687)
         .method26690(Class1993.field13005, Class9104.field41741);
      Class8468.method29836(var7);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field290)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(1787717)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new Class7737(ParticleTypes.field34112, 0.00625F))
               .method34876(SoundEvents.field26324)
               .method34877(new Class7959(SoundEvents.field26325, 6000, 8, 2.0))
               .method34878(new Class8217(SoundEvents.field26323, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26797))
               .method34880()
         )
         .method37918(var6)
         .method37919(var7.method26695())
         .method37921();
   }

   public static Biome method36113() {
      Class8835 var2 = new Class9328()
         .method35249(Class179.field623, new Class6692(EntityType.field41034, 40, 1, 1))
         .method35249(Class179.field623, new Class6692(EntityType.field41049, 100, 2, 5))
         .method35249(Class179.field624, new Class6692(EntityType.field41088, 60, 1, 2))
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41842)
         .method26693(Class9438.field43864)
         .method26692(Class97.field259, Class7827.field33611)
         .method26693(Class9438.field43848)
         .method26690(Class1993.field13002, Class9104.field41639)
         .method26690(Class1993.field13006, Class9104.field41684)
         .method26690(Class1993.field13002, Class9104.field41640)
         .method26690(Class1993.field13002, Class9104.field41641)
         .method26690(Class1993.field13005, Class9104.field41642)
         .method26690(Class1993.field13005, Class9104.field41643)
         .method26690(Class1993.field13005, Class9104.field41686)
         .method26690(Class1993.field13005, Class9104.field41696)
         .method26690(Class1993.field13005, Class9104.field41697)
         .method26690(Class1993.field13005, Class9104.field41644)
         .method26690(Class1993.field13005, Class9104.field41645)
         .method26690(Class1993.field13005, Class9104.field41730)
         .method26690(Class1993.field13005, Class9104.field41731)
         .method26690(Class1993.field13005, Class9104.field41740)
         .method26690(Class1993.field13005, Class9104.field41688)
         .method26690(Class1993.field13005, Class9104.field41742)
         .method26690(Class1993.field13005, Class9104.field41743);
      Class8468.method29837(var3);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field290)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(4341314)
               .method34868(6840176)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new Class7737(ParticleTypes.field34119, 0.118093334F))
               .method34876(SoundEvents.field26315)
               .method34877(new Class7959(SoundEvents.field26316, 6000, 8, 2.0))
               .method34878(new Class8217(SoundEvents.field26314, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26795))
               .method34880()
         )
         .method37918(var2)
         .method37919(var3.method26695())
         .method37921();
   }

   public static Biome method36114() {
      Class8835 var2 = new Class9328()
         .method35249(Class179.field623, new Class6692(EntityType.field41110, 1, 2, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41037, 9, 3, 4))
         .method35249(Class179.field623, new Class6692(EntityType.field41065, 5, 3, 4))
         .method35249(Class179.field624, new Class6692(EntityType.field41088, 60, 1, 2))
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41843)
         .method26693(Class9438.field43864)
         .method26692(Class97.field259, Class7827.field33611)
         .method26693(Class9438.field43848)
         .method26693(Class9438.field43852)
         .method26690(Class1993.field13006, Class9104.field41685);
      Class8468.method29821(var3);
      var3.method26690(Class1993.field13005, Class9104.field41689)
         .method26690(Class1993.field13005, Class9104.field41696)
         .method26690(Class1993.field13005, Class9104.field41644)
         .method26690(Class1993.field13005, Class9104.field41645)
         .method26690(Class1993.field13005, Class9104.field41740)
         .method26690(Class1993.field13005, Class9104.field41687)
         .method26690(Class1993.field13006, Class9104.field41650)
         .method26690(Class1993.field13006, Class9104.field41764)
         .method26690(Class1993.field13006, Class9104.field41646);
      Class8468.method29836(var3);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field290)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(3343107)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new Class7737(ParticleTypes.field34113, 0.025F))
               .method34876(SoundEvents.field26318)
               .method34877(new Class7959(SoundEvents.field26319, 6000, 8, 2.0))
               .method34878(new Class8217(SoundEvents.field26317, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26798))
               .method34880()
         )
         .method37918(var2)
         .method37919(var3.method26695())
         .method37921();
   }

   public static Biome method36115() {
      Class8835 var2 = new Class9328()
         .method35249(Class179.field623, new Class6692(EntityType.field41025, 1, 4, 4))
         .method35249(Class179.field624, new Class6692(EntityType.field41088, 60, 1, 2))
         .method35250(EntityType.field41025, 1.0, 0.12)
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41862)
         .method26693(Class9438.field43848)
         .method26693(Class9438.field43852)
         .method26693(Class9438.field43864)
         .method26692(Class97.field259, Class7827.field33611)
         .method26690(Class1993.field13006, Class9104.field41685);
      Class8468.method29821(var3);
      var3.method26690(Class1993.field13005, Class9104.field41689)
         .method26690(Class1993.field13005, Class9104.field41696)
         .method26690(Class1993.field13005, Class9104.field41697)
         .method26690(Class1993.field13005, Class9104.field41644)
         .method26690(Class1993.field13005, Class9104.field41645)
         .method26690(Class1993.field13005, Class9104.field41740)
         .method26690(Class1993.field13005, Class9104.field41687)
         .method26690(Class1993.field13006, Class9104.field41766)
         .method26690(Class1993.field13006, Class9104.field41647)
         .method26690(Class1993.field13006, Class9104.field41648)
         .method26690(Class1993.field13006, Class9104.field41649);
      Class8468.method29836(var3);
      return new Class9684()
         .method37911(Class87.field223)
         .method37912(Class100.field290)
         .method37913(0.1F)
         .method37914(0.2F)
         .method37915(2.0F)
         .method37916(0.0F)
         .method37917(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(1705242)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new Class7737(ParticleTypes.field34114, 0.01428F))
               .method34876(SoundEvents.field26327)
               .method34877(new Class7959(SoundEvents.field26328, 6000, 8, 2.0))
               .method34878(new Class8217(SoundEvents.field26326, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26799))
               .method34880()
         )
         .method37918(var2)
         .method37919(var3.method26695())
         .method37921();
   }
}
