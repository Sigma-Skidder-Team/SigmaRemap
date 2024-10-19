package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.network.play.client.CTabCompletePacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Class6617 implements ISuggestionProvider {
   private final ClientPlayNetHandler field29118;
   private final Minecraft field29119;
   private int field29120 = -1;
   private CompletableFuture<Suggestions> field29121;

   public Class6617(ClientPlayNetHandler var1, Minecraft var2) {
      this.field29118 = var1;
      this.field29119 = var2;
   }

   @Override
   public Collection<String> getPlayerNames() {
      ArrayList var3 = Lists.newArrayList();

      for (NetworkPlayerInfo var5 : this.field29118.method15790()) {
         var3.add(var5.method19966().getName());
      }

      return var3;
   }

   @Override
   public Collection<String> getTargetEntity() {
      return (Collection<String>)(this.field29119.objectMouseOver != null && this.field29119.objectMouseOver.getType() == RayTraceResult.Type.ENTITY
         ? Collections.<String>singleton(((EntityRayTraceResult)this.field29119.objectMouseOver).getEntity().method3376())
         : Collections.<String>emptyList());
   }

   @Override
   public Collection<String> getTeamNames() {
      return this.field29118.method15797().method6805().method20996();
   }

   @Override
   public Collection<ResourceLocation> getSoundResourceLocations() {
      return this.field29119.getSoundHandler().method998();
   }

   @Override
   public Stream<ResourceLocation> getRecipeResourceLocations() {
      return this.field29118.getRecipeManager().method1037();
   }

   @Override
   public boolean method20129(int var1) {
      ClientPlayerEntity var4 = this.field29119.player;
      return var4 == null ? var1 == 0 : var4.method3424(var1);
   }

   @Override
   public CompletableFuture<Suggestions> getSuggestionsFromServer(CommandContext<ISuggestionProvider> context, SuggestionsBuilder suggestionsBuilder) {
      if (this.field29121 != null) {
         this.field29121.cancel(false);
      }

      this.field29121 = new CompletableFuture<Suggestions>();
      int var5 = ++this.field29120;
      this.field29118.sendPacket(new CTabCompletePacket(var5, context.getInput()));
      return this.field29121;
   }

   private static String method20131(double var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String method20132(int var0) {
      return Integer.toString(var0);
   }

   @Override
   public Collection<Coordinates> defaultLocal() {
      RayTraceResult var3 = this.field29119.objectMouseOver;
      if (var3 != null && var3.getType() == RayTraceResult.Type.BLOCK) {
         BlockPos var4 = ((BlockRayTraceResult)var3).getPos();
         return Collections.<Coordinates>singleton(new Coordinates(method20132(var4.getX()), method20132(var4.getY()), method20132(var4.getZ())));
      } else {
         return ISuggestionProvider.super.defaultLocal();
      }
   }

   @Override
   public Collection<Coordinates> defaultGlobal() {
      RayTraceResult var3 = this.field29119.objectMouseOver;
      if (var3 != null && var3.getType() == RayTraceResult.Type.BLOCK) {
         Vector3d var4 = var3.getHitVec();
         return Collections.<Coordinates>singleton(new Coordinates(method20131(var4.x), method20131(var4.y), method20131(var4.z)));
      } else {
         return ISuggestionProvider.super.defaultGlobal();
      }
   }

   @Override
   public Set<RegistryKey<World>> method20135() {
      return this.field29118.method15801();
   }

   @Override
   public DynamicRegistries method20136() {
      return this.field29118.method15802();
   }

   public void method20137(int var1, Suggestions var2) {
      if (var1 == this.field29120) {
         this.field29121.complete(var2);
         this.field29121 = null;
         this.field29120 = -1;
      }
   }
}
