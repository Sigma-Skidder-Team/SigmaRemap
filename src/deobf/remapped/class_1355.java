package remapped;

public class class_1355 extends class_9128 {
   private int field_7386;

   public class_1355() {
      super(class_5664.field_28711, "Spammer", "Spam a message");
      this.method_42010(new class_8246("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
      this.method_42010(new class_2748<Float>("Messages delay", "Delay between messages", 3.0F, Float.class, 0.1F, 10.0F, 0.1F));
   }

   @class_9148
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
