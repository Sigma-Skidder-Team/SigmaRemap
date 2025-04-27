// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class Class4442 implements Comparator<NetworkPlayerInfo>
{
    private Class4442() {
    }
    
    @Override
    public int compare(final NetworkPlayerInfo networkPlayerInfo, final NetworkPlayerInfo class9082) {
        final Class6749 method32729 = networkPlayerInfo.method32729();
        final Class6749 method32730 = class9082.method32729();
        return ComparisonChain.start().compareTrueFirst(networkPlayerInfo.method32720() != Class101.field301, class9082.method32720() != Class101.field301).compare((method32729 == null) ? "" : method32729.method20539(), (method32730 == null) ? "" : method32730.method20539()).compare((Object) networkPlayerInfo.method32719().getName(), (Object)class9082.method32719().getName(), String::compareToIgnoreCase).result();
    }
}
