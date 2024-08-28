package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;

public class Class6984 {
   public Module field30212;
   public Class<? extends Screen> field30213;

   public Class6984(Module var1) {
      this.field30212 = var1;
   }

   public Class6984(Class<? extends Screen> var1) {
      this.field30213 = var1;
   }

   public String method21596() {
      return this.field30212 == null ? GuiManager.field41338.get(this.field30213) : this.field30212.method15991();
   }

   public String method21597() {
      return this.field30212 == null ? "Screen" : this.field30212.method15993().getName();
   }

   public void method21598(int var1) {
      if (this.field30212 == null) {
         Client.getInstance().getModuleManager().method14668().method13726(var1, this.field30213);
      } else {
         Client.getInstance().getModuleManager().method14668().method13725(var1, this.field30212);
      }
   }

   public int method21599() {
      return this.field30212 == null
         ? Client.getInstance().getModuleManager().method14668().method13728(this.field30213)
         : Client.getInstance().getModuleManager().method14668().method13729(this.field30212);
   }
}
