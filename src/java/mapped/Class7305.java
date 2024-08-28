package mapped;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringEscapeUtils;

public class Class7305 {
   private String[] field31301 = null;
   private String field31302 = null;
   private boolean field31303 = false;
   private int field31304 = 0;
   private String field31305 = null;
   private int field31306 = 0;
   private static final int field31307 = 0;
   private static final int field31308 = 1;
   private static final int field31309 = 2;
   private static final int field31310 = 3;
   private static final int field31311 = 4;
   private static final String field31312 = "pattern:";
   private static final String field31313 = "ipattern:";
   private static final String field31314 = "regex:";
   private static final String field31315 = "iregex:";
   private static final int field31316 = 0;
   private static final int field31317 = 1;
   private static final String field31318 = "#";
   private static final Pattern field31319 = Pattern.compile("^#[0-9a-f]{6}+$");
   private static final Pattern field31320 = Pattern.compile(".*\"text\":\"([^\"]+)\".*");

   public Class7305(String var1, String var2) {
      String[] var5 = Class7944.method26903(var1, ".");
      this.field31301 = Arrays.<String>copyOfRange(var5, 0, var5.length - 1);
      this.field31302 = var5[var5.length - 1];
      if (var2.startsWith("!")) {
         this.field31303 = true;
         var2 = var2.substring(1);
      }

      if (!var2.startsWith("pattern:")) {
         if (!var2.startsWith("ipattern:")) {
            if (!var2.startsWith("regex:")) {
               if (!var2.startsWith("iregex:")) {
                  this.field31304 = 0;
               } else {
                  this.field31304 = 4;
                  var2 = var2.substring("iregex:".length()).toLowerCase();
               }
            } else {
               this.field31304 = 3;
               var2 = var2.substring("regex:".length());
            }
         } else {
            this.field31304 = 2;
            var2 = var2.substring("ipattern:".length()).toLowerCase();
         }
      } else {
         this.field31304 = 1;
         var2 = var2.substring("pattern:".length());
      }

      var2 = StringEscapeUtils.unescapeJava(var2);
      if (this.field31304 == 0 && field31319.matcher(var2).matches()) {
         this.field31306 = 1;
      }

      this.field31305 = var2;
   }

   public boolean method23079(Class39 var1) {
      return !this.field31303 ? this.method23080(var1) : !this.method23080(var1);
   }

   public boolean method23080(Class39 var1) {
      if (var1 == null) {
         return false;
      } else {
         Object var4 = var1;

         for (int var5 = 0; var5 < this.field31301.length; var5++) {
            String var6 = this.field31301[var5];
            var4 = method23082((Class30)var4, var6);
            if (var4 == null) {
               return false;
            }
         }

         if (!this.field31302.equals("*")) {
            Class30 var7 = method23082((Class30)var4, this.field31302);
            return var7 != null ? this.method23083(var7) : false;
         } else {
            return this.method23081((Class30)var4);
         }
      }
   }

   private boolean method23081(Class30 var1) {
      if (var1 instanceof Class39) {
         Class39 var4 = (Class39)var1;

         for (String var6 : var4.method97()) {
            Class30 var7 = var4.method116(var6);
            if (this.method23083(var7)) {
               return true;
            }
         }
      }

      if (var1 instanceof Class41) {
         Class41 var8 = (Class41)var1;
         int var9 = var8.size();

         for (int var10 = 0; var10 < var9; var10++) {
            Class30 var11 = var8.get(var10);
            if (this.method23083(var11)) {
               return true;
            }
         }
      }

      return false;
   }

   private static Class30 method23082(Class30 var0, String var1) {
      if (var0 instanceof Class39) {
         Class39 var6 = (Class39)var0;
         return var6.method116(var1);
      } else if (!(var0 instanceof Class41)) {
         return null;
      } else {
         Class41 var4 = (Class41)var0;
         if (var1.equals("count")) {
            return Class36.method95(var4.size());
         } else {
            int var5 = Class7944.method26899(var1, -1);
            return var5 >= 0 && var5 < var4.size() ? var4.get(var5) : null;
         }
      }
   }

   public boolean method23083(Class30 var1) {
      if (var1 != null) {
         String var4 = method23087(var1, this.field31306);
         return this.method23084(var4);
      } else {
         return false;
      }
   }

   public boolean method23084(String var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field31304) {
            case 0:
               return var1.equals(this.field31305);
            case 1:
               return this.method23085(var1, this.field31305);
            case 2:
               return this.method23085(var1.toLowerCase(), this.field31305);
            case 3:
               return this.method23086(var1, this.field31305);
            case 4:
               return this.method23086(var1.toLowerCase(), this.field31305);
            default:
               throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.field31304);
         }
      }
   }

   private boolean method23085(String var1, String var2) {
      return Class9402.method35744(var1, var2, '*', '?');
   }

   private boolean method23086(String var1, String var2) {
      return var1.matches(var2);
   }

   private static String method23087(Class30 var0, int var1) {
      if (var0 != null) {
         if (!(var0 instanceof Class40)) {
            if (!(var0 instanceof Class36)) {
               if (!(var0 instanceof Class33)) {
                  if (!(var0 instanceof Class37)) {
                     if (!(var0 instanceof Class35)) {
                        if (!(var0 instanceof Class32)) {
                           if (!(var0 instanceof Class34)) {
                              return var0.toString();
                           } else {
                              Class34 var12 = (Class34)var0;
                              return Double.toString(var12.method87());
                           }
                        } else {
                           Class32 var11 = (Class32)var0;
                           return Float.toString(var11.method88());
                        }
                     } else {
                        Class35 var10 = (Class35)var0;
                        return Long.toString(var10.method83());
                     }
                  } else {
                     Class37 var9 = (Class37)var0;
                     return Short.toString(var9.method85());
                  }
               } else {
                  Class33 var8 = (Class33)var0;
                  return Byte.toString(var8.method86());
               }
            } else {
               Class36 var7 = (Class36)var0;
               return var1 != 1 ? Integer.toString(var7.method84()) : "#" + Class9402.method35758(Integer.toHexString(var7.method84()), 6, '0');
            }
         } else {
            Class40 var4 = (Class40)var0;
            String var5 = var4.method81();
            if (var5.startsWith("{")) {
               Matcher var6 = field31320.matcher(var5);
               if (var6.matches()) {
                  return var6.group(1);
               }
            }

            return var5;
         }
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();

      for (int var4 = 0; var4 < this.field31301.length; var4++) {
         String var5 = this.field31301[var4];
         if (var4 > 0) {
            var3.append(".");
         }

         var3.append(var5);
      }

      if (var3.length() > 0) {
         var3.append(".");
      }

      var3.append(this.field31302);
      var3.append(" = ");
      var3.append(this.field31305);
      return var3.toString();
   }
}
