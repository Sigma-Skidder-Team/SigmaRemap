package mapped;

public abstract class Class890 extends Class893 implements Class889 {
   private static final Class9289<Class8848> field5126 = Class9361.<Class8848>method35441(Class890.class, Class7784.field33396);

   public Class890(Class8992<? extends Class890> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class890(Class8992<? extends Class890> var1, double var2, double var4, double var6, Class1655 var8) {
      super(var1, var2, var4, var6, var8);
   }

   public Class890(Class8992<? extends Class890> var1, Class880 var2, Class1655 var3) {
      super(var1, var2, var3);
   }

   public void method3511(Class8848 var1) {
      if (var1.method32107() != this.method3512() || var1.method32141()) {
         this.method3210().method35446(field5126, Util.<Class8848>method38508(var1.method32126(), var0 -> var0.method32180(1)));
      }
   }

   public abstract Class3257 method3512();

   public Class8848 method3513() {
      return this.method3210().<Class8848>method35445(field5126);
   }

   @Override
   public Class8848 method3509() {
      Class8848 var3 = this.method3513();
      return !var3.method32105() ? var3 : new Class8848(this.method3512());
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5126, Class8848.field39973);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      Class8848 var4 = this.method3513();
      if (!var4.method32105()) {
         var1.method99("Item", var4.method32112(new Class39()));
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      Class8848 var4 = Class8848.method32104(var1.method130("Item"));
      this.method3511(var4);
   }
}
