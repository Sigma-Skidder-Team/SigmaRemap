package mapped;

public final class Class7625 extends Class7626 {
   private String field32687;
   private String field32688;
   private String field32689 = "";

   public Class7625(String var1, String var2) {
      this.method24987(var1);
      this.method24988(var2);
   }

   public Class7625(Class7625 var1) {
      super(var1);
      this.method24987(var1.method24984());
      this.method24988(var1.method24985());
      this.method24989(var1.method24986());
   }

   public Class7625 method24990() {
      return new Class7625(this);
   }

   @Override
   public void method24983(StringBuilder var1) {
      var1.append(this.field32689);
      super.method24983(var1);
   }

   public String method24984() {
      return this.field32687;
   }

   public String method24985() {
      return this.field32688;
   }

   public String method24986() {
      return this.field32689;
   }

   public void method24987(String var1) {
      this.field32687 = var1;
   }

   public void method24988(String var1) {
      this.field32688 = var1;
   }

   public void method24989(String var1) {
      this.field32689 = var1;
   }

   @Override
   public String toString() {
      return "ScoreComponent(name=" + this.method24984() + ", objective=" + this.method24985() + ", value=" + this.method24986() + ")";
   }

   public Class7625(String var1, String var2, String var3) {
      this.field32687 = var1;
      this.field32688 = var2;
      this.field32689 = var3;
   }
}
