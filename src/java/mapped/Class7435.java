package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.network.PacketBuffer;

public class Class7435 extends Class7434<Class7435> implements Class7436 {
   private static String[] field31997;
   private static final Class6865<Class7435> field31998 = new Class6868();
   private final Codec<Class7435> field31999 = Codec.unit(this::method24011);

   public Class7435(boolean var1) {
      super(var1, field31998);
   }

   public Class7435 method24011() {
      return this;
   }

   @Override
   public Codec<Class7435> method24005() {
      return this.field31999;
   }

   @Override
   public void method24009(PacketBuffer var1) {
   }

   @Override
   public String method24010() {
      return Registry.field16077.getKey(this).toString();
   }
}
