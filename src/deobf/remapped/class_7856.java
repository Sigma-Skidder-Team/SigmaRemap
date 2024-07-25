package remapped;

public enum class_7856 {
   field_39816(0, 0),
   field_39814(1, 0),
   field_39812(2, 0),
   field_39811(0, 1),
   field_39813(1, 1),
   field_39810(2, 1);

   private final int field_39817;
   private final int field_39815;

   private class_7856(int var3, int var4) {
      this.field_39817 = var3;
      this.field_39815 = var4;
   }

   public void method_35534(class_7966 var1, AbstractGui var2, int var3, int var4) {
      RenderSystem.enableBlend();
      var2.method_9781(var1, var3, var4, 176 + this.field_39817 * 20, this.field_39815 * 20, 20, 20);
      RenderSystem.enableBlend();
   }
}
