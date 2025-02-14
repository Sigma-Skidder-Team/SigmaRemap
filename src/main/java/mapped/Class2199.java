package mapped;

public enum Class2199 {
   field14367(-3),
   field14368(-2),
   field14369(-1),
   field14370(0),
   field14371(1),
   field14372(2),
   field14373(3);

   private final int field14374;
   private static final Class2199[] field14375 = new Class2199[]{field14367, field14368, field14369, field14370, field14371, field14372, field14373};

   private Class2199(int var3) {
      this.field14374 = var3;
   }

   public static Class2199 method8913(int var0) {
      for (Class2199 var6 : values()) {
         if (var6.field14374 == var0) {
            return var6;
         }
      }

      return var0 >= field14367.field14374 ? field14373 : field14367;
   }

   public int method8914() {
      return this.field14374;
   }
}
