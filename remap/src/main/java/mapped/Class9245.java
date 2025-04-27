// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Calendar;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;

public class Class9245
{
    private static final String[] field39652;
    private static final String[] field39653;
    private final Map<Class7017<?>, Object> field39654;
    
    public Class9245() {
        this.field39654 = new HashMap<Class7017<?>, Object>();
    }
    
    public void method34086(final Class3746 class3746, final Class3746 class3747) {
        if (class3747.method11498(1668313716L)) {
            final Class3734 class3748 = (Class3734)class3747.method11499(1668313716L);
            this.method34091(Class7017.field27395, new Locale(class3748.method11485()));
            this.method34091(Class7017.field27372, class3748.method11486());
        }
        if (class3746 != null) {
            this.method34087(class3746);
        }
        if (class3747.method11498(1768174386L)) {
            this.method34089((Class3800)class3747.method11499(1768174386L));
        }
        if (class3747.method11498(1768715124L)) {
            this.method34088(class3747.method11499(1768715124L));
        }
        if (class3747.method11498(1952540531L)) {
            this.method34090((Class3764)class3747.method11499(1952540531L));
        }
    }
    
    private void method34087(final Class3746 class3746) {
        if (class3746.method11498(1634493037L)) {
            final Class3806 class3747 = (Class3806)class3746.method11499(1634493037L);
            this.method34091(Class7017.field27358, class3747.method11654());
            this.method34091(Class7017.field27359, class3747.method11655());
        }
        if (class3746.method11498(1685283696L)) {
            this.method34091(Class7017.field27385, ((Class3805)class3746.method11499(1685283696L)).method11654());
        }
        if (class3746.method11498(1803122532L)) {
            this.method34091(Class7017.field27383, ((Class3805)class3746.method11499(1803122532L)).method11654());
        }
        if (class3746.method11498(1819239273L)) {
            this.method34091(Class7017.field27377, ((Class3809)class3746.method11499(1819239273L)).method11659());
        }
        if (class3746.method11498(1885696614L)) {
            this.method34091(Class7017.field27355, ((Class3805)class3746.method11499(1885696614L)).method11654());
        }
        if (class3746.method11498(2037543523L)) {
            final String method11654 = ((Class3805)class3746.method11499(2037543523L)).method11654();
            try {
                this.method34091(Class7017.field27367, new Date(Integer.parseInt(method11654)));
            }
            catch (final NumberFormatException ex) {
                Logger.getLogger("MP4 API").log(Level.INFO, "unable to parse 3GPP metadata: recording year value: {0}", method11654);
            }
        }
        if (class3746.method11498(1953068140L)) {
            this.method34091(Class7017.field27356, ((Class3805)class3746.method11499(1953068140L)).method11654());
        }
    }
    
