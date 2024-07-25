package remapped;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public class class_7432 extends class_7950 {
   private final PropertyDescriptor field_37906;
   private final boolean field_37905;
   private final boolean field_37907;

   private static Type method_33829(PropertyDescriptor var0) {
      Method var3 = var0.getReadMethod();
      if (var3 == null) {
         Method var4 = var0.getWriteMethod();
         if (var4 != null) {
            Type[] var5 = var4.getGenericParameterTypes();
            if (var5.length > 0) {
               return var5[0];
            }
         }

         return null;
      } else {
         return var3.getGenericReturnType();
      }
   }

   public class_7432(PropertyDescriptor var1) {
      super(var1.getName(), var1.getPropertyType(), method_33829(var1));
      this.field_37906 = var1;
      this.field_37905 = var1.getReadMethod() != null;
      this.field_37907 = var1.getWriteMethod() != null;
   }

   @Override
   public void method_13704(Object var1, Object var2) throws Exception {
      if (this.field_37907) {
         this.field_37906.getWriteMethod().invoke(var1, var2);
      } else {
         throw new class_5251("No writable property '" + this.method_13713() + "' on class: " + var1.getClass().getName());
      }
   }

   @Override
   public Object method_13705(Object var1) {
      try {
         this.field_37906.getReadMethod().setAccessible(true);
         return this.field_37906.getReadMethod().invoke(var1);
      } catch (Exception var5) {
         throw new class_5251("Unable to find getter for property '" + this.field_37906.getName() + "' on object " + var1 + ":" + var5);
      }
   }

   @Override
   public List<Annotation> method_13712() {
      List var3;
      if (this.method_13709() && this.method_13710()) {
         var3 = class_596.<Annotation>method_2801(this.field_37906.getReadMethod().getAnnotations(), this.field_37906.getWriteMethod().getAnnotations());
      } else if (!this.method_13709()) {
         var3 = class_596.<Annotation>method_2800(this.field_37906.getWriteMethod().getAnnotations());
      } else {
         var3 = class_596.<Annotation>method_2800(this.field_37906.getReadMethod().getAnnotations());
      }

      return var3;
   }

   @Override
   public <A extends Annotation> A method_13706(Class<A> var1) {
      Annotation var4 = null;
      if (this.method_13709()) {
         var4 = this.field_37906.getReadMethod().<Annotation>getAnnotation(var1);
      }

      if (var4 == null && this.method_13710()) {
         var4 = this.field_37906.getWriteMethod().<Annotation>getAnnotation(var1);
      }

      return (A)var4;
   }

   @Override
   public boolean method_13710() {
      return this.field_37907;
   }

   @Override
   public boolean method_13709() {
      return this.field_37905;
   }
}
