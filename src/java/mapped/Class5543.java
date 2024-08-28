package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;

public class Class5543 implements Packet<Class5116> {
   private static String[] field24604;
   private int field24605;
   private Suggestions field24606;

   public Class5543() {
   }

   public Class5543(int var1, Suggestions var2) {
      this.field24605 = var1;
      this.field24606 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24605 = var1.method35714();
      int var4 = var1.method35714();
      int var5 = var1.method35714();
      StringRange var6 = StringRange.between(var4, var4 + var5);
      int var7 = var1.method35714();
      ArrayList var8 = Lists.newArrayListWithCapacity(var7);

      for (int var9 = 0; var9 < var7; var9++) {
         String var10 = var1.method35728(32767);
         ITextComponent var11 = !var1.readBoolean() ? null : var1.method35710();
         var8.add(new Suggestion(var6, var10, var11));
      }

      this.field24606 = new Suggestions(var6, var8);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24605);
      var1.writeVarInt(this.field24606.getRange().getStart());
      var1.writeVarInt(this.field24606.getRange().getLength());
      var1.writeVarInt(this.field24606.getList().size());

      for (Suggestion var5 : this.field24606.getList()) {
         var1.method35729(var5.getText());
         var1.writeBoolean(var5.getTooltip() != null);
         if (var5.getTooltip() != null) {
            var1.method35711(TextComponentUtils.toTextComponent(var5.getTooltip()));
         }
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15770(this);
   }

   public int method17424() {
      return this.field24605;
   }

   public Suggestions method17425() {
      return this.field24606;
   }
}
