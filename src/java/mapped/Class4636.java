package mapped;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Class4636 implements Class4632 {
   public final Class6210 field22162;

   public Class4636(Class6210 var1) {
      this.field22162 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Class7252 var4 = (Class7252)var1;
      if (Set.class.isAssignableFrom(var1.method22784())) {
         if (var1.method22787()) {
            throw new Class2478("Set cannot be recursive.");
         } else {
            return this.field22162.method19178(var4);
         }
      } else if (Collection.class.isAssignableFrom(var1.method22784())) {
         return var1.method22787() ? this.field22162.method19175(var4) : this.field22162.method19177(var4);
      } else if (var1.method22784().isArray()) {
         return var1.method22787() ? this.field22162.method19169(var1.method22784(), var4.method22770().size()) : this.field22162.method19179(var4);
      } else {
         List<Constructor> var5 = new ArrayList<>(var4.method22770().size());

         for (Constructor var9 : var1.method22784().getDeclaredConstructors()) {
            if (var4.method22770().size() == var9.getParameterTypes().length) {
               var5.add(var9);
            }
         }

         if (!var5.isEmpty()) {
            if (var5.size() == 1) {
               Object[] var17 = new Object[var4.method22770().size()];
               Constructor var19 = (Constructor)var5.get(0);
               int var21 = 0;

               for (Class7255 var26 : var4.method22770()) {
                  Class var27 = var19.getParameterTypes()[var21];
                  var26.method22785(var27);
                  var17[var21++] = this.field22162.method19163(var26);
               }

               try {
                  var19.setAccessible(true);
                  return var19.newInstance(var17);
               } catch (Exception var14) {
                  throw new Class2478(var14);
               }
            }

            List var16 = this.field22162.method19177(var4);
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
                  if (!this.method14592(var11[var13]).isAssignableFrom(var18[var13])) {
                     var12 = false;
                     break;
                  }
               }

               if (var12) {
                  try {
                     var25.setAccessible(true);
                     return var25.newInstance(var16.toArray());
                  } catch (Exception var15) {
                     throw new Class2478(var15);
                  }
               }
            }
         }

         throw new Class2478("No suitable constructor with " + String.valueOf(var4.method22770().size()) + " arguments found for " + var1.method22784());
      }
   }

   private final Class<? extends Object> method14592(Class<?> var1) {
      if (var1.isPrimitive()) {
         if (var1 != int.class) {
            if (var1 != float.class) {
               if (var1 != double.class) {
                  if (var1 != boolean.class) {
                     if (var1 != long.class) {
                        if (var1 != char.class) {
                           if (var1 != short.class) {
                              if (var1 != byte.class) {
                                 throw new Class2478("Unexpected primitive " + var1);
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
   public void method14588(Class7255 var1, Object var2) {
      Class7252 var5 = (Class7252)var1;
      if (!List.class.isAssignableFrom(var1.method22784())) {
         if (!var1.method22784().isArray()) {
            throw new Class2478("Immutable objects cannot be recursive.");
         }

         this.field22162.method19181(var5, var2);
      } else {
         List var6 = (List)var2;
         this.field22162.method19180(var5, var6);
      }
   }
}
