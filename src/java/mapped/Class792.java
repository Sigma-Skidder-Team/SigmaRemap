package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class792 extends Class789 {
   private final String field4142;
   private final String field4143;
   private final long field4144;
   private final Screen field4145;

   public Class792(long var1, String var3, String var4, Screen var5) {
      this.field4144 = var1;
      this.field4142 = var3;
      this.field4143 = var4;
      this.field4145 = var5;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.create.world.wait"));
      Class4624 var3 = Class4624.method14543();

      try {
         var3.method14551(this.field4144, this.field4142, this.field4143);
         method1905(this.field4145);
      } catch (Class2435 var5) {
         field4133.error("Couldn't create world");
         this.method1918(var5.toString());
      } catch (Exception var6) {
         field4133.error("Could not create world");
         this.method1918(var6.getLocalizedMessage());
      }
   }
}
