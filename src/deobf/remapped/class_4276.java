package remapped;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.Timer;

public class class_4276 extends JComponent {
   private static final DecimalFormat field_20709 = Util.<DecimalFormat>make(
      new DecimalFormat("########0.000"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private final int[] field_20712 = new int[256];
   private int field_20715;
   private final String[] field_20714 = new String[11];
   private final class_341 field_20710;
   private final Timer field_20711;

   public class_4276(class_341 var1) {
      this.field_20710 = var1;
      this.setPreferredSize(new Dimension(456, 246));
      this.setMinimumSize(new Dimension(456, 246));
      this.setMaximumSize(new Dimension(456, 246));
      this.field_20711 = new Timer(500, var1x -> this.method_19881());
      this.field_20711.start();
      this.setBackground(Color.BLACK);
   }

   private void method_19881() {
      long var3 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      this.field_20714[0] = "Memory use: "
         + var3 / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.field_20714[1] = "Avg tick: " + field_20709.format(this.method_19883(this.field_20710.field_1286) * 1.0E-6) + " ms";
      this.field_20712[this.field_20715++ & 0xFF] = (int)(var3 * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   private double method_19883(long[] var1) {
      long var4 = 0L;

      for (long var9 : var1) {
         var4 += var9;
      }

      return (double)var4 / (double)var1.length;
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(16777215));
      var1.fillRect(0, 0, 456, 246);

      for (int var4 = 0; var4 < 256; var4++) {
         int var5 = this.field_20712[var4 + this.field_20715 & 0xFF];
         var1.setColor(new Color(var5 + 28 << 16));
         var1.fillRect(var4, 100 - var5, 1, var5);
      }

      var1.setColor(Color.BLACK);

      for (int var6 = 0; var6 < this.field_20714.length; var6++) {
         String var7 = this.field_20714[var6];
         if (var7 != null) {
            var1.drawString(var7, 32, 116 + var6 * 16);
         }
      }
   }

   public void method_19880() {
      this.field_20711.stop();
   }
}
