package remapped;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class class_7487 {
   private Map<Object, ArrayList<class_7671>> field_38215 = new HashMap<Object, ArrayList<class_7671>>();

   public void method_34048(Object var1, class_7671 var2) {
      ArrayList var5 = this.field_38215.get(var1);
      if (var5 == null) {
         this.field_38215.put(var1, var5 = new ArrayList());
      }

      if (!var5.contains(var2)) {
         var5.add(var2);
      } else {
         SigmaMainClass.getInstance().method_3326().method_12862("Registered the same method of the same instance twice. Was this intended?");
      }
   }

   public void method_34047(Object var1) {
      for (Field var7 : var1.getClass().getFields()) {
         if (class_2323.method_10669(var7)) {
            this.method_34048(var1, new class_2323(var7, var1));
         }
      }

      for (Method var11 : var1.getClass().getMethods()) {
         if (class_7635.method_34598(var11)) {
            this.method_34048(var1, new class_7635(var11, var1));
         }
      }
   }

   public void method_34042(String var1, String... var2) {
      for (Entry var6 : this.field_38215.entrySet()) {
         String var7 = var6.getKey().getClass().<class_4747>getAnnotation(class_4747.class).method_21928();
         if (var1.equalsIgnoreCase(var7)) {
            for (class_7671 var9 : (ArrayList)var6.getValue()) {
               if (!(var9 instanceof class_2323)) {
                  if (!(var9 instanceof class_7635)) {
                     var9.method_34759(var1, var2);
                  } else if (var2 != null && var2.length >= 1 && var2[0].equalsIgnoreCase(var9.method_34760())) {
                     String var13 = var1 + " " + var2[0];
                     String[] var14 = new String[var2.length - 1];

                     for (int var15 = 1; var15 < var2.length; var15++) {
                        var14[var15 - 1] = var2[var15];
                     }

                     var9.method_34759(var13, var14);
                  }
               } else if (var2 != null
                  && var2.length >= 1
                  && var2[0].equalsIgnoreCase("set")
                  && var2.length >= 2
                  && var2[1].equalsIgnoreCase(var9.method_34760())) {
                  String var10 = var1 + " " + var2[0] + " " + var2[1];
                  String[] var11 = new String[var2.length - 2];

                  for (int var12 = 2; var12 < var2.length; var12++) {
                     var11[var12 - 2] = var2[var12];
                  }

                  var9.method_34759(var10, var11);
               }
            }
         }
      }
   }

   public String method_34045(String var1, String... var2) {
      return null;
   }

   public ArrayList<String> method_34044(String var1, String... var2) {
      ArrayList var5 = new ArrayList();

      for (Entry var7 : this.field_38215.entrySet()) {
         String var8 = var7.getKey().getClass().<class_4747>getAnnotation(class_4747.class).method_21928();
         if (var1.equalsIgnoreCase(var8)) {
            if (var2 != null) {
               if (var2.length <= 0) {
                  var5.add(var1 + " set");
               }
            } else {
               var5.add(var1 + " set");
            }

            for (class_7671 var10 : (ArrayList)var7.getValue()) {
               if (!(var10 instanceof class_2323)) {
                  if (!(var10 instanceof class_7635)) {
                     var5.add(var10.method_34762(var1, var2));
                  } else if (var2 != null && var2.length >= 1) {
                     if (!var2[0].equalsIgnoreCase(var10.method_34760())) {
                        if (var10.method_34760().toUpperCase().startsWith(var2[0].toUpperCase())) {
                           var5.add(var1 + " " + var10.method_34760());
                        }
                     } else {
                        String var14 = var1 + " " + var2[0];
                        String[] var15 = new String[var2.length - 1];

                        for (int var16 = 1; var16 < var2.length; var16++) {
                           var15[var16 - 1] = var2[var16];
                        }

                        var5.add(var10.method_34762(var14, var15));
                     }
                  } else {
                     var5.add(var1 + " " + var10.method_34760());
                  }
               } else if (var2 != null && var2.length >= 1) {
                  if (!var2[0].equalsIgnoreCase("set")) {
                     if ("set".startsWith(var2[0].toLowerCase())) {
                        var5.add(var1 + " set");
                     }
                  } else if (var2.length < 2) {
                     var5.add(var1 + " set " + var10.method_34760());
                  } else if (!var2[1].equalsIgnoreCase(var10.method_34760())) {
                     if (var10.method_34760().toUpperCase().startsWith(var2[1].toUpperCase())) {
                        var5.add(var1 + " set " + var10.method_34760());
                     }
                  } else {
                     String var11 = var1 + " " + var2[0] + " " + var2[1];
                     String[] var12 = new String[var2.length - 2];

                     for (int var13 = 2; var13 < var2.length; var13++) {
                        var12[var13 - 2] = var2[var13];
                     }

                     var5.add(var10.method_34762(var11, var12));
                  }
               }
            }
         }
      }

      return var5;
   }

   public void method_34046(Object var1) {
      this.field_38215.remove(var1);
   }

   public Map<Object, ArrayList<class_7671>> method_34041() {
      return this.field_38215;
   }
}
