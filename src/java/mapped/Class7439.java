package mapped;

import com.mojang.serialization.Codec;

public class Class7439 implements Class7436 {
   public static final Class6865<Class7439> field32010 = new Class6867();
   private final Class7434<Class7439> field32011;
   private final BlockState field32012;

   public static Codec<Class7439> method24025(Class7434<Class7439> var0) {
      return BlockState.field31585.xmap(var1 -> new Class7439(var0, var1), var0x -> var0x.field32012);
   }

   public Class7439(Class7434<Class7439> var1, BlockState var2) {
      this.field32011 = var1;
      this.field32012 = var2;
   }

   @Override
   public void method24009(PacketBuffer var1) {
      var1.writeVarInt(Block.field18610.method9171(this.field32012));
   }

   @Override
   public String method24010() {
      return Registry.field16077.getKey(this.method24011()) + " " + Class8268.toString(this.field32012);
   }

   @Override
   public Class7434<Class7439> method24011() {
      return this.field32011;
   }

   public BlockState method24026() {
      return this.field32012;
   }
}
