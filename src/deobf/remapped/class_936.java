package remapped;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

public class class_936 extends class_7950 {
   private final Field field_4781;

   public class_936(Field var1) {
      super(var1.getName(), var1.getType(), var1.getGenericType());
      this.field_4781 = var1;
      var1.setAccessible(true);
   }

   @Override
   public void method_13704(Object var1, Object var2) throws Exception {
      this.field_4781.set(var1, var2);
   }

   @Override
   public Object method_13705(Object var1) {
      try {
         return this.field_4781.get(var1);
      } catch (Exception var5) {
         throw new class_5251("Unable to access field " + this.field_4781.getName() + " on object " + var1 + " : " + var5);
      }
   }

   @Override
   public List<Annotation> method_13712() {
      return class_596.<Annotation>method_2800(this.field_4781.getAnnotations());
   }

   @Override
   public <A extends Annotation> A method_13706(Class<A> var1) {
      return this.field_4781.<A>getAnnotation(var1);
   }
}
