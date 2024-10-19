package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.client.util.Util;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class Class4444 implements Class4442 {
   private static final Path field21605 = null;
   private static final Logger field21606 = LogManager.getLogger();
   private final Class9068 field21607;
   private final List<Class6253> field21608 = Lists.newArrayList();

   public Class4444(Class9068 var1) {
      this.field21607 = var1;
   }

   public Class4444 method14021(Class6253 var1) {
      this.field21608.add(var1);
      return this;
   }

   private CompoundNBT method14022(String var1, CompoundNBT var2) {
      CompoundNBT var5 = var2;

      for (Class6253 var7 : this.field21608) {
         var5 = var7.method19217(var1, var5);
      }

      return var5;
   }

   @Override
   public void method14013(Class8297 var1) throws IOException {
      Path var4 = this.field21607.method33776();

      List<CompletableFuture<Class9822>> var5 = Lists.newArrayList();

      for (Path var7 : this.field21607.method33775()) {
         Files.walk(var7)
            .filter(var0 -> var0.toString().endsWith(".snbt"))
            .forEach(
               var3 -> var5.add(CompletableFuture.supplyAsync(() -> this.method14024(var3, this.method14023(var7, var3)), Util.getServerExecutor()))
            );
      }

      Util.gather(var5).join().stream().filter(Objects::nonNull).forEach(var3 -> this.method14025(var1, var3, var4));
   }

   @Override
   public String method14012() {
      return "SNBT -> NBT";
   }

   private String method14023(Path var1, Path var2) {
      String var5 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var5.substring(0, var5.length() - ".snbt".length());
   }

   @Nullable
   private Class9822 method14024(Path var1, String var2) {
      try (BufferedReader var5 = Files.newBufferedReader(var1)) {
         String var7 = IOUtils.toString(var5);
         CompoundNBT var8 = this.method14022(var2, Class7671.method25188(var7));
         ByteArrayOutputStream var9 = new ByteArrayOutputStream();
         CompressedStreamTools.writeCompressed(var8, var9);
         byte[] var10 = var9.toByteArray();
         String var11 = field21602.hashBytes(var10).toString();
         String var12;
         if (field21605 != null) {
            var12 = var8.toFormattedComponent("    ", 0).getString() + "\n";
         } else {
            var12 = null;
         }

         return new Class9822(var2, var10, var12, var11);
      } catch (CommandSyntaxException var26) {
         field21606.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", var2, var1, var26);
      } catch (IOException var27) {
         field21606.error("Couldn't convert {} from SNBT to NBT at {}", var2, var1, var27);
      }

      return null;
   }

   private void method14025(Class8297 var1, Class9822 var2, Path var3) {
      if (Class9822.method38768(var2) != null) {
         Path var6 = field21605.resolve(Class9822.method38769(var2) + ".snbt");

         try {
            FileUtils.write(var6.toFile(), Class9822.method38768(var2), StandardCharsets.UTF_8);
         } catch (IOException var20) {
            field21606.error("Couldn't write structure SNBT {} at {}", Class9822.method38769(var2), var6, var20);
         }
      }

      Path var23 = var3.resolve(Class9822.method38769(var2) + ".nbt");

      try {
         if (!Objects.equals(var1.method29001(var23), Class9822.method38770(var2)) || !Files.exists(var23)) {
            Files.createDirectories(var23.getParent());

            try (OutputStream var7 = Files.newOutputStream(var23)) {
               var7.write(Class9822.method38771(var2));
            }
         }

         var1.method29002(var23, Class9822.method38770(var2));
      } catch (IOException var22) {
         field21606.error("Couldn't write structure {} at {}", Class9822.method38769(var2), var23, var22);
      }
   }
}
