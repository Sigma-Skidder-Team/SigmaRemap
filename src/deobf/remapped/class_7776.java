package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class class_7776 extends class_8200 {
   private static String[] field_39420;
   public Map<Class<? extends Object>, class_8795> field_39421 = Collections.<Class<? extends Object>, class_8795>emptyMap();

   public class_7776() {
      this.field_441.put(null, new class_1251(this));
   }

   public class_8795 method_35290(class_8795 var1) {
      if (Collections.EMPTY_MAP == this.field_39421) {
         this.field_39421 = new HashMap<Class<? extends Object>, class_8795>();
      }

      if (var1.method_40412() != null) {
         this.method_37560(var1.method_40413(), var1.method_40412());
      }

      var1.method_40408(this.method_597());
      return this.field_39421.put(var1.method_40413(), var1);
   }

   @Override
   public void method_599(class_6402 var1) {
      super.method_599(var1);

      for (class_8795 var6 : this.field_39421.values()) {
         var6.method_40408(var1);
      }
   }

   public class_7984 method_35285(Set<class_3002> var1, Object var2) {
      ArrayList var5 = new ArrayList(var1.size());
      class_9592 var6 = this.field_41965.get(var2.getClass());
      class_9592 var7 = var6 == null ? new class_9592((Class<? extends Object>)var2.getClass()) : var6;
      class_7984 var8 = new class_7984(var7, var5, class_435.field_1823);
      this.field_444.put(var2, var8);
      class_435 var9 = class_435.field_1826;

      for (class_3002 var11 : var1) {
         Object var12 = var11.method_13705(var2);
         class_9592 var13 = var12 != null ? this.field_41965.get(var12.getClass()) : null;
         class_8473 var14 = this.method_35288(var2, var11, var12, var13);
         if (var14 != null) {
            if (!((class_8437)var14.method_38998()).method_38815()) {
               var9 = class_435.field_1822;
            }

            class_1621 var15 = var14.method_38999();
            if (!(var15 instanceof class_8437) || !((class_8437)var15).method_38815()) {
               var9 = class_435.field_1822;
            }

            var5.add(var14);
         }
      }

      if (this.field_440 == class_435.field_1823) {
         var8.method_10281(var9);
      } else {
         var8.method_10281(this.field_440);
      }

      return var8;
   }

   public class_8473 method_35288(Object var1, class_3002 var2, Object var3, class_9592 var4) {
      class_8437 var7 = (class_8437)this.method_595(var2.method_13713());
      boolean var8 = this.field_444.containsKey(var3);
      class_1621 var9 = this.method_595(var3);
      if (var3 != null && !var8) {
         class_99 var10 = var9.method_7221();
         if (var4 == null) {
            if (var10 != class_99.field_235) {
               if (var10 == class_99.field_233
                  && var2.method_13707() == var3.getClass()
                  && !(var3 instanceof Map)
                  && !var9.method_7232().equals(class_9592.field_48883)) {
                  var9.method_7227(class_9592.field_48871);
               }

               this.method_35286(var2, var9, var3);
            } else if (var2.method_13707() == var3.getClass() && var3 instanceof Enum) {
               var9.method_7227(class_9592.field_48876);
            }
         }
      }

      return new class_8473(var7, var9);
   }

   public void method_35286(class_3002 var1, class_1621 var2, Object var3) {
      if (!var3.getClass().isArray() || !var3.getClass().getComponentType().isPrimitive()) {
         Class[] var6 = var1.method_13708();
         if (var6 != null) {
            if (var2.method_7221() != class_99.field_234) {
               if (!(var3 instanceof Set)) {
                  if (var3 instanceof Map) {
                     Class var7 = var6[0];
                     Class var8 = var6[1];
                     class_7984 var9 = (class_7984)var2;

                     for (class_8473 var11 : var9.method_10282()) {
                        this.method_35287(var7, var11.method_38998());
                        this.method_35287(var8, var11.method_38999());
                     }
                  }
               } else {
                  Class var15 = var6[0];
                  class_7984 var17 = (class_7984)var2;
                  Iterator var19 = var17.method_10282().iterator();

                  for (Object var12 : (Set)var3) {
                     class_8473 var13 = (class_8473)var19.next();
                     class_1621 var14 = var13.method_38998();
                     if (var15.equals(var12.getClass()) && var14.method_7221() == class_99.field_233) {
                        var14.method_7227(class_9592.field_48871);
                     }
                  }
               }
            } else {
               Class var16 = var6[0];
               class_1596 var18 = (class_1596)var2;
               Object var20 = Collections.EMPTY_LIST;
               if (!var3.getClass().isArray()) {
                  if (var3 instanceof Iterable) {
                     var20 = (Iterable)var3;
                  }
               } else {
                  var20 = Arrays.asList((Object[])var3);
               }

               Iterator var22 = var20.iterator();
               if (var22.hasNext()) {
                  for (class_1621 var25 : var18.method_10282()) {
                     Object var26 = var22.next();
                     if (var26 != null && var16.equals(var26.getClass()) && var25.method_7221() == class_99.field_233) {
                        var25.method_7227(class_9592.field_48871);
                     }
                  }
               }
            }
         }
      }
   }

   private void method_35287(Class<? extends Object> var1, class_1621 var2) {
      class_9592 var5 = var2.method_7232();
      if (var5.method_44302(var1)) {
         if (!Enum.class.isAssignableFrom(var1)) {
            var2.method_7227(class_9592.field_48871);
         } else {
            var2.method_7227(class_9592.field_48876);
         }
      }
   }

   public Set<class_3002> method_35289(Class<? extends Object> var1) {
      return !this.field_39421.containsKey(var1) ? this.method_597().method_29230(var1) : this.field_39421.get(var1).method_40411();
   }
}
