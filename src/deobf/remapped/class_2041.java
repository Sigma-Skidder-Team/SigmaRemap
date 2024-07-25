package remapped;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class class_2041 extends class_4575 {
   public class_2041(class_4364 var1) {
      this.field_10346 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_8437 var4 = (class_8437)var1;
      Class var5 = var4.method_7230();

      try {
         return this.field_10346.method_42427(var5, var4, false);
      } catch (InstantiationException var17) {
         Object var6;
         if (!var5.isPrimitive()
            && var5 != String.class
            && !Number.class.isAssignableFrom(var5)
            && var5 != Boolean.class
            && !Date.class.isAssignableFrom(var5)
            && var5 != Character.class
            && var5 != BigInteger.class
            && var5 != BigDecimal.class
            && !Enum.class.isAssignableFrom(var5)
            && !class_9592.field_48884.equals(var4.method_7232())
            && !Calendar.class.isAssignableFrom(var5)
            && var5 != UUID.class) {
            Constructor[] var7 = var5.getDeclaredConstructors();
            int var8 = 0;
            Constructor var9 = null;

            for (Constructor var13 : var7) {
               if (var13.getParameterTypes().length == 1) {
                  var8++;
                  var9 = var13;
               }
            }

            if (var9 == null) {
               try {
                  return this.field_10346.method_42427(var5, var4, false);
               } catch (InstantiationException var14) {
                  throw new class_5251("No single argument constructor found for " + var5 + " : " + var14.getMessage());
               }
            }

            Object var18;
            if (var8 == 1) {
               var18 = this.method_9559(var9.getParameterTypes()[0], var4);
            } else {
               var18 = this.field_10346.method_42421(var4);

               try {
                  var9 = var5.getDeclaredConstructor(String.class);
               } catch (Exception var16) {
                  throw new class_5251(
                     "Can't construct a java object for scalar " + var4.method_7232() + "; No String constructor found. Exception=" + var16.getMessage(), var16
                  );
               }
            }

            try {
               var9.setAccessible(true);
               var6 = var9.newInstance(var18);
            } catch (Exception var15) {
               throw new class_8665(
                  null, null, "Can't construct a java object for scalar " + var4.method_7232() + "; exception=" + var15.getMessage(), var4.method_7224(), var15
               );
            }
         } else {
            var6 = this.method_9559(var5, var4);
         }

         return var6;
      }
   }

   private Object method_9559(Class var1, class_8437 var2) {
      Object var6;
      if (var1 == String.class) {
         class_9420 var5 = this.field_10346.field_47066.get(class_9592.field_48876);
         var6 = var5.method_43611(var2);
      } else if (var1 == Boolean.class || var1 == boolean.class) {
         class_9420 var19 = this.field_10346.field_47066.get(class_9592.field_48878);
         var6 = var19.method_43611(var2);
      } else if (var1 == Character.class || var1 == char.class) {
         class_9420 var18 = this.field_10346.field_47066.get(class_9592.field_48876);
         String var21 = (String)var18.method_43611(var2);
         if (var21.length() == 0) {
            var6 = null;
         } else {
            if (var21.length() != 1) {
               throw new class_5251("Invalid node Character: '" + var21 + "'; length: " + var21.length());
            }

            var6 = var21.charAt(0);
         }
      } else if (Date.class.isAssignableFrom(var1)) {
         class_9420 var12 = this.field_10346.field_47066.get(class_9592.field_48875);
         Date var7 = (Date)var12.method_43611(var2);
         if (var1 == Date.class) {
            var6 = var7;
         } else {
            try {
               Constructor var8 = var1.getConstructor(long.class);
               var6 = var8.newInstance(var7.getTime());
            } catch (RuntimeException var10) {
               throw var10;
            } catch (Exception var11) {
               throw new class_5251("Cannot construct: '" + var1 + "'");
            }
         }
      } else if (var1 != Float.class && var1 != Double.class && var1 != float.class && var1 != double.class && var1 != BigDecimal.class) {
         if (var1 == Byte.class
            || var1 == Short.class
            || var1 == Integer.class
            || var1 == Long.class
            || var1 == BigInteger.class
            || var1 == byte.class
            || var1 == short.class
            || var1 == int.class
            || var1 == long.class) {
            class_9420 var17 = this.field_10346.field_47066.get(class_9592.field_48877);
            var6 = var17.method_43611(var2);
            if (var1 == Byte.class || var1 == byte.class) {
               var6 = Byte.valueOf(var6.toString());
            } else if (var1 == Short.class || var1 == short.class) {
               var6 = Short.valueOf(var6.toString());
            } else if (var1 == Integer.class || var1 == int.class) {
               var6 = Integer.parseInt(var6.toString());
            } else if (var1 != Long.class && var1 != long.class) {
               var6 = new BigInteger(var6.toString());
            } else {
               var6 = Long.valueOf(var6.toString());
            }
         } else if (Enum.class.isAssignableFrom(var1)) {
            String var14 = var2.method_38816();

            try {
               var6 = Enum.valueOf(var1, var14);
            } catch (Exception var9) {
               throw new class_5251("Unable to find enum value '" + var14 + "' for enum class: " + var1.getName());
            }
         } else if (Calendar.class.isAssignableFrom(var1)) {
            class_559 var15 = new class_559();
            var15.method_43611(var2);
            var6 = var15.method_2677();
         } else if (Number.class.isAssignableFrom(var1)) {
            class_177 var16 = new class_177(this.field_10346);
            var6 = var16.method_43611(var2);
         } else if (UUID.class == var1) {
            var6 = UUID.fromString(var2.method_38816());
         } else {
            if (!this.field_10346.field_47066.containsKey(var2.method_7232())) {
               throw new class_5251("Unsupported class: " + var1);
            }

            var6 = this.field_10346.field_47066.get(var2.method_7232()).method_43611(var2);
         }
      } else if (var1 == BigDecimal.class) {
         var6 = new BigDecimal(var2.method_38816());
      } else {
         class_9420 var13 = this.field_10346.field_47066.get(class_9592.field_48881);
         var6 = var13.method_43611(var2);
         if (var1 == Float.class || var1 == float.class) {
            var6 = ((Double)var6).floatValue();
         }
      }

      return var6;
   }
}
