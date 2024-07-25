package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_8131 extends class_7060 {
   private static final Logger field_41649 = LogManager.getLogger();
   public class_6561 field_41647;
   public class_8478 field_41650;
   public BlockPos field_41648;

   public class_8131(class_2746 var1, int var2) {
      super(var1, var2);
   }

   public class_8131(class_2746 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field_41648 = new BlockPos(var2.method_25947("TPX"), var2.method_25947("TPY"), var2.method_25947("TPZ"));
   }

   public void method_36998(class_6561 var1, BlockPos var2, class_8478 var3) {
      this.field_41647 = var1;
      this.method_32519(Direction.field_818);
      this.field_41648 = var2;
      this.field_41650 = var3;
      this.field_36435 = var1.method_29986(var3, var2);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      var1.putInt("TPX", this.field_41648.getX());
      var1.putInt("TPY", this.field_41648.getY());
      var1.putInt("TPZ", this.field_41648.getZ());
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.field_41650.method_39051(var5);
      this.field_36435 = this.field_41647.method_29986(this.field_41650, this.field_41648);
      if (this.field_41647.method_29965(var1, this.field_41648, var7, this.field_41650, var4, 2)) {
         for (class_4099 var11 : this.field_41647.method_29969(this.field_41648, this.field_41650, class_4783.field_23846)) {
            if (var11.field_19968 != null) {
               class_589 var12 = class_589.valueOf(var11.field_19968.method_25965("mode"));
               if (var12 == class_589.field_3411) {
                  this.method_36999(var11.field_19968.method_25965("metadata"), var11.field_19965, var1, var4, var5);
               }
            }
         }

         for (class_4099 var18 : this.field_41647.method_29969(this.field_41648, this.field_41650, class_4783.field_23319)) {
            if (var18.field_19968 != null) {
               String var19 = var18.field_19968.method_25965("final_state");
               class_4104 var13 = new class_4104(new StringReader(var19), false);
               class_2522 var14 = class_4783.field_23184.method_29260();

               try {
                  var13.method_18973(true);
                  class_2522 var15 = var13.method_18967();
                  if (var15 != null) {
                     var14 = var15;
                  } else {
                     field_41649.error("Error while parsing blockstate {} in jigsaw block @ {}", var19, var18.field_19965);
                  }
               } catch (CommandSyntaxException var16) {
                  field_41649.error("Error while parsing blockstate {} in jigsaw block @ {}", var19, var18.field_19965);
               }

               var1.method_7513(var18.field_19965, var14, 3);
            }
         }
      }

      return true;
   }

   public abstract void method_36999(String var1, BlockPos var2, class_1556 var3, Random var4, class_9616 var5);

   @Override
   public void method_32508(int var1, int var2, int var3) {
      super.method_32508(var1, var2, var3);
      this.field_41648 = this.field_41648.method_6104(var1, var2, var3);
   }

   @Override
   public class_6631 method_32528() {
      return this.field_41650.method_39056();
   }
}
