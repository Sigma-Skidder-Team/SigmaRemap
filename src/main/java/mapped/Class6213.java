package mapped;

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

public abstract class Class6213 {
   public final Map<Class2048, Class4632> field27701 = new EnumMap<Class2048, Class4632>(Class2048.class);
   public final Map<Class9757, Class4632> field27702 = new HashMap<Class9757, Class4632>();
   public final Map<String, Class4632> field27703 = new HashMap<String, Class4632>();
   public Class9205 field27704;
   public final Map<Class7255, Object> field27705;
   private final Set<Class7255> field27706;
   private final ArrayList<Class6642<Map<Object, Object>, Class6642<Object, Object>>> field27707;
   private final ArrayList<Class6642<Set<Object>, Object>> field27708;
   public Class9757 field27709;
   private Class8923 field27710;
   private boolean field27711;
   private boolean field27712 = true;
   public final Map<Class<? extends Object>, Class9545> field27713;
   public final Map<Class9757, Class<? extends Object>> field27714;

   public Class6213() {
      this.field27705 = new HashMap<Class7255, Object>();
      this.field27706 = new HashSet<Class7255>();
      this.field27707 = new ArrayList<Class6642<Map<Object, Object>, Class6642<Object, Object>>>();
      this.field27708 = new ArrayList<Class6642<Set<Object>, Object>>();
      this.field27713 = new HashMap<Class<? extends Object>, Class9545>();
      this.field27714 = new HashMap<Class9757, Class<? extends Object>>();
      this.field27709 = null;
      this.field27711 = false;
      this.field27713.put(SortedMap.class, new Class9545(SortedMap.class, Class9757.field45635, TreeMap.class));
      this.field27713.put(SortedSet.class, new Class9545(SortedSet.class, Class9757.field45633, TreeSet.class));
   }

   public void method19157(Class9205 var1) {
      this.field27704 = var1;
   }

   public boolean method19158() {
      return this.field27704.method34495();
   }

   public Object method19159() {
      this.field27704.method34495();
      Class7255 var3 = this.field27704.method34496();
      if (this.field27709 != null) {
         var3.method22783(this.field27709);
      }

      return this.method19161(var3);
   }

   public Object method19160(Class<?> var1) {
      Class7255 var4 = this.field27704.method34497();
      if (var4 != null && !Class9757.field45641.equals(var4.method22780())) {
         if (Object.class == var1) {
            if (this.field27709 != null) {
               var4.method22783(this.field27709);
            }
         } else {
            var4.method22783(new Class9757(var1));
         }

         return this.method19161(var4);
      } else {
         return null;
      }
   }

   public final Object method19161(Class7255 var1) {
      Object var4 = this.method19163(var1);
      this.method19162();
      this.field27705.clear();
      this.field27706.clear();
      return var4;
   }

   private void method19162() {
      if (!this.field27707.isEmpty()) {
         for (Class6642 var4 : this.field27707) {
            Class6642 var5 = (Class6642)var4.method20277();
            ((Map)var4.method20278()).put(var5.method20278(), var5.method20277());
         }

         this.field27707.clear();
      }

      if (!this.field27708.isEmpty()) {
         for (Class6642 var7 : this.field27708) {
            ((Set)var7.method20278()).add(var7.method20277());
         }

         this.field27708.clear();
      }
   }

   public Object method19163(Class7255 var1) {
      return !this.field27705.containsKey(var1) ? this.method19164(var1) : this.field27705.get(var1);
   }

   public Object method19164(Class7255 var1) {
      if (!this.field27706.contains(var1)) {
         this.field27706.add(var1);
         Class4632 var4 = this.method19138(var1);
         Object var5 = !this.field27705.containsKey(var1) ? var4.method14587(var1) : this.field27705.get(var1);
         this.method19170(var1, var5);
         this.field27705.put(var1, var5);
         this.field27706.remove(var1);
         if (var1.method22787()) {
            var4.method14588(var1, var5);
         }

         return var5;
      } else {
         throw new Class2482(null, null, "found unconstructable recursive node", var1.method22782());
      }
   }

   public Class4632 method19138(Class7255 var1) {
      if (var1.method22788()) {
         return this.field27701.get(var1.method22769());
      } else {
         Class4632 var4 = this.field27702.get(var1.method22780());
         if (var4 != null) {
            return var4;
         } else {
            for (String var6 : this.field27703.keySet()) {
               if (var1.method22780().method38340(var6)) {
                  return this.field27703.get(var6);
               }
            }

            return this.field27702.get(null);
         }
      }
   }

   public String method19165(Class7256 var1) {
      return var1.method22791();
   }

   public List<Object> method19166(int var1) {
      return new ArrayList<Object>(var1);
   }

   public Set<Object> method19167(int var1) {
      return new LinkedHashSet<Object>(var1);
   }

   public Map<Object, Object> method19168(int var1) {
      return new LinkedHashMap<Object, Object>(var1);
   }

   public Object method19169(Class<?> var1, int var2) {
      return Array.newInstance(var1.getComponentType(), var2);
   }

   public Object method19170(Class7255 var1, Object var2) {
      Class var5 = var1.method22784();
      return !this.field27713.containsKey(var5) ? var2 : this.field27713.get(var5).method36962(var2);
   }

