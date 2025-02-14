package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateContainer;

public final class Class9786 {
   private static String[] field45754;
   public final Gson field45755 = new GsonBuilder()
      .registerTypeAdapter(Class9032.class, new Class2571())
      .registerTypeAdapter(Class1903.class, new Class2557())
      .registerTypeAdapter(Class7497.class, new Class2562())
      .registerTypeAdapter(Class7498.class, new Class2574(this))
      .registerTypeAdapter(Class9350.class, new Class2570())
      .create();
   private StateContainer<Block, BlockState> field45756;

   public StateContainer<Block, BlockState> method38572() {
      return this.field45756;
   }

   public void method38573(StateContainer<Block, BlockState> var1) {
      this.field45756 = var1;
   }
}
