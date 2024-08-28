package mapped;

import java.util.UUID;
import net.minecraft.util.text.ITextComponent;

public abstract class Class3625 {
   private final UUID field19633;
   public ITextComponent field19634;
   public float field19635;
   public Class2303 field19636;
   public Class2300 field19637;
   public boolean field19638;
   public boolean field19639;
   public boolean field19640;

   public Class3625(UUID var1, ITextComponent var2, Class2303 var3, Class2300 var4) {
      this.field19633 = var1;
      this.field19634 = var2;
      this.field19636 = var3;
      this.field19637 = var4;
      this.field19635 = 1.0F;
   }

   public UUID method12289() {
      return this.field19633;
   }

   public ITextComponent method12290() {
      return this.field19634;
   }

   public void method12284(ITextComponent var1) {
      this.field19634 = var1;
   }

   public float method12291() {
      return this.field19635;
   }

   public void method12278(float var1) {
      this.field19635 = var1;
   }

   public Class2303 method12292() {
      return this.field19636;
   }

   public void method12279(Class2303 var1) {
      this.field19636 = var1;
   }

   public Class2300 method12293() {
      return this.field19637;
   }

   public void method12280(Class2300 var1) {
      this.field19637 = var1;
   }

   public boolean method12294() {
      return this.field19638;
   }

   public Class3625 method12281(boolean var1) {
      this.field19638 = var1;
      return this;
   }

   public boolean method12295() {
      return this.field19639;
   }

   public Class3625 method12282(boolean var1) {
      this.field19639 = var1;
      return this;
   }

   public Class3625 method12283(boolean var1) {
      this.field19640 = var1;
      return this;
   }

   public boolean method12296() {
      return this.field19640;
   }
}
