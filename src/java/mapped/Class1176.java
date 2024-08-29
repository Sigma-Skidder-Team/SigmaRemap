package mapped;

import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1176 extends Class1155<Class1176> {
   private final Biome field6368;
   private final ITextComponent field6369;
   public final Class1283 field6370;

   public Class1176(Class1283 var1, Biome var2) {
      this.field6370 = var1;
      this.field6368 = var2;
      ResourceLocation var5 = Class1323.method6291(var1.field6847).getKey(var2);
      String var6 = "biome." + var5.getNamespace() + "." + var5.getPath();
      if (!LanguageMap.getInstance().func_230506_b_(var6)) {
         this.field6369 = new StringTextComponent(var5.toString());
      } else {
         this.field6369 = new TranslationTextComponent(var6);
      }
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      AbstractGui.method5693(var1, this.field6370.field6847.fontRenderer, this.field6369, var4 + 5, var3 + 2, 16777215);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.field6370.method6024(this);
         return true;
      }
   }

   // $VF: synthetic method
   public static Biome method5602(Class1176 var0) {
      return var0.field6368;
   }
}
