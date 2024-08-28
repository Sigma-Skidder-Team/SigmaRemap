package mapped;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class6980 implements Class6981 {
   private static final Map<String, String> field30201 = new HashMap<String, String>();
   public final Class7157 field30202;
   private Class5931 field30203;
   private final Class9497<Class6144> field30204;
   private final Class9497<Class2512> field30205;
   private Class6144 field30206;
   private Class8342 field30207;

   public Class6980(Class9583 var1) {
      this(new Class7158(var1));
   }

   public Class6980(Class7157 var1) {
      this.field30202 = var1;
      this.field30203 = null;
      this.field30207 = new Class8342(null, new HashMap<String, String>(field30201));
      this.field30204 = new Class9497<Class6144>(100);
      this.field30205 = new Class9497<Class2512>(10);
      this.field30206 = new Class6164(this);
   }

   @Override
   public boolean method21551(Class78 var1) {
      this.method21552();
      return this.field30203 != null && this.field30203.method18431(var1);
   }

   @Override
   public Class5931 method21552() {
      if (this.field30203 == null && this.field30206 != null) {
         this.field30203 = this.field30206.method19048();
      }

      return this.field30203;
   }

   @Override
   public Class5931 method21553() {
      this.method21552();
      Class5931 var3 = this.field30203;
      this.field30203 = null;
      return var3;
   }

   private Class8342 method21554() {
      Class2148 var3 = null;
      HashMap var4 = new HashMap();

      while (this.field30202.method22329(Class2228.field14594)) {
         Class6565 var5 = (Class6565)this.field30202.method22331();
         if (var5.method19902().equals("YAML")) {
            if (var3 != null) {
               throw new Class2480(null, null, "found duplicate YAML directive", var5.method19895());
            }

            List var6 = var5.method19903();
            Integer var7 = (Integer)var6.get(0);
            if (var7 != 1) {
               throw new Class2480(null, null, "found incompatible YAML document (version 1.* is required)", var5.method19895());
            }

            Integer var8 = (Integer)var6.get(1);
            switch (var8) {
               case 0:
                  var3 = Class2148.field14048;
                  break;
               default:
                  var3 = Class2148.field14049;
            }
         } else if (var5.method19902().equals("TAG")) {
            List var10 = var5.method19903();
            String var12 = (String)var10.get(0);
            String var13 = (String)var10.get(1);
            if (var4.containsKey(var12)) {
               throw new Class2480(null, null, "duplicate tag handle " + var12, var5.method19895());
            }

            var4.put(var12, var13);
         }
      }

      if (var3 != null || !var4.isEmpty()) {
         for (String var11 : field30201.keySet()) {
            if (!var4.containsKey(var11)) {
               var4.put(var11, field30201.get(var11));
            }
         }

         this.field30207 = new Class8342(var3, var4);
      }

      return this.field30207;
   }

   private Class5931 method21555() {
      return this.method21557(false, false);
   }

   private Class5931 method21556() {
      return this.method21557(true, true);
   }

   private Class5931 method21557(boolean var1, boolean var2) {
      Class2512 var5 = null;
      Class2512 var6 = null;
      Class2512 var7 = null;
      Object var24;
      if (!this.field30202.method22329(Class2228.field14588)) {
         String var8 = null;
         Class7951 var9 = null;
         if (!this.field30202.method22329(Class2228.field14589)) {
            if (this.field30202.method22329(Class2228.field14606)) {
               Class6564 var10 = (Class6564)this.field30202.method22331();
               var5 = var10.method19895();
               var7 = var5;
               var6 = var10.method19896();
               var9 = var10.method19901();
               if (this.field30202.method22329(Class2228.field14589)) {
                  Class6568 var12 = (Class6568)this.field30202.method22331();
                  var6 = var12.method19896();
                  var8 = var12.method19904();
               }
            }
         } else {
            Class6568 var22 = (Class6568)this.field30202.method22331();
            var5 = var22.method19895();
            var6 = var22.method19896();
            var8 = var22.method19904();
            if (this.field30202.method22329(Class2228.field14606)) {
               Class6564 var25 = (Class6564)this.field30202.method22331();
               var7 = var25.method19895();
               var6 = var25.method19896();
               var9 = var25.method19901();
            }
         }

         String var23 = null;
         if (var9 != null) {
            String var26 = var9.method27023();
            String var13 = var9.method27024();
            if (var26 == null) {
               var23 = var13;
            } else {
               if (!this.field30207.method29249().containsKey(var26)) {
                  throw new Class2480("while parsing a node", var5, "found undefined tag handle " + var26, var7);
               }

               var23 = this.field30207.method29249().get(var26) + var13;
            }
         }

         if (var5 == null) {
            var5 = this.field30202.method22330().method19895();
            var6 = var5;
         }

         var24 = null;
         boolean var27 = var23 == null || var23.equals("!");
         if (var2 && this.field30202.method22329(Class2228.field14591)) {
            var6 = this.field30202.method22330().method19896();
            var24 = new Class5927(var8, var23, var27, var5, var6, Class2214.field14476);
            this.field30206 = new Class6156(this);
         } else if (!this.field30202.method22329(Class2228.field14603)) {
            if (!this.field30202.method22329(Class2228.field14601)) {
               if (!this.field30202.method22329(Class2228.field14599)) {
                  if (var1 && this.field30202.method22329(Class2228.field14593)) {
                     var6 = this.field30202.method22330().method19895();
                     var24 = new Class5927(var8, var23, var27, var5, var6, Class2214.field14476);
                     this.field30206 = new Class6152(this);
                  } else if (var1 && this.field30202.method22329(Class2228.field14592)) {
                     var6 = this.field30202.method22330().method19895();
                     var24 = new Class5939(var8, var23, var27, var5, var6, Class2214.field14476);
                     this.field30206 = new Class6159(this);
                  } else {
                     if (var8 == null && var23 == null) {
                        String var28;
                        if (!var1) {
                           var28 = "flow";
                        } else {
                           var28 = "block";
                        }

                        Class6553 var14 = this.field30202.method22330();
                        throw new Class2480(
                           "while parsing a " + var28 + " node",
                           var5,
                           "expected the node content, but found '" + var14.method19894() + "'",
                           var14.method19895()
                        );
                     }

                     var24 = new Class5930(var8, var23, new Class7813(var27, false), "", var5, var6, Class1857.field9898);
                     this.field30206 = this.field30204.method36684();
                  }
               } else {
                  var6 = this.field30202.method22330().method19896();
                  var24 = new Class5939(var8, var23, var27, var5, var6, Class2214.field14475);
                  this.field30206 = new Class6162(this);
               }
            } else {
               var6 = this.field30202.method22330().method19896();
               var24 = new Class5927(var8, var23, var27, var5, var6, Class2214.field14475);
               this.field30206 = new Class6153(this);
            }
         } else {
            Class6563 var29 = (Class6563)this.field30202.method22331();
            var6 = var29.method19896();
            Class7813 var30;
            if ((!var29.method19898() || var23 != null) && !"!".equals(var23)) {
               if (var23 != null) {
                  var30 = new Class7813(false, false);
               } else {
                  var30 = new Class7813(false, true);
               }
            } else {
               var30 = new Class7813(true, false);
            }

            var24 = new Class5930(var8, var23, var30, var29.method19899(), var5, var6, var29.method19900());
            this.field30206 = this.field30204.method36684();
         }
      } else {
         Class6557 var21 = (Class6557)this.field30202.method22331();
         var24 = new Class5929(var21.method19897(), var21.method19895(), var21.method19896());
         this.field30206 = this.field30204.method36684();
      }

      return (Class5931)var24;
   }

   private Class5931 method21558(Class2512 var1) {
      return new Class5930(null, null, new Class7813(true, false), "", var1, var1, Class1857.field9898);
   }

   // $VF: synthetic method
   public static Class6144 method21559(Class6980 var0, Class6144 var1) {
      return var0.field30206 = var1;
   }

   // $VF: synthetic method
   public static Class8342 method21560(Class6980 var0, Class8342 var1) {
      return var0.field30207 = var1;
   }

   // $VF: synthetic method
   public static Map method21561() {
      return field30201;
   }

   // $VF: synthetic method
   public static Class9497 method21562(Class6980 var0) {
      return var0.field30204;
   }

   // $VF: synthetic method
   public static Class8342 method21563(Class6980 var0) {
      return var0.method21554();
   }

   // $VF: synthetic method
   public static Class9497 method21564(Class6980 var0) {
      return var0.field30205;
   }

   // $VF: synthetic method
   public static Class5931 method21565(Class6980 var0, Class2512 var1) {
      return var0.method21558(var1);
   }

   // $VF: synthetic method
   public static Class5931 method21566(Class6980 var0, boolean var1, boolean var2) {
      return var0.method21557(var1, var2);
   }

   // $VF: synthetic method
   public static Class5931 method21567(Class6980 var0) {
      return var0.method21556();
   }

   // $VF: synthetic method
   public static Class5931 method21568(Class6980 var0) {
      return var0.method21555();
   }

   static {
      field30201.put("!", "!");
      field30201.put("!!", "tag:yaml.org,2002:");
   }
}
