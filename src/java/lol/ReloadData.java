package lol;

import java.nio.ByteBuffer;

public class ReloadData {
   private int field34824;
   private int field34825;
   private int field34826;
   private int field34827;
   private ByteBuffer field34828;
   public final TextureImpl field34829;

   public ReloadData(TextureImpl var1) {
      this.field34829 = var1;
   }

   public int method28054() {
      Log.method25662("Reloading texture: " + TextureImpl.method36191(this.field34829));
      return InternalTextureLoader.get().method35803(this.field34829, this.field34824, this.field34825, this.field34826, this.field34827, this.field34828);
   }

   // $VF: synthetic method
   public static int method28055(ReloadData var0, int var1) {
      return var0.field34824 = var1;
   }

   // $VF: synthetic method
   public static int method28056(ReloadData var0, int var1) {
      return var0.field34825 = var1;
   }

   // $VF: synthetic method
   public static int method28057(ReloadData var0, int var1) {
      return var0.field34826 = var1;
   }

   // $VF: synthetic method
   public static int method28058(ReloadData var0, int var1) {
      return var0.field34827 = var1;
   }

   // $VF: synthetic method
   public static ByteBuffer method28059(ReloadData var0, ByteBuffer var1) {
      return var0.field34828 = var1;
   }
}
