package remapped;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_535 extends class_4364 {
   private static final Pattern field_3246 = Pattern.compile("\\p{Alpha}.*\\s*\\((?:,?\\s*(?:(?:\\w*)|(?:\\p{Alpha}\\w*\\s*=.+))\\s*)+\\)");
   private static final Pattern field_3244 = Pattern.compile("(\\p{Alpha}.*)(\\s*)\\((.*?)\\)");
   private static final Pattern field_3248 = Pattern.compile("\\s*(\\p{Alpha}\\w*)\\s*=(.+)");
   private class_9420 field_3245;

   public Object method_2619(class_8437 var1, class_6223 var2) {
      try {
         Object var5 = this.method_2623(var1, var2);
         HashMap var6 = new HashMap<String, String>(var2.method_28449());
         this.method_2621(var5, var6);
         return var5;
      } catch (Exception var7) {
         throw new class_5251(var7);
      }
   }

   public Object method_2623(class_8437 var1, class_6223 var2) throws Exception {
      Class var5 = this.method_20239(var2.method_28451());
      Class[] var6 = new Class[var2.method_28450().size()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = String.class;
      }

      Constructor var8 = var5.getDeclaredConstructor(var6);
      var8.setAccessible(true);
      return var8.newInstance(var2.method_28450().toArray());
   }

   public void method_2621(Object var1, Map<String, Object> var2) throws Exception {
      if (var2 == null) {
         throw new NullPointerException("Data for Compact Object Notation cannot be null.");
      } else {
         for (Entry var6 : var2.entrySet()) {
            String var7 = (String)var6.getKey();
            class_3002 var8 = this.method_42416().method_29227((Class<? extends Object>)var1.getClass(), var7);

            try {
               var8.method_13704(var1, var6.getValue());
            } catch (IllegalArgumentException var10) {
               throw new class_5251("Cannot set property='" + var7 + "' with value='" + var2.get(var7) + "' (" + var2.get(var7).getClass() + ") in " + var1);
            }
         }
      }
   }

   public class_6223 method_2616(String var1) {
      if (var1.endsWith(")")) {
         if (var1.indexOf(40) >= 0) {
            Matcher var4 = field_3244.matcher(var1);
            if (!var4.matches()) {
               return null;
            } else {
               String var5 = var4.group(1).trim();
               String var6 = var4.group(3);
               class_6223 var7 = new class_6223(var5);
               if (var6.length() != 0) {
                  String[] var8 = var6.split("\\s*,\\s*");

                  for (int var9 = 0; var9 < var8.length; var9++) {
                     String var10 = var8[var9];
                     if (var10.indexOf(61) >= 0) {
                        Matcher var11 = field_3248.matcher(var10);
                        if (!var11.matches()) {
                           return null;
                        }

                        String var12 = var11.group(1);
                        String var13 = var11.group(2).trim();
                        var7.method_28449().put(var12, var13);
                     } else {
                        var7.method_28450().add(var10);
                     }
                  }

                  return var7;
               } else {
                  return var7;
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private class_9420 method_2618() {
      if (this.field_3245 == null) {
         this.field_3245 = this.method_2624();
      }

      return this.field_3245;
   }

   public class_9420 method_2624() {
      return new class_6975(this);
   }

   @Override
   public class_9420 method_42418(class_1621 var1) {
      if (!(var1 instanceof class_7984)) {
         if (var1 instanceof class_8437) {
            class_8437 var4 = (class_8437)var1;
            if (field_3246.matcher(var4.method_38816()).matches()) {
               return this.method_2618();
            }
         }
      } else {
         class_7984 var9 = (class_7984)var1;
         List var5 = var9.method_10282();
         if (var5.size() == 1) {
            class_8473 var6 = (class_8473)var5.get(0);
            class_1621 var7 = var6.method_38998();
            if (var7 instanceof class_8437) {
               class_8437 var8 = (class_8437)var7;
               if (field_3246.matcher(var8.method_38816()).matches()) {
                  return this.method_2618();
               }
            }
         }
      }

      return super.method_42418(var1);
   }

   public void method_2620(Object var1, List<?> var2) {
      try {
         class_3002 var5 = this.method_42416().method_29227((Class<? extends Object>)var1.getClass(), this.method_2615(var1.getClass()));
         var5.method_13704(var1, var2);
      } catch (Exception var6) {
         throw new class_5251(var6);
      }
   }

   public String method_2615(Class<?> var1) {
      Set var4 = this.method_42416().method_29230(var1);
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         class_3002 var6 = (class_3002)var5.next();
         if (!List.class.isAssignableFrom(var6.method_13707())) {
            var5.remove();
         }
      }

      if (var4.size() == 0) {
         throw new class_5251("No list property found in " + var1);
      } else if (var4.size() <= 1) {
         return ((class_3002)var4.iterator().next()).method_13713();
      } else {
         throw new class_5251("Many list properties found in " + var1 + "; Please override getSequencePropertyName() to specify which property to use.");
      }
   }
}