    private void method34088(final Class3746 class3746) {
        for (final Class3746 class3747 : class3746.method11500()) {
            final long method11492 = class3747.method11492();
            final Class3780 class3748 = (Class3780)class3747.method11499(1684108385L);
            if (method11492 != 2839630420L) {
                if (method11492 != 2842583405L) {
                    if (method11492 != 1631670868L) {
                        if (method11492 != 2841734242L) {
                            if (method11492 != 1953655662L) {
                                if (method11492 != 1684632427L) {
                                    if (method11492 != 2843177588L) {
                                        if (method11492 != 2841865588L) {
                                            if (method11492 != 1953329263L) {
                                                if (method11492 != 2841928057L) {
                                                    if (method11492 != 1735291493L && method11492 != 2842125678L) {
                                                        if (method11492 != 2841996899L) {
                                                            if (method11492 != 2842980207L) {
                                                                if (method11492 != 1668313716L) {
                                                                    if (method11492 != 1668311404L) {
                                                                        if (method11492 != 1668249202L) {
                                                                            if (method11492 != 2842129008L) {
                                                                                if (method11492 != 2842458482L) {
                                                                                    if (method11492 != 1920233063L) {
                                                                                        if (method11492 != 1885565812L) {
                                                                                            if (method11492 != 1886745196L) {
                                                                                                if (method11492 != 1667331175L) {
                                                                                                    if (method11492 != 1801812343L) {
                                                                                                        if (method11492 != 1684370275L) {
                                                                                                            if (method11492 != 1818518899L) {
                                                                                                                if (method11492 != 1953919848L) {
                                                                                                                    if (method11492 != 1953918574L) {
                                                                                                                        if (method11492 != 1953916275L) {
                                                                                                                            if (method11492 != 1953916270L) {
                                                                                                                                if (method11492 != 1953919854L) {
                                                                                                                                    if (method11492 != 1886745188L) {
                                                                                                                                        if (method11492 != 1885823344L) {
                                                                                                                                            if (method11492 != 1751414372L) {
                                                                                                                                                if (method11492 != 1936679282L) {
                                                                                                                                                    if (method11492 != 1936682605L) {
                                                                                                                                                        if (method11492 != 1936679276L) {
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                        this.method34091(Class7017.field27398, class3748.method11590());
                                                                                                                                                    }
                                                                                                                                                    else {
                                                                                                                                                        this.method34091(Class7017.field27397, class3748.method11590());
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                else {
                                                                                                                                                    this.method34091(Class7017.field27396, class3748.method11590());
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            else {
                                                                                                                                                this.method34091(Class7017.field27394, class3748.method11593());
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        else {
                                                                                                                                            this.method34091(Class7017.field27393, class3748.method11590());
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    else {
                                                                                                                                        this.method34091(Class7017.field27392, class3748.method11590());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                else {
                                                                                                                                    this.method34091(Class7017.field27390, class3748.method11592());
                                                                                                                                }
                                                                                                                            }
                                                                                                                            else {
                                                                                                                                this.method34091(Class7017.field27389, class3748.method11592());
                                                                                                                            }
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            this.method34091(Class7017.field27388, class3748.method11590());
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        this.method34091(Class7017.field27387, class3748.method11590());
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    this.method34091(Class7017.field27386, class3748.method11590());
                                                                                                                }
                                                                                                            }
                                                                                                            else {
                                                                                                                this.method34091(Class7017.field27385, class3748.method11590());
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            this.method34091(Class7017.field27385, class3748.method11590());
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        this.method34091(Class7017.field27383, class3748.method11590());
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    this.method34091(Class7017.field27382, class3748.method11590());
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                this.method34091(Class7017.field27381, class3748.method11590());
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            this.method34091(Class7017.field27380, class3748.method11592());
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        this.method34091(Class7017.field27379, class3748.method11592());
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    this.method34091(Class7017.field27378, class3748.method11590());
                                                                                }
                                                                            }
                                                                            else {
                                                                                this.method34091(Class7017.field27376, class3748.method11590());
                                                                            }
                                                                        }
                                                                        else {
                                                                            final Class7231 class3749 = new Class7231(Class2150.method8319(class3748.method11588()), class3748.method11589());
                                                                            if (!this.field39654.containsKey(Class7017.field27375)) {
                                                                                final ArrayList list = new ArrayList();
                                                                                list.add(class3749);
                                                                                this.method34091(Class7017.field27375, list);
                                                                            }
                                                                            else {
                                                                                this.method34093(Class7017.field27375).add(class3749);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        this.method34091(Class7017.field27374, class3748.method11593());
                                                                    }
                                                                }
                                                                else {
                                                                    this.method34091(Class7017.field27372, class3748.method11590());
                                                                }
                                                            }
                                                            else {
                                                                this.method34091(Class7017.field27370, class3748.method11590());
                                                            }
                                                        }
                                                        else {
                                                            this.method34091(Class7017.field27369, class3748.method11590());
                                                        }
                                                    }
                                                    else {
                                                        String method11493 = null;
                                                        if (class3748.method11588() != Class2062.field11788) {
                                                            final int method11494 = class3748.method11592();
                                                            if (method11494 > 0) {
                                                                if (method11494 < Class9245.field39652.length) {
                                                                    method11493 = Class9245.field39652[class3748.method11592()];
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            method11493 = class3748.method11590();
                                                        }
                                                        if (method11493 == null) {
                                                            continue;
                                                        }
                                                        this.method34091(Class7017.field27368, method11493);
                                                    }
                                                }
                                                else {
                                                    this.method34091(Class7017.field27367, class3748.method11594());
                                                }
                                            }
                                            else {
                                                this.method34091(Class7017.field27365, class3748.method11592());
                                            }
                                        }
                                        else {
                                            this.method34091(Class7017.field27364, class3748.method11590());
                                        }
                                    }
                                    else {
                                        this.method34091(Class7017.field27363, class3748.method11590());
                                    }
                                }
                                else {
                                    this.method34091(Class7017.field27361, class3748.method11592());
                                }
                            }
                            else {
                                final byte[] method11495 = class3748.method11589();
                                this.method34091(Class7017.field27359, new Integer(method11495[3]));
                                this.method34091(Class7017.field27360, new Integer(method11495[5]));
                            }
                        }
                        else {
                            this.method34091(Class7017.field27358, class3748.method11590());
                        }
                    }
                    else {
                        this.method34091(Class7017.field27357, class3748.method11590());
                    }
                }
                else {
                    this.method34091(Class7017.field27356, class3748.method11590());
                }
            }
            else {
                this.method34091(Class7017.field27355, class3748.method11590());
            }
        }
    }
    
    private void method34089(final Class3800 class3800) {
        try {
            for (final Class9447 class3801 : new Class7921(new DataInputStream(new ByteArrayInputStream(class3800.method11645()))).method25664()) {
                switch (class3801.method35085()) {
                    case 1414091826: {
                        this.method34091(Class7017.field27356, class3801.method35094());
                        continue;
                    }
                    case 1413565506: {
                        this.method34091(Class7017.field27358, class3801.method35094());
                        continue;
                    }
                    case 1414677323: {
                        final int[] method35096 = class3801.method35096();
                        this.method34091(Class7017.field27359, method35096[0]);
                        if (method35096.length > 1) {
                            this.method34091(Class7017.field27360, method35096[1]);
                            continue;
                        }
                        continue;
                    }
                    case 1414546737: {
                        this.method34091(Class7017.field27355, class3801.method35094());
                        continue;
                    }
                    case 1413697357: {
                        this.method34091(Class7017.field27363, class3801.method35094());
                        continue;
                    }
                    case 1413632077: {
                        this.method34091(Class7017.field27365, class3801.method35095());
                        continue;
                    }
                    case 1414284622: {
                        this.method34091(Class7017.field27366, class3801.method35095());
                        continue;
                    }
                    case 1414283598: {
                        this.method34091(Class7017.field27395, class3801.method35098());
                        continue;
                    }
                    case 1413697360: {
                        this.method34091(Class7017.field27372, class3801.method35094());
                        continue;
                    }
                    case 1414550850: {
                        this.method34091(Class7017.field27373, class3801.method35094());
                        continue;
                    }
                    case 1414681422: {
                        this.method34091(Class7017.field27391, class3801.method35094());
                        continue;
                    }
                    case 1413760334: {
                        this.method34091(Class7017.field27371, class3801.method35097());
                        continue;
                    }
                    case 1413763660: {
                        this.method34091(Class7017.field27367, class3801.method35097());
                        continue;
                    }
                    case 1414746949: {
                        this.method34091(Class7017.field27370, class3801.method35094());
                        continue;
                    }
                    case 1414745936: {
                        this.method34091(Class7017.field27396, class3801.method35094());
                        continue;
                    }
                    case 1414745940: {
                        this.method34091(Class7017.field27397, class3801.method35094());
                        continue;
                    }
                    case 1414745921: {
                        this.method34091(Class7017.field27398, class3801.method35094());
                        continue;
                    }
                }
            }
        }
        catch (final IOException ex) {
            Logger.getLogger("MP4 API").log(Level.SEVERE, "Exception in MetaData.parseID3: {0}", ex.toString());
        }
    }
    
    private void method34090(final Class3764 class3764) {
        final Map<String, String> method11568 = class3764.method11568();
        for (final String s : method11568.keySet()) {
            final String s2 = method11568.get(s);
            try {
                if (s.equals(Class9245.field39653[0])) {
                    this.method34091(Class7017.field27355, s2);
                }
                if (s.equals(Class9245.field39653[1])) {
                    this.method34091(Class7017.field27356, s2);
                }
                if (s.equals(Class9245.field39653[2])) {
                    this.method34091(Class7017.field27358, s2);
                }
                if (s.equals(Class9245.field39653[3])) {
                    this.method34091(Class7017.field27359, Integer.parseInt(s2));
                }
                if (s.equals(Class9245.field39653[4])) {
                    this.method34091(Class7017.field27360, Integer.parseInt(s2));
                }
                if (s.equals(Class9245.field39653[5])) {
                    final Calendar instance = Calendar.getInstance();
                    instance.set(1, Integer.parseInt(s2));
                    this.method34091(Class7017.field27367, instance.getTime());
                }
                if (s.equals(Class9245.field39653[6])) {
                    this.method34091(Class7017.field27368, s2);
                }
                if (s.equals(Class9245.field39653[7])) {
                    this.method34091(Class7017.field27361, Integer.parseInt(s2));
                }
                if (s.equals(Class9245.field39653[8])) {
                    this.method34091(Class7017.field27362, Integer.parseInt(s2));
                }
                if (s.equals(Class9245.field39653[9])) {}
                if (s.equals(Class9245.field39653[10])) {
                    this.method34091(Class7017.field27372, s2);
                }
                if (s.equals(Class9245.field39653[11])) {
                    this.method34091(Class7017.field27364, s2);
                }
                if (s.equals(Class9245.field39653[12])) {
                    this.method34091(Class7017.field27378, s2);
                }
                if (s.equals(Class9245.field39653[13])) {}
                if (s.equals(Class9245.field39653[14])) {
                    this.method34091(Class7017.field27379, Integer.parseInt(s2));
                }
                if (s.equals(Class9245.field39653[15])) {
                    this.method34091(Class7017.field27373, s2);
                }
                if (s.equals(Class9245.field39653[16])) {
                    this.method34091(Class7017.field27363, s2);
                }
                if (s.equals(Class9245.field39653[17])) {}
                if (s.equals(Class9245.field39653[18])) {}
                if (!s.equals(Class9245.field39653[19])) {
                    continue;
                }
                this.method34091(Class7017.field27365, Integer.parseInt(s2));
            }
            catch (final NumberFormatException ex) {
                Logger.getLogger("MP4 API").log(Level.SEVERE, "Exception in MetaData.parseNeroTags: {0}", ex.toString());
            }
        }
    }
    
    private <T> void method34091(final Class7017<T> class7017, final T t) {
        this.field39654.put(class7017, t);
    }
    
    public boolean method34092() {
        return !this.field39654.isEmpty();
    }
    
    public <T> T method34093(final Class7017<T> class7017) {
        return (T)this.field39654.get(class7017);
    }
    
    public Map<Class7017<?>, Object> method34094() {
        return Collections.unmodifiableMap(this.field39654);
    }
    
    static {
        field39652 = new String[] { "undefined", "blues", "classic rock", "country", "dance", "disco", "funk", "grunge", "hip hop", "jazz", "metal", "new age", "oldies", "other", "pop", "r and b", "rap", "reggae", "rock", "techno", "industrial", "alternative", "ska", "death metal", "pranks", "soundtrack", "euro techno", "ambient", "trip hop", "vocal", "jazz funk", "fusion", "trance", "classical", "instrumental", "acid", "house", "game", "sound clip", "gospel", "noise", "alternrock", "bass", "soul", "punk", "space", "meditative", "instrumental pop", "instrumental rock", "ethnic", "gothic", "darkwave", "techno industrial", "electronic", "pop folk", "eurodance", "dream", "southern rock", "comedy", "cult", "gangsta", "top ", "christian rap", "pop funk", "jungle", "native american", "cabaret", "new wave", "psychedelic", "rave", "showtunes", "trailer", "lo fi", "tribal", "acid punk", "acid jazz", "polka", "retro", "musical", "rock and roll", "hard rock", "folk", "folk rock", "national folk", "swing", "fast fusion", "bebob", "latin", "revival", "celtic", "bluegrass", "avantgarde", "gothic rock", "progressive rock", "psychedelic rock", "symphonic rock", "slow rock", "big band", "chorus", "easy listening", "acoustic", "humour", "speech", "chanson", "opera", "chamber music", "sonata", "symphony", "booty bass", "primus", "porn groove", "satire", "slow jam", "club", "tango", "samba", "folklore", "ballad", "power ballad", "rhythmic soul", "freestyle", "duet", "punk rock", "drum solo", "a capella", "euro house", "dance hall" };
        field39653 = new String[] { "artist", "title", "album", "track", "totaltracks", "year", "genre", "disc", "totaldiscs", "url", "copyright", "comment", "lyrics", "credits", "rating", "label", "composer", "isrc", "mood", "tempo" };
    }
}
