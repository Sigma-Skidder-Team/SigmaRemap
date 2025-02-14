package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.network.play.server.SRecipeBookPacket;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6942 extends Class6941 {
   private static final Logger field30092 = LogManager.getLogger();

   public int method21376(Collection<IRecipe<?>> var1, ServerPlayerEntity var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      for (IRecipe var8 : var1) {
         ResourceLocation var9 = var8.getId();
         if (!this.field30089.contains(var9) && !var8.method14965()) {
            this.method21359(var9);
            this.method21367(var9);
            var5.add(var9);
            CriteriaTriggers.field44470.method15130(var2, var8);
            var6++;
         }
      }

      this.method21378(Class2338.field15983, var2, var5);
      return var6;
   }

   public int method21377(Collection<IRecipe<?>> var1, ServerPlayerEntity var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      for (IRecipe var8 : var1) {
         ResourceLocation var9 = var8.getId();
         if (this.field30089.contains(var9)) {
            this.method21363(var9);
            var5.add(var9);
            var6++;
         }
      }

      this.method21378(Class2338.field15984, var2, var5);
      return var6;
   }

   private void method21378(Class2338 var1, ServerPlayerEntity var2, List<ResourceLocation> var3) {
      var2.connection.sendPacket(new SRecipeBookPacket(var1, var3, Collections.<ResourceLocation>emptyList(), this.method21374()));
   }

   public CompoundNBT method21379() {
      CompoundNBT var3 = new CompoundNBT();
      this.method21374().method34693(var3);
      ListNBT var4 = new ListNBT();

      for (ResourceLocation var6 : this.field30089) {
         var4.add(StringNBT.valueOf(var6.toString()));
      }

      var3.put("recipes", var4);
      ListNBT var8 = new ListNBT();

      for (ResourceLocation var7 : this.field30090) {
         var8.add(StringNBT.valueOf(var7.toString()));
      }

      var3.put("toBeDisplayed", var8);
      return var3;
   }

   public void method21380(CompoundNBT var1, RecipeManager var2) {
      this.method21373(Class9223.method34692(var1));
      ListNBT var5 = var1.getList("recipes", 8);
      this.method21381(var5, this::method21358, var2);
      ListNBT var6 = var1.getList("toBeDisplayed", 8);
      this.method21381(var6, this::method21366, var2);
   }

   private void method21381(ListNBT var1, Consumer<IRecipe<?>> var2, RecipeManager var3) {
      for (int var6 = 0; var6 < var1.size(); var6++) {
         String var7 = var1.getString(var6);

         try {
            ResourceLocation var8 = new ResourceLocation(var7);
            Optional<? extends IRecipe<?>> var9 = var3.method1035(var8);
            if (!var9.isPresent()) {
               field30092.error("Tried to load unrecognized recipe: {} removed now.", var8);
            } else {
               var2.accept(var9.get());
            }
         } catch (Class2496 var10) {
            field30092.error("Tried to load improperly formatted recipe: {} removed now.", var7);
         }
      }
   }

   public void method21382(ServerPlayerEntity var1) {
      var1.connection.sendPacket(new SRecipeBookPacket(Class2338.field15982, this.field30089, this.field30090, this.method21374()));
   }
}
