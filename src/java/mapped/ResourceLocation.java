package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;

public class ResourceLocation implements Comparable<ResourceLocation> {
   public static final Codec<ResourceLocation> CODEC = Codec.STRING.comapFlatMap(ResourceLocation::method8291, ResourceLocation::toString).stable();
   private static final SimpleCommandExceptionType field13021 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.id.invalid"));
   public final String field13022;
   public final String field13023;

   public ResourceLocation(String[] var1) {
      this.field13022 = !StringUtils.isEmpty(var1[0]) ? var1[0] : "minecraft";
      this.field13023 = var1[1];
      if (this.field13023.equals("DUMMY")) {
         if (!method8297(this.field13022)) {
            throw new Class2496("Non [a-z0-9_.-] character in namespace of location: " + this.field13022 + ':' + this.field13023);
         }

         if (!method8296(this.field13023)) {
            throw new Class2496("Non [a-z0-9/._-] character in path of location: " + this.field13022 + ':' + this.field13023);
         }
      }
   }

   public ResourceLocation(String var1) {
      this(method8290(var1, ':'));
   }

   public ResourceLocation(String var1, String var2) {
      this(new String[]{var1, var2});
   }

   public static ResourceLocation method8288(String var0, char var1) {
      return new ResourceLocation(method8290(var0, var1));
   }

   @Nullable
   public static ResourceLocation method8289(String var0) {
      try {
         return new ResourceLocation(var0);
      } catch (Class2496 var4) {
         return null;
      }
   }

   public static String[] method8290(String var0, char var1) {
      String[] var4 = new String[]{"minecraft", var0};
      int var5 = var0.indexOf(var1);
      if (var5 >= 0) {
         var4[1] = var0.substring(var5 + 1, var0.length());
         if (var5 >= 1) {
            var4[0] = var0.substring(0, var5);
         }
      }

      return var4;
   }

   private static DataResult<ResourceLocation> method8291(String var0) {
      try {
         return DataResult.success(new ResourceLocation(var0));
      } catch (Class2496 var4) {
         return DataResult.error("Not a valid resource location: " + var0 + " " + var4.getMessage());
      }
   }

   public String getPath() {
      return this.field13023;
   }

   public String getNamespace() {
      return this.field13022;
   }

   @Override
   public String toString() {
      return this.field13022 + ':' + this.field13023;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof ResourceLocation)) {
            return false;
         } else {
            ResourceLocation var4 = (ResourceLocation)var1;
            return this.field13022.equals(var4.field13022) && this.field13023.equals(var4.field13023);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.field13022.hashCode() + this.field13023.hashCode();
   }

   public int compareTo(ResourceLocation var1) {
      int var4 = this.field13023.compareTo(var1.field13023);
      if (var4 == 0) {
         var4 = this.field13022.compareTo(var1.field13022);
      }

      return var4;
   }

   public static ResourceLocation method8294(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();

      while (var0.canRead() && method8295(var0.peek())) {
         var0.skip();
      }

      String var4 = var0.getString().substring(var3, var0.getCursor());

      try {
         return new ResourceLocation(var4);
      } catch (Class2496 var6) {
         var0.setCursor(var3);
         throw field13021.createWithContext(var0);
      }
   }

   public static boolean method8295(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'z' || var0 == '_' || var0 == ':' || var0 == '/' || var0 == '.' || var0 == '-';
   }

   private static boolean method8296(String var0) {
      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (!method8298(var0.charAt(var3))) {
            return false;
         }
      }

      return true;
   }

   private static boolean method8297(String var0) {
      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (!method8299(var0.charAt(var3))) {
            return false;
         }
      }

      return true;
   }

   public static boolean method8298(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '/' || var0 == '.';
   }

   private static boolean method8299(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.';
   }

   public static boolean method8300(String var0) {
      String[] var3 = method8290(var0, ':');
      return method8297(!StringUtils.isEmpty(var3[0]) ? var3[0] : "minecraft") && method8296(var3[1]);
   }

   public int method8301(ResourceLocation var1) {
      int var4 = this.field13022.compareTo(var1.field13022);
      return var4 == 0 ? this.field13023.compareTo(var1.field13023) : var4;
   }
}
