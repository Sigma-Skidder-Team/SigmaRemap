package mapped;

public final class Class7629 extends Class7626 {
   private String field32705;

   public Class7629(Class7629 var1) {
      super(var1);
      this.method25041(var1.method25040());
   }

   public Class7629 method24990() {
      return new Class7629(this);
   }

   @Override
   public void method24983(StringBuilder var1) {
      var1.append(this.field32705);
      super.method24983(var1);
   }

   public String method25040() {
      return this.field32705;
   }

   public void method25041(String var1) {
      this.field32705 = var1;
   }

   @Override
   public String toString() {
      return "SelectorComponent(selector=" + this.method25040() + ")";
   }

   public Class7629(String var1) {
      this.field32705 = var1;
   }
}
