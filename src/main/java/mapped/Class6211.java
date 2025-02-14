package mapped;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Class6211 extends Class6213 {
   public static final Class4641 field27696 = new Class4641();
   private static final Map<String, Boolean> field27697 = new HashMap<String, Boolean>();
   private static final Pattern field27698 = Pattern.compile(
      "^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$"
   );
   private static final Pattern field27699 = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");

   public Class6211() {
      this.field27702.put(Class9757.field45641, new Class4629(this));
      this.field27702.put(Class9757.field45640, new Class4631(this));
      this.field27702.put(Class9757.field45637, new Class4628(this));
      this.field27702.put(Class9757.field45638, new Class4625(this));
      this.field27702.put(Class9757.field45636, new Class4646(this));
      this.field27702.put(Class9757.field45639, new Class4645());
      this.field27702.put(Class9757.field45635, new Class4643(this));
      this.field27702.put(Class9757.field45634, new Class4630(this));
      this.field27702.put(Class9757.field45633, new Class4635(this));
      this.field27702.put(Class9757.field45642, new Class4627(this));
      this.field27702.put(Class9757.field45643, new Class4637(this));
      this.field27702.put(Class9757.field45644, new Class4639(this));
      this.field27702.put(null, field27696);
      this.field27701.put(Class2048.field13364, field27696);
      this.field27701.put(Class2048.field13365, field27696);
      this.field27701.put(Class2048.field13366, field27696);
   }

   public void method19147(Class7254 var1) {
      this.method19148(var1);
      if (var1.method22779()) {
         var1.method22775(this.method19149(var1, true, new HashMap<Object, Integer>(), new ArrayList<Class9460>()));
      }
   }

   public void method19148(Class7254 var1) {
      List<Class9460> var4 = var1.method22770();
      HashMap<Object, Integer> var5 = new HashMap(var4.size());
      TreeSet var6 = new TreeSet();
      int var7 = 0;

      for (Class9460 var9 : var4) {
         Class7255 var10 = var9.method36417();
         if (!var10.method22780().equals(Class9757.field45632)) {
            Object var11 = this.method19163(var10);
            if (var11 != null) {
               try {
                  var11.hashCode();
               } catch (Exception var13) {
                  throw new Class2482(
                     "while constructing a mapping", var1.method22782(), "found unacceptable key " + var11, var9.method36417().method22782(), var13
                  );
               }
            }

            Integer var12 = var5.put(var11, var7);
            if (var12 != null) {
               if (!this.method19188()) {
                  throw new Class2483(var1.method22782(), var11, var9.method36417().method22782());
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

   private List<Class9460> method19149(Class7254 var1, boolean var2, Map<Object, Integer> var3, List<Class9460> var4) {
      Iterator var7 = var1.method22770().iterator();

      while (var7.hasNext()) {
         Class9460 var8 = (Class9460)var7.next();
         Class7255 var9 = var8.method36417();
         Class7255 var10 = var8.method36418();
         if (var9.method22780().equals(Class9757.field45632)) {
            var7.remove();
            switch (Class6501.field28467[var10.method22769().ordinal()]) {
               case 1:
                  Class7254 var17 = (Class7254)var10;
                  this.method19149(var17, false, var3, var4);
                  break;
               case 2:
                  Class7252 var12 = (Class7252)var10;

                  for (Class7255 var15 : var12.method22770()) {
                     if (!(var15 instanceof Class7254)) {
                        throw new Class2482(
                           "while constructing a mapping",
                           var1.method22782(),
                           "expected a mapping for merging, but found " + var15.method22769(),
                           var15.method22782()
                        );
                     }

                     Class7254 var16 = (Class7254)var15;
                     this.method19149(var16, false, var3, var4);
                  }
                  break;
               default:
                  throw new Class2482(
                     "while constructing a mapping",
                     var1.method22782(),
                     "expected a mapping or list of mappings for merging, but found " + var10.method22769(),
                     var10.method22782()
                  );
            }
         } else {
            Object var11 = this.method19163(var9);
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
   public void method19150(Class7254 var1, Map<Object, Object> var2) {
      this.method19147(var1);
      super.method19150(var1, var2);
   }

   @Override
   public void method19151(Class7254 var1, Set<Object> var2) {
      this.method19147(var1);
      super.method19151(var1, var2);
   }

   private Number method19152(int var1, String var2, int var3) {
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

   // $VF: synthetic method
   public static Map method19153() {
      return field27697;
   }

   // $VF: synthetic method
   public static Number method19154(Class6211 var0, int var1, String var2, int var3) {
      return var0.method19152(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Pattern method19155() {
      return field27699;
   }

   // $VF: synthetic method
   public static Pattern method19156() {
      return field27698;
   }

   static {
      field27697.put("yes", Boolean.TRUE);
      field27697.put("no", Boolean.FALSE);
      field27697.put("true", Boolean.TRUE);
      field27697.put("false", Boolean.FALSE);
      field27697.put("on", Boolean.TRUE);
      field27697.put("off", Boolean.FALSE);
   }
}
