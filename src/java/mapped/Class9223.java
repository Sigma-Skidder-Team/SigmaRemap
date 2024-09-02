package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.util.Util;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;

import java.util.EnumMap;
import java.util.Map;

public final class Class9223 {
   private static final Map<Class1939, Pair<String, String>> field42458 = ImmutableMap.of(
      Class1939.field12599,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      Class1939.field12600,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      Class1939.field12601,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      Class1939.field12602,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<Class1939, Class9248> field42459;

   private Class9223(Map<Class1939, Class9248> var1) {
      this.field42459 = var1;
   }

   public Class9223() {
      this(Util.<Map<Class1939, Class9248>>make(Maps.newEnumMap(Class1939.class), var0 -> {
         for (Class1939 var6 : Class1939.values()) {
            var0.put(var6, new Class9248(false, false));
         }
      }));
   }

   public boolean method34686(Class1939 var1) {
      return Class9248.method34789(this.field42459.get(var1));
   }

   public void method34687(Class1939 var1, boolean var2) {
      Class9248.method34790(this.field42459.get(var1), var2);
   }

   public boolean method34688(Class1939 var1) {
      return Class9248.method34791(this.field42459.get(var1));
   }

   public void method34689(Class1939 var1, boolean var2) {
      Class9248.method34792(this.field42459.get(var1), var2);
   }

   public static Class9223 method34690(PacketBuffer var0) {
      EnumMap var3 = Maps.newEnumMap(Class1939.class);

      for (Class1939 var7 : Class1939.values()) {
         boolean var8 = var0.readBoolean();
         boolean var9 = var0.readBoolean();
         var3.put(var7, new Class9248(var8, var9));
      }

      return new Class9223(var3);
   }

   public void method34691(PacketBuffer var1) {
      for (Class1939 var7 : Class1939.values()) {
         Class9248 var8 = this.field42459.get(var7);
         if (var8 != null) {
            var1.writeBoolean(Class9248.method34789(var8));
            var1.writeBoolean(Class9248.method34791(var8));
         } else {
            var1.writeBoolean(false);
            var1.writeBoolean(false);
         }
      }
   }

   public static Class9223 method34692(CompoundNBT var0) {
      EnumMap var3 = Maps.newEnumMap(Class1939.class);
      field42458.forEach((var2, var3x) -> {
         boolean var6 = var0.getBoolean((String)var3x.getFirst());
         boolean var7 = var0.getBoolean((String)var3x.getSecond());
         var3.put(var2, new Class9248(var6, var7));
      });
      return new Class9223(var3);
   }

   public void method34693(CompoundNBT var1) {
      field42458.forEach((var2, var3) -> {
         Class9248 var6 = this.field42459.get(var2);
         var1.putBoolean((String)var3.getFirst(), Class9248.method34789(var6));
         var1.putBoolean((String)var3.getSecond(), Class9248.method34791(var6));
      });
   }

   public Class9223 method34694() {
      EnumMap var3 = Maps.newEnumMap(Class1939.class);

      for (Class1939 var7 : Class1939.values()) {
         Class9248 var8 = this.field42459.get(var7);
         var3.put(var7, var8.method34788());
      }

      return new Class9223(var3);
   }

   public void method34695(Class9223 var1) {
      this.field42459.clear();

      for (Class1939 var7 : Class1939.values()) {
         Class9248 var8 = var1.field42459.get(var7);
         this.field42459.put(var7, var8.method34788());
      }
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof Class9223 && this.field42459.equals(((Class9223)var1).field42459);
   }

   @Override
   public int hashCode() {
      return this.field42459.hashCode();
   }
}
