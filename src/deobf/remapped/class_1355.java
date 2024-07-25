package remapped;

public class class_1355 extends Module {
   private int field_7386;

   public class_1355() {
      super(Category.MISC, "Spammer", "Spam a message");
      this.addSetting(new HippieModeValue("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
      this.addSetting(new FloatSetting<Float>("Messages delay", "Delay between messages", 3.0F, Float.class, 0.1F, 10.0F, 0.1F));
   }

   @EventListen
   public void method_6254(class_5596 var1) {
      if (this.method_42015()) {
         this.field_7386++;
         if ((float)this.field_7386 > this.method_42002("Messages delay") * 20.0F) {
            this.field_7386 = 0;
            String var4 = this.method_42016("Message").replaceAll("%r", Integer.toString(Math.round(10.0F + (float)Math.random() * 89.0F)));
            class_314.method_1423(var4);
         }
      }
   }
}
