package mapped;

public enum Class2138 {
   field13996("this", Class9525.field44330),
   field13997("killer", Class9525.field44333),
   field13998("killer_player", Class9525.field44331),
   field13999("block_entity", Class9525.field44337);

   public final String field14000;
   public final Class9821<?> field14001;
   private static final Class2138[] field14002 = new Class2138[]{field13996, field13997, field13998, field13999};

   private Class2138(String var3, Class9821<?> var4) {
      this.field14000 = var3;
      this.field14001 = var4;
   }

   public static Class2138 method8831(String var0) {
      for (Class2138 var6 : values()) {
         if (var6.field14000.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid name source " + var0);
   }
}
