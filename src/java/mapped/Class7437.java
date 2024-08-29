package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class Class7437 implements Class7436 {
   public static final Class7437 field32000 = new Class7437(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Codec<Class7437> field32001 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("r").forGetter(var0x -> var0x.field32003),
               Codec.FLOAT.fieldOf("g").forGetter(var0x -> var0x.field32004),
               Codec.FLOAT.fieldOf("b").forGetter(var0x -> var0x.field32005),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field32006)
            )
            .apply(var0, Class7437::new)
   );
   public static final Class6865<Class7437> field32002 = new Class6864();
   private final float field32003;
   private final float field32004;
   private final float field32005;
   private final float field32006;

   public Class7437(float var1, float var2, float var3, float var4) {
      this.field32003 = var1;
      this.field32004 = var2;
      this.field32005 = var3;
      this.field32006 = MathHelper.method37777(var4, 0.01F, 4.0F);
   }

   @Override
   public void method24009(PacketBuffer var1) {
      var1.writeFloat(this.field32003);
      var1.writeFloat(this.field32004);
      var1.writeFloat(this.field32005);
      var1.writeFloat(this.field32006);
   }

   @Override
   public String method24010() {
      return String.format(
         Locale.ROOT,
         "%s %.2f %.2f %.2f %.2f",
         Registry.field16077.getKey(this.method24011()),
         this.field32003,
         this.field32004,
         this.field32005,
         this.field32006
      );
   }

   @Override
   public Class7434<Class7437> method24011() {
      return Class7940.field34062;
   }

   public float method24012() {
      return this.field32003;
   }

   public float method24013() {
      return this.field32004;
   }

   public float method24014() {
      return this.field32005;
   }

   public float method24015() {
      return this.field32006;
   }
}
