package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import lol.Renderer;
import lol.SGL;
import org.lwjgl.BufferUtils;

public class TextureImpl implements Texture {
   public static SGL field43736 = Renderer.get();
   public static Texture field43737;
   private int field43738;
   private int field43739;
   private int field43740;
   private int field43741;
   private int field43742;
   private int field43743;
   private float field43744;
   private float field43745;
   private boolean field43746;
   private String field43747;
   private String field43748;
   private ReloadData field43749;

   public static Texture method36176() {
      return field43737;
   }

   public TextureImpl() {
   }

   public TextureImpl(String var1, int var2, int var3) {
      this.field43738 = var2;
      this.field43747 = var1;
      this.field43739 = var3;
      field43737 = this;
   }

   public void method36177(String var1) {
      this.field43748 = var1;
   }

   @Override
   public boolean hasAlpha() {
      return this.field43746;
   }

   @Override
   public String getTextureRef() {
      return this.field43747;
   }

   public void method36178(boolean var1) {
      this.field43746 = var1;
   }

   public static void bindNone() {
      field43737 = null;
      field43736.method18380(3553);
   }

   public static void method36180() {
      field43737 = null;
   }

   @Override
   public void bind() {
      if (field43737 != this) {
         field43737 = this;
         field43736.method18381(3553);
         field43736.method18370(this.field43738, this.field43739);
      }
   }

   public void method36181(int var1) {
      this.field43740 = var1;
      this.method36185();
   }

   public void method36182(int var1) {
      this.field43741 = var1;
      this.method36186();
   }

   @Override
   public int getImageHeight() {
      return this.field43740;
   }

   @Override
   public int getImageWidth() {
      return this.field43741;
   }

   @Override
   public float getHeight() {
      return this.field43745;
   }

   @Override
   public float getWidth() {
      return this.field43744;
   }

   @Override
   public int getTextureHeight() {
      return this.field43743;
   }

   @Override
   public int getTextureWidth() {
      return this.field43742;
   }

   public void method36183(int var1) {
      this.field43743 = var1;
      this.method36185();
   }

   public void method36184(int var1) {
      this.field43742 = var1;
      this.method36186();
   }

   private void method36185() {
      if (this.field43743 != 0) {
         this.field43745 = (float)this.field43740 / (float)this.field43743;
      }
   }

   private void method36186() {
      if (this.field43742 != 0) {
         this.field43744 = (float)this.field43741 / (float)this.field43742;
      }
   }

   @Override
   public void release() {
      IntBuffer var3 = this.method36188(1);
      var3.put(this.field43739);
      var3.flip();
      field43736.method18379(var3);
      if (field43737 == this) {
         bindNone();
      }

      if (this.field43748 == null) {
         InternalTextureLoader.get().method35786(this.field43747);
      } else {
         InternalTextureLoader.get().method35786(this.field43748);
      }
   }

   @Override
   public int getTextureID() {
      return this.field43739;
   }

   public void method36187(int var1) {
      this.field43739 = var1;
   }

   public IntBuffer method36188(int var1) {
      ByteBuffer var4 = ByteBuffer.allocateDirect(4 * var1);
      var4.order(ByteOrder.nativeOrder());
      return var4.asIntBuffer();
   }

   @Override
   public byte[] getTextureData() {
      ByteBuffer var3 = BufferUtils.createByteBuffer((!this.hasAlpha() ? 3 : 4) * this.field43742 * this.field43743);
      this.bind();
      field43736.method18387(3553, 0, !this.hasAlpha() ? 6407 : 6408, 5121, var3);
      byte[] var4 = new byte[var3.limit()];
      var3.get(var4);
      ((Buffer)var3).clear();
      return var4;
   }

   @Override
   public void setTextureFilter(int var1) {
      this.bind();
      field43736.method18404(this.field43738, 10241, var1);
      field43736.method18404(this.field43738, 10240, var1);
   }

   public void method36189(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      this.field43749 = new ReloadData(this);
      ReloadData.method28055(this.field43749, var1);
      ReloadData.method28056(this.field43749, var2);
      ReloadData.method28057(this.field43749, var3);
      ReloadData.method28058(this.field43749, var4);
      ReloadData.method28059(this.field43749, var5);
   }

   public void method36190() {
      if (this.field43749 != null) {
         this.field43739 = this.field43749.method28054();
      }
   }

   // $VF: synthetic method
   public static String method36191(TextureImpl var0) {
      return var0.field43747;
   }
}
