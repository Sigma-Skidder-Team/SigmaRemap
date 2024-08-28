package mapped;

public enum Class2099 {
   field13680(Blocks.field36400, "oak"),
   field13681(Blocks.field36401, "spruce"),
   field13682(Blocks.field36402, "birch"),
   field13683(Blocks.field36403, "jungle"),
   field13684(Blocks.field36404, "acacia"),
   field13685(Blocks.field36405, "dark_oak");

   private final String field13686;
   private final Block field13687;
   private static final Class2099[] field13688 = new Class2099[]{field13680, field13681, field13682, field13683, field13684, field13685};

   private Class2099(Block var3, String var4) {
      this.field13686 = var4;
      this.field13687 = var3;
   }

   public String method8761() {
      return this.field13686;
   }

   public Block method8762() {
      return this.field13687;
   }

   @Override
   public String toString() {
      return this.field13686;
   }

   public static Class2099 method8763(int var0) {
      Class2099[] var3 = values();
      if (var0 < 0 || var0 >= var3.length) {
         var0 = 0;
      }

      return var3[var0];
   }

   public static Class2099 method8764(String var0) {
      Class2099[] var3 = values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4].method8761().equals(var0)) {
            return var3[var4];
         }
      }

      return var3[0];
   }
}
