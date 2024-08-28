package mapped;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

public class Class2016 extends Class2014 {
   private final Field field13094;

   public Class2016(Field var1) {
      super(var1.getName(), var1.getType(), var1.getGenericType());
      this.field13094 = var1;
      var1.setAccessible(true);
   }

   @Override
   public void method8542(Object var1, Object var2) throws Exception {
      this.field13094.set(var1, var2);
   }

   @Override
   public Object method8543(Object var1) {
      try {
         return this.field13094.get(var1);
      } catch (Exception var5) {
         throw new Class2478("Unable to access field " + this.field13094.getName() + " on object " + var1 + " : " + var5);
      }
   }

   @Override
   public List<Annotation> method8544() {
      return Class6390.<Annotation>method19422(this.field13094.getAnnotations());
   }

   @Override
   public <A extends Annotation> A method8545(Class<A> var1) {
      return this.field13094.<A>getAnnotation(var1);
   }
}
