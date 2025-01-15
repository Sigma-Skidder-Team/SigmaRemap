// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.util.HashMap;

public class Class2308 implements Cloneable
{
    private static String[] field13990;
    private HashMap<Integer, Class9501> field13991;
    private short field13992;
    private short field13993;
    private String field13994;
    private File field13995;
    private String field13996;
    private String field13997;
    private float field13998;
    private float field13999;
    private Class7117[] field14000;
    private int field14001;
    
    public Class2308(final Class2308 class2308) {
        this(class2308.method9382(), class2308.method9375(), class2308.method9376(), class2308.method9377(), class2308.method9378(), class2308.method9379(), class2308.method9381(), class2308.method9380(), class2308.method9385(), class2308.method9384());
    }
    
    @Deprecated
    public Class2308(final float n, final HashMap<Integer, Class9501> hashMap, final short n2, final short n3, final String s, final String s2, final String s3, final File file) {
        this(n, hashMap, n2, n3, s, s2, s3, file, Class6524.method19742(), new Class7117[0]);
    }
    
    @Deprecated
    public Class2308(final float n, final HashMap<Integer, Class9501> hashMap, final short n2, final short n3, final String s, final String s2, final String s3, final File file, final Class7117[] array) {
        this(n, hashMap, n2, n3, s, s2, s3, file, Class6524.method19742(), array);
    }
    
    public Class2308(final float n, final HashMap<Integer, Class9501> hashMap, final short n2, final short n3, final String s, final String s2, final String s3, final File file, final int n4) {
        this(n, hashMap, n2, n3, s, s2, s3, file, n4, new Class7117[0]);
    }
    
    public Class2308(final float field13998, final HashMap<Integer, Class9501> field13999, final short field14000, final short field14001, final String field14002, final String field14003, final String field14004, final File field14005, final int field14006, final Class7117[] field14007) {
        this.field13991 = new HashMap<Integer, Class9501>();
        this.method9386(20.0f / (this.field13998 = field13998));
        this.field13991 = field13999;
        this.field13992 = field14000;
        this.field13993 = field14001;
        this.field13994 = field14002;
        this.field13996 = field14003;
        this.field13997 = field14004;
        this.field13995 = field14005;
        this.field14001 = field14006;
        this.field14000 = field14007;
    }
    
    public HashMap<Integer, Class9501> method9375() {
        return this.field13991;
    }
    
    public short method9376() {
        return this.field13992;
    }
    
    public short method9377() {
        return this.field13993;
    }
    
    public String method9378() {
        return this.field13994;
    }
    
    public String method9379() {
        return this.field13996;
    }
    
    public File method9380() {
        return this.field13995;
    }
    
    public String method9381() {
        return this.field13997;
    }
    
    public float method9382() {
        return this.field13998;
    }
    
    public float method9383() {
        return this.field13999;
    }
    
    public Class7117[] method9384() {
        return this.field14000;
    }
    
    public Class2308 clone() {
        return new Class2308(this);
    }
    
    public int method9385() {
        return this.field14001;
    }
    
    public void method9386(final float field13999) {
        this.field13999 = field13999;
    }
}
