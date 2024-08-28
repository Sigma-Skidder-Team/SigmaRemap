package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Class6617 implements Class6618 {
   private final ClientPlayNetHandler field29118;
   private final Minecraft field29119;
   private int field29120 = -1;
   private CompletableFuture<Suggestions> field29121;

   public Class6617(ClientPlayNetHandler var1, Minecraft var2) {
      this.field29118 = var1;
      this.field29119 = var2;
   }

   @Override
   public Collection<String> method20124() {
      ArrayList var3 = Lists.newArrayList();

      for (Class6589 var5 : this.field29118.method15790()) {
         var3.add(var5.method19966().getName());
      }

      return var3;
   }

   @Override
   public Collection<String> method20125() {
      return (Collection<String>)(this.field29119.field1346 != null && this.field29119.field1346.method31417() == Class2100.field13691
         ? Collections.<String>singleton(((Class8709)this.field29119.field1346).method31416().method3376())
         : Collections.<String>emptyList());
   }

   @Override
   public Collection<String> method20126() {
      return this.field29118.method15797().method6805().method20996();
   }

   @Override
   public Collection<ResourceLocation> method20127() {
      return this.field29119.method1546().method998();
   }

   @Override
   public Stream<ResourceLocation> method20128() {
      return this.field29118.method15783().method1037();
   }

   @Override
   public boolean method20129(int var1) {
      ClientPlayerEntity var4 = this.field29119.field1339;
      return var4 == null ? var1 == 0 : var4.method3424(var1);
   }

   @Override
   public CompletableFuture<Suggestions> method20130(CommandContext<Class6618> var1, SuggestionsBuilder var2) {
      if (this.field29121 != null) {
         this.field29121.cancel(false);
      }

      this.field29121 = new CompletableFuture<Suggestions>();
      int var5 = ++this.field29120;
      this.field29118.sendPacket(new Class5562(var5, var1.getInput()));
      return this.field29121;
   }

   private static String method20131(double var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String method20132(int var0) {
      return Integer.toString(var0);
   }

   @Override
   public Collection<Class9203> method20133() {
      Class8710 var3 = this.field29119.field1346;
      if (var3 != null && var3.method31417() == Class2100.field13690) {
         BlockPos var4 = ((Class8711)var3).method31423();
         return Collections.<Class9203>singleton(new Class9203(method20132(var4.method8304()), method20132(var4.getY()), method20132(var4.method8306())));
      } else {
         return Class6618.super.method20133();
      }
   }

   @Override
   public Collection<Class9203> method20134() {
      Class8710 var3 = this.field29119.field1346;
      if (var3 != null && var3.method31417() == Class2100.field13690) {
         Vector3d var4 = var3.method31419();
         return Collections.<Class9203>singleton(new Class9203(method20131(var4.field18048), method20131(var4.field18049), method20131(var4.field18050)));
      } else {
         return Class6618.super.method20134();
      }
   }

   @Override
   public Set<Class8705<Class1655>> method20135() {
      return this.field29118.method15801();
   }

   @Override
   public Class8904 method20136() {
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
