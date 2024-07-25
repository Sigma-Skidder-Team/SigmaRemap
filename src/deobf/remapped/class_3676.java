package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DynamicOps;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.zip.ZipOutputStream;
import javax.annotation.Nullable;

public class class_3676 implements AutoCloseable {
   private final class_7532 field_17929;
   private final Path field_17928;
   private final String field_17931;
   private final Map<class_263, Path> field_17926;

   public class_3676(class_9663 var1, String var2) throws IOException {
      this.field_17927 = var1;
      this.field_17926 = Maps.newHashMap();
      this.field_17931 = var2;
      this.field_17928 = class_9663.method_44629(var1).resolve(var2);
      this.field_17929 = class_7532.method_34315(this.field_17928);
   }

   public String method_17070() {
      return this.field_17931;
   }

   public Path method_17064(class_263 var1) {
      return this.field_17926.computeIfAbsent(var1, var1x -> this.field_17928.resolve(var1x.method_1140()));
   }

   public File method_17068(class_5621<World> var1) {
      return class_8760.method_40231(var1, this.field_17928.toFile());
   }

   private void method_17056() {
      if (!this.field_17929.method_34314()) {
         throw new IllegalStateException("Lock is no longer valid");
      }
   }

   public class_5645 method_17059() {
      this.method_17056();
      return new class_5645(this, class_9663.method_44636(this.field_17927));
   }

   public boolean method_17069() {
      class_460 var3 = this.method_17058();
      return var3 != null && var3.method_2198().method_22540() != class_9663.method_44627(this.field_17927);
   }

   public boolean method_17057(class_1215 var1) {
      this.method_17056();
      return class_7682.method_34817(this, var1);
   }

   @Nullable
   public class_460 method_17058() {
      this.method_17056();
      return (class_460)class_9663.method_44637(
         this.field_17927, this.field_17928.toFile(), class_9663.method_44630(this.field_17927, this.field_17928.toFile(), false)
      );
   }

   @Nullable
   public class_5684 method_17072(DynamicOps<class_8406> var1, class_2805 var2) {
      this.method_17056();
      return (class_5684)class_9663.method_44637(this.field_17927, this.field_17928.toFile(), class_9663.method_44623(var1, var2));
   }

   @Nullable
   public class_2805 method_17073() {
      this.method_17056();
      return (class_2805)class_9663.method_44637(this.field_17927, this.field_17928.toFile(), (var0, var1) -> class_9663.method_44632(var0, var1));
   }

   public void method_17065(class_6322 var1, class_5684 var2) {
      this.method_17066(var1, var2, (CompoundNBT)null);
   }

   public void method_17066(class_6322 var1, class_5684 var2, CompoundNBT var3) {
      File var6 = this.field_17928.toFile();
      CompoundNBT var7 = var2.method_25713(var1, var3);
      CompoundNBT var8 = new CompoundNBT();
      var8.put("Data", var7);

      try {
         File var9 = File.createTempFile("level", ".dat", var6);
         class_5957.method_27218(var8, var9);
         File var10 = new File(var6, "level.dat_old");
         File var11 = new File(var6, "level.dat");
         Util.method_44675(var11, var9, var10);
      } catch (Exception var12) {
         class_9663.method_44619().error("Failed to save level {}", var6, var12);
      }
   }

   public File method_17060() {
      this.method_17056();
      return this.field_17928.resolve("icon.png").toFile();
   }

   public void method_17074() throws IOException {
      this.method_17056();
      Path var3 = this.field_17928.resolve("session.lock");

      for (int var4 = 1; var4 <= 5; var4++) {
         class_9663.method_44619().info("Attempt {}...", var4);

         try {
            Files.walkFileTree(this.field_17928, new class_6753(this, var3));
            break;
         } catch (IOException var8) {
            if (var4 >= 5) {
               throw var8;
            }

            class_9663.method_44619().warn("Failed to delete {}", this.field_17928, var8);

            try {
               Thread.sleep(500L);
            } catch (InterruptedException var7) {
            }
         }
      }
   }

   public void method_17062(String var1) throws IOException {
      this.method_17056();
      File var4 = new File(class_9663.method_44629(this.field_17927).toFile(), this.field_17931);
      if (var4.exists()) {
         File var5 = new File(var4, "level.dat");
         if (var5.exists()) {
            CompoundNBT var6 = class_5957.method_27227(var5);
            CompoundNBT var7 = var6.getCompound("Data");
            var7.method_25941("LevelName", var1);
            class_5957.method_27218(var6, var5);
         }
      }
   }

   public long method_17071() throws IOException {
      this.method_17056();
      String var3 = LocalDateTime.now().format(class_9663.method_44617()) + "_" + this.field_17931;
      Path var4 = this.field_17927.method_44625();

      try {
         Files.createDirectories(Files.exists(var4) ? var4.toRealPath() : var4);
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      Path var5 = var4.resolve(class_6494.method_29612(var4, var3, ".zip"));

      try (ZipOutputStream var6 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(var5)))) {
         Path var8 = Paths.get(this.field_17931);
         Files.walkFileTree(this.field_17928, new class_1872(this, var8, var6));
      }

      return Files.size(var5);
   }

   @Override
   public void close() throws IOException {
      this.field_17929.close();
   }
}
