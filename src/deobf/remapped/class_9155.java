package remapped;

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
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9155 implements class_8773 {
   public static final SimpleCommandExceptionType field_46861 = new SimpleCommandExceptionType(new TranslationTextComponent("permissions.requires.player"));
   public static final SimpleCommandExceptionType field_46857 = new SimpleCommandExceptionType(new TranslationTextComponent("permissions.requires.entity"));
   private final class_5801 field_46849;
   private final class_1343 field_46860;
   private final class_6331 field_46847;
   private final int field_46851;
   private final String field_46854;
   private final ITextComponent field_46853;
   private final class_341 field_46856;
   private final boolean field_46859;
   private final Entity field_46848;
   private final ResultConsumer<class_9155> field_46852;
   private final class_6139 field_46850;
   private final class_4895 field_46858;

   public class_9155(
      class_5801 var1, class_1343 var2, class_4895 var3, class_6331 var4, int var5, String var6, ITextComponent var7, class_341 var8, Entity var9
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, false, (var0, var1x, var2x) -> {
      }, class_6139.field_31493);
   }

   public class_9155(
      class_5801 var1,
      class_1343 var2,
      class_4895 var3,
      class_6331 var4,
      int var5,
      String var6,
      ITextComponent var7,
      class_341 var8,
      Entity var9,
      boolean var10,
      ResultConsumer<class_9155> var11,
      class_6139 var12
   ) {
      this.field_46849 = var1;
      this.field_46860 = var2;
      this.field_46847 = var4;
      this.field_46859 = var10;
      this.field_46848 = var9;
      this.field_46851 = var5;
      this.field_46854 = var6;
      this.field_46853 = var7;
      this.field_46856 = var8;
      this.field_46852 = var11;
      this.field_46850 = var12;
      this.field_46858 = var3;
   }

   public class_9155 method_42193(Entity var1) {
      return this.field_46848 != var1
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            this.field_46858,
            this.field_46847,
            this.field_46851,
            var1.method_45509().getString(),
            var1.method_19839(),
            this.field_46856,
            var1,
            this.field_46859,
            this.field_46852,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42180(class_1343 var1) {
      return !this.field_46860.equals(var1)
         ? new class_9155(
            this.field_46849,
            var1,
            this.field_46858,
            this.field_46847,
            this.field_46851,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            this.field_46852,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42183(class_4895 var1) {
      return !this.field_46858.equals(var1)
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            var1,
            this.field_46847,
            this.field_46851,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            this.field_46852,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42186(ResultConsumer<class_9155> var1) {
      return !this.field_46852.equals(var1)
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            this.field_46858,
            this.field_46847,
            this.field_46851,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            var1,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42187(ResultConsumer<class_9155> var1, BinaryOperator<ResultConsumer<class_9155>> var2) {
      ResultConsumer var5 = var2.apply(this.field_46852, var1);
      return this.method_42186(var5);
   }

   public class_9155 method_42185() {
      return !this.field_46859
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            this.field_46858,
            this.field_46847,
            this.field_46851,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            true,
            this.field_46852,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42194(int var1) {
      return var1 != this.field_46851
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            this.field_46858,
            this.field_46847,
            var1,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            this.field_46852,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42191(int var1) {
      return var1 > this.field_46851
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            this.field_46858,
            this.field_46847,
            var1,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            this.field_46852,
            this.field_46850
         )
         : this;
   }

   public class_9155 method_42197(class_6139 var1) {
      return var1 != this.field_46850
         ? new class_9155(
            this.field_46849,
            this.field_46860,
            this.field_46858,
            this.field_46847,
            this.field_46851,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            this.field_46852,
            var1
         )
         : this;
   }

   public class_9155 method_42195(class_6331 var1) {
      if (var1 != this.field_46847) {
         double var4 = class_8760.method_40232(this.field_46847.method_22572(), var1.method_22572());
         class_1343 var6 = new class_1343(this.field_46860.field_7336 * var4, this.field_46860.field_7333, this.field_46860.field_7334 * var4);
         return new class_9155(
            this.field_46849,
            var6,
            this.field_46858,
            var1,
            this.field_46851,
            this.field_46854,
            this.field_46853,
            this.field_46856,
            this.field_46848,
            this.field_46859,
            this.field_46852,
            this.field_46850
         );
      } else {
         return this;
      }
   }

   public class_9155 method_42184(Entity var1, class_6139 var2) throws CommandSyntaxException {
      return this.method_42182(var2.method_28187(var1));
   }

   public class_9155 method_42182(class_1343 var1) throws CommandSyntaxException {
      class_1343 var4 = this.field_46850.method_28188(this);
      double var5 = var1.field_7336 - var4.field_7336;
      double var7 = var1.field_7333 - var4.field_7333;
      double var9 = var1.field_7334 - var4.field_7334;
      double var11 = (double) MathHelper.sqrt(var5 * var5 + var9 * var9);
      float var13 = MathHelper.wrapDegrees((float)(-(MathHelper.method_42821(var7, var11) * 180.0F / (float)Math.PI)));
      float var14 = MathHelper.wrapDegrees((float)(MathHelper.method_42821(var9, var5) * 180.0F / (float)Math.PI) - 90.0F);
      return this.method_42183(new class_4895(var13, var14));
   }

   public ITextComponent method_42189() {
      return this.field_46853;
   }

   public String method_42176() {
      return this.field_46854;
   }

   @Override
   public boolean method_40314(int var1) {
      return this.field_46851 >= var1;
   }

   public class_1343 method_42192() {
      return this.field_46860;
   }

   public class_6331 method_42198() {
      return this.field_46847;
   }

   @Nullable
   public Entity method_42200() {
      return this.field_46848;
   }

   public Entity method_42178() throws CommandSyntaxException {
      if (this.field_46848 != null) {
         return this.field_46848;
      } else {
         throw field_46857.create();
      }
   }

   public class_9359 method_42179() throws CommandSyntaxException {
      if (this.field_46848 instanceof class_9359) {
         return (class_9359)this.field_46848;
      } else {
         throw field_46861.create();
      }
   }

   public class_4895 method_42174() {
      return this.field_46858;
   }

   public class_341 method_42177() {
      return this.field_46856;
   }

   public class_6139 method_42181() {
      return this.field_46850;
   }

   public void method_42196(ITextComponent var1, boolean var2) {
      if (this.field_46849.method_26287() && !this.field_46859) {
         this.field_46849.method_26286(var1, Util.NIL_UUID);
      }

      if (var2 && this.field_46849.method_26284() && !this.field_46859) {
         this.method_42190(var1);
      }
   }

   private void method_42190(ITextComponent var1) {
      IFormattableTextComponent var4 = new TranslationTextComponent("chat.type.admin", this.method_42189(), var1)
         .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC});
      if (this.field_46856.method_1683().getBoolean(GameRules.field_1057)) {
         for (class_9359 var6 : this.field_46856.method_1600().method_39951()) {
            if (var6 != this.field_46849 && this.field_46856.method_1600().method_39962(var6.method_3247())) {
               var6.method_26286(var4, Util.NIL_UUID);
            }
         }
      }

      if (this.field_46849 != this.field_46856 && this.field_46856.method_1683().getBoolean(GameRules.field_1056)) {
         this.field_46856.method_26286(var4, Util.NIL_UUID);
      }
   }

   public void method_42175(ITextComponent var1) {
      if (this.field_46849.method_26285() && !this.field_46859) {
         this.field_46849.method_26286(new StringTextComponent("").append(var1).mergeStyle(TextFormatting.RED), Util.NIL_UUID);
      }
   }

   public void method_42188(CommandContext<class_9155> var1, boolean var2, int var3) {
      if (this.field_46852 != null) {
         this.field_46852.onCommandComplete(var1, var2, var3);
      }
   }

   @Override
   public Collection<String> method_40307() {
      return Lists.newArrayList(this.field_46856.method_1713());
   }

   @Override
   public Collection<String> method_40330() {
      return this.field_46856.method_1655().method_4854();
   }

   @Override
   public Collection<Identifier> method_40309() {
      return class_8669.field_44369.method_39805();
   }

   @Override
   public Stream<Identifier> method_40326() {
      return this.field_46856.method_1705().method_23145();
   }

   @Override
   public CompletableFuture<Suggestions> method_40316(CommandContext<class_8773> var1, SuggestionsBuilder var2) {
      return null;
   }

   @Override
   public Set<class_5621<World>> method_40317() {
      return this.field_46856.method_1659();
   }

   @Override
   public class_6322 method_40327() {
      return this.field_46856.method_1735();
   }
}
