package remapped;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class class_953 implements class_9420 {
   public class_953(class_4364 var1) {
      this.field_4910 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_7984 var4 = (class_7984)var1;
      if (!Map.class.isAssignableFrom(var1.method_7230())) {
         if (!Collection.class.isAssignableFrom(var1.method_7230())) {
            Object var5 = this.field_4910.method_42428(var4);
            return !var1.method_7225() ? this.method_4197(var4, var5) : var5;
         } else {
            return !var1.method_7225() ? this.field_4910.method_42407(var4) : this.field_4910.method_42436(var4);
         }
      } else {
         return !var1.method_7225() ? this.field_4910.method_42423(var4) : this.field_4910.method_42438(var4);
      }
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      if (!Map.class.isAssignableFrom(var1.method_7230())) {
         if (!Set.class.isAssignableFrom(var1.method_7230())) {
            this.method_4197((class_7984)var1, var2);
         } else {
            this.field_4910.method_42408((class_7984)var1, (Set<Object>)var2);
         }
      } else {
         this.field_4910.method_42414((class_7984)var1, (Map<Object, Object>)var2);
      }
   }

   public Object method_4197(class_7984 var1, Object var2) {
      this.field_4910.method_14787(var1);
      Class var5 = var1.method_7230();

      for (class_8473 var8 : var1.method_10282()) {
         if (!(var8.method_38998() instanceof class_8437)) {
            throw new class_5251("Keys must be scalars but found: " + var8.method_38998());
         }

         class_8437 var9 = (class_8437)var8.method_38998();
         class_1621 var10 = var8.method_38999();
         var9.method_7226(String.class);
         String var11 = (String)this.field_4910.method_42411(var9);

         try {
            class_8795 var12 = this.field_4910.field_47062.get(var5);
            class_3002 var13 = var12 == null ? this.method_4200(var5, var11) : var12.method_40410(var11);
            if (!var13.method_13710()) {
               throw new class_5251("No writable property '" + var11 + "' on class: " + var5.getName());
            }

            var10.method_7226((Class<? extends Object>)var13.method_13707());
            boolean var14 = var12 != null ? var12.method_40407(var11, var10) : false;
            if (!var14 && var10.method_7221() != class_99.field_235) {
               Class[] var15 = var13.method_13708();
               if (var15 != null && var15.length > 0) {
                  if (var10.method_7221() == class_99.field_234) {
                     Class var16 = var15[0];
                     class_1596 var17 = (class_1596)var10;
                     var17.method_7154(var16);
                  } else if (Set.class.isAssignableFrom(var10.method_7230())) {
                     Class var22 = var15[0];
                     class_7984 var24 = (class_7984)var10;
                     var24.method_36233(var22);
                     var24.method_7231(Boolean.valueOf(true));
                  } else if (Map.class.isAssignableFrom(var10.method_7230())) {
                     Class var23 = var15[0];
                     Class var25 = var15[1];
                     class_7984 var18 = (class_7984)var10;
                     var18.method_36235(var23, var25);
                     var18.method_7231(Boolean.valueOf(true));
                  }
               }
            }

            Object var21 = var12 != null ? this.method_4199(var12, var11, var10) : this.field_4910.method_42411(var10);
            if ((var13.method_13707() == float.class || var13.method_13707() == Float.class) && var21 instanceof Double) {
               var21 = ((Double)var21).floatValue();
            }

            if (var13.method_13707() == String.class && class_9592.field_48884.equals(var10.method_7232()) && var21 instanceof byte[]) {
               var21 = new String((byte[])var21);
            }

            if (var12 == null || !var12.method_40415(var2, var11, var21)) {
               var13.method_13704(var2, var21);
            }
         } catch (class_3456 var19) {
            throw var19;
         } catch (Exception var20) {
            throw new class_8665(
               "Cannot create property=" + var11 + " for JavaBean=" + var2, var1.method_7224(), var20.getMessage(), var10.method_7224(), var20
            );
         }
      }

      return var2;
   }

   private Object method_4199(class_8795 var1, String var2, class_1621 var3) {
      Object var6 = var1.method_40416(var2, var3);
      if (var6 == null) {
         return this.field_4910.method_42411(var3);
      } else {
         this.field_4910.field_47063.put(var3, var6);
         return this.field_4910.method_42417(var3);
      }
   }

   public class_3002 method_4200(Class<? extends Object> var1, String var2) {
      return this.field_4910.method_42416().method_29227(var1, var2);
   }
}
