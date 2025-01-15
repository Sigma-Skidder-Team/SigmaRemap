// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

public class Class4144 implements Class4145
{
    private static final Logger field18268;
    private static final Map<Long, Class<? extends Class3736>> field18269;
    private static final Map<Long, Class<? extends Class3736>[]> field18270;
    private static final Map<Long, String[]> field18271;
    
    public static Class3746 method12377(final Class3746 class3746, final Class9131 class3747) throws IOException {
        final long method33145 = class3747.method33145();
        long n = class3747.method33137(4);
        final long method33146 = class3747.method33137(4);
        if (n == 1L) {
            n = class3747.method33137(8);
        }
        if (method33146 == 1970628964L) {
            class3747.method33144(16L);
        }
        if (class3746 != null && n > class3746.method11494() + class3746.method11493() - method33145) {
            throw new IOException("error while decoding box '" + method12380(method33146) + "' at offset " + method33145 + ": box too large for parent");
        }
        Logger.getLogger("MP4 Boxes").finest(method12380(method33146));
        final Class3736 method33147 = method12379(method33146, class3747.method33145());
        method33147.method11490(class3746, n, method33146, method33145);
        method33147.method11381(class3747);
        final Class<? extends Class3736> class3748 = method33147.getClass();
        if (class3748 == Class3736.class || class3748 == Class3703.class) {
            method33147.method11502(class3747);
        }
        final long l = method33147.method11494() + method33147.method11493() - class3747.method33145();
        Label_0245: {
            if (l > 0L) {
                if (!(method33147 instanceof Class3752)) {
                    if (!(method33147 instanceof Class3765)) {
                        if (!(method33147 instanceof Class3768)) {
                            Class4144.field18268.log(Level.INFO, "bytes left after reading box {0}: left: {1}, offset: {2}", new Object[] { method12380(method33146), l, class3747.method33145() });
                            break Label_0245;
                        }
                    }
                }
            }
            if (l < 0L) {
                Class4144.field18268.log(Level.SEVERE, "box {0} overread: {1} bytes, offset: {2}", new Object[] { method12380(method33146), -l, class3747.method33145() });
            }
        }
        if (method33147.method11492() != 1835295092L || class3747.method33148()) {
            class3747.method33144(l);
        }
        return method33147;
    }
    
    public static Class3746 method12378(final Class9131 class9131, final Class<? extends Class3736> clazz) throws IOException {
        final long method33145 = class9131.method33145();
        long n = class9131.method33137(4);
        final long method33146 = class9131.method33137(4);
        if (n == 1L) {
            n = class9131.method33137(8);
        }
        if (method33146 == 1970628964L) {
            class9131.method33144(16L);
        }
        Class3736 class9132 = null;
        try {
            class9132 = (Class3736)clazz.newInstance();
        }
        catch (final InstantiationException ex) {}
        catch (final IllegalAccessException ex2) {}
        if (class9132 != null) {
            class9132.method11490(null, n, method33146, method33145);
            class9132.method11381(class9131);
            class9131.method33144(class9132.method11494() + class9132.method11493() - class9131.method33145());
        }
        return class9132;
    }
    
    private static Class3736 method12379(final long l, final long i) {
        Class3736 class3736 = null;
        final Long value = l;
        if (Class4144.field18269.containsKey(value)) {
            final Class clazz = Class4144.field18269.get(value);
            if (Class4144.field18271.containsKey(value)) {
                final String[] array = Class4144.field18271.get(value);
                try {
                    class3736 = (Class3736)clazz.getConstructor(String.class).newInstance(array[0]);
                }
                catch (final Exception thrown) {
                    Class4144.field18268.log(Level.SEVERE, "BoxFactory: could not call constructor for " + method12380(l), thrown);
                    class3736 = new Class3765();
                }
            }
            else {
                try {
                    class3736 = (Class3736)clazz.newInstance();
                }
                catch (final Exception thrown2) {
                    Class4144.field18268.log(Level.SEVERE, "BoxFactory: could not instantiate box " + method12380(l), thrown2);
                }
            }
        }
        if (class3736 == null) {
            Class4144.field18268.log(Level.INFO, "BoxFactory: unknown box type: {0}; position: {1}", new Object[] { method12380(l), i });
            class3736 = new Class3765();
        }
        return class3736;
    }
    
    public static String method12380(final long n) {
        return new String(new byte[] { (byte)(n >> 24 & 0xFFL), (byte)(n >> 16 & 0xFFL), (byte)(n >> 8 & 0xFFL), (byte)(n & 0xFFL) });
    }
    
