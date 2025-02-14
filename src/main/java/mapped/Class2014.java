package mapped;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class Class2014 extends Class2013 {
   private Type field13088;
   private boolean field13089;
   private Class<?>[] field13090;

   public Class2014(String var1, Class<?> var2, Type var3) {
      super(var1, var2);
      this.field13088 = var3;
      this.field13089 = var3 == null;
   }

   @Override
   public Class<?>[] method8538() {
      if (!this.field13089) {
         if (!(this.field13088 instanceof ParameterizedType)) {
            if (!(this.field13088 instanceof GenericArrayType)) {
               if (this.field13088 instanceof Class) {
                  Class var7 = (Class)this.field13088;
                  if (var7.isArray()) {
                     this.field13090 = new Class[1];
                     this.field13090[0] = this.method8537().getComponentType();
                  }
               }
            } else {
               Type var8 = ((GenericArrayType)this.field13088).getGenericComponentType();
               if (var8 instanceof Class) {
                  this.field13090 = new Class[]{(Class)var8};
               }
            }
         } else {
            ParameterizedType var3 = (ParameterizedType)this.field13088;
            Type[] var4 = var3.getActualTypeArguments();
            if (var4.length > 0) {
               this.field13090 = new Class[var4.length];

               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (!(var4[var5] instanceof Class)) {
                     if (!(var4[var5] instanceof ParameterizedType)) {
                        if (!(var4[var5] instanceof GenericArrayType)) {
                           this.field13090 = null;
                           break;
                        }

                        Type var6 = ((GenericArrayType)var4[var5]).getGenericComponentType();
                        if (!(var6 instanceof Class)) {
                           this.field13090 = null;
                           break;
                        }

                        this.field13090[var5] = Array.newInstance((Class<?>)var6, 0).getClass();
                     } else {
                        this.field13090[var5] = (Class<?>)((ParameterizedType)var4[var5]).getRawType();
                     }
                  } else {
                     this.field13090[var5] = (Class<?>)var4[var5];
                  }
               }
            }
         }

         this.field13089 = true;
      }

      return this.field13090;
   }
}
