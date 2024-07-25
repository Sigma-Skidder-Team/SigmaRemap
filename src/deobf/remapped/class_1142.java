package remapped;

public class class_1142 extends Module {
   public class_1142() {
      super(class_5664.field_28709, "Streaming", "Useful module when recording or streaming");
      this.addSetting(new BooleanSetting("Hide skins", "Spoof all players skin", true));
      this.addSetting(new BooleanSetting("Hide server name", "Spoof server name", false));
      this.addSetting(new TextInputSetting("Server name", "The server name that you need to hide", "servernamehere"));
      this.addSetting(new BooleanSetting("Hide date", "Hide date on scoreboard", false));
   }

   @class_9148
   public void method_5003(class_4981 var1) {
      if (this.method_42015()) {
         if (this.method_42007("Hide server name") && this.method_42016("Server name").length() > 1) {
            var1.method_22940(var1.method_22941().replaceAll(this.method_42016("Server name"), "sigmaclient"));
            var1.method_22940(var1.method_22941().replaceAll(this.method_42016("Server name").toLowerCase(), "sigmaclient"));
            var1.method_22940(var1.method_22941().replaceAll(this.method_42016("Server name").toUpperCase(), "sigmaclient"));
         }
      }
   }

   @class_9148
   public void method_5002(class_2563 var1) {
   }

   @class_9148
   public void method_5004(class_5278 var1) {
      if (this.method_42015()) {
         if (this.method_42007("Hide skins")) {
            var1.method_24088(false);
         }
      }
   }
}
