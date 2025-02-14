package mapped;

import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class7982 {
   private static String[] field34302;
   private final MapDecorationType field34303;
   private byte field34304;
   private byte field34305;
   private byte field34306;
   private final ITextComponent field34307;

   public Class7982(MapDecorationType var1, byte var2, byte var3, byte var4, ITextComponent var5) {
      this.field34303 = var1;
      this.field34304 = var2;
      this.field34305 = var3;
      this.field34306 = var4;
      this.field34307 = var5;
   }

   public byte method27125() {
      return this.field34303.getIcon();
   }

   public MapDecorationType method27126() {
      return this.field34303;
   }

   public byte method27127() {
      return this.field34304;
   }

   public byte method27128() {
      return this.field34305;
   }

   public byte method27129() {
      return this.field34306;
   }

   public boolean method27130() {
      return this.field34303.isRenderedOnFrame();
   }

   @Nullable
   public ITextComponent method27131() {
      return this.field34307;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class7982) {
            Class7982 var4 = (Class7982)var1;
            if (this.field34303 == var4.field34303) {
               if (this.field34306 == var4.field34306) {
                  if (this.field34304 == var4.field34304) {
                     return this.field34305 == var4.field34305 ? Objects.equals(this.field34307, var4.field34307) : false;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field34303.getIcon();
      var3 = 31 * var3 + this.field34304;
      var3 = 31 * var3 + this.field34305;
      var3 = 31 * var3 + this.field34306;
      return 31 * var3 + Objects.hashCode(this.field34307);
   }
}
