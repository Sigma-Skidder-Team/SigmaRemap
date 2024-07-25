package remapped;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class class_7950 extends class_3002 {
   private Type field_40680;
   private boolean field_40681;
   private Class<?>[] field_40679;

   public class_7950(String var1, Class<?> var2, Type var3) {
      super(var1, var2);
      this.field_40680 = var3;
      this.field_40681 = var3 == null;
   }

   @Override
   public Class<?>[] method_13708() {
      if (!this.field_40681) {
         if (!(this.field_40680 instanceof ParameterizedType)) {
            if (!(this.field_40680 instanceof GenericArrayType)) {
               if (this.field_40680 instanceof Class) {
                  Class var7 = (Class)this.field_40680;
                  if (var7.isArray()) {
                     this.field_40679 = new Class[1];
                     this.field_40679[0] = this.method_13707().getComponentType();
                  }
               }
            } else {
               Type var8 = ((GenericArrayType)this.field_40680).getGenericComponentType();
               if (var8 instanceof Class) {
                  this.field_40679 = new Class[]{(Class)var8};
               }
            }
         } else {
            ParameterizedType var3 = (ParameterizedType)this.field_40680;
            Type[] var4 = var3.getActualTypeArguments();
            if (var4.length > 0) {
               this.field_40679 = new Class[var4.length];

               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (!(var4[var5] instanceof Class)) {
                     if (!(var4[var5] instanceof ParameterizedType)) {
                        if (!(var4[var5] instanceof GenericArrayType)) {
                           this.field_40679 = null;
                           break;
                        }

                        Type var6 = ((GenericArrayType)var4[var5]).getGenericComponentType();
                        if (!(var6 instanceof Class)) {
                           this.field_40679 = null;
                           break;
                        }

                        this.field_40679[var5] = Array.newInstance((Class<?>)var6, 0).getClass();
                     } else {
                        this.field_40679[var5] = (Class<?>)((ParameterizedType)var4[var5]).getRawType();
                     }
                  } else {
                     this.field_40679[var5] = (Class<?>)var4[var5];
                  }
               }
            }
         }

         this.field_40681 = true;
      }

      return this.field_40679;
   }
}
