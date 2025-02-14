package mapped;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class6208 extends Class6210 {
   private static final Pattern field27691 = Pattern.compile("\\p{Alpha}.*\\s*\\((?:,?\\s*(?:(?:\\w*)|(?:\\p{Alpha}\\w*\\s*=.+))\\s*)+\\)");
   private static final Pattern field27692 = Pattern.compile("(\\p{Alpha}.*)(\\s*)\\((.*?)\\)");
   private static final Pattern field27693 = Pattern.compile("\\s*(\\p{Alpha}\\w*)\\s*=(.+)");
   private Class4632 field27694;

   public Object method19132(Class7256 var1, Class8872 var2) {
      try {
         Object var5 = this.method19133(var1, var2);
         HashMap var6 = new HashMap<String, String>(var2.method32280());
         this.method19134(var5, var6);
         return var5;
      } catch (Exception var7) {
         throw new Class2478(var7);
      }
   }

   public Object method19133(Class7256 var1, Class8872 var2) throws Exception {
      Class var5 = this.method19143(var2.method32279());
      Class[] var6 = new Class[var2.method32281().size()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = String.class;
      }

      Constructor var8 = var5.getDeclaredConstructor(var6);
      var8.setAccessible(true);
      return var8.newInstance(var2.method32281().toArray());
   }

   public void method19134(Object var1, Map<String, Object> var2) throws Exception {
      if (var2 == null) {
         throw new NullPointerException("Data for Compact Object Notation cannot be null.");
      } else {
         for (Entry var6 : var2.entrySet()) {
            String var7 = (String)var6.getKey();
            Class2013 var8 = this.method19185().method32617((Class<? extends Object>)var1.getClass(), var7);

            try {
               var8.method8542(var1, var6.getValue());
            } catch (IllegalArgumentException var10) {
               throw new Class2478("Cannot set property='" + var7 + "' with value='" + var2.get(var7) + "' (" + var2.get(var7).getClass() + ") in " + var1);
            }
         }
      }
   }

   public Class8872 method19135(String var1) {
      if (var1.endsWith(")")) {
         if (var1.indexOf(40) >= 0) {
            Matcher var4 = field27692.matcher(var1);
            if (!var4.matches()) {
               return null;
            } else {
               String var5 = var4.group(1).trim();
               String var6 = var4.group(3);
               Class8872 var7 = new Class8872(var5);
               if (var6.length() != 0) {
                  String[] var8 = var6.split("\\s*,\\s*");

                  for (int var9 = 0; var9 < var8.length; var9++) {
                     String var10 = var8[var9];
                     if (var10.indexOf(61) >= 0) {
                        Matcher var11 = field27693.matcher(var10);
                        if (!var11.matches()) {
                           return null;
                        }

                        String var12 = var11.group(1);
                        String var13 = var11.group(2).trim();
                        var7.method32280().put(var12, var13);
                     } else {
                        var7.method32281().add(var10);
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

   private Class4632 method19136() {
      if (this.field27694 == null) {
         this.field27694 = this.method19137();
      }

      return this.field27694;
   }

   public Class4632 method19137() {
      return new Class4634(this);
   }

   @Override
   public Class4632 method19138(Class7255 var1) {
      if (!(var1 instanceof Class7254)) {
         if (var1 instanceof Class7256) {
            Class7256 var4 = (Class7256)var1;
            if (field27691.matcher(var4.method22791()).matches()) {
               return this.method19136();
            }
         }
      } else {
         Class7254 var9 = (Class7254)var1;
         List var5 = var9.method22770();
         if (var5.size() == 1) {
            Class9460 var6 = (Class9460)var5.get(0);
            Class7255 var7 = var6.method36417();
            if (var7 instanceof Class7256) {
               Class7256 var8 = (Class7256)var7;
               if (field27691.matcher(var8.method22791()).matches()) {
                  return this.method19136();
               }
            }
         }
      }

      return super.method19138(var1);
   }

   public void method19139(Object var1, List<?> var2) {
      try {
         Class2013 var5 = this.method19185().method32617((Class<? extends Object>)var1.getClass(), this.method19140(var1.getClass()));
         var5.method8542(var1, var2);
      } catch (Exception var6) {
         throw new Class2478(var6);
      }
   }

   public String method19140(Class<?> var1) {
      Set var4 = this.method19185().method32614(var1);
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         Class2013 var6 = (Class2013)var5.next();
         if (!List.class.isAssignableFrom(var6.method8537())) {
            var5.remove();
         }
      }

      if (var4.size() == 0) {
         throw new Class2478("No list property found in " + var1);
      } else if (var4.size() <= 1) {
         return ((Class2013)var4.iterator().next()).method8539();
      } else {
         throw new Class2478("Many list properties found in " + var1 + "; Please override getSequencePropertyName() to specify which property to use.");
      }
   }

   // $VF: synthetic method
   public static List method19141(Class6208 var0, Class7252 var1) {
      return var0.method19177(var1);
   }

   // $VF: synthetic method
   public static String method19142(Class6208 var0, Class7256 var1) {
      return var0.method19165(var1);
   }
}
