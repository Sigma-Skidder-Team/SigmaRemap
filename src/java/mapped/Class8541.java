package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SMapDataPacket;

import javax.annotation.Nullable;

public class Class8541 {
   private static String[] field38389;
   public final PlayerEntity field38390;
   private boolean field38391;
   private int field38392;
   private int field38393;
   private int field38394;
   private int field38395;
   private int field38396;
   public int field38397;
   public final Class7529 field38398;

   public Class8541(Class7529 var1, PlayerEntity var2) {
      this.field38398 = var1;
      this.field38391 = true;
      this.field38394 = 127;
      this.field38395 = 127;
      this.field38390 = var2;
   }

   @Nullable
   public IPacket<?> method30388(ItemStack var1) {
      if (!this.field38391) {
         return this.field38396++ % 5 != 0
            ? null
            : new SMapDataPacket(
               Class3316.method11862(var1),
               this.field38398.field32321,
               this.field38398.field32319,
               this.field38398.field32323,
               this.field38398.field32327.values(),
               this.field38398.field32322,
               0,
               0,
               0,
               0
            );
      } else {
         this.field38391 = false;
         return new SMapDataPacket(
            Class3316.method11862(var1),
            this.field38398.field32321,
            this.field38398.field32319,
            this.field38398.field32323,
            this.field38398.field32327.values(),
            this.field38398.field32322,
            this.field38392,
            this.field38393,
            this.field38394 + 1 - this.field38392,
            this.field38395 + 1 - this.field38393
         );
      }
   }

   public void method30389(int var1, int var2) {
      if (!this.field38391) {
         this.field38391 = true;
         this.field38392 = var1;
         this.field38393 = var2;
         this.field38394 = var1;
         this.field38395 = var2;
      } else {
         this.field38392 = Math.min(this.field38392, var1);
         this.field38393 = Math.min(this.field38393, var2);
         this.field38394 = Math.max(this.field38394, var1);
         this.field38395 = Math.max(this.field38395, var2);
      }
   }
}
