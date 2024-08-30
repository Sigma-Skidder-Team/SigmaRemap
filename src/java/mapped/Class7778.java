package mapped;

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

public abstract class Class7778 implements Class7779 {
   private final Map<String, Class6255> field33364 = new HashMap<String, Class6255>();

   public Class7778() {
      try {
         this.method25774();
      } catch (Exception var4) {
      }
   }

   @Override
   public void method25766(Class6255 var1) throws Exception {
      Preconditions.checkArgument(var1.method19220().matches("^[a-z0-9_-]{3,15}$"), var1.method19220() + " is not a valid sub-command name.");
      if (!this.method25767(var1.method19220())) {
         this.field33364.put(var1.method19220().toLowerCase(Locale.ROOT), var1);
      } else {
         throw new Exception("ViaSubCommand " + var1.method19220() + " does already exists!");
      }
   }

   @Override
   public boolean method25767(String var1) {
      return this.field33364.containsKey(var1.toLowerCase(Locale.ROOT));
   }

   @Override
   public Class6255 method25768(String var1) {
      return this.field33364.get(var1.toLowerCase(Locale.ROOT));
   }

   @Override
   public boolean method25769(Class9150 var1, String[] var2) {
      if (var2.length != 0) {
         if (this.method25767(var2[0])) {
            Class6255 var5 = this.method25768(var2[0]);
            if (this.method25773(var1, var5.method19224())) {
               String[] var6 = Arrays.<String>copyOfRange(var2, 1, var2.length);
               boolean var7 = var5.method19222(var1, var6);
               if (!var7) {
                  var1.method34169("Usage: /viaversion " + var5.method19223());
               }

               return var7;
            } else {
               var1.method34169(method25775("&cYou are not allowed to use this command!"));
               return false;
            }
         } else {
            var1.method34169(method25775("&cThis command does not exist."));
            this.method25771(var1);
            return false;
         }
      } else {
         this.method25771(var1);
         return false;
      }
   }

   @Override
   public List<String> method25770(Class9150 var1, String[] var2) {
      Set<Class6255> var5 = this.method25772(var1);
      ArrayList var6 = new ArrayList();
      if (var2.length != 1) {
         if (var2.length >= 2 && this.method25768(var2[0]) != null) {
            Class6255 var7 = this.method25768(var2[0]);
            if (var5.contains(var7)) {
               String[] var8 = Arrays.<String>copyOfRange(var2, 1, var2.length);
               List var9 = var7.method19225(var1, var8);
               Collections.sort(var9);
               return var9;
            }

            return var6;
         }
      } else if (var2[0].isEmpty()) {
         for (Class6255 var12 : var5) {
            var6.add(var12.method19220());
         }
      } else {
         for (Class6255 var13 : var5) {
            if (var13.method19220().toLowerCase().startsWith(var2[0].toLowerCase(Locale.ROOT))) {
               var6.add(var13.method19220());
            }
         }
      }

      return var6;
   }

   public void method25771(Class9150 var1) {
      Set<Class6255> var4 = this.method25772(var1);
      if (var4.isEmpty()) {
         var1.method34169(method25775("&cYou are not allowed to use these commands!"));
      } else {
         var1.method34169(method25775("&aViaVersion &c" + Class8042.method27613().getVersion()));
         var1.method34169(method25775("&6Commands:"));

         for (Class6255 var6 : var4) {
            var1.method34169(method25775(String.format("&2/viaversion %s &7- &6%s", var6.method19223(), var6.method19221())));
         }

         var4.clear();
      }
   }

   private Set<Class6255> method25772(Class9150 var1) {
      HashSet var4 = new HashSet();

      for (Class6255 var6 : this.field33364.values()) {
         if (this.method25773(var1, var6.method19224())) {
            var4.add(var6);
         }
      }

      return var4;
   }

   private boolean method25773(Class9150 var1, String var2) {
      return var2 == null || var1.method34168(var2);
   }

   private void method25774() throws Exception {
      this.method25766(new Class6259());
      this.method25766(new Class6260());
      this.method25766(new Class6262());
      this.method25766(new ServerDump());
      this.method25766(new Class6256());
      this.method25766(new Class6263());
      this.method25766(new Class6261());
      this.method25766(new Class6257());
      this.method25766(new Class6264());
   }

   public static String method25775(String var0) {
      try {
         var0 = Class2307.method9078('&', var0);
      } catch (Exception var4) {
      }

      return var0;
   }

   public static void method25776(Class9150 var0, String var1, Object... var2) {
      var0.method34169(method25775(var2 != null ? String.format(var1, var2) : var1));
   }
}
