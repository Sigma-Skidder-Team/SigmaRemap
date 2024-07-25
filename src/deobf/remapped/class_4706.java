package remapped;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.newdawn.slick.util.xml.SlickXMLException;

public class class_4706 {
   private HashMap field_22860 = new HashMap();
   private String field_22861;
   private ArrayList field_22863 = new ArrayList();
   private String field_22862 = "add";

   public class_4706() {
   }

   public class_4706(String var1) {
      this.field_22861 = var1;
   }

   public void method_21772(String var1, Class var2) {
      this.field_22860.put(var1, var2);
   }

   public void method_21773(String var1) {
      this.field_22863.add(var1);
   }

   public void method_21780(String var1) {
      this.field_22862 = var1;
   }

   public void method_21779(String var1) {
      this.field_22861 = var1;
   }

   public Object method_21766(String var1) throws SlickXMLException {
      return this.method_21767(var1, class_8975.method_41153(var1));
   }

   public Object method_21767(String var1, InputStream var2) throws SlickXMLException {
      class_9887 var5 = new class_9887();
      class_6500 var6 = var5.method_45547(var1, var2);
      return this.method_21776(var6);
   }

   public Object method_21771(String var1, Object var2) throws SlickXMLException {
      return this.method_21770(var1, class_8975.method_41153(var1), var2);
   }

   public Object method_21770(String var1, InputStream var2, Object var3) throws SlickXMLException {
      class_9887 var6 = new class_9887();
      class_6500 var7 = var6.method_45547(var1, var2);
      return this.method_21777(var7, var3);
   }

