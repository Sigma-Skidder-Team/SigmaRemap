package mapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;

public class Class8125 {
   private static String[] field34943;
   private final ArgumentBuilder<Class6618, ?> field34944;
   private final byte field34945;
   private final int field34946;
   private final int[] field34947;
   private CommandNode<Class6618> field34948;

   public Class8125(ArgumentBuilder<Class6618, ?> var1, byte var2, int var3, int[] var4) {
      this.field34944 = var1;
      this.field34945 = var2;
      this.field34946 = var3;
      this.field34947 = var4;
   }

   public boolean method28145(Class8125[] var1) {
      if (this.field34948 == null) {
         if (this.field34944 != null) {
            if ((this.field34945 & 8) != 0) {
               if (var1[this.field34946].field34948 == null) {
                  return false;
               }

               this.field34944.redirect(var1[this.field34946].field34948);
            }

            if ((this.field34945 & 4) != 0) {
               this.field34944.executes(var0 -> 0);
            }

            this.field34948 = this.field34944.build();
         } else {
            this.field34948 = new RootCommandNode();
         }
      }

      for (int var7 : this.field34947) {
         if (var1[var7].field34948 == null) {
            return false;
         }
      }

      for (int var12 : this.field34947) {
         CommandNode var8 = var1[var12].field34948;
         if (!(var8 instanceof RootCommandNode)) {
            this.field34948.addChild(var8);
         }
      }

      return true;
   }

   // $VF: synthetic method
   public static CommandNode method28147(Class8125 var0) {
      return var0.field34948;
   }
}
