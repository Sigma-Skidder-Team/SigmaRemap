package mapped;

public abstract class Class3032<T1, T2> implements Class3007<T1> {
   private final BruhMotha<T1> field18181;
   private final BruhMotha<T2> field18182;

   public Class3032(BruhMotha<T1> var1, BruhMotha<T2> var2) {
      this.field18181 = var1;
      this.field18182 = var2;
   }

   public Class3032(BruhMotha<T2> var1) {
      this(null, var1);
   }

   public abstract T2 method11402(Class8563 var1, T1 var2) throws Exception;

   @Override
   public void method11399(Class8563 var1, T1 var2) throws Exception {
      try {
         var1.method30560(this.field18182, this.method11402(var1, (T1)var2));
      } catch (Class2447 var6) {
         var6.method10459(this.getClass());
         throw var6;
      }
   }


   public BruhMotha<T1> method11403() {
      return this.field18181;
   }

   public BruhMotha<T2> method11404() {
      return this.field18182;
   }
}
