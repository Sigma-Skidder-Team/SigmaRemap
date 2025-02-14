package net.minecraft.command.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

import mapped.Class283;
import mapped.ILootCondition;
import net.minecraft.advancements.Advancement;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class ResourceLocationArgument implements ArgumentType<ResourceLocation> {
   private static final Collection<String> field35693 = Arrays.<String>asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType field35694 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("advancement.advancementNotFound", var0)
   );
   private static final DynamicCommandExceptionType field35695 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("recipe.notFound", var0));
   private static final DynamicCommandExceptionType field35696 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("predicate.unknown", var0)
   );
   private static final DynamicCommandExceptionType field35697 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("attribute.unknown", var0)
   );

   public static ResourceLocationArgument method29031() {
      return new ResourceLocationArgument();
   }

   public static Advancement method29032(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      ResourceLocation var4 = (ResourceLocation)var0.getArgument(var1, ResourceLocation.class);
      Advancement var5 = ((CommandSource)var0.getSource()).getServer().method1396().method1065(var4);
      if (var5 != null) {
         return var5;
      } else {
         throw field35694.create(var4);
      }
   }

   public static IRecipe<?> method29033(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      RecipeManager var4 = ((CommandSource)var0.getSource()).getServer().method1407();
      ResourceLocation var5 = (ResourceLocation)var0.getArgument(var1, ResourceLocation.class);
      return (IRecipe<?>)var4.method1035(var5).orElseThrow(() -> field35695.create(var5));
   }

   public static ILootCondition method29034(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      ResourceLocation var4 = (ResourceLocation)var0.getArgument(var1, ResourceLocation.class);
      Class283 var5 = ((CommandSource)var0.getSource()).getServer().method1412();
      ILootCondition var6 = var5.method1052(var4);
      if (var6 != null) {
         return var6;
      } else {
         throw field35696.create(var4);
      }
   }

   public static Attribute method29035(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      ResourceLocation var4 = (ResourceLocation)var0.getArgument(var1, ResourceLocation.class);
      return Registry.ATTRIBUTE.method9187(var4).orElseThrow(() -> field35697.create(var4));
   }

   public static ResourceLocation getResourceLocation(CommandContext<CommandSource> var0, String var1) {
      return (ResourceLocation)var0.getArgument(var1, ResourceLocation.class);
   }

   public ResourceLocation parse(StringReader var1) throws CommandSyntaxException {
      return ResourceLocation.method8294(var1);
   }

   public Collection<String> getExamples() {
      return field35693;
   }
}
