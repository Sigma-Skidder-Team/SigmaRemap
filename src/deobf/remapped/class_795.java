package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class class_795 extends class_5837 {
   private final class_9397 field_4274;
   private final List<class_8995> field_4270;
   private static final Function<Entity, class_8406> field_4273 = class_6000::method_27394;
   private static final Function<class_3757, class_8406> field_4271 = var0 -> var0.method_17396(new class_5734());

   private class_795(class_7279[] var1, class_9397 var2, List<class_8995> var3) {
      super(var1);
      this.field_4274 = var2;
      this.field_4270 = ImmutableList.copyOf(var3);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26388;
   }

   private static class_9257 method_3527(String var0) {
      try {
         return new class_4235().parse(new StringReader(var0));
      } catch (CommandSyntaxException var4) {
         throw new IllegalArgumentException("Failed to parse path " + var0, var4);
      }
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(this.field_4274.field_48022);
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      class_8406 var5 = this.field_4274.field_48020.apply(var2);
      if (var5 != null) {
         this.field_4270.forEach(var2x -> var2x.method_41267(var1::method_27994, var5));
      }

      return var1;
   }

   public static class_3422 method_3533(class_9397 var0) {
      return new class_3422(var0, null);
   }
}
