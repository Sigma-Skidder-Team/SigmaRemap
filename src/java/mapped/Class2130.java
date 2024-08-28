package mapped;

public enum Class2130 {
   field13895(0, 0),
   field13896(1, 0),
   field13897(2, 0),
   field13898(0, 1),
   field13899(1, 1),
   field13900(2, 1);

   private final int field13901;
   private final int field13902;
   private static final Class2130[] field13903 = new Class2130[]{field13895, field13896, field13897, field13898, field13899, field13900};

   private Class2130(int var3, int var4) {
      this.field13901 = var3;
      this.field13902 = var4;
   }

   public void method8813(Class9332 var1, Class1193 var2, int var3, int var4) {
      RenderSystem.enableBlend();
      var2.method5696(var1, var3, var4, 176 + this.field13901 * 20, this.field13902 * 20, 20, 20);
      RenderSystem.enableBlend();
   }
}
