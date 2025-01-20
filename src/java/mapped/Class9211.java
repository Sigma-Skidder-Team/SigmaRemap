package mapped;

import com.mentalfrostbyte.Client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class Class9211 {
   private Map<Object, ArrayList<Class7620>> field42398 = new HashMap<Object, ArrayList<Class7620>>();

   public void method34512(Object var1, Class7620 var2) {
      ArrayList var5 = this.field42398.get(var1);
      if (var5 == null) {
         this.field42398.put(var1, var5 = new ArrayList());
      }

      if (!var5.contains(var2)) {
         var5.add(var2);
      } else {
         Client.getInstance().getLogger().warn("Registered the same method of the same instance twice. Was this intended?");
      }
   }

   public void method34513(Object var1) {
      for (Field var7 : var1.getClass().getFields()) {
         if (Class7619.method24969(var7)) {
            this.method34512(var1, new Class7619(var7, var1));
         }
      }

      for (Method var11 : var1.getClass().getMethods()) {
         if (Class7621.method24976(var11)) {
            this.method34512(var1, new Class7621(var11, var1));
         }
      }
   }

   public void method34514(String var1, String... var2) {
      for (Entry<Object, ArrayList<Class7620>> var6 : this.field42398.entrySet()) {
         String var7 = var6.getKey().getClass().getAnnotation(Class5635.class).method17768();
         if (var1.equalsIgnoreCase(var7)) {
            for (Class7620 var9 : var6.getValue()) {
               if (!(var9 instanceof Class7619)) {
                  if (!(var9 instanceof Class7621)) {
                     var9.method24971(var1, var2);
                  } else if (var2 != null && var2.length >= 1 && var2[0].equalsIgnoreCase(var9.method24974())) {
                     String var13 = var1 + " " + var2[0];
                     String[] var14 = new String[var2.length - 1];

                     for (int var15 = 1; var15 < var2.length; var15++) {
                        var14[var15 - 1] = var2[var15];
                     }

                     var9.method24971(var13, var14);
                  }
               } else if (var2 != null
                  && var2.length >= 1
                  && var2[0].equalsIgnoreCase("set")
                  && var2.length >= 2
                  && var2[1].equalsIgnoreCase(var9.method24974())) {
                  String var10 = var1 + " " + var2[0] + " " + var2[1];
                  String[] var11 = new String[var2.length - 2];

                  for (int var12 = 2; var12 < var2.length; var12++) {
                     var11[var12 - 2] = var2[var12];
                  }

                  var9.method24971(var10, var11);
               }
            }
         }
      }
   }

   public String method34515(String var1, String... var2) {
      return null;
   }

   public ArrayList<String> method34516(String var1, String... var2) {
      ArrayList<String> var5 = new ArrayList();

      for (Entry<Object, ArrayList<Class7620>> var7 : this.field42398.entrySet()) {
         String var8 = var7.getKey().getClass().getAnnotation(Class5635.class).method17768();
         if (var1.equalsIgnoreCase(var8)) {
            if (var2 != null) {
               if (var2.length <= 0) {
                  var5.add(var1 + " set");
               }
            } else {
               var5.add(var1 + " set");
            }

            for (Class7620 var10 : var7.getValue()) {
               if (!(var10 instanceof Class7619)) {
                  if (!(var10 instanceof Class7621)) {
                     var5.add(var10.method24973(var1, var2));
                  } else if (var2 != null && var2.length >= 1) {
                     if (!var2[0].equalsIgnoreCase(var10.method24974())) {
                        if (var10.method24974().toUpperCase().startsWith(var2[0].toUpperCase())) {
                           var5.add(var1 + " " + var10.method24974());
                        }
                     } else {
                        String var14 = var1 + " " + var2[0];
                        String[] var15 = new String[var2.length - 1];

                        for (int var16 = 1; var16 < var2.length; var16++) {
                           var15[var16 - 1] = var2[var16];
                        }

                        var5.add(var10.method24973(var14, var15));
                     }
                  } else {
                     var5.add(var1 + " " + var10.method24974());
                  }
               } else if (var2 != null && var2.length >= 1) {
                  if (!var2[0].equalsIgnoreCase("set")) {
                     if ("set".startsWith(var2[0].toLowerCase())) {
                        var5.add(var1 + " set");
                     }
                  } else if (var2.length < 2) {
                     var5.add(var1 + " set " + var10.method24974());
                  } else if (!var2[1].equalsIgnoreCase(var10.method24974())) {
                     if (var10.method24974().toUpperCase().startsWith(var2[1].toUpperCase())) {
                        var5.add(var1 + " set " + var10.method24974());
                     }
                  } else {
                     String var11 = var1 + " " + var2[0] + " " + var2[1];
                     String[] var12 = new String[var2.length - 2];

                     for (int var13 = 2; var13 < var2.length; var13++) {
                        var12[var13 - 2] = var2[var13];
                     }

                     var5.add(var10.method24973(var11, var12));
                  }
               }
            }
         }
      }

      return var5;
   }

   public void method34517(Object var1) {
      this.field42398.remove(var1);
   }

   public Map<Object, ArrayList<Class7620>> method34518() {
      return this.field42398;
   }
}
