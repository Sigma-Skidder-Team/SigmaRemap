package mapped;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Class4642 extends Class4626 {
   public final Class6210 field22168;

   public Class4642(Class6210 var1) {
      this.field22168 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Class7256 var4 = (Class7256)var1;
      Class var5 = var4.method22784();

      try {
         return this.field22168.method19173(var5, var4, false);
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
            && !Class9757.field45636.equals(var4.method22780())
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
                  return this.field22168.method19173(var5, var4, false);
               } catch (InstantiationException var14) {
                  throw new Class2478("No single argument constructor found for " + var5 + " : " + var14.getMessage());
               }
            }

            Object var18;
            if (var8 == 1) {
               var18 = this.method14594(var9.getParameterTypes()[0], var4);
            } else {
               var18 = this.field22168.method19165(var4);

               try {
                  var9 = var5.getDeclaredConstructor(String.class);
               } catch (Exception var16) {
                  throw new Class2478(
                     "Can't construct a java object for scalar " + var4.method22780() + "; No String constructor found. Exception=" + var16.getMessage(), var16
                  );
               }
            }

            try {
               var9.setAccessible(true);
               var6 = var9.newInstance(var18);
            } catch (Exception var15) {
               throw new Class2482(
                  null, null, "Can't construct a java object for scalar " + var4.method22780() + "; exception=" + var15.getMessage(), var4.method22782(), var15
               );
            }
         } else {
            var6 = this.method14594(var5, var4);
         }

         return var6;
      }
   }

   private Object method14594(Class var1, Class7256 var2) {
      Object var6;
      if (var1 == String.class) {
         Class4632 var5 = this.field22168.field27702.get(Class9757.field45642);
         var6 = var5.method14587(var2);
      } else if (var1 == Boolean.class || var1 == boolean.class) {
         Class4632 var19 = this.field22168.field27702.get(Class9757.field45640);
         var6 = var19.method14587(var2);
      } else if (var1 == Character.class || var1 == char.class) {
         Class4632 var18 = this.field22168.field27702.get(Class9757.field45642);
         String var21 = (String)var18.method14587(var2);
         if (var21.length() == 0) {
            var6 = null;
         } else {
            if (var21.length() != 1) {
               throw new Class2478("Invalid node Character: '" + var21 + "'; length: " + var21.length());
            }

            var6 = var21.charAt(0);
         }
      } else if (Date.class.isAssignableFrom(var1)) {
         Class4632 var12 = this.field22168.field27702.get(Class9757.field45639);
         Date var7 = (Date)var12.method14587(var2);
         if (var1 == Date.class) {
            var6 = var7;
         } else {
            try {
               Constructor var8 = var1.getConstructor(long.class);
               var6 = var8.newInstance(var7.getTime());
            } catch (RuntimeException var10) {
               throw var10;
            } catch (Exception var11) {
               throw new Class2478("Cannot construct: '" + var1 + "'");
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
            Class4632 var17 = this.field22168.field27702.get(Class9757.field45637);
            var6 = var17.method14587(var2);
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
            String var14 = var2.method22791();

            try {
               var6 = Enum.valueOf(var1, var14);
            } catch (Exception var9) {
               throw new Class2478("Unable to find enum value '" + var14 + "' for enum class: " + var1.getName());
            }
         } else if (Calendar.class.isAssignableFrom(var1)) {
            Class4645 var15 = new Class4645();
            var15.method14587(var2);
            var6 = var15.method14595();
         } else if (Number.class.isAssignableFrom(var1)) {
            Class4625 var16 = new Class4625(this.field22168);
            var6 = var16.method14587(var2);
         } else if (UUID.class == var1) {
            var6 = UUID.fromString(var2.method22791());
         } else {
            if (!this.field22168.field27702.containsKey(var2.method22780())) {
               throw new Class2478("Unsupported class: " + var1);
            }

            var6 = this.field22168.field27702.get(var2.method22780()).method14587(var2);
         }
      } else if (var1 == BigDecimal.class) {
         var6 = new BigDecimal(var2.method22791());
      } else {
         Class4632 var13 = this.field22168.field27702.get(Class9757.field45638);
         var6 = var13.method14587(var2);
         if (var1 == Float.class || var1 == float.class) {
            var6 = ((Double)var6).floatValue();
         }
      }

      return var6;
   }
}
