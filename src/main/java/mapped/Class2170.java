package mapped;

public enum Class2170 {
   field14242("master", 0),
   field14243("music", 1),
   field14244("record", 2),
   field14245("weather", 3),
   field14246("block", 4),
   field14247("hostile", 5),
   field14248("neutral", 6),
   field14249("player", 7),
   field14250("ambient", 8),
   field14251("voice", 9);

   private final String field14252;
   private final int field14253;
   private static final Class2170[] field14254 = new Class2170[]{
      field14242, field14243, field14244, field14245, field14246, field14247, field14248, field14249, field14250, field14251
   };

   private Class2170(String var3, int var4) {
      this.field14252 = var3;
      this.field14253 = var4;
   }

   public int method8892() {
      return this.field14253;
   }

   public String method8893() {
      return this.field14252;
   }
}
