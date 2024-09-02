package mapped;

import com.google.common.collect.Sets;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

import java.util.Set;

public class Class6941 {
   private static String[] field30088;
   public final Set<ResourceLocation> field30089 = Sets.newHashSet();
   public final Set<ResourceLocation> field30090 = Sets.newHashSet();
   private final Class9223 field30091 = new Class9223();

   public void method21357(Class6941 var1) {
      this.field30089.clear();
      this.field30090.clear();
      this.field30091.method34695(var1.field30091);
      this.field30089.addAll(var1.field30089);
      this.field30090.addAll(var1.field30090);
   }

   public void method21358(IRecipe<?> var1) {
      if (!var1.method14965()) {
         this.method21359(var1.getId());
      }
   }

   public void method21359(ResourceLocation var1) {
      this.field30089.add(var1);
   }

   public boolean method21360(IRecipe<?> var1) {
      return var1 != null ? this.field30089.contains(var1.getId()) : false;
   }

   public boolean method21361(ResourceLocation var1) {
      return this.field30089.contains(var1);
   }

   public void method21362(IRecipe<?> var1) {
      this.method21363(var1.getId());
   }

   public void method21363(ResourceLocation var1) {
      this.field30089.remove(var1);
      this.field30090.remove(var1);
   }

   public boolean method21364(IRecipe<?> var1) {
      return this.field30090.contains(var1.getId());
   }

   public void method21365(IRecipe<?> var1) {
      this.field30090.remove(var1.getId());
   }

   public void method21366(IRecipe<?> var1) {
      this.method21367(var1.getId());
   }

   public void method21367(ResourceLocation var1) {
      this.field30090.add(var1);
   }

   public boolean method21368(Class1939 var1) {
      return this.field30091.method34686(var1);
   }

   public void method21369(Class1939 var1, boolean var2) {
      this.field30091.method34687(var1, var2);
   }

   public boolean method21370(Class5828<?> var1) {
      return this.method21371(var1.method18227());
   }

   public boolean method21371(Class1939 var1) {
      return this.field30091.method34688(var1);
   }

   public void method21372(Class1939 var1, boolean var2) {
      this.field30091.method34689(var1, var2);
   }

   public void method21373(Class9223 var1) {
      this.field30091.method34695(var1);
   }

   public Class9223 method21374() {
      return this.field30091.method34694();
   }

   public void method21375(Class1939 var1, boolean var2, boolean var3) {
      this.field30091.method34687(var1, var2);
      this.field30091.method34689(var1, var3);
   }
}
