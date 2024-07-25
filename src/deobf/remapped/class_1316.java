package remapped;

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
import org.jetbrains.annotations.Nullable;

public abstract class class_1316 implements class_5283 {
   private static final ThreadLocal<class_7151> field_7265 = ThreadLocal.<class_7151>withInitial(() -> {
      class_4251 var2 = new class_4251();
      var2.method_19804(class_435.field_1822);
      var2.method_19823(false);
      var2.method_19814(2);
      return new class_7151(new class_9124(), new class_7776(), var2);
   });
   private final class_1250 field_7263 = new class_1250('.', 2);
   private final File field_7264;
   private Map<String, Object> field_7266;

   public class_1316(File var1) {
      this.field_7264 = var1;
   }

   public abstract URL method_6012();

   public synchronized Map<String, Object> method_6020(File var1) {
      List var4 = this.method_6010();
      URL var5 = this.method_6012();

      try {
         this.field_7263.method_5635(var5.openStream());

         for (String var7 : var4) {
            List var8 = this.field_7263.method_5636(var7);
            if (var8 != null) {
               var8.clear();
            }
         }
      } catch (IOException var46) {
         var46.printStackTrace();
      }

      Object var47 = null;
      if (var1.exists()) {
         try (FileInputStream var48 = new FileInputStream(var1)) {
            var47 = (Map)field_7265.get().method_32841(var48);
         } catch (FileNotFoundException var44) {
            var44.printStackTrace();
         } catch (IOException var45) {
            var45.printStackTrace();
         }
      }

      if (var47 == null) {
         var47 = new HashMap();
      }

      Object var49 = var47;

      try (InputStream var51 = var5.openStream()) {
         var49 = (Map)field_7265.get().method_32841(var51);

         for (String var11 : var4) {
            var49.remove(var11);
         }

         for (Entry var53 : var47.entrySet()) {
            if (var49.containsKey(var53.getKey()) && !var4.contains(var53.getKey())) {
               var49.put(var53.getKey(), var53.getValue());
            }
         }
      } catch (IOException var42) {
         var42.printStackTrace();
      }

      this.method_6015((Map<String, Object>)var49);
      this.method_6019(var1, (Map<String, Object>)var49);
      return (Map<String, Object>)var49;
   }

   public abstract void method_6015(Map<String, Object> var1);

   public synchronized void method_6019(File var1, Map<String, Object> var2) {
      try {
         this.field_7263.method_5631(field_7265.get().method_32827(var2), var1);
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public abstract List<String> method_6010();

   public void 筕湗䬾䴂岋놣(String var1, Object var2) {
      this.field_7266.put(var1, var2);
   }

   public void 콵롤좯ꁈ婯㦖() {
      this.field_7264.getParentFile().mkdirs();
      this.method_6019(this.field_7264, this.field_7266);
   }

   public void 鶊ᔎ哺葫롤䬾() {
      this.field_7264.getParentFile().mkdirs();
      this.field_7266 = new ConcurrentSkipListMap<String, Object>(this.method_6020(this.field_7264));
   }

   public Map<String, Object> 㼜郝鶊鷏聛ꦱ() {
      return this.field_7266;
   }

   @Nullable
   public <T> T method_6013(String var1, Class<T> var2, T var3) {
      Object var6 = this.field_7266.get(var1);
      return (T)(var6 == null ? var3 : var6);
   }

   public boolean method_6016(String var1, boolean var2) {
      Object var5 = this.field_7266.get(var1);
      return var5 == null ? var2 : (Boolean)var5;
   }

   @Nullable
   public String method_6017(String var1, String var2) {
      Object var5 = this.field_7266.get(var1);
      return var5 == null ? var2 : (String)var5;
   }

   public int method_6009(String var1, int var2) {
      Object var5 = this.field_7266.get(var1);
      if (var5 == null) {
         return var2;
      } else {
         return !(var5 instanceof Number) ? var2 : ((Number)var5).intValue();
      }
   }

   public double method_6014(String var1, double var2) {
      Object var6 = this.field_7266.get(var1);
      if (var6 == null) {
         return var2;
      } else {
         return !(var6 instanceof Number) ? var2 : ((Number)var6).doubleValue();
      }
   }

   public List<Integer> method_6018(String var1) {
      Object var4 = this.field_7266.get(var1);
      return (List<Integer>)(var4 == null ? new ArrayList<Integer>() : (List)var4);
   }
}
