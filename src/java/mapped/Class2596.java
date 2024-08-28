package mapped;

import java.util.function.Predicate;

public class Class2596<T extends Class1006> extends Class2595 {
   private static String[] field16816;
   private final T field16817;
   private final Class8848 field16818;
   private final Predicate<? super T> field16819;
   private final Class9455 field16820;

   public Class2596(T var1, Class8848 var2, Class9455 var3, Predicate<? super T> var4) {
      this.field16817 = (T)var1;
      this.field16818 = var2;
      this.field16820 = var3;
      this.field16819 = var4;
   }

   @Override
   public boolean method10803() {
      return this.field16819.test(this.field16817);
   }

   @Override
   public boolean method10806() {
      return this.field16817.method3148();
   }

   @Override
   public void method10804() {
      this.field16817.method2944(Class2106.field13731, this.field16818.method32126());
      this.field16817.method3154(Class79.field182);
   }

   @Override
   public void method10807() {
      this.field16817.method2944(Class2106.field13731, Class8848.field39973);
      if (this.field16820 != null) {
         this.field16817.method2863(this.field16820, 1.0F, this.field16817.method3013().nextFloat() * 0.2F + 0.9F);
      }
   }
}
