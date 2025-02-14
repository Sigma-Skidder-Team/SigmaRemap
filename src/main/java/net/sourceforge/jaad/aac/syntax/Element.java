package net.sourceforge.jaad.aac.syntax;

import net.sourceforge.jaad.aac.AACException;
import net.sourceforge.jaad.aac.SampleFrequency;
import net.sourceforge.jaad.aac.sbr.SBR;

public abstract class Element implements Constants {

	private int elementInstanceTag;
	private SBR sbr;

	protected void readElementInstanceTag(BitStream in) throws AACException {
		elementInstanceTag = in.readBits(4);
	}

	public int getElementInstanceTag() {
		return elementInstanceTag;
	}

	void decodeSBR(BitStream in, SampleFrequency sf, int count, boolean stereo, boolean crc, boolean downSampled,boolean smallFrames) throws AACException {
		if(sbr==null) sbr = new SBR(smallFrames,elementInstanceTag==ELEMENT_CPE,sf,downSampled);
		sbr.decode(in, count);
	}

	boolean isSBRPresent() {
		return sbr!=null;
	}

	SBR getSBR() {
		return sbr;
	}
}
