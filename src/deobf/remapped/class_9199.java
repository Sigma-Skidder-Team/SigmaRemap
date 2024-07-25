package remapped;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class class_9199 {
   public final Map<class_99, class_9420> field_47065 = new EnumMap<class_99, class_9420>(class_99.class);
   public final Map<class_9592, class_9420> field_47066 = new HashMap<class_9592, class_9420>();
   public final Map<String, class_9420> field_47058 = new HashMap<String, class_9420>();
   public class_7464 field_47069;
   public final Map<class_1621, Object> field_47063;
   private final Set<class_1621> field_47067;
   private final ArrayList<class_839<Map<Object, Object>, class_839<Object, Object>>> field_47064;
   private final ArrayList<class_839<Set<Object>, Object>> field_47071;
   public class_9592 field_47068;
   private class_6402 field_47060;
   private boolean field_47070;
   private boolean field_47059 = true;
   public final Map<Class<? extends Object>, class_8795> field_47062;
   public final Map<class_9592, Class<? extends Object>> field_47061;

   public class_9199() {
      this.field_47063 = new HashMap<class_1621, Object>();
      this.field_47067 = new HashSet<class_1621>();
      this.field_47064 = new ArrayList<class_839<Map<Object, Object>, class_839<Object, Object>>>();
      this.field_47071 = new ArrayList<class_839<Set<Object>, Object>>();
      this.field_47062 = new HashMap<Class<? extends Object>, class_8795>();
      this.field_47061 = new HashMap<class_9592, Class<? extends Object>>();
      this.field_47068 = null;
      this.field_47070 = false;
      this.field_47062.put(SortedMap.class, new class_8795(SortedMap.class, class_9592.field_48886, TreeMap.class));
      this.field_47062.put(SortedSet.class, new class_8795(SortedSet.class, class_9592.field_48883, TreeSet.class));
   }

   public void method_42435(class_7464 var1) {
      this.field_47069 = var1;
   }

   public boolean method_42420() {
      return this.field_47069.method_33976();
   }

   public Object method_42404() {
      this.field_47069.method_33976();
      class_1621 var3 = this.field_47069.method_33973();
      if (this.field_47068 != null) {
         var3.method_7227(this.field_47068);
      }

      return this.method_42403(var3);
   }

   public Object method_42410(Class<?> var1) {
      class_1621 var4 = this.field_47069.method_33970();
      if (var4 != null && !class_9592.field_48873.equals(var4.method_7232())) {
         if (Object.class == var1) {
            if (this.field_47068 != null) {
               var4.method_7227(this.field_47068);
            }
         } else {
            var4.method_7227(new class_9592(var1));
         }

         return this.method_42403(var4);
      } else {
         return null;
      }
   }

   public final Object method_42403(class_1621 var1) {
      Object var4 = this.method_42411(var1);
      this.method_42413();
      this.field_47063.clear();
      this.field_47067.clear();
      return var4;
   }

   private void method_42413() {
      if (!this.field_47064.isEmpty()) {
         for (class_839 var4 : this.field_47064) {
            class_839 var5 = (class_839)var4.method_3676();
            ((Map)var4.method_3678()).put(var5.method_3678(), var5.method_3676());
         }

         this.field_47064.clear();
      }

      if (!this.field_47071.isEmpty()) {
         for (class_839 var7 : this.field_47071) {
            ((Set)var7.method_3678()).add(var7.method_3676());
         }

         this.field_47071.clear();
      }
   }

   public Object method_42411(class_1621 var1) {
      return !this.field_47063.containsKey(var1) ? this.method_42417(var1) : this.field_47063.get(var1);
   }

   public Object method_42417(class_1621 var1) {
      if (!this.field_47067.contains(var1)) {
         this.field_47067.add(var1);
         class_9420 var4 = this.method_42418(var1);
         Object var5 = !this.field_47063.containsKey(var1) ? var4.method_43611(var1) : this.field_47063.get(var1);
         this.method_42434(var1, var5);
         this.field_47063.put(var1, var5);
         this.field_47067.remove(var1);
         if (var1.method_7225()) {
            var4.method_43612(var1, var5);
         }

         return var5;
      } else {
         throw new class_8665(null, null, "found unconstructable recursive node", var1.method_7224());
      }
   }

   public class_9420 method_42418(class_1621 var1) {
      if (var1.method_7223()) {
         return this.field_47065.get(var1.method_7221());
      } else {
         class_9420 var4 = this.field_47066.get(var1.method_7232());
         if (var4 != null) {
            return var4;
         } else {
            for (String var6 : this.field_47058.keySet()) {
               if (var1.method_7232().method_44296(var6)) {
                  return this.field_47058.get(var6);
               }
            }

            return this.field_47066.get(null);
         }
      }
   }

   public String method_42421(class_8437 var1) {
      return var1.method_38816();
   }

   public List<Object> method_42419(int var1) {
      return new ArrayList<Object>(var1);
   }

   public Set<Object> method_42415(int var1) {
      return new LinkedHashSet<Object>(var1);
   }

   public Map<Object, Object> method_42409(int var1) {
      return new LinkedHashMap<Object, Object>(var1);
   }

   public Object method_42430(Class<?> var1, int var2) {
      return Array.newInstance(var1.getComponentType(), var2);
   }

   public Object method_42434(class_1621 var1, Object var2) {
      Class var5 = var1.method_7230();
      return !this.field_47062.containsKey(var5) ? var2 : this.field_47062.get(var5).method_40421(var2);
   }

   public Object method_42428(class_1621 var1) {
      try {
         return this.method_42426(Object.class, var1);
      } catch (InstantiationException var5) {
         throw new class_5251(var5);
      }
   }

   public final Object method_42426(Class<?> var1, class_1621 var2) throws InstantiationException {
      return this.method_42427(var1, var2, true);
   }

   public Object method_42427(Class<?> var1, class_1621 var2, boolean var3) throws InstantiationException {
      Class var6 = var2.method_7230();
      if (this.field_47062.containsKey(var6)) {
         class_8795 var7 = this.field_47062.get(var6);
         Object var8 = var7.method_40417(var2);
         if (var8 != null) {
            return var8;
         }
      }

      if (var3 && var1.isAssignableFrom(var6) && !Modifier.isAbstract(var6.getModifiers())) {
         try {
            Constructor var11 = var6.getDeclaredConstructor();
            var11.setAccessible(true);
            return var11.newInstance();
         } catch (NoSuchMethodException var9) {
            throw new InstantiationException("NoSuchMethodException:" + var9.getLocalizedMessage());
         } catch (Exception var10) {
            throw new class_5251(var10);
         }
      } else {
         throw new InstantiationException();
      }
   }

   public Set<Object> method_42436(class_2233<?> var1) {
      try {
         return (Set<Object>)this.method_42426(Set.class, var1);
      } catch (InstantiationException var5) {
         return this.method_42415(var1.method_10282().size());
      }
   }

   public List<Object> method_42412(class_1596 var1) {
      try {
         return (List<Object>)this.method_42426(List.class, var1);
      } catch (InstantiationException var5) {
         return this.method_42419(var1.method_10282().size());
      }
   }

   public Map<Object, Object> method_42438(class_7984 var1) {
      try {
         return (Map<Object, Object>)this.method_42426(Map.class, var1);
      } catch (InstantiationException var5) {
         return this.method_42409(var1.method_10282().size());
      }
   }

   public List<? extends Object> method_42405(class_1596 var1) {
      List var4 = this.method_42412(var1);
      this.method_42433(var1, var4);
      return var4;
   }

   public Set<? extends Object> method_42406(class_1596 var1) {
      Set var4 = this.method_42436(var1);
      this.method_42433(var1, var4);
      return var4;
   }

   public Object method_42437(class_1596 var1) {
      return this.method_42422(var1, this.method_42430(var1.method_7230(), var1.method_10282().size()));
   }

   public void method_42433(class_1596 var1, Collection<Object> var2) {
      for (class_1621 var6 : var1.method_10282()) {
         var2.add(this.method_42411(var6));
      }
   }

   public Object method_42422(class_1596 var1, Object var2) {
      Class var5 = var1.method_7230().getComponentType();
      int var6 = 0;

      for (class_1621 var8 : var1.method_10282()) {
         if (var8.method_7230() == Object.class) {
            var8.method_7226(var5);
         }

         Object var9 = this.method_42411(var8);
         if (!var5.isPrimitive()) {
            Array.set(var2, var6, var9);
         } else {
            if (var9 == null) {
               throw new NullPointerException("Unable to construct element value for " + var8);
            }

            if (!byte.class.equals(var5)) {
               if (!short.class.equals(var5)) {
                  if (!int.class.equals(var5)) {
                     if (!long.class.equals(var5)) {
                        if (!float.class.equals(var5)) {
                           if (!double.class.equals(var5)) {
                              if (!char.class.equals(var5)) {
                                 if (!boolean.class.equals(var5)) {
                                    throw new class_5251("unexpected primitive type");
                                 }

                                 Array.setBoolean(var2, var6, (Boolean)var9);
                              } else {
                                 Array.setChar(var2, var6, (Character)var9);
                              }
                           } else {
                              Array.setDouble(var2, var6, ((Number)var9).doubleValue());
                           }
                        } else {
                           Array.setFloat(var2, var6, ((Number)var9).floatValue());
                        }
                     } else {
                        Array.setLong(var2, var6, ((Number)var9).longValue());
                     }
                  } else {
                     Array.setInt(var2, var6, ((Number)var9).intValue());
                  }
               } else {
                  Array.setShort(var2, var6, ((Number)var9).shortValue());
               }
            } else {
               Array.setByte(var2, var6, ((Number)var9).byteValue());
            }
         }

         var6++;
      }

      return var2;
   }

   public Set<Object> method_42407(class_7984 var1) {
      Set var4 = this.method_42436(var1);
      this.method_42408(var1, var4);
      return var4;
   }

   public Map<Object, Object> method_42423(class_7984 var1) {
      Map var4 = this.method_42438(var1);
      this.method_42414(var1, var4);
      return var4;
   }

   public void method_42414(class_7984 var1, Map<Object, Object> var2) {
      for (class_8473 var7 : var1.method_10282()) {
         class_1621 var8 = var7.method_38998();
         class_1621 var9 = var7.method_38999();
         Object var10 = this.method_42411(var8);
         if (var10 != null) {
            try {
               var10.hashCode();
            } catch (Exception var12) {
               throw new class_8665(
                  "while constructing a mapping", var1.method_7224(), "found unacceptable key " + var10, var7.method_38998().method_7224(), var12
               );
            }
         }

         Object var11 = this.method_42411(var9);
         if (var8.method_7225()) {
            this.field_47064.add(0, new class_839<Map<Object, Object>, class_839<Object, Object>>(var2, new class_839<Object, Object>(var10, var11)));
         } else {
            var2.put(var10, var11);
         }
      }
   }

   public void method_42408(class_7984 var1, Set<Object> var2) {
      for (class_8473 var7 : var1.method_10282()) {
         class_1621 var8 = var7.method_38998();
         Object var9 = this.method_42411(var8);
         if (var9 != null) {
            try {
               var9.hashCode();
            } catch (Exception var11) {
               throw new class_8665("while constructing a Set", var1.method_7224(), "found unacceptable key " + var9, var7.method_38998().method_7224(), var11);
            }
         }

         if (var8.method_7225()) {
            this.field_47071.add(0, new class_839<Set<Object>, Object>(var2, var9));
         } else {
            var2.add(var9);
         }
      }
   }

   public void method_42429(class_6402 var1) {
      this.field_47060 = var1;
      this.field_47070 = true;

      for (class_8795 var6 : this.field_47062.values()) {
         var6.method_40408(var1);
      }
   }

   public final class_6402 method_42416() {
      if (this.field_47060 == null) {
         this.field_47060 = new class_6402();
      }

      return this.field_47060;
   }

   public class_8795 method_42432(class_8795 var1) {
      if (var1 != null) {
         class_9592 var4 = var1.method_40412();
         this.field_47061.put(var4, var1.method_40413());
         var1.method_40408(this.method_42416());
         return this.field_47062.put(var1.method_40413(), var1);
      } else {
         throw new NullPointerException("TypeDescription is required.");
      }
   }

   public final boolean method_42431() {
      return this.field_47070;
   }

   public boolean method_42425() {
      return this.field_47059;
   }

   public void method_42439(boolean var1) {
      this.field_47059 = var1;
   }
}
