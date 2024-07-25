package remapped;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class class_3653 implements class_9420 {
   public class_3653(class_4364 var1) {
      this.field_17797 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_1596 var4 = (class_1596)var1;
      if (Set.class.isAssignableFrom(var1.method_7230())) {
         if (var1.method_7225()) {
            throw new class_5251("Set cannot be recursive.");
         } else {
            return this.field_17797.method_42406(var4);
         }
      } else if (Collection.class.isAssignableFrom(var1.method_7230())) {
         return var1.method_7225() ? this.field_17797.method_42412(var4) : this.field_17797.method_42405(var4);
      } else if (var1.method_7230().isArray()) {
         return var1.method_7225() ? this.field_17797.method_42430(var1.method_7230(), var4.method_10282().size()) : this.field_17797.method_42437(var4);
      } else {
         ArrayList var5 = new ArrayList(var4.method_10282().size());

         for (Constructor var9 : var1.method_7230().getDeclaredConstructors()) {
            if (var4.method_10282().size() == var9.getParameterTypes().length) {
               var5.add(var9);
            }
         }

         if (!var5.isEmpty()) {
            if (var5.size() == 1) {
               Object[] var17 = new Object[var4.method_10282().size()];
               Constructor var19 = (Constructor)var5.get(0);
               int var21 = 0;

               for (class_1621 var26 : var4.method_10282()) {
                  Class var27 = var19.getParameterTypes()[var21];
                  var26.method_7226(var27);
                  var17[var21++] = this.field_17797.method_42411(var26);
               }

               try {
                  var19.setAccessible(true);
                  return var19.newInstance(var17);
               } catch (Exception var14) {
                  throw new class_5251(var14);
               }
            }

            List var16 = this.field_17797.method_42405(var4);
            Class[] var18 = new Class[var16.size()];
            int var20 = 0;

            for (Object var10 : var16) {
               var18[var20] = var10.getClass();
               var20++;
            }

            for (Constructor var25 : var5) {
               Class[] var11 = var25.getParameterTypes();
               boolean var12 = true;

               for (int var13 = 0; var13 < var11.length; var13++) {
                  if (!this.method_16982(var11[var13]).isAssignableFrom(var18[var13])) {
                     var12 = false;
                     break;
                  }
               }

               if (var12) {
                  try {
                     var25.setAccessible(true);
                     return var25.newInstance(var16.toArray());
                  } catch (Exception var15) {
                     throw new class_5251(var15);
                  }
               }
            }
         }

         throw new class_5251("No suitable constructor with " + String.valueOf(var4.method_10282().size()) + " arguments found for " + var1.method_7230());
      }
   }

   private final Class<? extends Object> method_16982(Class<?> var1) {
      if (var1.isPrimitive()) {
         if (var1 != int.class) {
            if (var1 != float.class) {
               if (var1 != double.class) {
                  if (var1 != boolean.class) {
                     if (var1 != long.class) {
                        if (var1 != char.class) {
                           if (var1 != short.class) {
                              if (var1 != byte.class) {
                                 throw new class_5251("Unexpected primitive " + var1);
                              } else {
                                 return Byte.class;
                              }
                           } else {
                              return Short.class;
                           }
                        } else {
                           return Character.class;
                        }
                     } else {
                        return Long.class;
                     }
                  } else {
                     return Boolean.class;
                  }
               } else {
                  return Double.class;
               }
            } else {
               return Float.class;
            }
         } else {
            return Integer.class;
         }
      } else {
         return var1;
      }
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      class_1596 var5 = (class_1596)var1;
      if (!List.class.isAssignableFrom(var1.method_7230())) {
         if (!var1.method_7230().isArray()) {
            throw new class_5251("Immutable objects cannot be recursive.");
         }

         this.field_17797.method_42422(var5, var2);
      } else {
         List var6 = (List)var2;
         this.field_17797.method_42433(var5, var6);
      }
   }
}
