package mapped;

import org.newdawn.slick.util.Log;
import org.newdawn.slick.util.ResourceLoader;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Class8469 {
   private HashMap field36290 = new HashMap();
   private String field36291;
   private ArrayList field36292 = new ArrayList();
   private String field36293 = "add";

   public Class8469() {
   }

   public Class8469(String var1) {
      this.field36291 = var1;
   }

   public void method29850(String var1, Class var2) {
      this.field36290.put(var1, var2);
   }

   public void method29851(String var1) {
      this.field36292.add(var1);
   }

   public void method29852(String var1) {
      this.field36293 = var1;
   }

   public void method29853(String var1) {
      this.field36291 = var1;
   }

   public Object method29854(String var1) throws Class2452 {
      return this.method29855(var1, ResourceLoader.getResourceAsStream(var1));
   }

   public Object method29855(String var1, InputStream var2) throws Class2452 {
      Class9843 var5 = new Class9843();
      Class8952 var6 = var5.method38904(var1, var2);
      return this.method29859(var6);
   }

   public Object method29856(String var1, Object var2) throws Class2452 {
      return this.method29857(var1, ResourceLoader.getResourceAsStream(var1), var2);
   }

   public Object method29857(String var1, InputStream var2, Object var3) throws Class2452 {
      Class9843 var6 = new Class9843();
      Class8952 var7 = var6.method38904(var1, var2);
      return this.method29860(var7, var3);
   }

   private Class method29858(String var1) {
      Class var4 = (Class)this.field36290.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         if (this.field36291 != null) {
            try {
               return Class.forName(this.field36291 + "." + var1);
            } catch (ClassNotFoundException var6) {
            }
         }

         return null;
      }
   }

   private Object method29859(Class8952 var1) throws Class2452 {
      return this.method29860(var1, null);
   }

   private Object method29860(Class8952 var1, Object var2) throws Class2452 {
      String var5 = var1.method32704();
      if (this.field36292.contains(var5)) {
         return null;
      } else {
         Class var6;
         if (var2 == null) {
            var6 = this.method29858(var5);
         } else {
            var6 = var2.getClass();
         }

         if (var6 == null) {
            throw new Class2452("Unable to map element " + var5 + " to a class, define the mapping");
         } else {
            try {
               if (var2 == null) {
                  var2 = var6.newInstance();
                  Method var7 = this.method29868(var6, "setXMLElementName", new Class[]{String.class});
                  if (var7 != null) {
                     this.method29867(var7, var2, new Object[]{var5});
                  }

                  Method var8 = this.method29868(var6, "setXMLElementContent", new Class[]{String.class});
                  if (var8 != null) {
                     this.method29867(var8, var2, new Object[]{var1.method32713()});
                  }
               }

               String[] var16 = var1.method32703();

               for (int var17 = 0; var17 < var16.length; var17++) {
                  String var9 = "set" + var16[var17];
                  Method var10 = this.method29864(var6, var9);
                  if (var10 == null) {
                     Field var11 = this.method29863(var6, var16[var17]);
                     if (var11 != null) {
                        String var12 = var1.method32705(var16[var17]);
                        Object var13 = this.method29861(var12, var11.getType());
                        this.method29866(var11, var2, var13);
                     } else {
                        Log.info("Unable to find property on: " + var6 + " for attribute: " + var16[var17]);
                     }
                  } else {
                     String var21 = var1.method32705(var16[var17]);
                     Object var23 = this.method29861(var21, var10.getParameterTypes()[0]);
                     this.method29867(var10, var2, new Object[]{var23});
                  }
               }

               Class9630 var18 = var1.method32714();

               for (int var19 = 0; var19 < var18.method37541(); var19++) {
                  Class8952 var20 = var18.method37542(var19);
                  Object var22 = this.method29859(var20);
                  if (var22 != null) {
                     String var24 = this.field36293;
                     Method var25 = this.method29865(var6, var24, var22.getClass());
                     if (var25 == null) {
                        Log.info("Unable to find method to add: " + var22 + " to " + var6);
                     } else {
                        this.method29867(var25, var2, new Object[]{var22});
                     }
                  }
               }

               return var2;
            } catch (InstantiationException var14) {
               throw new Class2452("Unable to instance " + var6 + " for element " + var5 + ", no zero parameter constructor?", var14);
            } catch (IllegalAccessException var15) {
               throw new Class2452("Unable to instance " + var6 + " for element " + var5 + ", no zero parameter constructor?", var15);
            }
         }
      }
   }

   private Object method29861(String var1, Class var2) throws Class2452 {
      if (var2 == String.class) {
         return var1;
      } else {
         try {
            var2 = this.method29862(var2);
            return var2.getConstructor(String.class).newInstance(var1);
         } catch (Exception var6) {
            throw new Class2452("Failed to convert: " + var1 + " to the expected primitive type: " + var2, var6);
         }
      }
   }

   private Class method29862(Class var1) {
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

   private Field method29863(Class var1, String var2) {
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

   private Method method29864(Class var1, String var2) {
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

   private Method method29865(Class var1, String var2, Class var3) {
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

   private void method29866(Field var1, Object var2, Object var3) throws Class2452 {
      try {
         var1.setAccessible(true);
         var1.set(var2, var3);
      } catch (IllegalArgumentException var11) {
         throw new Class2452("Failed to set: " + var1 + " for an XML attribute, is it valid?", var11);
      } catch (IllegalAccessException var12) {
         throw new Class2452("Failed to set: " + var1 + " for an XML attribute, is it valid?", var12);
      } finally {
         var1.setAccessible(false);
      }
   }

   private void method29867(Method var1, Object var2, Object[] var3) throws Class2452 {
      try {
         var1.setAccessible(true);
         var1.invoke(var2, var3);
      } catch (IllegalArgumentException var12) {
         throw new Class2452("Failed to invoke: " + var1 + " for an XML attribute, is it valid?", var12);
      } catch (IllegalAccessException var13) {
         throw new Class2452("Failed to invoke: " + var1 + " for an XML attribute, is it valid?", var13);
      } catch (InvocationTargetException var14) {
         throw new Class2452("Failed to invoke: " + var1 + " for an XML attribute, is it valid?", var14);
      } finally {
         var1.setAccessible(false);
      }
   }

   private Method method29868(Class var1, String var2, Class[] var3) {
      try {
         return var1.getMethod(var2, var3);
      } catch (SecurityException var7) {
         return null;
      } catch (NoSuchMethodException var8) {
         return null;
      }
   }
}
