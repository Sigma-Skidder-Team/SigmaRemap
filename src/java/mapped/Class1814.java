package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
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

public class Class1814 implements AutoCloseable {
   private final Class1697 field9779;
   private final Path field9780;
   private final String field9781;
   private final Map<Class5137, Path> field9782;
   public final Class9774 field9783;

   public Class1814(Class9774 var1, String var2) throws IOException {
      this.field9783 = var1;
      this.field9782 = Maps.newHashMap();
      this.field9781 = var2;
      this.field9780 = Class9774.method38475(var1).resolve(var2);
      this.field9779 = Class1697.method7299(this.field9780);
   }

   public String method7990() {
      return this.field9781;
   }

   public Path method7991(Class5137 var1) {
      return this.field9782.computeIfAbsent(var1, var1x -> this.field9780.resolve(var1x.method15910()));
   }

   public File method7992(Class8705<World> var1) {
      return Class9535.method36874(var1, this.field9780.toFile());
   }

   private void method7993() {
      if (!this.field9779.method7300()) {
         throw new IllegalStateException("Lock is no longer valid");
      }
   }

   public Class8716 method7994() {
      this.method7993();
      return new Class8716(this, Class9774.method38476(this.field9783));
   }

   public boolean method7995() {
      Class2024 var3 = this.method7997();
      return var3 != null && var3.method8652().method30182() != Class9774.method38477(this.field9783);
   }

   public boolean method7996(Class1339 var1) {
      this.method7993();
      return Class9251.method34798(this, var1);
   }

   @Nullable
   public Class2024 method7997() {
      this.method7993();
      return (Class2024)Class9774.method38479(this.field9783, this.field9780.toFile(), Class9774.method38478(this.field9783, this.field9780.toFile(), false));
   }

   @Nullable
   public Class6611 method7998(DynamicOps<Class30> var1, Class7818 var2) {
      this.method7993();
      return (Class6611)Class9774.method38479(this.field9783, this.field9780.toFile(), Class9774.method38480(var1, var2));
   }

   @Nullable
   public Class7818 method7999() {
      this.method7993();
      return (Class7818)Class9774.method38479(this.field9783, this.field9780.toFile(), (var0, var1) -> Class9774.method38483((File) var0, (DataFixer) var1));
   }

   public void method8000(Class8904 var1, Class6611 var2) {
      this.method8001(var1, var2, null);
   }

   public void method8001(Class8904 var1, Class6611 var2, Class39 var3) {
      File var6 = this.field9780.toFile();
      Class39 var7 = var2.method20080(var1, var3);
      Class39 var8 = new Class39();
      var8.method99("Data", var7);

      try {
         File var9 = File.createTempFile("level", ".dat", var6);
         Class8799.method31767(var8, var9);
         File var10 = new File(var6, "level.dat_old");
         File var11 = new File(var6, "level.dat");
         Util.method38526(var11, var9, var10);
      } catch (Exception var12) {
         Class9774.method38481().error("Failed to save level {}", var6, var12);
      }
   }

   public File method8002() {
      this.method7993();
      return this.field9780.resolve("icon.png").toFile();
   }

   public void method8003() throws IOException {
      this.method7993();
      Path var3 = this.field9780.resolve("session.lock");

      for (int var4 = 1; var4 <= 5; var4++) {
         Class9774.method38481().info("Attempt {}...", var4);

         try {
            Files.walkFileTree(this.field9780, new Class7376(this, var3));
            break;
         } catch (IOException var8) {
            if (var4 >= 5) {
               throw var8;
            }

            Class9774.method38481().warn("Failed to delete {}", this.field9780, var8);

            try {
               Thread.sleep(500L);
            } catch (InterruptedException var7) {
            }
         }
      }
   }

   public void method8004(String var1) throws IOException {
      this.method7993();
      File var4 = new File(Class9774.method38475(this.field9783).toFile(), this.field9781);
      if (var4.exists()) {
         File var5 = new File(var4, "level.dat");
         if (var5.exists()) {
            Class39 var6 = Class8799.method31765(var5);
            Class39 var7 = var6.method130("Data");
            var7.method109("LevelName", var1);
            Class8799.method31767(var6, var5);
         }
      }
   }

   public long method8005() throws IOException {
      this.method7993();
      String var3 = LocalDateTime.now().format(Class9774.method38482()) + "_" + this.field9781;
      Path var4 = this.field9783.method38467();

      try {
         Files.createDirectories(Files.exists(var4) ? var4.toRealPath() : var4);
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      Path var5 = var4.resolve(Class8950.method32695(var4, var3, ".zip"));

      try (ZipOutputStream var6 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(var5)))) {
         Path var8 = Paths.get(this.field9781);
         Files.walkFileTree(this.field9780, new Class7375(this, var8, var6));
      }

      return Files.size(var5);
   }

   @Override
   public void close() throws IOException {
      this.field9779.close();
   }

   // $VF: synthetic method
   public static Path method8008(Class1814 var0) {
      return var0.field9780;
   }

   // $VF: synthetic method
   public static Class1697 method8009(Class1814 var0) {
      return var0.field9779;
   }
}
