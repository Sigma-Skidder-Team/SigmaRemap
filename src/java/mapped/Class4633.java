package mapped;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Class4633 implements Class4632 {
   public final Class6210 field22158;

   public Class4633(Class6210 var1) {
      this.field22158 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Class7254 var4 = (Class7254)var1;
      if (!Map.class.isAssignableFrom(var1.method22784())) {
         if (!Collection.class.isAssignableFrom(var1.method22784())) {
            Object var5 = this.field22158.method19171(var4);
            return !var1.method22787() ? this.method14589(var4, var5) : var5;
         } else {
            return !var1.method22787() ? this.field22158.method19182(var4) : this.field22158.method19174(var4);
         }
      } else {
         return !var1.method22787() ? this.field22158.method19183(var4) : this.field22158.method19176(var4);
      }
   }

   @Override
   public void method14588(Class7255 var1, Object var2) {
      if (!Map.class.isAssignableFrom(var1.method22784())) {
         if (!Set.class.isAssignableFrom(var1.method22784())) {
            this.method14589((Class7254)var1, var2);
         } else {
            this.field22158.method19151((Class7254)var1, (Set<Object>)var2);
         }
      } else {
         this.field22158.method19150((Class7254)var1, (Map<Object, Object>)var2);
      }
   }

   public Object method14589(Class7254 var1, Object var2) {
      this.field22158.method19147(var1);
      Class var5 = var1.method22784();

      for (Class9460 var8 : var1.method22770()) {
         if (!(var8.method36417() instanceof Class7256)) {
            throw new Class2478("Keys must be scalars but found: " + var8.method36417());
         }

         Class7256 var9 = (Class7256)var8.method36417();
         Class7255 var10 = var8.method36418();
         var9.method22785(String.class);
         String var11 = (String)this.field22158.method19163(var9);

         try {
            Class9545 var12 = this.field22158.field27713.get(var5);
            Class2013 var13 = var12 == null ? this.method14591(var5, var11) : var12.method36951(var11);
            if (!var13.method8540()) {
               throw new Class2478("No writable property '" + var11 + "' on class: " + var5.getName());
            }

            var10.method22785((Class<? extends Object>)var13.method8537());
            boolean var14 = var12 != null ? var12.method36958(var11, var10) : false;
            if (!var14 && var10.method22769() != Class2048.field13364) {
               Class[] var15 = var13.method8538();
               if (var15 != null && var15.length > 0) {
                  if (var10.method22769() == Class2048.field13365) {
                     Class var16 = var15[0];
                     Class7252 var17 = (Class7252)var10;
                     var17.method22771(var16);
                  } else if (Set.class.isAssignableFrom(var10.method22784())) {
                     Class var22 = var15[0];
                     Class7254 var24 = (Class7254)var10;
                     var24.method22776(var22);
                     var24.method22789(Boolean.valueOf(true));
                  } else if (Map.class.isAssignableFrom(var10.method22784())) {
                     Class var23 = var15[0];
                     Class var25 = var15[1];
                     Class7254 var18 = (Class7254)var10;
                     var18.method22777(var23, var25);
                     var18.method22789(Boolean.valueOf(true));
                  }
               }
            }

            Object var21 = var12 != null ? this.method14590(var12, var11, var10) : this.field22158.method19163(var10);
            if ((var13.method8537() == float.class || var13.method8537() == Float.class) && var21 instanceof Double) {
               var21 = ((Double)var21).floatValue();
            }

            if (var13.method8537() == String.class && Class9757.field45636.equals(var10.method22780()) && var21 instanceof byte[]) {
               var21 = new String((byte[])var21);
            }

            if (var12 == null || !var12.method36959(var2, var11, var21)) {
               var13.method8542(var2, var21);
            }
         } catch (Class2483 var19) {
            throw var19;
         } catch (Exception var20) {
            throw new Class2482("Cannot create property=" + var11 + " for JavaBean=" + var2, var1.method22782(), var20.getMessage(), var10.method22782(), var20);
         }
      }

      return var2;
   }

   private Object method14590(Class9545 var1, String var2, Class7255 var3) {
      Object var6 = var1.method36961(var2, var3);
      if (var6 == null) {
         return this.field22158.method19163(var3);
      } else {
         this.field22158.field27705.put(var3, var6);
         return this.field22158.method19164(var3);
      }
   }

   public Class2013 method14591(Class<? extends Object> var1, String var2) {
      return this.field22158.method19185().method32617(var1, var2);
   }
}
