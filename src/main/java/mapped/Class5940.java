package mapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Class5940 {
   public static final int field25835 = 1413565506;
   public static final int field25836 = 1414745921;
   public static final int field25837 = 1414546737;
   public static final int field25838 = 1095780675;
   public static final int field25839 = 1095061059;
   public static final int field25840 = 1095979081;
   public static final int field25841 = 1414546738;
   public static final int field25842 = 1413632077;
   public static final int field25843 = 1129270605;
   public static final int field25844 = 1129270610;
   public static final int field25845 = 1464029005;
   public static final int field25846 = 1413697357;
   public static final int field25847 = 1414546739;
   public static final int field25848 = 1414091825;
   public static final int field25849 = 1413697358;
   public static final int field25850 = 1464029008;
   public static final int field25851 = 1413697360;
   public static final int field25852 = 1413828163;
   public static final int field25853 = 1413760334;
   public static final int field25854 = 1162756946;
   public static final int field25855 = 1162958130;
   public static final int field25856 = 1163150159;
   public static final int field25857 = 1414485838;
   public static final int field25858 = 1413893204;
   public static final int field25859 = 1195724610;
   public static final int field25860 = 1196575044;
   public static final int field25861 = 1414219097;
   public static final int field25862 = 1414681422;
   public static final int field25863 = 1414681423;
   public static final int field25864 = 1414546740;
   public static final int field25865 = 1414090828;
   public static final int field25866 = 1414746691;
   public static final int field25867 = 1414283598;
   public static final int field25868 = 1414284622;
   public static final int field25869 = 1279872587;
   public static final int field25870 = 1413830740;
   public static final int field25871 = 1414350148;
   public static final int field25872 = 1414352719;
   public static final int field25873 = 1296845908;
   public static final int field25874 = 1414349644;
   public static final int field25875 = 1296254025;
   public static final int field25876 = 1464811858;
   public static final int field25877 = 1464811846;
   public static final int field25878 = 1464811859;
   public static final int field25879 = 1464816211;
   public static final int field25880 = 1414480204;
   public static final int field25881 = 1414484037;
   public static final int field25882 = 1414481486;
   public static final int field25883 = 1414483033;
   public static final int field25884 = 1413762898;
   public static final int field25885 = 1331121733;
   public static final int field25886 = 1414549331;
   public static final int field25887 = 1464877401;
   public static final int field25888 = 1414745936;
   public static final int field25889 = 1413762137;
   public static final int field25890 = 1346588244;
   public static final int field25891 = 1347375181;
   public static final int field25892 = 1347375955;
   public static final int field25893 = 1347570006;
   public static final int field25894 = 1414550095;
   public static final int field25895 = 1414550850;
   public static final int field25896 = 1464882498;
   public static final int field25897 = 1380078918;
   public static final int field25898 = 1413763651;
   public static final int field25899 = 1381384498;
   public static final int field25900 = 1413763660;
   public static final int field25901 = 1381388866;
   public static final int field25902 = 1397048651;
   public static final int field25903 = 1414746964;
   public static final int field25904 = 1397311310;
   public static final int field25905 = 1414746949;
   public static final int field25906 = 1414091827;
   public static final int field25907 = 1398361172;
   public static final int field25908 = 1398363203;
   public static final int field25909 = 1413764167;
   public static final int field25910 = 1431520594;
   public static final int field25911 = 1414091826;
   public static final int field25912 = 1414745940;
   public static final int field25913 = 1414677323;
   public static final int field25914 = 1430669636;
   public static final int field25915 = 1431522388;
   public static final int field25916 = 1415075928;
   public static final int field25917 = 1465407576;
   private static final String[] field25918 = new String[]{"ISO-8859-1", "UTF-16", "UTF-16", "UTF-8"};
   private static final String[] field25919 = new String[]{"yyyy, yyyy-MM", "yyyy-MM-dd", "yyyy-MM-ddTHH", "yyyy-MM-ddTHH:mm", "yyyy-MM-ddTHH:mm:ss"};
   private static final String field25920 = "xxx";
   private long field25921;
   private int field25922;
   private int field25923;
   private int field25924;
   private int field25925;
   private byte[] field25926;

   public Class5940(DataInputStream var1) throws IOException {
      this.field25922 = var1.readInt();
      this.field25921 = (long)Class9230.method34718(var1);
      this.field25923 = var1.readShort();
      if (this.method18446()) {
         this.field25924 = var1.read();
      }

      if (this.method18449()) {
         this.field25925 = var1.read();
      }

      this.field25926 = new byte[(int)this.field25921];
      var1.readFully(this.field25926);
   }

   public int method18444() {
      return this.field25922;
   }

   public long method18445() {
      return this.field25921;
   }

   public final boolean method18446() {
      return (this.field25923 & 64) == 64;
   }

   public int method18447() {
      return this.field25924;
   }

   public final boolean method18448() {
      return (this.field25923 & 8) == 8;
   }

   public final boolean method18449() {
      return (this.field25923 & 4) == 4;
   }

   public int method18450() {
      return this.field25925;
   }

   public byte[] method18451() {
      return this.field25926;
   }

   public String method18452() {
      return new String(this.field25926, Charset.forName(field25918[0]));
   }

   public String method18453() {
      byte var3 = this.field25926[0];
      int var4 = -1;

      for (int var5 = 1; var5 < this.field25926.length && var4 < 0; var5++) {
         if (this.field25926[var5] == 0 && (var3 == 0 || var3 == 3 || this.field25926[var5 + 1] == 0)) {
            var4 = var5;
         }
      }

      return new String(this.field25926, 1, var4 - 1, Charset.forName(field25918[var3]));
   }

   public int method18454() {
      return Integer.parseInt(new String(this.field25926));
   }

   public int[] method18455() {
      String var3 = new String(this.field25926, Charset.forName(field25918[0]));
      int var4 = var3.indexOf(47);
      int[] var5;
      if (var4 <= 0) {
         var5 = new int[]{Integer.parseInt(var3)};
      } else {
         var5 = new int[]{Integer.parseInt(var3.substring(0, var4)), Integer.parseInt(var3.substring(var4 + 1))};
      }

      return var5;
   }

   public Date method18456() {
      int var3 = (int)Math.floor((double)(this.field25926.length / 3)) - 1;
      Date var4;
      if (var3 >= 0 && var3 < field25919.length) {
         SimpleDateFormat var5 = new SimpleDateFormat(field25919[var3]);
         var4 = var5.parse(new String(this.field25926), new ParsePosition(0));
      } else {
         var4 = null;
      }

      return var4;
   }

   public Locale method18457() {
      String var3 = new String(this.field25926).toLowerCase();
      Locale var4;
      if (!var3.equals("xxx")) {
         var4 = new Locale(var3);
      } else {
         var4 = null;
      }

      return var4;
   }
}
