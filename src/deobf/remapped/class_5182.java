package remapped;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class class_5182 implements Packet<class_392> {
   private static String[] field_26672;
   private ITextComponent field_26671;
   private ChatType field_26670;
   private UUID field_26669;

   public class_5182() {
   }

   public class_5182(ITextComponent var1, ChatType var2, UUID var3) {
      this.field_26671 = var1;
      this.field_26670 = var2;
      this.field_26669 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26671 = var1.method_37776();
      this.field_26670 = ChatType.byId(var1.readByte());
      this.field_26669 = var1.method_37753();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37779(this.field_26671);
      var1.writeByte(this.field_26670.getId());
      var1.method_37746(this.field_26669);
   }

   public void method_23773(class_392 var1) {
      var1.method_1951(this);
   }

   public ITextComponent method_23768() {
      return this.field_26671;
   }

   public boolean method_23769() {
      return this.field_26670 == ChatType.SYSTEM || this.field_26670 == ChatType.GAME_INFO;
   }

   public ChatType method_23771() {
      return this.field_26670;
   }

   public UUID method_23772() {
      return this.field_26669;
   }

   @Override
   public boolean method_28774() {
      return true;
   }
}
