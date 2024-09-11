package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class6619 implements Class6618 {
   public static final SimpleCommandExceptionType field29122 = new SimpleCommandExceptionType(new TranslationTextComponent("permissions.requires.player"));
   public static final SimpleCommandExceptionType field29123 = new SimpleCommandExceptionType(new TranslationTextComponent("permissions.requires.entity"));
   private final ICommandSource field29124;
   private final Vector3d field29125;
   private final ServerWorld field29126;
   private final int field29127;
   private final String field29128;
   private final ITextComponent field29129;
   private final MinecraftServer field29130;
   private final boolean field29131;
   private final Entity field29132;
   private final ResultConsumer<Class6619> field29133;
   private final Class2062 field29134;
   private final Vector2f field29135;

   public Class6619(ICommandSource var1, Vector3d var2, Vector2f var3, ServerWorld var4, int var5, String var6, ITextComponent var7, MinecraftServer var8, Entity var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, false, (var0, var1x, var2x) -> {
      }, Class2062.field13441);
   }

   public Class6619(
      ICommandSource var1,
      Vector3d var2,
      Vector2f var3,
      ServerWorld var4,
      int var5,
      String var6,
      ITextComponent var7,
      MinecraftServer var8,
      Entity var9,
      boolean var10,
      ResultConsumer<Class6619> var11,
      Class2062 var12
   ) {
      this.field29124 = var1;
      this.field29125 = var2;
      this.field29126 = var4;
      this.field29131 = var10;
      this.field29132 = var9;
      this.field29127 = var5;
      this.field29128 = var6;
      this.field29129 = var7;
      this.field29130 = var8;
      this.field29133 = var11;
      this.field29134 = var12;
      this.field29135 = var3;
   }

   public Class6619 method20157(Entity var1) {
      return this.field29132 != var1
         ? new Class6619(
            this.field29124,
            this.field29125,
            this.field29135,
            this.field29126,
            this.field29127,
            var1.getName().getString(),
            var1.getDisplayName(),
            this.field29130,
            var1,
            this.field29131,
            this.field29133,
            this.field29134
         )
         : this;
   }

   public Class6619 method20158(Vector3d var1) {
      return !this.field29125.equals(var1)
         ? new Class6619(
            this.field29124,
            var1,
            this.field29135,
            this.field29126,
            this.field29127,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            this.field29133,
            this.field29134
         )
         : this;
   }

   public Class6619 method20159(Vector2f var1) {
      return !this.field29135.equals(var1)
         ? new Class6619(
            this.field29124,
            this.field29125,
            var1,
            this.field29126,
            this.field29127,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            this.field29133,
            this.field29134
         )
         : this;
   }

   public Class6619 method20160(ResultConsumer<Class6619> var1) {
      return !this.field29133.equals(var1)
         ? new Class6619(
            this.field29124,
            this.field29125,
            this.field29135,
            this.field29126,
            this.field29127,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            var1,
            this.field29134
         )
         : this;
   }

   public Class6619 method20161(ResultConsumer<Class6619> var1, BinaryOperator<ResultConsumer<Class6619>> var2) {
      ResultConsumer var5 = var2.apply(this.field29133, var1);
      return this.method20160(var5);
   }

   public Class6619 method20162() {
      return !this.field29131
         ? new Class6619(
            this.field29124,
            this.field29125,
            this.field29135,
            this.field29126,
            this.field29127,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            true,
            this.field29133,
            this.field29134
         )
         : this;
   }

   public Class6619 method20163(int var1) {
      return var1 != this.field29127
         ? new Class6619(
            this.field29124,
            this.field29125,
            this.field29135,
            this.field29126,
            var1,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            this.field29133,
            this.field29134
         )
         : this;
   }

   public Class6619 method20164(int var1) {
      return var1 > this.field29127
         ? new Class6619(
            this.field29124,
            this.field29125,
            this.field29135,
            this.field29126,
            var1,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            this.field29133,
            this.field29134
         )
         : this;
   }

   public Class6619 method20165(Class2062 var1) {
      return var1 != this.field29134
         ? new Class6619(
            this.field29124,
            this.field29125,
            this.field29135,
            this.field29126,
            this.field29127,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            this.field29133,
            var1
         )
         : this;
   }

   public Class6619 method20166(ServerWorld var1) {
      if (var1 != this.field29126) {
         double var4 = DimensionType.getCoordinateDifference(this.field29126.method6812(), var1.method6812());
         Vector3d var6 = new Vector3d(this.field29125.x * var4, this.field29125.y, this.field29125.z * var4);
         return new Class6619(
            this.field29124,
            var6,
            this.field29135,
            var1,
            this.field29127,
            this.field29128,
            this.field29129,
            this.field29130,
            this.field29132,
            this.field29131,
            this.field29133,
            this.field29134
         );
      } else {
         return this;
      }
   }

   public Class6619 method20167(Entity var1, Class2062 var2) throws CommandSyntaxException {
      return this.method20168(var2.method8711(var1));
   }

   public Class6619 method20168(Vector3d var1) throws CommandSyntaxException {
      Vector3d var4 = this.field29134.method8712(this);
      double var5 = var1.x - var4.x;
      double var7 = var1.y - var4.y;
      double var9 = var1.z - var4.z;
      double var11 = (double) MathHelper.sqrt(var5 * var5 + var9 * var9);
      float var13 = MathHelper.method37792((float)(-(MathHelper.method37814(var7, var11) * 180.0F / (float)Math.PI)));
      float var14 = MathHelper.method37792((float)(MathHelper.method37814(var9, var5) * 180.0F / (float)Math.PI) - 90.0F);
      return this.method20159(new Vector2f(var13, var14));
   }

   public ITextComponent method20169() {
      return this.field29129;
   }

   public String method20170() {
      return this.field29128;
   }

   @Override
   public boolean method20129(int var1) {
      return this.field29127 >= var1;
   }

   public Vector3d method20171() {
      return this.field29125;
   }

   public ServerWorld method20172() {
      return this.field29126;
   }

   @Nullable
   public Entity method20173() {
      return this.field29132;
   }

   public Entity method20174() throws CommandSyntaxException {
      if (this.field29132 != null) {
         return this.field29132;
      } else {
         throw field29123.create();
      }
   }

   public ServerPlayerEntity method20175() throws CommandSyntaxException {
      if (this.field29132 instanceof ServerPlayerEntity) {
         return (ServerPlayerEntity)this.field29132;
      } else {
         throw field29122.create();
      }
   }

   public Vector2f method20176() {
      return this.field29135;
   }

   public MinecraftServer method20177() {
      return this.field29130;
   }

   public Class2062 method20178() {
      return this.field29134;
   }

   public void method20179(ITextComponent var1, boolean var2) {
      if (this.field29124.method1405() && !this.field29131) {
         this.field29124.sendMessage(var1, Util.DUMMY_UUID);
      }

      if (var2 && this.field29124.method3425() && !this.field29131) {
         this.method20180(var1);
      }
   }

   private void method20180(ITextComponent var1) {
      IFormattableTextComponent var4 = new TranslationTextComponent("chat.type.admin", this.method20169(), var1)
         .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC});
      if (this.field29130.method1413().getBoolean(Class5462.field24236)) {
         for (ServerPlayerEntity var6 : this.field29130.getPlayerList().method19488()) {
            if (var6 != this.field29124 && this.field29130.getPlayerList().canSendCommands(var6.getGameProfile())) {
               var6.sendMessage(var4, Util.DUMMY_UUID);
            }
         }
      }

      if (this.field29124 != this.field29130 && this.field29130.method1413().getBoolean(Class5462.field24233)) {
         this.field29130.sendMessage(var4, Util.DUMMY_UUID);
      }
   }

   public void method20181(ITextComponent var1) {
      if (this.field29124.method1406() && !this.field29131) {
         this.field29124.sendMessage(new StringTextComponent("").append(var1).mergeStyle(TextFormatting.RED), Util.DUMMY_UUID);
      }
   }

   public void method20182(CommandContext<Class6619> var1, boolean var2, int var3) {
      if (this.field29133 != null) {
         this.field29133.onCommandComplete(var1, var2, var3);
      }
   }

   @Override
   public Collection<String> method20124() {
      return Lists.newArrayList(this.field29130.method1324());
   }

   @Override
   public Collection<String> method20126() {
      return this.field29130.method1409().method20996();
   }

   @Override
   public Collection<ResourceLocation> method20127() {
      return Registry.field16069.method9190();
   }

   @Override
   public Stream<ResourceLocation> method20128() {
      return this.field29130.method1407().method1037();
   }

   @Override
   public CompletableFuture<Suggestions> method20130(CommandContext<Class6618> var1, SuggestionsBuilder var2) {
      return null;
   }

   @Override
   public Set<RegistryKey<World>> method20135() {
      return this.field29130.method1319();
   }

   @Override
   public DynamicRegistries method20136() {
      return this.field29130.method1437();
   }
}
