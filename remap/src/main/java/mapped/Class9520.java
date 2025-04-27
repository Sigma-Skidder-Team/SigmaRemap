// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public interface Class9520
{
    Class9520 field40943 = method35541(Class4481::new, "MSCorridor");
    Class9520 field40944 = method35541(Class4483::new, "MSCrossing");
    Class9520 field40945 = method35541(Class4482::new, "MSRoom");
    Class9520 field40946 = method35541(Class4480::new, "MSStairs");
    Class9520 field40947 = method35541(Class4523::new, "PCP");
    Class9520 field40948 = method35541(Class4522::new, "NVi");
    Class9520 field40949 = method35541(Class4493::new, "NeBCr");
    Class9520 field40950 = method35541(Class4485::new, "NeBEF");
    Class9520 field40951 = method35541(Class4491::new, "NeBS");
    Class9520 field40952 = method35541(Class4490::new, "NeCCS");
    Class9520 field40953 = method35541(Class4496::new, "NeCTB");
    Class9520 field40954 = method35541(Class4486::new, "NeCE");
    Class9520 field40955 = method35541(Class4492::new, "NeSCSC");
    Class9520 field40956 = method35541(Class4487::new, "NeSCLT");
    Class9520 field40957 = method35541(Class4495::new, "NeSC");
    Class9520 field40958 = method35541(Class4489::new, "NeSCRT");
    Class9520 field40959 = method35541(Class4499::new, "NeCSR");
    Class9520 field40960 = method35541(Class4497::new, "NeMT");
    Class9520 field40961 = method35541(Class4488::new, "NeRC");
    Class9520 field40962 = method35541(Class4498::new, "NeSR");
    Class9520 field40963 = method35541(Class4494::new, "NeStart");
    Class9520 field40964 = method35541(Class4510::new, "SHCC");
    Class9520 field40965 = method35541(Class4514::new, "SHFC");
    Class9520 field40966 = method35541(Class4511::new, "SH5C");
    Class9520 field40967 = method35541(Class4504::new, "SHLT");
    Class9520 field40968 = method35541(Class4501::new, "SHLi");
    Class9520 field40969 = method35541(Class4508::new, "SHPR");
    Class9520 field40970 = method35541(Class4502::new, "SHPH");
    Class9520 field40971 = method35541(Class4505::new, "SHRT");
    Class9520 field40972 = method35541(Class4509::new, "SHRC");
    Class9520 field40973 = method35541(Class4506::new, "SHSD");
    Class9520 field40974 = method35541(Class4507::new, "SHStart");
    Class9520 field40975 = method35541(Class4513::new, "SHS");
    Class9520 field40976 = method35541(Class4512::new, "SHSSD");
    Class9520 field40977 = method35541(Class4477::new, "TeJP");
    Class9520 field40978 = method35541(Class4518::new, "ORP");
    Class9520 field40979 = method35541(Class4516::new, "Iglu");
    Class9520 field40980 = method35541(Class4476::new, "TeSH");
    Class9520 field40981 = method35541(Class4478::new, "TeDP");
    Class9520 field40982 = method35541(Class4471::new, "OMB");
    Class9520 field40983 = method35541(Class4531::new, "OMCR");
    Class9520 field40984 = method35541(Class4526::new, "OMDXR");
    Class9520 field40985 = method35541(Class4530::new, "OMDXYR");
    Class9520 field40986 = method35541(Class4525::new, "OMDYR");
    Class9520 field40987 = method35541(Class4532::new, "OMDYZR");
    Class9520 field40988 = method35541(Class4472::new, "OMDZR");
    Class9520 field40989 = method35541(Class4528::new, "OMEntry");
    Class9520 field40990 = method35541(Class4524::new, "OMPenthouse");
    Class9520 field40991 = method35541(Class4470::new, "OMSimple");
    Class9520 field40992 = method35541(Class4529::new, "OMSimpleT");
    Class9520 field40993 = method35541(Class4527::new, "OMWR");
    Class9520 field40994 = method35541(Class4517::new, "ECP");
    Class9520 field40995 = method35541(Class4520::new, "WMP");
    Class9520 field40996 = method35541(Class4474::new, "BTP");
    Class9520 field40997 = method35541(Class4519::new, "Shipwreck");
    
    Class4473 method35540(final Class1795 p0, final CompoundNBT p1);
    
    default Class9520 method35541(final Class9520 class9520, final String s) {
        return Registry.register(Registry.field231, s.toLowerCase(Locale.ROOT), class9520);
    }
}
