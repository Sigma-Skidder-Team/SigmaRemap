package remapped;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class class_7396 implements class_8714 {
   private final Map<String, class_4403> field_37758 = new HashMap<String, class_4403>();

   public class_7396() {
      try {
         this.method_33677();
      } catch (Exception var4) {
      }
   }

   @Override
   public void method_40051(class_4403 var1) throws Exception {
      Preconditions.checkArgument(var1.method_20527().matches("^[a-z0-9_-]{3,15}$"), var1.method_20527() + " is not a valid sub-command name.");
      if (!this.method_40048(var1.method_20527())) {
         this.field_37758.put(var1.method_20527().toLowerCase(Locale.ROOT), var1);
      } else {
         throw new Exception("ViaSubCommand " + var1.method_20527() + " does already exists!");
      }
   }

   @Override
   public boolean method_40048(String var1) {
      return this.field_37758.containsKey(var1.toLowerCase(Locale.ROOT));
   }

   @Override
   public class_4403 method_40052(String var1) {
      return this.field_37758.get(var1.toLowerCase(Locale.ROOT));
   }

   @Override
   public boolean method_40049(class_7235 var1, String[] var2) {
      if (var2.length != 0) {
         if (this.method_40048(var2[0])) {
            class_4403 var5 = this.method_40052(var2[0]);
            if (this.method_33679(var1, var5.method_20521())) {
               String[] var6 = Arrays.<String>copyOfRange(var2, 1, var2.length);
               boolean var7 = var5.method_20525(var1, var6);
               if (!var7) {
                  var1.method_33103("Usage: /viaversion " + var5.method_20524());
               }

               return var7;
            } else {
               var1.method_33103(method_33680("&cYou are not allowed to use this command!"));
               return false;
            }
         } else {
            var1.method_33103(method_33680("&cThis command does not exist."));
            this.method_33683(var1);
            return false;
         }
      } else {
         this.method_33683(var1);
         return false;
      }
   }

   @Override
   public List<String> method_40050(class_7235 var1, String[] var2) {
      Set var5 = this.method_33678(var1);
      ArrayList var6 = new ArrayList();
      if (var2.length != 1) {
         if (var2.length >= 2 && this.method_40052(var2[0]) != null) {
            class_4403 var7 = this.method_40052(var2[0]);
            if (var5.contains(var7)) {
               String[] var8 = Arrays.<String>copyOfRange(var2, 1, var2.length);
               List var9 = var7.method_20523(var1, var8);
               Collections.sort(var9);
               return var9;
            }

            return var6;
         }
      } else if (var2[0].isEmpty()) {
         for (class_4403 var12 : var5) {
            var6.add(var12.method_20527());
         }
      } else {
         for (class_4403 var13 : var5) {
            if (var13.method_20527().toLowerCase().startsWith(var2[0].toLowerCase(Locale.ROOT))) {
               var6.add(var13.method_20527());
            }
         }
      }

      return var6;
   }

   public void method_33683(class_7235 var1) {
      Set var4 = this.method_33678(var1);
      if (var4.isEmpty()) {
         var1.method_33103(method_33680("&cYou are not allowed to use these commands!"));
      } else {
         var1.method_33103(method_33680("&aViaVersion &c" + class_3446.method_15886().method_34619()));
         var1.method_33103(method_33680("&6Commands:"));

         for (class_4403 var6 : var4) {
            var1.method_33103(method_33680(String.format("&2/viaversion %s &7- &6%s", var6.method_20524(), var6.method_20529())));
         }

         var4.clear();
      }
   }

   private Set<class_4403> method_33678(class_7235 var1) {
      HashSet var4 = new HashSet();

      for (class_4403 var6 : this.field_37758.values()) {
         if (this.method_33679(var1, var6.method_20521())) {
            var4.add(var6);
         }
      }

      return var4;
   }

   private boolean method_33679(class_7235 var1, String var2) {
      return var2 == null || var1.method_33105(var2);
   }

   private void method_33677() throws Exception {
      this.method_40051(new class_1880());
      this.method_40051(new class_5345());
      this.method_40051(new class_7691());
      this.method_40051(new class_1714());
      this.method_40051(new class_804());
      this.method_40051(new class_736());
      this.method_40051(new class_2228());
      this.method_40051(new class_3097());
      this.method_40051(new class_7721());
   }

   public static String method_33680(String var0) {
      try {
         var0 = class_2909.method_13307('&', var0);
      } catch (Exception var4) {
      }

      return var0;
   }

   public static void method_33681(class_7235 var0, String var1, Object... var2) {
      var0.method_33103(method_33680(var2 != null ? String.format(var1, var2) : var1));
   }
}
