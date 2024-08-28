package mapped;

public enum Class1957 {
   field12753("all", 1, 11),
   field12754("fire", 10, 8),
   field12755("fall", 5, 6),
   field12756("explosion", 5, 8),
   field12757("projectile", 3, 6);

   private final String field12758;
   private final int field12759;
   private final int field12760;
   private static final Class1957[] field12761 = new Class1957[]{field12753, field12754, field12755, field12756, field12757};

   private Class1957(String var3, int var4, int var5) {
      this.field12758 = var3;
      this.field12759 = var4;
      this.field12760 = var5;
   }

   public int method8221() {
      return this.field12759;
   }

   public int method8222() {
      return this.field12760;
   }
}