   private Class method_21761(String var1) {
      Class var4 = (Class)this.field_22860.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         if (this.field_22861 != null) {
            try {
               return Class.forName(this.field_22861 + "." + var1);
            } catch (ClassNotFoundException var6) {
            }
         }

         return null;
      }
   }

   private Object method_21776(class_6500 var1) throws SlickXMLException {
      return this.method_21777(var1, null);
   }

   private Object method_21777(class_6500 var1, Object var2) throws SlickXMLException {
      String var5 = var1.method_29643();
      if (this.field_22863.contains(var5)) {
         return null;
      } else {
         Class var6;
         if (var2 == null) {
            var6 = this.method_21761(var5);
         } else {
            var6 = var2.getClass();
         }

         if (var6 == null) {
            throw new class_7178("Unable to map element " + var5 + " to a class, define the mapping");
         } else {
            try {
               if (var2 == null) {
                  var2 = var6.newInstance();
                  Method var7 = this.method_21765(var6, "setXMLElementName", new Class[]{String.class});
                  if (var7 != null) {
                     this.method_21774(var7, var2, new Object[]{var5});
                  }

                  Method var8 = this.method_21765(var6, "setXMLElementContent", new Class[]{String.class});
                  if (var8 != null) {
                     this.method_21774(var8, var2, new Object[]{var1.method_29638()});
                  }
               }

               String[] var16 = var1.method_29631();

               for (int var17 = 0; var17 < var16.length; var17++) {
                  String var9 = "set" + var16[var17];
                  Method var10 = this.method_21763(var6, var9);
                  if (var10 == null) {
                     Field var11 = this.method_21762(var6, var16[var17]);
                     if (var11 != null) {
                        String var12 = var1.method_29634(var16[var17]);
                        Object var13 = this.method_21769(var12, var11.getType());
                        this.method_21768(var11, var2, var13);
                     } else {
                        class_2598.method_11779("Unable to find property on: " + var6 + " for attribute: " + var16[var17]);
                     }
                  } else {
                     String var21 = var1.method_29634(var16[var17]);
                     Object var23 = this.method_21769(var21, var10.getParameterTypes()[0]);
                     this.method_21774(var10, var2, new Object[]{var23});
                  }
               }

               class_9099 var18 = var1.method_29633();

               for (int var19 = 0; var19 < var18.method_41941(); var19++) {
                  class_6500 var20 = var18.method_41939(var19);
                  Object var22 = this.method_21776(var20);
                  if (var22 != null) {
                     String var24 = this.field_22862;
                     Method var25 = this.method_21764(var6, var24, var22.getClass());
                     if (var25 == null) {
                        class_2598.method_11779("Unable to find method to add: " + var22 + " to " + var6);
                     } else {
                        this.method_21774(var25, var2, new Object[]{var22});
                     }
                  }
               }

               return var2;
            } catch (InstantiationException var14) {
               throw new class_7178("Unable to instance " + var6 + " for element " + var5 + ", no zero parameter constructor?", var14);
            } catch (IllegalAccessException var15) {
               throw new class_7178("Unable to instance " + var6 + " for element " + var5 + ", no zero parameter constructor?", var15);
            }
         }
      }
   }

   private Object method_21769(String var1, Class var2) throws SlickXMLException {
      if (var2 == String.class) {
         return var1;
      } else {
         try {
            var2 = this.method_21778(var2);
            return var2.getConstructor(String.class).newInstance(var1);
         } catch (Exception var6) {
            throw new class_7178("Failed to convert: " + var1 + " to the expected primitive type: " + var2, var6);
         }
      }
   }

   private Class method_21778(Class var1) {
      if (var1 != int.class) {
         if (var1 != double.class) {
            if (var1 != float.class) {
               if (var1 != boolean.class) {
                  if (var1 != long.class) {
                     throw new RuntimeException("Unsupported primitive: " + var1);
                  } else {
                     return Long.class;
                  }
               } else {
                  return Boolean.class;
               }
            } else {
               return Float.class;
            }
         } else {
            return Double.class;
         }
      } else {
         return Integer.class;
      }
   }

   private Field method_21762(Class var1, String var2) {
      Field[] var5 = var1.getDeclaredFields();

      for (int var6 = 0; var6 < var5.length; var6++) {
         if (var5[var6].getName().equalsIgnoreCase(var2)) {
            if (var5[var6].getType().isPrimitive()) {
               return var5[var6];
            }

            if (var5[var6].getType() == String.class) {
               return var5[var6];
            }
         }
      }

      return null;
   }

   private Method method_21763(Class var1, String var2) {
      Method[] var5 = var1.getDeclaredMethods();

      for (int var6 = 0; var6 < var5.length; var6++) {
         if (var5[var6].getName().equalsIgnoreCase(var2)) {
            Method var7 = var5[var6];
            Class[] var8 = var7.getParameterTypes();
            if (var8.length == 1) {
               return var7;
            }
         }
      }

      return null;
   }

   private Method method_21764(Class var1, String var2, Class var3) {
      Method[] var6 = var1.getDeclaredMethods();

      for (int var7 = 0; var7 < var6.length; var7++) {
         if (var6[var7].getName().equalsIgnoreCase(var2)) {
            Method var8 = var6[var7];
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == 1 && var8.getParameterTypes()[0].isAssignableFrom(var3)) {
               return var8;
            }
         }
      }

      return null;
   }

   private void method_21768(Field var1, Object var2, Object var3) throws SlickXMLException {
      try {
         var1.setAccessible(true);
         var1.set(var2, var3);
      } catch (IllegalArgumentException var11) {
         throw new class_7178("Failed to set: " + var1 + " for an XML attribute, is it valid?", var11);
      } catch (IllegalAccessException var12) {
         throw new class_7178("Failed to set: " + var1 + " for an XML attribute, is it valid?", var12);
      } finally {
         var1.setAccessible(false);
      }
   }

   private void method_21774(Method var1, Object var2, Object[] var3) throws SlickXMLException {
      try {
         var1.setAccessible(true);
         var1.invoke(var2, var3);
      } catch (IllegalArgumentException var12) {
         throw new class_7178("Failed to invoke: " + var1 + " for an XML attribute, is it valid?", var12);
      } catch (IllegalAccessException var13) {
         throw new class_7178("Failed to invoke: " + var1 + " for an XML attribute, is it valid?", var13);
      } catch (InvocationTargetException var14) {
         throw new class_7178("Failed to invoke: " + var1 + " for an XML attribute, is it valid?", var14);
      } finally {
         var1.setAccessible(false);
      }
   }

   private Method method_21765(Class var1, String var2, Class[] var3) {
      try {
         return var1.getMethod(var2, var3);
      } catch (SecurityException var7) {
         return null;
      } catch (NoSuchMethodException var8) {
         return null;
      }
   }
}
