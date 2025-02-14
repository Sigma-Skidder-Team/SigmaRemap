package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.registry.Registry;

public class Class7921 {
   private static final int[] field33912 = new int[]{0, 10, 70, 150, 250};
   public static final Codec<Class7921> field33913 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Registry.field16089.fieldOf("type").orElseGet(() -> VillagerType.field44542).forGetter(var0x -> var0x.field33914),
               Registry.VILLAGER_PROFESSION.fieldOf("profession").orElseGet(() -> VillagerProfession.field36011).forGetter(var0x -> var0x.field33915),
               Codec.INT.fieldOf("level").orElse(1).forGetter(var0x -> var0x.field33916)
            )
            .apply(var0, Class7921::new)
   );
   private final VillagerType field33914;
   private final VillagerProfession field33915;
   private final int field33916;

   public Class7921(VillagerType var1, VillagerProfession var2, int var3) {
      this.field33914 = var1;
      this.field33915 = var2;
      this.field33916 = Math.max(1, var3);
   }

   public VillagerType method26570() {
      return this.field33914;
   }

   public VillagerProfession method26571() {
      return this.field33915;
   }

   public int method26572() {
      return this.field33916;
   }

   public Class7921 method26573(VillagerType var1) {
      return new Class7921(var1, this.field33915, this.field33916);
   }

   public Class7921 method26574(VillagerProfession var1) {
      return new Class7921(this.field33914, var1, this.field33916);
   }

   public Class7921 method26575(int var1) {
      return new Class7921(this.field33914, this.field33915, var1);
   }

   public static int method26576(int var0) {
      return !method26578(var0) ? 0 : field33912[var0 - 1];
   }

   public static int method26577(int var0) {
      return !method26578(var0) ? 0 : field33912[var0];
   }

   public static boolean method26578(int var0) {
      return var0 >= 1 && var0 < 5;
   }
}
