package mapped;

public abstract class Class4566 extends Class4586 {
   public Class1713 field22004;

   public Class4566(Class1656 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public Class4566(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public void method14502(Class1713 var1) {
      this.field22004 = var1;
   }

   @Override
   public float method14503() {
      return this.field22004.method7459();
   }

   @Override
   public float method14504() {
      return this.field22004.method7460();
   }

   @Override
   public float method14505() {
      return this.field22004.method7462();
   }

   @Override
   public float method14506() {
      return this.field22004.method7463();
   }

   public void method14507(Class8975 var1) {
      this.method14502(var1.method32938(this.field22054));
   }

   public void method14508(Class8975 var1) {
      this.method14502(var1.method32937(this.field22055, this.field22056));
   }
}