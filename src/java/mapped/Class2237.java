package mapped;

public enum Class2237 {
   field14626(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true),
   field14627(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true),
   field14628(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true),
   field14629(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);

   private final int field14630;
   private final int field14631;
   private final boolean field14632;
   private final boolean field14633;
   private final boolean field14634;
   private final boolean field14635;
   private final boolean field14636;
   private final int field14637;
   private final int field14638;
   private final int field14639;
   private final int field14640;
   private final int field14641;
   private final boolean field14642;
   private static final Class2237[] field14643 = new Class2237[]{field14626, field14627, field14628, field14629};

   private Class2237(
      int var3,
      int var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      boolean var15
   ) {
      this.field14630 = var3;
      this.field14631 = var4;
      this.field14632 = var5;
      this.field14633 = var6;
      this.field14634 = var7;
      this.field14635 = var8;
      this.field14636 = var9;
      this.field14637 = var10;
      this.field14638 = var11;
      this.field14639 = var12;
      this.field14640 = var13;
      this.field14641 = var14;
      this.field14642 = var15;
   }

   public int method8973() {
      return this.field14630;
   }

   public void method8974() {
      RenderSystem.method27808(RenderSystem::method27803);
      Class7414.method23856(3333, this.method8973());
   }

   public void method8975() {
      RenderSystem.method27808(RenderSystem::method27804);
      Class7414.method23856(3317, this.method8973());
   }

   public int method8976() {
      return this.field14631;
   }

   public boolean method8977() {
      return this.field14636;
   }

   public int method8978() {
      return this.field14641;
   }

   public boolean method8979() {
      return this.field14635 || this.field14636;
   }

   public int method8980() {
      return !this.field14635 ? this.field14641 : this.field14640;
   }

   public boolean method8981() {
      return this.field14642;
   }

   private static Class2237 method8982(int var0) {
      switch (var0) {
         case 1:
            return field14629;
         case 2:
            return field14628;
         case 3:
            return field14627;
         case 4:
         default:
            return field14626;
      }
   }

   // $VF: synthetic method
   public static int method8983(Class2237 var0) {
      return var0.field14630;
   }

   // $VF: synthetic method
   public static Class2237 method8984(int var0) {
      return method8982(var0);
   }
}
