package mapped;

public enum Class2214 {
   field14475(Boolean.TRUE),
   field14476(Boolean.FALSE),
   field14477(null);

   private Boolean field14478;
   private static final Class2214[] field14479 = new Class2214[]{field14475, field14476, field14477};

   private Class2214(Boolean var3) {
      this.field14478 = var3;
   }

   public Boolean method8943() {
      return this.field14478;
   }

   @Override
   public String toString() {
      return "Flow style: '" + this.field14478 + "'";
   }
}
