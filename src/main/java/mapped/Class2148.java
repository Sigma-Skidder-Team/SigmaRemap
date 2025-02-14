package mapped;

public enum Class2148 {
   field14048(new Integer[]{1, 0}),
   field14049(new Integer[]{1, 1});

   private Integer[] field14050;
   private static final Class2148[] field14051 = new Class2148[]{field14048, field14049};

   private Class2148(Integer[] var3) {
      this.field14050 = var3;
   }

   public int method8852() {
      return this.field14050[0];
   }

   public int method8853() {
      return this.field14050[1];
   }

   public String method8854() {
      return this.field14050[0] + "." + this.field14050[1];
   }

   @Override
   public String toString() {
      return "Version: " + this.method8854();
   }
}
