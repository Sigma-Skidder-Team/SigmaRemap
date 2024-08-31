package mapped;

import net.minecraft.util.ResourceLocation;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

public class Class1805 implements Closeable {
   private final Class9620 field9719;
   private final Class1806 field9720;
   private final IOException field9721;

   public Class1805(IOException var1) {
      this.field9721 = var1;
      this.field9719 = null;
      this.field9720 = null;
   }

   public Class1805(Class9620 var1, Class1806 var2) {
      this.field9721 = null;
      this.field9719 = var1;
      this.field9720 = var2;
   }

   public static Class1805 method7875(IResourceManager var0, ResourceLocation var1) {
      try (Class1783 var4 = var0.method580(var1)) {
         Class1806 var6 = Class1806.method7879(var4.method7763());
         Class9620 var7 = null;

         try {
            var7 = var4.<Class9620>method7764(Class9620.field44993);
         } catch (RuntimeException var19) {
            Class293.method1148().warn("Failed reading metadata of: {}", var1, var19);
         }

         return new Class1805(var7, var6);
      } catch (IOException var22) {
         return new Class1805(var22);
      }
   }

   @Nullable
   public Class9620 method7876() {
      return this.field9719;
   }

   public Class1806 method7877() throws IOException {
      if (this.field9721 == null) {
         return this.field9720;
      } else {
         throw this.field9721;
      }
   }

   @Override
   public void close() {
      if (this.field9720 != null) {
         this.field9720.close();
      }
   }

   public void method7878() throws IOException {
      if (this.field9721 != null) {
         throw this.field9721;
      }
   }
}