    static {
        field18268 = Logger.getLogger(Class4144.\uc3b9\u72db\u36cf\u486b\ubf74\u3ff0[3]);
        final Handler[] handlers = Class4144.field18268.getHandlers();
        for (int length = handlers.length, i = 0; i < length; ++i) {
            Class4144.field18268.removeHandler(handlers[i]);
        }
        Class4144.field18268.setLevel(Level.WARNING);
        final ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        Class4144.field18268.addHandler(handler);
        field18269 = new HashMap<Long, Class<? extends Class3736>>();
        field18270 = new HashMap<Long, Class<? extends Class3736>[]>();
        field18271 = new HashMap<Long, String[]>();
        Class4144.field18269.put(1835361135L, Class3736.class);
        Class4144.field18269.put(1634492771L, Class3781.class);
        Class4144.field18269.put(1652059500L, Class3727.class);
        Class4144.field18269.put(1651798644L, Class3751.class);
        Class4144.field18269.put(1667788908L, Class3731.class);
        Class4144.field18269.put(1937007471L, Class3813.class);
        Class4144.field18269.put(1668232756L, Class3813.class);
        Class4144.field18269.put(1668047216L, Class3762.class);
        Class4144.field18269.put(1937013298L, Class3815.class);
        Class4144.field18269.put(1668576371L, Class3804.class);
        Class4144.field18269.put(1668313716L, Class3734.class);
        Class4144.field18269.put(1970433568L, Class3818.class);
        Class4144.field18269.put(1970433056L, Class3784.class);
        Class4144.field18269.put(1684631142L, Class3736.class);
        Class4144.field18269.put(1685218662L, Class3798.class);
        Class4144.field18269.put(1937011827L, Class3721.class);
        Class4144.field18269.put(1937007728L, Class3713.class);
        Class4144.field18269.put(1701082227L, Class3736.class);
        Class4144.field18269.put(1701606260L, Class3735.class);
        Class4144.field18269.put(1718184302L, Class3705.class);
        Class4144.field18269.put(1936025458L, Class3814.class);
        Class4144.field18269.put(1717920626L, Class3717.class);
        Class4144.field18269.put(1718641010L, Class3714.class);
        Class4144.field18269.put(1718909296L, Class3766.class);
        Class4144.field18269.put(1718773093L, Class3768.class);
        Class4144.field18269.put(1734964334L, Class3802.class);
        Class4144.field18269.put(1751411826L, Class3775.class);
        Class4144.field18269.put(1752000612L, Class3723.class);
        Class4144.field18269.put(1768975715L, Class3716.class);
        Class4144.field18269.put(1768778086L, Class3720.class);
        Class4144.field18269.put(1768517222L, Class3772.class);
        Class4144.field18269.put(1768842853L, Class3728.class);
        Class4144.field18269.put(1768714083L, Class3790.class);
        Class4144.field18269.put(1768977007L, Class3817.class);
        Class4144.field18269.put(1835297121L, Class3736.class);
        Class4144.field18269.put(1835295092L, Class3752.class);
        Class4144.field18269.put(1835296868L, Class3725.class);
        Class4144.field18269.put(1835626086L, Class3736.class);
        Class4144.field18269.put(1835365473L, Class3792.class);
        Class4144.field18269.put(1835364965L, Class3719.class);
        Class4144.field18269.put(1836019574L, Class3736.class);
        Class4144.field18269.put(1836475768L, Class3736.class);
        Class4144.field18269.put(1835362404L, Class3793.class);
        Class4144.field18269.put(1836019558L, Class3736.class);
        Class4144.field18269.put(1835427940L, Class3710.class);
        Class4144.field18269.put(1835430497L, Class3736.class);
        Class4144.field18269.put(1835430511L, Class3711.class);
        Class4144.field18269.put(1836476516L, Class3715.class);
        Class4144.field18269.put(1952540531L, Class3764.class);
        Class4144.field18269.put(1852663908L, Class3703.class);
        Class4144.field18269.put(1718775137L, Class3769.class);
        Class4144.field18269.put(1885430882L, Class3785.class);
        Class4144.field18269.put(1885431150L, Class3736.class);
        Class4144.field18269.put(1885434736L, Class3763.class);
        Class4144.field18269.put(1885959277L, Class3783.class);
        Class4144.field18269.put(1885628782L, Class3702.class);
        Class4144.field18269.put(1936289382L, Class3736.class);
        Class4144.field18269.put(1935963248L, Class3786.class);
        Class4144.field18269.put(1937011556L, Class3773.class);
        Class4144.field18269.put(1936158820L, Class3718.class);
        Class4144.field18269.put(1937011564L, Class3811.class);
        Class4144.field18269.put(1937011578L, Class3815.class);
        Class4144.field18269.put(1937007212L, Class3736.class);
        Class4144.field18269.put(1937011555L, Class3791.class);
        Class4144.field18269.put(1935828848L, Class3709.class);
        Class4144.field18269.put(1935894637L, Class3774.class);
        Class4144.field18269.put(1935894633L, Class3736.class);
        Class4144.field18269.put(1937011560L, Class3707.class);
        Class4144.field18269.put(1936419184L, Class3768.class);
        Class4144.field18269.put(1936549988L, Class3788.class);
        Class4144.field18269.put(1937072755L, Class3797.class);
        Class4144.field18269.put(1937011571L, Class3789.class);
        Class4144.field18269.put(1953653099L, Class3736.class);
        Class4144.field18269.put(1953654136L, Class3730.class);
        Class4144.field18269.put(1953653094L, Class3736.class);
        Class4144.field18269.put(1952868452L, Class3810.class);
        Class4144.field18269.put(1952871009L, Class3799.class);
        Class4144.field18269.put(1953658222L, Class3704.class);
        Class4144.field18269.put(1953196132L, Class3706.class);
        Class4144.field18269.put(1953654118L, Class3767.class);
        Class4144.field18269.put(1953719660L, Class3779.class);
        Class4144.field18269.put(1969517665L, Class3736.class);
        Class4144.field18269.put(1986881636L, Class3782.class);
        Class4144.field18269.put(2003395685L, Class3768.class);
        Class4144.field18269.put(2020437024L, Class3796.class);
        Class4144.field18269.put(1768907891L, Class3816.class);
        Class4144.field18269.put(1935959408L, Class3812.class);
        Class4144.field18269.put(1768174386L, Class3800.class);
        Class4144.field18269.put(1768715124L, Class3736.class);
        Class4144.field18269.put(757935405L, Class3736.class);
        Class4144.field18269.put(1684108385L, Class3780.class);
        Class4144.field18269.put(1851878757L, Class3771.class);
        Class4144.field18269.put(1835360622L, Class3801.class);
        Class4144.field18269.put(1631670868L, Class3736.class);
        Class4144.field18269.put(1936679265L, Class3736.class);
        Class4144.field18269.put(2841734242L, Class3736.class);
        Class4144.field18269.put(1936679276L, Class3736.class);
        Class4144.field18269.put(2839630420L, Class3736.class);
        Class4144.field18269.put(1936679282L, Class3736.class);
        Class4144.field18269.put(1667331175L, Class3736.class);
        Class4144.field18269.put(2841865588L, Class3736.class);
        Class4144.field18269.put(1668311404L, Class3736.class);
        Class4144.field18269.put(2843177588L, Class3736.class);
        Class4144.field18269.put(1936679791L, Class3736.class);
        Class4144.field18269.put(1668249202L, Class3736.class);
        Class4144.field18269.put(2842125678L, Class3736.class);
        Class4144.field18269.put(1684370275L, Class3736.class);
        Class4144.field18269.put(1684632427L, Class3736.class);
        Class4144.field18269.put(2841996899L, Class3722.class);
        Class4144.field18269.put(2842980207L, Class3722.class);
        Class4144.field18269.put(1701276004L, Class3736.class);
        Class4144.field18269.put(1885823344L, Class3736.class);
        Class4144.field18269.put(1735291493L, Class3733.class);
        Class4144.field18269.put(2842129008L, Class3736.class);
        Class4144.field18269.put(1751414372L, Class3736.class);
        Class4144.field18269.put(1634748740L, Class3736.class);
        Class4144.field18269.put(1634421060L, Class3736.class);
        Class4144.field18269.put(1668172100L, Class3736.class);
        Class4144.field18269.put(1936083268L, Class3736.class);
        Class4144.field18269.put(1801812343L, Class3736.class);
        Class4144.field18269.put(1818518899L, Class3736.class);
        Class4144.field18269.put(2842458482L, Class3736.class);
        Class4144.field18269.put(1937009003L, Class3736.class);
        Class4144.field18269.put(1885565812L, Class3736.class);
        Class4144.field18269.put(1886745196L, Class3736.class);
        Class4144.field18269.put(1886745188L, Class3736.class);
        Class4144.field18269.put(1920233063L, Class3776.class);
        Class4144.field18269.put(2841928057L, Class3736.class);
        Class4144.field18269.put(2842846577L, Class3778.class);
        Class4144.field18269.put(1953329263L, Class3736.class);
        Class4144.field18269.put(2842583405L, Class3736.class);
        Class4144.field18269.put(1953655662L, Class3736.class);
        Class4144.field18269.put(1936682605L, Class3736.class);
        Class4144.field18269.put(1953916275L, Class3736.class);
        Class4144.field18269.put(1953916270L, Class3736.class);
        Class4144.field18269.put(1953918574L, Class3736.class);
        Class4144.field18269.put(1953919854L, Class3736.class);
        Class4144.field18269.put(1953919848L, Class3736.class);
        Class4144.field18269.put(1936683886L, Class3736.class);
        Class4144.field18269.put(1634493037L, Class3806.class);
        Class4144.field18269.put(1635087464L, Class3805.class);
        Class4144.field18269.put(1668051814L, Class3805.class);
        Class4144.field18269.put(1685283696L, Class3805.class);
        Class4144.field18269.put(1803122532L, Class3808.class);
        Class4144.field18269.put(1819239273L, Class3809.class);
        Class4144.field18269.put(1885696614L, Class3805.class);
        Class4144.field18269.put(2037543523L, Class3794.class);
        Class4144.field18269.put(1953068140L, Class3805.class);
        Class4144.field18269.put(1735616616L, Class3736.class);
        Class4144.field18269.put(1735618669L, Class3736.class);
        Class4144.field18269.put(1735618677L, Class3736.class);
        Class4144.field18269.put(1735619428L, Class3736.class);
        Class4144.field18269.put(1735619444L, Class3736.class);
        Class4144.field18269.put(1735619684L, Class3736.class);
        Class4144.field18269.put(1836070006L, Class3759.class);
        Class4144.field18269.put(1932670515L, Class3759.class);
        Class4144.field18269.put(1701733238L, Class3759.class);
        Class4144.field18269.put(1635148593L, Class3759.class);
        Class4144.field18269.put(1836069985L, Class3761.class);
        Class4144.field18269.put(1633889587L, Class3761.class);
        Class4144.field18269.put(1700998451L, Class3761.class);
        Class4144.field18269.put(1685220723L, Class3761.class);
        Class4144.field18269.put(1935764850L, Class3761.class);
        Class4144.field18269.put(1935767394L, Class3761.class);
        Class4144.field18269.put(1936029283L, Class3761.class);
        Class4144.field18269.put(1936810864L, Class3761.class);
        Class4144.field18269.put(1936944502L, Class3761.class);
        Class4144.field18269.put(1701733217L, Class3761.class);
        Class4144.field18269.put(1836070003L, Class3760.class);
        Class4144.field18269.put(1835365492L, Class3757.class);
        Class4144.field18269.put(1835365496L, Class3756.class);
        Class4144.field18269.put(1920233504L, Class3758.class);
        Class4144.field18269.put(1717858336L, Class3754.class);
        Class4144.field18269.put(1702061171L, Class3726.class);
        Class4144.field18269.put(1681012275L, Class3738.class);
        Class4144.field18269.put(1635148611L, Class3739.class);
        Class4144.field18269.put(1684103987L, Class3740.class);
        Class4144.field18269.put(1684366131L, Class3743.class);
        Class4144.field18269.put(1684106610L, Class3741.class);
        Class4144.field18269.put(1684371043L, Class3745.class);
        Class4144.field18269.put(1685152624L, Class3744.class);
        Class4144.field18269.put(1685286262L, Class3742.class);
        Class4144.field18269.put(1868849510L, Class3724.class);
        Class4144.field18269.put(1869112434L, Class3787.class);
        Class4144.field18269.put(1667459428L, Class3732.class);
        Class4144.field18269.put(1868850273L, Class3708.class);
        Class4144.field18269.put(1668706933L, Class3803.class);
        Class4144.field18269.put(1868851301L, Class3795.class);
        Class4144.field18269.put(1868853869L, Class3703.class);
        Class4144.field18269.put(1768124021L, Class3803.class);
        Class4144.field18269.put(1768842869L, Class3803.class);
        Class4144.field18269.put(1819435893L, Class3803.class);
        Class4144.field18269.put(1835299433L, Class3736.class);
        Class4144.field18269.put(1868852077L, Class3703.class);
        Class4144.field18269.put(1868853858L, Class3777.class);
        Class4144.field18269.put(1868854388L, Class3712.class);
        Class4144.field18269.put(1970496882L, Class3770.class);
        Class4144.field18269.put(1851878757L, Class3770.class);
        Class4144.field18269.put(1801812256L, Class3770.class);
        Class4144.field18269.put(1769367926L, Class3770.class);
        Class4144.field18269.put(1886546294L, Class3770.class);
        Class4144.field18271.put(1835361135L, new String[] { "Additional Metadata Container Box" });
        Class4144.field18271.put(1684631142L, new String[] { "Data Information Box" });
        Class4144.field18271.put(1701082227L, new String[] { "Edit Box" });
        Class4144.field18271.put(1835297121L, new String[] { "Media Box" });
        Class4144.field18271.put(1835626086L, new String[] { "Media Information Box" });
        Class4144.field18271.put(1836019574L, new String[] { "Movie Box" });
        Class4144.field18271.put(1836475768L, new String[] { "Movie Extends Box" });
        Class4144.field18271.put(1836019558L, new String[] { "Movie Fragment Box" });
        Class4144.field18271.put(1835430497L, new String[] { "Movie Fragment Random Access Box" });
        Class4144.field18271.put(1852663908L, new String[] { "Null Media Header Box" });
        Class4144.field18271.put(1885431150L, new String[] { "Partition Entry" });
        Class4144.field18271.put(1936289382L, new String[] { "Protection Scheme Information Box" });
        Class4144.field18271.put(1937007212L, new String[] { "Sample Table Box" });
        Class4144.field18271.put(1935894633L, new String[] { "Scheme Information Box" });
        Class4144.field18271.put(1953653099L, new String[] { "Track Box" });
        Class4144.field18271.put(1953653094L, new String[] { "Track Fragment Box" });
        Class4144.field18271.put(1969517665L, new String[] { "User Data Box" });
        Class4144.field18271.put(1768715124L, new String[] { "iTunes Meta List Box" });
        Class4144.field18271.put(757935405L, new String[] { "Custom iTunes Metadata Box" });
        Class4144.field18271.put(1631670868L, new String[] { "Album Artist Name Box" });
        Class4144.field18271.put(1936679265L, new String[] { "Album Artist Sort Box" });
        Class4144.field18271.put(2841734242L, new String[] { "Album Name Box" });
        Class4144.field18271.put(1936679276L, new String[] { "Album Sort Box" });
        Class4144.field18271.put(2839630420L, new String[] { "Artist Name Box" });
        Class4144.field18271.put(1936679282L, new String[] { "Artist Sort Box" });
        Class4144.field18271.put(1667331175L, new String[] { "Category Box" });
        Class4144.field18271.put(2841865588L, new String[] { "Comments Box" });
        Class4144.field18271.put(1668311404L, new String[] { "Compilation Part Box" });
        Class4144.field18271.put(2843177588L, new String[] { "Composer Name Box" });
        Class4144.field18271.put(1936679791L, new String[] { "Composer Sort Box" });
        Class4144.field18271.put(1668249202L, new String[] { "Cover Box" });
        Class4144.field18271.put(2842125678L, new String[] { "Custom Genre Box" });
        Class4144.field18271.put(1684370275L, new String[] { "Description Cover Box" });
        Class4144.field18271.put(1684632427L, new String[] { "Disk Number Box" });
        Class4144.field18271.put(1701276004L, new String[] { "Episode Global Unique ID Box" });
        Class4144.field18271.put(1885823344L, new String[] { "Gapless Playback Box" });
        Class4144.field18271.put(2842129008L, new String[] { "Grouping Box" });
        Class4144.field18271.put(1751414372L, new String[] { "HD Video Box" });
        Class4144.field18271.put(1634748740L, new String[] { "iTunes Purchase Account Box" });
        Class4144.field18271.put(1634421060L, new String[] { "iTunes Account Type Box" });
        Class4144.field18271.put(1668172100L, new String[] { "iTunes Catalogue ID Box" });
        Class4144.field18271.put(1936083268L, new String[] { "iTunes Country Code Box" });
        Class4144.field18271.put(1801812343L, new String[] { "Keyword Box" });
        Class4144.field18271.put(1818518899L, new String[] { "Long Description Box" });
        Class4144.field18271.put(2842458482L, new String[] { "Lyrics Box" });
        Class4144.field18271.put(1937009003L, new String[] { "Meta Type Box" });
        Class4144.field18271.put(1885565812L, new String[] { "Podcast Box" });
        Class4144.field18271.put(1886745196L, new String[] { "Podcast URL Box" });
        Class4144.field18271.put(1886745188L, new String[] { "Purchase Date Box" });
        Class4144.field18271.put(2841928057L, new String[] { "Release Date Box" });
        Class4144.field18271.put(1953329263L, new String[] { "Tempo Box" });
        Class4144.field18271.put(2842583405L, new String[] { "Track Name Box" });
        Class4144.field18271.put(1953655662L, new String[] { "Track Number Box" });
        Class4144.field18271.put(1936682605L, new String[] { "Track Sort Box" });
        Class4144.field18271.put(1953916275L, new String[] { "TV Episode Box" });
        Class4144.field18271.put(1953916270L, new String[] { "TV Episode Number Box" });
        Class4144.field18271.put(1953918574L, new String[] { "TV Network Name Box" });
        Class4144.field18271.put(1953919854L, new String[] { "TV Season Box" });
        Class4144.field18271.put(1953919848L, new String[] { "TV Show Box" });
        Class4144.field18271.put(1936683886L, new String[] { "TV Show Sort Box" });
        Class4144.field18271.put(1635087464L, new String[] { "3GPP Author Box" });
        Class4144.field18271.put(1668051814L, new String[] { "3GPP Classification Box" });
        Class4144.field18271.put(1685283696L, new String[] { "3GPP Description Box" });
        Class4144.field18271.put(1885696614L, new String[] { "3GPP Performer Box" });
        Class4144.field18271.put(1953068140L, new String[] { "3GPP Title Box" });
        Class4144.field18271.put(1735616616L, new String[] { "Google Host Header Box" });
        Class4144.field18271.put(1735618669L, new String[] { "Google Ping Message Box" });
        Class4144.field18271.put(1735618677L, new String[] { "Google Ping URL Box" });
        Class4144.field18271.put(1735619428L, new String[] { "Google Source Data Box" });
        Class4144.field18271.put(1735619444L, new String[] { "Google Start Time Box" });
        Class4144.field18271.put(1735619684L, new String[] { "Google Track Duration Box" });
        Class4144.field18271.put(1836070006L, new String[] { "MPEG-4 Video Sample Entry" });
        Class4144.field18271.put(1932670515L, new String[] { "H263 Video Sample Entry" });
        Class4144.field18271.put(1701733238L, new String[] { "Encrypted Video Sample Entry" });
        Class4144.field18271.put(1635148593L, new String[] { "AVC Video Sample Entry" });
        Class4144.field18271.put(1836069985L, new String[] { "MPEG- 4Audio Sample Entry" });
        Class4144.field18271.put(1633889587L, new String[] { "AC-3 Audio Sample Entry" });
        Class4144.field18271.put(1700998451L, new String[] { "Extended AC-3 Audio Sample Entry" });
        Class4144.field18271.put(1685220723L, new String[] { "DRMS Audio Sample Entry" });
        Class4144.field18271.put(1935764850L, new String[] { "AMR Audio Sample Entry" });
        Class4144.field18271.put(1935767394L, new String[] { "AMR-Wideband Audio Sample Entry" });
        Class4144.field18271.put(1936029283L, new String[] { "EVC Audio Sample Entry" });
        Class4144.field18271.put(1936810864L, new String[] { "QCELP Audio Sample Entry" });
        Class4144.field18271.put(1936944502L, new String[] { "SMV Audio Sample Entry" });
        Class4144.field18271.put(1701733217L, new String[] { "Encrypted Audio Sample Entry" });
        Class4144.field18271.put(1668706933L, new String[] { "OMA DRM Cover URI Box" });
        Class4144.field18271.put(1868853869L, new String[] { "OMA DRM Container Box" });
        Class4144.field18271.put(1768124021L, new String[] { "OMA DRM Icon URI Box" });
        Class4144.field18271.put(1768842869L, new String[] { "OMA DRM Info URL Box" });
        Class4144.field18271.put(1819435893L, new String[] { "OMA DRM Lyrics URI Box" });
        Class4144.field18271.put(1835299433L, new String[] { "OMA DRM Mutable DRM Information Box" });
    }
}
