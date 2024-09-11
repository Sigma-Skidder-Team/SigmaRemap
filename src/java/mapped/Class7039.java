package mapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;

import com.mentalfrostbyte.jello.viaversion.managers.SmallResourceManager;
import org.jetbrains.annotations.Nullable;

public abstract class Class7039 implements SmallResourceManager {
   private static final ThreadLocal<Class9134> field30375 = ThreadLocal.<Class9134>withInitial(() -> {
      Class8324 var2 = new Class8324();
      var2.method29171(Class2214.field14476);
      var2.method29164(false);
      var2.method29156(2);
      return new Class9134(new Class6212(), new Class4500(), var2);
   });
   private final Class6999 field30376 = new Class6999('.', 2);
   private final File field30377;
   private Map<String, Object> field30378;

   public Class7039(File var1) {
      this.field30377 = var1;
   }

   public abstract URL method21874();

   public synchronized Map<String, Object> method21875(File var1) {
      List<String> var4 = this.method21878();
      URL var5 = this.method21874();

      try {
         this.field30376.method21691(var5.openStream());

         for (String var7 : var4) {
            List var8 = this.field30376.method21690(var7);
            if (var8 != null) {
               var8.clear();
            }
         }
      } catch (IOException var46) {
         var46.printStackTrace();
      }

      Map<String, Object> var47 = null;
      if (var1.exists()) {
         try (FileInputStream var48 = new FileInputStream(var1)) {
            var47 = field30375.get().method34090(var48);
         } catch (FileNotFoundException var44) {
            var44.printStackTrace();
         } catch (IOException var45) {
            var45.printStackTrace();
         }
      }

      if (var47 == null) {
         var47 = new HashMap<>();
      }

      Map<String, Object> var49 = var47;

      try (InputStream var51 = var5.openStream()) {
         var49 = field30375.get().method34090(var51);

         for (String var11 : var4) {
            var49.remove(var11);
         }

         for (Entry<String, Object> var53 : var47.entrySet()) {
            if (var49.containsKey(var53.getKey()) && !var4.contains(var53.getKey())) {
               var49.put(var53.getKey(), var53.getValue());
            }
         }
      } catch (IOException var42) {
         var42.printStackTrace();
      }

      this.method21876(var49);
      this.method21877(var1, var49);
      return var49;
   }

   public abstract void method21876(Map<String, Object> var1);

   public synchronized void method21877(File var1, Map<String, Object> var2) {
      try {
         this.field30376.method21692(field30375.get().method34080(var2), var1);
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public abstract List<String> method21878();

   @Override
   public void method21879(String var1, Object var2) {
      this.field30378.put(var1, var2);
   }

   @Override
   public void method21880() {
      this.field30377.getParentFile().mkdirs();
      this.method21877(this.field30377, this.field30378);
   }

   @Override
   public void method21881() {
      this.field30377.getParentFile().mkdirs();
      this.field30378 = new ConcurrentSkipListMap<String, Object>(this.method21875(this.field30377));
   }

   @Override
   public Map<String, Object> method21882() {
      return this.field30378;
   }

   @Nullable
   public <T> T method21883(String var1, Class<T> var2, T var3) {
      Object var6 = this.field30378.get(var1);
      return (T)(var6 == null ? var3 : var6);
   }

   public boolean method21884(String var1, boolean var2) {
      Object var5 = this.field30378.get(var1);
      return var5 == null ? var2 : (Boolean)var5;
   }

   @Nullable
   public String method21885(String var1, String var2) {
      Object var5 = this.field30378.get(var1);
      return var5 == null ? var2 : (String)var5;
   }

   public int method21886(String var1, int var2) {
      Object var5 = this.field30378.get(var1);
      if (var5 == null) {
         return var2;
      } else {
         return !(var5 instanceof Number) ? var2 : ((Number)var5).intValue();
      }
   }

   public double method21887(String var1, double var2) {
      Object var6 = this.field30378.get(var1);
      if (var6 == null) {
         return var2;
      } else {
         return !(var6 instanceof Number) ? var2 : ((Number)var6).doubleValue();
      }
   }

   public List<Integer> method21888(String var1) {
      Object var4 = this.field30378.get(var1);
      return (List<Integer>)(var4 == null ? new ArrayList<Integer>() : (List)var4);
   }
}
