package remapped;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3187 {
   private static final Logger field_15917 = LogManager.getLogger();
   private final class_1893 field_15915;
   private final List<class_2560> field_15916 = Lists.newArrayList();

   public class_3187(class_1893 var1) {
      this.field_15915 = var1;
      this.method_14670();
   }

   public void method_14670() {
      try {
         this.field_15916.clear();
         class_5734 var3 = class_5957.method_27223(new File(this.field_15915.field_9575, "servers.dat"));
         if (var3 == null) {
            return;
         }

         class_3416 var4 = var3.method_25927("servers", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.field_15916.add(class_2560.method_11625(var4.method_15764(var5)));
         }
      } catch (Exception var6) {
         field_15917.error("Couldn't load server list", var6);
      }
   }

   public void method_14676() {
      try {
         class_3416 var3 = new class_3416();

         for (class_2560 var5 : this.field_15916) {
            var3.add(var5.method_11627());
         }

         class_5734 var9 = new class_5734();
         var9.method_25946("servers", var3);
         File var10 = File.createTempFile("servers", ".dat", this.field_15915.field_9575);
         class_5957.method_27225(var9, var10);
         File var6 = new File(this.field_15915.field_9575, "servers.dat_old");
         File var7 = new File(this.field_15915.field_9575, "servers.dat");
         class_9665.method_44675(var7, var10, var6);
      } catch (Exception var8) {
         field_15917.error("Couldn't save server list", var8);
      }
   }

   public class_2560 method_14673(int var1) {
      return this.field_15916.get(var1);
   }

   public void method_14672(class_2560 var1) {
      this.field_15916.remove(var1);
   }

   public void method_14674(class_2560 var1) {
      this.field_15916.add(var1);
   }

   public int method_14671() {
      return this.field_15916.size();
   }

   public void method_14667(int var1, int var2) {
      class_2560 var5 = this.method_14673(var1);
      this.field_15916.set(var1, this.method_14673(var2));
      this.field_15916.set(var2, var5);
      this.method_14676();
   }

   public void method_14675(int var1, class_2560 var2) {
      this.field_15916.set(var1, var2);
   }

   public static void method_14669(class_2560 var0) {
      class_3187 var3 = new class_3187(class_1893.method_8510());
      var3.method_14670();

      for (int var4 = 0; var4 < var3.method_14671(); var4++) {
         class_2560 var5 = var3.method_14673(var4);
         if (var5.field_12670.equals(var0.field_12670) && var5.field_12675.equals(var0.field_12675)) {
            var3.method_14675(var4, var0);
            break;
         }
      }

      var3.method_14676();
   }
}
