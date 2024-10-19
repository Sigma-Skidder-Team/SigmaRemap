package mapped;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;

public class Class1785 implements JSonShader {
   private static String[] field9623;
   private final String field9624;
   private final ResourceLocation field9625;
   private final InputStream field9626;
   private final InputStream field9627;
   private boolean field9628;
   private JsonObject field9629;

   public Class1785(String var1, ResourceLocation var2, InputStream var3, InputStream var4) {
      this.field9624 = var1;
      this.field9625 = var2;
      this.field9626 = var3;
      this.field9627 = var4;
   }

   @Override
   public ResourceLocation method7762() {
      return this.field9625;
   }

   @Override
   public InputStream getFile() {
      return this.field9626;
   }

   public boolean method7766() {
      return this.field9627 != null;
   }

   @Nullable
   @Override
   public <T> T method7764(IMetadataSectionSerializer<T> var1) {
      if (!this.method7766()) {
         return null;
      } else {
         if (this.field9629 == null && !this.field9628) {
            this.field9628 = true;
            BufferedReader var4 = null;

            try {
               var4 = new BufferedReader(new InputStreamReader(this.field9627, StandardCharsets.UTF_8));
               this.field9629 = JSONUtils.fromJson(var4);
            } finally {
               IOUtils.closeQuietly(var4);
            }
         }

         if (this.field9629 == null) {
            return null;
         } else {
            String var8 = var1.getSectionName();
            return (T)(this.field9629.has(var8) ? var1.deserialize(JSONUtils.method32782(this.field9629, var8)) : null);
         }
      }
   }

   @Override
   public String method7765() {
      return this.field9624;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class1785) {
            Class1785 var4 = (Class1785)var1;
            if (this.field9625 == null) {
               if (var4.field9625 != null) {
                  return false;
               }
            } else if (!this.field9625.equals(var4.field9625)) {
               return false;
            }

            if (this.field9624 == null) {
               if (var4.field9624 != null) {
                  return false;
               }
            } else if (!this.field9624.equals(var4.field9624)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field9624 == null ? 0 : this.field9624.hashCode();
      return 31 * var3 + (this.field9625 == null ? 0 : this.field9625.hashCode());
   }

   @Override
   public void close() throws IOException {
      this.field9626.close();
      if (this.field9627 != null) {
         this.field9627.close();
      }
   }
}
