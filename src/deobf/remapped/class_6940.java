package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6940 implements class_5998 {
   private static final Path field_35676 = null;
   private static final Logger field_35675 = LogManager.getLogger();
   private final class_6901 field_35674;
   private final List<class_2017> field_35677 = Lists.newArrayList();

   public class_6940(class_6901 var1) {
      this.field_35674 = var1;
   }

   public class_6940 method_31753(class_2017 var1) {
      this.field_35677.add(var1);
      return this;
   }

   private CompoundNBT method_31750(String var1, CompoundNBT var2) {
      CompoundNBT var5 = var2;

      for (class_2017 var7 : this.field_35677) {
         var5 = var7.method_9366(var1, var5);
      }

      return var5;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      Path var4 = this.field_35674.method_31600();
      ArrayList var5 = Lists.newArrayList();

      for (Path var7 : this.field_35674.method_31601()) {
         Files.walk(var7)
            .filter(var0 -> var0.toString().endsWith(".snbt"))
            .forEach(
               var3 -> var5.add(
                     CompletableFuture.<class_9797>supplyAsync(() -> this.method_31752(var3, this.method_31748(var7, var3)), Util.getMainWorkerExecutor())
                  )
            );
      }

      Util.<class_9797>method_44680(var5).join().stream().filter(Objects::nonNull).forEach(var3 -> this.method_31751(var1, var3, var4));
   }

   @Override
   public String method_27387() {
      return "SNBT -> NBT";
   }

   private String method_31748(Path var1, Path var2) {
      String var5 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var5.substring(0, var5.length() - ".snbt".length());
   }

   @Nullable
   private class_9797 method_31752(Path var1, String var2) {
      try (BufferedReader var5 = Files.newBufferedReader(var1)) {
         String var7 = IOUtils.toString(var5);
         CompoundNBT var8 = this.method_31750(var2, class_2392.method_10916(var7));
         ByteArrayOutputStream var9 = new ByteArrayOutputStream();
         class_5957.method_27217(var8, var9);
         byte[] var10 = var9.toByteArray();
         String var11 = field_30556.hashBytes(var10).toString();
         String var12;
         if (field_35676 != null) {
            var12 = var8.method_38712("    ", 0).getString() + "\n";
         } else {
            var12 = null;
         }

         return new class_9797(var2, var10, var12, var11);
      } catch (CommandSyntaxException var26) {
         field_35675.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", var2, var1, var26);
      } catch (IOException var27) {
         field_35675.error("Couldn't convert {} from SNBT to NBT at {}", var2, var1, var27);
      }

      return null;
   }

   private void method_31751(class_4162 var1, class_9797 var2, Path var3) {
      if (class_9797.method_45201(var2) != null) {
         Path var6 = field_35676.resolve(class_9797.method_45200(var2) + ".snbt");

         try {
            FileUtils.write(var6.toFile(), class_9797.method_45201(var2), StandardCharsets.UTF_8);
         } catch (IOException var20) {
            field_35675.error("Couldn't write structure SNBT {} at {}", class_9797.method_45200(var2), var6, var20);
         }
      }

      Path var23 = var3.resolve(class_9797.method_45200(var2) + ".nbt");

      try {
         if (!Objects.equals(var1.method_19313(var23), class_9797.method_45202(var2)) || !Files.exists(var23)) {
            Files.createDirectories(var23.getParent());

            try (OutputStream var7 = Files.newOutputStream(var23)) {
               var7.write(class_9797.method_45204(var2));
            }
         }

         var1.method_19317(var23, class_9797.method_45202(var2));
      } catch (IOException var22) {
         field_35675.error("Couldn't write structure {} at {}", class_9797.method_45200(var2), var23, var22);
      }
   }
}