   public Object method19171(Class7255 var1) {
      try {
         return this.method19172(Object.class, var1);
      } catch (InstantiationException var5) {
         throw new Class2478(var5);
      }
   }

   public final Object method19172(Class<?> var1, Class7255 var2) throws InstantiationException {
      return this.method19173(var1, var2, true);
   }

   public Object method19173(Class<?> var1, Class7255 var2, boolean var3) throws InstantiationException {
      Class var6 = var2.method22784();
      if (this.field27713.containsKey(var6)) {
         Class9545 var7 = this.field27713.get(var6);
         Object var8 = var7.method36960(var2);
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
            throw new Class2478(var10);
         }
      } else {
         throw new InstantiationException();
      }
   }

   public Set<Object> method19174(Class7253<?> var1) {
      try {
         return (Set<Object>)this.method19172(Set.class, var1);
      } catch (InstantiationException var5) {
         return this.method19167(var1.method22770().size());
      }
   }

   public List<Object> method19175(Class7252 var1) {
      try {
         return (List<Object>)this.method19172(List.class, var1);
      } catch (InstantiationException var5) {
         return this.method19166(var1.method22770().size());
      }
   }

   public Map<Object, Object> method19176(Class7254 var1) {
      try {
         return (Map<Object, Object>)this.method19172(Map.class, var1);
      } catch (InstantiationException var5) {
         return this.method19168(var1.method22770().size());
      }
   }

   public List<? extends Object> method19177(Class7252 var1) {
      List var4 = this.method19175(var1);
      this.method19180(var1, var4);
      return var4;
   }

   public Set<? extends Object> method19178(Class7252 var1) {
      Set var4 = this.method19174(var1);
      this.method19180(var1, var4);
      return var4;
   }

   public Object method19179(Class7252 var1) {
      return this.method19181(var1, this.method19169(var1.method22784(), var1.method22770().size()));
   }

   public void method19180(Class7252 var1, Collection<Object> var2) {
      for (Class7255 var6 : var1.method22770()) {
         var2.add(this.method19163(var6));
      }
   }

   public Object method19181(Class7252 var1, Object var2) {
      Class var5 = var1.method22784().getComponentType();
      int var6 = 0;

      for (Class7255 var8 : var1.method22770()) {
         if (var8.method22784() == Object.class) {
            var8.method22785(var5);
         }

         Object var9 = this.method19163(var8);
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
                                    throw new Class2478("unexpected primitive type");
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

   public Set<Object> method19182(Class7254 var1) {
      Set var4 = this.method19174(var1);
      this.method19151(var1, var4);
      return var4;
   }

   public Map<Object, Object> method19183(Class7254 var1) {
      Map var4 = this.method19176(var1);
      this.method19150(var1, var4);
      return var4;
   }

   public void method19150(Class7254 var1, Map<Object, Object> var2) {
      for (Class9460 var7 : var1.method22770()) {
         Class7255 var8 = var7.method36417();
         Class7255 var9 = var7.method36418();
         Object var10 = this.method19163(var8);
         if (var10 != null) {
            try {
               var10.hashCode();
            } catch (Exception var12) {
               throw new Class2482(
                  "while constructing a mapping", var1.method22782(), "found unacceptable key " + var10, var7.method36417().method22782(), var12
               );
            }
         }

         Object var11 = this.method19163(var9);
         if (var8.method22787()) {
            this.field27707.add(0, new Class6642<Map<Object, Object>, Class6642<Object, Object>>(var2, new Class6642<Object, Object>(var10, var11)));
         } else {
            var2.put(var10, var11);
         }
      }
   }

   public void method19151(Class7254 var1, Set<Object> var2) {
      for (Class9460 var7 : var1.method22770()) {
         Class7255 var8 = var7.method36417();
         Object var9 = this.method19163(var8);
         if (var9 != null) {
            try {
               var9.hashCode();
            } catch (Exception var11) {
               throw new Class2482("while constructing a Set", var1.method22782(), "found unacceptable key " + var9, var7.method36417().method22782(), var11);
            }
         }

         if (var8.method22787()) {
            this.field27708.add(0, new Class6642<Set<Object>, Object>(var2, var9));
         } else {
            var2.add(var9);
         }
      }
   }

   public void method19184(Class8923 var1) {
      this.field27710 = var1;
      this.field27711 = true;

      for (Class9545 var6 : this.field27713.values()) {
         var6.method36954(var1);
      }
   }

   public final Class8923 method19185() {
      if (this.field27710 == null) {
         this.field27710 = new Class8923();
      }

      return this.field27710;
   }

   public Class9545 method19186(Class9545 var1) {
      if (var1 != null) {
         Class9757 var4 = var1.method36939();
         this.field27714.put(var4, var1.method36942());
         var1.method36954(this.method19185());
         return this.field27713.put(var1.method36942(), var1);
      } else {
         throw new NullPointerException("TypeDescription is required.");
      }
   }

   public final boolean method19187() {
      return this.field27711;
   }

   public boolean method19188() {
      return this.field27712;
   }

   public void method19189(boolean var1) {
      this.field27712 = var1;
   }
}
