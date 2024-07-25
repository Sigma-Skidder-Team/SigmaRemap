package remapped;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;

import java.util.function.BiConsumer;

public class BooleanValue extends RuleValue<BooleanValue> {
   private static String[] field_29724;
   private boolean field_29725;

   private static class_3275<BooleanValue> method_26683(boolean var0, BiConsumer<class_341, BooleanValue> var1) {
      return new class_3275<BooleanValue>(BoolArgumentType::bool, var1x -> new BooleanValue(var1x, var0), var1, class_2237::method_10290, null);
   }

   private static class_3275<BooleanValue> method_26682(boolean var0) {
      return method_26683(var0, (var0x, var1) -> {
      });
   }

   public BooleanValue(class_3275<BooleanValue> var1, boolean var2) {
      super(var1);
      this.field_29725 = var2;
   }

   private static net.minecraft.world.GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue)
   {
      return create(defaultValue, (server, value) ->
      {
      });
   }

   private static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue, BiConsumer<MinecraftServer, GameRules.BooleanValue> changeListener)
   {
      return new GameRules.RuleType<>(BoolArgumentType::bool, (type) ->
      {
         return new GameRules.BooleanValue(type, defaultValue);
      }, changeListener, GameRules.IRuleEntryVisitor::changeBoolean);
   }

   @Override
   public void method_42120(CommandContext<class_9155> var1, String var2) {
      this.field_29725 = BoolArgumentType.getBool(var1, var2);
   }

   public boolean method_26681() {
      return this.field_29725;
   }

   public void method_26684(boolean var1, class_341 var2) {
      this.field_29725 = var1;
      this.method_42125(var2);
   }

   @Override
   public String method_42124() {
      return Boolean.toString(this.field_29725);
   }

   @Override
   public void method_42118(String var1) {
      this.field_29725 = Boolean.parseBoolean(var1);
   }

   @Override
   public int method_42122() {
      return !this.field_29725 ? 0 : 1;
   }

   public BooleanValue method_26676() {
      return this;
   }

   public BooleanValue method_26678() {
      return new BooleanValue(this.field_46823, this.field_29725);
   }

   public void method_26680(BooleanValue var1, class_341 var2) {
      this.field_29725 = var1.field_29725;
      this.method_42125(var2);
   }
}
