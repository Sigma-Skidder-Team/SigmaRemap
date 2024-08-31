package mapped;

import com.google.gson.JsonObject;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public class Class6505<T extends Class4843<?>> implements Class6504<T> {
   private static String[] field28491;
   private final Function<ResourceLocation, T> field28492;

   public Class6505(Function<ResourceLocation, T> var1) {
      this.field28492 = var1;
   }

   @Override
   public T method19700(ResourceLocation var1, JsonObject var2) {
      return this.field28492.apply(var1);
   }

   @Override
   public T method19699(ResourceLocation var1, PacketBuffer var2) {
      return this.field28492.apply(var1);
   }

   @Override
   public void method19698(PacketBuffer var1, T var2) {
   }
}
