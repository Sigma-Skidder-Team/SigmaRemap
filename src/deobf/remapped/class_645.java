package remapped;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_645 implements class_4343 {
   private static final Logger field_3610 = Logger.getLogger(field_3613[3]);
   private static final Map<Long, Class<? extends class_3912>> field_3611;
   private static final Map<Long, Class<? extends class_3912>[]> field_3609;
   private static final Map<Long, String[]> field_3612;

   public static class_7641 method_2969(class_7641 var0, class_6041 var1) throws IOException {
      long var4 = var1.method_27526();
      long var6 = var1.method_27524(4);
      long var8 = var1.method_27524(4);
      if (var6 == 1L) {
         var6 = var1.method_27524(8);
      }

      if (var8 == 1970628964L) {
         var1.method_27527(16L);
      }

      if (var0 != null) {
         long var12 = var0.method_34613() + var0.method_34606() - var4;
         if (var6 > var12) {
            throw new IOException("error while decoding box '" + method_2970(var8) + "' at offset " + var4 + ": box too large for parent");
         }
      }

      Logger.getLogger("MP4 Boxes").finest(method_2970(var8));
      class_3912 var10 = method_2971(var8, var1.method_27526());
      var10.method_18112(var0, var6, var8, var4);
      var10.method_18109(var1);
      Class var11 = var10.getClass();
      if (var11 == class_3912.class || var11 == class_6926.class) {
         var10.method_18110(var1);
      }

      long var14 = var10.method_34613() + var10.method_34606() - var1.method_27526();
      if (var14 > 0L && !(var10 instanceof class_5622) && !(var10 instanceof class_7349) && !(var10 instanceof class_9286)) {
         field_3610.log(Level.INFO, "bytes left after reading box {0}: left: {1}, offset: {2}", new Object[]{method_2970(var8), var14, var1.method_27526()});
      } else if (var14 < 0L) {
         field_3610.log(Level.SEVERE, "box {0} overread: {1} bytes, offset: {2}", new Object[]{method_2970(var8), -var14, var1.method_27526()});
      }

      if (var10.method_34615() != 1835295092L || var1.method_27523()) {
         var1.method_27527(var14);
      }

      return var10;
   }

   public static class_7641 method_2968(class_6041 var0, Class<? extends class_3912> var1) throws IOException {
      long var4 = var0.method_27526();
      long var6 = var0.method_27524(4);
      long var8 = var0.method_27524(4);
      if (var6 == 1L) {
         var6 = var0.method_27524(8);
      }

      if (var8 == 1970628964L) {
         var0.method_27527(16L);
      }

      class_3912 var10 = null;

      try {
         var10 = (class_3912)var1.newInstance();
      } catch (InstantiationException var14) {
      } catch (IllegalAccessException var15) {
      }

      if (var10 != null) {
         var10.method_18112(null, var6, var8, var4);
         var10.method_18109(var0);
         long var12 = var10.method_34613() + var10.method_34606() - var0.method_27526();
         var0.method_27527(var12);
      }

      return var10;
   }

   private static class_3912 method_2971(long var0, long var2) {
      Object var6 = null;
      Long var7 = var0;
      if (field_3611.containsKey(var7)) {
         Class var8 = field_3611.get(var7);
         if (field_3612.containsKey(var7)) {
            String[] var9 = field_3612.get(var7);

            try {
               Constructor var10 = var8.getConstructor(String.class);
               var6 = (class_3912)var10.newInstance(var9[0]);
            } catch (Exception var12) {
               field_3610.log(Level.SEVERE, "BoxFactory: could not call constructor for " + method_2970(var0), (Throwable)var12);
               var6 = new class_7349();
            }
         } else {
            try {
               var6 = (class_3912)var8.newInstance();
            } catch (Exception var11) {
               field_3610.log(Level.SEVERE, "BoxFactory: could not instantiate box " + method_2970(var0), (Throwable)var11);
            }
         }
      }

      if (var6 == null) {
         field_3610.log(Level.INFO, "BoxFactory: unknown box type: {0}; position: {1}", new Object[]{method_2970(var0), var2});
         var6 = new class_7349();
      }

      return (class_3912)var6;
   }

   public static String method_2970(long var0) {
      byte[] var4 = new byte[]{(byte)((int)(var0 >> 24 & 255L)), (byte)((int)(var0 >> 16 & 255L)), (byte)((int)(var0 >> 8 & 255L)), (byte)((int)(var0 & 255L))};
      return new String(var4);
   }

   static {
      for (Handler var9 : field_3610.getHandlers()) {
         field_3610.removeHandler(var9);
      }

      field_3610.setLevel(Level.WARNING);
      ConsoleHandler var10 = new ConsoleHandler();
      var10.setLevel(Level.ALL);
      field_3610.addHandler(var10);
      field_3611 = new HashMap<Long, Class<? extends class_3912>>();
      field_3609 = new HashMap<Long, Class<? extends class_3912>[]>();
      field_3612 = new HashMap<Long, String[]>();
      field_3611.put(1835361135L, class_3912.class);
      field_3611.put(1634492771L, class_3066.class);
      field_3611.put(1652059500L, class_5672.class);
      field_3611.put(1651798644L, class_396.class);
      field_3611.put(1667788908L, class_7062.class);
      field_3611.put(1937007471L, class_6898.class);
      field_3611.put(1668232756L, class_6898.class);
      field_3611.put(1668047216L, class_8069.class);
      field_3611.put(1937013298L, class_2416.class);
      field_3611.put(1668576371L, class_7125.class);
      field_3611.put(1668313716L, class_5460.class);
      field_3611.put(1970433568L, class_572.class);
      field_3611.put(1970433056L, class_9839.class);
      field_3611.put(1684631142L, class_3912.class);
      field_3611.put(1685218662L, class_5760.class);
      field_3611.put(1937011827L, class_5959.class);
      field_3611.put(1937007728L, class_8199.class);
      field_3611.put(1701082227L, class_3912.class);
      field_3611.put(1701606260L, class_6461.class);
      field_3611.put(1718184302L, class_1458.class);
      field_3611.put(1936025458L, class_9666.class);
      field_3611.put(1717920626L, class_9018.class);
      field_3611.put(1718641010L, class_2887.class);
      field_3611.put(1718909296L, class_910.class);
      field_3611.put(1718773093L, class_9286.class);
      field_3611.put(1734964334L, class_843.class);
      field_3611.put(1751411826L, class_6303.class);
      field_3611.put(1752000612L, class_2702.class);
      field_3611.put(1768975715L, class_7838.class);
      field_3611.put(1768778086L, class_9354.class);
      field_3611.put(1768517222L, class_5716.class);
      field_3611.put(1768842853L, class_7719.class);
      field_3611.put(1768714083L, class_7814.class);
      field_3611.put(1768977007L, class_5459.class);
      field_3611.put(1835297121L, class_3912.class);
      field_3611.put(1835295092L, class_5622.class);
      field_3611.put(1835296868L, class_9587.class);
      field_3611.put(1835626086L, class_3912.class);
      field_3611.put(1835365473L, class_955.class);
      field_3611.put(1835364965L, class_1165.class);
      field_3611.put(1836019574L, class_3912.class);
      field_3611.put(1836475768L, class_3912.class);
      field_3611.put(1835362404L, class_388.class);
      field_3611.put(1836019558L, class_3912.class);
      field_3611.put(1835427940L, class_2854.class);
      field_3611.put(1835430497L, class_3912.class);
      field_3611.put(1835430511L, class_7707.class);
      field_3611.put(1836476516L, class_3485.class);
      field_3611.put(1952540531L, class_5889.class);
      field_3611.put(1852663908L, class_6926.class);
      field_3611.put(1718775137L, class_9559.class);
      field_3611.put(1885430882L, class_4693.class);
      field_3611.put(1885431150L, class_3912.class);
      field_3611.put(1885434736L, class_280.class);
      field_3611.put(1885959277L, class_1923.class);
      field_3611.put(1885628782L, class_1961.class);
      field_3611.put(1936289382L, class_3912.class);
      field_3611.put(1935963248L, class_8516.class);
      field_3611.put(1937011556L, class_8519.class);
      field_3611.put(1936158820L, class_9025.class);
      field_3611.put(1937011564L, class_2528.class);
      field_3611.put(1937011578L, class_2416.class);
      field_3611.put(1937007212L, class_3912.class);
      field_3611.put(1937011555L, class_2499.class);
      field_3611.put(1935828848L, class_7071.class);
      field_3611.put(1935894637L, class_8980.class);
      field_3611.put(1935894633L, class_3912.class);
      field_3611.put(1937011560L, class_3938.class);
      field_3611.put(1936419184L, class_9286.class);
      field_3611.put(1936549988L, class_4876.class);
      field_3611.put(1937072755L, class_7222.class);
      field_3611.put(1937011571L, class_1294.class);
      field_3611.put(1953653099L, class_3912.class);
      field_3611.put(1953654136L, class_5846.class);
      field_3611.put(1953653094L, class_3912.class);
      field_3611.put(1952868452L, class_8611.class);
      field_3611.put(1952871009L, class_5857.class);
      field_3611.put(1953658222L, class_7752.class);
      field_3611.put(1953196132L, class_9557.class);
      field_3611.put(1953654118L, class_9746.class);
      field_3611.put(1953719660L, class_4387.class);
      field_3611.put(1969517665L, class_3912.class);
      field_3611.put(1986881636L, class_4457.class);
      field_3611.put(2003395685L, class_9286.class);
      field_3611.put(2020437024L, class_6795.class);
      field_3611.put(1768907891L, class_5189.class);
      field_3611.put(1935959408L, class_1579.class);
      field_3611.put(1768174386L, class_5267.class);
      field_3611.put(1768715124L, class_3912.class);
      field_3611.put(757935405L, class_3912.class);
      field_3611.put(1684108385L, class_400.class);
      field_3611.put(1851878757L, class_4149.class);
      field_3611.put(1835360622L, class_2447.class);
      field_3611.put(1631670868L, class_3912.class);
      field_3611.put(1936679265L, class_3912.class);
      field_3611.put(2841734242L, class_3912.class);
      field_3611.put(1936679276L, class_3912.class);
      field_3611.put(2839630420L, class_3912.class);
      field_3611.put(1936679282L, class_3912.class);
      field_3611.put(1667331175L, class_3912.class);
      field_3611.put(2841865588L, class_3912.class);
      field_3611.put(1668311404L, class_3912.class);
      field_3611.put(2843177588L, class_3912.class);
      field_3611.put(1936679791L, class_3912.class);
      field_3611.put(1668249202L, class_3912.class);
      field_3611.put(2842125678L, class_3912.class);
      field_3611.put(1684370275L, class_3912.class);
      field_3611.put(1684632427L, class_3912.class);
      field_3611.put(2841996899L, class_9700.class);
      field_3611.put(2842980207L, class_9700.class);
      field_3611.put(1701276004L, class_3912.class);
      field_3611.put(1885823344L, class_3912.class);
      field_3611.put(1735291493L, class_9781.class);
      field_3611.put(2842129008L, class_3912.class);
      field_3611.put(1751414372L, class_3912.class);
      field_3611.put(1634748740L, class_3912.class);
      field_3611.put(1634421060L, class_3912.class);
      field_3611.put(1668172100L, class_3912.class);
      field_3611.put(1936083268L, class_3912.class);
      field_3611.put(1801812343L, class_3912.class);
      field_3611.put(1818518899L, class_3912.class);
      field_3611.put(2842458482L, class_3912.class);
      field_3611.put(1937009003L, class_3912.class);
      field_3611.put(1885565812L, class_3912.class);
      field_3611.put(1886745196L, class_3912.class);
      field_3611.put(1886745188L, class_3912.class);
      field_3611.put(1920233063L, class_7337.class);
      field_3611.put(2841928057L, class_3912.class);
      field_3611.put(2842846577L, class_1389.class);
      field_3611.put(1953329263L, class_3912.class);
      field_3611.put(2842583405L, class_3912.class);
      field_3611.put(1953655662L, class_3912.class);
      field_3611.put(1936682605L, class_3912.class);
      field_3611.put(1953916275L, class_3912.class);
      field_3611.put(1953916270L, class_3912.class);
      field_3611.put(1953918574L, class_3912.class);
      field_3611.put(1953919854L, class_3912.class);
      field_3611.put(1953919848L, class_3912.class);
      field_3611.put(1936683886L, class_3912.class);
      field_3611.put(1634493037L, class_8030.class);
      field_3611.put(1635087464L, class_5535.class);
      field_3611.put(1668051814L, class_5535.class);
      field_3611.put(1685283696L, class_5535.class);
      field_3611.put(1803122532L, class_3296.class);
      field_3611.put(1819239273L, class_9673.class);
      field_3611.put(1885696614L, class_5535.class);
      field_3611.put(2037543523L, class_255.class);
      field_3611.put(1953068140L, class_5535.class);
      field_3611.put(1735616616L, class_3912.class);
      field_3611.put(1735618669L, class_3912.class);
      field_3611.put(1735618677L, class_3912.class);
      field_3611.put(1735619428L, class_3912.class);
      field_3611.put(1735619444L, class_3912.class);
      field_3611.put(1735619684L, class_3912.class);
      field_3611.put(1836070006L, class_3612.class);
      field_3611.put(1932670515L, class_3612.class);
      field_3611.put(1701733238L, class_3612.class);
      field_3611.put(1635148593L, class_3612.class);
      field_3611.put(1836069985L, class_1735.class);
      field_3611.put(1633889587L, class_1735.class);
      field_3611.put(1700998451L, class_1735.class);
      field_3611.put(1685220723L, class_1735.class);
      field_3611.put(1935764850L, class_1735.class);
      field_3611.put(1935767394L, class_1735.class);
      field_3611.put(1936029283L, class_1735.class);
      field_3611.put(1936810864L, class_1735.class);
      field_3611.put(1936944502L, class_1735.class);
      field_3611.put(1701733217L, class_1735.class);
      field_3611.put(1836070003L, class_4937.class);
      field_3611.put(1835365492L, class_2357.class);
      field_3611.put(1835365496L, class_9692.class);
      field_3611.put(1920233504L, class_1218.class);
      field_3611.put(1717858336L, class_4928.class);
      field_3611.put(1702061171L, class_6507.class);
      field_3611.put(1681012275L, class_1202.class);
      field_3611.put(1635148611L, class_9171.class);
      field_3611.put(1684103987L, class_282.class);
      field_3611.put(1684366131L, class_8784.class);
      field_3611.put(1684106610L, class_4404.class);
      field_3611.put(1684371043L, class_8763.class);
      field_3611.put(1685152624L, class_3501.class);
      field_3611.put(1685286262L, class_5759.class);
      field_3611.put(1868849510L, class_9457.class);
      field_3611.put(1869112434L, class_8051.class);
      field_3611.put(1667459428L, class_7341.class);
      field_3611.put(1868850273L, class_500.class);
      field_3611.put(1668706933L, class_8414.class);
      field_3611.put(1868851301L, class_4329.class);
      field_3611.put(1868853869L, class_6926.class);
      field_3611.put(1768124021L, class_8414.class);
      field_3611.put(1768842869L, class_8414.class);
      field_3611.put(1819435893L, class_8414.class);
      field_3611.put(1835299433L, class_3912.class);
      field_3611.put(1868852077L, class_6926.class);
      field_3611.put(1868853858L, class_5615.class);
      field_3611.put(1868854388L, class_3217.class);
      field_3611.put(1970496882L, class_6855.class);
      field_3611.put(1851878757L, class_6855.class);
      field_3611.put(1801812256L, class_6855.class);
      field_3611.put(1769367926L, class_6855.class);
      field_3611.put(1886546294L, class_6855.class);
      field_3612.put(1835361135L, new String[]{"Additional Metadata Container Box"});
      field_3612.put(1684631142L, new String[]{"Data Information Box"});
      field_3612.put(1701082227L, new String[]{"Edit Box"});
      field_3612.put(1835297121L, new String[]{"Media Box"});
      field_3612.put(1835626086L, new String[]{"Media Information Box"});
      field_3612.put(1836019574L, new String[]{"Movie Box"});
      field_3612.put(1836475768L, new String[]{"Movie Extends Box"});
      field_3612.put(1836019558L, new String[]{"Movie Fragment Box"});
      field_3612.put(1835430497L, new String[]{"Movie Fragment Random Access Box"});
      field_3612.put(1852663908L, new String[]{"Null Media Header Box"});
      field_3612.put(1885431150L, new String[]{"Partition Entry"});
      field_3612.put(1936289382L, new String[]{"Protection Scheme Information Box"});
      field_3612.put(1937007212L, new String[]{"Sample Table Box"});
      field_3612.put(1935894633L, new String[]{"Scheme Information Box"});
      field_3612.put(1953653099L, new String[]{"Track Box"});
      field_3612.put(1953653094L, new String[]{"Track Fragment Box"});
      field_3612.put(1969517665L, new String[]{"User Data Box"});
      field_3612.put(1768715124L, new String[]{"iTunes Meta List Box"});
      field_3612.put(757935405L, new String[]{"Custom iTunes Metadata Box"});
      field_3612.put(1631670868L, new String[]{"Album Artist Name Box"});
      field_3612.put(1936679265L, new String[]{"Album Artist Sort Box"});
      field_3612.put(2841734242L, new String[]{"Album Name Box"});
      field_3612.put(1936679276L, new String[]{"Album Sort Box"});
      field_3612.put(2839630420L, new String[]{"Artist Name Box"});
      field_3612.put(1936679282L, new String[]{"Artist Sort Box"});
      field_3612.put(1667331175L, new String[]{"Category Box"});
      field_3612.put(2841865588L, new String[]{"Comments Box"});
      field_3612.put(1668311404L, new String[]{"Compilation Part Box"});
      field_3612.put(2843177588L, new String[]{"Composer Name Box"});
      field_3612.put(1936679791L, new String[]{"Composer Sort Box"});
      field_3612.put(1668249202L, new String[]{"Cover Box"});
      field_3612.put(2842125678L, new String[]{"Custom Genre Box"});
      field_3612.put(1684370275L, new String[]{"Description Cover Box"});
      field_3612.put(1684632427L, new String[]{"Disk Number Box"});
      field_3612.put(1701276004L, new String[]{"Episode Global Unique ID Box"});
      field_3612.put(1885823344L, new String[]{"Gapless Playback Box"});
      field_3612.put(2842129008L, new String[]{"Grouping Box"});
      field_3612.put(1751414372L, new String[]{"HD Video Box"});
      field_3612.put(1634748740L, new String[]{"iTunes Purchase Account Box"});
      field_3612.put(1634421060L, new String[]{"iTunes Account Type Box"});
      field_3612.put(1668172100L, new String[]{"iTunes Catalogue ID Box"});
      field_3612.put(1936083268L, new String[]{"iTunes Country Code Box"});
      field_3612.put(1801812343L, new String[]{"Keyword Box"});
      field_3612.put(1818518899L, new String[]{"Long Description Box"});
      field_3612.put(2842458482L, new String[]{"Lyrics Box"});
      field_3612.put(1937009003L, new String[]{"Meta Type Box"});
      field_3612.put(1885565812L, new String[]{"Podcast Box"});
      field_3612.put(1886745196L, new String[]{"Podcast URL Box"});
      field_3612.put(1886745188L, new String[]{"Purchase Date Box"});
      field_3612.put(2841928057L, new String[]{"Release Date Box"});
      field_3612.put(1953329263L, new String[]{"Tempo Box"});
      field_3612.put(2842583405L, new String[]{"Track Name Box"});
      field_3612.put(1953655662L, new String[]{"Track Number Box"});
      field_3612.put(1936682605L, new String[]{"Track Sort Box"});
      field_3612.put(1953916275L, new String[]{"TV Episode Box"});
      field_3612.put(1953916270L, new String[]{"TV Episode Number Box"});
      field_3612.put(1953918574L, new String[]{"TV Network Name Box"});
      field_3612.put(1953919854L, new String[]{"TV Season Box"});
      field_3612.put(1953919848L, new String[]{"TV Show Box"});
      field_3612.put(1936683886L, new String[]{"TV Show Sort Box"});
      field_3612.put(1635087464L, new String[]{"3GPP Author Box"});
      field_3612.put(1668051814L, new String[]{"3GPP Classification Box"});
      field_3612.put(1685283696L, new String[]{"3GPP Description Box"});
      field_3612.put(1885696614L, new String[]{"3GPP Performer Box"});
      field_3612.put(1953068140L, new String[]{"3GPP Title Box"});
      field_3612.put(1735616616L, new String[]{"Google Host Header Box"});
      field_3612.put(1735618669L, new String[]{"Google Ping Message Box"});
      field_3612.put(1735618677L, new String[]{"Google Ping URL Box"});
      field_3612.put(1735619428L, new String[]{"Google Source Data Box"});
      field_3612.put(1735619444L, new String[]{"Google Start Time Box"});
      field_3612.put(1735619684L, new String[]{"Google Track Duration Box"});
      field_3612.put(1836070006L, new String[]{"MPEG-4 Video Sample Entry"});
      field_3612.put(1932670515L, new String[]{"H263 Video Sample Entry"});
      field_3612.put(1701733238L, new String[]{"Encrypted Video Sample Entry"});
      field_3612.put(1635148593L, new String[]{"AVC Video Sample Entry"});
      field_3612.put(1836069985L, new String[]{"MPEG- 4Audio Sample Entry"});
      field_3612.put(1633889587L, new String[]{"AC-3 Audio Sample Entry"});
      field_3612.put(1700998451L, new String[]{"Extended AC-3 Audio Sample Entry"});
      field_3612.put(1685220723L, new String[]{"DRMS Audio Sample Entry"});
      field_3612.put(1935764850L, new String[]{"AMR Audio Sample Entry"});
      field_3612.put(1935767394L, new String[]{"AMR-Wideband Audio Sample Entry"});
      field_3612.put(1936029283L, new String[]{"EVC Audio Sample Entry"});
      field_3612.put(1936810864L, new String[]{"QCELP Audio Sample Entry"});
      field_3612.put(1936944502L, new String[]{"SMV Audio Sample Entry"});
      field_3612.put(1701733217L, new String[]{"Encrypted Audio Sample Entry"});
      field_3612.put(1668706933L, new String[]{"OMA DRM Cover URI Box"});
      field_3612.put(1868853869L, new String[]{"OMA DRM Container Box"});
      field_3612.put(1768124021L, new String[]{"OMA DRM Icon URI Box"});
      field_3612.put(1768842869L, new String[]{"OMA DRM Info URL Box"});
      field_3612.put(1819435893L, new String[]{"OMA DRM Lyrics URI Box"});
      field_3612.put(1835299433L, new String[]{"OMA DRM Mutable DRM Information Box"});
   }
}
