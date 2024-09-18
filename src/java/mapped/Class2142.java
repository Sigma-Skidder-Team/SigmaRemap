package mapped;

import com.mojang.blaze3d.platform.GlStateManager;

import java.util.function.IntConsumer;

public enum Class2142 {
   field14018("Position", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method23847(var0, var1, var2, var3);
      GlStateManager.method23850(32884);
   }, var0 -> GlStateManager.method23851(32884)),
   field14019("Normal", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method23845(var1, var2, var3);
      GlStateManager.method23850(32885);
   }, var0 -> GlStateManager.method23851(32885)),
   field14020("Vertex Color", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method23848(var0, var1, var2, var3);
      GlStateManager.method23850(32886);
   }, var0 -> {
      GlStateManager.method23851(32886);
      GlStateManager.method23844();
   }),
   field14021("UV", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method23760(33984 + var5);
      GlStateManager.method23846(var0, var1, var2, var3);
      GlStateManager.method23850(32888);
      GlStateManager.method23760(33984);
   }, var0 -> {
      GlStateManager.method23760(33984 + var0);
      GlStateManager.method23851(32888);
      GlStateManager.method23760(33984);
   }),
   field14022("Padding", (var0, var1, var2, var3, var5) -> {
   }, var0 -> {
   }),
   field14023("Generic", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method23852(var5);
      GlStateManager.method23849(var5, var0, var1, false, var2, var3);
   }, GlStateManager::method23853);

   private final String field14024;
   private final Class7673 field14025;
   private final IntConsumer field14026;
   private static final Class2142[] field14027 = new Class2142[]{field14018, field14019, field14020, field14021, field14022, field14023};

   private Class2142(String var3, Class7673 var4, IntConsumer var5) {
      this.field14024 = var3;
      this.field14025 = var4;
      this.field14026 = var5;
   }

   private void method8834(int var1, int var2, int var3, long var4, int var6) {
      this.field14025.method25206(var1, var2, var3, var4, var6);
   }

   public void method8835(int var1) {
      this.field14026.accept(var1);
   }

   public String method8836() {
      return this.field14024;
   }

   // $VF: synthetic method
   public static void method8848(Class2142 var0, int var1, int var2, int var3, long var4, int var6) {
      var0.method8834(var1, var2, var3, var4, var6);
   }
}
