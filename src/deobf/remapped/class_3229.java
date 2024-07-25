package remapped;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class class_3229 extends class_9199 {
   public static final class_7196 field_16071 = new class_7196();
   private static final Map<String, Boolean> field_16073 = new HashMap<String, Boolean>();
   private static final Pattern field_16074 = Pattern.compile(
      "^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$"
   );
   private static final Pattern field_16070 = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");

   public class_3229() {
      this.field_47066.put(class_9592.field_48873, new class_6972(this));
      this.field_47066.put(class_9592.field_48878, new class_6480(this));
      this.field_47066.put(class_9592.field_48877, new class_915(this));
      this.field_47066.put(class_9592.field_48881, new class_177(this));
      this.field_47066.put(class_9592.field_48884, new class_2480(this));
      this.field_47066.put(class_9592.field_48875, new class_559());
      this.field_47066.put(class_9592.field_48886, new class_1078(this));
      this.field_47066.put(class_9592.field_48880, new class_4470(this));
      this.field_47066.put(class_9592.field_48883, new class_9765(this));
      this.field_47066.put(class_9592.field_48876, new class_8060(this));
      this.field_47066.put(class_9592.field_48882, new class_3343(this));
      this.field_47066.put(class_9592.field_48871, new class_2201(this));
      this.field_47066.put(null, field_16071);
      this.field_47065.put(class_99.field_235, field_16071);
      this.field_47065.put(class_99.field_234, field_16071);
      this.field_47065.put(class_99.field_233, field_16071);
   }

   public void method_14787(class_7984 var1) {
      this.method_14792(var1);
      if (var1.method_36231()) {
         var1.method_36234(this.method_14786(var1, true, new HashMap<Object, Integer>(), new ArrayList<class_8473>()));
      }
   }

   public void method_14792(class_7984 var1) {
      List var4 = var1.method_10282();
      HashMap var5 = new HashMap(var4.size());
      TreeSet var6 = new TreeSet();
      int var7 = 0;

      for (class_8473 var9 : var4) {
         class_1621 var10 = var9.method_38998();
         if (!var10.method_7232().equals(class_9592.field_48872)) {
            Object var11 = this.method_42411(var10);
            if (var11 != null) {
               try {
                  var11.hashCode();
               } catch (Exception var13) {
                  throw new class_8665(
                     "while constructing a mapping", var1.method_7224(), "found unacceptable key " + var11, var9.method_38998().method_7224(), var13
                  );
               }
            }

            Integer var12 = var5.put(var11, var7);
            if (var12 != null) {
               if (!this.method_42425()) {
                  throw new class_3456(var1.method_7224(), var11, var9.method_38998().method_7224());
               }

               var6.add(var12);
            }
         }

         var7++;
      }

      Iterator var14 = var6.descendingIterator();

      while (var14.hasNext()) {
         var4.remove(((Integer)var14.next()).intValue());
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private List<class_8473> method_14786(class_7984 var1, boolean var2, Map<Object, Integer> var3, List<class_8473> var4) {
      Iterator var7 = var1.method_10282().iterator();

      while (var7.hasNext()) {
         class_8473 var8 = (class_8473)var7.next();
         class_1621 var9 = var8.method_38998();
         class_1621 var10 = var8.method_38999();
         if (var9.method_7232().equals(class_9592.field_48872)) {
            var7.remove();
            switch (var10.method_7221()) {
               case field_233:
                  class_7984 var17 = (class_7984)var10;
                  this.method_14786(var17, false, var3, var4);
                  break;
               case field_234:
                  class_1596 var12 = (class_1596)var10;

                  for (class_1621 var15 : var12.method_10282()) {
                     if (!(var15 instanceof class_7984)) {
                        throw new class_8665(
                           "while constructing a mapping",
                           var1.method_7224(),
                           "expected a mapping for merging, but found " + var15.method_7221(),
                           var15.method_7224()
                        );
                     }

                     class_7984 var16 = (class_7984)var15;
                     this.method_14786(var16, false, var3, var4);
                  }
                  break;
               default:
                  throw new class_8665(
                     "while constructing a mapping",
                     var1.method_7224(),
                     "expected a mapping or list of mappings for merging, but found " + var10.method_7221(),
                     var10.method_7224()
                  );
            }
         } else {
            Object var11 = this.method_42411(var9);
            if (!var3.containsKey(var11)) {
               var4.add(var8);
               var3.put(var11, var4.size() - 1);
            } else if (var2) {
               var4.set((Integer)var3.get(var11), var8);
            }
         }
      }

      return var4;
   }

   @Override
   public void method_42414(class_7984 var1, Map<Object, Object> var2) {
      this.method_14787(var1);
      super.method_42414(var1, var2);
   }

   @Override
   public void method_42408(class_7984 var1, Set<Object> var2) {
      this.method_14787(var1);
      super.method_42408(var1, var2);
   }

   private Number method_14790(int var1, String var2, int var3) {
      if (var1 < 0) {
         var2 = "-" + var2;
      }

      Object var6;
      try {
         var6 = Integer.valueOf(var2, var3);
      } catch (NumberFormatException var10) {
         try {
            var6 = Long.valueOf(var2, var3);
         } catch (NumberFormatException var9) {
            var6 = new BigInteger(var2, var3);
         }
      }

      return (Number)var6;
   }

   static {
      field_16073.put("yes", Boolean.TRUE);
      field_16073.put("no", Boolean.FALSE);
      field_16073.put("true", Boolean.TRUE);
      field_16073.put("false", Boolean.FALSE);
      field_16073.put("on", Boolean.TRUE);
      field_16073.put("off", Boolean.FALSE);
   }
}
