package mapped;

import net.minecraft.client.gui.screen.VideoSettingsScreen;

public class Class1333 extends ChatScreen {
   private static final String field7051 = "/reloadShaders";
   private static final String field7052 = "/reloadChunks";

   public Class1333(ChatScreen var1) {
      super(VideoSettingsScreen.method2584(var1));
   }

   @Override
   public void method2465(String var1) {
      if (!this.method6350(var1)) {
         super.method2465(var1);
      } else {
         this.mc.ingameGUI.getChatGUI().method5935(var1);
      }
   }

   private boolean method6350(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (!var1.equals("/reloadShaders")) {
            if (!var1.equals("/reloadChunks")) {
               return false;
            } else {
               this.mc.worldRenderer.loadRenderers();
               return true;
            }
         } else {
            if (Class7944.method26921()) {
               Shaders.method33033();
               Shaders.method32953();
            }

            return true;
         }
      } else {
         return false;
      }
   }
}
