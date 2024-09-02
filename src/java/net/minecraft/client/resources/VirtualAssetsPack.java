package net.minecraft.client.resources;

import mapped.ResourcePackType;
import net.minecraft.resources.VanillaPack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.function.Predicate;

public class VirtualAssetsPack extends VanillaPack {
   private final ResourceIndex field1195;

   public VirtualAssetsPack(ResourceIndex var1) {
      super("minecraft", "realms");
      this.field1195 = var1;
   }

   @Nullable
   @Override
   public InputStream method1243(ResourcePackType var1, ResourceLocation var2) {
      if (var1 == ResourcePackType.CLIENT_RESOURCES) {
         File var5 = this.field1195.method27015(var2);
         if (var5 != null && var5.exists()) {
            try {
               return new FileInputStream(var5);
            } catch (FileNotFoundException var7) {
            }
         }
      }

      return super.method1243(var1, var2);
   }

   @Override
   public boolean method1225(ResourcePackType var1, ResourceLocation var2) {
      if (var1 == ResourcePackType.CLIENT_RESOURCES) {
         File var5 = this.field1195.method27015(var2);
         if (var5 != null && var5.exists()) {
            return true;
         }
      }

      return super.method1225(var1, var2);
   }

   @Nullable
   @Override
   public InputStream method1246(String var1) {
      File var4 = this.field1195.method27016(var1);
      if (var4 != null && var4.exists()) {
         try {
            return new FileInputStream(var4);
         } catch (FileNotFoundException var6) {
         }
      }

      return super.method1246(var1);
   }

   @Override
   public Collection<ResourceLocation> method1224(ResourcePackType var1, String var2, String var3, int var4, Predicate<String> var5) {
      Collection var8 = super.method1224(var1, var2, var3, var4, var5);
      var8.addAll(this.field1195.method27017(var3, var2, var4, var5));
      return var8;
   }
}
