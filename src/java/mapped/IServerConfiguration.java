package mapped;

import com.mojang.serialization.Lifecycle;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.datafix.codec.DatapackCodec;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameType;

import java.util.Set;
import javax.annotation.Nullable;

public interface IServerConfiguration {
   DatapackCodec method20091();

   void setDatapackCodec(DatapackCodec var1);

   boolean method20096();

   Set<String> method20097();

   void method20095(String var1, boolean var2);

   default void method20049(CrashReportCategory var1) {
      var1.addDetail("Known server brands", () -> String.join(", ", this.method20097()));
      var1.addDetail("Level was modded", () -> Boolean.toString(this.method20096()));
      var1.addDetail("Level storage version", () -> {
         int var3 = this.method20084();
         return String.format("0x%05X - %s", var3, this.method20104(var3));
      });
   }

   default String method20104(int var1) {
      switch (var1) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   @Nullable
   CompoundNBT method20093();

   void method20094(CompoundNBT var1);

   Class6608 method20098();

   WorldSettings method20099();

   CompoundNBT method20080(DynamicRegistries var1, CompoundNBT var2);

   boolean method20045();

   int method20084();

   String method20054();

   GameType method20067();

   void method20073(GameType var1);

   boolean method20072();

   Difficulty method20047();

   void method20085(Difficulty var1);

   boolean method20048();

   void method20086(boolean var1);

   Class5462 method20046();

   CompoundNBT method20083();

   CompoundNBT method20089();

   void method20090(CompoundNBT var1);

   DimensionGeneratorSettings getDimensionGeneratorSettings();

   Lifecycle getLifecycle();
}
