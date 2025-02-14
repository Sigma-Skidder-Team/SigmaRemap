package mapped;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public class Class2015 extends Class2014 {
   private final PropertyDescriptor field13091;
   private final boolean field13092;
   private final boolean field13093;

   private static Type method8546(PropertyDescriptor var0) {
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

   public Class2015(PropertyDescriptor var1) {
      super(var1.getName(), var1.getPropertyType(), method8546(var1));
      this.field13091 = var1;
      this.field13092 = var1.getReadMethod() != null;
      this.field13093 = var1.getWriteMethod() != null;
   }

   @Override
   public void method8542(Object var1, Object var2) throws Exception {
      if (this.field13093) {
         this.field13091.getWriteMethod().invoke(var1, var2);
      } else {
         throw new Class2478("No writable property '" + this.method8539() + "' on class: " + var1.getClass().getName());
      }
   }

   @Override
   public Object method8543(Object var1) {
      try {
         this.field13091.getReadMethod().setAccessible(true);
         return this.field13091.getReadMethod().invoke(var1);
      } catch (Exception var5) {
         throw new Class2478("Unable to find getter for property '" + this.field13091.getName() + "' on object " + var1 + ":" + var5);
      }
   }

   @Override
   public List<Annotation> method8544() {
      List var3;
      if (this.method8541() && this.method8540()) {
         var3 = Class6390.<Annotation>method19423(this.field13091.getReadMethod().getAnnotations(), this.field13091.getWriteMethod().getAnnotations());
      } else if (!this.method8541()) {
         var3 = Class6390.<Annotation>method19422(this.field13091.getWriteMethod().getAnnotations());
      } else {
         var3 = Class6390.<Annotation>method19422(this.field13091.getReadMethod().getAnnotations());
      }

      return var3;
   }

   @Override
   public <A extends Annotation> A method8545(Class<A> var1) {
      Annotation var4 = null;
      if (this.method8541()) {
         var4 = this.field13091.getReadMethod().getAnnotation(var1);
      }

      if (var4 == null && this.method8540()) {
         var4 = this.field13091.getWriteMethod().getAnnotation(var1);
      }

      return (A)var4;
   }

   @Override
   public boolean method8540() {
      return this.field13093;
   }

   @Override
   public boolean method8541() {
      return this.field13092;
   }
}
