package mapped;

public class Class8943 {
   private String field40440;
   private Class2336 field40441;
   private Class1878 field40442;
   private Class3614 field40443;

   public Class8943(String var1, Class2336 var2, Class1878 var3) {
      this.field40440 = var1;
      this.field40441 = var2;
      this.field40442 = var3;
      this.field40443 = var2.method9105(var1);
   }

   public void method32674(int var1) {
      this.field40443.method12237(var1);
   }

   public void method32675() {
      if (this.field40443.method12242()) {
         try {
            this.field40441.method9106(this.field40442, this.field40443);
         } catch (RuntimeException var4) {
            Class7399.method23632("Error updating custom uniform: " + this.field40443.method12239());
            Class7399.method23632(var4.getClass().getName() + ": " + var4.getMessage());
            this.field40443.method12243();
            Class7399.method23632("Custom uniform disabled: " + this.field40443.method12239());
         }
      }
   }

   public void method32676() {
      this.field40443.method12244();
   }

   public String method32677() {
      return this.field40440;
   }

   public Class2336 method32678() {
      return this.field40441;
   }

   public Class1878 method32679() {
      return this.field40442;
   }

   public Class3614 method32680() {
      return this.field40443;
   }

   @Override
   public String toString() {
      return this.field40441.name().toLowerCase() + " " + this.field40440;
   }
}
