package remapped;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_1223 implements class_9375 {
   private static final Map<String, String> field_6782 = new HashMap<String, String>();
   public final class_1445 field_6776;
   private class_8087 field_6779;
   private final class_8613<class_4529> field_6778;
   private final class_8613<class_404> field_6781;
   private class_4529 field_6775;
   private class_4319 field_6780;

   public class_1223(class_8907 var1) {
      this(new class_5432(var1));
   }

   public class_1223(class_1445 var1) {
      this.field_6776 = var1;
      this.field_6779 = null;
      this.field_6780 = new class_4319(null, new HashMap<String, String>(field_6782));
      this.field_6778 = new class_8613<class_4529>(100);
      this.field_6781 = new class_8613<class_404>(10);
      this.field_6775 = new class_5387(this, null);
   }

   @Override
   public boolean method_43353(class_3467 var1) {
      this.method_43354();
      return this.field_6779 != null && this.field_6779.method_36724(var1);
   }

   @Override
   public class_8087 method_43354() {
      if (this.field_6779 == null && this.field_6775 != null) {
         this.field_6779 = this.field_6775.method_21045();
      }

      return this.field_6779;
   }

   @Override
   public class_8087 method_43352() {
      this.method_43354();
      class_8087 var3 = this.field_6779;
      this.field_6779 = null;
      return var3;
   }

   private class_4319 method_5413() {
      class_7826 var3 = null;
      HashMap var4 = new HashMap();

      while (this.field_6776.method_6622(class_7523.field_38413)) {
         class_5438 var5 = (class_5438)this.field_6776.method_6624();
         if (var5.method_24775().equals("YAML")) {
            if (var3 != null) {
               throw new class_7936(null, null, "found duplicate YAML directive", var5.method_21372());
            }

            List var6 = var5.method_24774();
            Integer var7 = (Integer)var6.get(0);
            if (var7 != 1) {
               throw new class_7936(null, null, "found incompatible YAML document (version 1.* is required)", var5.method_21372());
            }

            Integer var8 = (Integer)var6.get(1);
            switch (var8) {
               case 0:
                  var3 = class_7826.field_39690;
                  break;
               default:
                  var3 = class_7826.field_39688;
            }
         } else if (var5.method_24775().equals("TAG")) {
            List var10 = var5.method_24774();
            String var12 = (String)var10.get(0);
            String var13 = (String)var10.get(1);
            if (var4.containsKey(var12)) {
               throw new class_7936(null, null, "duplicate tag handle " + var12, var5.method_21372());
            }

            var4.put(var12, var13);
         }
      }

      if (var3 != null || !var4.isEmpty()) {
         for (String var11 : field_6782.keySet()) {
            if (!var4.containsKey(var11)) {
               var4.put(var11, field_6782.get(var11));
            }
         }

         this.field_6780 = new class_4319(var3, var4);
      }

      return this.field_6780;
   }

   private class_8087 method_5414() {
      return this.method_5423(false, false);
   }

   private class_8087 method_5426() {
      return this.method_5423(true, true);
   }

   private class_8087 method_5423(boolean var1, boolean var2) {
      class_404 var5 = null;
      class_404 var6 = null;
      class_404 var7 = null;
      Object var24;
      if (!this.field_6776.method_6622(class_7523.field_38417)) {
         String var8 = null;
         class_3138 var9 = null;
         if (!this.field_6776.method_6622(class_7523.field_38400)) {
            if (this.field_6776.method_6622(class_7523.field_38412)) {
               class_9295 var10 = (class_9295)this.field_6776.method_6624();
               var5 = var10.method_21372();
               var7 = var5;
               var6 = var10.method_21374();
               var9 = var10.method_42772();
               if (this.field_6776.method_6622(class_7523.field_38400)) {
                  class_977 var12 = (class_977)this.field_6776.method_6624();
                  var6 = var12.method_21374();
                  var8 = var12.method_4272();
               }
            }
         } else {
            class_977 var22 = (class_977)this.field_6776.method_6624();
            var5 = var22.method_21372();
            var6 = var22.method_21374();
            var8 = var22.method_4272();
            if (this.field_6776.method_6622(class_7523.field_38412)) {
               class_9295 var25 = (class_9295)this.field_6776.method_6624();
               var7 = var25.method_21372();
               var6 = var25.method_21374();
               var9 = var25.method_42772();
            }
         }

         String var23 = null;
         if (var9 != null) {
            String var26 = var9.method_14508();
            String var13 = var9.method_14506();
            if (var26 == null) {
               var23 = var13;
            } else {
               if (!this.field_6780.method_20101().containsKey(var26)) {
                  throw new class_7936("while parsing a node", var5, "found undefined tag handle " + var26, var7);
               }

               var23 = this.field_6780.method_20101().get(var26) + var13;
            }
         }

         if (var5 == null) {
            var5 = this.field_6776.method_6623().method_21372();
            var6 = var5;
         }

         var24 = null;
         boolean var27 = var23 == null || var23.equals("!");
         if (var2 && this.field_6776.method_6622(class_7523.field_38416)) {
            var6 = this.field_6776.method_6623().method_21374();
            var24 = new class_2410(var8, var23, var27, var5, var6, class_435.field_1822);
            this.field_6775 = new class_6883(this, null);
         } else if (!this.field_6776.method_6622(class_7523.field_38396)) {
            if (!this.field_6776.method_6622(class_7523.field_38410)) {
               if (!this.field_6776.method_6622(class_7523.field_38402)) {
                  if (var1 && this.field_6776.method_6622(class_7523.field_38398)) {
                     var6 = this.field_6776.method_6623().method_21372();
                     var24 = new class_2410(var8, var23, var27, var5, var6, class_435.field_1822);
                     this.field_6775 = new class_6417(this, null);
                  } else if (var1 && this.field_6776.method_6622(class_7523.field_38411)) {
                     var6 = this.field_6776.method_6623().method_21372();
                     var24 = new class_3659(var8, var23, var27, var5, var6, class_435.field_1822);
                     this.field_6775 = new class_2212(this, null);
                  } else {
                     if (var8 == null && var23 == null) {
                        String var28;
                        if (!var1) {
                           var28 = "flow";
                        } else {
                           var28 = "block";
                        }

                        class_4610 var14 = this.field_6776.method_6623();
                        throw new class_7936(
                           "while parsing a " + var28 + " node",
                           var5,
                           "expected the node content, but found '" + var14.method_21371() + "'",
                           var14.method_21372()
                        );
                     }

                     var24 = new class_4417(var8, var23, new class_2798(var27, false), "", var5, var6, class_7587.field_38646);
                     this.field_6775 = this.field_6778.method_39590();
                  }
               } else {
                  var6 = this.field_6776.method_6623().method_21374();
                  var24 = new class_3659(var8, var23, var27, var5, var6, class_435.field_1826);
                  this.field_6775 = new class_5654(this, null);
               }
            } else {
               var6 = this.field_6776.method_6623().method_21374();
               var24 = new class_2410(var8, var23, var27, var5, var6, class_435.field_1826);
               this.field_6775 = new class_8620(this, null);
            }
         } else {
            class_8016 var29 = (class_8016)this.field_6776.method_6624();
            var6 = var29.method_21374();
            class_2798 var30;
            if ((!var29.method_36385() || var23 != null) && !"!".equals(var23)) {
               if (var23 != null) {
                  var30 = new class_2798(false, false);
               } else {
                  var30 = new class_2798(false, true);
               }
            } else {
               var30 = new class_2798(true, false);
            }

            var24 = new class_4417(var8, var23, var30, var29.method_36387(), var5, var6, var29.method_36386());
            this.field_6775 = this.field_6778.method_39590();
         }
      } else {
         class_3706 var21 = (class_3706)this.field_6776.method_6624();
         var24 = new class_8788(var21.method_17207(), var21.method_21372(), var21.method_21374());
         this.field_6775 = this.field_6778.method_39590();
      }

      return (class_8087)var24;
   }

   private class_8087 method_5415(class_404 var1) {
      return new class_4417(null, null, new class_2798(true, false), "", var1, var1, class_7587.field_38646);
   }

   static {
      field_6782.put(field_6777[7], field_6777[7]);
      field_6782.put("!!", "tag:yaml.org,2002:");
   }
}
