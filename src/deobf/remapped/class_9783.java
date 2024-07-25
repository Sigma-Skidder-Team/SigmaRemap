package remapped;

import java.util.function.IntConsumer;

public enum class_9783 {
   field_49656("Position", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method_8754(var0, var1, var2, var3);
      GlStateManager.method_8782(32884);
   }, var0 -> GlStateManager.method_8751(32884)),
   field_49650("Normal", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method_8827(var1, var2, var3);
      GlStateManager.method_8782(32885);
   }, var0 -> GlStateManager.method_8751(32885)),
   field_49652("Vertex Color", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method_8833(var0, var1, var2, var3);
      GlStateManager.method_8782(32886);
   }, var0 -> {
      GlStateManager.method_8751(32886);
      GlStateManager.method_8836();
   }),
   field_49659("UV", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method_8750(33984 + var5);
      GlStateManager.method_8830(var0, var1, var2, var3);
      GlStateManager.method_8782(32888);
      GlStateManager.method_8750(33984);
   }, var0 -> {
      GlStateManager.method_8750(33984 + var0);
      GlStateManager.method_8751(32888);
      GlStateManager.method_8750(33984);
   }),
   field_49654("Padding", (var0, var1, var2, var3, var5) -> {
   }, var0 -> {
   }),
   field_49657("Generic", (var0, var1, var2, var3, var5) -> {
      GlStateManager.method_8826(var5);
      GlStateManager.method_8832(var5, var0, var1, false, var2, var3);
   }, GlStateManager::method_8800);

   private final String field_49655;
   private final class_2405 field_49658;
   private final IntConsumer field_49653;

   private class_9783(String var3, class_2405 var4, IntConsumer var5) {
      this.field_49655 = var3;
      this.field_49658 = var4;
      this.field_49653 = var5;
   }

   private void method_45171(int var1, int var2, int var3, long var4, int var6) {
      this.field_49658.method_10937(var1, var2, var3, var4, var6);
   }

   public void method_45167(int var1) {
      this.field_49653.accept(var1);
   }

   public String method_45168() {
      return this.field_49655;
   }
}
