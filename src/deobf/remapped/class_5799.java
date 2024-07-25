package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5799 {
   private static final Logger field_29290 = LogManager.getLogger();
   private final Map<Identifier, class_6561> field_29291 = Maps.newHashMap();
   private final DataFixer field_29292;
   private class_7832 field_29288;
   private final Path field_29289;

   public class_5799(class_7832 var1, class_3676 var2, DataFixer var3) {
      this.field_29288 = var1;
      this.field_29292 = var3;
      this.field_29289 = var2.method_17064(class_263.field_931).normalize();
   }

   public class_6561 method_26279(Identifier var1) {
      class_6561 var4 = this.method_26270(var1);
      if (var4 == null) {
         var4 = new class_6561();
         this.field_29291.put(var1, var4);
      }

      return var4;
   }

   @Nullable
   public class_6561 method_26270(Identifier var1) {
      return this.field_29291.computeIfAbsent(var1, var1x -> {
         class_6561 var4 = this.method_26268(var1x);
         return var4 == null ? this.method_26271(var1x) : var4;
      });
   }

   public void method_26275(class_7832 var1) {
      this.field_29288 = var1;
      this.field_29291.clear();
   }

   @Nullable
   private class_6561 method_26271(Identifier var1) {
      Identifier var4 = new Identifier(var1.method_21461(), "structures/" + var1.method_21456() + ".nbt");

      try (class_4038 var5 = this.field_29288.method_35458(var4)) {
         return this.method_26276(var5.method_18576());
      } catch (FileNotFoundException var20) {
         return null;
      } catch (Throwable var21) {
         field_29290.error("Couldn't load structure {}: {}", var1, var21.toString());
         return null;
      }
   }

   @Nullable
   private class_6561 method_26268(Identifier var1) {
      if (!this.field_29289.toFile().isDirectory()) {
         return null;
      } else {
         Path var4 = this.method_26273(var1, ".nbt");

         try (FileInputStream var5 = new FileInputStream(var4.toFile())) {
            return this.method_26276(var5);
         } catch (FileNotFoundException var20) {
            return null;
         } catch (IOException var21) {
            field_29290.error("Couldn't load structure from {}", var4, var21);
            return null;
         }
      }
   }

   private class_6561 method_26276(InputStream var1) throws IOException {
      CompoundNBT var4 = class_5957.method_27219(var1);
      return this.method_26269(var4);
   }

   public class_6561 method_26269(CompoundNBT var1) {
      if (!var1.contains("DataVersion", 99)) {
         var1.putInt("DataVersion", 500);
      }

      class_6561 var4 = new class_6561();
      var4.method_29990(class_4338.method_20179(this.field_29292, class_5397.field_27546, var1, var1.method_25947("DataVersion")));
      return var4;
   }

   public boolean method_26272(Identifier var1) {
      class_6561 var4 = this.field_29291.get(var1);
      if (var4 == null) {
         return false;
      } else {
         Path var5 = this.method_26273(var1, ".nbt");
         Path var6 = var5.getParent();
         if (var6 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists(var6) ? var6.toRealPath() : var6);
            } catch (IOException var22) {
               field_29290.error("Failed to create parent directory: {}", var6);
               return false;
            }

            CompoundNBT var7 = var4.method_29993(new CompoundNBT());

            try (FileOutputStream var8 = new FileOutputStream(var5.toFile())) {
               class_5957.method_27217(var7, var8);
               return true;
            } catch (Throwable var24) {
               return false;
            }
         }
      }
   }

   public Path method_26274(Identifier var1, String var2) {
      try {
         Path var5 = this.field_29289.resolve(var1.method_21461());
         Path var6 = var5.resolve("structures");
         return class_6494.method_29614(var6, var1.method_21456(), var2);
      } catch (InvalidPathException var7) {
         throw new class_7485("Invalid resource path: " + var1, var7);
      }
   }

   private Path method_26273(Identifier var1, String var2) {
      if (!var1.method_21456().contains("//")) {
         Path var5 = this.method_26274(var1, var2);
         if (var5.startsWith(this.field_29289) && class_6494.method_29616(var5) && class_6494.method_29613(var5)) {
            return var5;
         } else {
            throw new class_7485("Invalid resource path: " + var5);
         }
      } else {
         throw new class_7485("Invalid resource path: " + var1);
      }
   }

   public void method_26277(Identifier var1) {
      this.field_29291.remove(var1);
   }
}
