package mapped;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class6412 implements Class6413 {
   private static final Logger field28039 = Logger.getLogger("BoxFactory");
   private static final Map<Long, Class<? extends Class5041>> field28040;
   private static final Map<Long, Class<? extends Class5041>[]> field28041;
   private static final Map<Long, String[]> field28042;

   public static Class5066 method19535(Class5066 var0, Class8827 var1) throws IOException {
      long var4 = var1.method31871();
      long var6 = var1.method31863(4);
      long var8 = var1.method31863(4);
      if (var6 == 1L) {
         var6 = var1.method31863(8);
      }

      if (var8 == 1970628964L) {
         var1.method31870(16L);
      }

      if (var0 != null) {
         long var12 = var0.method15433() + var0.method15432() - var4;
         if (var6 > var12) {
            throw new IOException(" error while decodingbox '" + method19538(var8) + "' at offset " + var4 + ": box too large for parent");
         }
      }

      Logger.getLogger("MP4 Boxes").finest(method19538(var8));
      Class5041 var10 = method19537(var8, var1.method31871());
      var10.method15429(var0, var6, var8, var4);
      var10.method15262(var1);
      Class var11 = var10.getClass();
      if (var11 == Class5041.class || var11 == Class4975.class) {
         var10.method15441(var1);
      }

      long var14 = var10.method15433() + var10.method15432() - var1.method31871();
      if (var14 > 0L && !(var10 instanceof Class5068) && !(var10 instanceof Class5045) && !(var10 instanceof Class5069)) {
         field28039.log(Level.INFO, "bytes left after reading box {0}: left: {1}, offset: {2}", new Object[]{method19538(var8), var14, var1.method31871()});
      } else if (var14 < 0L) {
         field28039.log(Level.SEVERE, "box {0} overread: {1} bytes, offset: {2}", new Object[]{method19538(var8), -var14, var1.method31871()});
      }

      if (var10.method15431() != 1835295092L || var1.method31874()) {
         var1.method31870(var14);
      }

      return var10;
   }

   public static Class5066 method19536(Class8827 var0, Class<? extends Class5041> var1) throws IOException {
      long var4 = var0.method31871();
      long var6 = var0.method31863(4);
      long var8 = var0.method31863(4);
      if (var6 == 1L) {
         var6 = var0.method31863(8);
      }

      if (var8 == 1970628964L) {
         var0.method31870(16L);
      }

      Class5041 var10 = null;

      try {
         var10 = (Class5041)var1.newInstance();
      } catch (InstantiationException var14) {
      } catch (IllegalAccessException var15) {
      }

      if (var10 != null) {
         var10.method15429(null, var6, var8, var4);
         var10.method15262(var0);
         long var12 = var10.method15433() + var10.method15432() - var0.method31871();
         var0.method31870(var12);
      }

      return var10;
   }

   private static Class5041 method19537(long var0, long var2) {
      Object var6 = null;
      Long var7 = var0;
      if (field28040.containsKey(var7)) {
         Class var8 = field28040.get(var7);
         if (field28042.containsKey(var7)) {
            String[] var9 = field28042.get(var7);

            try {
               Constructor var10 = var8.getConstructor(String.class);
               var6 = (Class5041)var10.newInstance(var9[0]);
            } catch (Exception var12) {
               field28039.log(Level.SEVERE, "BoxFactory: could not call constructor for " + method19538(var0), (Throwable)var12);
               var6 = new Class5045();
            }
         } else {
            try {
               var6 = (Class5041)var8.newInstance();
            } catch (Exception var11) {
               field28039.log(Level.SEVERE, "BoxFactory: could not instantiate box " + method19538(var0), (Throwable)var11);
            }
         }
      }

      if (var6 == null) {
         field28039.log(Level.INFO, "BoxFactory: unknown box type: {0}; position: {1}", new Object[]{method19538(var0), var2});
         var6 = new Class5045();
      }

      return (Class5041)var6;
   }

   public static String method19538(long var0) {
      byte[] var4 = new byte[]{(byte)((int)(var0 >> 24 & 255L)), (byte)((int)(var0 >> 16 & 255L)), (byte)((int)(var0 >> 8 & 255L)), (byte)((int)(var0 & 255L))};
      return new String(var4);
   }

   static {
      for (Handler var9 : field28039.getHandlers()) {
         field28039.removeHandler(var9);
      }

      field28039.setLevel(Level.WARNING);
      ConsoleHandler var10 = new ConsoleHandler();
      var10.setLevel(Level.ALL);
      field28039.addHandler(var10);
      field28040 = new HashMap<Long, Class<? extends Class5041>>();
      field28041 = new HashMap<Long, Class<? extends Class5041>[]>();
      field28042 = new HashMap<Long, String[]>();
      field28040.put(1835361135L, Class5041.class);
      field28040.put(1634492771L, Class4987.class);
      field28040.put(1652059500L, Class5039.class);
      field28040.put(1651798644L, Class5043.class);
      field28040.put(1667788908L, Class5010.class);
      field28040.put(1937007471L, Class5012.class);
      field28040.put(1668232756L, Class5012.class);
      field28040.put(1668047216L, Class5071.class);
      field28040.put(1937013298L, Class4996.class);
      field28040.put(1668576371L, Class4990.class);
      field28040.put(1668313716L, Class5017.class);
      field28040.put(1970433568L, Class5003.class);
      field28040.put(1970433056L, Class4999.class);
      field28040.put(1684631142L, Class5041.class);
      field28040.put(1685218662L, Class5029.class);
      field28040.put(1937011827L, Class5018.class);
      field28040.put(1937007728L, Class5030.class);
      field28040.put(1701082227L, Class5041.class);
      field28040.put(1701606260L, Class4981.class);
      field28040.put(1718184302L, Class4976.class);
      field28040.put(1936025458L, Class4979.class);
      field28040.put(1717920626L, Class5031.class);
      field28040.put(1718641010L, Class4977.class);
      field28040.put(1718909296L, Class5070.class);
      field28040.put(1718773093L, Class5069.class);
      field28040.put(1734964334L, Class4984.class);
      field28040.put(1751411826L, Class5007.class);
      field28040.put(1752000612L, Class4991.class);
      field28040.put(1768975715L, Class4983.class);
      field28040.put(1768778086L, Class5002.class);
      field28040.put(1768517222L, Class4998.class);
      field28040.put(1768842853L, Class5081.class);
      field28040.put(1768714083L, Class4986.class);
      field28040.put(1768977007L, Class5022.class);
      field28040.put(1835297121L, Class5041.class);
      field28040.put(1835295092L, Class5068.class);
      field28040.put(1835296868L, Class5035.class);
      field28040.put(1835626086L, Class5041.class);
      field28040.put(1835365473L, Class5004.class);
      field28040.put(1835364965L, Class5087.class);
      field28040.put(1836019574L, Class5041.class);
      field28040.put(1836475768L, Class5041.class);
      field28040.put(1835362404L, Class5077.class);
      field28040.put(1836019558L, Class5041.class);
      field28040.put(1835427940L, Class5000.class);
      field28040.put(1835430497L, Class5041.class);
      field28040.put(1835430511L, Class5021.class);
      field28040.put(1836476516L, Class5078.class);
      field28040.put(1952540531L, Class5044.class);
      field28040.put(1852663908L, Class4975.class);
      field28040.put(1718775137L, Class5067.class);
      field28040.put(1885430882L, Class4992.class);
      field28040.put(1885431150L, Class5041.class);
      field28040.put(1885434736L, Class5055.class);
      field28040.put(1885959277L, Class5083.class);
      field28040.put(1885628782L, Class5006.class);
      field28040.put(1936289382L, Class5041.class);
      field28040.put(1935963248L, Class4985.class);
      field28040.put(1937011556L, Class5001.class);
      field28040.put(1936158820L, Class5015.class);
      field28040.put(1937011564L, Class5076.class);
      field28040.put(1937011578L, Class4996.class);
      field28040.put(1937007212L, Class5041.class);
      field28040.put(1937011555L, Class5013.class);
      field28040.put(1935828848L, Class5085.class);
      field28040.put(1935894637L, Class4988.class);
      field28040.put(1935894633L, Class5041.class);
      field28040.put(1937011560L, Class5080.class);
      field28040.put(1936419184L, Class5069.class);
      field28040.put(1936549988L, Class5040.class);
      field28040.put(1937072755L, Class5034.class);
      field28040.put(1937011571L, Class4980.class);
      field28040.put(1953653099L, Class5041.class);
      field28040.put(1953654136L, Class5037.class);
      field28040.put(1953653094L, Class5041.class);
      field28040.put(1952868452L, Class5088.class);
      field28040.put(1952871009L, Class4989.class);
      field28040.put(1953658222L, Class4994.class);
      field28040.put(1953196132L, Class5089.class);
      field28040.put(1953654118L, Class5065.class);
      field28040.put(1953719660L, Class5090.class);
      field28040.put(1969517665L, Class5041.class);
      field28040.put(1986881636L, Class5036.class);
      field28040.put(2003395685L, Class5069.class);
      field28040.put(2020437024L, Class5008.class);
      field28040.put(1768907891L, Class5005.class);
      field28040.put(1935959408L, Class5033.class);
      field28040.put(1768174386L, Class5079.class);
      field28040.put(1768715124L, Class5041.class);
      field28040.put(757935405L, Class5041.class);
      field28040.put(1684108385L, Class4982.class);
      field28040.put(1851878757L, Class5020.class);
      field28040.put(1835360622L, Class5014.class);
      field28040.put(1631670868L, Class5041.class);
      field28040.put(1936679265L, Class5041.class);
      field28040.put(2841734242L, Class5041.class);
      field28040.put(1936679276L, Class5041.class);
      field28040.put(2839630420L, Class5041.class);
      field28040.put(1936679282L, Class5041.class);
      field28040.put(1667331175L, Class5041.class);
      field28040.put(2841865588L, Class5041.class);
      field28040.put(1668311404L, Class5041.class);
      field28040.put(2843177588L, Class5041.class);
      field28040.put(1936679791L, Class5041.class);
      field28040.put(1668249202L, Class5041.class);
      field28040.put(2842125678L, Class5041.class);
      field28040.put(1684370275L, Class5041.class);
      field28040.put(1684632427L, Class5041.class);
      field28040.put(2841996899L, Class5082.class);
      field28040.put(2842980207L, Class5082.class);
      field28040.put(1701276004L, Class5041.class);
      field28040.put(1885823344L, Class5041.class);
      field28040.put(1735291493L, Class4978.class);
      field28040.put(2842129008L, Class5041.class);
      field28040.put(1751414372L, Class5041.class);
      field28040.put(1634748740L, Class5041.class);
      field28040.put(1634421060L, Class5041.class);
      field28040.put(1668172100L, Class5041.class);
      field28040.put(1936083268L, Class5041.class);
      field28040.put(1801812343L, Class5041.class);
      field28040.put(1818518899L, Class5041.class);
      field28040.put(2842458482L, Class5041.class);
      field28040.put(1937009003L, Class5041.class);
      field28040.put(1885565812L, Class5041.class);
      field28040.put(1886745196L, Class5041.class);
      field28040.put(1886745188L, Class5041.class);
      field28040.put(1920233063L, Class5019.class);
      field28040.put(2841928057L, Class5041.class);
      field28040.put(2842846577L, Class4995.class);
      field28040.put(1953329263L, Class5041.class);
      field28040.put(2842583405L, Class5041.class);
      field28040.put(1953655662L, Class5041.class);
      field28040.put(1936682605L, Class5041.class);
      field28040.put(1953916275L, Class5041.class);
      field28040.put(1953916270L, Class5041.class);
      field28040.put(1953918574L, Class5041.class);
      field28040.put(1953919854L, Class5041.class);
      field28040.put(1953919848L, Class5041.class);
      field28040.put(1936683886L, Class5041.class);
      field28040.put(1634493037L, Class5025.class);
      field28040.put(1635087464L, Class5023.class);
      field28040.put(1668051814L, Class5023.class);
      field28040.put(1685283696L, Class5023.class);
      field28040.put(1803122532L, Class5027.class);
      field28040.put(1819239273L, Class5026.class);
      field28040.put(1885696614L, Class5023.class);
      field28040.put(2037543523L, Class5084.class);
      field28040.put(1953068140L, Class5023.class);
      field28040.put(1735616616L, Class5041.class);
      field28040.put(1735618669L, Class5041.class);
      field28040.put(1735618677L, Class5041.class);
      field28040.put(1735619428L, Class5041.class);
      field28040.put(1735619444L, Class5041.class);
      field28040.put(1735619684L, Class5041.class);
      field28040.put(1836070006L, Class5053.class);
      field28040.put(1932670515L, Class5053.class);
      field28040.put(1701733238L, Class5053.class);
      field28040.put(1635148593L, Class5053.class);
      field28040.put(1836069985L, Class5047.class);
      field28040.put(1633889587L, Class5047.class);
      field28040.put(1700998451L, Class5047.class);
      field28040.put(1685220723L, Class5047.class);
      field28040.put(1935764850L, Class5047.class);
      field28040.put(1935767394L, Class5047.class);
      field28040.put(1936029283L, Class5047.class);
      field28040.put(1936810864L, Class5047.class);
      field28040.put(1936944502L, Class5047.class);
      field28040.put(1701733217L, Class5047.class);
      field28040.put(1836070003L, Class5048.class);
      field28040.put(1835365492L, Class5052.class);
      field28040.put(1835365496L, Class5051.class);
      field28040.put(1920233504L, Class5049.class);
      field28040.put(1717858336L, Class5054.class);
      field28040.put(1702061171L, Class5086.class);
      field28040.put(1681012275L, Class5058.class);
      field28040.put(1635148611L, Class5060.class);
      field28040.put(1684103987L, Class5064.class);
      field28040.put(1684366131L, Class5063.class);
      field28040.put(1684106610L, Class5061.class);
      field28040.put(1684371043L, Class5059.class);
      field28040.put(1685152624L, Class5062.class);
      field28040.put(1685286262L, Class5057.class);
      field28040.put(1868849510L, Class5009.class);
      field28040.put(1869112434L, Class4997.class);
      field28040.put(1667459428L, Class5028.class);
      field28040.put(1868850273L, Class5038.class);
      field28040.put(1668706933L, Class4993.class);
      field28040.put(1868851301L, Class5016.class);
      field28040.put(1868853869L, Class4975.class);
      field28040.put(1768124021L, Class4993.class);
      field28040.put(1768842869L, Class4993.class);
      field28040.put(1819435893L, Class4993.class);
      field28040.put(1835299433L, Class5041.class);
      field28040.put(1868852077L, Class4975.class);
      field28040.put(1868853858L, Class5032.class);
      field28040.put(1868854388L, Class5011.class);
      field28040.put(1970496882L, Class5042.class);
      field28040.put(1851878757L, Class5042.class);
      field28040.put(1801812256L, Class5042.class);
      field28040.put(1769367926L, Class5042.class);
      field28040.put(1886546294L, Class5042.class);
      field28042.put(1835361135L, new String[]{"Additional Metadata Container Box"});
      field28042.put(1684631142L, new String[]{"Data Information Box"});
      field28042.put(1701082227L, new String[]{"Edit Box"});
      field28042.put(1835297121L, new String[]{"Media Box"});
      field28042.put(1835626086L, new String[]{"Media Information Box"});
      field28042.put(1836019574L, new String[]{"Movie Box"});
      field28042.put(1836475768L, new String[]{"Movie Extends Box"});
      field28042.put(1836019558L, new String[]{"Movie Fragment Box"});
      field28042.put(1835430497L, new String[]{"Movie Fragment Random Access Box"});
      field28042.put(1852663908L, new String[]{"Null Media Header Box"});
      field28042.put(1885431150L, new String[]{"Partition Entry"});
      field28042.put(1936289382L, new String[]{"Protection Scheme Information Box"});
      field28042.put(1937007212L, new String[]{"Sample Table Box"});
      field28042.put(1935894633L, new String[]{"Scheme Information Box"});
      field28042.put(1953653099L, new String[]{"Track Box"});
      field28042.put(1953653094L, new String[]{"Track Fragment Box"});
      field28042.put(1969517665L, new String[]{"ChatCommandExecutor Data Box"});
      field28042.put(1768715124L, new String[]{"iTunes Meta List Box"});
      field28042.put(757935405L, new String[]{"Custom iTunes Metadata Box"});
      field28042.put(1631670868L, new String[]{"Album Artist Name Box"});
      field28042.put(1936679265L, new String[]{"Album Artist Sort Box"});
      field28042.put(2841734242L, new String[]{"Album Name Box"});
      field28042.put(1936679276L, new String[]{"Album Sort Box"});
      field28042.put(2839630420L, new String[]{"Artist Name Box"});
      field28042.put(1936679282L, new String[]{"Artist Sort Box"});
      field28042.put(1667331175L, new String[]{"Category Box"});
      field28042.put(2841865588L, new String[]{"Comments Box"});
      field28042.put(1668311404L, new String[]{"Compilation Part Box"});
      field28042.put(2843177588L, new String[]{"Composer Name Box"});
      field28042.put(1936679791L, new String[]{"Composer Sort Box"});
      field28042.put(1668249202L, new String[]{"Cover Box"});
      field28042.put(2842125678L, new String[]{"Custom Genre Box"});
      field28042.put(1684370275L, new String[]{"Description Cover Box"});
      field28042.put(1684632427L, new String[]{"Disk Number Box"});
      field28042.put(1701276004L, new String[]{"Episode Global Unique ID Box"});
      field28042.put(1885823344L, new String[]{"Gapless Playback Box"});
      field28042.put(2842129008L, new String[]{"Grouping Box"});
      field28042.put(1751414372L, new String[]{"HD Video Box"});
      field28042.put(1634748740L, new String[]{"iTunes Purchase Account Box"});
      field28042.put(1634421060L, new String[]{"iTunes Account Type Box"});
      field28042.put(1668172100L, new String[]{"iTunes Catalogue ID Box"});
      field28042.put(1936083268L, new String[]{"iTunes Country Code Box"});
      field28042.put(1801812343L, new String[]{"Keyword Box"});
      field28042.put(1818518899L, new String[]{"Long Description Box"});
      field28042.put(2842458482L, new String[]{"Lyrics Box"});
      field28042.put(1937009003L, new String[]{"Meta Type Box"});
      field28042.put(1885565812L, new String[]{"Podcast Box"});
      field28042.put(1886745196L, new String[]{"Podcast URL Box"});
      field28042.put(1886745188L, new String[]{"Purchase Date Box"});
      field28042.put(2841928057L, new String[]{"Release Date Box"});
      field28042.put(1953329263L, new String[]{"Tempo Box"});
      field28042.put(2842583405L, new String[]{"Track Name Box"});
      field28042.put(1953655662L, new String[]{"Track Number Box"});
      field28042.put(1936682605L, new String[]{"Track Sort Box"});
      field28042.put(1953916275L, new String[]{"TV Episode Box"});
      field28042.put(1953916270L, new String[]{"TV Episode Number Box"});
      field28042.put(1953918574L, new String[]{"TV Network Name Box"});
      field28042.put(1953919854L, new String[]{"TV Season Box"});
      field28042.put(1953919848L, new String[]{"TV Show Box"});
      field28042.put(1936683886L, new String[]{"TV Show Sort Box"});
      field28042.put(1635087464L, new String[]{"3GPP Author Box"});
      field28042.put(1668051814L, new String[]{"3GPP Classification Box"});
      field28042.put(1685283696L, new String[]{"3GPP Description Box"});
      field28042.put(1885696614L, new String[]{"3GPP Performer Box"});
      field28042.put(1953068140L, new String[]{"3GPP Title Box"});
      field28042.put(1735616616L, new String[]{"Google Host Header Box"});
      field28042.put(1735618669L, new String[]{"Google Ping Message Box"});
      field28042.put(1735618677L, new String[]{"Google Ping URL Box"});
      field28042.put(1735619428L, new String[]{"Google Source Data Box"});
      field28042.put(1735619444L, new String[]{"Google Start Time Box"});
      field28042.put(1735619684L, new String[]{"Google Track Duration Box"});
      field28042.put(1836070006L, new String[]{"MPEG-4 Video Sample Entry"});
      field28042.put(1932670515L, new String[]{"H263 Video Sample Entry"});
      field28042.put(1701733238L, new String[]{"Encrypted Video Sample Entry"});
      field28042.put(1635148593L, new String[]{"AVC Video Sample Entry"});
      field28042.put(1836069985L, new String[]{"MPEG- 4Audio Sample Entry"});
      field28042.put(1633889587L, new String[]{"AC-3 Audio Sample Entry"});
      field28042.put(1700998451L, new String[]{"Extended AC-3 Audio Sample Entry"});
      field28042.put(1685220723L, new String[]{"DRMS Audio Sample Entry"});
      field28042.put(1935764850L, new String[]{"AMR Audio Sample Entry"});
      field28042.put(1935767394L, new String[]{"AMR-Wideband Audio Sample Entry"});
      field28042.put(1936029283L, new String[]{"EVC Audio Sample Entry"});
      field28042.put(1936810864L, new String[]{"QCELP Audio Sample Entry"});
      field28042.put(1936944502L, new String[]{"SMV Audio Sample Entry"});
      field28042.put(1701733217L, new String[]{"Encrypted Audio Sample Entry"});
      field28042.put(1668706933L, new String[]{"OMA DRM Cover URI Box"});
      field28042.put(1868853869L, new String[]{"OMA DRM Container Box"});
      field28042.put(1768124021L, new String[]{"OMA DRM Icon URI Box"});
      field28042.put(1768842869L, new String[]{"OMA DRM Info URL Box"});
      field28042.put(1819435893L, new String[]{"OMA DRM Lyrics URI Box"});
      field28042.put(1835299433L, new String[]{"OMA DRM Mutable DRM Information Box"});
   }
}
