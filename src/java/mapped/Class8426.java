package mapped;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class8426 {
   private static String[] field36103;
   private final Map<ResourceLocation, Class3623> field36104 = Maps.newHashMap();

   @Nullable
   public Class3623 method29600(ResourceLocation var1) {
      return this.field36104.get(var1);
   }

   public Class3623 method29601(ResourceLocation var1, ITextComponent var2) {
      Class3623 var5 = new Class3623(var1, var2);
      this.field36104.put(var1, var5);
      return var5;
   }

   public void method29602(Class3623 var1) {
      this.field36104.remove(var1.method12262());
   }

   public Collection<ResourceLocation> method29603() {
      return this.field36104.keySet();
   }

   public Collection<Class3623> method29604() {
      return this.field36104.values();
   }

   public Class39 method29605() {
      Class39 var3 = new Class39();

      for (Class3623 var5 : this.field36104.values()) {
         var3.method99(var5.method12262().toString(), var5.method12273());
      }

      return var3;
   }

   public void method29606(Class39 var1) {
      for (String var5 : var1.method97()) {
         ResourceLocation var6 = new ResourceLocation(var5);
         this.field36104.put(var6, Class3623.method12274(var1.method130(var5), var6));
      }
   }

   public void method29607(ServerPlayerEntity var1) {
      for (Class3623 var5 : this.field36104.values()) {
         var5.method12275(var1);
      }
   }

   public void method29608(ServerPlayerEntity var1) {
      for (Class3623 var5 : this.field36104.values()) {
         var5.method12276(var1);
      }
   }
}
