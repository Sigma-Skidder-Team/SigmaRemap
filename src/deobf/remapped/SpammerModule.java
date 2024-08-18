package remapped;

public class SpammerModule extends Module {
   private int field_7386;

   public SpammerModule() {
      super(Category.MISC, "Spammer", "Spam a message");
      this.addSetting(new HippieModeValue("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
      this.addSetting(new FloatSetting<Float>("Messages delay", "Delay between messages", 3.0F, Float.class, 0.1F, 10.0F, 0.1F));
   }

   @EventListen
   public void method_6254(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         this.field_7386++;
         if ((float)this.field_7386 > this.getFloatValueByName("Messages delay") * 20.0F) {
            this.field_7386 = 0;
            String var4 = this.getStringValueByName("Message").replaceAll("%r", Integer.toString(Math.round(10.0F + (float)Math.random() * 89.0F)));
            class_314.method_1423(var4);
         }
      }
   }
}
