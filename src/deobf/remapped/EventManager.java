package remapped;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EventManager {
   public final Map<Class<? extends class_8142>, class_4182[]> field_9081 = new HashMap<Class<? extends class_8142>, class_4182[]>();
   public final Map<Class<? extends Module>, Map<Class<? extends class_8142>, List<class_4182>>> field_9083 = new HashMap<Class<? extends Module>, Map<Class<? extends class_8142>, List<class_4182>>>();
   public int field_9082 = 0;
   public long field_9084 = System.currentTimeMillis();

   public boolean method_7910(Method var1) {
      return var1.isAnnotationPresent(EventListen.class) && var1.getParameterCount() == 1 && class_8142.class.isAssignableFrom(var1.getParameterTypes()[0]);
   }

   public class_4182[] method_7912(class_4182[] var1) {
      ArrayList var4 = new ArrayList();

      for (class_863 var8 : class_863.values()) {
         for (class_4182 var12 : var1) {
            if (var12.method_19455() == var8) {
               var4.add(var12);
            }
         }
      }

      return var4.<class_4182>toArray(new class_4182[0]);
   }

   public boolean method_7918(class_4182[] var1, class_4182 var2) {
      for (class_4182 var8 : var1) {
         if (var8.equals(var2)) {
            return true;
         }
      }

      return false;
   }

   public boolean method_7916(class_4182[] var1, Class<?> var2, class_4182 var3) {
      try {
         Method var6 = var3.method_19459().getClass().getMethod(var3.method_19457().getName(), var3.method_19457().getParameterTypes());
         return !this.method_7918(var1, var3) && (var6.getDeclaringClass() == var2 || !this.method_7910(var6));
      } catch (NoSuchMethodException var7) {
         return true;
      } catch (SecurityException var8) {
         var8.printStackTrace();
         return false;
      }
   }

   public class_863 method_7907(Method var1) {
      if (!var1.isAnnotationPresent(class_5355.class)) {
         if (!var1.isAnnotationPresent(class_315.class)) {
            if (!var1.isAnnotationPresent(class_7664.class)) {
               return !var1.isAnnotationPresent(class_4249.class) ? class_863.field_4471 : class_863.field_4470;
            } else {
               return class_863.field_4473;
            }
         } else {
            return class_863.field_4467;
         }
      } else {
         return class_863.field_4472;
      }
   }

   public void method_7917(Module var1) {
      Map var4 = this.field_9083.get(var1.getClass());
      if (var4 != null) {
         for (Entry var6 : var4.entrySet()) {
            Class var7 = (Class)var6.getKey();
            LinkedHashSet var8 = new LinkedHashSet((Collection)var6.getValue());
            class_4182[] var9 = this.field_9081.getOrDefault(var7, new class_4182[0]);
            var8.addAll(Arrays.asList(var9));
            this.field_9081.put(var7, this.method_7912(var8.<class_4182>toArray(var9)));
         }
      }
   }

   public void method_7915(Module var1) {
      Map var4 = this.field_9083.get(var1.getClass());
      if (var4 != null) {
         for (Entry var6 : var4.entrySet()) {
            Class var7 = (Class)var6.getKey();
            List var8 = (List)var6.getValue();
            LinkedHashSet var9 = new LinkedHashSet<class_4182>(Arrays.asList(this.field_9081.getOrDefault(var7, new class_4182[0])));
            var9.removeAll(var8);
            this.field_9081.put(var7, var9.<class_4182>toArray(new class_4182[0]));
         }
      }

      this.method_7913();
   }

   public void subscribe(Object var1) {
      if (var1 != null) {
         boolean var4 = false;

         for (Class var5 = var1.getClass(); var5 != null; var5 = var5.getSuperclass()) {
            for (Method var9 : var5.getDeclaredMethods()) {
               if (this.method_7910(var9)) {
                  var9.setAccessible(true);
                  class_863 var10 = this.method_7907(var9);
                  Class var11 = var9.getParameterTypes()[0];
                  class_4182[] var12 = this.field_9081.get(var11);
                  if (var12 == null) {
                     this.field_9081.put(var11, var12 = new class_4182[0]);
                  }

                  class_4182 var13 = new class_4182(var1, var5, var9, var10);
                  if (this.method_7916(var12, var5, var13)) {
                     boolean var14 = Module.class.isAssignableFrom(var5) && !var9.isAnnotationPresent(class_3932.class);
                     if (!var14) {
                        var12 = Arrays.<class_4182>copyOf(var12, var12.length + 1);
                        var12[var12.length - 1] = var13;
                        this.field_9081.put(var11, this.method_7912(var12));
                        var4 = true;
                     } else if (!var13.method_19454()) {
                        Map var15 = this.field_9083.getOrDefault(var5, new HashMap<Class<? extends class_8142>, List<class_4182>>());
                        Object var16 = (List)var15.get(var11);
                        if (var16 == null) {
                           var15.put(var11, var16 = new ArrayList());
                        }

                        var16.add(var13);
                        var15.put(var11, var16);
                        this.field_9083.put(var5, var15);
                     } else {
                        class_890.field_4584.add(var1);
                     }
                  }
               }
            }
         }
      }
   }

   public void method_7911(Object var1) {
      if (var1 == null) {
         ;
      }
   }

   public void method_7913() {
      Iterator var3 = this.field_9081.values().iterator();

      while (var3.hasNext()) {
         class_4182[] var4 = (class_4182[])var3.next();
         if (var4.length == 0) {
            var3.remove();
         }
      }
   }

   public void method_7914(class_8142 var1) {
      if (var1 != null) {
         class_4182[] var4 = this.field_9081.get(var1.getClass());
         if (var4 != null) {
            int var5 = var4.length;

            try {
               for (int var6 = 0; var6 < var5; var6++) {
                  class_4182 var7 = var4[var6];
                  var7.method_19456().method_25772(var7.method_19459(), var1);
               }
            } catch (Exception var8) {
               var8.printStackTrace();
               SigmaMainClass.getInstance().method_3326().method_12864("An unhandled exception occured in an event handler's function");
            } catch (Throwable var9) {
               var9.printStackTrace();
            }
         }
      }
   }
}
