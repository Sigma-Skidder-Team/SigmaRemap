package mapped;

import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public abstract class Class7830 {
   private final Class<? extends ViaVersion7> field33614;
   private boolean field33615;

   public Class7830(Class<? extends ViaVersion7> var1) {
      this.field33614 = var1;
   }

   @Nullable
   public Class7161 method26209(UUID var1) {
      return ViaVersion3.method27614().method34431(var1);
   }

   public boolean method26210(UUID var1) {
      Class7161 var4 = this.method26209(var1);
      return var4 != null && (this.field33614 == null || var4.method22465().method18683().method19390(this.field33614));
   }

   public abstract void method26211();

   public Class<? extends ViaVersion7> method26212() {
      return this.field33614;
   }

   public boolean method26213() {
      return this.field33615;
   }

   public void method26214(boolean var1) {
      this.field33615 = var1;
   }
}
