package remapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;

public class class_3675 {
   private static String[] field_17925;
   private final ArgumentBuilder<class_8773, ?> field_17921;
   private final byte field_17920;
   private final int field_17922;
   private final int[] field_17924;
   private CommandNode<class_8773> field_17923;

   private class_3675(ArgumentBuilder<class_8773, ?> var1, byte var2, int var3, int[] var4) {
      this.field_17921 = var1;
      this.field_17920 = var2;
      this.field_17922 = var3;
      this.field_17924 = var4;
   }

   public boolean method_17052(class_3675[] var1) {
      if (this.field_17923 == null) {
         if (this.field_17921 != null) {
            if ((this.field_17920 & 8) != 0) {
               if (var1[this.field_17922].field_17923 == null) {
                  return false;
               }

               this.field_17921.redirect(var1[this.field_17922].field_17923);
            }

            if ((this.field_17920 & 4) != 0) {
               this.field_17921.executes(var0 -> 0);
            }

            this.field_17923 = this.field_17921.build();
         } else {
            this.field_17923 = new RootCommandNode();
         }
      }

      for (int var7 : this.field_17924) {
         if (var1[var7].field_17923 == null) {
            return false;
         }
      }

      for (int var12 : this.field_17924) {
         CommandNode var8 = var1[var12].field_17923;
         if (!(var8 instanceof RootCommandNode)) {
            this.field_17923.addChild(var8);
         }
      }

      return true;
   }
}
